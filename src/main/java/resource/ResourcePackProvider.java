package yarnwrap.resource;
public class ResourcePackProvider { public net.minecraft.resource.ResourcePackProvider wrapperContained; public ResourcePackProvider(net.minecraft.resource.ResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(java.util.function.Consumer profileAdder) { wrapperContained.register(profileAdder); }

}