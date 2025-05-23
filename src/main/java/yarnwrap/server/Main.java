package yarnwrap.server;
public class Main { public net.minecraft.server.Main wrapperContained; public Main(net.minecraft.server.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.Main.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.Main.LOGGER = value; }

// public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public static void main(java.lang.String[] args, ) { net.minecraft.server.Main.main(args); }
// public void forceUpgradeWorld(Object session,yarnwrap.world.SaveProperties saveProperties,com.mojang.datafixers.DataFixer dataFixer,boolean eraseCache,java.util.function.BooleanSupplier continueCheck,yarnwrap.registry.DynamicRegistryManager registries,boolean recreateRegionFiles) { wrapperContained.forceUpgradeWorld(session,saveProperties.wrapperContained,dataFixer,eraseCache,continueCheck,registries.wrapperContained,recreateRegionFiles); }
// public static void forceUpgradeWorld(Object session,yarnwrap.world.SaveProperties saveProperties,com.mojang.datafixers.DataFixer dataFixer,boolean eraseCache,java.util.function.BooleanSupplier continueCheck,yarnwrap.registry.DynamicRegistryManager registries,boolean recreateRegionFiles, ) { net.minecraft.server.Main.forceUpgradeWorld(session,saveProperties.wrapperContained,dataFixer,eraseCache,continueCheck,registries.wrapperContained,recreateRegionFiles); }
// public yarnwrap.server.dedicated.MinecraftDedicatedServer method_29734(Object thread) { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.method_29734(thread)); }
// public static yarnwrap.server.dedicated.MinecraftDedicatedServer method_29734(Object thread, ) { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(net.minecraft.server.Main.method_29734(thread)); }
// public java.util.concurrent.CompletableFuture method_43612(Object applyExecutor) { return wrapperContained.method_43612(applyExecutor); }
// public static java.util.concurrent.CompletableFuture method_43612(Object applyExecutor, ) { return net.minecraft.server.Main.method_43612(applyExecutor); }
// public Object method_43613(com.mojang.serialization.Dynamic context) { return wrapperContained.method_43613(context); }
// public static Object method_43613(com.mojang.serialization.Dynamic context, ) { return net.minecraft.server.Main.method_43613(context); }
// public Object createServerConfig(yarnwrap.server.dedicated.ServerPropertiesHandler serverPropertiesHandler,com.mojang.serialization.Dynamic dynamic,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager) { return wrapperContained.createServerConfig(serverPropertiesHandler.wrapperContained,dynamic,safeMode,dataPackManager.wrapperContained); }
// public static Object createServerConfig(yarnwrap.server.dedicated.ServerPropertiesHandler serverPropertiesHandler,com.mojang.serialization.Dynamic dynamic,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager, ) { return net.minecraft.server.Main.createServerConfig(serverPropertiesHandler.wrapperContained,dynamic,safeMode,dataPackManager.wrapperContained); }
// public void writePidFile(java.nio.file.Path path) { wrapperContained.writePidFile(path); }
// public static void writePidFile(java.nio.file.Path path, ) { net.minecraft.server.Main.writePidFile(path); }

}