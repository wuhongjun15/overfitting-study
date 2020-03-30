/*
 * Copyright 2004 The Closure Compiler Authors.
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

import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;


/**
 * Abstracted consumer of the CodeGenerator output.
 *
 * @see CodeGenerator
 * @see CodePrinter
 * @see InlineCostEstimator
 */
abstract class CodeConsumer {
  public static int eid_startSourceMapping_Node_7au3e = 0;
	public static int eid_endSourceMapping_Node_7au3e = 0;
	public static int eid_continueProcessing_7au3e = 0;
	public static int eid_getLastChar_7au3e = 0;
	public static int eid_addIdentifier_String_7au3e = 0;
	public static int eid_append_String_7au3e = 0;
	public static int eid_appendBlockStart_7au3e = 0;
	public static int eid_appendBlockEnd_7au3e = 0;
	public static int eid_startNewLine_7au3e = 0;
	public static int eid_maybeLineBreak_7au3e = 0;
	public static int eid_maybeCutLine_7au3e = 0;
	public static int eid_endLine_7au3e = 0;
	public static int eid_notePreferredLineBreak_7au3e = 0;
	public static int eid_beginBlock_7au3e = 0;
	public static int eid_endBlock_7au3e = 0;
	public static int eid_endBlock_boolean_7au3e = 0;
	public static int eid_listSeparator_7au3e = 0;
	public static int eid_endStatement_7au3e = 0;
	public static int eid_endStatement_boolean_7au3e = 0;
	public static int eid_maybeEndStatement_7au3e = 0;
	public static int eid_endFunction_7au3e = 0;
	public static int eid_endFunction_boolean_7au3e = 0;
	public static int eid_beginCaseBody_7au3e = 0;
	public static int eid_endCaseBody_7au3e = 0;
	public static int eid_add_String_7au3e = 0;
	public static int eid_appendOp_String_boolean_7au3e = 0;
	public static int eid_addOp_String_boolean_7au3e = 0;
	public static int eid_addNumber_double_7au3e = 0;
	public static int eid_isNegativeZero_double_7au3e = 0;
	public static int eid_isWordChar_char_7au3e = 0;
	public static int eid_shouldPreserveExtraBlocks_7au3e = 0;
	public static int eid_breakAfterBlockFor_Node_boolean_7au3e = 0;
	public static int eid_endFile_7au3e = 0;

	public static void clearORefMap() {
		eid_startSourceMapping_Node_7au3e = 0;
		eid_endSourceMapping_Node_7au3e = 0;
		eid_continueProcessing_7au3e = 0;
		eid_getLastChar_7au3e = 0;
		eid_addIdentifier_String_7au3e = 0;
		eid_append_String_7au3e = 0;
		eid_appendBlockStart_7au3e = 0;
		eid_appendBlockEnd_7au3e = 0;
		eid_startNewLine_7au3e = 0;
		eid_maybeLineBreak_7au3e = 0;
		eid_maybeCutLine_7au3e = 0;
		eid_endLine_7au3e = 0;
		eid_notePreferredLineBreak_7au3e = 0;
		eid_beginBlock_7au3e = 0;
		eid_endBlock_7au3e = 0;
		eid_endBlock_boolean_7au3e = 0;
		eid_listSeparator_7au3e = 0;
		eid_endStatement_7au3e = 0;
		eid_endStatement_boolean_7au3e = 0;
		eid_maybeEndStatement_7au3e = 0;
		eid_endFunction_7au3e = 0;
		eid_endFunction_boolean_7au3e = 0;
		eid_beginCaseBody_7au3e = 0;
		eid_endCaseBody_7au3e = 0;
		eid_add_String_7au3e = 0;
		eid_appendOp_String_boolean_7au3e = 0;
		eid_addOp_String_boolean_7au3e = 0;
		eid_addNumber_double_7au3e = 0;
		eid_isNegativeZero_double_7au3e = 0;
		eid_isWordChar_char_7au3e = 0;
		eid_shouldPreserveExtraBlocks_7au3e = 0;
		eid_breakAfterBlockFor_Node_boolean_7au3e = 0;
		eid_endFile_7au3e = 0;
	}

boolean statementNeedsEnded = false;
  boolean statementStarted = false;
  boolean sawFunction = false;

  /**
   * Starts the source mapping for the given
   * node at the current position.
   */
  void startSourceMapping(Node node) {
  }

  /**
   * Finishes the source mapping for the given
   * node at the current position.
   */
  void endSourceMapping(Node node) {
  }

  /**
   * Provides a means of interrupting the CodeGenerator. Derived classes should
   * return false to stop further processing.
   */
  boolean continueProcessing() {
    return true;
  }

  /**
   * Retrieve the last character of the last string sent to append.
   */
  abstract char getLastChar();

  void addIdentifier(String identifier) {
    add(identifier);
  }

  /**
   * Appends a string to the code, keeping track of the current line length.
   *
   * NOTE: the string must be a complete token--partial strings or
   * partial regexes will run the risk of being split across lines.
   *
   * Do not directly append newlines with this method. Instead use
   * {@link #startNewLine}.
   */
  abstract void append(String str);

  void appendBlockStart() {
    append("{");
  }

  void appendBlockEnd() {
    append("}");
  }

  void startNewLine() {
  }

  void maybeLineBreak() {
    maybeCutLine();
  }

  void maybeCutLine() {
  }

  void endLine() {
  }

  void notePreferredLineBreak() {
  }

  void beginBlock() {
    if (statementNeedsEnded) {
      append(";");
      maybeLineBreak();
    }
    appendBlockStart();

    endLine();
    statementNeedsEnded = false;
  }

  void endBlock() {
    endBlock(false);
  }

  void endBlock(boolean shouldEndLine) {
    appendBlockEnd();
    if (shouldEndLine) {
      endLine();
    }
    statementNeedsEnded = false;
  }

  void listSeparator() {
    add(",");
    maybeLineBreak();
  }

  /**
   * Indicates the end of a statement and a ';' may need to be added.
   * But we don't add it now, in case we're at the end of a block (in which
   * case we don't have to add the ';').
   * See maybeEndStatement()
   */
  void endStatement() {
    endStatement(false);
  }

  void endStatement(boolean needSemiColon) {
    if (needSemiColon) {
      append(";");
      maybeLineBreak();
      statementNeedsEnded = false;
    } else if (statementStarted) {
      statementNeedsEnded = true;
    }
  }

  /**
   * This is to be called when we're in a statement. If the prev statement
   * needs to be ended, add a ';'.
   */
  void maybeEndStatement() {
    // Add a ';' if we need to.
    if (statementNeedsEnded) {
      append(";");
      maybeLineBreak();
      endLine();
      statementNeedsEnded = false;
    }
    statementStarted = true;
  }

  void endFunction() {
    endFunction(false);
  }

  void endFunction(boolean statementContext) {
    sawFunction = true;
    if (statementContext) {
      endLine();
    }
  }

  void beginCaseBody() {
    append(":");
  }

  void endCaseBody() {
  }

  void add(String newcode) {
    maybeEndStatement();

    if (newcode.length() == 0) {
      return;
    }

    char c = newcode.charAt(0);
    if ((isWordChar(c) || c == '\\') &&
        isWordChar(getLastChar())) {
      // need space to separate. This is not pretty printing.
      // For example: "return foo;"
      append(" ");
    } else if (c == '/' && getLastChar() == '/') {
      // Do not allow a forward slash to appear after a DIV.
      // For example,
      // REGEXP DIV REGEXP
      // is valid and should print like
      // / // / /
      append(" ");
    }

    append(newcode);
  }

  void appendOp(String op, boolean binOp) {
    append(op);
  }

  void addOp(String op, boolean binOp) {
    maybeEndStatement();

    char first = op.charAt(0);
    char prev = getLastChar();

    if ((first == '+' || first == '-') && prev == first) {
      // This is not pretty printing. This is to prevent misparsing of
      // things like "x + ++y" or "x++ + ++y"
      append(" ");
    } else if (Character.isLetter(first) &&
               isWordChar(prev)) {
      // Make sure there is a space after e.g. instanceof , typeof
      append(" ");
    } else if (prev == '-' && first == '>') {
      // Make sure that we don't emit -->
      append(" ");
    }

    // Allow formating around the operator.
    appendOp(op, binOp);

    // Line breaking after an operator is always safe. Line breaking before an
    // operator on the other hand is not. We only line break after a bin op
    // because it looks strange.
    if (binOp) {
      maybeCutLine();
    }
  }

  void addNumber_7au3e(double x) {
    // This is not pretty printing. This is to prevent misparsing of x- -4 as
    // x--4 (which is a syntax error).
    char prev = getLastChar();
    boolean negativeZero = isNegativeZero(x);
    if ((x < 0 || negativeZero) && prev == '-') {
      add(" ");
    }

    if ((long) x == x && !negativeZero) {
      long value = (long) x;
      long mantissa = value;
      int exp = 0;
      if (Math.abs(x) >= 100) {
        while (mantissa / 10 * Math.pow(10, exp + 1) == value) {
          mantissa /= 10;
          exp++;
        }
      }
      if (exp > 2) {
        add(Long.toString(mantissa) + "E" + Integer.toString(exp));
      } else {
        add(Long.toString(value));
      }
    } else {
      add(String.valueOf(x));
    }
  }

  static boolean isNegativeZero(double x) {
    return x == 0.0 && Math.copySign(1, x) == -1.0;
  }

  static boolean isWordChar(char ch) {
    return (ch == '_' ||
            ch == '$' ||
            Character.isLetterOrDigit(ch));
  }

  /**
   * If the body of a for loop or the then clause of an if statement has
   * a single statement, should it be wrapped in a block?  Doing so can
   * help when pretty-printing the code, and permits putting a debugging
   * breakpoint on the statement inside the condition.
   *
   * @return {@boolean true} if such expressions should be wrapped
   */
  boolean shouldPreserveExtraBlocks() {
    return false;
  }

  /**
   * @return Whether the a line break can be added after the specified BLOCK.
   */
  boolean breakAfterBlockFor(Node n, boolean statementContext) {
    return statementContext;
  }

  /** Called when we're at the end of a file. */
  void endFile() {}

void addNumber(double x) {
	Object o_7au3e = null;
	String c_7au3e = "com.google.javascript.jscomp.CodeConsumer";
	String msig_7au3e = "addNumber(double)" + eid_addNumber_double_7au3e;
	try {
		addNumber_7au3e(x);
		FieldPrinter.print(this, eid_addNumber_double_7au3e, c_7au3e,
				msig_7au3e, 1, 5);
	} catch (Throwable t7au3e) {
		FieldPrinter.print(t7au3e, eid_addNumber_double_7au3e, c_7au3e,
				msig_7au3e, 0, 5);
		throw t7au3e;
	} finally {
		eid_addNumber_double_7au3e++;
	}
}
}
