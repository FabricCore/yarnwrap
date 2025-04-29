package yarnwrap.server.integrated;
public class IntegratedServerLoader { public net.minecraft.server.integrated.IntegratedServerLoader wrapperContained; public IntegratedServerLoader(net.minecraft.server.integrated.IntegratedServerLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.integrated.IntegratedServerLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.integrated.IntegratedServerLoader.LOGGER = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.server.integrated.IntegratedServerLoader.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.server.integrated.IntegratedServerLoader.client = value.wrapperContained; }

// public yarnwrap.world.level.storage.LevelStorage storage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.storage); }
// public void storage(yarnwrap.world.level.storage.LevelStorage value) { wrapperContained.storage = value.wrapperContained; }
// public static yarnwrap.world.level.storage.LevelStorage storage() { return new yarnwrap.world.level.storage.LevelStorage(net.minecraft.server.integrated.IntegratedServerLoader.storage); }
// public static void storage(yarnwrap.world.level.storage.LevelStorage value, ) { net.minecraft.server.integrated.IntegratedServerLoader.storage = value.wrapperContained; }

// public java.util.UUID WORLD_PACK_ID() { return wrapperContained.WORLD_PACK_ID; }
// public void WORLD_PACK_ID(java.util.UUID value) { wrapperContained.WORLD_PACK_ID = value; }
// public static java.util.UUID WORLD_PACK_ID() { return net.minecraft.server.integrated.IntegratedServerLoader.WORLD_PACK_ID; }
// public static void WORLD_PACK_ID(java.util.UUID value, ) { net.minecraft.server.integrated.IntegratedServerLoader.WORLD_PACK_ID = value; }

public IntegratedServerLoader(yarnwrap.client.MinecraftClient client,yarnwrap.world.level.storage.LevelStorage storage) { this.wrapperContained = new net.minecraft.server.integrated.IntegratedServerLoader(client.wrapperContained,storage.wrapperContained); }
// public void startNewWorld(Object session,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistryManager,yarnwrap.world.SaveProperties saveProperties) { wrapperContained.startNewWorld(session,dataPackContents.wrapperContained,dynamicRegistryManager.wrapperContained,saveProperties.wrapperContained); }
// public static void startNewWorld(Object session,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistryManager,yarnwrap.world.SaveProperties saveProperties, ) { net.minecraft.server.integrated.IntegratedServerLoader.startNewWorld(session,dataPackContents.wrapperContained,dynamicRegistryManager.wrapperContained,saveProperties.wrapperContained); }
// public void tryLoad(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.world.CreateWorldScreen parent,com.mojang.serialization.Lifecycle lifecycle,java.lang.Runnable loader,boolean bypassWarnings) { wrapperContained.tryLoad(client.wrapperContained,parent.wrapperContained,lifecycle,loader,bypassWarnings); }
// public static void tryLoad(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.world.CreateWorldScreen parent,com.mojang.serialization.Lifecycle lifecycle,java.lang.Runnable loader,boolean bypassWarnings, ) { net.minecraft.server.integrated.IntegratedServerLoader.tryLoad(client.wrapperContained,parent.wrapperContained,lifecycle,loader,bypassWarnings); }
// public void method_41893(java.lang.Runnable confirmed) { wrapperContained.method_41893(confirmed); }
// public static void method_41893(java.lang.Runnable confirmed, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_41893(confirmed); }
public void createAndStart(java.lang.String levelName,yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.world.gen.GeneratorOptions dynamicRegistryManager,java.util.function.Function dimensionsRegistrySupplier,yarnwrap.client.gui.screen.Screen screen) { wrapperContained.createAndStart(levelName,levelInfo.wrapperContained,dynamicRegistryManager.wrapperContained,dimensionsRegistrySupplier,screen.wrapperContained); }
// public static void createAndStart(java.lang.String levelName,yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.world.gen.GeneratorOptions dynamicRegistryManager,java.util.function.Function dimensionsRegistrySupplier,yarnwrap.client.gui.screen.Screen screen, ) { net.minecraft.server.integrated.IntegratedServerLoader.createAndStart(levelName,levelInfo.wrapperContained,dynamicRegistryManager.wrapperContained,dimensionsRegistrySupplier,screen.wrapperContained); }
// public void showBackupPromptScreen(Object session,boolean customized,java.lang.Runnable callback,java.lang.Runnable onCancel) { wrapperContained.showBackupPromptScreen(session,customized,callback,onCancel); }
// public static void showBackupPromptScreen(Object session,boolean customized,java.lang.Runnable callback,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.showBackupPromptScreen(session,customized,callback,onCancel); }
// public Object createSession(java.lang.String levelName) { return wrapperContained.createSession(levelName); }
// public static Object createSession(java.lang.String levelName, ) { return net.minecraft.server.integrated.IntegratedServerLoader.createSession(levelName); }
// public java.util.concurrent.CompletableFuture showPackLoadFailureScreen() { return wrapperContained.showPackLoadFailureScreen(); }
// public static java.util.concurrent.CompletableFuture showPackLoadFailureScreen() { return net.minecraft.server.integrated.IntegratedServerLoader.showPackLoadFailureScreen(); }
// public java.lang.Object load(Object dataPacks,Object loadContextSupplier,Object saveApplierFactory) { return wrapperContained.load(dataPacks,loadContextSupplier,saveApplierFactory); }
// public static java.lang.Object load(Object dataPacks,Object loadContextSupplier,Object saveApplierFactory, ) { return net.minecraft.server.integrated.IntegratedServerLoader.load(dataPacks,loadContextSupplier,saveApplierFactory); }
// public com.mojang.datafixers.util.Pair method_45695(yarnwrap.resource.LifecycledResourceManager resourceManager,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries combinedRegistryManager,Object currentSettings) { return wrapperContained.method_45695(resourceManager.wrapperContained,dataPackContents.wrapperContained,combinedRegistryManager.wrapperContained,currentSettings); }
// public static com.mojang.datafixers.util.Pair method_45695(yarnwrap.resource.LifecycledResourceManager resourceManager,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries combinedRegistryManager,Object currentSettings, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_45695(resourceManager.wrapperContained,dataPackContents.wrapperContained,combinedRegistryManager.wrapperContained,currentSettings); }
// public com.mojang.datafixers.util.Pair loadForRecreation(Object session) { return wrapperContained.loadForRecreation(session); }
// public static com.mojang.datafixers.util.Pair loadForRecreation(Object session, ) { return net.minecraft.server.integrated.IntegratedServerLoader.loadForRecreation(session); }
// public Object method_45698(java.util.function.Function context) { return wrapperContained.method_45698(context); }
// public static Object method_45698(java.util.function.Function context, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_45698(context); }
// public Object method_54609(com.mojang.serialization.Dynamic context) { return wrapperContained.method_54609(context); }
// public static Object method_54609(com.mojang.serialization.Dynamic context, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_54609(context); }
// public yarnwrap.server.SaveLoader load(com.mojang.serialization.Dynamic levelProperties,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager) { return new yarnwrap.server.SaveLoader(wrapperContained.load(levelProperties,safeMode,dataPackManager.wrapperContained)); }
// public static yarnwrap.server.SaveLoader load(com.mojang.serialization.Dynamic levelProperties,boolean safeMode,yarnwrap.resource.ResourcePackManager dataPackManager, ) { return new yarnwrap.server.SaveLoader(net.minecraft.server.integrated.IntegratedServerLoader.load(levelProperties,safeMode,dataPackManager.wrapperContained)); }
// public void method_54617(Object backup,java.lang.Runnable eraseCache) { wrapperContained.method_54617(backup,eraseCache); }
// public static void method_54617(Object backup,java.lang.Runnable eraseCache, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_54617(backup,eraseCache); }
// public Object method_54622(com.mojang.serialization.Dynamic context) { return wrapperContained.method_54622(context); }
// public static Object method_54622(com.mojang.serialization.Dynamic context, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_54622(context); }
// public java.util.concurrent.CompletableFuture applyWorldPack(yarnwrap.client.resource.server.ServerResourcePackLoader loader,Object session) { return wrapperContained.applyWorldPack(loader.wrapperContained,session); }
// public static java.util.concurrent.CompletableFuture applyWorldPack(yarnwrap.client.resource.server.ServerResourcePackLoader loader,Object session, ) { return net.minecraft.server.integrated.IntegratedServerLoader.applyWorldPack(loader.wrapperContained,session); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager) { wrapperContained.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained); }
// public static void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained); }
// public void method_57774(Object confirmed) { wrapperContained.method_57774(confirmed); }
// public static void method_57774(Object confirmed, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_57774(confirmed); }
// public void checkBackupAndStart(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.checkBackupAndStart(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public static void checkBackupAndStart(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.checkBackupAndStart(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.client.resource.server.ServerResourcePackLoader resourcePackLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.start(session,saveLoader.wrapperContained,resourcePackLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public static void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.client.resource.server.ServerResourcePackLoader resourcePackLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,saveLoader.wrapperContained,resourcePackLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public void method_57777(Object successful) { wrapperContained.method_57777(successful); }
// public static void method_57777(Object successful, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_57777(successful); }
// public void method_57779(Object backup,com.mojang.serialization.Dynamic eraseCache) { wrapperContained.method_57779(backup,eraseCache); }
// public static void method_57779(Object backup,com.mojang.serialization.Dynamic eraseCache, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_57779(backup,eraseCache); }
// public void start(Object session,com.mojang.serialization.Dynamic levelProperties,boolean safeMode,java.lang.Runnable onCancel) { wrapperContained.start(session,levelProperties,safeMode,onCancel); }
// public static void start(Object session,com.mojang.serialization.Dynamic levelProperties,boolean safeMode,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,levelProperties,safeMode,onCancel); }
// public void start(Object session,yarnwrap.world.level.storage.LevelSummary summary,com.mojang.serialization.Dynamic levelProperties,java.lang.Runnable onCancel) { wrapperContained.start(session,summary.wrapperContained,levelProperties,onCancel); }
// public static void start(Object session,yarnwrap.world.level.storage.LevelSummary summary,com.mojang.serialization.Dynamic levelProperties,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,summary.wrapperContained,levelProperties,onCancel); }
// public void start(Object session,java.lang.Runnable onCancel) { wrapperContained.start(session,onCancel); }
// public static void start(Object session,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,onCancel); }
// public void method_57783(Object confirmed) { wrapperContained.method_57783(confirmed); }
// public static void method_57783(Object confirmed, ) { net.minecraft.server.integrated.IntegratedServerLoader.method_57783(confirmed); }
public void start(java.lang.String name,java.lang.Runnable onCancel) { wrapperContained.start(name,onCancel); }
// public static void start(java.lang.String name,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(name,onCancel); }
// public java.lang.Void method_57785(java.lang.Throwable throwable) { return wrapperContained.method_57785(throwable); }
// public static java.lang.Void method_57785(java.lang.Throwable throwable, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_57785(throwable); }
// public java.lang.Boolean method_57786(java.lang.Void v) { return wrapperContained.method_57786(v); }
// public static java.lang.Boolean method_57786(java.lang.Void v, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_57786(v); }
// public void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel) { wrapperContained.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public static void start(Object session,yarnwrap.server.SaveLoader saveLoader,yarnwrap.resource.ResourcePackManager dataPackManager,java.lang.Runnable onCancel, ) { net.minecraft.server.integrated.IntegratedServerLoader.start(session,saveLoader.wrapperContained,dataPackManager.wrapperContained,onCancel); }
// public java.util.concurrent.CompletionStage method_57789(java.lang.Throwable throwable) { return wrapperContained.method_57789(throwable); }
// public static java.util.concurrent.CompletionStage method_57789(java.lang.Throwable throwable, ) { return net.minecraft.server.integrated.IntegratedServerLoader.method_57789(throwable); }

}