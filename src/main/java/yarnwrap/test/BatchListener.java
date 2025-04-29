package yarnwrap.test;
public class BatchListener { public net.minecraft.test.BatchListener wrapperContained; public BatchListener(net.minecraft.test.BatchListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onStarted(yarnwrap.test.GameTestBatch batch) { wrapperContained.onStarted(batch.wrapperContained); }
// public static void onStarted(yarnwrap.test.GameTestBatch batch, ) { net.minecraft.test.BatchListener.onStarted(batch.wrapperContained); }
public void onFinished(yarnwrap.test.GameTestBatch batch) { wrapperContained.onFinished(batch.wrapperContained); }
// public static void onFinished(yarnwrap.test.GameTestBatch batch, ) { net.minecraft.test.BatchListener.onFinished(batch.wrapperContained); }

}