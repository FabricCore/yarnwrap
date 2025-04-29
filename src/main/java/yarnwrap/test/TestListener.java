package yarnwrap.test;
public class TestListener { public net.minecraft.test.TestListener wrapperContained; public TestListener(net.minecraft.test.TestListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onStarted(yarnwrap.test.GameTestState test) { wrapperContained.onStarted(test.wrapperContained); }
// public static void onStarted(yarnwrap.test.GameTestState test, ) { net.minecraft.test.TestListener.onStarted(test.wrapperContained); }
public void onFailed(yarnwrap.test.GameTestState test,yarnwrap.test.TestRunContext context) { wrapperContained.onFailed(test.wrapperContained,context.wrapperContained); }
// public static void onFailed(yarnwrap.test.GameTestState test,yarnwrap.test.TestRunContext context, ) { net.minecraft.test.TestListener.onFailed(test.wrapperContained,context.wrapperContained); }
public void onPassed(yarnwrap.test.GameTestState test,yarnwrap.test.TestRunContext context) { wrapperContained.onPassed(test.wrapperContained,context.wrapperContained); }
// public static void onPassed(yarnwrap.test.GameTestState test,yarnwrap.test.TestRunContext context, ) { net.minecraft.test.TestListener.onPassed(test.wrapperContained,context.wrapperContained); }
public void onRetry(yarnwrap.test.GameTestState prevState,yarnwrap.test.GameTestState nextState,yarnwrap.test.TestRunContext context) { wrapperContained.onRetry(prevState.wrapperContained,nextState.wrapperContained,context.wrapperContained); }
// public static void onRetry(yarnwrap.test.GameTestState prevState,yarnwrap.test.GameTestState nextState,yarnwrap.test.TestRunContext context, ) { net.minecraft.test.TestListener.onRetry(prevState.wrapperContained,nextState.wrapperContained,context.wrapperContained); }

}