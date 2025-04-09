package yarnwrap.server.integrated;
public class IntegratedServerLoader { public net.minecraft.server.integrated.IntegratedServerLoader wrapperContained; public IntegratedServerLoader(net.minecraft.server.integrated.IntegratedServerLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.world.level.storage.LevelStorage storage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.storage); }
// public java.util.UUID WORLD_PACK_ID() { return wrapperContained.WORLD_PACK_ID; }
// public void startNewWorld(Object session,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistryManager,yarnwrap.world.SaveProperties saveProperties) { wrapperContained.startNewWorld(session,dataPackContents.wrapperContained,dynamicRegistryManager.wrapperContained,saveProperties.wrapperContained); }
public void tryLoad(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.world.CreateWorldScreen parent,com.mojang.serialization.Lifecycle lifecycle,java.lang.Runnable loader,boolean bypassWarnings) { wrapperContained.tryLoad(client.wrapperContained,parent.wrapperContained,lifecycle,loader,bypassWarnings); }
public void createAndStart(java.lang.String levelName,yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.world.gen.GeneratorOptions dynamicRegistryManager,java.util.function.Function dimensionsRegistrySupplier,yarnwrap.client.gui.screen.Screen screen) { wrapperContained.createAndStart(levelName,levelInfo.wrapperContained,dynamicRegistryManager.wrapperContained,dimensionsRegistrySupplier,screen.wrapperContained); }
// public void showBackupPromptScreen(Object session,boolean customized,java.lang.Runnable callback,java.lang.Runnable onCancel) { wrapperContained.showBackupPromptScreen(session,customized,callback,onCancel); }
// public Object createSession(java.lang.String levelName) { return wrapperContained.createSession(levelName); }
// public java.util.concurrent.CompletableFuture showPackLoadFailureScreen() { return wrapperContained.showPackLoadFailureScreen(); }
// public java.lang.Object load(Object dataPacks,Object loadContextSupplier,Object saveApplierFactory) { return wrapperContained.load(dataPacks,loadContextSupplier,saveApplierFactory); }
// public com.mojang.datafixers.util.Pair loadForRecreation(Object session) { return wrapperContained.loadForRecreation(session); }
// public yarnwrap.server.SaveLoader load(com.mojang.serialization.Dynamic levelProperties,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager) { return new yarnwrap.server.SaveLoader(wrapperContained.load(levelProperties,safeMode,dataPackManager.wrapperContained)); }
// public java.util.concurrent.CompletableFuture applyWorldPack(yarnwrap.client.resource.server.ServerResourcePackLoader loader,Object session) { return wrapperContained.applyWorldPack(loader.wrapperContained,session); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager) { wrapperContained.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained); }
// public void checkBackupAndStart(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.checkBackupAndStart(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.client.resource.server.ServerResourcePackLoader resourcePackLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.start(session,saveLoader.wrapperContained,resourcePackLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public void start(Object session,com.mojang.serialization.Dynamic levelProperties,boolean safeMode,java.lang.Runnable onCancel) { wrapperContained.start(session,levelProperties,safeMode,onCancel); }
// public void start(Object session,yarnwrap.world.level.storage.LevelSummary summary,com.mojang.serialization.Dynamic levelProperties,java.lang.Runnable onCancel) { wrapperContained.start(session,summary.wrapperContained,levelProperties,onCancel); }
// public void start(Object session,java.lang.Runnable onCancel) { wrapperContained.start(session,onCancel); }
public void start(java.lang.String name,java.lang.Runnable onCancel) { wrapperContained.start(name,onCancel); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }

}