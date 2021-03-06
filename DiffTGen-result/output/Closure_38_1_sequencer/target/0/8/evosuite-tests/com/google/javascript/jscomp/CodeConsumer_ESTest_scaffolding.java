/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 27 04:57:03 GMT 2020
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CodeConsumer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.CodeConsumer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CodeConsumer_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.jscomp.CodeConsumer",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "plume.UtilMDE$EnumerationIterator",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.CodePrinter$1",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "org.apache.oro.text.PatternCache",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.jstype.RecordType",
      "org.apache.oro.text.regex.Pattern",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.base.Predicates$AlwaysFalsePredicate",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.SourceMap$1",
      "com.google.common.base.CharMatcher$None",
      "plume.UtilMDE$IteratorEnumeration",
      "com.google.javascript.rhino.jstype.VoidType",
      "org.apache.oro.io.RegexFilenameFilter",
      "com.google.javascript.jscomp.SourceMap",
      "com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator",
      "plume.UtilMDE$FilteredIterator",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.base.CharMatcher$Any",
      "org.apache.oro.text.MalformedCachePatternException",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.rhino.Node$StringNode",
      "org.apache.oro.text.regex.PatternMatcher",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "plume.UtilMDE$MergedIterator",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.debugging.sourcemap.SourceMapGenerator",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "plume.UtilMDE$WildcardFilter",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.base.CharMatcher$And",
      "plume.UtilMDE",
      "com.google.common.base.CharMatcher$5",
      "org.apache.oro.io.AwkFilenameFilter",
      "com.google.common.base.CharMatcher$4",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$9",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.CharMatcher$7",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.Predicates$NotNullPredicate",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter$Mapping",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.CharMatcher$13",
      "com.google.javascript.jscomp.CodePrinter$Builder",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.base.Predicates$1",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.SmallCharMatcher",
      "org.apache.oro.io.GlobFilenameFilter",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$AndPredicate",
      "plume.UtilMDE$MergedIterator2",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "plume.MultiVersionControl$StreamOfNewlines",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.javascript.jscomp.PerformanceTracker$CodeSizeEstimatePrinter",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "plume.UtilMDE$NullableStringComparator",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.base.Equivalence$EquivalentToPredicate",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "org.apache.oro.text.regex.PatternCompiler",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.common.base.CharMatcher$Is",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "plume.MultiVersionControl$IsDirectoryFilter",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor",
      "plume.MultiVersionControl",
      "org.apache.oro.io.Perl5FilenameFilter",
      "plume.UtilMDE$RemoveFirstAndLastIterator",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Predicates$IsNullPredicate",
      "com.google.javascript.jscomp.CodePrinter$Format",
      "com.google.javascript.jscomp.SourceMap$LocationMapping",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.base.CharMatcher$Or",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.base.Predicates$AlwaysTruePredicate",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.base.CharMatcher$Digit",
      "plume.MultiVersionControl$Replacer",
      "com.google.javascript.jscomp.CodePrinter",
      "com.google.common.base.Predicates$InPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CodeConsumer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.CodeConsumer",
      "com.google.javascript.jscomp.CodePrinter$MappedCodePrinter",
      "com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter"
    );
  }
}
