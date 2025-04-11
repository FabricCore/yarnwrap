package yarnwrap.test;
public class TestRunContext { public net.minecraft.test.TestRunContext wrapperContained; public TestRunContext(net.minecraft.test.TestRunContext wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_TESTS_PER_ROW() { return wrapperContained.DEFAULT_TESTS_PER_ROW; }
// public void DEFAULT_TESTS_PER_ROW(int value) { wrapperContained.DEFAULT_TESTS_PER_ROW = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.test.TestManager manager() { return new yarnwrap.test.TestManager(wrapperContained.manager); }
// public void manager(yarnwrap.test.TestManager value) { wrapperContained.manager = value.wrapperContained; }
// public java.util.List states() { return wrapperContained.states; }
// public void states(java.util.List value) { wrapperContained.states = value; }
// public com.google.common.collect.ImmutableList batches() { return wrapperContained.batches; }
// public void batches(com.google.common.collect.ImmutableList value) { wrapperContained.batches = value; }
// public java.util.List batchListeners() { return wrapperContained.batchListeners; }
// public void batchListeners(java.util.List value) { wrapperContained.batchListeners = value; }
// public java.util.List toBeRetried() { return wrapperContained.toBeRetried; }
// public void toBeRetried(java.util.List value) { wrapperContained.toBeRetried = value; }
// public Object batcher() { return wrapperContained.batcher; }
// // public void batcher(Object value) { wrapperContained.batcher = value; }
// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public yarnwrap.test.GameTestBatch currentBatch() { return new yarnwrap.test.GameTestBatch(wrapperContained.currentBatch); }
// public void currentBatch(yarnwrap.test.GameTestBatch value) { wrapperContained.currentBatch = value.wrapperContained; }
// public Object reuseSpawner() { return wrapperContained.reuseSpawner; }
// // public void reuseSpawner(Object value) { wrapperContained.reuseSpawner = value; }
// public Object initialSpawner() { return wrapperContained.initialSpawner; }
// // public void initialSpawner(Object value) { wrapperContained.initialSpawner = value; }
// public boolean stopAfterFailure() { return wrapperContained.stopAfterFailure; }
// public void stopAfterFailure(boolean value) { wrapperContained.stopAfterFailure = value; }
// public TestRunContext(Object batcher,java.util.Collection batches,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestManager manager,Object reuseSpawner,Object initialSpawner,boolean stopAfterFailure) { this.wrapperContained = new net.minecraft.test.TestRunContext(batcher,batches,world.wrapperContained,manager.wrapperContained,reuseSpawner,initialSpawner,stopAfterFailure); }
public void clearDebugMarkers(yarnwrap.server.world.ServerWorld world) { wrapperContained.clearDebugMarkers(world.wrapperContained); }
public java.util.List getStates() { return wrapperContained.getStates(); }
// public void runBatch(int batchIndex) { wrapperContained.runBatch(batchIndex); }
// public java.util.Collection prepareStructures(java.util.Collection oldStates) { return wrapperContained.prepareStructures(oldStates); }
// public java.util.stream.Stream method_56222(yarnwrap.test.GameTestBatch batch) { return wrapperContained.method_56222(batch.wrapperContained); }
public void addBatchListener(yarnwrap.test.BatchListener batchListener) { wrapperContained.addBatchListener(batchListener.wrapperContained); }
public void retry(yarnwrap.test.GameTestState state) { wrapperContained.retry(state.wrapperContained); }
// public void method_56225(yarnwrap.test.GameTestState listener) { wrapperContained.method_56225(listener.wrapperContained); }
public void start() { wrapperContained.start(); }
// public void method_56227(yarnwrap.test.BatchListener listener) { wrapperContained.method_56227(listener.wrapperContained); }
// public java.util.Optional prepareStructure(yarnwrap.test.GameTestState oldState) { return wrapperContained.prepareStructure(oldState.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public void method_56230(yarnwrap.test.GameTestState state) { wrapperContained.method_56230(state.wrapperContained); }
// public void onFinish() { wrapperContained.onFinish(); }
// public java.lang.String method_57072(yarnwrap.test.GameTestState state) { return wrapperContained.method_57072(state.wrapperContained); }

}