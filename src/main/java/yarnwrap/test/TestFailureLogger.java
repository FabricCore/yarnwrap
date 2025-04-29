package yarnwrap.test;
public class TestFailureLogger { public net.minecraft.test.TestFailureLogger wrapperContained; public TestFailureLogger(net.minecraft.test.TestFailureLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestCompletionListener completionListener() { return new yarnwrap.test.TestCompletionListener(wrapperContained.completionListener); }
// public void completionListener(yarnwrap.test.TestCompletionListener value) { wrapperContained.completionListener = value.wrapperContained; }
// public static yarnwrap.test.TestCompletionListener completionListener() { return new yarnwrap.test.TestCompletionListener(net.minecraft.test.TestFailureLogger.completionListener); }
// public static void completionListener(yarnwrap.test.TestCompletionListener value, ) { net.minecraft.test.TestFailureLogger.completionListener = value.wrapperContained; }

// public void failTest(yarnwrap.test.GameTestState test) { wrapperContained.failTest(test.wrapperContained); }
// public static void failTest(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestFailureLogger.failTest(test.wrapperContained); }
// public void passTest(yarnwrap.test.GameTestState test) { wrapperContained.passTest(test.wrapperContained); }
// public static void passTest(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestFailureLogger.passTest(test.wrapperContained); }
// public void stop() { wrapperContained.stop(); }
public static void stop() { net.minecraft.test.TestFailureLogger.stop(); }
// public void setCompletionListener(yarnwrap.test.TestCompletionListener listener) { wrapperContained.setCompletionListener(listener.wrapperContained); }
// public static void setCompletionListener(yarnwrap.test.TestCompletionListener listener, ) { net.minecraft.test.TestFailureLogger.setCompletionListener(listener.wrapperContained); }

}