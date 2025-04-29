package yarnwrap.resource;
public class ReloadableResourceManagerImpl { public net.minecraft.resource.ReloadableResourceManagerImpl wrapperContained; public ReloadableResourceManagerImpl(net.minecraft.resource.ReloadableResourceManagerImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public void type(yarnwrap.resource.ResourceType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(net.minecraft.resource.ReloadableResourceManagerImpl.type); }
// public static void type(yarnwrap.resource.ResourceType value, ) { net.minecraft.resource.ReloadableResourceManagerImpl.type = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.ReloadableResourceManagerImpl.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.ReloadableResourceManagerImpl.LOGGER = value; }

// public java.util.List reloaders() { return wrapperContained.reloaders; }
// public void reloaders(java.util.List value) { wrapperContained.reloaders = value; }
// public static java.util.List reloaders() { return net.minecraft.resource.ReloadableResourceManagerImpl.reloaders; }
// public static void reloaders(java.util.List value, ) { net.minecraft.resource.ReloadableResourceManagerImpl.reloaders = value; }

// public yarnwrap.resource.LifecycledResourceManager activeManager() { return new yarnwrap.resource.LifecycledResourceManager(wrapperContained.activeManager); }
// public void activeManager(yarnwrap.resource.LifecycledResourceManager value) { wrapperContained.activeManager = value.wrapperContained; }
// public static yarnwrap.resource.LifecycledResourceManager activeManager() { return new yarnwrap.resource.LifecycledResourceManager(net.minecraft.resource.ReloadableResourceManagerImpl.activeManager); }
// public static void activeManager(yarnwrap.resource.LifecycledResourceManager value, ) { net.minecraft.resource.ReloadableResourceManagerImpl.activeManager = value.wrapperContained; }

public ReloadableResourceManagerImpl(yarnwrap.resource.ResourceType type) { this.wrapperContained = new net.minecraft.resource.ReloadableResourceManagerImpl(type.wrapperContained); }
public void registerReloader(yarnwrap.resource.ResourceReloader reloader) { wrapperContained.registerReloader(reloader.wrapperContained); }
// public static void registerReloader(yarnwrap.resource.ResourceReloader reloader, ) { net.minecraft.resource.ReloadableResourceManagerImpl.registerReloader(reloader.wrapperContained); }
public yarnwrap.resource.ResourceReload reload(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,java.util.List packs) { return new yarnwrap.resource.ResourceReload(wrapperContained.reload(prepareExecutor,applyExecutor,initialStage,packs)); }
// public static yarnwrap.resource.ResourceReload reload(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,java.util.List packs, ) { return new yarnwrap.resource.ResourceReload(net.minecraft.resource.ReloadableResourceManagerImpl.reload(prepareExecutor,applyExecutor,initialStage,packs)); }

}