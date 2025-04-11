package yarnwrap.test;
public class TestSet { public net.minecraft.test.TestSet wrapperContained; public TestSet(net.minecraft.test.TestSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection tests() { return wrapperContained.tests; }
// public void tests(java.util.Collection value) { wrapperContained.tests = value; }
// public java.util.Collection listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.Collection value) { wrapperContained.listeners = value; }
// public char NOT_STARTED() { return wrapperContained.NOT_STARTED; }
// public void NOT_STARTED(char value) { wrapperContained.NOT_STARTED = value; }
// public char RUNNING() { return wrapperContained.RUNNING; }
// public void RUNNING(char value) { wrapperContained.RUNNING = value; }
// public char PASS() { return wrapperContained.PASS; }
// public void PASS(char value) { wrapperContained.PASS = value; }
// public char OPTIONAL_FAIL() { return wrapperContained.OPTIONAL_FAIL; }
// public void OPTIONAL_FAIL(char value) { wrapperContained.OPTIONAL_FAIL = value; }
// public char REQUIRED_FAIL() { return wrapperContained.REQUIRED_FAIL; }
// public void REQUIRED_FAIL(char value) { wrapperContained.REQUIRED_FAIL = value; }
public TestSet(java.util.Collection tests) { this.wrapperContained = new net.minecraft.test.TestSet(tests); }
public int getFailedRequiredTestCount() { return wrapperContained.getFailedRequiredTestCount(); }
public void add(yarnwrap.test.GameTestState test) { wrapperContained.add(test.wrapperContained); }
public void addListener(yarnwrap.test.TestListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public void method_22232(yarnwrap.test.TestListener test) { wrapperContained.method_22232(test.wrapperContained); }
// public void method_22233(java.lang.StringBuffer test) { wrapperContained.method_22233(test); }
public int getFailedOptionalTestCount() { return wrapperContained.getFailedOptionalTestCount(); }
public int getCompletedTestCount() { return wrapperContained.getCompletedTestCount(); }
public boolean failed() { return wrapperContained.failed(); }
public boolean hasFailedOptionalTests() { return wrapperContained.hasFailedOptionalTests(); }
public int getTestCount() { return wrapperContained.getTestCount(); }
public boolean isDone() { return wrapperContained.isDone(); }
public java.lang.String getResultString() { return wrapperContained.getResultString(); }
public void addListener(java.util.function.Consumer onFailed) { wrapperContained.addListener(onFailed); }
public java.util.Collection getRequiredTests() { return wrapperContained.getRequiredTests(); }
public java.util.Collection getOptionalTests() { return wrapperContained.getOptionalTests(); }
public void remove(yarnwrap.test.GameTestState state) { wrapperContained.remove(state.wrapperContained); }

}