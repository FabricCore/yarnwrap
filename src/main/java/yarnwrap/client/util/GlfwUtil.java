package yarnwrap.client.util;
public class GlfwUtil { public net.minecraft.client.util.GlfwUtil wrapperContained; public GlfwUtil(net.minecraft.client.util.GlfwUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public void makeJvmCrash() { wrapperContained.makeJvmCrash(); }
public static void makeJvmCrash() { net.minecraft.client.util.GlfwUtil.makeJvmCrash(); }
// public double getTime() { return wrapperContained.getTime(); }
public static double getTime() { return net.minecraft.client.util.GlfwUtil.getTime(); }

}