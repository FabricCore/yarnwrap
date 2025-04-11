package yarnwrap.client;
public class MinecraftClient { public net.minecraft.client.MinecraftClient wrapperContained; public MinecraftClient(net.minecraft.client.MinecraftClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public yarnwrap.client.util.WindowProvider windowProvider() { return new yarnwrap.client.util.WindowProvider(wrapperContained.windowProvider); }
// public void windowProvider(yarnwrap.client.util.WindowProvider value) { wrapperContained.windowProvider = value.wrapperContained; }
public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.client.gl.Framebuffer framebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.framebuffer); }
// public void framebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.framebuffer = value.wrapperContained; }
public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public void options(yarnwrap.client.option.GameOptions value) { wrapperContained.options = value.wrapperContained; }
public yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(wrapperContained.targetedEntity); }
public void targetedEntity(yarnwrap.entity.Entity value) { wrapperContained.targetedEntity = value.wrapperContained; }
// public boolean windowFocused() { return wrapperContained.windowFocused; }
// public void windowFocused(boolean value) { wrapperContained.windowFocused = value; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
public java.io.File runDirectory() { return wrapperContained.runDirectory; }
// public void runDirectory(java.io.File value) { wrapperContained.runDirectory = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public yarnwrap.client.MinecraftClient instance() { return new yarnwrap.client.MinecraftClient(wrapperContained.instance); }
// public void instance(yarnwrap.client.MinecraftClient value) { wrapperContained.instance = value.wrapperContained; }
// public java.lang.String openProfilerSection() { return wrapperContained.openProfilerSection; }
// public void openProfilerSection(java.lang.String value) { wrapperContained.openProfilerSection = value; }
// public yarnwrap.client.toast.ToastManager toastManager() { return new yarnwrap.client.toast.ToastManager(wrapperContained.toastManager); }
// public void toastManager(yarnwrap.client.toast.ToastManager value) { wrapperContained.toastManager = value.wrapperContained; }
public boolean IS_SYSTEM_MAC() { return wrapperContained.IS_SYSTEM_MAC; }
// public void IS_SYSTEM_MAC(boolean value) { wrapperContained.IS_SYSTEM_MAC = value; }
// public yarnwrap.client.util.Window window() { return new yarnwrap.client.util.Window(wrapperContained.window); }
// public void window(yarnwrap.client.util.Window value) { wrapperContained.window = value.wrapperContained; }
public yarnwrap.client.gui.hud.InGameHud inGameHud() { return new yarnwrap.client.gui.hud.InGameHud(wrapperContained.inGameHud); }
// public void inGameHud(yarnwrap.client.gui.hud.InGameHud value) { wrapperContained.inGameHud = value.wrapperContained; }
// public yarnwrap.client.texture.PlayerSkinProvider skinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(wrapperContained.skinProvider); }
// public void skinProvider(yarnwrap.client.texture.PlayerSkinProvider value) { wrapperContained.skinProvider = value.wrapperContained; }
// public yarnwrap.client.font.FontManager fontManager() { return new yarnwrap.client.font.FontManager(wrapperContained.fontManager); }
// public void fontManager(yarnwrap.client.font.FontManager value) { wrapperContained.fontManager = value.wrapperContained; }
public yarnwrap.client.render.debug.DebugRenderer debugRenderer() { return new yarnwrap.client.render.debug.DebugRenderer(wrapperContained.debugRenderer); }
// public void debugRenderer(yarnwrap.client.render.debug.DebugRenderer value) { wrapperContained.debugRenderer = value.wrapperContained; }
// public java.lang.String gameVersion() { return wrapperContained.gameVersion; }
// public void gameVersion(java.lang.String value) { wrapperContained.gameVersion = value; }
// public long nextDebugInfoUpdateTime() { return wrapperContained.nextDebugInfoUpdateTime; }
// public void nextDebugInfoUpdateTime(long value) { wrapperContained.nextDebugInfoUpdateTime = value; }
public yarnwrap.client.particle.ParticleManager particleManager() { return new yarnwrap.client.particle.ParticleManager(wrapperContained.particleManager); }
// public void particleManager(yarnwrap.client.particle.ParticleManager value) { wrapperContained.particleManager = value.wrapperContained; }
// public yarnwrap.client.sound.MusicTracker musicTracker() { return new yarnwrap.client.sound.MusicTracker(wrapperContained.musicTracker); }
// public void musicTracker(yarnwrap.client.sound.MusicTracker value) { wrapperContained.musicTracker = value.wrapperContained; }
// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public void resourcePackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.resourcePackManager = value.wrapperContained; }
// public yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.languageManager); }
// public void languageManager(yarnwrap.client.resource.language.LanguageManager value) { wrapperContained.languageManager = value.wrapperContained; }
public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
public void cameraEntity(yarnwrap.entity.Entity value) { wrapperContained.cameraEntity = value.wrapperContained; }
// public java.lang.String versionType() { return wrapperContained.versionType; }
// public void versionType(java.lang.String value) { wrapperContained.versionType = value; }
// public boolean isDemo() { return wrapperContained.isDemo; }
// public void isDemo(boolean value) { wrapperContained.isDemo = value; }
// public com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return wrapperContained.sessionService; }
// public void sessionService(com.mojang.authlib.minecraft.MinecraftSessionService value) { wrapperContained.sessionService = value; }
public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
// public void session(yarnwrap.client.session.Session value) { wrapperContained.session = value.wrapperContained; }
// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public void soundManager(yarnwrap.client.sound.SoundManager value) { wrapperContained.soundManager = value.wrapperContained; }
// public Object renderTickCounter() { return wrapperContained.renderTickCounter; }
// // public void renderTickCounter(Object value) { wrapperContained.renderTickCounter = value; }
public yarnwrap.client.Mouse mouse() { return new yarnwrap.client.Mouse(wrapperContained.mouse); }
// public void mouse(yarnwrap.client.Mouse value) { wrapperContained.mouse = value.wrapperContained; }
public boolean chunkCullingEnabled() { return wrapperContained.chunkCullingEnabled; }
public void chunkCullingEnabled(boolean value) { wrapperContained.chunkCullingEnabled = value; }
// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public yarnwrap.client.option.HotbarStorage creativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(wrapperContained.creativeHotbarStorage); }
// public void creativeHotbarStorage(yarnwrap.client.option.HotbarStorage value) { wrapperContained.creativeHotbarStorage = value.wrapperContained; }
// public boolean paused() { return wrapperContained.paused; }
// public void paused(boolean value) { wrapperContained.paused = value; }
// public int fpsCounter() { return wrapperContained.fpsCounter; }
// public void fpsCounter(int value) { wrapperContained.fpsCounter = value; }
// public int currentFps() { return wrapperContained.currentFps; }
// public void currentFps(int value) { wrapperContained.currentFps = value; }
// public java.net.Proxy networkProxy() { return wrapperContained.networkProxy; }
// public void networkProxy(java.net.Proxy value) { wrapperContained.networkProxy = value; }
public yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_FONT_ID); }
// public void DEFAULT_FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_FONT_ID = value.wrapperContained; }
// public java.util.Queue renderTaskQueue() { return wrapperContained.renderTaskQueue; }
// public void renderTaskQueue(java.util.Queue value) { wrapperContained.renderTaskQueue = value; }
// public java.util.concurrent.atomic.AtomicReference worldGenProgressTracker() { return wrapperContained.worldGenProgressTracker; }
// public void worldGenProgressTracker(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.worldGenProgressTracker = value; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
public boolean skipGameRender() { return wrapperContained.skipGameRender; }
public void skipGameRender(boolean value) { wrapperContained.skipGameRender = value; }
// public yarnwrap.resource.ReloadableResourceManagerImpl resourceManager() { return new yarnwrap.resource.ReloadableResourceManagerImpl(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ReloadableResourceManagerImpl value) { wrapperContained.resourceManager = value.wrapperContained; }
// public yarnwrap.network.ClientConnection integratedServerConnection() { return new yarnwrap.network.ClientConnection(wrapperContained.integratedServerConnection); }
// public void integratedServerConnection(yarnwrap.network.ClientConnection value) { wrapperContained.integratedServerConnection = value.wrapperContained; }
// public java.util.function.Supplier crashReportSupplier() { return wrapperContained.crashReportSupplier; }
// public void crashReportSupplier(java.util.function.Supplier value) { wrapperContained.crashReportSupplier = value; }
// public yarnwrap.world.level.storage.LevelStorage levelStorage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.levelStorage); }
// public void levelStorage(yarnwrap.world.level.storage.LevelStorage value) { wrapperContained.levelStorage = value.wrapperContained; }
public yarnwrap.util.Identifier ALT_TEXT_RENDERER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ALT_TEXT_RENDERER_ID); }
// public void ALT_TEXT_RENDERER_ID(yarnwrap.util.Identifier value) { wrapperContained.ALT_TEXT_RENDERER_ID = value.wrapperContained; }
// public long lastMetricsSampleTime() { return wrapperContained.lastMetricsSampleTime; }
// public void lastMetricsSampleTime(long value) { wrapperContained.lastMetricsSampleTime = value; }
// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public void blockColors(yarnwrap.client.color.block.BlockColors value) { wrapperContained.blockColors = value.wrapperContained; }
// public int itemUseCooldown() { return wrapperContained.itemUseCooldown; }
// public void itemUseCooldown(int value) { wrapperContained.itemUseCooldown = value; }
public yarnwrap.client.gui.screen.Screen currentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.currentScreen); }
public void currentScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.currentScreen = value.wrapperContained; }
// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public java.nio.file.Path resourcePackDir() { return wrapperContained.resourcePackDir; }
// public void resourcePackDir(java.nio.file.Path value) { wrapperContained.resourcePackDir = value; }
// public yarnwrap.client.tutorial.TutorialManager tutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.tutorialManager); }
// public void tutorialManager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.tutorialManager = value.wrapperContained; }
// public boolean integratedServerRunning() { return wrapperContained.integratedServerRunning; }
// public void integratedServerRunning(boolean value) { wrapperContained.integratedServerRunning = value; }
// public yarnwrap.client.color.item.ItemColors itemColors() { return new yarnwrap.client.color.item.ItemColors(wrapperContained.itemColors); }
// public void itemColors(yarnwrap.client.color.item.ItemColors value) { wrapperContained.itemColors = value.wrapperContained; }
public yarnwrap.client.network.ClientPlayerInteractionManager interactionManager() { return new yarnwrap.client.network.ClientPlayerInteractionManager(wrapperContained.interactionManager); }
public void interactionManager(yarnwrap.client.network.ClientPlayerInteractionManager value) { wrapperContained.interactionManager = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.render.model.BakedModelManager bakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.bakedModelManager); }
// public void bakedModelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.bakedModelManager = value.wrapperContained; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
public yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(wrapperContained.crosshairTarget); }
public void crosshairTarget(yarnwrap.util.hit.HitResult value) { wrapperContained.crosshairTarget = value.wrapperContained; }
// public yarnwrap.server.integrated.IntegratedServer server() { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.server); }
// public void server(yarnwrap.server.integrated.IntegratedServer value) { wrapperContained.server = value.wrapperContained; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
public java.lang.String fpsDebugString() { return wrapperContained.fpsDebugString; }
public void fpsDebugString(java.lang.String value) { wrapperContained.fpsDebugString = value; }
// public int attackCooldown() { return wrapperContained.attackCooldown; }
// public void attackCooldown(int value) { wrapperContained.attackCooldown = value; }
public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
public yarnwrap.client.render.GameRenderer gameRenderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.gameRenderer); }
// public void gameRenderer(yarnwrap.client.render.GameRenderer value) { wrapperContained.gameRenderer = value.wrapperContained; }
public yarnwrap.client.Keyboard keyboard() { return new yarnwrap.client.Keyboard(wrapperContained.keyboard); }
// public void keyboard(yarnwrap.client.Keyboard value) { wrapperContained.keyboard = value.wrapperContained; }
// public yarnwrap.client.resource.SplashTextResourceSupplier splashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(wrapperContained.splashTextLoader); }
// public void splashTextLoader(yarnwrap.client.resource.SplashTextResourceSupplier value) { wrapperContained.splashTextLoader = value.wrapperContained; }
// public yarnwrap.client.texture.PaintingManager paintingManager() { return new yarnwrap.client.texture.PaintingManager(wrapperContained.paintingManager); }
// public void paintingManager(yarnwrap.client.texture.PaintingManager value) { wrapperContained.paintingManager = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture COMPLETED_UNIT_FUTURE() { return wrapperContained.COMPLETED_UNIT_FUTURE; }
// public void COMPLETED_UNIT_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.COMPLETED_UNIT_FUTURE = value; }
// public yarnwrap.client.texture.StatusEffectSpriteManager statusEffectSpriteManager() { return new yarnwrap.client.texture.StatusEffectSpriteManager(wrapperContained.statusEffectSpriteManager); }
// public void statusEffectSpriteManager(yarnwrap.client.texture.StatusEffectSpriteManager value) { wrapperContained.statusEffectSpriteManager = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture resourceReloadFuture() { return wrapperContained.resourceReloadFuture; }
// public void resourceReloadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.resourceReloadFuture = value; }
// public yarnwrap.client.gui.screen.Overlay overlay() { return new yarnwrap.client.gui.screen.Overlay(wrapperContained.overlay); }
// public void overlay(yarnwrap.client.gui.screen.Overlay value) { wrapperContained.overlay = value.wrapperContained; }
public boolean debugChunkInfo() { return wrapperContained.debugChunkInfo; }
public void debugChunkInfo(boolean value) { wrapperContained.debugChunkInfo = value; }
public boolean debugChunkOcclusion() { return wrapperContained.debugChunkOcclusion; }
public void debugChunkOcclusion(boolean value) { wrapperContained.debugChunkOcclusion = value; }
// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferBuilders = value.wrapperContained; }
// public int trackingTick() { return wrapperContained.trackingTick; }
// public void trackingTick(int value) { wrapperContained.trackingTick = value; }
// public yarnwrap.util.profiler.TickTimeTracker tickTimeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(wrapperContained.tickTimeTracker); }
// public void tickTimeTracker(yarnwrap.util.profiler.TickTimeTracker value) { wrapperContained.tickTimeTracker = value.wrapperContained; }
// public yarnwrap.util.profiler.ProfileResult tickProfilerResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.tickProfilerResult); }
// public void tickProfilerResult(yarnwrap.util.profiler.ProfileResult value) { wrapperContained.tickProfilerResult = value.wrapperContained; }
public yarnwrap.util.Identifier UNICODE_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.UNICODE_FONT_ID); }
// public void UNICODE_FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.UNICODE_FONT_ID = value.wrapperContained; }
// public boolean multiplayerEnabled() { return wrapperContained.multiplayerEnabled; }
// public void multiplayerEnabled(boolean value) { wrapperContained.multiplayerEnabled = value; }
// public boolean onlineChatEnabled() { return wrapperContained.onlineChatEnabled; }
// public void onlineChatEnabled(boolean value) { wrapperContained.onlineChatEnabled = value; }
// public yarnwrap.client.resource.VideoWarningManager videoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.videoWarningManager); }
// public void videoWarningManager(yarnwrap.client.resource.VideoWarningManager value) { wrapperContained.videoWarningManager = value.wrapperContained; }
// public yarnwrap.text.Text SOCIAL_INTERACTIONS_NOT_AVAILABLE() { return new yarnwrap.text.Text(wrapperContained.SOCIAL_INTERACTIONS_NOT_AVAILABLE); }
// public void SOCIAL_INTERACTIONS_NOT_AVAILABLE(yarnwrap.text.Text value) { wrapperContained.SOCIAL_INTERACTIONS_NOT_AVAILABLE = value.wrapperContained; }
// public yarnwrap.client.network.SocialInteractionsManager socialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(wrapperContained.socialInteractionsManager); }
// public void socialInteractionsManager(yarnwrap.client.network.SocialInteractionsManager value) { wrapperContained.socialInteractionsManager = value.wrapperContained; }
// public yarnwrap.client.toast.TutorialToast socialInteractionsToast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.socialInteractionsToast); }
// public void socialInteractionsToast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.socialInteractionsToast = value.wrapperContained; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public void entityModelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value) { wrapperContained.entityModelLoader = value.wrapperContained; }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value) { wrapperContained.blockEntityRenderDispatcher = value.wrapperContained; }
// public yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(wrapperContained.recorder); }
// public void recorder(yarnwrap.util.profiler.Recorder value) { wrapperContained.recorder = value.wrapperContained; }
public boolean wireFrame() { return wrapperContained.wireFrame; }
public void wireFrame(boolean value) { wrapperContained.wireFrame = value; }
// public yarnwrap.client.resource.ResourceReloadLogger resourceReloadLogger() { return new yarnwrap.client.resource.ResourceReloadLogger(wrapperContained.resourceReloadLogger); }
// public void resourceReloadLogger(yarnwrap.client.resource.ResourceReloadLogger value) { wrapperContained.resourceReloadLogger = value.wrapperContained; }
public java.lang.String GL_ERROR_DIALOGUE() { return wrapperContained.GL_ERROR_DIALOGUE; }
// public void GL_ERROR_DIALOGUE(java.lang.String value) { wrapperContained.GL_ERROR_DIALOGUE = value; }
// public yarnwrap.util.Identifier REGIONAL_COMPLIANCIES_ID() { return new yarnwrap.util.Identifier(wrapperContained.REGIONAL_COMPLIANCIES_ID); }
// public void REGIONAL_COMPLIANCIES_ID(yarnwrap.util.Identifier value) { wrapperContained.REGIONAL_COMPLIANCIES_ID = value.wrapperContained; }
// public yarnwrap.client.resource.PeriodicNotificationManager regionalComplianciesManager() { return new yarnwrap.client.resource.PeriodicNotificationManager(wrapperContained.regionalComplianciesManager); }
// public void regionalComplianciesManager(yarnwrap.client.resource.PeriodicNotificationManager value) { wrapperContained.regionalComplianciesManager = value.wrapperContained; }
// public long metricsSampleDuration() { return wrapperContained.metricsSampleDuration; }
// public void metricsSampleDuration(long value) { wrapperContained.metricsSampleDuration = value; }
// public double gpuUtilizationPercentage() { return wrapperContained.gpuUtilizationPercentage; }
// public void gpuUtilizationPercentage(double value) { wrapperContained.gpuUtilizationPercentage = value; }
// public Object currentGlTimerQuery() { return wrapperContained.currentGlTimerQuery; }
// // public void currentGlTimerQuery(Object value) { wrapperContained.currentGlTimerQuery = value; }
// public yarnwrap.client.session.ProfileKeys profileKeys() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.profileKeys); }
// public void profileKeys(yarnwrap.client.session.ProfileKeys value) { wrapperContained.profileKeys = value.wrapperContained; }
// public com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authenticationService() { return wrapperContained.authenticationService; }
// public void authenticationService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService value) { wrapperContained.authenticationService = value; }
// public yarnwrap.client.session.report.AbuseReportContext abuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.abuseReportContext); }
// public void abuseReportContext(yarnwrap.client.session.report.AbuseReportContext value) { wrapperContained.abuseReportContext = value.wrapperContained; }
// public yarnwrap.client.realms.RealmsPeriodicCheckers realmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(wrapperContained.realmsPeriodicCheckers); }
// public void realmsPeriodicCheckers(yarnwrap.client.realms.RealmsPeriodicCheckers value) { wrapperContained.realmsPeriodicCheckers = value.wrapperContained; }
// public yarnwrap.client.util.NarratorManager narratorManager() { return new yarnwrap.client.util.NarratorManager(wrapperContained.narratorManager); }
// public void narratorManager(yarnwrap.client.util.NarratorManager value) { wrapperContained.narratorManager = value.wrapperContained; }
// public yarnwrap.client.network.message.MessageHandler messageHandler() { return new yarnwrap.client.network.message.MessageHandler(wrapperContained.messageHandler); }
// public void messageHandler(yarnwrap.client.network.message.MessageHandler value) { wrapperContained.messageHandler = value.wrapperContained; }
public yarnwrap.client.font.TextRenderer advanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.advanceValidatingTextRenderer); }
// public void advanceValidatingTextRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.advanceValidatingTextRenderer = value.wrapperContained; }
// public yarnwrap.resource.DefaultResourcePack defaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.defaultResourcePack); }
// public void defaultResourcePack(yarnwrap.resource.DefaultResourcePack value) { wrapperContained.defaultResourcePack = value.wrapperContained; }
// public yarnwrap.client.resource.server.ServerResourcePackLoader serverResourcePackLoader() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(wrapperContained.serverResourcePackLoader); }
// public void serverResourcePackLoader(yarnwrap.client.resource.server.ServerResourcePackLoader value) { wrapperContained.serverResourcePackLoader = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.TelemetryManager telemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(wrapperContained.telemetryManager); }
// public void telemetryManager(yarnwrap.client.session.telemetry.TelemetryManager value) { wrapperContained.telemetryManager = value.wrapperContained; }
// public long renderTime() { return wrapperContained.renderTime; }
// public void renderTime(long value) { wrapperContained.renderTime = value; }
// public yarnwrap.client.gui.navigation.GuiNavigationType navigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(wrapperContained.navigationType); }
// public void navigationType(yarnwrap.client.gui.navigation.GuiNavigationType value) { wrapperContained.navigationType = value.wrapperContained; }
// public yarnwrap.client.QuickPlayLogger quickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.quickPlayLogger); }
// public void quickPlayLogger(yarnwrap.client.QuickPlayLogger value) { wrapperContained.quickPlayLogger = value.wrapperContained; }
// public yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.guiAtlasManager); }
// public void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value) { wrapperContained.guiAtlasManager = value.wrapperContained; }
// public yarnwrap.client.util.CommandHistoryManager commandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(wrapperContained.commandHistoryManager); }
// public void commandHistoryManager(yarnwrap.client.util.CommandHistoryManager value) { wrapperContained.commandHistoryManager = value.wrapperContained; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture gameProfileFuture() { return wrapperContained.gameProfileFuture; }
// public void gameProfileFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.gameProfileFuture = value; }
// public boolean finishedLoading() { return wrapperContained.finishedLoading; }
// public void finishedLoading(boolean value) { wrapperContained.finishedLoading = value; }
// public boolean disconnecting() { return wrapperContained.disconnecting; }
// public void disconnecting(boolean value) { wrapperContained.disconnecting = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public long uptimeInTicks() { return wrapperContained.uptimeInTicks; }
// public void uptimeInTicks(long value) { wrapperContained.uptimeInTicks = value; }
// public java.util.concurrent.CompletableFuture userPropertiesFuture() { return wrapperContained.userPropertiesFuture; }
// public void userPropertiesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.userPropertiesFuture = value; }
// public yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.mapDecorationsAtlasManager); }
// public void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value) { wrapperContained.mapDecorationsAtlasManager = value.wrapperContained; }
public yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.getResourceManager()); }
public java.nio.file.Path getResourcePackDir() { return wrapperContained.getResourcePackDir(); }
public yarnwrap.client.render.item.ItemRenderer getItemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.getItemRenderer()); }
// public void joinWorld(yarnwrap.client.world.ClientWorld world,Object worldEntryReason) { wrapperContained.joinWorld(world.wrapperContained,worldEntryReason); }
public yarnwrap.client.sound.SoundManager getSoundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.getSoundManager()); }
public java.net.Proxy getNetworkProxy() { return wrapperContained.getNetworkProxy(); }
public void stop() { wrapperContained.stop(); }
// public void drawProfilerResults(yarnwrap.client.gui.DrawContext context,yarnwrap.util.profiler.ProfileResult profileResult) { wrapperContained.drawProfilerResults(context.wrapperContained,profileResult.wrapperContained); }
public boolean isPaused() { return wrapperContained.isPaused(); }
public void setCrashReportSupplierAndAddDetails(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.setCrashReportSupplierAndAddDetails(crashReport.wrapperContained); }
public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
public boolean isIntegratedServerRunning() { return wrapperContained.isIntegratedServerRunning(); }
public boolean isHudEnabled() { return wrapperContained.isHudEnabled(); }
// public void addBlockEntityNbt(yarnwrap.item.ItemStack stack,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.addBlockEntityNbt(stack.wrapperContained,blockEntity.wrapperContained,registryManager.wrapperContained); }
public void setCameraEntity(yarnwrap.entity.Entity entity) { wrapperContained.setCameraEntity(entity.wrapperContained); }
public yarnwrap.client.color.block.BlockColors getBlockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.getBlockColors()); }
// public void handleGlErrorByDisableVsync(int error,long description) { wrapperContained.handleGlErrorByDisableVsync(error,description); }
public void setScreen(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreen(screen.wrapperContained); }
// public void handleInputEvents() { wrapperContained.handleInputEvents(); }
// public void doItemPick() { wrapperContained.doItemPick(); }
public java.util.concurrent.CompletableFuture reloadResourcesConcurrently() { return wrapperContained.reloadResourcesConcurrently(); }
public void run() { wrapperContained.run(); }
public java.lang.String getGameVersion() { return wrapperContained.getGameVersion(); }
public yarnwrap.client.resource.server.ServerResourcePackLoader getServerResourcePackProvider() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(wrapperContained.getServerResourcePackProvider()); }
public boolean isFancyGraphicsOrBetter() { return wrapperContained.isFancyGraphicsOrBetter(); }
// public void cleanUpAfterCrash() { wrapperContained.cleanUpAfterCrash(); }
public yarnwrap.resource.ResourcePackManager getResourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.getResourcePackManager()); }
public java.util.concurrent.CompletableFuture reloadResources() { return wrapperContained.reloadResources(); }
public yarnwrap.client.gl.Framebuffer getFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getFramebuffer()); }
// public void render(boolean tick) { wrapperContained.render(tick); }
public void handleProfilerKeyPress(int digit) { wrapperContained.handleProfilerKeyPress(digit); }
public yarnwrap.client.resource.language.LanguageManager getLanguageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.getLanguageManager()); }
// public boolean isDemo() { return wrapperContained.isDemo(); }
public yarnwrap.client.texture.TextureManager getTextureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.getTextureManager()); }
// public boolean doAttack() { return wrapperContained.doAttack(); }
public yarnwrap.client.sound.MusicTracker getMusicTracker() { return new yarnwrap.client.sound.MusicTracker(wrapperContained.getMusicTracker()); }
public yarnwrap.client.render.block.BlockRenderManager getBlockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.getBlockRenderManager()); }
public boolean isInSingleplayer() { return wrapperContained.isInSingleplayer(); }
public com.mojang.datafixers.DataFixer getDataFixer() { return wrapperContained.getDataFixer(); }
public yarnwrap.sound.MusicSound getMusicType() { return new yarnwrap.sound.MusicSound(wrapperContained.getMusicType()); }
public java.lang.String getVersionType() { return wrapperContained.getVersionType(); }
public yarnwrap.client.session.Session getSession() { return new yarnwrap.client.session.Session(wrapperContained.getSession()); }
public java.util.function.Function getSpriteAtlas(yarnwrap.util.Identifier id) { return wrapperContained.getSpriteAtlas(id.wrapperContained); }
public yarnwrap.client.MinecraftClient getInstance() { return new yarnwrap.client.MinecraftClient(wrapperContained.getInstance()); }
public yarnwrap.client.render.model.BakedModelManager getBakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getBakedModelManager()); }
public boolean hasReducedDebugInfo() { return wrapperContained.hasReducedDebugInfo(); }
public yarnwrap.client.network.ServerInfo getCurrentServerEntry() { return new yarnwrap.client.network.ServerInfo(wrapperContained.getCurrentServerEntry()); }
public yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.getCameraEntity()); }
public yarnwrap.client.render.entity.EntityRenderDispatcher getEntityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.getEntityRenderDispatcher()); }
public yarnwrap.client.network.ClientPlayNetworkHandler getNetworkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.getNetworkHandler()); }
public void printCrashReport(yarnwrap.client.MinecraftClient client,java.io.File runDirectory,yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.printCrashReport(client.wrapperContained,runDirectory,crashReport.wrapperContained); }
public yarnwrap.client.toast.ToastManager getToastManager() { return new yarnwrap.client.toast.ToastManager(wrapperContained.getToastManager()); }
public boolean isWindowFocused() { return wrapperContained.isWindowFocused(); }
public yarnwrap.client.option.HotbarStorage getCreativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(wrapperContained.getCreativeHotbarStorage()); }
public boolean forcesUnicodeFont() { return wrapperContained.forcesUnicodeFont(); }
public void tick() { wrapperContained.tick(); }
public yarnwrap.server.integrated.IntegratedServer getServer() { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.getServer()); }
public yarnwrap.client.tutorial.TutorialManager getTutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.getTutorialManager()); }
public yarnwrap.client.texture.PlayerSkinProvider getSkinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(wrapperContained.getSkinProvider()); }
// public void doItemUse() { wrapperContained.doItemUse(); }
public yarnwrap.world.level.storage.LevelStorage getLevelStorage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.getLevelStorage()); }
public yarnwrap.util.crash.CrashReport addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report) { return new yarnwrap.util.crash.CrashReport(wrapperContained.addDetailsToCrashReport(report.wrapperContained)); }
public boolean isAmbientOcclusionEnabled() { return wrapperContained.isAmbientOcclusionEnabled(); }
// public void handleBlockBreaking(boolean breaking) { wrapperContained.handleBlockBreaking(breaking); }
public void scheduleStop() { wrapperContained.scheduleStop(); }
// public int getFramerateLimit() { return wrapperContained.getFramerateLimit(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
// public void checkGameData() { wrapperContained.checkGameData(); }
public yarnwrap.client.resource.SplashTextResourceSupplier getSplashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(wrapperContained.getSplashTextLoader()); }
public void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen,boolean transferring) { wrapperContained.disconnect(disconnectionScreen.wrapperContained,transferring); }
// public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public void reset(yarnwrap.client.gui.screen.Screen resettingScreen) { wrapperContained.reset(resettingScreen.wrapperContained); }
public void disconnect() { wrapperContained.disconnect(); }
public yarnwrap.client.texture.PaintingManager getPaintingManager() { return new yarnwrap.client.texture.PaintingManager(wrapperContained.getPaintingManager()); }
public void setOverlay(yarnwrap.client.gui.screen.Overlay overlay) { wrapperContained.setOverlay(overlay.wrapperContained); }
public yarnwrap.client.texture.StatusEffectSpriteManager getStatusEffectSpriteManager() { return new yarnwrap.client.texture.StatusEffectSpriteManager(wrapperContained.getStatusEffectSpriteManager()); }
public yarnwrap.client.gui.screen.Overlay getOverlay() { return new yarnwrap.client.gui.screen.Overlay(wrapperContained.getOverlay()); }
public void openGameMenu(boolean pauseOnly) { wrapperContained.openGameMenu(pauseOnly); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public void addSystemDetailsToCrashReport(yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options,yarnwrap.util.crash.CrashReport report) { wrapperContained.addSystemDetailsToCrashReport(client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained,report.wrapperContained); }
public yarnwrap.client.util.Window getWindow() { return new yarnwrap.client.util.Window(wrapperContained.getWindow()); }
public yarnwrap.client.render.BufferBuilderStorage getBufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.getBufferBuilders()); }
public void setMipmapLevels(int mipmapLevels) { wrapperContained.setMipmapLevels(mipmapLevels); }
// public void handleResourceReloadException(java.lang.Throwable throwable,Object loadingContext) { wrapperContained.handleResourceReloadException(throwable,loadingContext); }
// public java.lang.String getWindowTitle() { return wrapperContained.getWindowTitle(); }
public void updateWindowTitle() { wrapperContained.updateWindowTitle(); }
public yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(wrapperContained.getModStatus()); }
// public yarnwrap.util.profiler.Profiler startMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor) { return new yarnwrap.util.profiler.Profiler(wrapperContained.startMonitor(active,monitor.wrapperContained)); }
// public void endMonitor(boolean active,yarnwrap.util.TickDurationMonitor monitor) { wrapperContained.endMonitor(active,monitor.wrapperContained); }
public boolean hasOutline(yarnwrap.entity.Entity entity) { return wrapperContained.hasOutline(entity.wrapperContained); }
// public void openChatScreen(java.lang.String text) { wrapperContained.openChatScreen(text); }
public boolean shouldBlockMessages(java.util.UUID sender) { return wrapperContained.shouldBlockMessages(sender); }
public boolean isMultiplayerEnabled() { return wrapperContained.isMultiplayerEnabled(); }
// public void startIntegratedServer(Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,boolean newWorld) { wrapperContained.startIntegratedServer(session,dataPackManager.wrapperContained,saveLoader.wrapperContained,newWorld); }
public boolean isFabulousGraphicsOrBetter() { return wrapperContained.isFabulousGraphicsOrBetter(); }
public void setScreenAndRender(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreenAndRender(screen.wrapperContained); }
public yarnwrap.client.resource.VideoWarningManager getVideoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.getVideoWarningManager()); }
// public void onResourceReloadFailure(java.lang.Throwable exception,yarnwrap.text.Text resourceName,Object loadingContext) { wrapperContained.onResourceReloadFailure(exception,resourceName.wrapperContained,loadingContext); }
public yarnwrap.client.network.SocialInteractionsManager getSocialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(wrapperContained.getSocialInteractionsManager()); }
// public boolean isConnectedToServer() { return wrapperContained.isConnectedToServer(); }
// public com.mojang.authlib.minecraft.UserApiService createUserApiService(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authService,yarnwrap.client.RunArgs runArgs) { return wrapperContained.createUserApiService(authService,runArgs.wrapperContained); }
public yarnwrap.client.render.entity.model.EntityModelLoader getEntityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.getEntityModelLoader()); }
public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher getBlockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.getBlockEntityRenderDispatcher()); }
public boolean shouldFilterText() { return wrapperContained.shouldFilterText(); }
public Object getChatRestriction() { return wrapperContained.getChatRestriction(); }
public boolean toggleDebugProfiler(java.util.function.Consumer chatMessageSender) { return wrapperContained.toggleDebugProfiler(chatMessageSender); }
public yarnwrap.text.Text takePanorama(java.io.File directory,int width,int height) { return new yarnwrap.text.Text(wrapperContained.takePanorama(directory,width,height)); }
// public yarnwrap.text.Text takeHugeScreenshot(java.io.File gameDirectory,int unitWidth,int unitHeight,int width,int height) { return new yarnwrap.text.Text(wrapperContained.takeHugeScreenshot(gameDirectory,unitWidth,unitHeight,width,height)); }
public yarnwrap.server.WorldGenerationProgressTracker getWorldGenerationProgressTracker() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.getWorldGenerationProgressTracker()); }
public boolean isRealmsEnabled() { return wrapperContained.isRealmsEnabled(); }
// public java.util.concurrent.CompletableFuture reloadResources(boolean force,Object loadingContext) { return wrapperContained.reloadResources(force,loadingContext); }
// public yarnwrap.util.SystemDetails addSystemDetailsToCrashReport(yarnwrap.util.SystemDetails systemDetails,yarnwrap.client.MinecraftClient client,yarnwrap.client.resource.language.LanguageManager languageManager,java.lang.String version,yarnwrap.client.option.GameOptions options) { return new yarnwrap.util.SystemDetails(wrapperContained.addSystemDetailsToCrashReport(systemDetails.wrapperContained,client.wrapperContained,languageManager.wrapperContained,version,options.wrapperContained)); }
// public java.nio.file.Path saveProfilingResult(yarnwrap.util.SystemDetails details,java.util.List files) { return wrapperContained.saveProfilingResult(details.wrapperContained,files); }
// public void stopRecorder() { wrapperContained.stopRecorder(); }
public void loadBlockList() { wrapperContained.loadBlockList(); }
// public boolean isCountrySetTo(java.lang.Object country) { return wrapperContained.isCountrySetTo(country); }
// public void forceStopRecorder() { wrapperContained.forceStopRecorder(); }
public double getGpuUtilizationPercentage() { return wrapperContained.getGpuUtilizationPercentage(); }
public yarnwrap.server.integrated.IntegratedServerLoader createIntegratedServerLoader() { return new yarnwrap.server.integrated.IntegratedServerLoader(wrapperContained.createIntegratedServerLoader()); }
public void setCrashReportSupplier(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.setCrashReportSupplier(crashReport.wrapperContained); }
public yarnwrap.client.session.ProfileKeys getProfileKeys() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.getProfileKeys()); }
public yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.getServicesSignatureVerifier()); }
public void ensureAbuseReportContext(yarnwrap.client.session.report.ReporterEnvironment environment) { wrapperContained.ensureAbuseReportContext(environment.wrapperContained); }
public yarnwrap.client.session.report.AbuseReportContext getAbuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.getAbuseReportContext()); }
public yarnwrap.client.realms.RealmsPeriodicCheckers getRealmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(wrapperContained.getRealmsPeriodicCheckers()); }
public com.mojang.authlib.minecraft.BanDetails getMultiplayerBanDetails() { return wrapperContained.getMultiplayerBanDetails(); }
public yarnwrap.client.util.NarratorManager getNarratorManager() { return new yarnwrap.client.util.NarratorManager(wrapperContained.getNarratorManager()); }
public yarnwrap.client.network.message.MessageHandler getMessageHandler() { return new yarnwrap.client.network.message.MessageHandler(wrapperContained.getMessageHandler()); }
public yarnwrap.resource.DefaultResourcePack getDefaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.getDefaultResourcePack()); }
public boolean isConnectedToLocalServer() { return wrapperContained.isConnectedToLocalServer(); }
public boolean isOptionalTelemetryEnabledByApi() { return wrapperContained.isOptionalTelemetryEnabledByApi(); }
public boolean isTelemetryEnabledByApi() { return wrapperContained.isTelemetryEnabledByApi(); }
public int getCurrentFps() { return wrapperContained.getCurrentFps(); }
public long getRenderTime() { return wrapperContained.getRenderTime(); }
public yarnwrap.client.session.telemetry.TelemetryManager getTelemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(wrapperContained.getTelemetryManager()); }
public boolean isOptionalTelemetryEnabled() { return wrapperContained.isOptionalTelemetryEnabled(); }
public void setNavigationType(yarnwrap.client.gui.navigation.GuiNavigationType navigationType) { wrapperContained.setNavigationType(navigationType.wrapperContained); }
public yarnwrap.client.gui.navigation.GuiNavigationType getNavigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(wrapperContained.getNavigationType()); }
// public void showResourceReloadFailureToast(yarnwrap.text.Text description) { wrapperContained.showResourceReloadFailureToast(description.wrapperContained); }
// public void onForcedResourceReloadFailure() { wrapperContained.onForcedResourceReloadFailure(); }
public yarnwrap.client.QuickPlayLogger getQuickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.getQuickPlayLogger()); }
// public void collectLoadTimes(Object loadingContext) { wrapperContained.collectLoadTimes(loadingContext); }
public yarnwrap.client.texture.GuiAtlasManager getGuiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.getGuiAtlasManager()); }
public yarnwrap.client.util.CommandHistoryManager getCommandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(wrapperContained.getCommandHistoryManager()); }
public boolean uuidEquals(java.util.UUID uuid) { return wrapperContained.uuidEquals(uuid); }
public yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.getSymlinkFinder()); }
public void enterReconfiguration(yarnwrap.client.gui.screen.Screen reconfigurationScreen) { wrapperContained.enterReconfiguration(reconfigurationScreen.wrapperContained); }
public com.mojang.authlib.GameProfile getGameProfile() { return wrapperContained.getGameProfile(); }
// public void onFinishedLoading(Object loadingContext) { wrapperContained.onFinishedLoading(loadingContext); }
public boolean isFinishedLoading() { return wrapperContained.isFinishedLoading(); }
public boolean isUsernameBanned() { return wrapperContained.isUsernameBanned(); }
// public void createInitScreens(java.util.List list) { wrapperContained.createInitScreens(list); }
public yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.getDebugHud()); }
// public java.lang.Runnable onInitFinished(Object loadingContext) { return wrapperContained.onInitFinished(loadingContext); }
// public java.lang.String formatSeconds(double seconds) { return wrapperContained.formatSeconds(seconds); }
// public void addUptimesToCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.addUptimesToCrashReport(section.wrapperContained); }
public java.lang.String getLauncherBrand() { return wrapperContained.getLauncherBrand(); }
// public void printCrashReport() { wrapperContained.printCrashReport(); }
public void printCrashReport(yarnwrap.util.crash.CrashReport crashReport) { wrapperContained.printCrashReport(crashReport.wrapperContained); }
// public float getTargetMillisPerTick(float millis) { return wrapperContained.getTargetMillisPerTick(millis); }
public void onDisconnected() { wrapperContained.onDisconnected(); }
public boolean providesProfileKeys() { return wrapperContained.providesProfileKeys(); }
// public Object getUserProperties() { return wrapperContained.getUserProperties(); }
public void disconnect(yarnwrap.client.gui.screen.Screen disconnectionScreen) { wrapperContained.disconnect(disconnectionScreen.wrapperContained); }
// public void onFontOptionsChanged() { wrapperContained.onFontOptionsChanged(); }
public yarnwrap.client.texture.MapDecorationsAtlasManager getMapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.getMapDecorationsAtlasManager()); }
public yarnwrap.client.render.RenderTickCounter getRenderTickCounter() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.getRenderTickCounter()); }
// public boolean shouldTick() { return wrapperContained.shouldTick(); }

}