package yarnwrap.test;
public class TestFailureLogger { public net.minecraft.test.TestFailureLogger wrapperContained; public TestFailureLogger(net.minecraft.test.TestFailureLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestCompletionListener completionListener() { return new yarnwrap.test.TestCompletionListener(wrapperContained.completionListener); }
public void failTest(yarnwrap.test.GameTestState test) { wrapperContained.failTest(test.wrapperContained); }
public void passTest(yarnwrap.test.GameTestState test) { wrapperContained.passTest(test.wrapperContained); }
public void stop() { wrapperContained.stop(); }
public void setCompletionListener(yarnwrap.test.TestCompletionListener listener) { wrapperContained.setCompletionListener(listener.wrapperContained); }

}