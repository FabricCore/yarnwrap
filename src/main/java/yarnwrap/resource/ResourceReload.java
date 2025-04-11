package yarnwrap.resource;
public class ResourceReload { public net.minecraft.resource.ResourceReload wrapperContained; public ResourceReload(net.minecraft.resource.ResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

public float getProgress() { return wrapperContained.getProgress(); }
public java.util.concurrent.CompletableFuture whenComplete() { return wrapperContained.whenComplete(); }
public boolean isComplete() { return wrapperContained.isComplete(); }
public void throwException() { wrapperContained.throwException(); }

}