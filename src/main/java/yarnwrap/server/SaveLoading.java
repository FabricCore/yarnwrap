package yarnwrap.server;
public class SaveLoading { public net.minecraft.server.SaveLoading wrapperContained; public SaveLoading(net.minecraft.server.SaveLoading wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.CompletableFuture load(Object serverConfig,Object loadContextSupplier,Object saveApplierFactory,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.load(serverConfig,loadContextSupplier,saveApplierFactory,prepareExecutor,applyExecutor); }
// public Object loadDynamicRegistryManager(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,yarnwrap.registry.ServerDynamicRegistryType type,java.util.List entries) { return wrapperContained.loadDynamicRegistryManager(resourceManager.wrapperContained,combinedDynamicRegistries.wrapperContained,type.wrapperContained,entries); }
// public yarnwrap.registry.CombinedDynamicRegistries withRegistriesLoaded(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,yarnwrap.registry.ServerDynamicRegistryType type,java.util.List entries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.withRegistriesLoaded(resourceManager.wrapperContained,combinedDynamicRegistries.wrapperContained,type.wrapperContained,entries)); }

}