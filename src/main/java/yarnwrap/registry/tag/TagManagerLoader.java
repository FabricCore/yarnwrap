package yarnwrap.registry.tag;
public class TagManagerLoader { public net.minecraft.registry.tag.TagManagerLoader wrapperContained; public TagManagerLoader(net.minecraft.registry.tag.TagManagerLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public java.util.List registryTags() { return wrapperContained.registryTags; }
// public void registryTags(java.util.List value) { wrapperContained.registryTags = value; }
// public java.util.concurrent.CompletableFuture buildRequiredGroup(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor,Object requirement) { return wrapperContained.buildRequiredGroup(resourceManager.wrapperContained,prepareExecutor,requirement); }
public java.util.List getRegistryTags() { return wrapperContained.getRegistryTags(); }

}