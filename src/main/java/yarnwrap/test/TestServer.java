package yarnwrap.test;
public class TestServer { public net.minecraft.test.TestServer wrapperContained; public TestServer(net.minecraft.test.TestServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.test.TestServer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.test.TestServer.LOGGER = value; }

// public int RESULT_STRING_LOG_INTERVAL() { return wrapperContained.RESULT_STRING_LOG_INTERVAL; }
// public void RESULT_STRING_LOG_INTERVAL(int value) { wrapperContained.RESULT_STRING_LOG_INTERVAL = value; }
// public static int RESULT_STRING_LOG_INTERVAL() { return net.minecraft.test.TestServer.RESULT_STRING_LOG_INTERVAL; }
// public static void RESULT_STRING_LOG_INTERVAL(int value, ) { net.minecraft.test.TestServer.RESULT_STRING_LOG_INTERVAL = value; }

// public java.util.List batches() { return wrapperContained.batches; }
// public void batches(java.util.List value) { wrapperContained.batches = value; }
// public static java.util.List batches() { return net.minecraft.test.TestServer.batches; }
// public static void batches(java.util.List value, ) { net.minecraft.test.TestServer.batches = value; }

// public yarnwrap.world.gen.GeneratorOptions TEST_LEVEL() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.TEST_LEVEL); }
// public void TEST_LEVEL(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.TEST_LEVEL = value.wrapperContained; }
// public static yarnwrap.world.gen.GeneratorOptions TEST_LEVEL() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.test.TestServer.TEST_LEVEL); }
// public static void TEST_LEVEL(yarnwrap.world.gen.GeneratorOptions value, ) { net.minecraft.test.TestServer.TEST_LEVEL = value.wrapperContained; }

// public yarnwrap.test.TestSet testSet() { return new yarnwrap.test.TestSet(wrapperContained.testSet); }
// public void testSet(yarnwrap.test.TestSet value) { wrapperContained.testSet = value.wrapperContained; }
// public static yarnwrap.test.TestSet testSet() { return new yarnwrap.test.TestSet(net.minecraft.test.TestServer.testSet); }
// public static void testSet(yarnwrap.test.TestSet value, ) { net.minecraft.test.TestServer.testSet = value.wrapperContained; }

// public yarnwrap.util.ApiServices NONE_API_SERVICES() { return new yarnwrap.util.ApiServices(wrapperContained.NONE_API_SERVICES); }
// public void NONE_API_SERVICES(yarnwrap.util.ApiServices value) { wrapperContained.NONE_API_SERVICES = value.wrapperContained; }
// public static yarnwrap.util.ApiServices NONE_API_SERVICES() { return new yarnwrap.util.ApiServices(net.minecraft.test.TestServer.NONE_API_SERVICES); }
// public static void NONE_API_SERVICES(yarnwrap.util.ApiServices value, ) { net.minecraft.test.TestServer.NONE_API_SERVICES = value.wrapperContained; }

// public int TEST_POS_XZ_RANGE() { return wrapperContained.TEST_POS_XZ_RANGE; }
// public void TEST_POS_XZ_RANGE(int value) { wrapperContained.TEST_POS_XZ_RANGE = value; }
// public static int TEST_POS_XZ_RANGE() { return net.minecraft.test.TestServer.TEST_POS_XZ_RANGE; }
// public static void TEST_POS_XZ_RANGE(int value, ) { net.minecraft.test.TestServer.TEST_POS_XZ_RANGE = value; }

// public com.google.common.base.Stopwatch stopwatch() { return wrapperContained.stopwatch; }
// public void stopwatch(com.google.common.base.Stopwatch value) { wrapperContained.stopwatch = value; }
// public static com.google.common.base.Stopwatch stopwatch() { return net.minecraft.test.TestServer.stopwatch; }
// public static void stopwatch(com.google.common.base.Stopwatch value, ) { net.minecraft.test.TestServer.stopwatch = value; }

// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl debugSampleLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.debugSampleLog); }
// public void debugSampleLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.debugSampleLog = value.wrapperContained; }
// public static yarnwrap.util.profiler.MultiValueDebugSampleLogImpl debugSampleLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(net.minecraft.test.TestServer.debugSampleLog); }
// public static void debugSampleLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value, ) { net.minecraft.test.TestServer.debugSampleLog = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureSet ENABLED_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.ENABLED_FEATURES); }
// public void ENABLED_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.ENABLED_FEATURES = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet ENABLED_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.test.TestServer.ENABLED_FEATURES); }
// public static void ENABLED_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.test.TestServer.ENABLED_FEATURES = value.wrapperContained; }

// public java.util.Optional tests() { return wrapperContained.tests; }
// public void tests(java.util.Optional value) { wrapperContained.tests = value; }
// public static java.util.Optional tests() { return net.minecraft.test.TestServer.tests; }
// public static void tests(java.util.Optional value, ) { net.minecraft.test.TestServer.tests = value; }

// public boolean verify() { return wrapperContained.verify; }
// public void verify(boolean value) { wrapperContained.verify = value; }
// public static boolean verify() { return net.minecraft.test.TestServer.verify; }
// public static void verify(boolean value, ) { net.minecraft.test.TestServer.verify = value; }

// public TestServer(java.lang.Thread serverThread,Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,java.util.Optional tests,boolean verify) { this.wrapperContained = new net.minecraft.test.TestServer(serverThread,session,dataPackManager.wrapperContained,saveLoader.wrapperContained,tests,verify); }
// public void runTestBatches(yarnwrap.server.world.ServerWorld world) { wrapperContained.runTestBatches(world.wrapperContained); }
// public static void runTestBatches(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestServer.runTestBatches(world.wrapperContained); }
// public boolean isTesting() { return wrapperContained.isTesting(); }
// public static boolean isTesting() { return net.minecraft.test.TestServer.isTesting(); }
// public Object method_40377(yarnwrap.world.level.LevelInfo context) { return wrapperContained.method_40377(context.wrapperContained); }
// public static Object method_40377(yarnwrap.world.level.LevelInfo context, ) { return net.minecraft.test.TestServer.method_40377(context.wrapperContained); }
// public yarnwrap.test.TestServer create(java.lang.Thread thread,Object session,yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Optional tests,boolean verify) { return new yarnwrap.test.TestServer(wrapperContained.create(thread,session,resourcePackManager.wrapperContained,tests,verify)); }
// public static yarnwrap.test.TestServer create(java.lang.Thread thread,Object session,yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Optional tests,boolean verify, ) { return new yarnwrap.test.TestServer(net.minecraft.test.TestServer.create(thread,session,resourcePackManager.wrapperContained,tests,verify)); }
// public java.util.concurrent.CompletableFuture method_43615(Object executor) { return wrapperContained.method_43615(executor); }
// public static java.util.concurrent.CompletableFuture method_43615(Object executor, ) { return net.minecraft.test.TestServer.method_43615(executor); }
// public boolean method_66983(Object instance) { return wrapperContained.method_66983(instance); }
// public static boolean method_66983(Object instance, ) { return net.minecraft.test.TestServer.method_66983(instance); }
// public java.util.stream.Stream makeVerificationBatches(Object instance,yarnwrap.server.world.ServerWorld world) { return wrapperContained.makeVerificationBatches(instance,world.wrapperContained); }
// public static java.util.stream.Stream makeVerificationBatches(Object instance,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestServer.makeVerificationBatches(instance,world.wrapperContained); }
// public java.util.stream.Stream selectInstances(yarnwrap.registry.DynamicRegistryManager registryManager,java.lang.String selector) { return wrapperContained.selectInstances(registryManager.wrapperContained,selector); }
// public static java.util.stream.Stream selectInstances(yarnwrap.registry.DynamicRegistryManager registryManager,java.lang.String selector, ) { return net.minecraft.test.TestServer.selectInstances(registryManager.wrapperContained,selector); }
// public java.util.List batch(yarnwrap.server.world.ServerWorld world) { return wrapperContained.batch(world.wrapperContained); }
// public static java.util.List batch(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestServer.batch(world.wrapperContained); }
// public boolean method_66987(Object instance) { return wrapperContained.method_66987(instance); }
// public static boolean method_66987(Object instance, ) { return net.minecraft.test.TestServer.method_66987(instance); }
// public void logFailure(yarnwrap.test.GameTestState state) { wrapperContained.logFailure(state.wrapperContained); }
// public static void logFailure(yarnwrap.test.GameTestState state, ) { net.minecraft.test.TestServer.logFailure(state.wrapperContained); }

}