package yarnwrap.resource;
public class ReloadableResourceManagerImpl { public net.minecraft.resource.ReloadableResourceManagerImpl wrapperContained; public ReloadableResourceManagerImpl(net.minecraft.resource.ReloadableResourceManagerImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List reloaders() { return wrapperContained.reloaders; }
// public yarnwrap.resource.LifecycledResourceManager activeManager() { return new yarnwrap.resource.LifecycledResourceManager(wrapperContained.activeManager); }
public void registerReloader(yarnwrap.resource.ResourceReloader reloader) { wrapperContained.registerReloader(reloader.wrapperContained); }
public yarnwrap.resource.ResourceReload reload(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,java.util.List packs) { return new yarnwrap.resource.ResourceReload(wrapperContained.reload(prepareExecutor,applyExecutor,initialStage,packs)); }

}