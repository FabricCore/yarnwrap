package yarnwrap.test;
public class TestSet { public net.minecraft.test.TestSet wrapperContained; public TestSet(net.minecraft.test.TestSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection tests() { return wrapperContained.tests; }
// public java.util.Collection listeners() { return wrapperContained.listeners; }
// public char NOT_STARTED() { return wrapperContained.NOT_STARTED; }
// public char RUNNING() { return wrapperContained.RUNNING; }
// public char PASS() { return wrapperContained.PASS; }
// public char OPTIONAL_FAIL() { return wrapperContained.OPTIONAL_FAIL; }
// public char REQUIRED_FAIL() { return wrapperContained.REQUIRED_FAIL; }
public int getFailedRequiredTestCount() { return wrapperContained.getFailedRequiredTestCount(); }
public void add(yarnwrap.test.GameTestState test) { wrapperContained.add(test.wrapperContained); }
public void addListener(yarnwrap.test.TestListener listener) { wrapperContained.addListener(listener.wrapperContained); }
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