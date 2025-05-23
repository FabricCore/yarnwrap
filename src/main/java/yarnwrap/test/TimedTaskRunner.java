package yarnwrap.test;
public class TimedTaskRunner { public net.minecraft.test.TimedTaskRunner wrapperContained; public TimedTaskRunner(net.minecraft.test.TimedTaskRunner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.GameTestState test() { return new yarnwrap.test.GameTestState(wrapperContained.test); }
// public void test(yarnwrap.test.GameTestState value) { wrapperContained.test = value.wrapperContained; }
// public static yarnwrap.test.GameTestState test() { return new yarnwrap.test.GameTestState(net.minecraft.test.TimedTaskRunner.test); }
// public static void test(yarnwrap.test.GameTestState value, ) { net.minecraft.test.TimedTaskRunner.test = value.wrapperContained; }

// public java.util.List tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.List value) { wrapperContained.tasks = value; }
// public static java.util.List tasks() { return net.minecraft.test.TimedTaskRunner.tasks; }
// public static void tasks(java.util.List value, ) { net.minecraft.test.TimedTaskRunner.tasks = value; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public static int tick() { return net.minecraft.test.TimedTaskRunner.tick; }
// public static void tick(int value, ) { net.minecraft.test.TimedTaskRunner.tick = value; }

// public TimedTaskRunner(yarnwrap.test.GameTestState gameTest) { this.wrapperContained = new net.minecraft.test.TimedTaskRunner(gameTest.wrapperContained); }
public void runSilently(int tick) { wrapperContained.runSilently(tick); }
// public static void runSilently(int tick, ) { net.minecraft.test.TimedTaskRunner.runSilently(tick); }
public void runReported(int tick) { wrapperContained.runReported(tick); }
// public static void runReported(int tick, ) { net.minecraft.test.TimedTaskRunner.runReported(tick); }
// public void runTasks(int tick) { wrapperContained.runTasks(tick); }
// public static void runTasks(int tick, ) { net.minecraft.test.TimedTaskRunner.runTasks(tick); }
public void completeIfSuccessful() { wrapperContained.completeIfSuccessful(); }
// public static void completeIfSuccessful() { net.minecraft.test.TimedTaskRunner.completeIfSuccessful(); }
public yarnwrap.test.TimedTaskRunner expectMinDuration(int minDuration) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDuration(minDuration)); }
// public static yarnwrap.test.TimedTaskRunner expectMinDuration(int minDuration, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.expectMinDuration(minDuration)); }
public yarnwrap.test.TimedTaskRunner expectMinDurationAndRun(int minDuration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDurationAndRun(minDuration,task)); }
// public static yarnwrap.test.TimedTaskRunner expectMinDurationAndRun(int minDuration,java.lang.Runnable task, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.expectMinDurationAndRun(minDuration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAdd(long duration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAdd(duration,task)); }
// public static yarnwrap.test.TimedTaskRunner createAndAdd(long duration,java.lang.Runnable task, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.createAndAdd(duration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAdd(java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAdd(task)); }
// public static yarnwrap.test.TimedTaskRunner createAndAdd(java.lang.Runnable task, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.createAndAdd(task)); }
public void fail(java.util.function.Supplier exceptionSupplier) { wrapperContained.fail(exceptionSupplier); }
// public static void fail(java.util.function.Supplier exceptionSupplier, ) { net.minecraft.test.TimedTaskRunner.fail(exceptionSupplier); }
public Object createAndAddTrigger() { return wrapperContained.createAndAddTrigger(); }
// public static Object createAndAddTrigger() { return net.minecraft.test.TimedTaskRunner.createAndAddTrigger(); }
public yarnwrap.test.TimedTaskRunner expectMinDurationOrRun(int minDuration,java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.expectMinDurationOrRun(minDuration,task)); }
// public static yarnwrap.test.TimedTaskRunner expectMinDurationOrRun(int minDuration,java.lang.Runnable task, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.expectMinDurationOrRun(minDuration,task)); }
public yarnwrap.test.TimedTaskRunner createAndAddReported(java.lang.Runnable task) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createAndAddReported(task)); }
// public static yarnwrap.test.TimedTaskRunner createAndAddReported(java.lang.Runnable task, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TimedTaskRunner.createAndAddReported(task)); }
// public void tryRun(java.lang.Runnable task) { wrapperContained.tryRun(task); }
// public static void tryRun(java.lang.Runnable task, ) { net.minecraft.test.TimedTaskRunner.tryRun(task); }

}