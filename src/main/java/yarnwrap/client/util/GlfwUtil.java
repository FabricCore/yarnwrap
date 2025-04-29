package yarnwrap.client.util;
public class GlfwUtil { public net.minecraft.client.util.GlfwUtil wrapperContained; public GlfwUtil(net.minecraft.client.util.GlfwUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public void makeJvmCrash() { wrapperContained.makeJvmCrash(); }
public static void makeJvmCrash() { net.minecraft.client.util.GlfwUtil.makeJvmCrash(); }
// public double getTime() { return wrapperContained.getTime(); }
public static double getTime() { return net.minecraft.client.util.GlfwUtil.getTime(); }
// public void accessRecordingQueue(net.minecraft.class_4491 storage) { wrapperContained.accessRecordingQueue(storage); }
// public static void accessRecordingQueue(net.minecraft.class_4491 storage, ) { net.minecraft.client.util.GlfwUtil.accessRecordingQueue(storage); }
// public void accessProcessingQueue(net.minecraft.class_4491 storage) { wrapperContained.accessProcessingQueue(storage); }
// public static void accessProcessingQueue(net.minecraft.class_4491 storage, ) { net.minecraft.client.util.GlfwUtil.accessProcessingQueue(storage); }

}