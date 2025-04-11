package yarnwrap.test;
public class Batches { public net.minecraft.test.Batches wrapperContained; public Batches(net.minecraft.test.Batches wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BATCH_SIZE() { return wrapperContained.BATCH_SIZE; }
// public void BATCH_SIZE(int value) { wrapperContained.BATCH_SIZE = value; }
public Object defaultBatcher() { return wrapperContained.defaultBatcher(); }
public java.util.Collection createBatches(java.util.Collection testFunctions,yarnwrap.server.world.ServerWorld world) { return wrapperContained.createBatches(testFunctions,world.wrapperContained); }
public yarnwrap.test.GameTestBatch create(java.util.Collection states,java.lang.String batchId,long index) { return new yarnwrap.test.GameTestBatch(wrapperContained.create(states,batchId,index)); }
public yarnwrap.test.GameTestState createState(yarnwrap.test.TestFunction testFunction,int rotationSteps,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.test.GameTestState(wrapperContained.createState(testFunction.wrapperContained,rotationSteps,world.wrapperContained)); }
public Object batcher(int batchSize) { return wrapperContained.batcher(batchSize); }

}