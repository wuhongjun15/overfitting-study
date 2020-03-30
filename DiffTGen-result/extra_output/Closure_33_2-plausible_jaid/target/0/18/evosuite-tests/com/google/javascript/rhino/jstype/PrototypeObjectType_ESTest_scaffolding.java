/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 27 07:27:17 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PrototypeObjectType_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.rhino.jstype.PrototypeObjectType"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrototypeObjectType_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.LinkedHashMultimap$SetDecorator",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "plume.UtilMDE$EnumerationIterator",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.Sets$3",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "org.apache.oro.text.regex.Pattern",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.common.base.Predicates$AlwaysFalsePredicate",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Joiner",
      "plume.UtilMDE$FilteredIterator",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.rhino.Node$StringNode",
      "org.apache.oro.text.regex.PatternMatcher",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.InputId",
      "com.google.common.collect.Iterators$15",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.base.CharMatcher$3",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.Predicates$NotNullPredicate",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.common.base.Predicates$1",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.apache.oro.io.GlobFilenameFilter",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "plume.UtilMDE$MergedIterator2",
      "com.google.common.collect.Iterators$8",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.base.Equivalence$EquivalentToPredicate",
      "org.apache.oro.text.regex.PatternCompiler",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.common.collect.ForwardingSet",
      "com.google.common.base.CharMatcher$Is",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "plume.MultiVersionControl$IsDirectoryFilter",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "plume.UtilMDE$RemoveFirstAndLastIterator",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "org.apache.oro.text.PatternCache",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.rhino.jstype.NamedType$PropertyContinuation",
      "com.google.common.base.CharMatcher$IsEither",
      "plume.UtilMDE$IteratorEnumeration",
      "com.google.javascript.rhino.jstype.VoidType",
      "org.apache.oro.io.RegexFilenameFilter",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.base.CharMatcher$Any",
      "org.apache.oro.text.MalformedCachePatternException",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.Sets$SetView",
      "plume.UtilMDE$MergedIterator",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "plume.UtilMDE$WildcardFilter",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.common.base.CharMatcher$And",
      "plume.UtilMDE",
      "org.apache.oro.io.AwkFilenameFilter",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.common.collect.Lists$ImmutableListWithNullElementsException",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor",
      "com.google.common.base.CharMatcher$15",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.google.common.base.SmallCharMatcher",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "plume.MultiVersionControl$StreamOfNewlines",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "plume.UtilMDE$NullableStringComparator",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor",
      "com.google.common.collect.ForwardingObject",
      "plume.MultiVersionControl",
      "org.apache.oro.io.Perl5FilenameFilter",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Predicates$IsNullPredicate",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.collect.Maps",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.collect.SetMultimap",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.base.Predicates$AlwaysTruePredicate",
      "com.google.javascript.rhino.JSTypeExpression",
      "plume.MultiVersionControl$Replacer",
      "com.google.common.base.Predicates$InPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrototypeObjectType_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.Sets",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.ForwardingSet",
      "com.google.common.collect.LinkedHashMultimap$SetDecorator",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.Node$NodeMismatch"
    );
  }
}
