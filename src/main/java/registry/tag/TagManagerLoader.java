package yarnwrap.registry.tag;
public class TagManagerLoader { public net.minecraft.registry.tag.TagManagerLoader wrapperContained; public TagManagerLoader(net.minecraft.registry.tag.TagManagerLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public java.util.List registryTags() { return wrapperContained.registryTags; }
// public java.util.concurrent.CompletableFuture buildRequiredGroup(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor,Object requirement) { return wrapperContained.buildRequiredGroup(resourceManager.wrapperContained,prepareExecutor,requirement); }
public java.util.List getRegistryTags() { return wrapperContained.getRegistryTags(); }

}