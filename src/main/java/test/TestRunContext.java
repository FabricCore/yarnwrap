package yarnwrap.test;
public class TestRunContext { public net.minecraft.test.TestRunContext wrapperContained; public TestRunContext(net.minecraft.test.TestRunContext wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_TESTS_PER_ROW() { return wrapperContained.DEFAULT_TESTS_PER_ROW; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.test.TestManager manager() { return new yarnwrap.test.TestManager(wrapperContained.manager); }
// public java.util.List states() { return wrapperContained.states; }
// public com.google.common.collect.ImmutableList batches() { return wrapperContained.batches; }
// public java.util.List batchListeners() { return wrapperContained.batchListeners; }
// public java.util.List toBeRetried() { return wrapperContained.toBeRetried; }
// public Object batcher() { return wrapperContained.batcher; }
// public boolean stopped() { return wrapperContained.stopped; }
// public yarnwrap.test.GameTestBatch currentBatch() { return new yarnwrap.test.GameTestBatch(wrapperContained.currentBatch); }
// public Object reuseSpawner() { return wrapperContained.reuseSpawner; }
// public Object initialSpawner() { return wrapperContained.initialSpawner; }
// public boolean stopAfterFailure() { return wrapperContained.stopAfterFailure; }
public void clearDebugMarkers(yarnwrap.server.world.ServerWorld world) { wrapperContained.clearDebugMarkers(world.wrapperContained); }
public java.util.List getStates() { return wrapperContained.getStates(); }
// public void runBatch(int batchIndex) { wrapperContained.runBatch(batchIndex); }
// public java.util.Collection prepareStructures(java.util.Collection oldStates) { return wrapperContained.prepareStructures(oldStates); }
public void addBatchListener(yarnwrap.test.BatchListener batchListener) { wrapperContained.addBatchListener(batchListener.wrapperContained); }
public void retry(yarnwrap.test.GameTestState state) { wrapperContained.retry(state.wrapperContained); }
public void start() { wrapperContained.start(); }
// public java.util.Optional prepareStructure(yarnwrap.test.GameTestState oldState) { return wrapperContained.prepareStructure(oldState.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public void onFinish() { wrapperContained.onFinish(); }

}