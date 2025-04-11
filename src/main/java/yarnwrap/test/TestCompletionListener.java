package yarnwrap.test;
public class TestCompletionListener { public net.minecraft.test.TestCompletionListener wrapperContained; public TestCompletionListener(net.minecraft.test.TestCompletionListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onTestFailed(yarnwrap.test.GameTestState test) { wrapperContained.onTestFailed(test.wrapperContained); }
public void onTestPassed(yarnwrap.test.GameTestState test) { wrapperContained.onTestPassed(test.wrapperContained); }
public void onStopped() { wrapperContained.onStopped(); }

}