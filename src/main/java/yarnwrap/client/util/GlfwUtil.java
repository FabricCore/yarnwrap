package yarnwrap.client.util;
public class GlfwUtil { public net.minecraft.client.util.GlfwUtil wrapperContained; public GlfwUtil(net.minecraft.client.util.GlfwUtil wrapperContained) { this.wrapperContained = wrapperContained; }

public void makeJvmCrash() { wrapperContained.makeJvmCrash(); }
public double getTime() { return wrapperContained.getTime(); }
// public void accessRecordingQueue(net.minecraft.class_4491 storage) { wrapperContained.accessRecordingQueue(storage); }
// public void accessProcessingQueue(net.minecraft.class_4491 storage) { wrapperContained.accessProcessingQueue(storage); }

}