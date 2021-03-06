/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:32:43 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.LookupOp;
import java.awt.image.RescaleOp;
import java.awt.image.ShortLookupTable;
import java.sql.Connection;
import java.text.AttributedCharacterIterator;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import javax.swing.JApplet;
import javax.swing.JTree;
import javax.swing.border.BevelBorder;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.PolarChartPanel;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.panel.AbstractMouseHandler;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GradientBarPainter;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.Week;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      int int0 = 1;
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      statisticalBarRenderer0.setSeriesToolTipGenerator(1, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      String string0 = "K &G";
      // Undeclared exception!
      try { 
        Week.parseWeek("K &G");
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) null);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("v_7V$_lA6=");
      Second second0 = new Second();
      RegularTimePeriod regularTimePeriod0 = second0.previous();
      CategoryMarker categoryMarker0 = new CategoryMarker(regularTimePeriod0);
      Stack<CategoryTextAnnotation> stack0 = new Stack<CategoryTextAnnotation>();
      JTree jTree0 = new JTree(stack0);
      Rectangle rectangle0 = jTree0.getRowBounds(0);
      // Undeclared exception!
      try { 
        intervalBarRenderer0.drawDomainMarker((Graphics2D) null, combinedRangeCategoryPlot0, categoryAxis3D0, categoryMarker0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      Paint paint0 = barRenderer3D0.getWallPaint();
      lineRenderer3D0.setWallPaint(paint0);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = categoryStepRenderer0.getBaseToolTipGenerator();
      GradientPaintTransformer gradientPaintTransformer0 = barRenderer3D0.getGradientPaintTransformer();
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      String string0 = "z?K2";
      ModuloAxis moduloAxis0 = new ModuloAxis("z?K2", (Range) null);
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer();
      XYPlot xYPlot0 = null;
      try {
        xYPlot0 = new XYPlot((XYDataset) null, moduloAxis0, moduloAxis0, xYLineAndShapeRenderer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      int int0 = 3994;
      boolean boolean0 = false;
      lineAndShapeRenderer0.setSeriesShapesFilled(3994, false);
      int int1 = lineAndShapeRenderer0.getPassCount();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      boolean boolean1 = false;
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(fastScatterPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 3994, 10, (ChartRenderingInfo) null);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
      Shape shape0 = scatterRenderer0.getLegendShape(2780);
      scatterRenderer0.setDrawOutlines(false);
      scatterRenderer0.setSeriesShapesFilled(2780, true);
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      boolean boolean0 = defaultCategoryItemRenderer0.getItemLineVisible(0, 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryURLGenerator categoryURLGenerator0 = levelRenderer0.getSeriesURLGenerator(0);
      SpreadsheetDate spreadsheetDate0 = null;
      try {
        spreadsheetDate0 = new SpreadsheetDate((-3690), 0, (-3690));
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      Stroke stroke0 = lineAndShapeRenderer0.lookupSeriesOutlineStroke((-1043));
      boolean boolean0 = lineAndShapeRenderer0.getUseOutlinePaint();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      lineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
      boolean boolean1 = lineAndShapeRenderer0.equals(stroke0);
      double double0 = lineAndShapeRenderer0.getItemMargin();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Stroke stroke1 = statisticalLineAndShapeRenderer0.getErrorIndicatorStroke();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      double[] doubleArray0 = stackedBarRenderer3D0.calculateBarL0L1((-1043), (double) statisticalLineAndShapeRenderer0.ZERO, (-239.517712252171));
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      boxAndWhiskerRenderer0.setPlot(combinedRangeCategoryPlot0);
      Object object0 = combinedRangeCategoryPlot0.clone();
      boolean boolean2 = boxAndWhiskerRenderer0.isMedianVisible();
      Shape shape0 = lineAndShapeRenderer0.lookupSeriesShape(10);
      boolean boolean3 = lineAndShapeRenderer0.getBaseShapesVisible();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesItemLabelGenerator((-1043), (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(".FKP", 3.0, (double) stackedBarRenderer3D0.ZERO, 8.0);
      categoryPointerAnnotation0.setRotationAngle(1517.014331317329);
      boolean boolean0 = stackedBarRenderer3D0.removeAnnotation(categoryPointerAnnotation0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      jDBCCategoryDataset0.setTranspose(false);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 5;
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.createStackedValueList(jDBCCategoryDataset0, 10.0, intArray0, 254.92, false);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      boolean boolean0 = groupedStackedBarRenderer0.equals((Object) null);
      String[] stringArray0 = new String[2];
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator(";|MEY;w0(1'");
      groupedStackedBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
      stringArray0[0] = "Base tool tip generator not cloneable.";
      stringArray0[1] = "";
      Number[][] numberArray0 = new Number[1][0];
      Number[] numberArray1 = new Number[1];
      numberArray1[0] = (Number) 3.0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = null;
      try {
        defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      } catch(IllegalArgumentException e) {
         //
         // The number of series keys does not match the number of series in the data.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setAutoPopulateSeriesOutlinePaint(false);
      HashMap<AttributedCharacterIterator.Attribute, CategoryPointerAnnotation> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, CategoryPointerAnnotation>();
      Font font0 = stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_FONT.deriveFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      stackedBarRenderer3D0.setLegendTextFont(2202, font0);
      stackedBarRenderer3D0.setIncludeBaseInRange(true);
      LegendItem legendItem0 = stackedBarRenderer3D0.getLegendItem((-1), (-833));
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      boolean boolean0 = lineAndShapeRenderer0.getDrawOutlines();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      int int0 = 0;
      double double0 = 0.0;
      lineRenderer3D0.setItemLabelAnchorOffset(0.0);
      lineRenderer3D0.setBaseShapesFilled(true);
      boolean boolean0 = lineRenderer3D0.equals((Object) null);
      lineRenderer3D0.setXOffset(0);
      int int1 = 277;
      lineRenderer3D0.setXOffset((-1.0));
      LegendItem legendItem0 = lineRenderer3D0.getLegendItem(0, 277);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineRenderer3D0.getSeriesItemLabelGenerator(277);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double double1 = boxAndWhiskerRenderer0.getItemMargin();
      int int2 = 0;
      String string0 = "";
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", numberFormat0);
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setMaximumBarWidth(0);
      ItemLabelPosition itemLabelPosition0 = groupedStackedBarRenderer0.getPositiveItemLabelPositionFallback();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      AbstractMouseHandler abstractMouseHandler0 = new AbstractMouseHandler();
      defaultTreeCellRenderer0.removeMouseListener(abstractMouseHandler0);
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(boxAndWhiskerRenderer0.DEFAULT_PAINT, color0, groupedStackedBarRenderer0.DEFAULT_OUTLINE_PAINT, groupedStackedBarRenderer0.DEFAULT_OUTLINE_PAINT);
      boolean boolean1 = false;
      waterfallBarRenderer0.clearSeriesStrokes(false);
      waterfallBarRenderer0.setPositiveBarPaint(boxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_PAINT);
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.setRenderAsPercentages(false);
      CategoryPlot categoryPlot0 = groupedStackedBarRenderer0.getPlot();
      JFreeChart jFreeChart0 = null;
      try {
        jFreeChart0 = new JFreeChart("Unknown layer.", (Plot) null);
      } catch(NullPointerException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.JFreeChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setAutoPopulateSeriesShape(true);
      Shape shape0 = scatterRenderer0.lookupSeriesShape(573);
      boolean boolean0 = scatterRenderer0.getSeriesShapesFilled((-2966));
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setXOffset(0.0);
      lineRenderer3D0.setXOffset((-2966));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      int int0 = 55;
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, 55, false);
      layeredBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-769.6759), (double) layeredBarRenderer0.ZERO, false);
      Graphics2D graphics2D0 = null;
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Color color0 = new Color(10);
      BevelBorder bevelBorder0 = new BevelBorder(1690, color0, color0);
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
  public void test14()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = groupedStackedBarRenderer0.getLegendItemURLGenerator();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      barRenderer0.setAutoPopulateSeriesShape(false);
      barRenderer0.removeAnnotations();
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.clearSeriesPaints(false);
      minMaxCategoryRenderer0.removeAnnotations();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      lineRenderer3D0.setPlot(combinedDomainCategoryPlot0);
      lineRenderer3D0.setBaseShapesFilled(true);
      lineRenderer3D0.setLegendTextFont(56, minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT);
      lineRenderer3D0.setYOffset(3.0);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double double0 = scatterRenderer0.getItemMargin();
      double double1 = lineRenderer3D0.getXOffset();
      GradientPaintTransformer gradientPaintTransformer0 = barRenderer0.getGradientPaintTransformer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double double2 = boxAndWhiskerRenderer0.getItemMargin();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new CombinedDomainCategoryPlot();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Paint paint0 = combinedDomainCategoryPlot1.getDomainGridlinePaint();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawDomainLine((Graphics2D) null, combinedDomainCategoryPlot1, rectangle2D_Float0, 56, paint0, boxAndWhiskerRenderer0.DEFAULT_OUTLINE_STROKE);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("_XqGwOn;/JM!va6WYz", numberFormat0);
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      Collection collection0 = categoryPlot0.getRangeMarkers((Layer) null);
      scatterRenderer0.setPlot(categoryPlot0);
      int int0 = 0;
      scatterRenderer0.setSeriesShapesFilled(0, true);
      Graphics2D graphics2D0 = null;
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      CategoryAxis categoryAxis0 = null;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F, "({0}, {1}) = {3} - {4}");
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((String) null, "", "", "");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainXYPlot0);
      boolean boolean0 = true;
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, (-1141), 1, 32, (-1141), 10, 0, true, true, true, false, true, true);
      // Undeclared exception!
      try { 
        chartPanel0.createGraphics2D();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(meterPlot0);
      PolarChartPanel polarChartPanel0 = null;
      try {
        polarChartPanel0 = new PolarChartPanel(jFreeChart0, false);
      } catch(IllegalArgumentException e) {
         //
         // plot is not a PolarPlot
         //
         verifyException("org.jfree.chart.PolarChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      stackedBarRenderer3D0.clearSeriesStrokes(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator(53);
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
      stackedBarRenderer3D0.setIgnoreZeroValues(true);
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Paint paint0 = ganttRenderer0.getCompletePaint();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      statisticalLineAndShapeRenderer0.setErrorIndicatorStroke(stackedBarRenderer3D0.DEFAULT_OUTLINE_STROKE);
      stackedBarRenderer3D0.setBase(683.9518);
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      int int0 = stackedBarRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      int int0 = (-874);
      Paint paint0 = lineRenderer3D0.getLegendTextPaint((-874));
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        ganttRenderer0.getDomainAxis((CategoryPlot) null, jDBCCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
      lineAndShapeRenderer0.setSeriesItemLabelGenerator(53, (CategoryItemLabelGenerator) null);
      boolean boolean0 = lineAndShapeRenderer0.getItemShapeFilled(0, (-1));
      StandardBarPainter standardBarPainter0 = new StandardBarPainter();
      BarRenderer.setDefaultBarPainter(standardBarPainter0);
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(lineAndShapeRenderer0.DEFAULT_OUTLINE_PAINT, lineAndShapeRenderer0.DEFAULT_OUTLINE_PAINT, lineAndShapeRenderer0.DEFAULT_OUTLINE_PAINT, statisticalBarRenderer0.DEFAULT_VALUE_LABEL_PAINT);
      Paint paint0 = waterfallBarRenderer0.getPositiveBarPaint();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator((-720));
      waterfallBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      LegendItem legendItem0 = scatterRenderer0.getLegendItem((-720), (-720));
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = scatterRenderer0.findRangeBounds(defaultBoxAndWhiskerCategoryDataset0);
      LegendItem legendItem1 = scatterRenderer0.getLegendItem(2292, (-1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      BarPainter barPainter0 = layeredBarRenderer0.getBarPainter();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      GradientPaintTransformType gradientPaintTransformType0 = GradientPaintTransformType.CENTER_VERTICAL;
      StandardGradientPaintTransformer standardGradientPaintTransformer0 = new StandardGradientPaintTransformer(gradientPaintTransformType0);
      boolean boolean0 = stackedBarRenderer0.equals(standardGradientPaintTransformer0);
      boolean boolean1 = stackedBarRenderer0.getShadowsVisible();
      stackedBarRenderer0.setMaximumBarWidth(2.5E11);
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      BarRenderer.setDefaultBarPainter(gradientBarPainter0);
      BarPainter barPainter0 = BarRenderer.getDefaultBarPainter();
      BarPainter barPainter1 = BarRenderer.getDefaultBarPainter();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(18, 0, chartRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Width (18) and height (0) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = false;
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1.0), (-4.0), false);
      double double0 = stackedBarRenderer3D0.getShadowYOffset();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      short[][] shortArray0 = new short[3][9];
      short[] shortArray1 = new short[9];
      shortArray1[0] = (short)346;
      shortArray1[1] = (short) (-1835);
      shortArray1[2] = (short)2677;
      shortArray1[3] = (short)334;
      shortArray1[4] = (short) (-508);
      shortArray1[5] = (short)1741;
      shortArray1[6] = (short) (-726);
      shortArray1[7] = (short) (-2151);
      shortArray1[8] = (short)79;
      shortArray0[0] = shortArray1;
      short[] shortArray2 = new short[4];
      shortArray2[0] = (short)1741;
      shortArray2[1] = (short)2677;
      shortArray2[2] = (short)334;
      shortArray2[3] = (short)2677;
      shortArray0[1] = shortArray2;
      short[] shortArray3 = new short[4];
      shortArray3[0] = (short)1741;
      shortArray3[1] = (short)2677;
      shortArray3[2] = (short) (-726);
      shortArray3[3] = (short)1741;
      shortArray0[2] = shortArray3;
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(0, shortArray0);
      Hashtable<RenderingHints.Key, CategoryLineAnnotation> hashtable0 = new Hashtable<RenderingHints.Key, CategoryLineAnnotation>();
      RenderingHints renderingHints0 = new RenderingHints(hashtable0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, renderingHints0);
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_INTERPOLATION;
      RenderingHints renderingHints1 = new RenderingHints(sunHints_Key0, renderingHints0);
      RescaleOp rescaleOp0 = new RescaleOp((short) (-1835), (-1060.3F), renderingHints1);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage((short)2677, 0, (short)346);
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 346
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }
}
