package yarnwrap.test;
public class TestFunctions { public net.minecraft.test.TestFunctions wrapperContained; public TestFunctions(net.minecraft.test.TestFunctions wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection TEST_FUNCTIONS() { return wrapperContained.TEST_FUNCTIONS; }
// public java.util.Set TEST_CLASSES() { return wrapperContained.TEST_CLASSES; }
// public java.util.Map BEFORE_BATCH_CONSUMERS() { return wrapperContained.BEFORE_BATCH_CONSUMERS; }
// public java.util.Set FAILED_TEST_FUNCTIONS() { return wrapperContained.FAILED_TEST_FUNCTIONS; }
// public java.util.Map AFTER_BATCH_CONSUMERS() { return wrapperContained.AFTER_BATCH_CONSUMERS; }
public java.util.Collection getTestFunctions() { return wrapperContained.getTestFunctions(); }
// public boolean isInClass(yarnwrap.test.TestFunction testFunction,java.lang.String testClass) { return wrapperContained.isInClass(testFunction.wrapperContained,testClass); }
public java.util.stream.Stream getTestFunctions(java.lang.String testClass) { return wrapperContained.getTestFunctions(testClass); }
public java.util.Collection getTestClasses() { return wrapperContained.getTestClasses(); }
public boolean testClassExists(java.lang.String testClass) { return wrapperContained.testClassExists(testClass); }
public java.util.function.Consumer getBeforeBatchConsumer(java.lang.String batchId) { return wrapperContained.getBeforeBatchConsumer(batchId); }
public java.util.Optional getTestFunction(java.lang.String structurePath) { return wrapperContained.getTestFunction(structurePath); }
public yarnwrap.test.TestFunction getTestFunctionOrThrow(java.lang.String structurePath) { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunctionOrThrow(structurePath)); }
public void addFailedTestFunction(yarnwrap.test.TestFunction testFunction) { wrapperContained.addFailedTestFunction(testFunction.wrapperContained); }
public java.util.stream.Stream getFailedTestFunctions() { return wrapperContained.getFailedTestFunctions(); }
public void clearFailedTestFunctions() { wrapperContained.clearFailedTestFunctions(); }
public java.util.function.Consumer getAfterBatchConsumer(java.lang.String batchId) { return wrapperContained.getAfterBatchConsumer(batchId); }
public void register(java.lang.Class testClass) { wrapperContained.register(testClass); }
public void register(java.lang.reflect.Method method) { wrapperContained.register(method); }
// public void registerBatchConsumers(java.lang.reflect.Method method,java.lang.Class clazz,java.util.function.Function batchIdFunction,java.util.Map batchConsumerMap) { wrapperContained.registerBatchConsumers(method,clazz,batchIdFunction,batchConsumerMap); }
// public java.util.Collection getCustomTestFunctions(java.lang.reflect.Method method) { return wrapperContained.getCustomTestFunctions(method); }
// public yarnwrap.test.TestFunction getTestFunction(java.lang.reflect.Method method) { return new yarnwrap.test.TestFunction(wrapperContained.getTestFunction(method)); }
// public java.util.function.Consumer getInvoker(java.lang.reflect.Method method) { return wrapperContained.getInvoker(method); }

}