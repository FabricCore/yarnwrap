package yarnwrap.server;
public class Main { public net.minecraft.server.Main wrapperContained; public Main(net.minecraft.server.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public void forceUpgradeWorld(Object session,com.mojang.datafixers.DataFixer dataFixer,boolean eraseCache,java.util.function.BooleanSupplier continueCheck,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,boolean recreateRegionFiles) { wrapperContained.forceUpgradeWorld(session,dataFixer,eraseCache,continueCheck,dynamicRegistryManager.wrapperContained,recreateRegionFiles); }
// public yarnwrap.server.dedicated.MinecraftDedicatedServer method_29734(Object thread) { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.method_29734(thread)); }
// public java.util.concurrent.CompletableFuture method_43612(Object applyExecutor) { return wrapperContained.method_43612(applyExecutor); }
// public Object method_43613(com.mojang.serialization.Dynamic context) { return wrapperContained.method_43613(context); }
// public Object createServerConfig(yarnwrap.server.dedicated.ServerPropertiesHandler serverPropertiesHandler,com.mojang.serialization.Dynamic dynamic,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager) { return wrapperContained.createServerConfig(serverPropertiesHandler.wrapperContained,dynamic,safeMode,dataPackManager.wrapperContained); }
// public void writePidFile(java.nio.file.Path path) { wrapperContained.writePidFile(path); }

}