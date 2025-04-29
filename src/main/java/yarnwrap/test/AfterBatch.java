package yarnwrap.test;
public class AfterBatch { public net.minecraft.test.AfterBatch wrapperContained; public AfterBatch(net.minecraft.test.AfterBatch wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String batchId() { return wrapperContained.batchId(); }
// public static java.lang.String batchId() { return net.minecraft.test.AfterBatch.batchId(); }

}