/*
 * Copyright 2007 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.javascript.jscomp;

import static com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;

import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Lightweight message formatter. The format of messages this formatter
 * produces is very compact and to the point.
 *
 */
public class LightweightMessageFormatter extends AbstractMessageFormatter {
  public static int eid_LightweightMessageFormatter_7au3e = 0;
	public static int eid_LightweightMessageFormatter_SourceExcerptProvider_7au3e = 0;
	public static int eid_LightweightMessageFormatter_SourceExcerptProvider_SourceExcerpt_7au3e = 0;
	public static int eid_withoutSource_7au3e = 0;
	public static int eid_formatError_JSError_7au3e = 0;
	public static int eid_formatWarning_JSError_7au3e = 0;
	public static int eid_format_JSError_boolean_7au3e = 0;
	public static int eid_LineNumberingFormatter_formatLine_String_int_7au3e = 0;
	public static int eid_LineNumberingFormatter_formatRegion_Region_7au3e = 0;

	public static void clearORefMap() {
		eid_LightweightMessageFormatter_7au3e = 0;
		eid_LightweightMessageFormatter_SourceExcerptProvider_7au3e = 0;
		eid_LightweightMessageFormatter_SourceExcerptProvider_SourceExcerpt_7au3e = 0;
		eid_withoutSource_7au3e = 0;
		eid_formatError_JSError_7au3e = 0;
		eid_formatWarning_JSError_7au3e = 0;
		eid_format_JSError_boolean_7au3e = 0;
		eid_LineNumberingFormatter_formatLine_String_int_7au3e = 0;
		eid_LineNumberingFormatter_formatRegion_Region_7au3e = 0;
	}

private SourceExcerpt excerpt;
  private static final ExcerptFormatter excerptFormatter =
      new LineNumberingFormatter();

  /**
   * A constructor for when the client doesn't care about source information.
   */
  private LightweightMessageFormatter() {
    super(null);
    this.excerpt = LINE;
  }

  public LightweightMessageFormatter(SourceExcerptProvider source) {
    this(source, LINE);
  }

  public LightweightMessageFormatter(SourceExcerptProvider source,
      SourceExcerpt excerpt) {
    super(source);
    Preconditions.checkNotNull(source);
    this.excerpt = excerpt;
  }

  static LightweightMessageFormatter withoutSource() {
    return new LightweightMessageFormatter();
  }

  public String formatError(JSError error) {
    return format(error, false);
  }

  public String formatWarning(JSError warning) {
    return format(warning, true);
  }

  private String format_7au3e(JSError error, boolean warning) {
    // extract source excerpt
    SourceExcerptProvider source = getSource();
    String sourceExcerpt = source == null ? null :
        excerpt.get(
            source, error.sourceName, error.lineNumber, excerptFormatter);

    // formatting the message
    StringBuilder b = new StringBuilder();
    if (error.sourceName != null) {
      b.append(error.sourceName);
      if (error.lineNumber > 0) {
        b.append(':');
        b.append(error.lineNumber);
      }
      b.append(": ");
    }

    b.append(getLevelName(warning ? CheckLevel.WARNING : CheckLevel.ERROR));
    b.append(" - ");

    b.append(error.description);
    b.append('\n');
    if (sourceExcerpt != null) {
      b.append(sourceExcerpt);
      b.append('\n');
      int charno = error.getCharno();

      // padding equal to the excerpt and arrow at the end
      // charno == sourceExpert.length() means something is missing
      // at the end of the line
      if (excerpt.equals(LINE)
          && 0 <= charno && charno < sourceExcerpt.length()) {
        for (int i = 0; i < charno; i++) {
          char c = sourceExcerpt.charAt(i);
          if (Character.isWhitespace(c)) {
            b.append(c);
          } else {
            b.append(' ');
          }
        }
        b.append("^\n");
      }
    }
    return b.toString();
  }

  /**
   * Formats a region by appending line numbers in front, e.g.
   * <pre>   9| if (foo) {
   *   10|   alert('bar');
   *   11| }</pre>
   * and return line excerpt without any modification.
   */
  static class LineNumberingFormatter implements ExcerptFormatter {
    public String formatLine(String line, int lineNumber) {
      return line;
    }

    public String formatRegion(Region region) {
      if (region == null) {
        return null;
      }
      String code = region.getSourceExcerpt();
      if (code.length() == 0) {
        return null;
      }

      // max length of the number display
      int numberLength = Integer.toString(region.getEndingLineNumber())
          .length();

      // formatting
      StringBuilder builder = new StringBuilder(code.length() * 2);
      int start = 0;
      int end = code.indexOf('\n', start);
      int lineNumber = region.getBeginningLineNumber();
      while (start >= 0) {
        // line extraction
        String line;
        if (end < 0) {
          line = code.substring(start);
          if (line.length() == 0) {
            return builder.substring(0, builder.length() - 1);
          }
        } else {
          line = code.substring(start, end);
        }
        builder.append("  ");

        // nice spaces for the line number
        int spaces = numberLength - Integer.toString(lineNumber).length();
        builder.append(Strings.repeat(" ", spaces));
        builder.append(lineNumber);
        builder.append("| ");

        // end & update
        if (end < 0) {
          builder.append(line);
          start = -1;
        } else {
          builder.append(line);
          builder.append('\n');
          start = end + 1;
          end = code.indexOf('\n', start);
          lineNumber++;
        }
      }
      return builder.toString();
    }
  }

private String format(JSError error, boolean warning) {
	Object o_7au3e = null;
	String c_7au3e = "com.google.javascript.jscomp.LightweightMessageFormatter";
	String msig_7au3e = "format(JSError$boolean)"
			+ eid_format_JSError_boolean_7au3e;
	try {
		o_7au3e = format_7au3e(error, warning);
		FieldPrinter.print(o_7au3e, eid_format_JSError_boolean_7au3e, c_7au3e,
				msig_7au3e, 0, 5);
		FieldPrinter.print(this, eid_format_JSError_boolean_7au3e, c_7au3e,
				msig_7au3e, 1, 5);
		FieldPrinter.print(error, eid_format_JSError_boolean_7au3e, c_7au3e,
				msig_7au3e, 2, 5);
	} catch (Throwable t7au3e) {
		FieldPrinter.print(t7au3e, eid_format_JSError_boolean_7au3e, c_7au3e,
				msig_7au3e, 0, 5);
		throw t7au3e;
	} finally {
		eid_format_JSError_boolean_7au3e++;
	}
	return (String) o_7au3e;
}
}
