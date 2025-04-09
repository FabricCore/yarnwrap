package yarnwrap.test;
public class GameTestState { public net.minecraft.test.GameTestState wrapperContained; public GameTestState(net.minecraft.test.GameTestState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestFunction testFunction() { return new yarnwrap.test.TestFunction(wrapperContained.testFunction); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public java.util.Collection listeners() { return wrapperContained.listeners; }
// public int tickLimit() { return wrapperContained.tickLimit; }
// public boolean started() { return wrapperContained.started; }
// public boolean completed() { return wrapperContained.completed; }
// public java.lang.Throwable throwable() { return wrapperContained.throwable; }
// public java.util.Collection timedTaskRunners() { return wrapperContained.timedTaskRunners; }
// public it.unimi.dsi.fastutil.objects.Object2LongMap ticksByRunnables() { return wrapperContained.ticksByRunnables; }
// public long startTime() { return wrapperContained.startTime; }
// public long tick() { return wrapperContained.tick; }
// public com.google.common.base.Stopwatch stopwatch() { return wrapperContained.stopwatch; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public yarnwrap.block.entity.StructureBlockBlockEntity structureBlockEntity() { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.structureBlockEntity); }
// public int initialDelay() { return wrapperContained.initialDelay; }
// public boolean initialized() { return wrapperContained.initialized; }
// public boolean tickedOnce() { return wrapperContained.tickedOnce; }
// public yarnwrap.util.math.BlockPos boxMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.boxMinPos); }
// public yarnwrap.test.TestAttemptConfig testAttemptConfig() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.testAttemptConfig); }
public void tick(yarnwrap.test.TestRunContext context) { wrapperContained.tick(context.wrapperContained); }
public yarnwrap.test.GameTestState init() { return new yarnwrap.test.GameTestState(wrapperContained.init()); }
public void addListener(yarnwrap.test.TestListener listener) { wrapperContained.addListener(listener.wrapperContained); }
public void fail(java.lang.Throwable throwable) { wrapperContained.fail(throwable); }
public java.lang.String getTemplatePath() { return wrapperContained.getTemplatePath(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public boolean isPassed() { return wrapperContained.isPassed(); }
public boolean isFailed() { return wrapperContained.isFailed(); }
public boolean isStarted() { return wrapperContained.isStarted(); }
public boolean isCompleted() { return wrapperContained.isCompleted(); }
public java.lang.Throwable getThrowable() { return wrapperContained.getThrowable(); }
public boolean isRequired() { return wrapperContained.isRequired(); }
public boolean isOptional() { return wrapperContained.isOptional(); }
public yarnwrap.test.GameTestState startCountdown(int additionalExpectedStopTime) { return new yarnwrap.test.GameTestState(wrapperContained.startCountdown(additionalExpectedStopTime)); }
// public void setPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setPos(pos.wrapperContained); }
public java.lang.String getTemplateName() { return wrapperContained.getTemplateName(); }
// public void start() { wrapperContained.start(); }
// public void complete() { wrapperContained.complete(); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
public yarnwrap.test.TestFunction getTestFunction() { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunction()); }
public boolean isFlaky() { return wrapperContained.isFlaky(); }
public int getMaxAttempts() { return wrapperContained.getMaxAttempts(); }
public int getRequiredSuccesses() { return wrapperContained.getRequiredSuccesses(); }
// public void tickTests() { wrapperContained.tickTests(); }
public yarnwrap.block.entity.StructureBlockBlockEntity getStructureBlockBlockEntity() { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.getStructureBlockBlockEntity()); }
public void runAtTick(long tick,java.lang.Runnable runnable) { wrapperContained.runAtTick(tick,runnable); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
public long getElapsedMilliseconds() { return wrapperContained.getElapsedMilliseconds(); }
public void completeIfSuccessful() { wrapperContained.completeIfSuccessful(); }
// public long getTick() { return wrapperContained.getTick(); }
// public yarnwrap.test.TimedTaskRunner createTimedTaskRunner() { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createTimedTaskRunner()); }
public int getTickLimit() { return wrapperContained.getTickLimit(); }
public java.util.stream.Stream streamListeners() { return wrapperContained.streamListeners(); }
public yarnwrap.test.GameTestState copy() { return new yarnwrap.test.GameTestState(wrapperContained.copy()); }
// public boolean initialize() { return wrapperContained.initialize(); }
// public yarnwrap.util.math.BlockPos getBoxMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBoxMinPos()); }
public yarnwrap.test.GameTestState initializeImmediately() { return new yarnwrap.test.GameTestState(wrapperContained.initializeImmediately()); }
public void setBoxMinPos(yarnwrap.util.math.BlockPos boxMinPos) { wrapperContained.setBoxMinPos(boxMinPos.wrapperContained); }
public yarnwrap.test.TestAttemptConfig getTestAttemptConfig() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.getTestAttemptConfig()); }

}