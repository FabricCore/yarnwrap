package yarnwrap.server;
public class Main { public net.minecraft.server.Main wrapperContained; public Main(net.minecraft.server.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void forceUpgradeWorld(Object session,com.mojang.datafixers.DataFixer dataFixer,boolean eraseCache,java.util.function.BooleanSupplier continueCheck,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,boolean recreateRegionFiles) { wrapperContained.forceUpgradeWorld(session,dataFixer,eraseCache,continueCheck,dynamicRegistryManager.wrapperContained,recreateRegionFiles); }
// public Object createServerConfig(yarnwrap.server.dedicated.ServerPropertiesHandler serverPropertiesHandler,com.mojang.serialization.Dynamic dynamic,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager) { return wrapperContained.createServerConfig(serverPropertiesHandler.wrapperContained,dynamic,safeMode,dataPackManager.wrapperContained); }
// public void writePidFile(java.nio.file.Path path) { wrapperContained.writePidFile(path); }

}