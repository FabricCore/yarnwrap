package yarnwrap.test;
public class TestSet { public net.minecraft.test.TestSet wrapperContained; public TestSet(net.minecraft.test.TestSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection tests() { return wrapperContained.tests; }
// public void tests(java.util.Collection value) { wrapperContained.tests = value; }
// public static java.util.Collection tests() { return net.minecraft.test.TestSet.tests; }
// public static void tests(java.util.Collection value, ) { net.minecraft.test.TestSet.tests = value; }

// public java.util.Collection listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.Collection value) { wrapperContained.listeners = value; }
// public static java.util.Collection listeners() { return net.minecraft.test.TestSet.listeners; }
// public static void listeners(java.util.Collection value, ) { net.minecraft.test.TestSet.listeners = value; }

// public char NOT_STARTED() { return wrapperContained.NOT_STARTED; }
// public void NOT_STARTED(char value) { wrapperContained.NOT_STARTED = value; }
// public static char NOT_STARTED() { return net.minecraft.test.TestSet.NOT_STARTED; }
// public static void NOT_STARTED(char value, ) { net.minecraft.test.TestSet.NOT_STARTED = value; }

// public char RUNNING() { return wrapperContained.RUNNING; }
// public void RUNNING(char value) { wrapperContained.RUNNING = value; }
// public static char RUNNING() { return net.minecraft.test.TestSet.RUNNING; }
// public static void RUNNING(char value, ) { net.minecraft.test.TestSet.RUNNING = value; }

// public char PASS() { return wrapperContained.PASS; }
// public void PASS(char value) { wrapperContained.PASS = value; }
// public static char PASS() { return net.minecraft.test.TestSet.PASS; }
// public static void PASS(char value, ) { net.minecraft.test.TestSet.PASS = value; }

// public char OPTIONAL_FAIL() { return wrapperContained.OPTIONAL_FAIL; }
// public void OPTIONAL_FAIL(char value) { wrapperContained.OPTIONAL_FAIL = value; }
// public static char OPTIONAL_FAIL() { return net.minecraft.test.TestSet.OPTIONAL_FAIL; }
// public static void OPTIONAL_FAIL(char value, ) { net.minecraft.test.TestSet.OPTIONAL_FAIL = value; }

// public char REQUIRED_FAIL() { return wrapperContained.REQUIRED_FAIL; }
// public void REQUIRED_FAIL(char value) { wrapperContained.REQUIRED_FAIL = value; }
// public static char REQUIRED_FAIL() { return net.minecraft.test.TestSet.REQUIRED_FAIL; }
// public static void REQUIRED_FAIL(char value, ) { net.minecraft.test.TestSet.REQUIRED_FAIL = value; }

public TestSet(java.util.Collection tests) { this.wrapperContained = new net.minecraft.test.TestSet(tests); }
public int getFailedRequiredTestCount() { return wrapperContained.getFailedRequiredTestCount(); }
// public static int getFailedRequiredTestCount() { return net.minecraft.test.TestSet.getFailedRequiredTestCount(); }
public void add(yarnwrap.test.GameTestState test) { wrapperContained.add(test.wrapperContained); }
// public static void add(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestSet.add(test.wrapperContained); }
public void addListener(yarnwrap.test.TestListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public static void addListener(yarnwrap.test.TestListener listener, ) { net.minecraft.test.TestSet.addListener(listener.wrapperContained); }
// public void method_22232(yarnwrap.test.TestListener test) { wrapperContained.method_22232(test.wrapperContained); }
// public static void method_22232(yarnwrap.test.TestListener test, ) { net.minecraft.test.TestSet.method_22232(test.wrapperContained); }
// public void method_22233(java.lang.StringBuffer test) { wrapperContained.method_22233(test); }
// public static void method_22233(java.lang.StringBuffer test, ) { net.minecraft.test.TestSet.method_22233(test); }
public int getFailedOptionalTestCount() { return wrapperContained.getFailedOptionalTestCount(); }
// public static int getFailedOptionalTestCount() { return net.minecraft.test.TestSet.getFailedOptionalTestCount(); }
public int getCompletedTestCount() { return wrapperContained.getCompletedTestCount(); }
// public static int getCompletedTestCount() { return net.minecraft.test.TestSet.getCompletedTestCount(); }
public boolean failed() { return wrapperContained.failed(); }
// public static boolean failed() { return net.minecraft.test.TestSet.failed(); }
public boolean hasFailedOptionalTests() { return wrapperContained.hasFailedOptionalTests(); }
// public static boolean hasFailedOptionalTests() { return net.minecraft.test.TestSet.hasFailedOptionalTests(); }
public int getTestCount() { return wrapperContained.getTestCount(); }
// public static int getTestCount() { return net.minecraft.test.TestSet.getTestCount(); }
public boolean isDone() { return wrapperContained.isDone(); }
// public static boolean isDone() { return net.minecraft.test.TestSet.isDone(); }
public java.lang.String getResultString() { return wrapperContained.getResultString(); }
// public static java.lang.String getResultString() { return net.minecraft.test.TestSet.getResultString(); }
public void addListener(java.util.function.Consumer onFailed) { wrapperContained.addListener(onFailed); }
// public static void addListener(java.util.function.Consumer onFailed, ) { net.minecraft.test.TestSet.addListener(onFailed); }
public java.util.Collection getRequiredTests() { return wrapperContained.getRequiredTests(); }
// public static java.util.Collection getRequiredTests() { return net.minecraft.test.TestSet.getRequiredTests(); }
public java.util.Collection getOptionalTests() { return wrapperContained.getOptionalTests(); }
// public static java.util.Collection getOptionalTests() { return net.minecraft.test.TestSet.getOptionalTests(); }
public void remove(yarnwrap.test.GameTestState state) { wrapperContained.remove(state.wrapperContained); }
// public static void remove(yarnwrap.test.GameTestState state, ) { net.minecraft.test.TestSet.remove(state.wrapperContained); }

}