/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:00:15 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.color.ColorSpace;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.IndexColorModel;
import java.awt.image.RescaleOp;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.PolarChartPanel;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.GrayPaintScale;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYErrorRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Hour;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.getQuadrantPaint((-231));
      } catch(IllegalArgumentException e) {
         //
         // The index value (-231) should be in the range 0 to 3.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "La";
      stringArray0[1] = "";
      stringArray0[2] = "La";
      SymbolAxis symbolAxis0 = new SymbolAxis("La", stringArray0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      combinedDomainXYPlot0.clearSelection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.zoomRangeAxes(80.9380791774, 0.0, plotRenderingInfo0, (Point2D) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'source' argument.
         //
         verifyException("org.jfree.chart.plot.CombinedDomainXYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.setDomainCrosshairValue(2334.6975306516);
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.setRangeMinorGridlinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(numberAxis3D0);
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(448.60830681);
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.setRenderer((-3122), (XYItemRenderer) candlestickRenderer0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, (String) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.addDomainMarker((Marker) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'marker' not permitted.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.clearDomainMarkers(2909);
      IntervalMarker intervalMarker0 = new IntervalMarker(10, 0.0);
      Layer layer0 = Layer.FOREGROUND;
      combinedDomainXYPlot0.addDomainMarker((Marker) intervalMarker0, layer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Font font0 = stackedAreaRenderer0.getBaseItemLabelFont();
      XYPlot xYPlot0 = new XYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("+B'Rx:$(`Q0?(N[Fs6z", font0, xYPlot0, false);
      XYPlot xYPlot1 = jFreeChart0.getXYPlot();
      xYPlot1.setDomainCrosshairVisible(false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      ValueMarker valueMarker0 = new ValueMarker(1.0F, combinedRangeXYPlot0.DEFAULT_BACKGROUND_PAINT, combinedRangeXYPlot0.DEFAULT_CROSSHAIR_STROKE, combinedRangeXYPlot0.DEFAULT_BACKGROUND_PAINT, combinedRangeXYPlot0.DEFAULT_CROSSHAIR_STROKE, 1.0F);
      Layer layer0 = Layer.FOREGROUND;
      boolean boolean0 = combinedRangeXYPlot0.removeDomainMarker((Marker) valueMarker0, layer0);
      double double0 = combinedRangeXYPlot0.getRangeCrosshairValue();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      valueMarker0.setLabelOffsetType(lengthAdjustmentType0);
      Paint paint0 = combinedRangeXYPlot0.getDomainZeroBaselinePaint();
      boolean boolean1 = combinedRangeXYPlot0.canSelectByRegion();
      combinedRangeXYPlot0.setDomainMinorGridlinesVisible(false);
      combinedRangeXYPlot0.setRangeCrosshairValue(0.0);
      boolean boolean2 = combinedRangeXYPlot0.isRangeGridlinesVisible();
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      double double1 = 1.5707963267948966;
      double double2 = 0.0;
      PolarChartPanel polarChartPanel0 = null;
      try {
        polarChartPanel0 = new PolarChartPanel((JFreeChart) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.PolarChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      boolean boolean0 = xYPlot0.isDomainCrosshairLockedOnData();
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      DatasetChangeEvent datasetChangeEvent0 = new DatasetChangeEvent(samplingXYLineRenderer0, (Dataset) null);
      xYPlot0.datasetChanged(datasetChangeEvent0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(":", samplingXYLineRenderer0.DEFAULT_VALUE_LABEL_FONT, combinedDomainCategoryPlot0, true);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      RescaleOp rescaleOp0 = new RescaleOp(10, 2451.15F, renderingHints0);
      int int0 = 0;
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)4;
      byteArray0[0] = (byte)4;
      byte byte1 = (byte)73;
      byteArray0[1] = (byte)73;
      byte byte2 = (byte)116;
      byteArray0[2] = (byte)116;
      int int1 = 648;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(15, 0, byteArray0, 648, true);
      } catch(IllegalArgumentException e) {
         //
         // Map size (0) must be >= 1
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.setRangeAxis((-2756), (ValueAxis) dateAxis0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      combinedRangeXYPlot0.mapDatasetToRangeAxis(4461, 4461);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      XYDataset xYDataset0 = combinedRangeXYPlot0.getDataset();
      combinedRangeXYPlot0.configureDomainAxes();
      DatasetRenderingOrder datasetRenderingOrder0 = combinedRangeXYPlot0.getDatasetRenderingOrder();
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.getQuadrantPaint(424);
      } catch(IllegalArgumentException e) {
         //
         // The index value (424) should be in the range 0 to 3.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      cyclicNumberAxis0.removeChangeListener(combinedDomainXYPlot0);
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      combinedDomainXYPlot0.setRangeAxisLocation(500, axisLocation0);
      ValueAxis[] valueAxisArray0 = new ValueAxis[1];
      valueAxisArray0[0] = (ValueAxis) cyclicNumberAxis0;
      combinedDomainXYPlot0.setDomainAxes(valueAxisArray0);
      boolean boolean0 = combinedDomainXYPlot0.isDomainGridlinesVisible();
      combinedDomainXYPlot0.setRangeCrosshairValue(1914.16749234372, false);
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(axisLocation0, true);
      JFreeChart jFreeChart0 = new JFreeChart("r", combinedDomainXYPlot0);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(valueAxisArray0[0]);
      ChartChangeEventType chartChangeEventType0 = axisChangeEvent0.getType();
      rendererChangeEvent0.setType(chartChangeEventType0);
      rendererChangeEvent0.setChart(jFreeChart0);
      combinedDomainXYPlot0.rendererChanged(rendererChangeEvent0);
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Stroke stroke0 = stackedAreaRenderer0.getBaseOutlineStroke();
      IntervalMarker intervalMarker0 = new IntervalMarker(2.0F, 0.0, cyclicNumberAxis0.DEFAULT_ADVANCE_LINE_PAINT, cyclicNumberAxis0.DEFAULT_TICK_MARK_STROKE, combinedDomainXYPlot0.DEFAULT_OUTLINE_PAINT, stroke0, 0.0F);
      Layer layer0 = Layer.FOREGROUND;
      combinedDomainXYPlot0.addRangeMarker(15, (Marker) intervalMarker0, layer0);
      combinedDomainXYPlot0.setDomainCrosshairValue(0.05);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      DatasetChangeEvent datasetChangeEvent0 = new DatasetChangeEvent(xYPlot0, defaultCategoryDataset0);
      xYPlot0.datasetChanged(datasetChangeEvent0);
      Graphics2D graphics2D0 = null;
      Rectangle rectangle0 = new Rectangle(10, 0, 0, 0);
      LinkedList<XYIntervalSeriesCollection> linkedList0 = new LinkedList<XYIntervalSeriesCollection>();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      boolean boolean0 = linkedList0.add(xYIntervalSeriesCollection0);
      xYPlot0.drawDomainTickBands((Graphics2D) null, rectangle0, linkedList0);
      String string0 = null;
      Font font0 = PeriodAxisLabelInfo.DEFAULT_FONT;
      int int0 = 0;
      // Undeclared exception!
      try { 
        MockFile.createTempFile((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      int int0 = 3;
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.getRangeAxisForDataset(3);
      } catch(IllegalArgumentException e) {
         //
         // Index 3 out of bounds.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "</%x,z\\)q";
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("</%x,z)q");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis3D0);
      AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation(500);
      combinedDomainXYPlot0.setDomainAxisLocation(axisLocation0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(45.0, 45.0, 2.0F, 0.0F);
      int int0 = 1896;
      AxisLocation axisLocation1 = combinedDomainXYPlot0.getDomainAxisLocation(1896);
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(0.05, (-2022.696601));
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(dateAxis0);
      Color color0 = Color.CYAN;
      ValueMarker valueMarker0 = new ValueMarker(0.0, color0, dateAxis0.DEFAULT_TICK_MARK_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      combinedRangeXYPlot0.addRangeMarker(900, (Marker) valueMarker0, layer0, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer((Integer) 10, (Integer) 10);
      LegendItemCollection legendItemCollection0 = waferMapRenderer0.getLegendCollection();
      combinedRangeXYPlot0.clearDomainMarkers(1);
      Iterator iterator0 = legendItemCollection0.iterator();
      waferMapRenderer0.setBaseLegendTextPaint(combinedRangeXYPlot0.DEFAULT_BACKGROUND_PAINT);
      Iterator iterator1 = legendItemCollection0.iterator();
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      ItemLabelPosition itemLabelPosition0 = defaultPolarItemRenderer0.getSeriesNegativeItemLabelPosition(1);
      waferMapRenderer0.setSeriesVisible(10, (Boolean) null, false);
      waferMapRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition0, true);
      combinedRangeXYPlot0.setFixedLegendItems(legendItemCollection0);
      combinedRangeXYPlot0.setRangeZeroBaselineStroke(waferMapRenderer0.DEFAULT_OUTLINE_STROKE);
      Paint paint0 = combinedRangeXYPlot0.getRangeGridlinePaint();
      SeriesRenderingOrder seriesRenderingOrder0 = combinedRangeXYPlot0.getSeriesRenderingOrder();
      combinedRangeXYPlot0.setSeriesRenderingOrder(seriesRenderingOrder0);
      AxisSpace axisSpace0 = combinedRangeXYPlot0.getFixedRangeAxisSpace();
      boolean boolean0 = combinedRangeXYPlot0.isDomainZoomable();
      XYItemRenderer xYItemRenderer0 = combinedRangeXYPlot0.getRendererForDataset((XYDataset) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logAxis0);
      combinedRangeXYPlot0.setDomainCrosshairPaint(logAxis0.DEFAULT_AXIS_LABEL_PAINT);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-97);
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte) (-26);
      byteArray0[4] = (byte) (-21);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)4;
      int int0 = 1092;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(500, 180, byteArray0, byteArray0, byteArray0, 1092);
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.0, 3.4028234663852886E38);
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, xYErrorRenderer0);
      Paint paint0 = xYPlot0.getRangeMinorGridlinePaint();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Point2D point2D0 = combinedDomainXYPlot0.getQuadrantOrigin();
      int int0 = 25;
      // Undeclared exception!
      try { 
        ColorSpace.getInstance(25);
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ColorSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ValueAxis valueAxis0 = null;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainXYPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, false, true);
      try { 
        chartPanel0.getMousePosition(true);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot((ValueAxis) null);
      combinedRangeXYPlot0.setRangeCrosshairLockedOnData(true);
      Color color0 = new Color(2011, true);
      Color color1 = Color.getColor("The index value (", color0);
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.setQuadrantPaint(181, color0);
      } catch(IllegalArgumentException e) {
         //
         // The index value (181) should be in the range 0 to 3.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      numberAxis0.configure();
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.setQuadrantPaint(1793, numberAxis0.DEFAULT_AXIS_LINE_PAINT);
      } catch(IllegalArgumentException e) {
         //
         // The index value (1793) should be in the range 0 to 3.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      // Undeclared exception!
      try { 
        jFreeChart0.getXYPlot();
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.XYPlot
         //
         verifyException("org.jfree.chart.JFreeChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      PeriodAxis periodAxis0 = new PeriodAxis("", regularTimePeriod0, regularTimePeriod0);
      long long0 = hour0.getMiddleMillisecond();
      XYDotRenderer xYDotRenderer0 = new XYDotRenderer();
      Calendar calendar0 = MockCalendar.getInstance();
      long long1 = regularTimePeriod0.getFirstMillisecond(calendar0);
      periodAxis0.setTimeZone(zoneInfo0);
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, periodAxis0, periodAxis0, xYDotRenderer0);
      AxisLocation axisLocation0 = xYPlot0.getDomainAxisLocation();
      AxisLocation axisLocation1 = axisLocation0.getOpposite();
      AxisLocation axisLocation2 = axisLocation0.getOpposite();
      xYPlot0.setRangeAxisLocation(axisLocation0, true);
      int int0 = 0;
      ValueMarker valueMarker0 = new ValueMarker((-269.8275409428033), periodAxis0.DEFAULT_AXIS_LINE_PAINT, xYDotRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      boolean boolean0 = xYPlot0.removeRangeMarker(0, (Marker) valueMarker0, layer0, true);
      xYPlot0.setRenderer((XYItemRenderer) xYDotRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart(xYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(0, 10, 2345, chartRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 2345
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(1719.1492771245);
      CompassPlot compassPlot0 = new CompassPlot(defaultValueDataset0);
      Font font0 = compassPlot0.getLabelFont();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, (Font) null, compassPlot0, false);
      // Undeclared exception!
      try { 
        jFreeChart0.getXYPlot();
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.plot.CompassPlot cannot be cast to org.jfree.chart.plot.XYPlot
         //
         verifyException("org.jfree.chart.JFreeChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      int int0 = (-2539);
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      AxisLocation axisLocation1 = axisLocation0.getOpposite();
      AxisLocation axisLocation2 = axisLocation0.getOpposite();
      AxisLocation axisLocation3 = axisLocation0.getOpposite();
      Color color0 = Color.yellow;
      xYPlot0.setRangeTickBandPaint(color0);
      // Undeclared exception!
      try { 
        xYPlot0.setDomainAxisLocation((-2539), axisLocation0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
