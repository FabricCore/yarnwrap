package yarnwrap.test;
public class TestCompletionListener { public net.minecraft.test.TestCompletionListener wrapperContained; public TestCompletionListener(net.minecraft.test.TestCompletionListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onTestFailed(yarnwrap.test.GameTestState test) { wrapperContained.onTestFailed(test.wrapperContained); }
// public static void onTestFailed(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestCompletionListener.onTestFailed(test.wrapperContained); }
public void onTestPassed(yarnwrap.test.GameTestState test) { wrapperContained.onTestPassed(test.wrapperContained); }
// public static void onTestPassed(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestCompletionListener.onTestPassed(test.wrapperContained); }
public void onStopped() { wrapperContained.onStopped(); }
// public static void onStopped() { net.minecraft.test.TestCompletionListener.onStopped(); }

}