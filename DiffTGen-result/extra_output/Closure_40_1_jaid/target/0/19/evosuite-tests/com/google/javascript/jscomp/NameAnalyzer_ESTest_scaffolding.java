/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 27 12:09:39 GMT 2020
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NameAnalyzer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.NameAnalyzer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NameAnalyzer_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "plume.UtilMDE$EnumerationIterator",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.jscomp.NameAnalyzer$RemoveListener",
      "com.google.javascript.jscomp.JSModule",
      "com.google.common.collect.Sets$3",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "org.apache.oro.text.regex.Pattern",
      "com.google.javascript.jscomp.Tracer",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.common.base.Predicates$AlwaysFalsePredicate",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.SourceMap",
      "com.google.javascript.jscomp.SourceExcerptProvider$1",
      "com.google.common.base.Joiner",
      "plume.UtilMDE$FilteredIterator",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.jscomp.LightweightMessageFormatter$LineNumberingFormatter",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.rhino.Node$StringNode",
      "org.apache.oro.text.regex.PatternMatcher",
      "com.google.javascript.jscomp.graph.FixedPointGraphTraversal$EdgeCallback",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.jscomp.NameAnalyzer$InstanceOfCheckNode",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.NameAnalyzer$FindReferences",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.VerboseMessageFormatter",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.Predicates$NotNullPredicate",
      "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$2",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.javascript.jscomp.NameAnalyzer$RefNode",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.jscomp.SourceExcerptProvider$ExcerptFormatter",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.javascript.jscomp.NameAnalyzer$NameInformation",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.jscomp.BasicErrorManager",
      "com.google.javascript.jscomp.PerformanceTracker",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.javascript.jscomp.Result",
      "com.google.common.base.Predicates$1",
      "com.google.javascript.jscomp.SimpleRegion",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.apache.oro.io.GlobFilenameFilter",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.jscomp.ErrorFormat$2",
      "com.google.common.collect.BiMap",
      "com.google.javascript.jscomp.ErrorFormat$3",
      "plume.UtilMDE$MergedIterator2",
      "com.google.javascript.jscomp.ErrorFormat$4",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.jscomp.FunctionInformationMap",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.jscomp.NameAnalyzer$FindDependencyScopes",
      "com.google.common.base.Equivalence$EquivalentToPredicate",
      "com.google.javascript.jscomp.NameAnalyzer$RefType",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "com.google.javascript.jscomp.AbstractMessageFormatter",
      "org.apache.oro.text.regex.PatternCompiler",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.common.base.CharMatcher$Is",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "plume.MultiVersionControl$IsDirectoryFilter",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.javascript.jscomp.JSSourceFile",
      "com.google.javascript.jscomp.CodingConventions",
      "com.google.javascript.jscomp.ErrorFormat$1",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.javascript.jscomp.NameAnalyzer",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor",
      "com.google.common.base.Supplier",
      "com.google.javascript.jscomp.NameAnalyzer$ReferencePropagationCallback",
      "plume.UtilMDE$RemoveFirstAndLastIterator",
      "com.google.protobuf.MessageOrBuilder",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.common.collect.ImmutableList",
      "com.google.protobuf.GeneratedMessage",
      "com.google.javascript.jscomp.NameAnalyzer$PrototypeSetNode",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.protobuf.AbstractMessage",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.protobuf.MessageLiteOrBuilder",
      "com.google.protobuf.MessageLite",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor",
      "com.google.javascript.jscomp.deps.SortedDependencies$MissingProvideException",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.javascript.jscomp.CustomPassExecutionTime",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.NameAnalyzer$FindDeclarationsAndSetters",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt",
      "com.google.javascript.jscomp.CodingConventions$Proxy",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.LoggerErrorManager",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "org.apache.oro.text.PatternCache",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.JsAst",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.jscomp.ErrorFormat",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.javascript.jscomp.NameAnalyzer$ProcessExternals",
      "plume.UtilMDE$IteratorEnumeration",
      "com.google.javascript.rhino.jstype.VoidType",
      "org.apache.oro.io.RegexFilenameFilter",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.base.CharMatcher$Any",
      "org.apache.oro.text.MalformedCachePatternException",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.jscomp.NameAnalyzer$FindReferences$NodeAccumulator",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.Sets$SetView",
      "com.google.javascript.jscomp.PassConfig",
      "plume.UtilMDE$MergedIterator",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.jscomp.AbstractMessageFormatter$Color",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "plume.UtilMDE$WildcardFilter",
      "com.google.common.base.Predicates",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$1",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.jscomp.LightweightMessageFormatter",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.FunctionInformationMapOrBuilder",
      "com.google.javascript.jscomp.Compiler$CodeBuilder",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.NameAnalyzer$HoistVariableAndFunctionDeclarations",
      "com.google.javascript.jscomp.AstChangeProxy$ChangeListener",
      "com.google.javascript.jscomp.NameAnalyzer$ClassDefiningFunctionNode",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.jscomp.BasicErrorManager$ErrorWithLevel",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.jscomp.DiagnosticType",
      "plume.UtilMDE",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$SideEffectAccumulator",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "org.apache.oro.io.AwkFilenameFilter",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.common.collect.Lists$ImmutableListWithNullElementsException",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.javascript.jscomp.NodeUtil$Visitor",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.google.protobuf.AbstractMessageLite",
      "com.google.common.base.SmallCharMatcher",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "plume.MultiVersionControl$StreamOfNewlines",
      "com.google.javascript.jscomp.JSModuleGraph",
      "plume.UtilMDE$NullableStringComparator",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.BasicErrorManager$LeveledJSErrorComparator",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.jscomp.NameAnalyzer$SpecialReferenceNode",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.javascript.jscomp.Compiler$IntermediateState",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor",
      "com.google.javascript.jscomp.AstChangeProxy",
      "plume.MultiVersionControl",
      "org.apache.oro.io.Perl5FilenameFilter",
      "com.google.javascript.jscomp.NameAnalyzer$1",
      "com.google.javascript.jscomp.NameAnalyzer$JsName",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.common.base.Predicates$IsNullPredicate",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.NameAnalyzer$AliasSet",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.jscomp.SymbolTable",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.common.collect.Maps",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.collect.ImmutableSet$SerializedForm",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.jscomp.NameAnalyzer$JsNameRefNode",
      "com.google.common.base.Predicates$AlwaysTruePredicate",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.jscomp.PrintStreamErrorManager",
      "com.google.protobuf.Message",
      "plume.MultiVersionControl$Replacer",
      "com.google.javascript.jscomp.NameAnalyzer$TriState",
      "com.google.common.base.Predicates$InPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NameAnalyzer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Hashing",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.NameAnalyzer$1",
      "com.google.javascript.jscomp.NameAnalyzer",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.NameAnalyzer$ProcessExternals",
      "com.google.javascript.jscomp.NameAnalyzer$FindDependencyScopes",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.NameAnalyzer$HoistVariableAndFunctionDeclarations",
      "com.google.javascript.jscomp.NameAnalyzer$FindDeclarationsAndSetters",
      "com.google.javascript.jscomp.NameAnalyzer$FindReferences",
      "com.google.javascript.jscomp.NameAnalyzer$JsName",
      "com.google.javascript.jscomp.NameAnalyzer$ReferencePropagationCallback",
      "com.google.javascript.jscomp.NameAnalyzer$RemoveListener",
      "com.google.javascript.jscomp.NameAnalyzer$AliasSet",
      "com.google.javascript.jscomp.NameAnalyzer$NameInformation",
      "com.google.common.base.Joiner",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.NameAnalyzer$RefType",
      "com.google.javascript.jscomp.NameAnalyzer$TriState",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.javascript.jscomp.CodingConventions$Proxy",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.CodingConventions",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.common.collect.Sets",
      "com.google.common.collect.Lists",
      "com.google.javascript.jscomp.AstChangeProxy",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.BasicErrorManager",
      "com.google.javascript.jscomp.LoggerErrorManager",
      "com.google.javascript.jscomp.ErrorFormat",
      "com.google.javascript.jscomp.AbstractMessageFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter$LineNumberingFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter",
      "com.google.javascript.jscomp.BasicErrorManager$LeveledJSErrorComparator",
      "com.google.javascript.jscomp.PrintStreamErrorManager",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.BasicErrorManager$ErrorWithLevel",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.rhino.Node$AncestorIterable"
    );
  }
}
