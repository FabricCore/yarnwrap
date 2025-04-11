package yarnwrap.test;
public class TimedTaskRunner { public net.minecraft.test.TimedTaskRunner wrapperContained; public TimedTaskRunner(net.minecraft.test.TimedTaskRunner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.GameTestState test() { return new yarnwrap.test.GameTestState(wrapperContained.test); }
// public void test(yarnwrap.test.GameTestState value) { wrapperContained.test = value.wrapperContained; }
// public java.util.List tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.List value) { wrapperContained.tasks = value; }
// public long tick() { return wrapperContained.tick; }
// public void tick(long value) { wrapperContained.tick = value; }
public void runSilently(long tick) { wrapperContained.runSilently(tick); }
public void runReported(long tick) { wrapperContained.runReported(tick); }
// public void runTasks(long tick) { wrapperContained.runTasks(tick); }
public void completeIfSuccessful() { wrapperContained.completeIfSuccessful(); }
public yarnwrap.test.TimedTaskRunner expectMinDuration(int minDuration) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDuration(minDuration)); }
public yarnwrap.test.TimedTaskRunner expectMinDurationAndRun(int minDuration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDurationAndRun(minDuration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAdd(long duration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAdd(duration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAdd(java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAdd(task)); }
public void fail(java.util.function.Supplier exceptionSupplier) { wrapperContained.fail(exceptionSupplier); }
public Object createAndAddTrigger() { return wrapperContained.createAndAddTrigger(); }
public yarnwrap.test.TimedTaskRunner expectMinDurationOrRun(int minDuration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDurationOrRun(minDuration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAddReported(java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAddReported(task)); }
// public void tryRun(java.lang.Runnable task) { wrapperContained.tryRun(task); }

}