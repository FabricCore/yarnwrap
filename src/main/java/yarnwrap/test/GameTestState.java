package yarnwrap.test;
public class GameTestState { public net.minecraft.test.GameTestState wrapperContained; public GameTestState(net.minecraft.test.GameTestState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestFunction testFunction() { return new yarnwrap.test.TestFunction(wrapperContained.testFunction); }
// public void testFunction(yarnwrap.test.TestFunction value) { wrapperContained.testFunction = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.util.Collection listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.Collection value) { wrapperContained.listeners = value; }
// public int tickLimit() { return wrapperContained.tickLimit; }
// public void tickLimit(int value) { wrapperContained.tickLimit = value; }
// public boolean started() { return wrapperContained.started; }
// public void started(boolean value) { wrapperContained.started = value; }
// public boolean completed() { return wrapperContained.completed; }
// public void completed(boolean value) { wrapperContained.completed = value; }
// public java.lang.Throwable throwable() { return wrapperContained.throwable; }
// public void throwable(java.lang.Throwable value) { wrapperContained.throwable = value; }
// public java.util.Collection timedTaskRunners() { return wrapperContained.timedTaskRunners; }
// public void timedTaskRunners(java.util.Collection value) { wrapperContained.timedTaskRunners = value; }
// public it.unimi.dsi.fastutil.objects.Object2LongMap ticksByRunnables() { return wrapperContained.ticksByRunnables; }
// public void ticksByRunnables(it.unimi.dsi.fastutil.objects.Object2LongMap value) { wrapperContained.ticksByRunnables = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public long tick() { return wrapperContained.tick; }
// public void tick(long value) { wrapperContained.tick = value; }
// public com.google.common.base.Stopwatch stopwatch() { return wrapperContained.stopwatch; }
// public void stopwatch(com.google.common.base.Stopwatch value) { wrapperContained.stopwatch = value; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public yarnwrap.block.entity.StructureBlockBlockEntity structureBlockEntity() { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.structureBlockEntity); }
// public void structureBlockEntity(yarnwrap.block.entity.StructureBlockBlockEntity value) { wrapperContained.structureBlockEntity = value.wrapperContained; }
// public int initialDelay() { return wrapperContained.initialDelay; }
// public void initialDelay(int value) { wrapperContained.initialDelay = value; }
// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public boolean tickedOnce() { return wrapperContained.tickedOnce; }
// public void tickedOnce(boolean value) { wrapperContained.tickedOnce = value; }
// public yarnwrap.util.math.BlockPos boxMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.boxMinPos); }
// public void boxMinPos(yarnwrap.util.math.BlockPos value) { wrapperContained.boxMinPos = value.wrapperContained; }
// public yarnwrap.test.TestAttemptConfig testAttemptConfig() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.testAttemptConfig); }
// public void testAttemptConfig(yarnwrap.test.TestAttemptConfig value) { wrapperContained.testAttemptConfig = value.wrapperContained; }
public GameTestState(yarnwrap.test.TestFunction testFunction,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestAttemptConfig testAttemptConfig) { this.wrapperContained = new net.minecraft.test.GameTestState(testFunction.wrapperContained,rotation.wrapperContained,world.wrapperContained,testAttemptConfig.wrapperContained); }
public void tick(yarnwrap.test.TestRunContext context) { wrapperContained.tick(context.wrapperContained); }
public yarnwrap.test.GameTestState init() { return new yarnwrap.test.GameTestState(wrapperContained.init()); }
public void addListener(yarnwrap.test.TestListener listener) { wrapperContained.addListener(listener.wrapperContained); }
public void fail(java.lang.Throwable throwable) { wrapperContained.fail(throwable); }
public java.lang.String getTemplatePath() { return wrapperContained.getTemplatePath(); }
// public void method_22171(yarnwrap.test.TestRunContext listener) { wrapperContained.method_22171(listener.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public void method_22175(yarnwrap.test.TestListener listener) { wrapperContained.method_22175(listener.wrapperContained); }
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
// public void method_23636(yarnwrap.test.TimedTaskRunner runner) { wrapperContained.method_23636(runner.wrapperContained); }
// public void method_23637(yarnwrap.test.TimedTaskRunner runner) { wrapperContained.method_23637(runner.wrapperContained); }
public java.lang.String getTemplateName() { return wrapperContained.getTemplateName(); }
// public void start() { wrapperContained.start(); }
// public void complete() { wrapperContained.complete(); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
public yarnwrap.test.TestFunction getTestFunction() { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunction()); }
public boolean isFlaky() { return wrapperContained.isFlaky(); }
public int getMaxAttempts() { return wrapperContained.getMaxAttempts(); }
public int getRequiredSuccesses() { return wrapperContained.getRequiredSuccesses(); }
// public void tickTests() { wrapperContained.tickTests(); }
// public void method_33316(yarnwrap.test.TestRunContext listener) { wrapperContained.method_33316(listener.wrapperContained); }
public yarnwrap.block.entity.StructureBlockBlockEntity getStructureBlockBlockEntity() { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.getStructureBlockBlockEntity()); }
public void runAtTick(long tick,java.lang.Runnable runnable) { wrapperContained.runAtTick(tick,runnable); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
public long getElapsedMilliseconds() { return wrapperContained.getElapsedMilliseconds(); }
public void completeIfSuccessful() { wrapperContained.completeIfSuccessful(); }
// public long getTick() { return wrapperContained.getTick(); }
// public yarnwrap.test.TimedTaskRunner createTimedTaskRunner() { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createTimedTaskRunner()); }
public int getTickLimit() { return wrapperContained.getTickLimit(); }
// public void method_54434(yarnwrap.entity.Entity entity) { wrapperContained.method_54434(entity.wrapperContained); }
// public boolean method_54435(yarnwrap.entity.Entity entity) { return wrapperContained.method_54435(entity.wrapperContained); }
// public boolean method_54900(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.method_54900(chunkPos.wrapperContained); }
public java.util.stream.Stream streamListeners() { return wrapperContained.streamListeners(); }
public yarnwrap.test.GameTestState copy() { return new yarnwrap.test.GameTestState(wrapperContained.copy()); }
// public boolean initialize() { return wrapperContained.initialize(); }
// public yarnwrap.util.math.BlockPos getBoxMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBoxMinPos()); }
public yarnwrap.test.GameTestState initializeImmediately() { return new yarnwrap.test.GameTestState(wrapperContained.initializeImmediately()); }
public void setBoxMinPos(yarnwrap.util.math.BlockPos boxMinPos) { wrapperContained.setBoxMinPos(boxMinPos.wrapperContained); }
public yarnwrap.test.TestAttemptConfig getTestAttemptConfig() { return new yarnwrap.test.TestAttemptConfig(wrapperContained.getTestAttemptConfig()); }

}