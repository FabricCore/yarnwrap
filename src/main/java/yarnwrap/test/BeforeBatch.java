package yarnwrap.test;
public class BeforeBatch { public net.minecraft.test.BeforeBatch wrapperContained; public BeforeBatch(net.minecraft.test.BeforeBatch wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String batchId() { return wrapperContained.batchId(); }
// public static java.lang.String batchId() { return net.minecraft.test.BeforeBatch.batchId(); }

}