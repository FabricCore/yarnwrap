package yarnwrap.test;
public class TestFunctions { public net.minecraft.test.TestFunctions wrapperContained; public TestFunctions(net.minecraft.test.TestFunctions wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection TEST_FUNCTIONS() { return wrapperContained.TEST_FUNCTIONS; }
// public void TEST_FUNCTIONS(java.util.Collection value) { wrapperContained.TEST_FUNCTIONS = value; }
// public static java.util.Collection TEST_FUNCTIONS() { return net.minecraft.test.TestFunctions.TEST_FUNCTIONS; }
// public static void TEST_FUNCTIONS(java.util.Collection value, ) { net.minecraft.test.TestFunctions.TEST_FUNCTIONS = value; }

// public java.util.Set TEST_CLASSES() { return wrapperContained.TEST_CLASSES; }
// public void TEST_CLASSES(java.util.Set value) { wrapperContained.TEST_CLASSES = value; }
// public static java.util.Set TEST_CLASSES() { return net.minecraft.test.TestFunctions.TEST_CLASSES; }
// public static void TEST_CLASSES(java.util.Set value, ) { net.minecraft.test.TestFunctions.TEST_CLASSES = value; }

// public java.util.Map BEFORE_BATCH_CONSUMERS() { return wrapperContained.BEFORE_BATCH_CONSUMERS; }
// public void BEFORE_BATCH_CONSUMERS(java.util.Map value) { wrapperContained.BEFORE_BATCH_CONSUMERS = value; }
// public static java.util.Map BEFORE_BATCH_CONSUMERS() { return net.minecraft.test.TestFunctions.BEFORE_BATCH_CONSUMERS; }
// public static void BEFORE_BATCH_CONSUMERS(java.util.Map value, ) { net.minecraft.test.TestFunctions.BEFORE_BATCH_CONSUMERS = value; }

// public java.util.Set FAILED_TEST_FUNCTIONS() { return wrapperContained.FAILED_TEST_FUNCTIONS; }
// public void FAILED_TEST_FUNCTIONS(java.util.Set value) { wrapperContained.FAILED_TEST_FUNCTIONS = value; }
// public static java.util.Set FAILED_TEST_FUNCTIONS() { return net.minecraft.test.TestFunctions.FAILED_TEST_FUNCTIONS; }
// public static void FAILED_TEST_FUNCTIONS(java.util.Set value, ) { net.minecraft.test.TestFunctions.FAILED_TEST_FUNCTIONS = value; }

// public java.util.Map AFTER_BATCH_CONSUMERS() { return wrapperContained.AFTER_BATCH_CONSUMERS; }
// public void AFTER_BATCH_CONSUMERS(java.util.Map value) { wrapperContained.AFTER_BATCH_CONSUMERS = value; }
// public static java.util.Map AFTER_BATCH_CONSUMERS() { return net.minecraft.test.TestFunctions.AFTER_BATCH_CONSUMERS; }
// public static void AFTER_BATCH_CONSUMERS(java.util.Map value, ) { net.minecraft.test.TestFunctions.AFTER_BATCH_CONSUMERS = value; }

// public java.util.Collection getTestFunctions() { return wrapperContained.getTestFunctions(); }
public static java.util.Collection getTestFunctions() { return net.minecraft.test.TestFunctions.getTestFunctions(); }
// public boolean isInClass(yarnwrap.test.TestFunction testFunction,java.lang.String testClass) { return wrapperContained.isInClass(testFunction.wrapperContained,testClass); }
// public static boolean isInClass(yarnwrap.test.TestFunction testFunction,java.lang.String testClass, ) { return net.minecraft.test.TestFunctions.isInClass(testFunction.wrapperContained,testClass); }
// public java.util.stream.Stream getTestFunctions(java.lang.String testClass) { return wrapperContained.getTestFunctions(testClass); }
// public static java.util.stream.Stream getTestFunctions(java.lang.String testClass, ) { return net.minecraft.test.TestFunctions.getTestFunctions(testClass); }
// public boolean method_22194(java.lang.String testFunction) { return wrapperContained.method_22194(testFunction); }
// public static boolean method_22194(java.lang.String testFunction, ) { return net.minecraft.test.TestFunctions.method_22194(testFunction); }
// public java.util.Collection getTestClasses() { return wrapperContained.getTestClasses(); }
public static java.util.Collection getTestClasses() { return net.minecraft.test.TestFunctions.getTestClasses(); }
// public boolean testClassExists(java.lang.String testClass) { return wrapperContained.testClassExists(testClass); }
// public static boolean testClassExists(java.lang.String testClass, ) { return net.minecraft.test.TestFunctions.testClassExists(testClass); }
// public boolean method_22197(java.lang.String testFunction) { return wrapperContained.method_22197(testFunction); }
// public static boolean method_22197(java.lang.String testFunction, ) { return net.minecraft.test.TestFunctions.method_22197(testFunction); }
// public java.util.function.Consumer getBeforeBatchConsumer(java.lang.String batchId) { return wrapperContained.getBeforeBatchConsumer(batchId); }
// public static java.util.function.Consumer getBeforeBatchConsumer(java.lang.String batchId, ) { return net.minecraft.test.TestFunctions.getBeforeBatchConsumer(batchId); }
// public java.util.Optional getTestFunction(java.lang.String structurePath) { return wrapperContained.getTestFunction(structurePath); }
// public static java.util.Optional getTestFunction(java.lang.String structurePath, ) { return net.minecraft.test.TestFunctions.getTestFunction(structurePath); }
// public yarnwrap.test.TestFunction getTestFunctionOrThrow(java.lang.String structurePath) { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunctionOrThrow(structurePath)); }
// public static yarnwrap.test.TestFunction getTestFunctionOrThrow(java.lang.String structurePath, ) { return new yarnwrap.test.TestFunction(net.minecraft.test.TestFunctions.getTestFunctionOrThrow(structurePath)); }
// public void addFailedTestFunction(yarnwrap.test.TestFunction testFunction) { wrapperContained.addFailedTestFunction(testFunction.wrapperContained); }
// public static void addFailedTestFunction(yarnwrap.test.TestFunction testFunction, ) { net.minecraft.test.TestFunctions.addFailedTestFunction(testFunction.wrapperContained); }
// public java.util.stream.Stream getFailedTestFunctions() { return wrapperContained.getFailedTestFunctions(); }
public static java.util.stream.Stream getFailedTestFunctions() { return net.minecraft.test.TestFunctions.getFailedTestFunctions(); }
// public void clearFailedTestFunctions() { wrapperContained.clearFailedTestFunctions(); }
public static void clearFailedTestFunctions() { net.minecraft.test.TestFunctions.clearFailedTestFunctions(); }
// public java.util.function.Consumer getAfterBatchConsumer(java.lang.String batchId) { return wrapperContained.getAfterBatchConsumer(batchId); }
// public static java.util.function.Consumer getAfterBatchConsumer(java.lang.String batchId, ) { return net.minecraft.test.TestFunctions.getAfterBatchConsumer(batchId); }
// public void register(java.lang.Class testClass) { wrapperContained.register(testClass); }
// public static void register(java.lang.Class testClass, ) { net.minecraft.test.TestFunctions.register(testClass); }
// public void register(java.lang.reflect.Method method) { wrapperContained.register(method); }
// public static void register(java.lang.reflect.Method method, ) { net.minecraft.test.TestFunctions.register(method); }
// public void registerBatchConsumers(java.lang.reflect.Method method,java.lang.Class clazz,java.util.function.Function batchIdFunction,java.util.Map batchConsumerMap) { wrapperContained.registerBatchConsumers(method,clazz,batchIdFunction,batchConsumerMap); }
// public static void registerBatchConsumers(java.lang.reflect.Method method,java.lang.Class clazz,java.util.function.Function batchIdFunction,java.util.Map batchConsumerMap, ) { net.minecraft.test.TestFunctions.registerBatchConsumers(method,clazz,batchIdFunction,batchConsumerMap); }
// public void method_36071(java.lang.reflect.Method args) { wrapperContained.method_36071(args); }
// public static void method_36071(java.lang.reflect.Method args, ) { net.minecraft.test.TestFunctions.method_36071(args); }
// public java.util.Collection getCustomTestFunctions(java.lang.reflect.Method method) { return wrapperContained.getCustomTestFunctions(method); }
// public static java.util.Collection getCustomTestFunctions(java.lang.reflect.Method method, ) { return net.minecraft.test.TestFunctions.getCustomTestFunctions(method); }
// public yarnwrap.test.TestFunction getTestFunction(java.lang.reflect.Method method) { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunction(method)); }
// public static yarnwrap.test.TestFunction getTestFunction(java.lang.reflect.Method method, ) { return new yarnwrap.test.TestFunction(net.minecraft.test.TestFunctions.getTestFunction(method)); }
// public java.util.function.Consumer getInvoker(java.lang.reflect.Method method) { return wrapperContained.getInvoker(method); }
// public static java.util.function.Consumer getInvoker(java.lang.reflect.Method method, ) { return net.minecraft.test.TestFunctions.getInvoker(method); }
// public void method_56217(yarnwrap.server.world.ServerWorld world) { wrapperContained.method_56217(world.wrapperContained); }
// public static void method_56217(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestFunctions.method_56217(world.wrapperContained); }
// public void method_56218(yarnwrap.server.world.ServerWorld world) { wrapperContained.method_56218(world.wrapperContained); }
// public static void method_56218(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestFunctions.method_56218(world.wrapperContained); }

}