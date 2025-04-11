package yarnwrap.test;
public class TestAttemptConfig { public net.minecraft.test.TestAttemptConfig wrapperContained; public TestAttemptConfig(net.minecraft.test.TestAttemptConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestAttemptConfig ONCE() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.ONCE); }
// public void ONCE(yarnwrap.test.TestAttemptConfig value) { wrapperContained.ONCE = value.wrapperContained; }
public yarnwrap.test.TestAttemptConfig once() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.once()); }
public boolean shouldTestAgain(int attempt,int successes) { return wrapperContained.shouldTestAgain(attempt,successes); }
public boolean isDisabled() { return wrapperContained.isDisabled(); }
public boolean needsMultipleAttempts() { return wrapperContained.needsMultipleAttempts(); }

}