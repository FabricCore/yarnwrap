package yarnwrap.client;
public class MinecraftClient { public net.minecraft.client.MinecraftClient wrapperContained; public MinecraftClient(net.minecraft.client.MinecraftClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public yarnwrap.client.util.WindowProvider windowProvider() { return new yarnwrap.client.util.WindowProvider(wrapperContained.windowProvider); }
public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.client.gl.Framebuffer framebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.framebuffer); }
public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
public yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(wrapperContained.targetedEntity); }
// public boolean windowFocused() { return wrapperContained.windowFocused; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
public java.io.File runDirectory() { return wrapperContained.runDirectory; }
// public boolean running() { return wrapperContained.running; }
// public yarnwrap.client.MinecraftClient instance() { return new yarnwrap.client.MinecraftClient(wrapperContained.instance); }
// public java.lang.String openProfilerSection() { return wrapperContained.openProfilerSection; }
// public yarnwrap.client.toast.ToastManager toastManager() { return new yarnwrap.client.toast.ToastManager(wrapperContained.toastManager); }
public boolean IS_SYSTEM_MAC() { return wrapperContained.IS_SYSTEM_MAC; }
// public yarnwrap.client.util.Window window() { return new yarnwrap.client.util.Window(wrapperContained.window); }
public yarnwrap.client.gui.hud.InGameHud inGameHud() { return new yarnwrap.client.gui.hud.InGameHud(wrapperContained.inGameHud); }
// public yarnwrap.client.texture.PlayerSkinProvider skinProvider() { return new yarnwrap.client.texture.PlayerSkinProvider(wrapperContained.skinProvider); }
// public yarnwrap.client.font.FontManager fontManager() { return new yarnwrap.client.font.FontManager(wrapperContained.fontManager); }
public yarnwrap.client.render.debug.DebugRenderer debugRenderer() { return new yarnwrap.client.render.debug.DebugRenderer(wrapperContained.debugRenderer); }
// public java.lang.String gameVersion() { return wrapperContained.gameVersion; }
// public long nextDebugInfoUpdateTime() { return wrapperContained.nextDebugInfoUpdateTime; }
public yarnwrap.client.particle.ParticleManager particleManager() { return new yarnwrap.client.particle.ParticleManager(wrapperContained.particleManager); }
// public yarnwrap.client.sound.MusicTracker musicTracker() { return new yarnwrap.client.sound.MusicTracker(wrapperContained.musicTracker); }
// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.languageManager); }
public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
// public java.lang.String versionType() { return wrapperContained.versionType; }
// public boolean isDemo() { return wrapperContained.isDemo; }
// public com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return wrapperContained.sessionService; }
public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public Object renderTickCounter() { return wrapperContained.renderTickCounter; }
public yarnwrap.client.Mouse mouse() { return new yarnwrap.client.Mouse(wrapperContained.mouse); }
public boolean chunkCullingEnabled() { return wrapperContained.chunkCullingEnabled; }
// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public yarnwrap.client.option.HotbarStorage creativeHotbarStorage() { return new yarnwrap.client.option.HotbarStorage(wrapperContained.creativeHotbarStorage); }
// public boolean paused() { return wrapperContained.paused; }
// public int fpsCounter() { return wrapperContained.fpsCounter; }
// public int currentFps() { return wrapperContained.currentFps; }
// public java.net.Proxy networkProxy() { return wrapperContained.networkProxy; }
public yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_FONT_ID); }
// public java.util.Queue renderTaskQueue() { return wrapperContained.renderTaskQueue; }
// public java.util.concurrent.atomic.AtomicReference worldGenProgressTracker() { return wrapperContained.worldGenProgressTracker; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
public boolean skipGameRender() { return wrapperContained.skipGameRender; }
// public yarnwrap.resource.ReloadableResourceManagerImpl resourceManager() { return new yarnwrap.resource.ReloadableResourceManagerImpl(wrapperContained.resourceManager); }
// public yarnwrap.network.ClientConnection integratedServerConnection() { return new yarnwrap.network.ClientConnection(wrapperContained.integratedServerConnection); }
// public java.util.function.Supplier crashReportSupplier() { return wrapperContained.crashReportSupplier; }
// public yarnwrap.world.level.storage.LevelStorage levelStorage() { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.levelStorage); }
public yarnwrap.util.Identifier ALT_TEXT_RENDERER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ALT_TEXT_RENDERER_ID); }
// public long lastMetricsSampleTime() { return wrapperContained.lastMetricsSampleTime; }
// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public int itemUseCooldown() { return wrapperContained.itemUseCooldown; }
public yarnwrap.client.gui.screen.Screen currentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.currentScreen); }
// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public java.nio.file.Path resourcePackDir() { return wrapperContained.resourcePackDir; }
// public yarnwrap.client.tutorial.TutorialManager tutorialManager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.tutorialManager); }
// public boolean integratedServerRunning() { return wrapperContained.integratedServerRunning; }
// public yarnwrap.client.color.item.ItemColors itemColors() { return new yarnwrap.client.color.item.ItemColors(wrapperContained.itemColors); }
public yarnwrap.client.network.ClientPlayerInteractionManager interactionManager() { return new yarnwrap.client.network.ClientPlayerInteractionManager(wrapperContained.interactionManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.render.model.BakedModelManager bakedModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.bakedModelManager); }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
public yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(wrapperContained.crosshairTarget); }
// public yarnwrap.server.integrated.IntegratedServer server() { return new yarnwrap.server.integrated.IntegratedServer(wrapperContained.server); }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
public java.lang.String fpsDebugString() { return wrapperContained.fpsDebugString; }
// public int attackCooldown() { return wrapperContained.attackCooldown; }
public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
public yarnwrap.client.render.GameRenderer gameRenderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.gameRenderer); }
public yarnwrap.client.Keyboard keyboard() { return new yarnwrap.client.Keyboard(wrapperContained.keyboard); }
// public yarnwrap.client.resource.SplashTextResourceSupplier splashTextLoader() { return new yarnwrap.client.resource.SplashTextResourceSupplier(wrapperContained.splashTextLoader); }
// public yarnwrap.client.texture.PaintingManager paintingManager() { return new yarnwrap.client.texture.PaintingManager(wrapperContained.paintingManager); }
// public java.util.concurrent.CompletableFuture COMPLETED_UNIT_FUTURE() { return wrapperContained.COMPLETED_UNIT_FUTURE; }
// public yarnwrap.client.texture.StatusEffectSpriteManager statusEffectSpriteManager() { return new yarnwrap.client.texture.StatusEffectSpriteManager(wrapperContained.statusEffectSpriteManager); }
// public java.util.concurrent.CompletableFuture resourceReloadFuture() { return wrapperContained.resourceReloadFuture; }
// public yarnwrap.client.gui.screen.Overlay overlay() { return new yarnwrap.client.gui.screen.Overlay(wrapperContained.overlay); }
public boolean debugChunkInfo() { return wrapperContained.debugChunkInfo; }
public boolean debugChunkOcclusion() { return wrapperContained.debugChunkOcclusion; }
// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public int trackingTick() { return wrapperContained.trackingTick; }
// public yarnwrap.util.profiler.TickTimeTracker tickTimeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(wrapperContained.tickTimeTracker); }
// public yarnwrap.util.profiler.ProfileResult tickProfilerResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.tickProfilerResult); }
public yarnwrap.util.Identifier UNICODE_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.UNICODE_FONT_ID); }
// public boolean multiplayerEnabled() { return wrapperContained.multiplayerEnabled; }
// public boolean onlineChatEnabled() { return wrapperContained.onlineChatEnabled; }
// public yarnwrap.client.resource.VideoWarningManager videoWarningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.videoWarningManager); }
// public yarnwrap.text.Text SOCIAL_INTERACTIONS_NOT_AVAILABLE() { return new yarnwrap.text.Text(wrapperContained.SOCIAL_INTERACTIONS_NOT_AVAILABLE); }
// public yarnwrap.client.network.SocialInteractionsManager socialInteractionsManager() { return new yarnwrap.client.network.SocialInteractionsManager(wrapperContained.socialInteractionsManager); }
// public yarnwrap.client.toast.TutorialToast socialInteractionsToast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.socialInteractionsToast); }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(wrapperContained.recorder); }
public boolean wireFrame() { return wrapperContained.wireFrame; }
// public yarnwrap.client.resource.ResourceReloadLogger resourceReloadLogger() { return new yarnwrap.client.resource.ResourceReloadLogger(wrapperContained.resourceReloadLogger); }
public java.lang.String GL_ERROR_DIALOGUE() { return wrapperContained.GL_ERROR_DIALOGUE; }
// public yarnwrap.util.Identifier REGIONAL_COMPLIANCIES_ID() { return new yarnwrap.util.Identifier(wrapperContained.REGIONAL_COMPLIANCIES_ID); }
// public yarnwrap.client.resource.PeriodicNotificationManager regionalComplianciesManager() { return new yarnwrap.client.resource.PeriodicNotificationManager(wrapperContained.regionalComplianciesManager); }
// public long metricsSampleDuration() { return wrapperContained.metricsSampleDuration; }
// public double gpuUtilizationPercentage() { return wrapperContained.gpuUtilizationPercentage; }
// public Object currentGlTimerQuery() { return wrapperContained.currentGlTimerQuery; }
// public yarnwrap.client.session.ProfileKeys profileKeys() { return new yarnwrap.client.session.ProfileKeys(wrapperContained.profileKeys); }
// public com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService authenticationService() { return wrapperContained.authenticationService; }
// public yarnwrap.client.session.report.AbuseReportContext abuseReportContext() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.abuseReportContext); }
// public yarnwrap.client.realms.RealmsPeriodicCheckers realmsPeriodicCheckers() { return new yarnwrap.client.realms.RealmsPeriodicCheckers(wrapperContained.realmsPeriodicCheckers); }
// public yarnwrap.client.util.NarratorManager narratorManager() { return new yarnwrap.client.util.NarratorManager(wrapperContained.narratorManager); }
// public yarnwrap.client.network.message.MessageHandler messageHandler() { return new yarnwrap.client.network.message.MessageHandler(wrapperContained.messageHandler); }
public yarnwrap.client.font.TextRenderer advanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.advanceValidatingTextRenderer); }
// public yarnwrap.resource.DefaultResourcePack defaultResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.defaultResourcePack); }
// public yarnwrap.client.resource.server.ServerResourcePackLoader serverResourcePackLoader() { return new yarnwrap.client.resource.server.ServerResourcePackLoader(wrapperContained.serverResourcePackLoader); }
// public yarnwrap.client.session.telemetry.TelemetryManager telemetryManager() { return new yarnwrap.client.session.telemetry.TelemetryManager(wrapperContained.telemetryManager); }
// public long renderTime() { return wrapperContained.renderTime; }
// public yarnwrap.client.gui.navigation.GuiNavigationType navigationType() { return new yarnwrap.client.gui.navigation.GuiNavigationType(wrapperContained.navigationType); }
// public yarnwrap.client.QuickPlayLogger quickPlayLogger() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.quickPlayLogger); }
// public yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.guiAtlasManager); }
// public yarnwrap.client.util.CommandHistoryManager commandHistoryManager() { return new yarnwrap.client.util.CommandHistoryManager(wrapperContained.commandHistoryManager); }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public java.util.concurrent.CompletableFuture gameProfileFuture() { return wrapperContained.gameProfileFuture; }
// public boolean finishedLoading() { return wrapperContained.finishedLoading; }
// public boolean disconnecting() { return wrapperContained.disconnecting; }
// public long startTime() { return wrapperContained.startTime; }
// public long uptimeInTicks() { return wrapperContained.uptimeInTicks; }
// public java.util.concurrent.CompletableFuture userPropertiesFuture() { return wrapperContained.userPropertiesFuture; }
// public yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.mapDecorationsAtlasManager); }
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