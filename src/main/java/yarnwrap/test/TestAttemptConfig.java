package yarnwrap.test;
public class TestAttemptConfig { public net.minecraft.test.TestAttemptConfig wrapperContained; public TestAttemptConfig(net.minecraft.test.TestAttemptConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestAttemptConfig ONCE() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.ONCE); }
// public void ONCE(yarnwrap.test.TestAttemptConfig value) { wrapperContained.ONCE = value.wrapperContained; }
// public static yarnwrap.test.TestAttemptConfig ONCE() { return new yarnwrap.test.TestAttemptConfig(net.minecraft.test.TestAttemptConfig.ONCE); }
// public static void ONCE(yarnwrap.test.TestAttemptConfig value, ) { net.minecraft.test.TestAttemptConfig.ONCE = value.wrapperContained; }

// public yarnwrap.test.TestAttemptConfig once() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.once()); }
public static yarnwrap.test.TestAttemptConfig once() { return new yarnwrap.test.TestAttemptConfig(net.minecraft.test.TestAttemptConfig.once()); }
public boolean shouldTestAgain(int attempt,int successes) { return wrapperContained.shouldTestAgain(attempt,successes); }
// public static boolean shouldTestAgain(int attempt,int successes, ) { return net.minecraft.test.TestAttemptConfig.shouldTestAgain(attempt,successes); }
public boolean isDisabled() { return wrapperContained.isDisabled(); }
// public static boolean isDisabled() { return net.minecraft.test.TestAttemptConfig.isDisabled(); }
public boolean needsMultipleAttempts() { return wrapperContained.needsMultipleAttempts(); }
// public static boolean needsMultipleAttempts() { return net.minecraft.test.TestAttemptConfig.needsMultipleAttempts(); }

}