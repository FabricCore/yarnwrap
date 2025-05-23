package yarnwrap.test;
public class TestRunContext { public net.minecraft.test.TestRunContext wrapperContained; public TestRunContext(net.minecraft.test.TestRunContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_TESTS_PER_ROW() { return wrapperContained.DEFAULT_TESTS_PER_ROW; }
// public void DEFAULT_TESTS_PER_ROW(int value) { wrapperContained.DEFAULT_TESTS_PER_ROW = value; }
public static int DEFAULT_TESTS_PER_ROW() { return net.minecraft.test.TestRunContext.DEFAULT_TESTS_PER_ROW; }
// public static void DEFAULT_TESTS_PER_ROW(int value, ) { net.minecraft.test.TestRunContext.DEFAULT_TESTS_PER_ROW = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.test.TestRunContext.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.test.TestRunContext.LOGGER = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.test.TestRunContext.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.test.TestRunContext.world = value.wrapperContained; }

// public yarnwrap.test.TestManager manager() { return new yarnwrap.test.TestManager(wrapperContained.manager); }
// public void manager(yarnwrap.test.TestManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.test.TestManager manager() { return new yarnwrap.test.TestManager(net.minecraft.test.TestRunContext.manager); }
// public static void manager(yarnwrap.test.TestManager value, ) { net.minecraft.test.TestRunContext.manager = value.wrapperContained; }

// public java.util.List states() { return wrapperContained.states; }
// public void states(java.util.List value) { wrapperContained.states = value; }
// public static java.util.List states() { return net.minecraft.test.TestRunContext.states; }
// public static void states(java.util.List value, ) { net.minecraft.test.TestRunContext.states = value; }

// public com.google.common.collect.ImmutableList batches() { return wrapperContained.batches; }
// public void batches(com.google.common.collect.ImmutableList value) { wrapperContained.batches = value; }
// public static com.google.common.collect.ImmutableList batches() { return net.minecraft.test.TestRunContext.batches; }
// public static void batches(com.google.common.collect.ImmutableList value, ) { net.minecraft.test.TestRunContext.batches = value; }

// public java.util.List batchListeners() { return wrapperContained.batchListeners; }
// public void batchListeners(java.util.List value) { wrapperContained.batchListeners = value; }
// public static java.util.List batchListeners() { return net.minecraft.test.TestRunContext.batchListeners; }
// public static void batchListeners(java.util.List value, ) { net.minecraft.test.TestRunContext.batchListeners = value; }

// public java.util.List toBeRetried() { return wrapperContained.toBeRetried; }
// public void toBeRetried(java.util.List value) { wrapperContained.toBeRetried = value; }
// public static java.util.List toBeRetried() { return net.minecraft.test.TestRunContext.toBeRetried; }
// public static void toBeRetried(java.util.List value, ) { net.minecraft.test.TestRunContext.toBeRetried = value; }

// public Object batcher() { return wrapperContained.batcher; }
// // public void batcher(Object value) { wrapperContained.batcher = value; }
// // public static Object batcher() { return net.minecraft.test.TestRunContext.batcher; }
// // public static void batcher(Object value, ) { net.minecraft.test.TestRunContext.batcher = value; }

// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public static boolean stopped() { return net.minecraft.test.TestRunContext.stopped; }
// public static void stopped(boolean value, ) { net.minecraft.test.TestRunContext.stopped = value; }

// public Object reuseSpawner() { return wrapperContained.reuseSpawner; }
// // public void reuseSpawner(Object value) { wrapperContained.reuseSpawner = value; }
// // public static Object reuseSpawner() { return net.minecraft.test.TestRunContext.reuseSpawner; }
// // public static void reuseSpawner(Object value, ) { net.minecraft.test.TestRunContext.reuseSpawner = value; }

// public Object initialSpawner() { return wrapperContained.initialSpawner; }
// // public void initialSpawner(Object value) { wrapperContained.initialSpawner = value; }
// // public static Object initialSpawner() { return net.minecraft.test.TestRunContext.initialSpawner; }
// // public static void initialSpawner(Object value, ) { net.minecraft.test.TestRunContext.initialSpawner = value; }

// public boolean stopAfterFailure() { return wrapperContained.stopAfterFailure; }
// public void stopAfterFailure(boolean value) { wrapperContained.stopAfterFailure = value; }
// public static boolean stopAfterFailure() { return net.minecraft.test.TestRunContext.stopAfterFailure; }
// public static void stopAfterFailure(boolean value, ) { net.minecraft.test.TestRunContext.stopAfterFailure = value; }

// public yarnwrap.registry.entry.RegistryEntry environment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.environment); }
// public void environment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.environment = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry environment() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.test.TestRunContext.environment); }
// public static void environment(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.test.TestRunContext.environment = value.wrapperContained; }

// public TestRunContext(Object batcher,java.util.Collection batches,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestManager manager,Object reuseSpawner,Object initialSpawner,boolean stopAfterFailure) { this.wrapperContained = new net.minecraft.test.TestRunContext(batcher,batches,world.wrapperContained,manager.wrapperContained,reuseSpawner,initialSpawner,stopAfterFailure); }
// public void clearDebugMarkers(yarnwrap.server.world.ServerWorld world) { wrapperContained.clearDebugMarkers(world.wrapperContained); }
// public static void clearDebugMarkers(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestRunContext.clearDebugMarkers(world.wrapperContained); }
public java.util.List getStates() { return wrapperContained.getStates(); }
// public static java.util.List getStates() { return net.minecraft.test.TestRunContext.getStates(); }
// public void runBatch(int batchIndex) { wrapperContained.runBatch(batchIndex); }
// public static void runBatch(int batchIndex, ) { net.minecraft.test.TestRunContext.runBatch(batchIndex); }
// public java.util.Collection prepareStructures(java.util.Collection oldStates) { return wrapperContained.prepareStructures(oldStates); }
// public static java.util.Collection prepareStructures(java.util.Collection oldStates, ) { return net.minecraft.test.TestRunContext.prepareStructures(oldStates); }
// public java.util.stream.Stream method_56222(yarnwrap.test.GameTestBatch batch) { return wrapperContained.method_56222(batch.wrapperContained); }
// public static java.util.stream.Stream method_56222(yarnwrap.test.GameTestBatch batch, ) { return net.minecraft.test.TestRunContext.method_56222(batch.wrapperContained); }
public void addBatchListener(yarnwrap.test.BatchListener batchListener) { wrapperContained.addBatchListener(batchListener.wrapperContained); }
// public static void addBatchListener(yarnwrap.test.BatchListener batchListener, ) { net.minecraft.test.TestRunContext.addBatchListener(batchListener.wrapperContained); }
public void retry(yarnwrap.test.GameTestState state) { wrapperContained.retry(state.wrapperContained); }
// public static void retry(yarnwrap.test.GameTestState state, ) { net.minecraft.test.TestRunContext.retry(state.wrapperContained); }
// public void method_56225(yarnwrap.test.GameTestState listener) { wrapperContained.method_56225(listener.wrapperContained); }
// public static void method_56225(yarnwrap.test.GameTestState listener, ) { net.minecraft.test.TestRunContext.method_56225(listener.wrapperContained); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.test.TestRunContext.start(); }
// public void method_56227(yarnwrap.test.GameTestBatch listener) { wrapperContained.method_56227(listener.wrapperContained); }
// public static void method_56227(yarnwrap.test.GameTestBatch listener, ) { net.minecraft.test.TestRunContext.method_56227(listener.wrapperContained); }
// public java.util.Optional prepareStructure(yarnwrap.test.GameTestState oldState) { return wrapperContained.prepareStructure(oldState.wrapperContained); }
// public static java.util.Optional prepareStructure(yarnwrap.test.GameTestState oldState, ) { return net.minecraft.test.TestRunContext.prepareStructure(oldState.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.test.TestRunContext.clear(); }
// public void method_56230(yarnwrap.test.GameTestState state) { wrapperContained.method_56230(state.wrapperContained); }
// public static void method_56230(yarnwrap.test.GameTestState state, ) { net.minecraft.test.TestRunContext.method_56230(state.wrapperContained); }
// public void onFinish() { wrapperContained.onFinish(); }
// public static void onFinish() { net.minecraft.test.TestRunContext.onFinish(); }
// public java.lang.String method_57072(yarnwrap.test.GameTestState state) { return wrapperContained.method_57072(state.wrapperContained); }
// public static java.lang.String method_57072(yarnwrap.test.GameTestState state, ) { return net.minecraft.test.TestRunContext.method_57072(state.wrapperContained); }
// public void clearEnvironment() { wrapperContained.clearEnvironment(); }
// public static void clearEnvironment() { net.minecraft.test.TestRunContext.clearEnvironment(); }

}