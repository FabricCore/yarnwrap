package yarnwrap.resource;
public class SynchronousResourceReloader { public net.minecraft.resource.SynchronousResourceReloader wrapperContained; public SynchronousResourceReloader(net.minecraft.resource.SynchronousResourceReloader wrapperContained) { this.wrapperContained = wrapperContained; }

public void reload(yarnwrap.resource.ResourceManager manager) { wrapperContained.reload(manager.wrapperContained); }

}