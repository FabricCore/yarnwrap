package yarnwrap.resource;
public class ResourceReload { public net.minecraft.resource.ResourceReload wrapperContained; public ResourceReload(net.minecraft.resource.ResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

public float getProgress() { return wrapperContained.getProgress(); }
// public static float getProgress() { return net.minecraft.resource.ResourceReload.getProgress(); }
public java.util.concurrent.CompletableFuture whenComplete() { return wrapperContained.whenComplete(); }
// public static java.util.concurrent.CompletableFuture whenComplete() { return net.minecraft.resource.ResourceReload.whenComplete(); }
public boolean isComplete() { return wrapperContained.isComplete(); }
// public static boolean isComplete() { return net.minecraft.resource.ResourceReload.isComplete(); }
public void throwException() { wrapperContained.throwException(); }
// public static void throwException() { net.minecraft.resource.ResourceReload.throwException(); }

}