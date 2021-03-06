/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:04:40 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.IndexColorModel;
import java.time.zone.ZoneRulesException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JApplet;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JTextPane;
import javax.swing.MenuElement;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StringContent;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.PolarChartPanel;
import org.jfree.chart.RenderingSource;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYLineAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CrosshairState;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultKeyedValueDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      boolean boolean0 = xYPlot0.canSelectByPoint();
      BasicStroke basicStroke0 = (BasicStroke)FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
      xYPlot0.setRangeGridlineStroke(basicStroke0);
      XYSplineRenderer xYSplineRenderer0 = new XYSplineRenderer();
      xYPlot0.setRenderer(10, (XYItemRenderer) xYSplineRenderer0, false);
      xYPlot0.setDataset(56, (XYDataset) null);
      Layer layer0 = Layer.FOREGROUND;
      Collection collection0 = xYPlot0.getDomainMarkers(layer0);
      xYPlot0.setDomainMinorGridlineStroke(basicStroke0);
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_RIGHT;
      xYPlot0.setRangeAxisLocation(axisLocation0, false);
      ValueAxis[] valueAxisArray0 = new ValueAxis[0];
      xYPlot0.setRangeAxes(valueAxisArray0);
      JFreeChart jFreeChart0 = new JFreeChart("u%bD:BI eHAU", xYPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 0, 10, 0, 10, (-926), 10, false, true, false, false, false, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Point point0 = chartPanel0.getLocation();
      xYPlot0.zoomDomainAxes((double) 56, plotRenderingInfo0, (Point2D) point0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      GeneralPath generalPath0 = new GeneralPath(combinedRangeXYPlot0.DEFAULT_LEGEND_ITEM_BOX);
      Rectangle rectangle0 = new Rectangle(1347, 10, 0, 1874);
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, 1347, 10, 1347, (-3814), (-2567), 1499, false, false, false, true, true, true);
      combinedRangeXYPlot0.select(generalPath0, (Rectangle2D) rectangle0, (RenderingSource) chartPanel0);
      Layer layer0 = Layer.FOREGROUND;
      Collection collection0 = combinedRangeXYPlot0.getRangeMarkers(4, layer0);
      XYItemRenderer xYItemRenderer0 = combinedRangeXYPlot0.getRenderer();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      Paint paint0 = combinedRangeXYPlot0.getDomainTickBandPaint();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("2c8{BP4S5#K\"u");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(extendedCategoryAxis0);
      JFreeChart jFreeChart0 = axisChangeEvent0.getChart();
      int int0 = 0;
      PolarChartPanel polarChartPanel0 = null;
      try {
        polarChartPanel0 = new PolarChartPanel((JFreeChart) null, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.PolarChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'marker' argument.", xYPlot0);
      XYPlot xYPlot1 = jFreeChart0.getXYPlot();
      IntervalMarker intervalMarker0 = new IntervalMarker(87, 87, jFreeChart0.DEFAULT_BACKGROUND_PAINT);
      Layer layer0 = Layer.FOREGROUND;
      xYPlot1.addRangeMarker(87, (Marker) intervalMarker0, layer0);
      ValueAxis valueAxis0 = xYPlot0.getRangeAxis(3099);
      xYPlot0.setDomainCrosshairPaint(xYPlot1.DEFAULT_OUTLINE_PAINT);
      XYShapeAnnotation xYShapeAnnotation0 = new XYShapeAnnotation(xYPlot1.DEFAULT_LEGEND_ITEM_BOX, xYPlot0.DEFAULT_OUTLINE_STROKE, valueAxis0.DEFAULT_TICK_LABEL_PAINT, xYPlot1.DEFAULT_CROSSHAIR_PAINT);
      boolean boolean0 = xYPlot0.removeAnnotation((XYAnnotation) xYShapeAnnotation0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0E-7);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      cyclicNumberAxis0.setAdvanceLineStroke(combinedDomainXYPlot0.DEFAULT_OUTLINE_STROKE);
      cyclicNumberAxis0.setTickMarkInsideLength(10);
      combinedDomainXYPlot0.setDomainCrosshairValue(1.5707963267948966);
      combinedDomainXYPlot0.setDomainAxisLocation(axisLocation0);
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      cyclicNumberAxis0.setStandardTickUnits(standardTickUnitSource0);
      combinedDomainXYPlot0.setRangeCrosshairLockedOnData(true);
      Stroke stroke0 = combinedDomainXYPlot0.getDomainZeroBaselineStroke();
      cyclicNumberAxis0.setAutoRangeIncludesZero(false);
      combinedDomainXYPlot0.mapDatasetToDomainAxis(6, 500);
      int int0 = combinedDomainXYPlot0.getDomainAxisCount();
      boolean boolean0 = combinedDomainXYPlot0.isRangeZoomable();
      combinedDomainXYPlot0.setDomainMinorGridlineStroke(cyclicNumberAxis0.DEFAULT_TICK_MARK_STROKE);
      Stroke stroke1 = combinedDomainXYPlot0.getRangeCrosshairStroke();
      combinedDomainXYPlot0.setDomainZeroBaselineVisible(true);
      combinedDomainXYPlot0.setRangeAxis(500, (ValueAxis) cyclicNumberAxis0, true);
      Point point0 = new Point();
      float[] floatArray0 = new float[1];
      floatArray0[0] = (float) 500;
      Color[] colorArray0 = new Color[7];
      StringContent stringContent0 = new StringContent(0);
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      JTextPane jTextPane0 = new JTextPane(defaultStyledDocument0);
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      Color color0 = defaultStyledDocument0.getBackground(attributeSet0);
      colorArray0[0] = color0;
      Color color1 = Color.ORANGE;
      colorArray0[1] = color1;
      SystemColor systemColor0 = SystemColor.inactiveCaptionText;
      colorArray0[2] = (Color) systemColor0;
      Color color2 = Color.ORANGE;
      colorArray0[3] = color2;
      Color color3 = jTextPane0.getCaretColor();
      colorArray0[4] = color3;
      Color color4 = new Color(6);
      colorArray0[5] = color4;
      Color color5 = Color.RED;
      colorArray0[6] = color5;
      LinearGradientPaint linearGradientPaint0 = null;
      try {
        linearGradientPaint0 = new LinearGradientPaint(point0, point0, floatArray0, colorArray0);
      } catch(IllegalArgumentException e) {
         //
         // Colors and fractions must have equal size
         //
         verifyException("java.awt.MultipleGradientPaint", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(valueAxis0);
      List list0 = combinedDomainXYPlot0.getAnnotations();
      XYLineAnnotation xYLineAnnotation0 = new XYLineAnnotation(3, 5.0E-4, (-95.0), (-2573.2445734));
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-91);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)6;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel((-2137), 3, byteArray0, (-2137), true, (-6));
      } catch(IllegalArgumentException e) {
         //
         // Number of pixel bits must be > 0
         //
         verifyException("java.awt.image.ColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(5.0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      combinedRangeXYPlot0.setOrientation(plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      LegendItemCollection legendItemCollection0 = combinedDomainXYPlot0.getLegendItems();
      Stroke stroke0 = combinedDomainXYPlot0.getDomainMinorGridlineStroke();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      CategoryMarker categoryMarker0 = new CategoryMarker(false, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_PAINT, stroke0);
      Layer layer0 = Layer.FOREGROUND;
      combinedDomainXYPlot0.addDomainMarker((Marker) categoryMarker0, layer0);
      boolean boolean0 = combinedDomainXYPlot0.isRangeMinorGridlinesVisible();
      DefaultColorSelectionModel defaultColorSelectionModel0 = new DefaultColorSelectionModel();
      JColorChooser jColorChooser0 = new JColorChooser(defaultColorSelectionModel0);
      int int0 = 0;
      long long0 = 0L;
      int int1 = 0;
      int int2 = 243;
      int int3 = 54;
      boolean boolean1 = false;
      MenuElement[] menuElementArray0 = new MenuElement[4];
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("zPO`?.", true);
      menuElementArray0[0] = (MenuElement) jCheckBoxMenuItem0;
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      XYBubbleRenderer xYBubbleRenderer0 = new XYBubbleRenderer();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, logarithmicAxis0, logarithmicAxis0, xYBubbleRenderer0);
      Object object0 = xYPlot0.clone();
      Paint paint0 = xYPlot0.getDomainMinorGridlinePaint();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("yvL#UyT*#Y");
      DateTickMarkPosition dateTickMarkPosition0 = dateAxis0.getTickMarkPosition();
      dateAxis0.setTickMarkPosition(dateTickMarkPosition0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(dateAxis0);
      double double0 = combinedDomainXYPlot0.getRangeCrosshairValue();
      combinedDomainXYPlot0.setRangeCrosshairVisible(false);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      int int0 = 1;
      int int1 = (-1134);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(500, 1, (-1134));
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type -1134
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Point point0 = new Point();
      combinedRangeXYPlot0.zoomDomainAxes((-1623.6), 10.0, plotRenderingInfo0, (Point2D) point0);
      combinedRangeXYPlot0.setRangeGridlinesVisible(true);
      combinedRangeXYPlot0.setGap(10.0);
      XYDataset xYDataset0 = combinedRangeXYPlot0.getDataset();
      combinedRangeXYPlot0.clearDomainAxes();
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer(5095);
      combinedRangeXYPlot0.setRenderer(0, (XYItemRenderer) xYStepAreaRenderer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      boolean boolean0 = xYPlot0.isRangePannable();
      ArrayList<DefaultKeyedValueDataset> arrayList0 = new ArrayList<DefaultKeyedValueDataset>();
      int int0 = (-2894);
      arrayList0.ensureCapacity((-2894));
      // Undeclared exception!
      try { 
        xYPlot0.mapDatasetToRangeAxes(0, arrayList0);
      } catch(IllegalArgumentException e) {
         //
         // Empty list not permitted.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) 10);
      SeriesRenderingOrder seriesRenderingOrder0 = xYPlot0.getSeriesRenderingOrder();
      xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder0);
      Layer layer0 = Layer.BACKGROUND;
      // Undeclared exception!
      try { 
        xYPlot0.removeRangeMarker(0, (Marker) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'marker' argument.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot((ValueAxis) null);
      PlotRenderingInfo plotRenderingInfo0 = null;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)122;
      ByteLookupTable byteLookupTable0 = new ByteLookupTable(10, byteArray0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      OHLCDataItem[] oHLCDataItemArray0 = new OHLCDataItem[2];
      TimeZone timeZone0 = TimeZone.getTimeZone("Null 'record' argument.");
      Locale locale0 = Locale.KOREAN;
      DateAxis dateAxis0 = new DateAxis("#SsRP4%s%/s9=Wy|L<", timeZone0, locale0);
      DateTickUnit dateTickUnit0 = DateAxis.DEFAULT_DATE_TICK_UNIT;
      Date date0 = dateAxis0.calculateHighestVisibleTickValue(dateTickUnit0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 1.0F, 1.0F, (-321.33419), 1.0F, 10);
      oHLCDataItemArray0[0] = oHLCDataItem0;
      OHLCDataItem oHLCDataItem1 = new OHLCDataItem(dateAxis0.DEFAULT_ANCHOR_DATE, (byte)122, 1.0E-8, 2.0F, 1.0F, 2166.2195);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((byte)122, "bN");
      // Undeclared exception!
      try { 
        simpleTimeZone0.toZoneId();
      } catch(ZoneRulesException e) {
         //
         // Unknown time-zone ID: bN
         //
         verifyException("java.time.zone.ZoneRulesProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ChartRenderingInfo chartRenderingInfo0 = null;
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo((-1345));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      XYItemRendererState xYItemRendererState0 = new XYItemRendererState(plotRenderingInfo0);
      EntityCollection entityCollection0 = xYItemRendererState0.getEntityCollection();
      ChartRenderingInfo chartRenderingInfo1 = new ChartRenderingInfo(entityCollection0);
      PlotRenderingInfo plotRenderingInfo1 = chartRenderingInfo1.getPlotInfo();
      CrosshairState crosshairState0 = new CrosshairState(false);
      Point2D point2D0 = crosshairState0.getAnchor();
      xYPlot0.zoomDomainAxes(0.0, 0.0, plotRenderingInfo1, (Point2D) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("+");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      double double0 = 0.0;
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      int int0 = 2;
      int int1 = 0;
      MouseEvent mouseEvent0 = null;
      try {
        mouseEvent0 = new MouseEvent((Component) null, 275, 275, 2, 3034, 0, 275, 3034, (-1246), false, 0);
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      double double0 = 0.0;
      TextBox textBox0 = new TextBox();
      RectangleInsets rectangleInsets0 = textBox0.getInteriorGap();
      combinedDomainXYPlot0.setInsets(rectangleInsets0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Object object0 = plotRenderingInfo0.clone();
      XYDifferenceRenderer xYDifferenceRenderer0 = new XYDifferenceRenderer(combinedDomainXYPlot0.DEFAULT_BACKGROUND_PAINT, combinedDomainXYPlot0.DEFAULT_GRIDLINE_PAINT, false);
      int int0 = 3484;
      int int1 = 1121;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-70);
      byte byte0 = (byte) (-65);
      byteArray0[1] = (byte) (-65);
      byteArray0[2] = (byte) (-60);
      byteArray0[3] = (byte)0;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(1121, 10, byteArray0, byteArray0, byteArray0);
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }
}
