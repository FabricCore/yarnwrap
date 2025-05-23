package yarnwrap.client;
public class MinecraftClient { public net.minecraft.client.MinecraftClient wrapperContained; public MinecraftClient(net.minecraft.client.MinecraftClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.WindowProvider windowProvider() { return new yarnwrap.client.util.WindowProvider(wrapperContained.windowProvider); }
// public void windowProvider(yarnwrap.client.util.WindowProvider value) { wrapperContained.windowProvider = value.wrapperContained; }
// public static yarnwrap.client.util.WindowProvider windowProvider() { return new yarnwrap.client.util.WindowProvider(net.minecraft.client.MinecraftClient.windowProvider); }
// public static void windowProvider(yarnwrap.client.util.WindowProvider value, ) { net.minecraft.client.MinecraftClient.windowProvider = value.wrapperContained; }

public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.MinecraftClient.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.MinecraftClient.world = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer framebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.framebuffer); }
// public void framebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.framebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer framebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.MinecraftClient.framebuffer); }
// public static void framebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.MinecraftClient.framebuffer = value.wrapperContained; }

public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public void options(yarnwrap.client.option.GameOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.MinecraftClient.options); }
// public static void options(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.MinecraftClient.options = value.wrapperContained; }

public yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(wrapperContained.targetedEntity); }
public void targetedEntity(yarnwrap.entity.Entity value) { wrapperContained.targetedEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.MinecraftClient.targetedEntity); }
// public static void targetedEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.MinecraftClient.targetedEntity = value.wrapperContained; }

// public boolean windowFocused() { return wrapperContained.windowFocused; }
// public void windowFocused(boolean value) { wrapperContained.windowFocused = value; }
// public static boolean windowFocused() { return net.minecraft.client.MinecraftClient.windowFocused; }
// public static void windowFocused(boolean value, ) { net.minecraft.client.MinecraftClient.windowFocused = value; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.client.MinecraftClient.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.client.MinecraftClient.thread = value; }

public java.io.File runDirectory() { return wrapperContained.runDirectory; }
// public void runDirectory(java.io.File value) { wrapperContained.runDirectory = value; }
// public static java.io.File runDirectory() { return net.minecraft.client.MinecraftClient.runDirectory; }
// public static void runDirectory(java.io.File value, ) { net.minecraft.client.MinecraftClient.runDirectory = value; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.client.MinecraftClient.running; }
// public static void running(boolean value, ) { net.minecraft.client.MinecraftClient.running = value; }

// public yarnwrap.client.MinecraftClient instance() { return new yarnwrap.client.MinecraftClient(wrapperContained.instance); }
// public void instance(yarnwrap.client.MinecraftClient value) { wrapperContained.instance = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient instance() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.MinecraftClient.instance); }
// public static void instance(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.MinecraftClient.instance = value.wrapperContained; }

// public yarnwrap.client.toast.ToastManager toastManager() { return new yarnwrap.client.toast.ToastManager(wrapperContained.toastManager); }
// public void toastManager(yarnwrap.client.toast.ToastManager value) { wrapperContained.toastManager = value.wrapperContained; }
// public static yarnwrap.client.toast.ToastManager toastManager() { return new yarnwrap.client.toast.ToastManager(net.minecraft.client.MinecraftClient.toastManager); }
// public static void toastManager(yarnwrap.client.toast.ToastManager value, ) { net.minecraft.client.MinecraftClient.toastManager = value.wrapperContained; }

// public boolean IS_SYSTEM_MAC() { return wrapperContained.IS_SYSTEM_MAC; }
// public void IS_SYSTEM_MAC(boolean value) { wrapperContained.IS_SYSTEM_MAC = value; }
public static boolean IS_SYSTEM_MAC() { return net.minecraft.client.MinecraftClient.IS_SYSTEM_MAC; }
// public static void IS_SYSTEM_MAC(boolean value, ) { net.minecraft.client.MinecraftClient.IS_SYSTEM_MAC = value; }

// public yarnwrap.client.util.Window window() { return new yarnwrap.client.util.Window(wrapperContained.window); }
// public void window(yarnwrap.client.util.Window value) { wrapperContained.window = value.wrapperContained; }
// public static yarnwrap.client.util.Window window() { return new yarnwrap.client.util.Window(net.minecraft.client.MinecraftClient.window); }
// public static void window(yarnwrap.client.util.Window value, ) { net.minecraft.client.MinecraftClient.window = value.wrapperContained; }

public yarnwrap.client.gui.hud.InGameHud inGameHud() { return new yarnwrap.client.gui.hud.InGameHud(wrapperContained.inGameHud); }
// public void inGameHud(yarnwrap.client.gui.hud.InGameHud value) { wrapperContained.inGameHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.InGameHud inGameHud() { return new yarnwrap.client.gui.hud.InGameHud(net.minecraft.client.MinecraftClient.inGameHud); }
// public static void inGameHud(yarnwrap.client.gui.hud.InGameHud value, ) { net.minecraft.client.MinecraftClient.inGameHud = value.wrapperContained; }

// public yarnwrap.client.texture.PlayerSkinProvider skinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(wrapperContained.skinProvider); }
// public void skinProvider(yarnwrap.client.texture.PlayerSkinProvider value) { wrapperContained.skinProvider = value.wrapperContained; }
// public static yarnwrap.client.texture.PlayerSkinProvider skinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(net.minecraft.client.MinecraftClient.skinProvider); }
// public static void skinProvider(yarnwrap.client.texture.PlayerSkinProvider value, ) { net.minecraft.client.MinecraftClient.skinProvider = value.wrapperContained; }

// public yarnwrap.client.font.FontManager fontManager() { return new yarnwrap.client.font.FontManager(wrapperContained.fontManager); }
// public void fontManager(yarnwrap.client.font.FontManager value) { wrapperContained.fontManager = value.wrapperContained; }
// public static yarnwrap.client.font.FontManager fontManager() { return new yarnwrap.client.font.FontManager(net.minecraft.client.MinecraftClient.fontManager); }
// public static void fontManager(yarnwrap.client.font.FontManager value, ) { net.minecraft.client.MinecraftClient.fontManager = value.wrapperContained; }

public yarnwrap.client.render.debug.DebugRenderer debugRenderer() { return new yarnwrap.client.render.debug.DebugRenderer(wrapperContained.debugRenderer); }
// public void debugRenderer(yarnwrap.client.render.debug.DebugRenderer value) { wrapperContained.debugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.DebugRenderer debugRenderer() { return new yarnwrap.client.render.debug.DebugRenderer(net.minecraft.client.MinecraftClient.debugRenderer); }
// public static void debugRenderer(yarnwrap.client.render.debug.DebugRenderer value, ) { net.minecraft.client.MinecraftClient.debugRenderer = value.wrapperContained; }

// public java.lang.String gameVersion() { return wrapperContained.gameVersion; }
// public void gameVersion(java.lang.String value) { wrapperContained.gameVersion = value; }
// public static java.lang.String gameVersion() { return net.minecraft.client.MinecraftClient.gameVersion; }
// public static void gameVersion(java.lang.String value, ) { net.minecraft.client.MinecraftClient.gameVersion = value; }

// public long nextDebugInfoUpdateTime() { return wrapperContained.nextDebugInfoUpdateTime; }
// public void nextDebugInfoUpdateTime(long value) { wrapperContained.nextDebugInfoUpdateTime = value; }
// public static long nextDebugInfoUpdateTime() { return net.minecraft.client.MinecraftClient.nextDebugInfoUpdateTime; }
// public static void nextDebugInfoUpdateTime(long value, ) { net.minecraft.client.MinecraftClient.nextDebugInfoUpdateTime = value; }

public yarnwrap.client.particle.ParticleManager particleManager() { return new yarnwrap.client.particle.ParticleManager(wrapperContained.particleManager); }
// public void particleManager(yarnwrap.client.particle.ParticleManager value) { wrapperContained.particleManager = value.wrapperContained; }
// public static yarnwrap.client.particle.ParticleManager particleManager() { return new yarnwrap.client.particle.ParticleManager(net.minecraft.client.MinecraftClient.particleManager); }
// public static void particleManager(yarnwrap.client.particle.ParticleManager value, ) { net.minecraft.client.MinecraftClient.particleManager = value.wrapperContained; }

// public yarnwrap.client.sound.MusicTracker musicTracker() { return new yarnwrap.client.sound.MusicTracker(wrapperContained.musicTracker); }
// public void musicTracker(yarnwrap.client.sound.MusicTracker value) { wrapperContained.musicTracker = value.wrapperContained; }
// public static yarnwrap.client.sound.MusicTracker musicTracker() { return new yarnwrap.client.sound.MusicTracker(net.minecraft.client.MinecraftClient.musicTracker); }
// public static void musicTracker(yarnwrap.client.sound.MusicTracker value, ) { net.minecraft.client.MinecraftClient.musicTracker = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public void resourcePackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.resourcePackManager = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.client.MinecraftClient.resourcePackManager); }
// public static void resourcePackManager(yarnwrap.resource.ResourcePackManager value, ) { net.minecraft.client.MinecraftClient.resourcePackManager = value.wrapperContained; }

// public yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.languageManager); }
// public void languageManager(yarnwrap.client.resource.language.LanguageManager value) { wrapperContained.languageManager = value.wrapperContained; }
// public static yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(net.minecraft.client.MinecraftClient.languageManager); }
// public static void languageManager(yarnwrap.client.resource.language.LanguageManager value, ) { net.minecraft.client.MinecraftClient.languageManager = value.wrapperContained; }

public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
public void cameraEntity(yarnwrap.entity.Entity value) { wrapperContained.cameraEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.MinecraftClient.cameraEntity); }
// public static void cameraEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.MinecraftClient.cameraEntity = value.wrapperContained; }

// public java.lang.String versionType() { return wrapperContained.versionType; }
// public void versionType(java.lang.String value) { wrapperContained.versionType = value; }
// public static java.lang.String versionType() { return net.minecraft.client.MinecraftClient.versionType; }
// public static void versionType(java.lang.String value, ) { net.minecraft.client.MinecraftClient.versionType = value; }

// public boolean isDemo() { return wrapperContained.isDemo; }
// public void isDemo(boolean value) { wrapperContained.isDemo = value; }
// public static boolean isDemo() { return net.minecraft.client.MinecraftClient.isDemo; }
// public static void isDemo(boolean value, ) { net.minecraft.client.MinecraftClient.isDemo = value; }

// public com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return wrapperContained.sessionService; }
// public void sessionService(com.mojang.authlib.minecraft.MinecraftSessionService value) { wrapperContained.sessionService = value; }
// public static com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return net.minecraft.client.MinecraftClient.sessionService; }
// public static void sessionService(com.mojang.authlib.minecraft.MinecraftSessionService value, ) { net.minecraft.client.MinecraftClient.sessionService = value; }

public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.MinecraftClient.player); }
// public static void player(yarnwrap.client.network.ClientPlayerEntity value, ) { net.minecraft.client.MinecraftClient.player = value.wrapperContained; }

// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
// public void session(yarnwrap.client.session.Session value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(net.minecraft.client.MinecraftClient.session); }
// public static void session(yarnwrap.client.session.Session value, ) { net.minecraft.client.MinecraftClient.session = value.wrapperContained; }

// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public void soundManager(yarnwrap.client.sound.SoundManager value) { wrapperContained.soundManager = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(net.minecraft.client.MinecraftClient.soundManager); }
// public static void soundManager(yarnwrap.client.sound.SoundManager value, ) { net.minecraft.client.MinecraftClient.soundManager = value.wrapperContained; }

public yarnwrap.client.Mouse mouse() { return new yarnwrap.client.Mouse(wrapperContained.mouse); }
// public void mouse(yarnwrap.client.Mouse value) { wrapperContained.mouse = value.wrapperContained; }
// public static yarnwrap.client.Mouse mouse() { return new yarnwrap.client.Mouse(net.minecraft.client.MinecraftClient.mouse); }
// public static void mouse(yarnwrap.client.Mouse value, ) { net.minecraft.client.MinecraftClient.mouse = value.wrapperContained; }

public boolean chunkCullingEnabled() { return wrapperContained.chunkCullingEnabled; }
public void chunkCullingEnabled(boolean value) { wrapperContained.chunkCullingEnabled = value; }
// public static boolean chunkCullingEnabled() { return net.minecraft.client.MinecraftClient.chunkCullingEnabled; }
// public static void chunkCullingEnabled(boolean value, ) { net.minecraft.client.MinecraftClient.chunkCullingEnabled = value; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.MinecraftClient.entityRenderDispatcher); }
// public static void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.MinecraftClient.entityRenderDispatcher = value.wrapperContained; }

// public yarnwrap.client.option.HotbarStorage creativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(wrapperContained.creativeHotbarStorage); }
// public void creativeHotbarStorage(yarnwrap.client.option.HotbarStorage value) { wrapperContained.creativeHotbarStorage = value.wrapperContained; }
// public static yarnwrap.client.option.HotbarStorage creativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(net.minecraft.client.MinecraftClient.creativeHotbarStorage); }
// public static void creativeHotbarStorage(yarnwrap.client.option.HotbarStorage value, ) { net.minecraft.client.MinecraftClient.creativeHotbarStorage = value.wrapperContained; }

// public boolean paused() { return wrapperContained.paused; }
// public void paused(boolean value) { wrapperContained.paused = value; }
// public static boolean paused() { return net.minecraft.client.MinecraftClient.paused; }
// public static void paused(boolean value, ) { net.minecraft.client.MinecraftClient.paused = value; }

// public int fpsCounter() { return wrapperContained.fpsCounter; }
// public void fpsCounter(int value) { wrapperContained.fpsCounter = value; }
// public static int fpsCounter() { return net.minecraft.client.MinecraftClient.fpsCounter; }
// public static void fpsCounter(int value, ) { net.minecraft.client.MinecraftClient.fpsCounter = value; }

// public int currentFps() { return wrapperContained.currentFps; }
// public void currentFps(int value) { wrapperContained.currentFps = value; }
// public static int currentFps() { return net.minecraft.client.MinecraftClient.currentFps; }
// public static void currentFps(int value, ) { net.minecraft.client.MinecraftClient.currentFps = value; }

// public java.net.Proxy networkProxy() { return wrapperContained.networkProxy; }
// public void networkProxy(java.net.Proxy value) { wrapperContained.networkProxy = value; }
// public static java.net.Proxy networkProxy() { return net.minecraft.client.MinecraftClient.networkProxy; }
// public static void networkProxy(java.net.Proxy value, ) { net.minecraft.client.MinecraftClient.networkProxy = value; }

// public yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_FONT_ID); }
// public void DEFAULT_FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_FONT_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.MinecraftClient.DEFAULT_FONT_ID); }
// public static void DEFAULT_FONT_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.MinecraftClient.DEFAULT_FONT_ID = value.wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.MinecraftClient.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.MinecraftClient.itemRenderer = value.wrapperContained; }

public boolean skipGameRender() { return wrapperContained.skipGameRender; }
public void skipGameRender(boolean value) { wrapperContained.skipGameRender = value; }
// public static boolean skipGameRender() { return net.minecraft.client.MinecraftClient.skipGameRender; }
// public static void skipGameRender(boolean value, ) { net.minecraft.client.MinecraftClient.skipGameRender = value; }

// public yarnwrap.resource.ReloadableResourceManagerImpl resourceManager() { return new yarnwrap.resource.ReloadableResourceManagerImpl(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ReloadableResourceManagerImpl value) { wrapperContained.resourceManager = value.wrapperContained; }
// public static yarnwrap.resource.ReloadableResourceManagerImpl resourceManager() { return new yarnwrap.resource.ReloadableResourceManagerImpl(net.minecraft.client.MinecraftClient.resourceManager); }
// public static void resourceManager(yarnwrap.resource.ReloadableResourceManagerImpl value, ) { net.minecraft.client.MinecraftClient.resourceManager = value.wrapperContained; }

// public yarnwrap.network.ClientConnection integratedServerConnection() { return new yarnwrap.network.ClientConnection(wrapperContained.integratedServerConnection); }
// public void integratedServerConnection(yarnwrap.network.ClientConnection value) { wrapperContained.integratedServerConnection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection integratedServerConnection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.MinecraftClient.integratedServerConnection); }
// public static void integratedServerConnection(yarnwrap.network.ClientConnection value, ) { net.minecraft.client.MinecraftClient.integratedServerConnection = value.wrapperContained; }

// public java.util.function.Supplier crashReportSupplier() { return wrapperContained.crashReportSupplier; }
// public void crashReportSupplier(java.util.function.Supplier value) { wrapperContained.crashReportSupplier = value; }
// public static java.util.function.Supplier crashReportSupplier() { return net.minecraft.client.MinecraftClient.crashReportSupplier; }
// public static void crashReportSupplier(java.util.function.Supplier value, ) { net.minecraft.client.MinecraftClient.crashReportSupplier = value; }

// public yarnwrap.world.level.storage.LevelStorage levelStorage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.levelStorage); }
// public void levelStorage(yarnwrap.world.level.storage.LevelStorage value) { wrapperContained.levelStorage = value.wrapperContained; }
// public static yarnwrap.world.level.storage.LevelStorage levelStorage() { return new yarnwrap.world.level.storage.LevelStorage(net.minecraft.client.MinecraftClient.levelStorage); }
// public static void levelStorage(yarnwrap.world.level.storage.LevelStorage value, ) { net.minecraft.client.MinecraftClient.levelStorage = value.wrapperContained; }

// public yarnwrap.util.Identifier ALT_TEXT_RENDERER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ALT_TEXT_RENDERER_ID); }
// public void ALT_TEXT_RENDERER_ID(yarnwrap.util.Identifier value) { wrapperContained.ALT_TEXT_RENDERER_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier ALT_TEXT_RENDERER_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.MinecraftClient.ALT_TEXT_RENDERER_ID); }
// public static void ALT_TEXT_RENDERER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.MinecraftClient.ALT_TEXT_RENDERER_ID = value.wrapperContained; }

// public long lastMetricsSampleTime() { return wrapperContained.lastMetricsSampleTime; }
// public void lastMetricsSampleTime(long value) { wrapperContained.lastMetricsSampleTime = value; }
// public static long lastMetricsSampleTime() { return net.minecraft.client.MinecraftClient.lastMetricsSampleTime; }
// public static void lastMetricsSampleTime(long value, ) { net.minecraft.client.MinecraftClient.lastMetricsSampleTime = value; }

// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public void blockColors(yarnwrap.client.color.block.BlockColors value) { wrapperContained.blockColors = value.wrapperContained; }
// public static yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(net.minecraft.client.MinecraftClient.blockColors); }
// public static void blockColors(yarnwrap.client.color.block.BlockColors value, ) { net.minecraft.client.MinecraftClient.blockColors = value.wrapperContained; }

// public int itemUseCooldown() { return wrapperContained.itemUseCooldown; }
// public void itemUseCooldown(int value) { wrapperContained.itemUseCooldown = value; }
// public static int itemUseCooldown() { return net.minecraft.client.MinecraftClient.itemUseCooldown; }
// public static void itemUseCooldown(int value, ) { net.minecraft.client.MinecraftClient.itemUseCooldown = value; }

public yarnwrap.client.gui.screen.Screen currentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.currentScreen); }
public void currentScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.currentScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen currentScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.MinecraftClient.currentScreen); }
// public static void currentScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.MinecraftClient.currentScreen = value.wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.MinecraftClient.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.MinecraftClient.blockRenderManager = value.wrapperContained; }

// public java.nio.file.Path resourcePackDir() { return wrapperContained.resourcePackDir; }
// public void resourcePackDir(java.nio.file.Path value) { wrapperContained.resourcePackDir = value; }
// public static java.nio.file.Path resourcePackDir() { return net.minecraft.client.MinecraftClient.resourcePackDir; }
// public static void resourcePackDir(java.nio.file.Path value, ) { net.minecraft.client.MinecraftClient.resourcePackDir = value; }

// public yarnwrap.client.tutorial.TutorialManager tutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.tutorialManager); }
// public void tutorialManager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.tutorialManager = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialManager tutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(net.minecraft.client.MinecraftClient.tutorialManager); }
// public static void tutorialManager(yarnwrap.client.tutorial.TutorialManager value, ) { net.minecraft.client.MinecraftClient.tutorialManager = value.wrapperContained; }

// public boolean integratedServerRunning() { return wrapperContained.integratedServerRunning; }
// public void integratedServerRunning(boolean value) { wrapperContained.integratedServerRunning = value; }
// public static boolean integratedServerRunning() { return net.minecraft.client.MinecraftClient.integratedServerRunning; }
// public static void integratedServerRunning(boolean value, ) { net.minecraft.client.MinecraftClient.integratedServerRunning = value; }

public yarnwrap.client.network.ClientPlayerInteractionManager interactionManager() { return new yarnwrap.client.network.ClientPlayerInteractionManager(wrapperContained.interactionManager); }
public void interactionManager(yarnwrap.client.network.ClientPlayerInteractionManager value) { wrapperContained.interactionManager = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerInteractionManager interactionManager() { return new yarnwrap.client.network.ClientPlayerInteractionManager(net.minecraft.client.MinecraftClient.interactionManager); }
// public static void interactionManager(yarnwrap.client.network.ClientPlayerInteractionManager value, ) { net.minecraft.client.MinecraftClient.interactionManager = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.MinecraftClient.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.MinecraftClient.LOGGER = value; }

// public yarnwrap.client.render.model.BakedModelManager bakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.bakedModelManager); }
// public void bakedModelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.bakedModelManager = value.wrapperContained; }
// public static yarnwrap.client.render.model.BakedModelManager bakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.MinecraftClient.bakedModelManager); }
// public static void bakedModelManager(yarnwrap.client.render.model.BakedModelManager value, ) { net.minecraft.client.MinecraftClient.bakedModelManager = value.wrapperContained; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.MinecraftClient.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.MinecraftClient.textureManager = value.wrapperContained; }

public yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(wrapperContained.crosshairTarget); }
public void crosshairTarget(yarnwrap.util.hit.HitResult value) { wrapperContained.crosshairTarget = value.wrapperContained; }
// public static yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(net.minecraft.client.MinecraftClient.crosshairTarget); }
// public static void crosshairTarget(yarnwrap.util.hit.HitResult value, ) { net.minecraft.client.MinecraftClient.crosshairTarget = value.wrapperContained; }

// public yarnwrap.server.integrated.IntegratedServer server() { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.server); }
// public void server(yarnwrap.server.integrated.IntegratedServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.integrated.IntegratedServer server() { return new yarnwrap.server.integrated.IntegratedServer(net.minecraft.client.MinecraftClient.server); }
// public static void server(yarnwrap.server.integrated.IntegratedServer value, ) { net.minecraft.client.MinecraftClient.server = value.wrapperContained; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.client.MinecraftClient.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.client.MinecraftClient.dataFixer = value; }

public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.MinecraftClient.worldRenderer); }
// public static void worldRenderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.MinecraftClient.worldRenderer = value.wrapperContained; }

public java.lang.String fpsDebugString() { return wrapperContained.fpsDebugString; }
public void fpsDebugString(java.lang.String value) { wrapperContained.fpsDebugString = value; }
// public static java.lang.String fpsDebugString() { return net.minecraft.client.MinecraftClient.fpsDebugString; }
// public static void fpsDebugString(java.lang.String value, ) { net.minecraft.client.MinecraftClient.fpsDebugString = value; }

public int attackCooldown() { return wrapperContained.attackCooldown; }
public void attackCooldown(int value) { wrapperContained.attackCooldown = value; }
// public static int attackCooldown() { return net.minecraft.client.MinecraftClient.attackCooldown; }
// public static void attackCooldown(int value, ) { net.minecraft.client.MinecraftClient.attackCooldown = value; }

public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.MinecraftClient.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.MinecraftClient.textRenderer = value.wrapperContained; }

public yarnwrap.client.render.GameRenderer gameRenderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.gameRenderer); }
// public void gameRenderer(yarnwrap.client.render.GameRenderer value) { wrapperContained.gameRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.GameRenderer gameRenderer() { return new yarnwrap.client.render.GameRenderer(net.minecraft.client.MinecraftClient.gameRenderer); }
// public static void gameRenderer(yarnwrap.client.render.GameRenderer value, ) { net.minecraft.client.MinecraftClient.gameRenderer = value.wrapperContained; }

public yarnwrap.client.Keyboard keyboard() { return new yarnwrap.client.Keyboard(wrapperContained.keyboard); }
// public void keyboard(yarnwrap.client.Keyboard value) { wrapperContained.keyboard = value.wrapperContained; }
// public static yarnwrap.client.Keyboard keyboard() { return new yarnwrap.client.Keyboard(net.minecraft.client.MinecraftClient.keyboard); }
// public static void keyboard(yarnwrap.client.Keyboard value, ) { net.minecraft.client.MinecraftClient.keyboard = value.wrapperContained; }

// public java.util.Queue renderTaskQueue() { return wrapperContained.renderTaskQueue; }
// public void renderTaskQueue(java.util.Queue value) { wrapperContained.renderTaskQueue = value; }
// public static java.util.Queue renderTaskQueue() { return net.minecraft.client.MinecraftClient.renderTaskQueue; }
// public static void renderTaskQueue(java.util.Queue value, ) { net.minecraft.client.MinecraftClient.renderTaskQueue = value; }

// public java.util.concurrent.atomic.AtomicReference worldGenProgressTracker() { return wrapperContained.worldGenProgressTracker; }
// public void worldGenProgressTracker(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.worldGenProgressTracker = value; }
// public static java.util.concurrent.atomic.AtomicReference worldGenProgressTracker() { return net.minecraft.client.MinecraftClient.worldGenProgressTracker; }
// public static void worldGenProgressTracker(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.MinecraftClient.worldGenProgressTracker = value; }

// public yarnwrap.client.resource.SplashTextResourceSupplier splashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(wrapperContained.splashTextLoader); }
// public void splashTextLoader(yarnwrap.client.resource.SplashTextResourceSupplier value) { wrapperContained.splashTextLoader = value.wrapperContained; }
// public static yarnwrap.client.resource.SplashTextResourceSupplier splashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(net.minecraft.client.MinecraftClient.splashTextLoader); }
// public static void splashTextLoader(yarnwrap.client.resource.SplashTextResourceSupplier value, ) { net.minecraft.client.MinecraftClient.splashTextLoader = value.wrapperContained; }

// public yarnwrap.client.texture.PaintingManager paintingManager() { return new yarnwrap.client.texture.PaintingManager(wrapperContained.paintingManager); }
// public void paintingManager(yarnwrap.client.texture.PaintingManager value) { wrapperContained.paintingManager = value.wrapperContained; }
// public static yarnwrap.client.texture.PaintingManager paintingManager() { return new yarnwrap.client.texture.PaintingManager(net.minecraft.client.MinecraftClient.paintingManager); }
// public static void paintingManager(yarnwrap.client.texture.PaintingManager value, ) { net.minecraft.client.MinecraftClient.paintingManager = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture COMPLETED_UNIT_FUTURE() { return wrapperContained.COMPLETED_UNIT_FUTURE; }
// public void COMPLETED_UNIT_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.COMPLETED_UNIT_FUTURE = value; }
// public static java.util.concurrent.CompletableFuture COMPLETED_UNIT_FUTURE() { return net.minecraft.client.MinecraftClient.COMPLETED_UNIT_FUTURE; }
// public static void COMPLETED_UNIT_FUTURE(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.MinecraftClient.COMPLETED_UNIT_FUTURE = value; }

// public java.util.concurrent.CompletableFuture resourceReloadFuture() { return wrapperContained.resourceReloadFuture; }
// public void resourceReloadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.resourceReloadFuture = value; }
// public static java.util.concurrent.CompletableFuture resourceReloadFuture() { return net.minecraft.client.MinecraftClient.resourceReloadFuture; }
// public static void resourceReloadFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.MinecraftClient.resourceReloadFuture = value; }

// public yarnwrap.client.gui.screen.Overlay overlay() { return new yarnwrap.client.gui.screen.Overlay(wrapperContained.overlay); }
// public void overlay(yarnwrap.client.gui.screen.Overlay value) { wrapperContained.overlay = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Overlay overlay() { return new yarnwrap.client.gui.screen.Overlay(net.minecraft.client.MinecraftClient.overlay); }
// public static void overlay(yarnwrap.client.gui.screen.Overlay value, ) { net.minecraft.client.MinecraftClient.overlay = value.wrapperContained; }

public boolean debugChunkInfo() { return wrapperContained.debugChunkInfo; }
public void debugChunkInfo(boolean value) { wrapperContained.debugChunkInfo = value; }
// public static boolean debugChunkInfo() { return net.minecraft.client.MinecraftClient.debugChunkInfo; }
// public static void debugChunkInfo(boolean value, ) { net.minecraft.client.MinecraftClient.debugChunkInfo = value; }

public boolean debugChunkOcclusion() { return wrapperContained.debugChunkOcclusion; }
public void debugChunkOcclusion(boolean value) { wrapperContained.debugChunkOcclusion = value; }
// public static boolean debugChunkOcclusion() { return net.minecraft.client.MinecraftClient.debugChunkOcclusion; }
// public static void debugChunkOcclusion(boolean value, ) { net.minecraft.client.MinecraftClient.debugChunkOcclusion = value; }

// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferBuilders = value.wrapperContained; }
// public static yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.MinecraftClient.bufferBuilders); }
// public static void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value, ) { net.minecraft.client.MinecraftClient.bufferBuilders = value.wrapperContained; }

// public int trackingTick() { return wrapperContained.trackingTick; }
// public void trackingTick(int value) { wrapperContained.trackingTick = value; }
// public static int trackingTick() { return net.minecraft.client.MinecraftClient.trackingTick; }
// public static void trackingTick(int value, ) { net.minecraft.client.MinecraftClient.trackingTick = value; }

// public yarnwrap.util.profiler.TickTimeTracker tickTimeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(wrapperContained.tickTimeTracker); }
// public void tickTimeTracker(yarnwrap.util.profiler.TickTimeTracker value) { wrapperContained.tickTimeTracker = value.wrapperContained; }
// public static yarnwrap.util.profiler.TickTimeTracker tickTimeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(net.minecraft.client.MinecraftClient.tickTimeTracker); }
// public static void tickTimeTracker(yarnwrap.util.profiler.TickTimeTracker value, ) { net.minecraft.client.MinecraftClient.tickTimeTracker = value.wrapperContained; }

// public yarnwrap.util.Identifier UNICODE_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.UNICODE_FONT_ID); }
// public void UNICODE_FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.UNICODE_FONT_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier UNICODE_FONT_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.MinecraftClient.UNICODE_FONT_ID); }
// public static void UNICODE_FONT_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.MinecraftClient.UNICODE_FONT_ID = value.wrapperContained; }

// public boolean multiplayerEnabled() { return wrapperContained.multiplayerEnabled; }
// public void multiplayerEnabled(boolean value) { wrapperContained.multiplayerEnabled = value; }
// public static boolean multiplayerEnabled() { return net.minecraft.client.MinecraftClient.multiplayerEnabled; }
// public static void multiplayerEnabled(boolean value, ) { net.minecraft.client.MinecraftClient.multiplayerEnabled = value; }

// public boolean onlineChatEnabled() { return wrapperContained.onlineChatEnabled; }
// public void onlineChatEnabled(boolean value) { wrapperContained.onlineChatEnabled = value; }
// public static boolean onlineChatEnabled() { return net.minecraft.client.MinecraftClient.onlineChatEnabled; }
// public static void onlineChatEnabled(boolean value, ) { net.minecraft.client.MinecraftClient.onlineChatEnabled = value; }

// public yarnwrap.client.resource.VideoWarningManager videoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.videoWarningManager); }
// public void videoWarningManager(yarnwrap.client.resource.VideoWarningManager value) { wrapperContained.videoWarningManager = value.wrapperContained; }
// public static yarnwrap.client.resource.VideoWarningManager videoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(net.minecraft.client.MinecraftClient.videoWarningManager); }
// public static void videoWarningManager(yarnwrap.client.resource.VideoWarningManager value, ) { net.minecraft.client.MinecraftClient.videoWarningManager = value.wrapperContained; }

// public yarnwrap.text.Text SOCIAL_INTERACTIONS_NOT_AVAILABLE() { return new yarnwrap.text.Text(wrapperContained.SOCIAL_INTERACTIONS_NOT_AVAILABLE); }
// public void SOCIAL_INTERACTIONS_NOT_AVAILABLE(yarnwrap.text.Text value) { wrapperContained.SOCIAL_INTERACTIONS_NOT_AVAILABLE = value.wrapperContained; }
// public static yarnwrap.text.Text SOCIAL_INTERACTIONS_NOT_AVAILABLE() { return new yarnwrap.text.Text(net.minecraft.client.MinecraftClient.SOCIAL_INTERACTIONS_NOT_AVAILABLE); }
// public static void SOCIAL_INTERACTIONS_NOT_AVAILABLE(yarnwrap.text.Text value, ) { net.minecraft.client.MinecraftClient.SOCIAL_INTERACTIONS_NOT_AVAILABLE = value.wrapperContained; }

// public yarnwrap.client.network.SocialInteractionsManager socialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(wrapperContained.socialInteractionsManager); }
// public void socialInteractionsManager(yarnwrap.client.network.SocialInteractionsManager value) { wrapperContained.socialInteractionsManager = value.wrapperContained; }
// public static yarnwrap.client.network.SocialInteractionsManager socialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(net.minecraft.client.MinecraftClient.socialInteractionsManager); }
// public static void socialInteractionsManager(yarnwrap.client.network.SocialInteractionsManager value, ) { net.minecraft.client.MinecraftClient.socialInteractionsManager = value.wrapperContained; }

// public yarnwrap.client.toast.TutorialToast socialInteractionsToast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.socialInteractionsToast); }
// public void socialInteractionsToast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.socialInteractionsToast = value.wrapperContained; }
// public static yarnwrap.client.toast.TutorialToast socialInteractionsToast() { return new yarnwrap.client.toast.TutorialToast(net.minecraft.client.MinecraftClient.socialInteractionsToast); }
// public static void socialInteractionsToast(yarnwrap.client.toast.TutorialToast value, ) { net.minecraft.client.MinecraftClient.socialInteractionsToast = value.wrapperContained; }

// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public static com.mojang.authlib.minecraft.UserApiService userApiService() { return net.minecraft.client.MinecraftClient.userApiService; }
// public static void userApiService(com.mojang.authlib.minecraft.UserApiService value, ) { net.minecraft.client.MinecraftClient.userApiService = value; }

// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value) { wrapperContained.blockEntityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(net.minecraft.client.MinecraftClient.blockEntityRenderDispatcher); }
// public static void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value, ) { net.minecraft.client.MinecraftClient.blockEntityRenderDispatcher = value.wrapperContained; }

// public yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(wrapperContained.recorder); }
// public void recorder(yarnwrap.util.profiler.Recorder value) { wrapperContained.recorder = value.wrapperContained; }
// public static yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(net.minecraft.client.MinecraftClient.recorder); }
// public static void recorder(yarnwrap.util.profiler.Recorder value, ) { net.minecraft.client.MinecraftClient.recorder = value.wrapperContained; }

public boolean wireFrame() { return wrapperContained.wireFrame; }
public void wireFrame(boolean value) { wrapperContained.wireFrame = value; }
// public static boolean wireFrame() { return net.minecraft.client.MinecraftClient.wireFrame; }
// public static void wireFrame(boolean value, ) { net.minecraft.client.MinecraftClient.wireFrame = value; }

// public yarnwrap.client.resource.ResourceReloadLogger resourceReloadLogger() { return new yarnwrap.client.resource.ResourceReloadLogger(wrapperContained.resourceReloadLogger); }
// public void resourceReloadLogger(yarnwrap.client.resource.ResourceReloadLogger value) { wrapperContained.resourceReloadLogger = value.wrapperContained; }
// public static yarnwrap.client.resource.ResourceReloadLogger resourceReloadLogger() { return new yarnwrap.client.resource.ResourceReloadLogger(net.minecraft.client.MinecraftClient.resourceReloadLogger); }
// public static void resourceReloadLogger(yarnwrap.client.resource.ResourceReloadLogger value, ) { net.minecraft.client.MinecraftClient.resourceReloadLogger = value.wrapperContained; }

// public java.lang.String GL_ERROR_DIALOGUE() { return wrapperContained.GL_ERROR_DIALOGUE; }
// public void GL_ERROR_DIALOGUE(java.lang.String value) { wrapperContained.GL_ERROR_DIALOGUE = value; }
public static java.lang.String GL_ERROR_DIALOGUE() { return net.minecraft.client.MinecraftClient.GL_ERROR_DIALOGUE; }
// public static void GL_ERROR_DIALOGUE(java.lang.String value, ) { net.minecraft.client.MinecraftClient.GL_ERROR_DIALOGUE = value; }

// public yarnwrap.util.Identifier REGIONAL_COMPLIANCIES_ID() { return new yarnwrap.util.Identifier(wrapperContained.REGIONAL_COMPLIANCIES_ID); }
// public void REGIONAL_COMPLIANCIES_ID(yarnwrap.util.Identifier value) { wrapperContained.REGIONAL_COMPLIANCIES_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier REGIONAL_COMPLIANCIES_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.MinecraftClient.REGIONAL_COMPLIANCIES_ID); }
// public static void REGIONAL_COMPLIANCIES_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.MinecraftClient.REGIONAL_COMPLIANCIES_ID = value.wrapperContained; }

// public yarnwrap.client.resource.PeriodicNotificationManager regionalComplianciesManager() { return new yarnwrap.client.resource.PeriodicNotificationManager(wrapperContained.regionalComplianciesManager); }
// public void regionalComplianciesManager(yarnwrap.client.resource.PeriodicNotificationManager value) { wrapperContained.regionalComplianciesManager = value.wrapperContained; }
// public static yarnwrap.client.resource.PeriodicNotificationManager regionalComplianciesManager() { return new yarnwrap.client.resource.PeriodicNotificationManager(net.minecraft.client.MinecraftClient.regionalComplianciesManager); }
// public static void regionalComplianciesManager(yarnwrap.client.resource.PeriodicNotificationManager value, ) { net.minecraft.client.MinecraftClient.regionalComplianciesManager = value.wrapperContained; }

// public long metricsSampleDuration() { return wrapperContained.metricsSampleDuration; }
// public void metricsSampleDuration(long value) { wrapperContained.metricsSampleDuration = value; }
// public static long metricsSampleDuration() { return net.minecraft.client.MinecraftClient.metricsSampleDuration; }
// public static void metricsSampleDuration(long value, ) { net.minecraft.client.MinecraftClient.metricsSampleDuration = value; }

// public double gpuUtilizationPercentage() { return wrapperContained.gpuUtilizationPercentage; }
// public void gpuUtilizationPercentage(double value) { wrapperContained.gpuUtilizationPercentage = value; }
// public static double gpuUtilizationPercentage() { return net.minecraft.client.MinecraftClient.gpuUtilizationPercentage; }
// public static void gpuUtilizationPercentage(double value, ) { net.minecraft.client.MinecraftClient.gpuUtilizationPercentage = value; }

// public Object currentGlTimerQuery() { return wrapperContained.currentGlTimerQuery; }
// // public void currentGlTimerQuery(Object value) { wrapperContained.currentGlTimerQuery = value; }
// // public static Object currentGlTimerQuery() { return net.minecraft.client.MinecraftClient.currentGlTimerQuery; }
// // public static void currentGlTimerQuery(Object value, ) { net.minecraft.client.MinecraftClient.currentGlTimerQuery = value; }

// public yarnwrap.client.session.ProfileKeys profileKeys() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.profileKeys); }
// public void profileKeys(yarnwrap.client.session.ProfileKeys value) { wrapperContained.profileKeys = value.wrapperContained; }
// public static yarnwrap.client.session.ProfileKeys profileKeys() { return new yarnwrap.client.session.ProfileKeys(net.minecraft.client.MinecraftClient.profileKeys); }
// public static void profileKeys(yarnwrap.client.session.ProfileKeys value, ) { net.minecraft.client.MinecraftClient.profileKeys = value.wrapperContained; }

// public com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authenticationService() { return wrapperContained.authenticationService; }
// public void authenticationService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService value) { wrapperContained.authenticationService = value; }
// public static com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authenticationService() { return net.minecraft.client.MinecraftClient.authenticationService; }
// public static void authenticationService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService value, ) { net.minecraft.client.MinecraftClient.authenticationService = value; }

// public yarnwrap.client.session.report.AbuseReportContext abuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.abuseReportContext); }
// public void abuseReportContext(yarnwrap.client.session.report.AbuseReportContext value) { wrapperContained.abuseReportContext = value.wrapperContained; }
// public static yarnwrap.client.session.report.AbuseReportContext abuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(net.minecraft.client.MinecraftClient.abuseReportContext); }
// public static void abuseReportContext(yarnwrap.client.session.report.AbuseReportContext value, ) { net.minecraft.client.MinecraftClient.abuseReportContext = value.wrapperContained; }

// public yarnwrap.client.realms.RealmsPeriodicCheckers realmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(wrapperContained.realmsPeriodicCheckers); }
// public void realmsPeriodicCheckers(yarnwrap.client.realms.RealmsPeriodicCheckers value) { wrapperContained.realmsPeriodicCheckers = value.wrapperContained; }
// public static yarnwrap.client.realms.RealmsPeriodicCheckers realmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(net.minecraft.client.MinecraftClient.realmsPeriodicCheckers); }
// public static void realmsPeriodicCheckers(yarnwrap.client.realms.RealmsPeriodicCheckers value, ) { net.minecraft.client.MinecraftClient.realmsPeriodicCheckers = value.wrapperContained; }

// public yarnwrap.client.util.NarratorManager narratorManager() { return new yarnwrap.client.util.NarratorManager(wrapperContained.narratorManager); }
// public void narratorManager(yarnwrap.client.util.NarratorManager value) { wrapperContained.narratorManager = value.wrapperContained; }
// public static yarnwrap.client.util.NarratorManager narratorManager() { return new yarnwrap.client.util.NarratorManager(net.minecraft.client.MinecraftClient.narratorManager); }
// public static void narratorManager(yarnwrap.client.util.NarratorManager value, ) { net.minecraft.client.MinecraftClient.narratorManager = value.wrapperContained; }

// public yarnwrap.client.network.message.MessageHandler messageHandler() { return new yarnwrap.client.network.message.MessageHandler(wrapperContained.messageHandler); }
// public void messageHandler(yarnwrap.client.network.message.MessageHandler value) { wrapperContained.messageHandler = value.wrapperContained; }
// public static yarnwrap.client.network.message.MessageHandler messageHandler() { return new yarnwrap.client.network.message.MessageHandler(net.minecraft.client.MinecraftClient.messageHandler); }
// public static void messageHandler(yarnwrap.client.network.message.MessageHandler value, ) { net.minecraft.client.MinecraftClient.messageHandler = value.wrapperContained; }

public yarnwrap.client.font.TextRenderer advanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.advanceValidatingTextRenderer); }
// public void advanceValidatingTextRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.advanceValidatingTextRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer advanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.MinecraftClient.advanceValidatingTextRenderer); }
// public static void advanceValidatingTextRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.MinecraftClient.advanceValidatingTextRenderer = value.wrapperContained; }

// public yarnwrap.resource.DefaultResourcePack defaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.defaultResourcePack); }
// public void defaultResourcePack(yarnwrap.resource.DefaultResourcePack value) { wrapperContained.defaultResourcePack = value.wrapperContained; }
// public static yarnwrap.resource.DefaultResourcePack defaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(net.minecraft.client.MinecraftClient.defaultResourcePack); }
// public static void defaultResourcePack(yarnwrap.resource.DefaultResourcePack value, ) { net.minecraft.client.MinecraftClient.defaultResourcePack = value.wrapperContained; }

// public yarnwrap.client.resource.server.ServerResourcePackLoader serverResourcePackLoader() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(wrapperContained.serverResourcePackLoader); }
// public void serverResourcePackLoader(yarnwrap.client.resource.server.ServerResourcePackLoader value) { wrapperContained.serverResourcePackLoader = value.wrapperContained; }
// public static yarnwrap.client.resource.server.ServerResourcePackLoader serverResourcePackLoader() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(net.minecraft.client.MinecraftClient.serverResourcePackLoader); }
// public static void serverResourcePackLoader(yarnwrap.client.resource.server.ServerResourcePackLoader value, ) { net.minecraft.client.MinecraftClient.serverResourcePackLoader = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.TelemetryManager telemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(wrapperContained.telemetryManager); }
// public void telemetryManager(yarnwrap.client.session.telemetry.TelemetryManager value) { wrapperContained.telemetryManager = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.TelemetryManager telemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(net.minecraft.client.MinecraftClient.telemetryManager); }
// public static void telemetryManager(yarnwrap.client.session.telemetry.TelemetryManager value, ) { net.minecraft.client.MinecraftClient.telemetryManager = value.wrapperContained; }

// public long renderTime() { return wrapperContained.renderTime; }
// public void renderTime(long value) { wrapperContained.renderTime = value; }
// public static long renderTime() { return net.minecraft.client.MinecraftClient.renderTime; }
// public static void renderTime(long value, ) { net.minecraft.client.MinecraftClient.renderTime = value; }

// public yarnwrap.client.gui.navigation.GuiNavigationType navigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(wrapperContained.navigationType); }
// public void navigationType(yarnwrap.client.gui.navigation.GuiNavigationType value) { wrapperContained.navigationType = value.wrapperContained; }
// public static yarnwrap.client.gui.navigation.GuiNavigationType navigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(net.minecraft.client.MinecraftClient.navigationType); }
// public static void navigationType(yarnwrap.client.gui.navigation.GuiNavigationType value, ) { net.minecraft.client.MinecraftClient.navigationType = value.wrapperContained; }

// public yarnwrap.client.QuickPlayLogger quickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.quickPlayLogger); }
// public void quickPlayLogger(yarnwrap.client.QuickPlayLogger value) { wrapperContained.quickPlayLogger = value.wrapperContained; }
// public static yarnwrap.client.QuickPlayLogger quickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(net.minecraft.client.MinecraftClient.quickPlayLogger); }
// public static void quickPlayLogger(yarnwrap.client.QuickPlayLogger value, ) { net.minecraft.client.MinecraftClient.quickPlayLogger = value.wrapperContained; }

// public yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.guiAtlasManager); }
// public void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value) { wrapperContained.guiAtlasManager = value.wrapperContained; }
// public static yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(net.minecraft.client.MinecraftClient.guiAtlasManager); }
// public static void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value, ) { net.minecraft.client.MinecraftClient.guiAtlasManager = value.wrapperContained; }

// public yarnwrap.client.util.CommandHistoryManager commandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(wrapperContained.commandHistoryManager); }
// public void commandHistoryManager(yarnwrap.client.util.CommandHistoryManager value) { wrapperContained.commandHistoryManager = value.wrapperContained; }
// public static yarnwrap.client.util.CommandHistoryManager commandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(net.minecraft.client.MinecraftClient.commandHistoryManager); }
// public static void commandHistoryManager(yarnwrap.client.util.CommandHistoryManager value, ) { net.minecraft.client.MinecraftClient.commandHistoryManager = value.wrapperContained; }

// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public static yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.client.MinecraftClient.symlinkFinder); }
// public static void symlinkFinder(yarnwrap.util.path.SymlinkFinder value, ) { net.minecraft.client.MinecraftClient.symlinkFinder = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture gameProfileFuture() { return wrapperContained.gameProfileFuture; }
// public void gameProfileFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.gameProfileFuture = value; }
// public static java.util.concurrent.CompletableFuture gameProfileFuture() { return net.minecraft.client.MinecraftClient.gameProfileFuture; }
// public static void gameProfileFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.MinecraftClient.gameProfileFuture = value; }

// public boolean finishedLoading() { return wrapperContained.finishedLoading; }
// public void finishedLoading(boolean value) { wrapperContained.finishedLoading = value; }
// public static boolean finishedLoading() { return net.minecraft.client.MinecraftClient.finishedLoading; }
// public static void finishedLoading(boolean value, ) { net.minecraft.client.MinecraftClient.finishedLoading = value; }

// public long UNIVERSE() { return wrapperContained.UNIVERSE; }
// public void UNIVERSE(long value) { wrapperContained.UNIVERSE = value; }
// public static long UNIVERSE() { return net.minecraft.client.MinecraftClient.UNIVERSE; }
// public static void UNIVERSE(long value, ) { net.minecraft.client.MinecraftClient.UNIVERSE = value; }

// public boolean disconnecting() { return wrapperContained.disconnecting; }
// public void disconnecting(boolean value) { wrapperContained.disconnecting = value; }
// public static boolean disconnecting() { return net.minecraft.client.MinecraftClient.disconnecting; }
// public static void disconnecting(boolean value, ) { net.minecraft.client.MinecraftClient.disconnecting = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.client.MinecraftClient.startTime; }
// public static void startTime(long value, ) { net.minecraft.client.MinecraftClient.startTime = value; }

// public long uptimeInTicks() { return wrapperContained.uptimeInTicks; }
// public void uptimeInTicks(long value) { wrapperContained.uptimeInTicks = value; }
// public static long uptimeInTicks() { return net.minecraft.client.MinecraftClient.uptimeInTicks; }
// public static void uptimeInTicks(long value, ) { net.minecraft.client.MinecraftClient.uptimeInTicks = value; }

// public java.util.concurrent.CompletableFuture userPropertiesFuture() { return wrapperContained.userPropertiesFuture; }
// public void userPropertiesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.userPropertiesFuture = value; }
// public static java.util.concurrent.CompletableFuture userPropertiesFuture() { return net.minecraft.client.MinecraftClient.userPropertiesFuture; }
// public static void userPropertiesFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.MinecraftClient.userPropertiesFuture = value; }

// public yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.mapDecorationsAtlasManager); }
// public void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value) { wrapperContained.mapDecorationsAtlasManager = value.wrapperContained; }
// public static yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(net.minecraft.client.MinecraftClient.mapDecorationsAtlasManager); }
// public static void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value, ) { net.minecraft.client.MinecraftClient.mapDecorationsAtlasManager = value.wrapperContained; }

// public Object renderTickCounter() { return wrapperContained.renderTickCounter; }
// // public void renderTickCounter(Object value) { wrapperContained.renderTickCounter = value; }
// // public static Object renderTickCounter() { return net.minecraft.client.MinecraftClient.renderTickCounter; }
// // public static void renderTickCounter(Object value, ) { net.minecraft.client.MinecraftClient.renderTickCounter = value; }

// public yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.mapRenderer); }
// public void mapRenderer(yarnwrap.client.render.MapRenderer value) { wrapperContained.mapRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(net.minecraft.client.MinecraftClient.mapRenderer); }
// public static void mapRenderer(yarnwrap.client.render.MapRenderer value, ) { net.minecraft.client.MinecraftClient.mapRenderer = value.wrapperContained; }

// public yarnwrap.client.texture.MapTextureManager mapTextureManager() { return new yarnwrap.client.texture.MapTextureManager(wrapperContained.mapTextureManager); }
// public void mapTextureManager(yarnwrap.client.texture.MapTextureManager value) { wrapperContained.mapTextureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.MapTextureManager mapTextureManager() { return new yarnwrap.client.texture.MapTextureManager(net.minecraft.client.MinecraftClient.mapTextureManager); }
// public static void mapTextureManager(yarnwrap.client.texture.MapTextureManager value, ) { net.minecraft.client.MinecraftClient.mapTextureManager = value.wrapperContained; }

// public yarnwrap.client.option.InactivityFpsLimiter inactivityFpsLimiter() { return new yarnwrap.client.option.InactivityFpsLimiter(wrapperContained.inactivityFpsLimiter); }
// public void inactivityFpsLimiter(yarnwrap.client.option.InactivityFpsLimiter value) { wrapperContained.inactivityFpsLimiter = value.wrapperContained; }
// public static yarnwrap.client.option.InactivityFpsLimiter inactivityFpsLimiter() { return new yarnwrap.client.option.InactivityFpsLimiter(net.minecraft.client.MinecraftClient.inactivityFpsLimiter); }
// public static void inactivityFpsLimiter(yarnwrap.client.option.InactivityFpsLimiter value, ) { net.minecraft.client.MinecraftClient.inactivityFpsLimiter = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderLoader shaderLoader() { return new yarnwrap.client.gl.ShaderLoader(wrapperContained.shaderLoader); }
// public void shaderLoader(yarnwrap.client.gl.ShaderLoader value) { wrapperContained.shaderLoader = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderLoader shaderLoader() { return new yarnwrap.client.gl.ShaderLoader(net.minecraft.client.MinecraftClient.shaderLoader); }
// public static void shaderLoader(yarnwrap.client.gl.ShaderLoader value, ) { net.minecraft.client.MinecraftClient.shaderLoader = value.wrapperContained; }

// public yarnwrap.client.util.tracy.TracyFrameCapturer tracyFrameCapturer() { return new yarnwrap.client.util.tracy.TracyFrameCapturer(wrapperContained.tracyFrameCapturer); }
// public void tracyFrameCapturer(yarnwrap.client.util.tracy.TracyFrameCapturer value) { wrapperContained.tracyFrameCapturer = value.wrapperContained; }
// public static yarnwrap.client.util.tracy.TracyFrameCapturer tracyFrameCapturer() { return new yarnwrap.client.util.tracy.TracyFrameCapturer(net.minecraft.client.MinecraftClient.tracyFrameCapturer); }
// public static void tracyFrameCapturer(yarnwrap.client.util.tracy.TracyFrameCapturer value, ) { net.minecraft.client.MinecraftClient.tracyFrameCapturer = value.wrapperContained; }

// public yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelManager); }
// public void itemModelManager(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelManager = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.MinecraftClient.itemModelManager); }
// public static void itemModelManager(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.MinecraftClient.itemModelManager = value.wrapperContained; }

// public yarnwrap.client.resource.waypoint.WaypointStyleAssetManager waypointStyleAssetManager() { return new yarnwrap.client.resource.waypoint.WaypointStyleAssetManager(wrapperContained.waypointStyleAssetManager); }
// public void waypointStyleAssetManager(yarnwrap.client.resource.waypoint.WaypointStyleAssetManager value) { wrapperContained.waypointStyleAssetManager = value.wrapperContained; }
// public static yarnwrap.client.resource.waypoint.WaypointStyleAssetManager waypointStyleAssetManager() { return new yarnwrap.client.resource.waypoint.WaypointStyleAssetManager(net.minecraft.client.MinecraftClient.waypointStyleAssetManager); }
// public static void waypointStyleAssetManager(yarnwrap.client.resource.waypoint.WaypointStyleAssetManager value, ) { net.minecraft.client.MinecraftClient.waypointStyleAssetManager = value.wrapperContained; }

public MinecraftClient(yarnwrap.client.RunArgs args) { this.wrapperContained = new net.minecraft.client.MinecraftClient(args.wrapperContained); }
public yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.getResourceManager()); }
// public static yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(net.minecraft.client.MinecraftClient.getResourceManager()); }
public java.nio.file.Path getResourcePackDir() { return wrapperContained.getResourcePackDir(); }
// public static java.nio.file.Path getResourcePackDir() { return net.minecraft.client.MinecraftClient.getResourcePackDir(); }
public yarnwrap.client.render.item.ItemRenderer getItemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.getItemRenderer()); }
// public static yarnwrap.client.render.item.ItemRenderer getItemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.MinecraftClient.getItemRenderer()); }
// public void joinWorld(yarnwrap.client.world.ClientWorld world,Object worldEntryReason) { wrapperContained.joinWorld(world.wrapperContained,worldEntryReason); }
// public static void joinWorld(yarnwrap.client.world.ClientWorld world,Object worldEntryReason, ) { net.minecraft.client.MinecraftClient.joinWorld(world.wrapperContained,worldEntryReason); }
public yarnwrap.client.sound.SoundManager getSoundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.getSoundManager()); }
// public static yarnwrap.client.sound.SoundManager getSoundManager() { return new yarnwrap.client.sound.SoundManager(net.minecraft.client.MinecraftClient.getSoundManager()); }
public java.net.Proxy getNetworkProxy() { return wrapperContained.getNetworkProxy(); }
// public static java.net.Proxy getNetworkProxy() { return net.minecraft.client.MinecraftClient.getNetworkProxy(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.MinecraftClient.stop(); }
public boolean isPaused() { return wrapperContained.isPaused(); }
// public static boolean isPaused() { return net.minecraft.client.MinecraftClient.isPaused(); }
public void setCrashReportSupplierAndAddDetails(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.setCrashReportSupplierAndAddDetails(crashReport.wrapperContained); }
// public static void setCrashReportSupplierAndAddDetails(yarnwrap.util.crash.CrashReport crashReport, ) { net.minecraft.client.MinecraftClient.setCrashReportSupplierAndAddDetails(crashReport.wrapperContained); }
public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
// public static com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return net.minecraft.client.MinecraftClient.getSessionService(); }
public boolean isIntegratedServerRunning() { return wrapperContained.isIntegratedServerRunning(); }
// public static boolean isIntegratedServerRunning() { return net.minecraft.client.MinecraftClient.isIntegratedServerRunning(); }
// public boolean isHudEnabled() { return wrapperContained.isHudEnabled(); }
public static boolean isHudEnabled() { return net.minecraft.client.MinecraftClient.isHudEnabled(); }
public void setCameraEntity(yarnwrap.entity.Entity entity) { wrapperContained.setCameraEntity(entity.wrapperContained); }
// public static void setCameraEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.client.MinecraftClient.setCameraEntity(entity.wrapperContained); }
public yarnwrap.client.color.block.BlockColors getBlockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.getBlockColors()); }
// public static yarnwrap.client.color.block.BlockColors getBlockColors() { return new yarnwrap.client.color.block.BlockColors(net.minecraft.client.MinecraftClient.getBlockColors()); }
// public void handleGlErrorByDisableVsync(int error,long description) { wrapperContained.handleGlErrorByDisableVsync(error,description); }
// public static void handleGlErrorByDisableVsync(int error,long description, ) { net.minecraft.client.MinecraftClient.handleGlErrorByDisableVsync(error,description); }
public void setScreen(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreen(screen.wrapperContained); }
// public static void setScreen(yarnwrap.client.gui.screen.Screen screen, ) { net.minecraft.client.MinecraftClient.setScreen(screen.wrapperContained); }
// public void handleInputEvents() { wrapperContained.handleInputEvents(); }
// public static void handleInputEvents() { net.minecraft.client.MinecraftClient.handleInputEvents(); }
// public void method_1510(yarnwrap.text.Text status) { wrapperContained.method_1510(status.wrapperContained); }
// public static void method_1510(yarnwrap.text.Text status, ) { net.minecraft.client.MinecraftClient.method_1510(status.wrapperContained); }
// public void doItemPick() { wrapperContained.doItemPick(); }
// public static void doItemPick() { net.minecraft.client.MinecraftClient.doItemPick(); }
public java.util.concurrent.CompletableFuture reloadResourcesConcurrently() { return wrapperContained.reloadResourcesConcurrently(); }
// public static java.util.concurrent.CompletableFuture reloadResourcesConcurrently() { return net.minecraft.client.MinecraftClient.reloadResourcesConcurrently(); }
public void run() { wrapperContained.run(); }
// public static void run() { net.minecraft.client.MinecraftClient.run(); }
public java.lang.String getGameVersion() { return wrapperContained.getGameVersion(); }
// public static java.lang.String getGameVersion() { return net.minecraft.client.MinecraftClient.getGameVersion(); }
public yarnwrap.client.resource.server.ServerResourcePackLoader getServerResourcePackProvider() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(wrapperContained.getServerResourcePackProvider()); }
// public static yarnwrap.client.resource.server.ServerResourcePackLoader getServerResourcePackProvider() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(net.minecraft.client.MinecraftClient.getServerResourcePackProvider()); }
// public boolean isFancyGraphicsOrBetter() { return wrapperContained.isFancyGraphicsOrBetter(); }
public static boolean isFancyGraphicsOrBetter() { return net.minecraft.client.MinecraftClient.isFancyGraphicsOrBetter(); }
// public void cleanUpAfterCrash() { wrapperContained.cleanUpAfterCrash(); }
// public static void cleanUpAfterCrash() { net.minecraft.client.MinecraftClient.cleanUpAfterCrash(); }
public yarnwrap.resource.ResourcePackManager getResourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.getResourcePackManager()); }
// public static yarnwrap.resource.ResourcePackManager getResourcePackManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.client.MinecraftClient.getResourcePackManager()); }
public java.util.concurrent.CompletableFuture reloadResources() { return wrapperContained.reloadResources(); }
// public static java.util.concurrent.CompletableFuture reloadResources() { return net.minecraft.client.MinecraftClient.reloadResources(); }
public yarnwrap.client.gl.Framebuffer getFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.MinecraftClient.getFramebuffer()); }
// public void render(boolean tick) { wrapperContained.render(tick); }
// public static void render(boolean tick, ) { net.minecraft.client.MinecraftClient.render(tick); }
public yarnwrap.client.resource.language.LanguageManager getLanguageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.getLanguageManager()); }
// public static yarnwrap.client.resource.language.LanguageManager getLanguageManager() { return new yarnwrap.client.resource.language.LanguageManager(net.minecraft.client.MinecraftClient.getLanguageManager()); }
// public boolean isDemo() { return wrapperContained.isDemo(); }
// // public static boolean isDemo() { return net.minecraft.client.MinecraftClient.isDemo(); }
public yarnwrap.client.texture.TextureManager getTextureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.getTextureManager()); }
// public static yarnwrap.client.texture.TextureManager getTextureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.MinecraftClient.getTextureManager()); }
// public boolean doAttack() { return wrapperContained.doAttack(); }
// public static boolean doAttack() { return net.minecraft.client.MinecraftClient.doAttack(); }
public yarnwrap.client.sound.MusicTracker getMusicTracker() { return new yarnwrap.client.sound.MusicTracker(wrapperContained.getMusicTracker()); }
// public static yarnwrap.client.sound.MusicTracker getMusicTracker() { return new yarnwrap.client.sound.MusicTracker(net.minecraft.client.MinecraftClient.getMusicTracker()); }
public yarnwrap.client.render.block.BlockRenderManager getBlockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.getBlockRenderManager()); }
// public static yarnwrap.client.render.block.BlockRenderManager getBlockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.MinecraftClient.getBlockRenderManager()); }
public boolean isInSingleplayer() { return wrapperContained.isInSingleplayer(); }
// public static boolean isInSingleplayer() { return net.minecraft.client.MinecraftClient.isInSingleplayer(); }
public com.mojang.datafixers.DataFixer getDataFixer() { return wrapperContained.getDataFixer(); }
// public static com.mojang.datafixers.DataFixer getDataFixer() { return net.minecraft.client.MinecraftClient.getDataFixer(); }
public yarnwrap.client.sound.MusicInstance getMusicInstance() { return new yarnwrap.client.sound.MusicInstance(wrapperContained.getMusicInstance()); }
// public static yarnwrap.client.sound.MusicInstance getMusicInstance() { return new yarnwrap.client.sound.MusicInstance(net.minecraft.client.MinecraftClient.getMusicInstance()); }
public java.lang.String getVersionType() { return wrapperContained.getVersionType(); }
// public static java.lang.String getVersionType() { return net.minecraft.client.MinecraftClient.getVersionType(); }
public yarnwrap.client.session.Session getSession() { return new yarnwrap.client.session.Session(wrapperContained.getSession()); }
// public static yarnwrap.client.session.Session getSession() { return new yarnwrap.client.session.Session(net.minecraft.client.MinecraftClient.getSession()); }
public java.util.function.Function getSpriteAtlas(yarnwrap.util.Identifier id) { return wrapperContained.getSpriteAtlas(id.wrapperContained); }
// public static java.util.function.Function getSpriteAtlas(yarnwrap.util.Identifier id, ) { return net.minecraft.client.MinecraftClient.getSpriteAtlas(id.wrapperContained); }
// public yarnwrap.client.MinecraftClient getInstance() { return new yarnwrap.client.MinecraftClient(wrapperContained.getInstance()); }
public static yarnwrap.client.MinecraftClient getInstance() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.MinecraftClient.getInstance()); }
public yarnwrap.client.render.model.BakedModelManager getBakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getBakedModelManager()); }
// public static yarnwrap.client.render.model.BakedModelManager getBakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.MinecraftClient.getBakedModelManager()); }
public boolean hasReducedDebugInfo() { return wrapperContained.hasReducedDebugInfo(); }
// public static boolean hasReducedDebugInfo() { return net.minecraft.client.MinecraftClient.hasReducedDebugInfo(); }
public yarnwrap.client.network.ServerInfo getCurrentServerEntry() { return new yarnwrap.client.network.ServerInfo(wrapperContained.getCurrentServerEntry()); }
// public static yarnwrap.client.network.ServerInfo getCurrentServerEntry() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.MinecraftClient.getCurrentServerEntry()); }
public yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.getCameraEntity()); }
// public static yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.MinecraftClient.getCameraEntity()); }
public yarnwrap.client.render.entity.EntityRenderDispatcher getEntityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.getEntityRenderDispatcher()); }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher getEntityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.MinecraftClient.getEntityRenderDispatcher()); }
public yarnwrap.client.network.ClientPlayNetworkHandler getNetworkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.getNetworkHandler()); }
// public static yarnwrap.client.network.ClientPlayNetworkHandler getNetworkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.MinecraftClient.getNetworkHandler()); }
// public void printCrashReport(yarnwrap.client.MinecraftClient client,java.io.File runDirectory,yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.printCrashReport(client.wrapperContained,runDirectory,crashReport.wrapperContained); }
// public static void printCrashReport(yarnwrap.client.MinecraftClient client,java.io.File runDirectory,yarnwrap.util.crash.CrashReport crashReport, ) { net.minecraft.client.MinecraftClient.printCrashReport(client.wrapperContained,runDirectory,crashReport.wrapperContained); }
public yarnwrap.client.toast.ToastManager getToastManager() { return new yarnwrap.client.toast.ToastManager(wrapperContained.getToastManager()); }
// public static yarnwrap.client.toast.ToastManager getToastManager() { return new yarnwrap.client.toast.ToastManager(net.minecraft.client.MinecraftClient.getToastManager()); }
public boolean isWindowFocused() { return wrapperContained.isWindowFocused(); }
// public static boolean isWindowFocused() { return net.minecraft.client.MinecraftClient.isWindowFocused(); }
public yarnwrap.client.option.HotbarStorage getCreativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(wrapperContained.getCreativeHotbarStorage()); }
// public static yarnwrap.client.option.HotbarStorage getCreativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(net.minecraft.client.MinecraftClient.getCreativeHotbarStorage()); }
public boolean forcesUnicodeFont() { return wrapperContained.forcesUnicodeFont(); }
// public static boolean forcesUnicodeFont() { return net.minecraft.client.MinecraftClient.forcesUnicodeFont(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.MinecraftClient.tick(); }
public yarnwrap.server.integrated.IntegratedServer getServer() { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.getServer()); }
// public static yarnwrap.server.integrated.IntegratedServer getServer() { return new yarnwrap.server.integrated.IntegratedServer(net.minecraft.client.MinecraftClient.getServer()); }
public yarnwrap.client.tutorial.TutorialManager getTutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.getTutorialManager()); }
// public static yarnwrap.client.tutorial.TutorialManager getTutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(net.minecraft.client.MinecraftClient.getTutorialManager()); }
public yarnwrap.client.texture.PlayerSkinProvider getSkinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(wrapperContained.getSkinProvider()); }
// public static yarnwrap.client.texture.PlayerSkinProvider getSkinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(net.minecraft.client.MinecraftClient.getSkinProvider()); }
// public void doItemUse() { wrapperContained.doItemUse(); }
// public static void doItemUse() { net.minecraft.client.MinecraftClient.doItemUse(); }
public yarnwrap.world.level.storage.LevelStorage getLevelStorage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.getLevelStorage()); }
// public static yarnwrap.world.level.storage.LevelStorage getLevelStorage() { return new yarnwrap.world.level.storage.LevelStorage(net.minecraft.client.MinecraftClient.getLevelStorage()); }
public yarnwrap.util.crash.CrashReport addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report) { return new yarnwrap.util.crash.CrashReport(wrapperContained.addDetailsToCrashReport(report.wrapperContained)); }
// public static yarnwrap.util.crash.CrashReport addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report, ) { return new yarnwrap.util.crash.CrashReport(net.minecraft.client.MinecraftClient.addDetailsToCrashReport(report.wrapperContained)); }
// public boolean isAmbientOcclusionEnabled() { return wrapperContained.isAmbientOcclusionEnabled(); }
public static boolean isAmbientOcclusionEnabled() { return net.minecraft.client.MinecraftClient.isAmbientOcclusionEnabled(); }
// public void handleBlockBreaking(boolean breaking) { wrapperContained.handleBlockBreaking(breaking); }
// public static void handleBlockBreaking(boolean breaking, ) { net.minecraft.client.MinecraftClient.handleBlockBreaking(breaking); }
public void scheduleStop() { wrapperContained.scheduleStop(); }
// public static void scheduleStop() { net.minecraft.client.MinecraftClient.scheduleStop(); }
// public void checkGameData() { wrapperContained.checkGameData(); }
// public static void checkGameData() { net.minecraft.client.MinecraftClient.checkGameData(); }
// public yarnwrap.server.WorldGenerationProgressListener method_17533(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.method_17533(spawnChunkRadius)); }
// public static yarnwrap.server.WorldGenerationProgressListener method_17533(int spawnChunkRadius, ) { return new yarnwrap.server.WorldGenerationProgressListener(net.minecraft.client.MinecraftClient.method_17533(spawnChunkRadius)); }
public yarnwrap.client.resource.SplashTextResourceSupplier getSplashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(wrapperContained.getSplashTextLoader()); }
// public static yarnwrap.client.resource.SplashTextResourceSupplier getSplashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(net.minecraft.client.MinecraftClient.getSplashTextLoader()); }
public void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen,boolean transferring) { wrapperContained.disconnect(disconnectionScreen.wrapperContained,transferring); }
// public static void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen,boolean transferring, ) { net.minecraft.client.MinecraftClient.disconnect(disconnectionScreen.wrapperContained,transferring); }
// public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.MinecraftClient.setWorld(world.wrapperContained); }
// public void reset(yarnwrap.client.gui.screen.Screen resettingScreen) { wrapperContained.reset(resettingScreen.wrapperContained); }
// public static void reset(yarnwrap.client.gui.screen.Screen resettingScreen, ) { net.minecraft.client.MinecraftClient.reset(resettingScreen.wrapperContained); }
public void disconnect() { wrapperContained.disconnect(); }
// public static void disconnect() { net.minecraft.client.MinecraftClient.disconnect(); }
public yarnwrap.client.texture.PaintingManager getPaintingManager() { return new yarnwrap.client.texture.PaintingManager(wrapperContained.getPaintingManager()); }
// public static yarnwrap.client.texture.PaintingManager getPaintingManager() { return new yarnwrap.client.texture.PaintingManager(net.minecraft.client.MinecraftClient.getPaintingManager()); }
public void setOverlay(yarnwrap.client.gui.screen.Overlay overlay) { wrapperContained.setOverlay(overlay.wrapperContained); }
// public static void setOverlay(yarnwrap.client.gui.screen.Overlay overlay, ) { net.minecraft.client.MinecraftClient.setOverlay(overlay.wrapperContained); }
public yarnwrap.client.gui.screen.Overlay getOverlay() { return new yarnwrap.client.gui.screen.Overlay(wrapperContained.getOverlay()); }
// public static yarnwrap.client.gui.screen.Overlay getOverlay() { return new yarnwrap.client.gui.screen.Overlay(net.minecraft.client.MinecraftClient.getOverlay()); }
// public java.util.concurrent.CompletionStage method_18507(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_18507(future); }
// public static java.util.concurrent.CompletionStage method_18507(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.client.MinecraftClient.method_18507(future); }
public void openGameMenu(boolean pauseOnly) { wrapperContained.openGameMenu(pauseOnly); }
// public static void openGameMenu(boolean pauseOnly, ) { net.minecraft.client.MinecraftClient.openGameMenu(pauseOnly); }
public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.client.MinecraftClient.isRunning(); }
// public void addSystemDetailsToCrashReport(yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options,yarnwrap.util.crash.CrashReport report) { wrapperContained.addSystemDetailsToCrashReport(client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained,report.wrapperContained); }
// public static void addSystemDetailsToCrashReport(yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options,yarnwrap.util.crash.CrashReport report, ) { net.minecraft.client.MinecraftClient.addSystemDetailsToCrashReport(client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained,report.wrapperContained); }
public yarnwrap.client.util.Window getWindow() { return new yarnwrap.client.util.Window(wrapperContained.getWindow()); }
// public static yarnwrap.client.util.Window getWindow() { return new yarnwrap.client.util.Window(net.minecraft.client.MinecraftClient.getWindow()); }
public yarnwrap.client.render.BufferBuilderStorage getBufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.getBufferBuilders()); }
// public static yarnwrap.client.render.BufferBuilderStorage getBufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.MinecraftClient.getBufferBuilders()); }
public void setMipmapLevels(int mipmapLevels) { wrapperContained.setMipmapLevels(mipmapLevels); }
// public static void setMipmapLevels(int mipmapLevels, ) { net.minecraft.client.MinecraftClient.setMipmapLevels(mipmapLevels); }
// public void handleResourceReloadException(java.lang.Throwable throwable,Object loadingContext) { wrapperContained.handleResourceReloadException(throwable,loadingContext); }
// public static void handleResourceReloadException(java.lang.Throwable throwable,Object loadingContext, ) { net.minecraft.client.MinecraftClient.handleResourceReloadException(throwable,loadingContext); }
// public void method_24228(boolean error) { wrapperContained.method_24228(error); }
// public static void method_24228(boolean error, ) { net.minecraft.client.MinecraftClient.method_24228(error); }
// public java.lang.String getWindowTitle() { return wrapperContained.getWindowTitle(); }
// public static java.lang.String getWindowTitle() { return net.minecraft.client.MinecraftClient.getWindowTitle(); }
public void updateWindowTitle() { wrapperContained.updateWindowTitle(); }
// public static void updateWindowTitle() { net.minecraft.client.MinecraftClient.updateWindowTitle(); }
// public yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(wrapperContained.getModStatus()); }
public static yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(net.minecraft.client.MinecraftClient.getModStatus()); }
// public yarnwrap.util.profiler.Profiler startMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor) { return new yarnwrap.util.profiler.Profiler(wrapperContained.startMonitor(active,monitor.wrapperContained)); }
// public static yarnwrap.util.profiler.Profiler startMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor, ) { return new yarnwrap.util.profiler.Profiler(net.minecraft.client.MinecraftClient.startMonitor(active,monitor.wrapperContained)); }
// public void endMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor) { wrapperContained.endMonitor(active,monitor.wrapperContained); }
// public static void endMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor, ) { net.minecraft.client.MinecraftClient.endMonitor(active,monitor.wrapperContained); }
public boolean hasOutline(yarnwrap.entity.Entity entity) { return wrapperContained.hasOutline(entity.wrapperContained); }
// public static boolean hasOutline(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.MinecraftClient.hasOutline(entity.wrapperContained); }
// public void openChatScreen(java.lang.String text) { wrapperContained.openChatScreen(text); }
// public static void openChatScreen(java.lang.String text, ) { net.minecraft.client.MinecraftClient.openChatScreen(text); }
public boolean shouldBlockMessages(java.util.UUID sender) { return wrapperContained.shouldBlockMessages(sender); }
// public static boolean shouldBlockMessages(java.util.UUID sender, ) { return net.minecraft.client.MinecraftClient.shouldBlockMessages(sender); }
public boolean isMultiplayerEnabled() { return wrapperContained.isMultiplayerEnabled(); }
// public static boolean isMultiplayerEnabled() { return net.minecraft.client.MinecraftClient.isMultiplayerEnabled(); }
// public yarnwrap.server.integrated.IntegratedServer method_29603(Object thread) { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.method_29603(thread)); }
// public static yarnwrap.server.integrated.IntegratedServer method_29603(Object thread, ) { return new yarnwrap.server.integrated.IntegratedServer(net.minecraft.client.MinecraftClient.method_29603(thread)); }
// public void startIntegratedServer(Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,boolean newWorld) { wrapperContained.startIntegratedServer(session,dataPackManager.wrapperContained,saveLoader.wrapperContained,newWorld); }
// public static void startIntegratedServer(Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,boolean newWorld, ) { net.minecraft.client.MinecraftClient.startIntegratedServer(session,dataPackManager.wrapperContained,saveLoader.wrapperContained,newWorld); }
// public boolean isFabulousGraphicsOrBetter() { return wrapperContained.isFabulousGraphicsOrBetter(); }
public static boolean isFabulousGraphicsOrBetter() { return net.minecraft.client.MinecraftClient.isFabulousGraphicsOrBetter(); }
public void setScreenAndRender(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreenAndRender(screen.wrapperContained); }
// public static void setScreenAndRender(yarnwrap.client.gui.screen.Screen screen, ) { net.minecraft.client.MinecraftClient.setScreenAndRender(screen.wrapperContained); }
public yarnwrap.client.resource.VideoWarningManager getVideoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.getVideoWarningManager()); }
// public static yarnwrap.client.resource.VideoWarningManager getVideoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(net.minecraft.client.MinecraftClient.getVideoWarningManager()); }
// public void onResourceReloadFailure(java.lang.Throwable exception,yarnwrap.text.Text resourceName,Object loadingContext) { wrapperContained.onResourceReloadFailure(exception,resourceName.wrapperContained,loadingContext); }
// public static void onResourceReloadFailure(java.lang.Throwable exception,yarnwrap.text.Text resourceName,Object loadingContext, ) { net.minecraft.client.MinecraftClient.onResourceReloadFailure(exception,resourceName.wrapperContained,loadingContext); }
public yarnwrap.client.network.SocialInteractionsManager getSocialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(wrapperContained.getSocialInteractionsManager()); }
// public static yarnwrap.client.network.SocialInteractionsManager getSocialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(net.minecraft.client.MinecraftClient.getSocialInteractionsManager()); }
// public boolean isConnectedToServer() { return wrapperContained.isConnectedToServer(); }
// public static boolean isConnectedToServer() { return net.minecraft.client.MinecraftClient.isConnectedToServer(); }
// public com.mojang.authlib.minecraft.UserApiService createUserApiService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authService,yarnwrap.client.RunArgs runArgs) { return wrapperContained.createUserApiService(authService,runArgs.wrapperContained); }
// public static com.mojang.authlib.minecraft.UserApiService createUserApiService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authService,yarnwrap.client.RunArgs runArgs, ) { return net.minecraft.client.MinecraftClient.createUserApiService(authService,runArgs.wrapperContained); }
public yarnwrap.client.render.entity.model.LoadedEntityModels getLoadedEntityModels() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(wrapperContained.getLoadedEntityModels()); }
// public static yarnwrap.client.render.entity.model.LoadedEntityModels getLoadedEntityModels() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(net.minecraft.client.MinecraftClient.getLoadedEntityModels()); }
public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher getBlockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.getBlockEntityRenderDispatcher()); }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher getBlockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(net.minecraft.client.MinecraftClient.getBlockEntityRenderDispatcher()); }
public boolean shouldFilterText() { return wrapperContained.shouldFilterText(); }
// public static boolean shouldFilterText() { return net.minecraft.client.MinecraftClient.shouldFilterText(); }
public Object getChatRestriction() { return wrapperContained.getChatRestriction(); }
// public static Object getChatRestriction() { return net.minecraft.client.MinecraftClient.getChatRestriction(); }
public boolean toggleDebugProfiler(java.util.function.Consumer chatMessageSender) { return wrapperContained.toggleDebugProfiler(chatMessageSender); }
// public static boolean toggleDebugProfiler(java.util.function.Consumer chatMessageSender, ) { return net.minecraft.client.MinecraftClient.toggleDebugProfiler(chatMessageSender); }
// public void method_34746(java.util.function.Consumer result) { wrapperContained.method_34746(result); }
// public static void method_34746(java.util.function.Consumer result, ) { net.minecraft.client.MinecraftClient.method_34746(result); }
// public yarnwrap.text.Text takePanorama(java.io.File directory) { return new yarnwrap.text.Text(wrapperContained.takePanorama(directory)); }
// public static yarnwrap.text.Text takePanorama(java.io.File directory, ) { return new yarnwrap.text.Text(net.minecraft.client.MinecraftClient.takePanorama(directory)); }
// public void method_35701(yarnwrap.text.Text message) { wrapperContained.method_35701(message.wrapperContained); }
// public static void method_35701(yarnwrap.text.Text message, ) { net.minecraft.client.MinecraftClient.method_35701(message.wrapperContained); }
public yarnwrap.server.WorldGenerationProgressTracker getWorldGenerationProgressTracker() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.getWorldGenerationProgressTracker()); }
// public static yarnwrap.server.WorldGenerationProgressTracker getWorldGenerationProgressTracker() { return new yarnwrap.server.WorldGenerationProgressTracker(net.minecraft.client.MinecraftClient.getWorldGenerationProgressTracker()); }
// public yarnwrap.text.Style method_35704(java.io.File style) { return new yarnwrap.text.Style(wrapperContained.method_35704(style)); }
// public static yarnwrap.text.Style method_35704(java.io.File style, ) { return new yarnwrap.text.Style(net.minecraft.client.MinecraftClient.method_35704(style)); }
public boolean isRealmsEnabled() { return wrapperContained.isRealmsEnabled(); }
// public static boolean isRealmsEnabled() { return net.minecraft.client.MinecraftClient.isRealmsEnabled(); }
// public java.util.concurrent.CompletableFuture reloadResources(boolean force,Object loadingContext) { return wrapperContained.reloadResources(force,loadingContext); }
// public static java.util.concurrent.CompletableFuture reloadResources(boolean force,Object loadingContext, ) { return net.minecraft.client.MinecraftClient.reloadResources(force,loadingContext); }
// public yarnwrap.util.SystemDetails addSystemDetailsToCrashReport(yarnwrap.util.SystemDetails systemDetails,yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options) { return new yarnwrap.util.SystemDetails(wrapperContained.addSystemDetailsToCrashReport(systemDetails.wrapperContained,client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained)); }
// public static yarnwrap.util.SystemDetails addSystemDetailsToCrashReport(yarnwrap.util.SystemDetails systemDetails,yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options, ) { return new yarnwrap.util.SystemDetails(net.minecraft.client.MinecraftClient.addSystemDetailsToCrashReport(systemDetails.wrapperContained,client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained)); }
// public java.nio.file.Path saveProfilingResult(yarnwrap.util.SystemDetails details,java.util.List files) { return wrapperContained.saveProfilingResult(details.wrapperContained,files); }
// public static java.nio.file.Path saveProfilingResult(yarnwrap.util.SystemDetails details,java.util.List files, ) { return net.minecraft.client.MinecraftClient.saveProfilingResult(details.wrapperContained,files); }
// public void method_37276(yarnwrap.util.SystemDetails files) { wrapperContained.method_37276(files.wrapperContained); }
// public static void method_37276(yarnwrap.util.SystemDetails files, ) { net.minecraft.client.MinecraftClient.method_37276(files.wrapperContained); }
// public void method_37277(yarnwrap.util.profiler.ProfileResult result) { wrapperContained.method_37277(result.wrapperContained); }
// public static void method_37277(yarnwrap.util.profiler.ProfileResult result, ) { net.minecraft.client.MinecraftClient.method_37277(result.wrapperContained); }
// public yarnwrap.text.Style method_37281(java.nio.file.Path style) { return new yarnwrap.text.Style(wrapperContained.method_37281(style)); }
// public static yarnwrap.text.Style method_37281(java.nio.file.Path style, ) { return new yarnwrap.text.Style(net.minecraft.client.MinecraftClient.method_37281(style)); }
// public void method_37283(java.util.function.Consumer path) { wrapperContained.method_37283(path); }
// public static void method_37283(java.util.function.Consumer path, ) { net.minecraft.client.MinecraftClient.method_37283(path); }
// public void stopRecorder() { wrapperContained.stopRecorder(); }
// public static void stopRecorder() { net.minecraft.client.MinecraftClient.stopRecorder(); }
// public void method_37290(java.util.function.Consumer result) { wrapperContained.method_37290(result); }
// public static void method_37290(java.util.function.Consumer result, ) { net.minecraft.client.MinecraftClient.method_37290(result); }
// public void method_37291(java.util.function.Consumer path) { wrapperContained.method_37291(path); }
// public static void method_37291(java.util.function.Consumer path, ) { net.minecraft.client.MinecraftClient.method_37291(path); }
public void loadBlockList() { wrapperContained.loadBlockList(); }
// public static void loadBlockList() { net.minecraft.client.MinecraftClient.loadBlockList(); }
// public boolean isCountrySetTo(java.lang.Object country) { return wrapperContained.isCountrySetTo(country); }
// public static boolean isCountrySetTo(java.lang.Object country, ) { return net.minecraft.client.MinecraftClient.isCountrySetTo(country); }
// public void method_41731(yarnwrap.client.gl.GlTimer glTimer) { wrapperContained.method_41731(glTimer.wrapperContained); }
// public static void method_41731(yarnwrap.client.gl.GlTimer glTimer, ) { net.minecraft.client.MinecraftClient.method_41731(glTimer.wrapperContained); }
// public void forceStopRecorder() { wrapperContained.forceStopRecorder(); }
// public static void forceStopRecorder() { net.minecraft.client.MinecraftClient.forceStopRecorder(); }
public double getGpuUtilizationPercentage() { return wrapperContained.getGpuUtilizationPercentage(); }
// public static double getGpuUtilizationPercentage() { return net.minecraft.client.MinecraftClient.getGpuUtilizationPercentage(); }
public yarnwrap.server.integrated.IntegratedServerLoader createIntegratedServerLoader() { return new yarnwrap.server.integrated.IntegratedServerLoader(wrapperContained.createIntegratedServerLoader()); }
// public static yarnwrap.server.integrated.IntegratedServerLoader createIntegratedServerLoader() { return new yarnwrap.server.integrated.IntegratedServerLoader(net.minecraft.client.MinecraftClient.createIntegratedServerLoader()); }
public void setCrashReportSupplier(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.setCrashReportSupplier(crashReport.wrapperContained); }
// public static void setCrashReportSupplier(yarnwrap.util.crash.CrashReport crashReport, ) { net.minecraft.client.MinecraftClient.setCrashReportSupplier(crashReport.wrapperContained); }
public yarnwrap.client.session.ProfileKeys getProfileKeys() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.getProfileKeys()); }
// public static yarnwrap.client.session.ProfileKeys getProfileKeys() { return new yarnwrap.client.session.ProfileKeys(net.minecraft.client.MinecraftClient.getProfileKeys()); }
public yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.getServicesSignatureVerifier()); }
// public static yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(net.minecraft.client.MinecraftClient.getServicesSignatureVerifier()); }
// public void method_44352(boolean confirmed) { wrapperContained.method_44352(confirmed); }
// public static void method_44352(boolean confirmed, ) { net.minecraft.client.MinecraftClient.method_44352(confirmed); }
public void ensureAbuseReportContext(yarnwrap.client.session.report.ReporterEnvironment environment) { wrapperContained.ensureAbuseReportContext(environment.wrapperContained); }
// public static void ensureAbuseReportContext(yarnwrap.client.session.report.ReporterEnvironment environment, ) { net.minecraft.client.MinecraftClient.ensureAbuseReportContext(environment.wrapperContained); }
public yarnwrap.client.session.report.AbuseReportContext getAbuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.getAbuseReportContext()); }
// public static yarnwrap.client.session.report.AbuseReportContext getAbuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(net.minecraft.client.MinecraftClient.getAbuseReportContext()); }
public yarnwrap.client.realms.RealmsPeriodicCheckers getRealmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(wrapperContained.getRealmsPeriodicCheckers()); }
// public static yarnwrap.client.realms.RealmsPeriodicCheckers getRealmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(net.minecraft.client.MinecraftClient.getRealmsPeriodicCheckers()); }
public com.mojang.authlib.minecraft.BanDetails getMultiplayerBanDetails() { return wrapperContained.getMultiplayerBanDetails(); }
// public static com.mojang.authlib.minecraft.BanDetails getMultiplayerBanDetails() { return net.minecraft.client.MinecraftClient.getMultiplayerBanDetails(); }
public yarnwrap.client.util.NarratorManager getNarratorManager() { return new yarnwrap.client.util.NarratorManager(wrapperContained.getNarratorManager()); }
// public static yarnwrap.client.util.NarratorManager getNarratorManager() { return new yarnwrap.client.util.NarratorManager(net.minecraft.client.MinecraftClient.getNarratorManager()); }
public yarnwrap.client.network.message.MessageHandler getMessageHandler() { return new yarnwrap.client.network.message.MessageHandler(wrapperContained.getMessageHandler()); }
// public static yarnwrap.client.network.message.MessageHandler getMessageHandler() { return new yarnwrap.client.network.message.MessageHandler(net.minecraft.client.MinecraftClient.getMessageHandler()); }
public yarnwrap.resource.DefaultResourcePack getDefaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.getDefaultResourcePack()); }
// public static yarnwrap.resource.DefaultResourcePack getDefaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(net.minecraft.client.MinecraftClient.getDefaultResourcePack()); }
public boolean isConnectedToLocalServer() { return wrapperContained.isConnectedToLocalServer(); }
// public static boolean isConnectedToLocalServer() { return net.minecraft.client.MinecraftClient.isConnectedToLocalServer(); }
public boolean isOptionalTelemetryEnabledByApi() { return wrapperContained.isOptionalTelemetryEnabledByApi(); }
// public static boolean isOptionalTelemetryEnabledByApi() { return net.minecraft.client.MinecraftClient.isOptionalTelemetryEnabledByApi(); }
public boolean isTelemetryEnabledByApi() { return wrapperContained.isTelemetryEnabledByApi(); }
// public static boolean isTelemetryEnabledByApi() { return net.minecraft.client.MinecraftClient.isTelemetryEnabledByApi(); }
public int getCurrentFps() { return wrapperContained.getCurrentFps(); }
// public static int getCurrentFps() { return net.minecraft.client.MinecraftClient.getCurrentFps(); }
public long getRenderTime() { return wrapperContained.getRenderTime(); }
// public static long getRenderTime() { return net.minecraft.client.MinecraftClient.getRenderTime(); }
public yarnwrap.client.session.telemetry.TelemetryManager getTelemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(wrapperContained.getTelemetryManager()); }
// public static yarnwrap.client.session.telemetry.TelemetryManager getTelemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(net.minecraft.client.MinecraftClient.getTelemetryManager()); }
public boolean isOptionalTelemetryEnabled() { return wrapperContained.isOptionalTelemetryEnabled(); }
// public static boolean isOptionalTelemetryEnabled() { return net.minecraft.client.MinecraftClient.isOptionalTelemetryEnabled(); }
public void setNavigationType(yarnwrap.client.gui.navigation.GuiNavigationType navigationType) { wrapperContained.setNavigationType(navigationType.wrapperContained); }
// public static void setNavigationType(yarnwrap.client.gui.navigation.GuiNavigationType navigationType, ) { net.minecraft.client.MinecraftClient.setNavigationType(navigationType.wrapperContained); }
public yarnwrap.client.gui.navigation.GuiNavigationType getNavigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(wrapperContained.getNavigationType()); }
// public static yarnwrap.client.gui.navigation.GuiNavigationType getNavigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(net.minecraft.client.MinecraftClient.getNavigationType()); }
// public void showResourceReloadFailureToast(yarnwrap.text.Text description) { wrapperContained.showResourceReloadFailureToast(description.wrapperContained); }
// public static void showResourceReloadFailureToast(yarnwrap.text.Text description, ) { net.minecraft.client.MinecraftClient.showResourceReloadFailureToast(description.wrapperContained); }
// public void method_49293(boolean throwable) { wrapperContained.method_49293(throwable); }
// public static void method_49293(boolean throwable, ) { net.minecraft.client.MinecraftClient.method_49293(throwable); }
// public void onForcedResourceReloadFailure() { wrapperContained.onForcedResourceReloadFailure(); }
// public static void onForcedResourceReloadFailure() { net.minecraft.client.MinecraftClient.onForcedResourceReloadFailure(); }
public yarnwrap.client.QuickPlayLogger getQuickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.getQuickPlayLogger()); }
// public static yarnwrap.client.QuickPlayLogger getQuickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(net.minecraft.client.MinecraftClient.getQuickPlayLogger()); }
// public void collectLoadTimes(Object loadingContext) { wrapperContained.collectLoadTimes(loadingContext); }
// public static void collectLoadTimes(Object loadingContext, ) { net.minecraft.client.MinecraftClient.collectLoadTimes(loadingContext); }
public yarnwrap.client.texture.GuiAtlasManager getGuiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.getGuiAtlasManager()); }
// public static yarnwrap.client.texture.GuiAtlasManager getGuiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(net.minecraft.client.MinecraftClient.getGuiAtlasManager()); }
public yarnwrap.client.util.CommandHistoryManager getCommandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(wrapperContained.getCommandHistoryManager()); }
// public static yarnwrap.client.util.CommandHistoryManager getCommandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(net.minecraft.client.MinecraftClient.getCommandHistoryManager()); }
public boolean uuidEquals(java.util.UUID uuid) { return wrapperContained.uuidEquals(uuid); }
// public static boolean uuidEquals(java.util.UUID uuid, ) { return net.minecraft.client.MinecraftClient.uuidEquals(uuid); }
public yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.getSymlinkFinder()); }
// public static yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.client.MinecraftClient.getSymlinkFinder()); }
public void enterReconfiguration(yarnwrap.client.gui.screen.Screen reconfigurationScreen) { wrapperContained.enterReconfiguration(reconfigurationScreen.wrapperContained); }
// public static void enterReconfiguration(yarnwrap.client.gui.screen.Screen reconfigurationScreen, ) { net.minecraft.client.MinecraftClient.enterReconfiguration(reconfigurationScreen.wrapperContained); }
public com.mojang.authlib.GameProfile getGameProfile() { return wrapperContained.getGameProfile(); }
// public static com.mojang.authlib.GameProfile getGameProfile() { return net.minecraft.client.MinecraftClient.getGameProfile(); }
// public void onFinishedLoading(Object loadingContext) { wrapperContained.onFinishedLoading(loadingContext); }
// public static void onFinishedLoading(Object loadingContext, ) { net.minecraft.client.MinecraftClient.onFinishedLoading(loadingContext); }
public boolean isFinishedLoading() { return wrapperContained.isFinishedLoading(); }
// public static boolean isFinishedLoading() { return net.minecraft.client.MinecraftClient.isFinishedLoading(); }
public boolean isUsernameBanned() { return wrapperContained.isUsernameBanned(); }
// public static boolean isUsernameBanned() { return net.minecraft.client.MinecraftClient.isUsernameBanned(); }
// public yarnwrap.client.gui.screen.Screen method_53519(com.mojang.authlib.GameProfile onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.method_53519(onClose)); }
// public static yarnwrap.client.gui.screen.Screen method_53519(com.mojang.authlib.GameProfile onClose, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.MinecraftClient.method_53519(onClose)); }
// public yarnwrap.client.gui.screen.Screen method_53520(com.mojang.authlib.minecraft.BanDetails onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.method_53520(onClose)); }
// public static yarnwrap.client.gui.screen.Screen method_53520(com.mojang.authlib.minecraft.BanDetails onClose, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.MinecraftClient.method_53520(onClose)); }
// public void method_53521(Object throwable) { wrapperContained.method_53521(throwable); }
// public static void method_53521(Object throwable, ) { net.minecraft.client.MinecraftClient.method_53521(throwable); }
// public void method_53522(Object error) { wrapperContained.method_53522(error); }
// public static void method_53522(Object error, ) { net.minecraft.client.MinecraftClient.method_53522(error); }
// public yarnwrap.client.gui.screen.Screen method_53523(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.method_53523(onClose)); }
// public static yarnwrap.client.gui.screen.Screen method_53523(java.lang.Runnable onClose, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.MinecraftClient.method_53523(onClose)); }
// public void method_53524(java.lang.Runnable confirmed) { wrapperContained.method_53524(confirmed); }
// public static void method_53524(java.lang.Runnable confirmed, ) { net.minecraft.client.MinecraftClient.method_53524(confirmed); }
// // public boolean createInitScreens(java.util.List list) { return wrapperContained.createInitScreens(list); }
// // public static boolean createInitScreens(java.util.List list, ) { return net.minecraft.client.MinecraftClient.createInitScreens(list); }
public yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.getDebugHud()); }
// public static yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(net.minecraft.client.MinecraftClient.getDebugHud()); }
// public java.lang.Runnable onInitFinished(Object loadingContext) { return wrapperContained.onInitFinished(loadingContext); }
// public static java.lang.Runnable onInitFinished(Object loadingContext, ) { return net.minecraft.client.MinecraftClient.onInitFinished(loadingContext); }
// public java.lang.String formatSeconds(double seconds) { return wrapperContained.formatSeconds(seconds); }
// public static java.lang.String formatSeconds(double seconds, ) { return net.minecraft.client.MinecraftClient.formatSeconds(seconds); }
// public void addUptimesToCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.addUptimesToCrashReport(section.wrapperContained); }
// public static void addUptimesToCrashReport(yarnwrap.util.crash.CrashReportSection section, ) { net.minecraft.client.MinecraftClient.addUptimesToCrashReport(section.wrapperContained); }
// public java.lang.String getLauncherBrand() { return wrapperContained.getLauncherBrand(); }
public static java.lang.String getLauncherBrand() { return net.minecraft.client.MinecraftClient.getLauncherBrand(); }
// public void printCrashReport() { wrapperContained.printCrashReport(); }
// public static void printCrashReport() { net.minecraft.client.MinecraftClient.printCrashReport(); }
public void printCrashReport(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.printCrashReport(crashReport.wrapperContained); }
// public static void printCrashReport(yarnwrap.util.crash.CrashReport crashReport, ) { net.minecraft.client.MinecraftClient.printCrashReport(crashReport.wrapperContained); }
// public float getTargetMillisPerTick(float millis) { return wrapperContained.getTargetMillisPerTick(millis); }
// public static float getTargetMillisPerTick(float millis, ) { return net.minecraft.client.MinecraftClient.getTargetMillisPerTick(millis); }
public void onDisconnected() { wrapperContained.onDisconnected(); }
// public static void onDisconnected() { net.minecraft.client.MinecraftClient.onDisconnected(); }
public boolean providesProfileKeys() { return wrapperContained.providesProfileKeys(); }
// public static boolean providesProfileKeys() { return net.minecraft.client.MinecraftClient.providesProfileKeys(); }
// public Object getUserProperties() { return wrapperContained.getUserProperties(); }
// public static Object getUserProperties() { return net.minecraft.client.MinecraftClient.getUserProperties(); }
public void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen) { wrapperContained.disconnect(disconnectionScreen.wrapperContained); }
// public static void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen, ) { net.minecraft.client.MinecraftClient.disconnect(disconnectionScreen.wrapperContained); }
// public void onFontOptionsChanged() { wrapperContained.onFontOptionsChanged(); }
// public static void onFontOptionsChanged() { net.minecraft.client.MinecraftClient.onFontOptionsChanged(); }
public yarnwrap.client.texture.MapDecorationsAtlasManager getMapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.getMapDecorationsAtlasManager()); }
// public static yarnwrap.client.texture.MapDecorationsAtlasManager getMapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(net.minecraft.client.MinecraftClient.getMapDecorationsAtlasManager()); }
// public void method_60320(yarnwrap.client.resource.language.TranslationStorage translationStorage) { wrapperContained.method_60320(translationStorage.wrapperContained); }
// public static void method_60320(yarnwrap.client.resource.language.TranslationStorage translationStorage, ) { net.minecraft.client.MinecraftClient.method_60320(translationStorage.wrapperContained); }
// public boolean shouldTick() { return wrapperContained.shouldTick(); }
// public static boolean shouldTick() { return net.minecraft.client.MinecraftClient.shouldTick(); }
// public int saveCrashReport(java.io.File runDir,yarnwrap.util.crash.CrashReport crashReport) { return wrapperContained.saveCrashReport(runDir,crashReport.wrapperContained); }
// public static int saveCrashReport(java.io.File runDir,yarnwrap.util.crash.CrashReport crashReport, ) { return net.minecraft.client.MinecraftClient.saveCrashReport(runDir,crashReport.wrapperContained); }
public yarnwrap.client.texture.MapTextureManager getMapTextureManager() { return new yarnwrap.client.texture.MapTextureManager(wrapperContained.getMapTextureManager()); }
// public static yarnwrap.client.texture.MapTextureManager getMapTextureManager() { return new yarnwrap.client.texture.MapTextureManager(net.minecraft.client.MinecraftClient.getMapTextureManager()); }
public yarnwrap.client.option.InactivityFpsLimiter getInactivityFpsLimiter() { return new yarnwrap.client.option.InactivityFpsLimiter(wrapperContained.getInactivityFpsLimiter()); }
// public static yarnwrap.client.option.InactivityFpsLimiter getInactivityFpsLimiter() { return new yarnwrap.client.option.InactivityFpsLimiter(net.minecraft.client.MinecraftClient.getInactivityFpsLimiter()); }
public yarnwrap.client.render.MapRenderer getMapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.getMapRenderer()); }
// public static yarnwrap.client.render.MapRenderer getMapRenderer() { return new yarnwrap.client.render.MapRenderer(net.minecraft.client.MinecraftClient.getMapRenderer()); }
public yarnwrap.client.render.RenderTickCounter getRenderTickCounter() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.getRenderTickCounter()); }
// public static yarnwrap.client.render.RenderTickCounter getRenderTickCounter() { return new yarnwrap.client.render.RenderTickCounter(net.minecraft.client.MinecraftClient.getRenderTickCounter()); }
public yarnwrap.client.gl.ShaderLoader getShaderLoader() { return new yarnwrap.client.gl.ShaderLoader(wrapperContained.getShaderLoader()); }
// public static yarnwrap.client.gl.ShaderLoader getShaderLoader() { return new yarnwrap.client.gl.ShaderLoader(net.minecraft.client.MinecraftClient.getShaderLoader()); }
public void onShaderResourceReloadFailure(java.lang.Exception exception) { wrapperContained.onShaderResourceReloadFailure(exception); }
// public static void onShaderResourceReloadFailure(java.lang.Exception exception, ) { net.minecraft.client.MinecraftClient.onShaderResourceReloadFailure(exception); }
// public void method_64035(Object item) { wrapperContained.method_64035(item); }
// public static void method_64035(Object item, ) { net.minecraft.client.MinecraftClient.method_64035(item); }
public yarnwrap.client.item.ItemModelManager getItemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.getItemModelManager()); }
// public static yarnwrap.client.item.ItemModelManager getItemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.MinecraftClient.getItemModelManager()); }
// public java.lang.String method_68467(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type) { return wrapperContained.method_68467(id.wrapperContained,type); }
// public static java.lang.String method_68467(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type, ) { return net.minecraft.client.MinecraftClient.method_68467(id.wrapperContained,type); }
// public yarnwrap.client.resource.waypoint.WaypointStyleAssetManager getWaypointStyleAssetManager() { return new yarnwrap.client.resource.waypoint.WaypointStyleAssetManager(wrapperContained.getWaypointStyleAssetManager()); }
// public static yarnwrap.client.resource.waypoint.WaypointStyleAssetManager getWaypointStyleAssetManager() { return new yarnwrap.client.resource.waypoint.WaypointStyleAssetManager(net.minecraft.client.MinecraftClient.getWaypointStyleAssetManager()); }

}