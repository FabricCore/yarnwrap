package yarnwrap.registry.tag;
public class TagManagerLoader { public net.minecraft.registry.tag.TagManagerLoader wrapperContained; public TagManagerLoader(net.minecraft.registry.tag.TagManagerLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public java.util.List registryTags() { return wrapperContained.registryTags; }
// public void registryTags(java.util.List value) { wrapperContained.registryTags = value; }
public TagManagerLoader(yarnwrap.registry.DynamicRegistryManager registryManager) { this.wrapperContained = new net.minecraft.registry.tag.TagManagerLoader(registryManager.wrapperContained); }
// public java.util.concurrent.CompletableFuture buildRequiredGroup(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor,Object requirement) { return wrapperContained.buildRequiredGroup(resourceManager.wrapperContained,prepareExecutor,requirement); }
public java.util.List getRegistryTags() { return wrapperContained.getRegistryTags(); }
// public void method_40098(java.util.List void_) { wrapperContained.method_40098(void_); }
// public java.util.concurrent.CompletableFuture method_40100(yarnwrap.resource.ResourceManager registry) { return wrapperContained.method_40100(registry.wrapperContained); }

}