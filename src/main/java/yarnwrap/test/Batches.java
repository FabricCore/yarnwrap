package yarnwrap.test;
public class Batches { public net.minecraft.test.Batches wrapperContained; public Batches(net.minecraft.test.Batches wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BATCH_SIZE() { return wrapperContained.BATCH_SIZE; }
// public void BATCH_SIZE(int value) { wrapperContained.BATCH_SIZE = value; }
public Object defaultBatcher() { return wrapperContained.defaultBatcher(); }
// public yarnwrap.test.GameTestBatch method_56189(yarnwrap.server.world.ServerWorld states,java.lang.String index) { return new yarnwrap.test.GameTestBatch(wrapperContained.method_56189(states.wrapperContained,index)); }
// public java.util.stream.Stream method_56190(yarnwrap.server.world.ServerWorld entry) { return wrapperContained.method_56190(entry.wrapperContained); }
// public yarnwrap.test.GameTestState method_56191(yarnwrap.server.world.ServerWorld testFunction) { return new yarnwrap.test.GameTestState(wrapperContained.method_56191(testFunction.wrapperContained)); }
// public yarnwrap.test.GameTestBatch method_56192(java.lang.String states,java.util.List index) { return new yarnwrap.test.GameTestBatch(wrapperContained.method_56192(states,index)); }
// public java.util.Collection method_56193(int states) { return wrapperContained.method_56193(states); }
public java.util.Collection createBatches(java.util.Collection testFunctions,yarnwrap.server.world.ServerWorld world) { return wrapperContained.createBatches(testFunctions,world.wrapperContained); }
public yarnwrap.test.GameTestBatch create(java.util.Collection states,java.lang.String batchId,long index) { return new yarnwrap.test.GameTestBatch(wrapperContained.create(states,batchId,index)); }
// public java.util.stream.Stream method_56196(int entry) { return wrapperContained.method_56196(entry); }
// public java.lang.String method_56197(yarnwrap.test.GameTestState state) { return wrapperContained.method_56197(state.wrapperContained); }
public yarnwrap.test.GameTestState createState(yarnwrap.test.TestFunction testFunction,int rotationSteps,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.test.GameTestState(wrapperContained.createState(testFunction.wrapperContained,rotationSteps,world.wrapperContained)); }
public Object batcher(int batchSize) { return wrapperContained.batcher(batchSize); }

}