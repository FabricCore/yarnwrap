package yarnwrap.server;
public class MinecraftServer { public net.minecraft.server.MinecraftServer wrapperContained; public MinecraftServer(net.minecraft.server.MinecraftServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread serverThread() { return wrapperContained.serverThread; }
// public void serverThread(java.lang.Thread value) { wrapperContained.serverThread = value; }
// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public java.util.concurrent.Executor workerExecutor() { return wrapperContained.workerExecutor; }
// public void workerExecutor(java.util.concurrent.Executor value) { wrapperContained.workerExecutor = value; }
// public yarnwrap.server.WorldGenerationProgressListenerFactory worldGenerationProgressListenerFactory() { return new yarnwrap.server.WorldGenerationProgressListenerFactory(wrapperContained.worldGenerationProgressListenerFactory); }
// public void worldGenerationProgressListenerFactory(yarnwrap.server.WorldGenerationProgressListenerFactory value) { wrapperContained.worldGenerationProgressListenerFactory = value.wrapperContained; }
// public java.lang.String serverId() { return wrapperContained.serverId; }
// public void serverId(java.lang.String value) { wrapperContained.serverId = value; }
public yarnwrap.world.level.LevelInfo DEMO_LEVEL_INFO() { return new yarnwrap.world.level.LevelInfo(wrapperContained.DEMO_LEVEL_INFO); }
// public void DEMO_LEVEL_INFO(yarnwrap.world.level.LevelInfo value) { wrapperContained.DEMO_LEVEL_INFO = value.wrapperContained; }
// public boolean waitingForNextTick() { return wrapperContained.waitingForNextTick; }
// public void waitingForNextTick(boolean value) { wrapperContained.waitingForNextTick = value; }
// public yarnwrap.command.DataCommandStorage dataCommandStorage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.dataCommandStorage); }
// public void dataCommandStorage(yarnwrap.command.DataCommandStorage value) { wrapperContained.dataCommandStorage = value.wrapperContained; }
// public yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(wrapperContained.recorder); }
// public void recorder(yarnwrap.util.profiler.Recorder value) { wrapperContained.recorder = value.wrapperContained; }
// public Object session() { return wrapperContained.session; }
// // public void session(Object value) { wrapperContained.session = value; }
// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(wrapperContained.saveHandler); }
// public void saveHandler(yarnwrap.world.PlayerSaveHandler value) { wrapperContained.saveHandler = value.wrapperContained; }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public void saveProperties(yarnwrap.world.SaveProperties value) { wrapperContained.saveProperties = value.wrapperContained; }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.combinedDynamicRegistries = value.wrapperContained; }
// public Object resourceManagerHolder() { return wrapperContained.resourceManagerHolder; }
// // public void resourceManagerHolder(Object value) { wrapperContained.resourceManagerHolder = value; }
public int MAX_WORLD_BORDER_RADIUS() { return wrapperContained.MAX_WORLD_BORDER_RADIUS; }
// public void MAX_WORLD_BORDER_RADIUS(int value) { wrapperContained.MAX_WORLD_BORDER_RADIUS = value; }
// public java.util.function.Consumer recorderResultConsumer() { return wrapperContained.recorderResultConsumer; }
// public void recorderResultConsumer(java.util.function.Consumer value) { wrapperContained.recorderResultConsumer = value; }
// public java.util.function.Consumer recorderDumpConsumer() { return wrapperContained.recorderDumpConsumer; }
// public void recorderDumpConsumer(java.util.function.Consumer value) { wrapperContained.recorderDumpConsumer = value; }
// public boolean needsRecorderSetup() { return wrapperContained.needsRecorderSetup; }
// public void needsRecorderSetup(boolean value) { wrapperContained.needsRecorderSetup = value; }
// public Object debugStart() { return wrapperContained.debugStart; }
// // public void debugStart(Object value) { wrapperContained.debugStart = value; }
// public boolean needsDebugSetup() { return wrapperContained.needsDebugSetup; }
// public void needsDebugSetup(boolean value) { wrapperContained.needsDebugSetup = value; }
public java.lang.String VANILLA() { return wrapperContained.VANILLA; }
// public void VANILLA(java.lang.String value) { wrapperContained.VANILLA = value; }
// public boolean saving() { return wrapperContained.saving; }
// public void saving(boolean value) { wrapperContained.saving = value; }
public com.mojang.authlib.GameProfile ANONYMOUS_PLAYER_PROFILE() { return wrapperContained.ANONYMOUS_PLAYER_PROFILE; }
// public void ANONYMOUS_PLAYER_PROFILE(com.mojang.authlib.GameProfile value) { wrapperContained.ANONYMOUS_PLAYER_PROFILE = value; }
// public com.mojang.authlib.GameProfile hostProfile() { return wrapperContained.hostProfile; }
// public void hostProfile(com.mojang.authlib.GameProfile value) { wrapperContained.hostProfile = value; }
// public yarnwrap.util.ApiServices apiServices() { return new yarnwrap.util.ApiServices(wrapperContained.apiServices); }
// public void apiServices(yarnwrap.util.ApiServices value) { wrapperContained.apiServices = value.wrapperContained; }
// public Object favicon() { return wrapperContained.favicon; }
// // public void favicon(Object value) { wrapperContained.favicon = value; }
// public boolean onlineMode() { return wrapperContained.onlineMode; }
// public void onlineMode(boolean value) { wrapperContained.onlineMode = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean loading() { return wrapperContained.loading; }
// public void loading(boolean value) { wrapperContained.loading = value; }
// public yarnwrap.entity.boss.BossBarManager bossBarManager() { return new yarnwrap.entity.boss.BossBarManager(wrapperContained.bossBarManager); }
// public void bossBarManager(yarnwrap.entity.boss.BossBarManager value) { wrapperContained.bossBarManager = value.wrapperContained; }
// public boolean demo() { return wrapperContained.demo; }
// public void demo(boolean value) { wrapperContained.demo = value; }
// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public long lastPlayerSampleUpdate() { return wrapperContained.lastPlayerSampleUpdate; }
// public void lastPlayerSampleUpdate(long value) { wrapperContained.lastPlayerSampleUpdate = value; }
// public java.security.KeyPair keyPair() { return wrapperContained.keyPair; }
// public void keyPair(java.security.KeyPair value) { wrapperContained.keyPair = value; }
// public boolean flightEnabled() { return wrapperContained.flightEnabled; }
// public void flightEnabled(boolean value) { wrapperContained.flightEnabled = value; }
// public int serverPort() { return wrapperContained.serverPort; }
// public void serverPort(int value) { wrapperContained.serverPort = value; }
// public yarnwrap.scoreboard.ServerScoreboard scoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.ServerScoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public boolean preventProxyConnections() { return wrapperContained.preventProxyConnections; }
// public void preventProxyConnections(boolean value) { wrapperContained.preventProxyConnections = value; }
// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public yarnwrap.server.ServerNetworkIo networkIo() { return new yarnwrap.server.ServerNetworkIo(wrapperContained.networkIo); }
// public void networkIo(yarnwrap.server.ServerNetworkIo value) { wrapperContained.networkIo = value.wrapperContained; }
// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public java.util.List serverGuiTickables() { return wrapperContained.serverGuiTickables; }
// public void serverGuiTickables(java.util.List value) { wrapperContained.serverGuiTickables = value; }
// public boolean enforceWhitelist() { return wrapperContained.enforceWhitelist; }
// public void enforceWhitelist(boolean value) { wrapperContained.enforceWhitelist = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public java.lang.String serverIp() { return wrapperContained.serverIp; }
// public void serverIp(java.lang.String value) { wrapperContained.serverIp = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public java.util.Map worlds() { return wrapperContained.worlds; }
// public void worlds(java.util.Map value) { wrapperContained.worlds = value; }
// public yarnwrap.server.function.CommandFunctionManager commandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(wrapperContained.commandFunctionManager); }
// public void commandFunctionManager(yarnwrap.server.function.CommandFunctionManager value) { wrapperContained.commandFunctionManager = value.wrapperContained; }
// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.server.ServerMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public yarnwrap.resource.ResourcePackManager dataPackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.dataPackManager); }
// public void dataPackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.dataPackManager = value.wrapperContained; }
// public int playerIdleTimeout() { return wrapperContained.playerIdleTimeout; }
// public void playerIdleTimeout(int value) { wrapperContained.playerIdleTimeout = value; }
// public java.net.Proxy proxy() { return wrapperContained.proxy; }
// public void proxy(java.net.Proxy value) { wrapperContained.proxy = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public boolean pvpEnabled() { return wrapperContained.pvpEnabled; }
// public void pvpEnabled(boolean value) { wrapperContained.pvpEnabled = value; }
// public int ticksUntilAutosave() { return wrapperContained.ticksUntilAutosave; }
// public void ticksUntilAutosave(int value) { wrapperContained.ticksUntilAutosave = value; }
// public long[] tickTimes() { return wrapperContained.tickTimes; }
// public void tickTimes(long[] value) { wrapperContained.tickTimes = value; }
// public long recentTickTimesNanos() { return wrapperContained.recentTickTimesNanos; }
// public void recentTickTimesNanos(long value) { wrapperContained.recentTickTimesNanos = value; }
// public long lastOverloadWarningNanos() { return wrapperContained.lastOverloadWarningNanos; }
// public void lastOverloadWarningNanos(long value) { wrapperContained.lastOverloadWarningNanos = value; }
// public long tickStartTimeNanos() { return wrapperContained.tickStartTimeNanos; }
// public void tickStartTimeNanos(long value) { wrapperContained.tickStartTimeNanos = value; }
// public long tickEndTimeNanos() { return wrapperContained.tickEndTimeNanos; }
// public void tickEndTimeNanos(long value) { wrapperContained.tickEndTimeNanos = value; }
// public float averageTickTime() { return wrapperContained.averageTickTime; }
// public void averageTickTime(float value) { wrapperContained.averageTickTime = value; }
// public yarnwrap.server.ServerTickManager tickManager() { return new yarnwrap.server.ServerTickManager(wrapperContained.tickManager); }
// public void tickManager(yarnwrap.server.ServerTickManager value) { wrapperContained.tickManager = value.wrapperContained; }
// public long OVERLOAD_THRESHOLD_NANOS() { return wrapperContained.OVERLOAD_THRESHOLD_NANOS; }
// public void OVERLOAD_THRESHOLD_NANOS(long value) { wrapperContained.OVERLOAD_THRESHOLD_NANOS = value; }
// public long OVERLOAD_WARNING_INTERVAL_NANOS() { return wrapperContained.OVERLOAD_WARNING_INTERVAL_NANOS; }
// public void OVERLOAD_WARNING_INTERVAL_NANOS(long value) { wrapperContained.OVERLOAD_WARNING_INTERVAL_NANOS = value; }
// public long PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS() { return wrapperContained.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS; }
// public void PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS(long value) { wrapperContained.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS = value; }
// public long PREPARE_START_REGION_TICK_DELAY_NANOS() { return wrapperContained.PREPARE_START_REGION_TICK_DELAY_NANOS; }
// public void PREPARE_START_REGION_TICK_DELAY_NANOS(long value) { wrapperContained.PREPARE_START_REGION_TICK_DELAY_NANOS = value; }
// public long prevFullTickLogTime() { return wrapperContained.prevFullTickLogTime; }
// public void prevFullTickLogTime(long value) { wrapperContained.prevFullTickLogTime = value; }
// public long tasksStartTime() { return wrapperContained.tasksStartTime; }
// public void tasksStartTime(long value) { wrapperContained.tasksStartTime = value; }
// public long waitTime() { return wrapperContained.waitTime; }
// public void waitTime(long value) { wrapperContained.waitTime = value; }
// public yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.brewingRecipeRegistry); }
// public void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.brewingRecipeRegistry = value.wrapperContained; }
// public java.util.concurrent.atomic.AtomicReference WORLD_GEN_EXCEPTION() { return wrapperContained.WORLD_GEN_EXCEPTION; }
// public void WORLD_GEN_EXCEPTION(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.WORLD_GEN_EXCEPTION = value; }
// public MinecraftServer(java.lang.Thread serverThread,Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,java.net.Proxy proxy,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.util.ApiServices apiServices,yarnwrap.server.WorldGenerationProgressListenerFactory worldGenerationProgressListenerFactory) { this.wrapperContained = new net.minecraft.server.MinecraftServer(serverThread,session,dataPackManager.wrapperContained,saveLoader.wrapperContained,proxy,dataFixer,apiServices.wrapperContained,worldGenerationProgressListenerFactory.wrapperContained); }
public boolean isStopping() { return wrapperContained.isStopping(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
// public void runTasksTillTickEnd() { wrapperContained.runTasksTillTickEnd(); }
// public void setServerId(java.lang.String serverId) { wrapperContained.setServerId(serverId); }
// public void initScoreboard(yarnwrap.world.PersistentStateManager persistentStateManager) { wrapperContained.initScoreboard(persistentStateManager.wrapperContained); }
// public void setToDebugWorldProperties(yarnwrap.world.SaveProperties properties) { wrapperContained.setToDebugWorldProperties(properties.wrapperContained); }
// public void sendDifficulty(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendDifficulty(player.wrapperContained); }
public boolean isHost(com.mojang.authlib.GameProfile profile) { return wrapperContained.isHost(profile); }
public void setDifficultyLocked(boolean locked) { wrapperContained.setDifficultyLocked(locked); }
// public boolean runOneTask() { return wrapperContained.runOneTask(); }
// public void dump(java.nio.file.Path path) { wrapperContained.dump(path); }
// public void dumpGamerules(java.nio.file.Path path) { wrapperContained.dumpGamerules(path); }
// public void dumpClasspath(java.nio.file.Path path) { wrapperContained.dumpClasspath(path); }
// public void dumpStats(java.nio.file.Path path) { wrapperContained.dumpStats(path); }
// public void dumpThreads(java.nio.file.Path path) { wrapperContained.dumpThreads(path); }
public int getFunctionPermissionLevel() { return wrapperContained.getFunctionPermissionLevel(); }
public yarnwrap.command.DataCommandStorage getDataCommandStorage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.getDataCommandStorage()); }
public yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(wrapperContained.getModStatus()); }
// public void startTickMetrics() { wrapperContained.startTickMetrics(); }
public boolean isDebugRunning() { return wrapperContained.isDebugRunning(); }
public yarnwrap.util.profiler.ProfileResult stopDebug() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.stopDebug()); }
public void endTickMetrics() { wrapperContained.endTickMetrics(); }
public java.nio.file.Path getSavePath(yarnwrap.util.WorldSavePath worldSavePath) { return wrapperContained.getSavePath(worldSavePath.wrapperContained); }
public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites(); }
public yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.getStructureTemplateManager()); }
public yarnwrap.world.SaveProperties getSaveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.getSaveProperties()); }
// public void updateMobSpawnOptions() { wrapperContained.updateMobSpawnOptions(); }
// public void updateDifficulty() { wrapperContained.updateDifficulty(); }
// public void setupSpawn(yarnwrap.server.world.ServerWorld world,yarnwrap.world.level.ServerWorldProperties worldProperties,boolean bonusChest,boolean debugWorld) { wrapperContained.setupSpawn(world.wrapperContained,worldProperties.wrapperContained,bonusChest,debugWorld); }
public boolean acceptsStatusQuery() { return wrapperContained.acceptsStatusQuery(); }
public int adjustTrackingDistance(int initialDistance) { return wrapperContained.adjustTrackingDistance(initialDistance); }
public java.util.Set getWorldRegistryKeys() { return wrapperContained.getWorldRegistryKeys(); }
// public java.util.concurrent.CompletionStage method_29437(com.google.common.collect.ImmutableList resourcePacks) { return wrapperContained.method_29437(resourcePacks); }
public java.util.concurrent.CompletableFuture reloadResources(java.util.Collection dataPacks) { return wrapperContained.reloadResources(dataPacks); }
// public void method_29440(java.util.Collection resourceManagerHolder) { wrapperContained.method_29440(resourceManagerHolder); }
// public yarnwrap.resource.DataPackSettings createDataPackSettings(yarnwrap.resource.ResourcePackManager dataPackManager,boolean allowEnabling) { return new yarnwrap.resource.DataPackSettings(wrapperContained.createDataPackSettings(dataPackManager.wrapperContained,allowEnabling)); }
public yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.DataConfiguration dataConfiguration,boolean initMode,boolean safeMode) { return new yarnwrap.resource.DataConfiguration(wrapperContained.loadDataPacks(resourcePackManager.wrapperContained,dataConfiguration.wrapperContained,initMode,safeMode)); }
// public boolean method_29738(java.util.Collection name) { return wrapperContained.method_29738(name); }
public yarnwrap.server.MinecraftServer startServer(java.util.function.Function serverFactory) { return new yarnwrap.server.MinecraftServer(wrapperContained.startServer(serverFactory)); }
// public void runServer() { wrapperContained.runServer(); }
public yarnwrap.server.world.ServerWorld getOverworld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getOverworld()); }
public Object getRegistryManager() { return wrapperContained.getRegistryManager(); }
public int getRateLimit() { return wrapperContained.getRateLimit(); }
public yarnwrap.server.filter.TextStream createFilterer(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.server.filter.TextStream(wrapperContained.createFilterer(player.wrapperContained)); }
// public void generateKeyPair() { wrapperContained.generateKeyPair(); }
public boolean requireResourcePack() { return wrapperContained.requireResourcePack(); }
public yarnwrap.server.network.ServerPlayerInteractionManager getPlayerInteractionManager(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.server.network.ServerPlayerInteractionManager(wrapperContained.getPlayerInteractionManager(player.wrapperContained)); }
public yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.getResourceManager()); }
public java.net.Proxy getProxy() { return wrapperContained.getProxy(); }
// public void dumpProperties(java.nio.file.Path file) { wrapperContained.dumpProperties(file); }
public java.security.KeyPair getKeyPair() { return wrapperContained.getKeyPair(); }
public boolean isFlightEnabled() { return wrapperContained.isFlightEnabled(); }
public com.mojang.authlib.GameProfileRepository getGameProfileRepo() { return wrapperContained.getGameProfileRepo(); }
public boolean save(boolean suppressLogs,boolean flush,boolean force) { return wrapperContained.save(suppressLogs,flush,force); }
public boolean isSingleplayer() { return wrapperContained.isSingleplayer(); }
public java.util.Optional getIconFile() { return wrapperContained.getIconFile(); }
public boolean hasGui() { return wrapperContained.hasGui(); }
public void kickNonWhitelistedPlayers(yarnwrap.server.command.ServerCommandSource source) { wrapperContained.kickNonWhitelistedPlayers(source.wrapperContained); }
public boolean isEnforceWhitelist() { return wrapperContained.isEnforceWhitelist(); }
public void setDemo(boolean demo) { wrapperContained.setDemo(demo); }
public void setEnforceWhitelist(boolean enforceWhitelist) { wrapperContained.setEnforceWhitelist(enforceWhitelist); }
// public void method_37318(yarnwrap.util.profiler.ProfileResult profileResult) { wrapperContained.method_37318(profileResult.wrapperContained); }
// public void method_37319(java.util.function.Consumer result) { wrapperContained.method_37319(result); }
public boolean shouldBroadcastRconToOps() { return wrapperContained.shouldBroadcastRconToOps(); }
public void setupRecorder(java.util.function.Consumer resultConsumer,java.util.function.Consumer dumpConsumer) { wrapperContained.setupRecorder(resultConsumer,dumpConsumer); }
public boolean isRecorderActive() { return wrapperContained.isRecorderActive(); }
public void resetRecorder() { wrapperContained.resetRecorder(); }
public void stopRecorder() { wrapperContained.stopRecorder(); }
public yarnwrap.util.SystemDetails addSystemDetails(yarnwrap.util.SystemDetails details) { return new yarnwrap.util.SystemDetails(wrapperContained.addSystemDetails(details.wrapperContained)); }
// public void method_37329(java.nio.file.Path path) { wrapperContained.method_37329(path); }
public yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.getCommandManager()); }
// public void loadWorld() { wrapperContained.loadWorld(); }
public boolean shouldSpawnNpcs() { return wrapperContained.shouldSpawnNpcs(); }
// public void method_37370(java.nio.file.Path path) { wrapperContained.method_37370(path); }
public java.lang.Iterable getWorlds() { return wrapperContained.getWorlds(); }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
public yarnwrap.server.function.CommandFunctionManager getCommandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(wrapperContained.getCommandFunctionManager()); }
public void addServerGuiTickable(java.lang.Runnable tickable) { wrapperContained.addServerGuiTickable(tickable); }
public void setCrashReport(yarnwrap.util.crash.CrashReport report) { wrapperContained.setCrashReport(report.wrapperContained); }
public void setFlightEnabled(boolean flightEnabled) { wrapperContained.setFlightEnabled(flightEnabled); }
public void stop(boolean waitForShutdown) { wrapperContained.stop(waitForShutdown); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
public int getMaxWorldBorderRadius() { return wrapperContained.getMaxWorldBorderRadius(); }
public boolean isStopped() { return wrapperContained.isStopped(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
public int getServerPort() { return wrapperContained.getServerPort(); }
public java.nio.file.Path getPath(java.lang.String path) { return wrapperContained.getPath(path); }
public boolean isUsingNativeTransport() { return wrapperContained.isUsingNativeTransport(); }
public yarnwrap.server.PlayerManager getPlayerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.getPlayerManager()); }
public yarnwrap.world.GameMode getForcedGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getForcedGameMode()); }
public boolean openToLan(yarnwrap.world.GameMode gameMode,boolean cheatsAllowed,int port) { return wrapperContained.openToLan(gameMode.wrapperContained,cheatsAllowed,port); }
public void setPreventProxyConnections(boolean preventProxyConnections) { wrapperContained.setPreventProxyConnections(preventProxyConnections); }
public yarnwrap.server.ServerMetadata getServerMetadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.getServerMetadata()); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
public int getNetworkCompressionThreshold() { return wrapperContained.getNetworkCompressionThreshold(); }
// public void prepareStartRegion(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener) { wrapperContained.prepareStartRegion(worldGenerationProgressListener.wrapperContained); }
public boolean shouldPreventProxyConnections() { return wrapperContained.shouldPreventProxyConnections(); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty,boolean forceUpdate) { wrapperContained.setDifficulty(difficulty.wrapperContained,forceUpdate); }
public void setServerPort(int serverPort) { wrapperContained.setServerPort(serverPort); }
public int getTicks() { return wrapperContained.getTicks(); }
public void shutdown() { wrapperContained.shutdown(); }
public boolean isMonsterSpawningEnabled() { return wrapperContained.isMonsterSpawningEnabled(); }
public boolean isSpawnProtected(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isSpawnProtected(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void createWorlds(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener) { wrapperContained.createWorlds(worldGenerationProgressListener.wrapperContained); }
public yarnwrap.server.ServerNetworkIo getNetworkIo() { return new yarnwrap.server.ServerNetworkIo(wrapperContained.getNetworkIo()); }
public yarnwrap.world.GameMode getDefaultGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getDefaultGameMode()); }
public yarnwrap.util.UserCache getUserCache() { return new yarnwrap.util.UserCache(wrapperContained.getUserCache()); }
public boolean shouldSpawnAnimals() { return wrapperContained.shouldSpawnAnimals(); }
public int getOpPermissionLevel() { return wrapperContained.getOpPermissionLevel(); }
public boolean isDemo() { return wrapperContained.isDemo(); }
public void setPlayerIdleTimeout(int playerIdleTimeout) { wrapperContained.setPlayerIdleTimeout(playerIdleTimeout); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public boolean areCommandBlocksEnabled() { return wrapperContained.areCommandBlocksEnabled(); }
public void tickWorlds(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tickWorlds(shouldKeepTicking); }
public void setPvpEnabled(boolean pvpEnabled) { wrapperContained.setPvpEnabled(pvpEnabled); }
public boolean isDedicated() { return wrapperContained.isDedicated(); }
public java.lang.String getServerIp() { return wrapperContained.getServerIp(); }
public boolean isLoading() { return wrapperContained.isLoading(); }
public void exit() { wrapperContained.exit(); }
// public boolean setupServer() { return wrapperContained.setupServer(); }
public long getTimeReference() { return wrapperContained.getTimeReference(); }
public boolean isOnlineMode() { return wrapperContained.isOnlineMode(); }
public int getSpawnRadius(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getSpawnRadius(world.wrapperContained); }
public java.nio.file.Path getRunDirectory() { return wrapperContained.getRunDirectory(); }
public void startDebug() { wrapperContained.startDebug(); }
public void setMotd(java.lang.String motd) { wrapperContained.setMotd(motd); }
public int getPermissionLevel(com.mojang.authlib.GameProfile profile) { return wrapperContained.getPermissionLevel(profile); }
public yarnwrap.resource.ResourcePackManager getDataPackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.getDataPackManager()); }
public yarnwrap.entity.boss.BossBarManager getBossBarManager() { return new yarnwrap.entity.boss.BossBarManager(wrapperContained.getBossBarManager()); }
public void setDefaultGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setDefaultGameMode(gameMode.wrapperContained); }
public int getSpawnProtectionRadius() { return wrapperContained.getSpawnProtectionRadius(); }
public void setServerIp(java.lang.String serverIp) { wrapperContained.setServerIp(serverIp); }
public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
public yarnwrap.scoreboard.ServerScoreboard getScoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(wrapperContained.getScoreboard()); }
public void setPlayerManager(yarnwrap.server.PlayerManager playerManager) { wrapperContained.setPlayerManager(playerManager.wrapperContained); }
public yarnwrap.server.world.ServerWorld getWorld(yarnwrap.registry.RegistryKey key) { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld(key.wrapperContained)); }
public yarnwrap.server.ServerAdvancementLoader getAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.getAdvancementLoader()); }
public boolean isPvpEnabled() { return wrapperContained.isPvpEnabled(); }
// public void method_3854(java.lang.Thread thread,java.lang.Throwable throwable) { wrapperContained.method_3854(thread,throwable); }
public com.mojang.datafixers.DataFixer getDataFixer() { return wrapperContained.getDataFixer(); }
public void forcePlayerSampleUpdate() { wrapperContained.forcePlayerSampleUpdate(); }
public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public java.lang.String method_38580(Object module) { return wrapperContained.method_38580(module); }
// public void dumpNativeModules(java.nio.file.Path path) { wrapperContained.dumpNativeModules(path); }
public yarnwrap.util.SystemDetails addExtraSystemDetails(yarnwrap.util.SystemDetails details) { return new yarnwrap.util.SystemDetails(wrapperContained.addExtraSystemDetails(details.wrapperContained)); }
public boolean isRemote() { return wrapperContained.isRemote(); }
public int getPlayerIdleTimeout() { return wrapperContained.getPlayerIdleTimeout(); }
public void setOnlineMode(boolean onlineMode) { wrapperContained.setOnlineMode(onlineMode); }
// public boolean shouldKeepTicking() { return wrapperContained.shouldKeepTicking(); }
public boolean saveAll(boolean suppressLogs,boolean flush,boolean force) { return wrapperContained.saveAll(suppressLogs,flush,force); }
public boolean isSaving() { return wrapperContained.isSaving(); }
public boolean hideOnlinePlayers() { return wrapperContained.hideOnlinePlayers(); }
// public boolean method_40056(yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_40056(world.wrapperContained); }
// public Object method_40374(yarnwrap.resource.LifecycledResourceManager dataPackContents) { return wrapperContained.method_40374(dataPackContents.wrapperContained); }
// public void method_40375(yarnwrap.resource.LifecycledResourceManager dataPackContents,yarnwrap.server.DataPackContents throwable) { wrapperContained.method_40375(dataPackContents.wrapperContained,throwable.wrapperContained); }
// public yarnwrap.util.crash.CrashReport createCrashReport(java.lang.Throwable throwable) { return new yarnwrap.util.crash.CrashReport(wrapperContained.createCrashReport(throwable)); }
public int getMaxChainedNeighborUpdates() { return wrapperContained.getMaxChainedNeighborUpdates(); }
public void forceStopRecorder() { wrapperContained.forceStopRecorder(); }
public boolean shouldEnforceSecureProfile() { return wrapperContained.shouldEnforceSecureProfile(); }
// public void logChatMessage(yarnwrap.text.Text message,Object params,java.lang.String prefix) { wrapperContained.logChatMessage(message.wrapperContained,params,prefix); }
public java.util.Optional getResourcePackProperties() { return wrapperContained.getResourcePackProperties(); }
public com.mojang.authlib.GameProfile getHostProfile() { return wrapperContained.getHostProfile(); }
public void setHostProfile(com.mojang.authlib.GameProfile hostProfile) { wrapperContained.setHostProfile(hostProfile); }
public yarnwrap.network.message.MessageDecorator getMessageDecorator() { return new yarnwrap.network.message.MessageDecorator(wrapperContained.getMessageDecorator()); }
public yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.getServicesSignatureVerifier()); }
public yarnwrap.registry.CombinedDynamicRegistries getCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.getCombinedDynamicRegistries()); }
// public void method_46841(yarnwrap.server.world.ServerWorld feature) { wrapperContained.method_46841(feature.wrapperContained); }
// public java.util.Optional method_46842(yarnwrap.registry.Registry featureRegistry) { return wrapperContained.method_46842(featureRegistry.wrapperContained); }
// public java.util.Optional loadFavicon() { return wrapperContained.loadFavicon(); }
// public yarnwrap.server.ServerMetadata createMetadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.createMetadata()); }
// public Object createMetadataPlayers() { return wrapperContained.createMetadataPlayers(); }
// public java.util.Optional method_49387(java.nio.file.Path path) { return wrapperContained.method_49387(path); }
// public boolean method_49388(java.nio.file.Path path) { return wrapperContained.method_49388(path); }
// public boolean method_49389(java.nio.file.Path path) { return wrapperContained.method_49389(path); }
public void sendTimeUpdatePackets() { wrapperContained.sendTimeUpdatePackets(); }
// public void sendTimeUpdatePackets(yarnwrap.server.world.ServerWorld world) { wrapperContained.sendTimeUpdatePackets(world.wrapperContained); }
public boolean shouldLogIps() { return wrapperContained.shouldLogIps(); }
// public void method_53501(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.method_53501(player.wrapperContained); }
// public boolean isMainThread() { return wrapperContained.isMainThread(); }
public boolean isPaused() { return wrapperContained.isPaused(); }
public void updateAutosaveTicks() { wrapperContained.updateAutosaveTicks(); }
public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
public yarnwrap.server.ServerTickManager getTickManager() { return new yarnwrap.server.ServerTickManager(wrapperContained.getTickManager()); }
public long getAverageNanosPerTick() { return wrapperContained.getAverageNanosPerTick(); }
public long[] getTickTimes() { return wrapperContained.getTickTimes(); }
// public int getAutosaveInterval() { return wrapperContained.getAutosaveInterval(); }
public boolean acceptsTransfers() { return wrapperContained.acceptsTransfers(); }
// public yarnwrap.util.profiler.log.DebugSampleLog getDebugSampleLog() { return new yarnwrap.util.profiler.log.DebugSampleLog(wrapperContained.getDebugSampleLog()); }
// public void pushTickLog(long tickStartTime) { wrapperContained.pushTickLog(tickStartTime); }
// public void pushFullTickLog() { wrapperContained.pushFullTickLog(); }
// public void startTaskPerformanceLog() { wrapperContained.startTaskPerformanceLog(); }
// public void pushPerformanceLogs() { wrapperContained.pushPerformanceLogs(); }
public void subscribeToDebugSample(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.subscribeToDebugSample(player.wrapperContained,type.wrapperContained); }
public boolean shouldPushTickTimeLog() { return wrapperContained.shouldPushTickTimeLog(); }
public Object getReloadableRegistries() { return wrapperContained.getReloadableRegistries(); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
// public void forceEnableRequestedFeatures(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { wrapperContained.forceEnableRequestedFeatures(resourcePackManager.wrapperContained,enabledFeatures.wrapperContained); }
// public yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Collection enabledProfiles,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean allowEnabling) { return new yarnwrap.resource.DataConfiguration(wrapperContained.loadDataPacks(resourcePackManager.wrapperContained,enabledProfiles,enabledFeatures.wrapperContained,allowEnabling)); }
public void setWorldGenException(java.lang.RuntimeException exception) { wrapperContained.setWorldGenException(exception); }
public boolean checkWorldGenException() { return wrapperContained.checkWorldGenException(); }
public boolean isWorldAllowed(yarnwrap.world.World world) { return wrapperContained.isWorldAllowed(world.wrapperContained); }
public yarnwrap.server.ServerLinks getServerLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.getServerLinks()); }
// public void writeChunkIoReport(yarnwrap.util.crash.CrashReport report,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.storage.StorageKey key) { wrapperContained.writeChunkIoReport(report.wrapperContained,pos.wrapperContained,key.wrapperContained); }

}