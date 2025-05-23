package yarnwrap.server;
public class MinecraftServer { public net.minecraft.server.MinecraftServer wrapperContained; public MinecraftServer(net.minecraft.server.MinecraftServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean onlineMode() { return wrapperContained.onlineMode; }
// public void onlineMode(boolean value) { wrapperContained.onlineMode = value; }
// public static boolean onlineMode() { return net.minecraft.server.MinecraftServer.onlineMode; }
// public static void onlineMode(boolean value, ) { net.minecraft.server.MinecraftServer.onlineMode = value; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.MinecraftServer.running; }
// public static void running(boolean value, ) { net.minecraft.server.MinecraftServer.running = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.MinecraftServer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.MinecraftServer.LOGGER = value; }

// public boolean loading() { return wrapperContained.loading; }
// public void loading(boolean value) { wrapperContained.loading = value; }
// public static boolean loading() { return net.minecraft.server.MinecraftServer.loading; }
// public static void loading(boolean value, ) { net.minecraft.server.MinecraftServer.loading = value; }

// public yarnwrap.entity.boss.BossBarManager bossBarManager() { return new yarnwrap.entity.boss.BossBarManager(wrapperContained.bossBarManager); }
// public void bossBarManager(yarnwrap.entity.boss.BossBarManager value) { wrapperContained.bossBarManager = value.wrapperContained; }
// public static yarnwrap.entity.boss.BossBarManager bossBarManager() { return new yarnwrap.entity.boss.BossBarManager(net.minecraft.server.MinecraftServer.bossBarManager); }
// public static void bossBarManager(yarnwrap.entity.boss.BossBarManager value, ) { net.minecraft.server.MinecraftServer.bossBarManager = value.wrapperContained; }

// public boolean demo() { return wrapperContained.demo; }
// public void demo(boolean value) { wrapperContained.demo = value; }
// public static boolean demo() { return net.minecraft.server.MinecraftServer.demo; }
// public static void demo(boolean value, ) { net.minecraft.server.MinecraftServer.demo = value; }

// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public static yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(net.minecraft.server.MinecraftServer.playerManager); }
// public static void playerManager(yarnwrap.server.PlayerManager value, ) { net.minecraft.server.MinecraftServer.playerManager = value.wrapperContained; }

// public long lastPlayerSampleUpdate() { return wrapperContained.lastPlayerSampleUpdate; }
// public void lastPlayerSampleUpdate(long value) { wrapperContained.lastPlayerSampleUpdate = value; }
// public static long lastPlayerSampleUpdate() { return net.minecraft.server.MinecraftServer.lastPlayerSampleUpdate; }
// public static void lastPlayerSampleUpdate(long value, ) { net.minecraft.server.MinecraftServer.lastPlayerSampleUpdate = value; }

// public java.security.KeyPair keyPair() { return wrapperContained.keyPair; }
// public void keyPair(java.security.KeyPair value) { wrapperContained.keyPair = value; }
// public static java.security.KeyPair keyPair() { return net.minecraft.server.MinecraftServer.keyPair; }
// public static void keyPair(java.security.KeyPair value, ) { net.minecraft.server.MinecraftServer.keyPair = value; }

// public boolean flightEnabled() { return wrapperContained.flightEnabled; }
// public void flightEnabled(boolean value) { wrapperContained.flightEnabled = value; }
// public static boolean flightEnabled() { return net.minecraft.server.MinecraftServer.flightEnabled; }
// public static void flightEnabled(boolean value, ) { net.minecraft.server.MinecraftServer.flightEnabled = value; }

// public int serverPort() { return wrapperContained.serverPort; }
// public void serverPort(int value) { wrapperContained.serverPort = value; }
// public static int serverPort() { return net.minecraft.server.MinecraftServer.serverPort; }
// public static void serverPort(int value, ) { net.minecraft.server.MinecraftServer.serverPort = value; }

// public yarnwrap.scoreboard.ServerScoreboard scoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.ServerScoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public static yarnwrap.scoreboard.ServerScoreboard scoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(net.minecraft.server.MinecraftServer.scoreboard); }
// public static void scoreboard(yarnwrap.scoreboard.ServerScoreboard value, ) { net.minecraft.server.MinecraftServer.scoreboard = value.wrapperContained; }

// public boolean preventProxyConnections() { return wrapperContained.preventProxyConnections; }
// public void preventProxyConnections(boolean value) { wrapperContained.preventProxyConnections = value; }
// public static boolean preventProxyConnections() { return net.minecraft.server.MinecraftServer.preventProxyConnections; }
// public static void preventProxyConnections(boolean value, ) { net.minecraft.server.MinecraftServer.preventProxyConnections = value; }

// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public static boolean stopped() { return net.minecraft.server.MinecraftServer.stopped; }
// public static void stopped(boolean value, ) { net.minecraft.server.MinecraftServer.stopped = value; }

// public yarnwrap.server.ServerNetworkIo networkIo() { return new yarnwrap.server.ServerNetworkIo(wrapperContained.networkIo); }
// public void networkIo(yarnwrap.server.ServerNetworkIo value) { wrapperContained.networkIo = value.wrapperContained; }
// public static yarnwrap.server.ServerNetworkIo networkIo() { return new yarnwrap.server.ServerNetworkIo(net.minecraft.server.MinecraftServer.networkIo); }
// public static void networkIo(yarnwrap.server.ServerNetworkIo value, ) { net.minecraft.server.MinecraftServer.networkIo = value.wrapperContained; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public static java.lang.String motd() { return net.minecraft.server.MinecraftServer.motd; }
// public static void motd(java.lang.String value, ) { net.minecraft.server.MinecraftServer.motd = value; }

// public java.util.List serverGuiTickables() { return wrapperContained.serverGuiTickables; }
// public void serverGuiTickables(java.util.List value) { wrapperContained.serverGuiTickables = value; }
// public static java.util.List serverGuiTickables() { return net.minecraft.server.MinecraftServer.serverGuiTickables; }
// public static void serverGuiTickables(java.util.List value, ) { net.minecraft.server.MinecraftServer.serverGuiTickables = value; }

// public boolean enforceWhitelist() { return wrapperContained.enforceWhitelist; }
// public void enforceWhitelist(boolean value) { wrapperContained.enforceWhitelist = value; }
// public static boolean enforceWhitelist() { return net.minecraft.server.MinecraftServer.enforceWhitelist; }
// public static void enforceWhitelist(boolean value, ) { net.minecraft.server.MinecraftServer.enforceWhitelist = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.server.MinecraftServer.ticks; }
// public static void ticks(int value, ) { net.minecraft.server.MinecraftServer.ticks = value; }

// public java.lang.String serverIp() { return wrapperContained.serverIp; }
// public void serverIp(java.lang.String value) { wrapperContained.serverIp = value; }
// public static java.lang.String serverIp() { return net.minecraft.server.MinecraftServer.serverIp; }
// public static void serverIp(java.lang.String value, ) { net.minecraft.server.MinecraftServer.serverIp = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.server.MinecraftServer.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.server.MinecraftServer.dataFixer = value; }

// public java.util.Map worlds() { return wrapperContained.worlds; }
// public void worlds(java.util.Map value) { wrapperContained.worlds = value; }
// public static java.util.Map worlds() { return net.minecraft.server.MinecraftServer.worlds; }
// public static void worlds(java.util.Map value, ) { net.minecraft.server.MinecraftServer.worlds = value; }

// public yarnwrap.server.function.CommandFunctionManager commandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(wrapperContained.commandFunctionManager); }
// public void commandFunctionManager(yarnwrap.server.function.CommandFunctionManager value) { wrapperContained.commandFunctionManager = value.wrapperContained; }
// public static yarnwrap.server.function.CommandFunctionManager commandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(net.minecraft.server.MinecraftServer.commandFunctionManager); }
// public static void commandFunctionManager(yarnwrap.server.function.CommandFunctionManager value, ) { net.minecraft.server.MinecraftServer.commandFunctionManager = value.wrapperContained; }

// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.server.ServerMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.server.MinecraftServer.metadata); }
// public static void metadata(yarnwrap.server.ServerMetadata value, ) { net.minecraft.server.MinecraftServer.metadata = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackManager dataPackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.dataPackManager); }
// public void dataPackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.dataPackManager = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackManager dataPackManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.server.MinecraftServer.dataPackManager); }
// public static void dataPackManager(yarnwrap.resource.ResourcePackManager value, ) { net.minecraft.server.MinecraftServer.dataPackManager = value.wrapperContained; }

// public int playerIdleTimeout() { return wrapperContained.playerIdleTimeout; }
// public void playerIdleTimeout(int value) { wrapperContained.playerIdleTimeout = value; }
// public static int playerIdleTimeout() { return net.minecraft.server.MinecraftServer.playerIdleTimeout; }
// public static void playerIdleTimeout(int value, ) { net.minecraft.server.MinecraftServer.playerIdleTimeout = value; }

// public java.net.Proxy proxy() { return wrapperContained.proxy; }
// public void proxy(java.net.Proxy value) { wrapperContained.proxy = value; }
// public static java.net.Proxy proxy() { return net.minecraft.server.MinecraftServer.proxy; }
// public static void proxy(java.net.Proxy value, ) { net.minecraft.server.MinecraftServer.proxy = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.server.MinecraftServer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.server.MinecraftServer.random = value.wrapperContained; }

// public boolean pvpEnabled() { return wrapperContained.pvpEnabled; }
// public void pvpEnabled(boolean value) { wrapperContained.pvpEnabled = value; }
// public static boolean pvpEnabled() { return net.minecraft.server.MinecraftServer.pvpEnabled; }
// public static void pvpEnabled(boolean value, ) { net.minecraft.server.MinecraftServer.pvpEnabled = value; }

// public java.lang.Thread serverThread() { return wrapperContained.serverThread; }
// public void serverThread(java.lang.Thread value) { wrapperContained.serverThread = value; }
// public static java.lang.Thread serverThread() { return net.minecraft.server.MinecraftServer.serverThread; }
// public static void serverThread(java.lang.Thread value, ) { net.minecraft.server.MinecraftServer.serverThread = value; }

// public java.util.concurrent.Executor workerExecutor() { return wrapperContained.workerExecutor; }
// public void workerExecutor(java.util.concurrent.Executor value) { wrapperContained.workerExecutor = value; }
// public static java.util.concurrent.Executor workerExecutor() { return net.minecraft.server.MinecraftServer.workerExecutor; }
// public static void workerExecutor(java.util.concurrent.Executor value, ) { net.minecraft.server.MinecraftServer.workerExecutor = value; }

// public yarnwrap.server.WorldGenerationProgressListenerFactory worldGenerationProgressListenerFactory() { return new yarnwrap.server.WorldGenerationProgressListenerFactory(wrapperContained.worldGenerationProgressListenerFactory); }
// public void worldGenerationProgressListenerFactory(yarnwrap.server.WorldGenerationProgressListenerFactory value) { wrapperContained.worldGenerationProgressListenerFactory = value.wrapperContained; }
// public static yarnwrap.server.WorldGenerationProgressListenerFactory worldGenerationProgressListenerFactory() { return new yarnwrap.server.WorldGenerationProgressListenerFactory(net.minecraft.server.MinecraftServer.worldGenerationProgressListenerFactory); }
// public static void worldGenerationProgressListenerFactory(yarnwrap.server.WorldGenerationProgressListenerFactory value, ) { net.minecraft.server.MinecraftServer.worldGenerationProgressListenerFactory = value.wrapperContained; }

// public java.lang.String serverId() { return wrapperContained.serverId; }
// public void serverId(java.lang.String value) { wrapperContained.serverId = value; }
// public static java.lang.String serverId() { return net.minecraft.server.MinecraftServer.serverId; }
// public static void serverId(java.lang.String value, ) { net.minecraft.server.MinecraftServer.serverId = value; }

// public yarnwrap.world.level.LevelInfo DEMO_LEVEL_INFO() { return new yarnwrap.world.level.LevelInfo(wrapperContained.DEMO_LEVEL_INFO); }
// public void DEMO_LEVEL_INFO(yarnwrap.world.level.LevelInfo value) { wrapperContained.DEMO_LEVEL_INFO = value.wrapperContained; }
public static yarnwrap.world.level.LevelInfo DEMO_LEVEL_INFO() { return new yarnwrap.world.level.LevelInfo(net.minecraft.server.MinecraftServer.DEMO_LEVEL_INFO); }
// public static void DEMO_LEVEL_INFO(yarnwrap.world.level.LevelInfo value, ) { net.minecraft.server.MinecraftServer.DEMO_LEVEL_INFO = value.wrapperContained; }

// public boolean hasJustExecutedTask() { return wrapperContained.hasJustExecutedTask; }
// public void hasJustExecutedTask(boolean value) { wrapperContained.hasJustExecutedTask = value; }
// public static boolean hasJustExecutedTask() { return net.minecraft.server.MinecraftServer.hasJustExecutedTask; }
// public static void hasJustExecutedTask(boolean value, ) { net.minecraft.server.MinecraftServer.hasJustExecutedTask = value; }

// public yarnwrap.command.DataCommandStorage dataCommandStorage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.dataCommandStorage); }
// public void dataCommandStorage(yarnwrap.command.DataCommandStorage value) { wrapperContained.dataCommandStorage = value.wrapperContained; }
// public static yarnwrap.command.DataCommandStorage dataCommandStorage() { return new yarnwrap.command.DataCommandStorage(net.minecraft.server.MinecraftServer.dataCommandStorage); }
// public static void dataCommandStorage(yarnwrap.command.DataCommandStorage value, ) { net.minecraft.server.MinecraftServer.dataCommandStorage = value.wrapperContained; }

// public yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(wrapperContained.recorder); }
// public void recorder(yarnwrap.util.profiler.Recorder value) { wrapperContained.recorder = value.wrapperContained; }
// public static yarnwrap.util.profiler.Recorder recorder() { return new yarnwrap.util.profiler.Recorder(net.minecraft.server.MinecraftServer.recorder); }
// public static void recorder(yarnwrap.util.profiler.Recorder value, ) { net.minecraft.server.MinecraftServer.recorder = value.wrapperContained; }

// public Object session() { return wrapperContained.session; }
// // public void session(Object value) { wrapperContained.session = value; }
// // public static Object session() { return net.minecraft.server.MinecraftServer.session; }
// // public static void session(Object value, ) { net.minecraft.server.MinecraftServer.session = value; }

// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public static yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(net.minecraft.server.MinecraftServer.structureTemplateManager); }
// public static void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value, ) { net.minecraft.server.MinecraftServer.structureTemplateManager = value.wrapperContained; }

// public yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(wrapperContained.saveHandler); }
// public void saveHandler(yarnwrap.world.PlayerSaveHandler value) { wrapperContained.saveHandler = value.wrapperContained; }
// public static yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(net.minecraft.server.MinecraftServer.saveHandler); }
// public static void saveHandler(yarnwrap.world.PlayerSaveHandler value, ) { net.minecraft.server.MinecraftServer.saveHandler = value.wrapperContained; }

// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public void saveProperties(yarnwrap.world.SaveProperties value) { wrapperContained.saveProperties = value.wrapperContained; }
// public static yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(net.minecraft.server.MinecraftServer.saveProperties); }
// public static void saveProperties(yarnwrap.world.SaveProperties value, ) { net.minecraft.server.MinecraftServer.saveProperties = value.wrapperContained; }

// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.combinedDynamicRegistries = value.wrapperContained; }
// public static yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.server.MinecraftServer.combinedDynamicRegistries); }
// public static void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value, ) { net.minecraft.server.MinecraftServer.combinedDynamicRegistries = value.wrapperContained; }

// public Object resourceManagerHolder() { return wrapperContained.resourceManagerHolder; }
// // public void resourceManagerHolder(Object value) { wrapperContained.resourceManagerHolder = value; }
// // public static Object resourceManagerHolder() { return net.minecraft.server.MinecraftServer.resourceManagerHolder; }
// // public static void resourceManagerHolder(Object value, ) { net.minecraft.server.MinecraftServer.resourceManagerHolder = value; }

// public int MAX_WORLD_BORDER_RADIUS() { return wrapperContained.MAX_WORLD_BORDER_RADIUS; }
// public void MAX_WORLD_BORDER_RADIUS(int value) { wrapperContained.MAX_WORLD_BORDER_RADIUS = value; }
public static int MAX_WORLD_BORDER_RADIUS() { return net.minecraft.server.MinecraftServer.MAX_WORLD_BORDER_RADIUS; }
// public static void MAX_WORLD_BORDER_RADIUS(int value, ) { net.minecraft.server.MinecraftServer.MAX_WORLD_BORDER_RADIUS = value; }

// public java.util.function.Consumer recorderResultConsumer() { return wrapperContained.recorderResultConsumer; }
// public void recorderResultConsumer(java.util.function.Consumer value) { wrapperContained.recorderResultConsumer = value; }
// public static java.util.function.Consumer recorderResultConsumer() { return net.minecraft.server.MinecraftServer.recorderResultConsumer; }
// public static void recorderResultConsumer(java.util.function.Consumer value, ) { net.minecraft.server.MinecraftServer.recorderResultConsumer = value; }

// public java.util.function.Consumer recorderDumpConsumer() { return wrapperContained.recorderDumpConsumer; }
// public void recorderDumpConsumer(java.util.function.Consumer value) { wrapperContained.recorderDumpConsumer = value; }
// public static java.util.function.Consumer recorderDumpConsumer() { return net.minecraft.server.MinecraftServer.recorderDumpConsumer; }
// public static void recorderDumpConsumer(java.util.function.Consumer value, ) { net.minecraft.server.MinecraftServer.recorderDumpConsumer = value; }

// public boolean needsRecorderSetup() { return wrapperContained.needsRecorderSetup; }
// public void needsRecorderSetup(boolean value) { wrapperContained.needsRecorderSetup = value; }
// public static boolean needsRecorderSetup() { return net.minecraft.server.MinecraftServer.needsRecorderSetup; }
// public static void needsRecorderSetup(boolean value, ) { net.minecraft.server.MinecraftServer.needsRecorderSetup = value; }

// public Object debugStart() { return wrapperContained.debugStart; }
// // public void debugStart(Object value) { wrapperContained.debugStart = value; }
// // public static Object debugStart() { return net.minecraft.server.MinecraftServer.debugStart; }
// // public static void debugStart(Object value, ) { net.minecraft.server.MinecraftServer.debugStart = value; }

// public boolean needsDebugSetup() { return wrapperContained.needsDebugSetup; }
// public void needsDebugSetup(boolean value) { wrapperContained.needsDebugSetup = value; }
// public static boolean needsDebugSetup() { return net.minecraft.server.MinecraftServer.needsDebugSetup; }
// public static void needsDebugSetup(boolean value, ) { net.minecraft.server.MinecraftServer.needsDebugSetup = value; }

// public java.lang.String VANILLA() { return wrapperContained.VANILLA; }
// public void VANILLA(java.lang.String value) { wrapperContained.VANILLA = value; }
public static java.lang.String VANILLA() { return net.minecraft.server.MinecraftServer.VANILLA; }
// public static void VANILLA(java.lang.String value, ) { net.minecraft.server.MinecraftServer.VANILLA = value; }

// public boolean saving() { return wrapperContained.saving; }
// public void saving(boolean value) { wrapperContained.saving = value; }
// public static boolean saving() { return net.minecraft.server.MinecraftServer.saving; }
// public static void saving(boolean value, ) { net.minecraft.server.MinecraftServer.saving = value; }

// public com.mojang.authlib.GameProfile ANONYMOUS_PLAYER_PROFILE() { return wrapperContained.ANONYMOUS_PLAYER_PROFILE; }
// public void ANONYMOUS_PLAYER_PROFILE(com.mojang.authlib.GameProfile value) { wrapperContained.ANONYMOUS_PLAYER_PROFILE = value; }
public static com.mojang.authlib.GameProfile ANONYMOUS_PLAYER_PROFILE() { return net.minecraft.server.MinecraftServer.ANONYMOUS_PLAYER_PROFILE; }
// public static void ANONYMOUS_PLAYER_PROFILE(com.mojang.authlib.GameProfile value, ) { net.minecraft.server.MinecraftServer.ANONYMOUS_PLAYER_PROFILE = value; }

// public com.mojang.authlib.GameProfile hostProfile() { return wrapperContained.hostProfile; }
// public void hostProfile(com.mojang.authlib.GameProfile value) { wrapperContained.hostProfile = value; }
// public static com.mojang.authlib.GameProfile hostProfile() { return net.minecraft.server.MinecraftServer.hostProfile; }
// public static void hostProfile(com.mojang.authlib.GameProfile value, ) { net.minecraft.server.MinecraftServer.hostProfile = value; }

// public yarnwrap.util.ApiServices apiServices() { return new yarnwrap.util.ApiServices(wrapperContained.apiServices); }
// public void apiServices(yarnwrap.util.ApiServices value) { wrapperContained.apiServices = value.wrapperContained; }
// public static yarnwrap.util.ApiServices apiServices() { return new yarnwrap.util.ApiServices(net.minecraft.server.MinecraftServer.apiServices); }
// public static void apiServices(yarnwrap.util.ApiServices value, ) { net.minecraft.server.MinecraftServer.apiServices = value.wrapperContained; }

// public Object favicon() { return wrapperContained.favicon; }
// // public void favicon(Object value) { wrapperContained.favicon = value; }
// // public static Object favicon() { return net.minecraft.server.MinecraftServer.favicon; }
// // public static void favicon(Object value, ) { net.minecraft.server.MinecraftServer.favicon = value; }

// public int ticksUntilAutosave() { return wrapperContained.ticksUntilAutosave; }
// public void ticksUntilAutosave(int value) { wrapperContained.ticksUntilAutosave = value; }
// public static int ticksUntilAutosave() { return net.minecraft.server.MinecraftServer.ticksUntilAutosave; }
// public static void ticksUntilAutosave(int value, ) { net.minecraft.server.MinecraftServer.ticksUntilAutosave = value; }

// public long[] tickTimes() { return wrapperContained.tickTimes; }
// public void tickTimes(long[] value) { wrapperContained.tickTimes = value; }
// public static long[] tickTimes() { return net.minecraft.server.MinecraftServer.tickTimes; }
// public static void tickTimes(long[] value, ) { net.minecraft.server.MinecraftServer.tickTimes = value; }

// public long recentTickTimesNanos() { return wrapperContained.recentTickTimesNanos; }
// public void recentTickTimesNanos(long value) { wrapperContained.recentTickTimesNanos = value; }
// public static long recentTickTimesNanos() { return net.minecraft.server.MinecraftServer.recentTickTimesNanos; }
// public static void recentTickTimesNanos(long value, ) { net.minecraft.server.MinecraftServer.recentTickTimesNanos = value; }

// public long lastOverloadWarningNanos() { return wrapperContained.lastOverloadWarningNanos; }
// public void lastOverloadWarningNanos(long value) { wrapperContained.lastOverloadWarningNanos = value; }
// public static long lastOverloadWarningNanos() { return net.minecraft.server.MinecraftServer.lastOverloadWarningNanos; }
// public static void lastOverloadWarningNanos(long value, ) { net.minecraft.server.MinecraftServer.lastOverloadWarningNanos = value; }

// public long tickStartTimeNanos() { return wrapperContained.tickStartTimeNanos; }
// public void tickStartTimeNanos(long value) { wrapperContained.tickStartTimeNanos = value; }
// public static long tickStartTimeNanos() { return net.minecraft.server.MinecraftServer.tickStartTimeNanos; }
// public static void tickStartTimeNanos(long value, ) { net.minecraft.server.MinecraftServer.tickStartTimeNanos = value; }

// public long tickEndTimeNanos() { return wrapperContained.tickEndTimeNanos; }
// public void tickEndTimeNanos(long value) { wrapperContained.tickEndTimeNanos = value; }
// public static long tickEndTimeNanos() { return net.minecraft.server.MinecraftServer.tickEndTimeNanos; }
// public static void tickEndTimeNanos(long value, ) { net.minecraft.server.MinecraftServer.tickEndTimeNanos = value; }

// public float averageTickTime() { return wrapperContained.averageTickTime; }
// public void averageTickTime(float value) { wrapperContained.averageTickTime = value; }
// public static float averageTickTime() { return net.minecraft.server.MinecraftServer.averageTickTime; }
// public static void averageTickTime(float value, ) { net.minecraft.server.MinecraftServer.averageTickTime = value; }

// public yarnwrap.server.ServerTickManager tickManager() { return new yarnwrap.server.ServerTickManager(wrapperContained.tickManager); }
// public void tickManager(yarnwrap.server.ServerTickManager value) { wrapperContained.tickManager = value.wrapperContained; }
// public static yarnwrap.server.ServerTickManager tickManager() { return new yarnwrap.server.ServerTickManager(net.minecraft.server.MinecraftServer.tickManager); }
// public static void tickManager(yarnwrap.server.ServerTickManager value, ) { net.minecraft.server.MinecraftServer.tickManager = value.wrapperContained; }

// public long OVERLOAD_THRESHOLD_NANOS() { return wrapperContained.OVERLOAD_THRESHOLD_NANOS; }
// public void OVERLOAD_THRESHOLD_NANOS(long value) { wrapperContained.OVERLOAD_THRESHOLD_NANOS = value; }
// public static long OVERLOAD_THRESHOLD_NANOS() { return net.minecraft.server.MinecraftServer.OVERLOAD_THRESHOLD_NANOS; }
// public static void OVERLOAD_THRESHOLD_NANOS(long value, ) { net.minecraft.server.MinecraftServer.OVERLOAD_THRESHOLD_NANOS = value; }

// public long OVERLOAD_WARNING_INTERVAL_NANOS() { return wrapperContained.OVERLOAD_WARNING_INTERVAL_NANOS; }
// public void OVERLOAD_WARNING_INTERVAL_NANOS(long value) { wrapperContained.OVERLOAD_WARNING_INTERVAL_NANOS = value; }
// public static long OVERLOAD_WARNING_INTERVAL_NANOS() { return net.minecraft.server.MinecraftServer.OVERLOAD_WARNING_INTERVAL_NANOS; }
// public static void OVERLOAD_WARNING_INTERVAL_NANOS(long value, ) { net.minecraft.server.MinecraftServer.OVERLOAD_WARNING_INTERVAL_NANOS = value; }

// public long PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS() { return wrapperContained.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS; }
// public void PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS(long value) { wrapperContained.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS = value; }
// public static long PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS() { return net.minecraft.server.MinecraftServer.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS; }
// public static void PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS(long value, ) { net.minecraft.server.MinecraftServer.PLAYER_SAMPLE_UPDATE_INTERVAL_NANOS = value; }

// public long PREPARE_START_REGION_TICK_DELAY_NANOS() { return wrapperContained.PREPARE_START_REGION_TICK_DELAY_NANOS; }
// public void PREPARE_START_REGION_TICK_DELAY_NANOS(long value) { wrapperContained.PREPARE_START_REGION_TICK_DELAY_NANOS = value; }
// public static long PREPARE_START_REGION_TICK_DELAY_NANOS() { return net.minecraft.server.MinecraftServer.PREPARE_START_REGION_TICK_DELAY_NANOS; }
// public static void PREPARE_START_REGION_TICK_DELAY_NANOS(long value, ) { net.minecraft.server.MinecraftServer.PREPARE_START_REGION_TICK_DELAY_NANOS = value; }

// public long lastFullTickLogTime() { return wrapperContained.lastFullTickLogTime; }
// public void lastFullTickLogTime(long value) { wrapperContained.lastFullTickLogTime = value; }
// public static long lastFullTickLogTime() { return net.minecraft.server.MinecraftServer.lastFullTickLogTime; }
// public static void lastFullTickLogTime(long value, ) { net.minecraft.server.MinecraftServer.lastFullTickLogTime = value; }

// public long tasksStartTime() { return wrapperContained.tasksStartTime; }
// public void tasksStartTime(long value) { wrapperContained.tasksStartTime = value; }
// public static long tasksStartTime() { return net.minecraft.server.MinecraftServer.tasksStartTime; }
// public static void tasksStartTime(long value, ) { net.minecraft.server.MinecraftServer.tasksStartTime = value; }

// public long waitTime() { return wrapperContained.waitTime; }
// public void waitTime(long value) { wrapperContained.waitTime = value; }
// public static long waitTime() { return net.minecraft.server.MinecraftServer.waitTime; }
// public static void waitTime(long value, ) { net.minecraft.server.MinecraftServer.waitTime = value; }

// public yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.brewingRecipeRegistry); }
// public void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.brewingRecipeRegistry = value.wrapperContained; }
// public static yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.server.MinecraftServer.brewingRecipeRegistry); }
// public static void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value, ) { net.minecraft.server.MinecraftServer.brewingRecipeRegistry = value.wrapperContained; }

// public java.util.concurrent.atomic.AtomicReference WORLD_GEN_EXCEPTION() { return wrapperContained.WORLD_GEN_EXCEPTION; }
// public void WORLD_GEN_EXCEPTION(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.WORLD_GEN_EXCEPTION = value; }
// public static java.util.concurrent.atomic.AtomicReference WORLD_GEN_EXCEPTION() { return net.minecraft.server.MinecraftServer.WORLD_GEN_EXCEPTION; }
// public static void WORLD_GEN_EXCEPTION(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.server.MinecraftServer.WORLD_GEN_EXCEPTION = value; }

// public yarnwrap.item.FuelRegistry fuelRegistry() { return new yarnwrap.item.FuelRegistry(wrapperContained.fuelRegistry); }
// public void fuelRegistry(yarnwrap.item.FuelRegistry value) { wrapperContained.fuelRegistry = value.wrapperContained; }
// public static yarnwrap.item.FuelRegistry fuelRegistry() { return new yarnwrap.item.FuelRegistry(net.minecraft.server.MinecraftServer.fuelRegistry); }
// public static void fuelRegistry(yarnwrap.item.FuelRegistry value, ) { net.minecraft.server.MinecraftServer.fuelRegistry = value.wrapperContained; }

// public int idleTickCount() { return wrapperContained.idleTickCount; }
// public void idleTickCount(int value) { wrapperContained.idleTickCount = value; }
// public static int idleTickCount() { return net.minecraft.server.MinecraftServer.idleTickCount; }
// public static void idleTickCount(int value, ) { net.minecraft.server.MinecraftServer.idleTickCount = value; }

// public yarnwrap.util.crash.SuppressedExceptionsTracker suppressedExceptionsTracker() { return new yarnwrap.util.crash.SuppressedExceptionsTracker(wrapperContained.suppressedExceptionsTracker); }
// public void suppressedExceptionsTracker(yarnwrap.util.crash.SuppressedExceptionsTracker value) { wrapperContained.suppressedExceptionsTracker = value.wrapperContained; }
// public static yarnwrap.util.crash.SuppressedExceptionsTracker suppressedExceptionsTracker() { return new yarnwrap.util.crash.SuppressedExceptionsTracker(net.minecraft.server.MinecraftServer.suppressedExceptionsTracker); }
// public static void suppressedExceptionsTracker(yarnwrap.util.crash.SuppressedExceptionsTracker value, ) { net.minecraft.server.MinecraftServer.suppressedExceptionsTracker = value.wrapperContained; }

// public boolean waitingForNextTick() { return wrapperContained.waitingForNextTick; }
// public void waitingForNextTick(boolean value) { wrapperContained.waitingForNextTick = value; }
// public static boolean waitingForNextTick() { return net.minecraft.server.MinecraftServer.waitingForNextTick; }
// public static void waitingForNextTick(boolean value, ) { net.minecraft.server.MinecraftServer.waitingForNextTick = value; }

// public com.mojang.jtracy.DiscontinuousFrame discontinuousFrame() { return wrapperContained.discontinuousFrame; }
// public void discontinuousFrame(com.mojang.jtracy.DiscontinuousFrame value) { wrapperContained.discontinuousFrame = value; }
// public static com.mojang.jtracy.DiscontinuousFrame discontinuousFrame() { return net.minecraft.server.MinecraftServer.discontinuousFrame; }
// public static void discontinuousFrame(com.mojang.jtracy.DiscontinuousFrame value, ) { net.minecraft.server.MinecraftServer.discontinuousFrame = value; }

// public MinecraftServer(java.lang.Thread serverThread,Object session,yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.server.SaveLoader saveLoader,java.net.Proxy proxy,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.util.ApiServices apiServices,yarnwrap.server.WorldGenerationProgressListenerFactory worldGenerationProgressListenerFactory) { this.wrapperContained = new net.minecraft.server.MinecraftServer(serverThread,session,dataPackManager.wrapperContained,saveLoader.wrapperContained,proxy,dataFixer,apiServices.wrapperContained,worldGenerationProgressListenerFactory.wrapperContained); }
public java.security.KeyPair getKeyPair() { return wrapperContained.getKeyPair(); }
// public static java.security.KeyPair getKeyPair() { return net.minecraft.server.MinecraftServer.getKeyPair(); }
public boolean isFlightEnabled() { return wrapperContained.isFlightEnabled(); }
// public static boolean isFlightEnabled() { return net.minecraft.server.MinecraftServer.isFlightEnabled(); }
public com.mojang.authlib.GameProfileRepository getGameProfileRepo() { return wrapperContained.getGameProfileRepo(); }
// public static com.mojang.authlib.GameProfileRepository getGameProfileRepo() { return net.minecraft.server.MinecraftServer.getGameProfileRepo(); }
public boolean save(boolean suppressLogs,boolean flush,boolean force) { return wrapperContained.save(suppressLogs,flush,force); }
// public static boolean save(boolean suppressLogs,boolean flush,boolean force, ) { return net.minecraft.server.MinecraftServer.save(suppressLogs,flush,force); }
public boolean isSingleplayer() { return wrapperContained.isSingleplayer(); }
// public static boolean isSingleplayer() { return net.minecraft.server.MinecraftServer.isSingleplayer(); }
public java.util.Optional getIconFile() { return wrapperContained.getIconFile(); }
// public static java.util.Optional getIconFile() { return net.minecraft.server.MinecraftServer.getIconFile(); }
public boolean hasGui() { return wrapperContained.hasGui(); }
// public static boolean hasGui() { return net.minecraft.server.MinecraftServer.hasGui(); }
public void kickNonWhitelistedPlayers(yarnwrap.server.command.ServerCommandSource source) { wrapperContained.kickNonWhitelistedPlayers(source.wrapperContained); }
// public static void kickNonWhitelistedPlayers(yarnwrap.server.command.ServerCommandSource source, ) { net.minecraft.server.MinecraftServer.kickNonWhitelistedPlayers(source.wrapperContained); }
public boolean isEnforceWhitelist() { return wrapperContained.isEnforceWhitelist(); }
// public static boolean isEnforceWhitelist() { return net.minecraft.server.MinecraftServer.isEnforceWhitelist(); }
public void setDemo(boolean demo) { wrapperContained.setDemo(demo); }
// public static void setDemo(boolean demo, ) { net.minecraft.server.MinecraftServer.setDemo(demo); }
public void setEnforceWhitelist(boolean enforceWhitelist) { wrapperContained.setEnforceWhitelist(enforceWhitelist); }
// public static void setEnforceWhitelist(boolean enforceWhitelist, ) { net.minecraft.server.MinecraftServer.setEnforceWhitelist(enforceWhitelist); }
public boolean shouldBroadcastRconToOps() { return wrapperContained.shouldBroadcastRconToOps(); }
// public static boolean shouldBroadcastRconToOps() { return net.minecraft.server.MinecraftServer.shouldBroadcastRconToOps(); }
public yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.getCommandManager()); }
// public static yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(net.minecraft.server.MinecraftServer.getCommandManager()); }
// public void loadWorld() { wrapperContained.loadWorld(); }
// public static void loadWorld() { net.minecraft.server.MinecraftServer.loadWorld(); }
public java.lang.Iterable getWorlds() { return wrapperContained.getWorlds(); }
// public static java.lang.Iterable getWorlds() { return net.minecraft.server.MinecraftServer.getWorlds(); }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public static yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.MinecraftServer.getCommandSource()); }
public yarnwrap.server.function.CommandFunctionManager getCommandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(wrapperContained.getCommandFunctionManager()); }
// public static yarnwrap.server.function.CommandFunctionManager getCommandFunctionManager() { return new yarnwrap.server.function.CommandFunctionManager(net.minecraft.server.MinecraftServer.getCommandFunctionManager()); }
public void addServerGuiTickable(java.lang.Runnable tickable) { wrapperContained.addServerGuiTickable(tickable); }
// public static void addServerGuiTickable(java.lang.Runnable tickable, ) { net.minecraft.server.MinecraftServer.addServerGuiTickable(tickable); }
public void setCrashReport(yarnwrap.util.crash.CrashReport report) { wrapperContained.setCrashReport(report.wrapperContained); }
// public static void setCrashReport(yarnwrap.util.crash.CrashReport report, ) { net.minecraft.server.MinecraftServer.setCrashReport(report.wrapperContained); }
public void setFlightEnabled(boolean flightEnabled) { wrapperContained.setFlightEnabled(flightEnabled); }
// public static void setFlightEnabled(boolean flightEnabled, ) { net.minecraft.server.MinecraftServer.setFlightEnabled(flightEnabled); }
public void stop(boolean waitForShutdown) { wrapperContained.stop(waitForShutdown); }
// public static void stop(boolean waitForShutdown, ) { net.minecraft.server.MinecraftServer.stop(waitForShutdown); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.MinecraftServer.tick(shouldKeepTicking); }
public int getMaxWorldBorderRadius() { return wrapperContained.getMaxWorldBorderRadius(); }
// public static int getMaxWorldBorderRadius() { return net.minecraft.server.MinecraftServer.getMaxWorldBorderRadius(); }
public boolean isStopped() { return wrapperContained.isStopped(); }
// public static boolean isStopped() { return net.minecraft.server.MinecraftServer.isStopped(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
// public static boolean isHardcore() { return net.minecraft.server.MinecraftServer.isHardcore(); }
public int getServerPort() { return wrapperContained.getServerPort(); }
// public static int getServerPort() { return net.minecraft.server.MinecraftServer.getServerPort(); }
public java.nio.file.Path getPath(java.lang.String path) { return wrapperContained.getPath(path); }
// public static java.nio.file.Path getPath(java.lang.String path, ) { return net.minecraft.server.MinecraftServer.getPath(path); }
public boolean isUsingNativeTransport() { return wrapperContained.isUsingNativeTransport(); }
// public static boolean isUsingNativeTransport() { return net.minecraft.server.MinecraftServer.isUsingNativeTransport(); }
public yarnwrap.server.PlayerManager getPlayerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.getPlayerManager()); }
// public static yarnwrap.server.PlayerManager getPlayerManager() { return new yarnwrap.server.PlayerManager(net.minecraft.server.MinecraftServer.getPlayerManager()); }
public yarnwrap.world.GameMode getForcedGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getForcedGameMode()); }
// public static yarnwrap.world.GameMode getForcedGameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.MinecraftServer.getForcedGameMode()); }
public boolean openToLan(yarnwrap.world.GameMode gameMode,boolean cheatsAllowed,int port) { return wrapperContained.openToLan(gameMode.wrapperContained,cheatsAllowed,port); }
// public static boolean openToLan(yarnwrap.world.GameMode gameMode,boolean cheatsAllowed,int port, ) { return net.minecraft.server.MinecraftServer.openToLan(gameMode.wrapperContained,cheatsAllowed,port); }
public void setPreventProxyConnections(boolean preventProxyConnections) { wrapperContained.setPreventProxyConnections(preventProxyConnections); }
// public static void setPreventProxyConnections(boolean preventProxyConnections, ) { net.minecraft.server.MinecraftServer.setPreventProxyConnections(preventProxyConnections); }
public yarnwrap.server.ServerMetadata getServerMetadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.getServerMetadata()); }
// public static yarnwrap.server.ServerMetadata getServerMetadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.server.MinecraftServer.getServerMetadata()); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public static yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(net.minecraft.server.MinecraftServer.getGameRules()); }
public yarnwrap.recipe.ServerRecipeManager getRecipeManager() { return new yarnwrap.recipe.ServerRecipeManager(wrapperContained.getRecipeManager()); }
// public static yarnwrap.recipe.ServerRecipeManager getRecipeManager() { return new yarnwrap.recipe.ServerRecipeManager(net.minecraft.server.MinecraftServer.getRecipeManager()); }
public int getNetworkCompressionThreshold() { return wrapperContained.getNetworkCompressionThreshold(); }
// public static int getNetworkCompressionThreshold() { return net.minecraft.server.MinecraftServer.getNetworkCompressionThreshold(); }
// public void prepareStartRegion(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener) { wrapperContained.prepareStartRegion(worldGenerationProgressListener.wrapperContained); }
// public static void prepareStartRegion(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener, ) { net.minecraft.server.MinecraftServer.prepareStartRegion(worldGenerationProgressListener.wrapperContained); }
public boolean shouldPreventProxyConnections() { return wrapperContained.shouldPreventProxyConnections(); }
// public static boolean shouldPreventProxyConnections() { return net.minecraft.server.MinecraftServer.shouldPreventProxyConnections(); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty,boolean forceUpdate) { wrapperContained.setDifficulty(difficulty.wrapperContained,forceUpdate); }
// public static void setDifficulty(yarnwrap.world.Difficulty difficulty,boolean forceUpdate, ) { net.minecraft.server.MinecraftServer.setDifficulty(difficulty.wrapperContained,forceUpdate); }
public void setServerPort(int serverPort) { wrapperContained.setServerPort(serverPort); }
// public static void setServerPort(int serverPort, ) { net.minecraft.server.MinecraftServer.setServerPort(serverPort); }
public int getTicks() { return wrapperContained.getTicks(); }
// public static int getTicks() { return net.minecraft.server.MinecraftServer.getTicks(); }
public void shutdown() { wrapperContained.shutdown(); }
// public static void shutdown() { net.minecraft.server.MinecraftServer.shutdown(); }
public boolean isMonsterSpawningEnabled() { return wrapperContained.isMonsterSpawningEnabled(); }
// public static boolean isMonsterSpawningEnabled() { return net.minecraft.server.MinecraftServer.isMonsterSpawningEnabled(); }
public boolean isSpawnProtected(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isSpawnProtected(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static boolean isSpawnProtected(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.server.MinecraftServer.isSpawnProtected(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void createWorlds(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener) { wrapperContained.createWorlds(worldGenerationProgressListener.wrapperContained); }
// public static void createWorlds(yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener, ) { net.minecraft.server.MinecraftServer.createWorlds(worldGenerationProgressListener.wrapperContained); }
public yarnwrap.server.ServerNetworkIo getNetworkIo() { return new yarnwrap.server.ServerNetworkIo(wrapperContained.getNetworkIo()); }
// public static yarnwrap.server.ServerNetworkIo getNetworkIo() { return new yarnwrap.server.ServerNetworkIo(net.minecraft.server.MinecraftServer.getNetworkIo()); }
public yarnwrap.world.GameMode getDefaultGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getDefaultGameMode()); }
// public static yarnwrap.world.GameMode getDefaultGameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.MinecraftServer.getDefaultGameMode()); }
public yarnwrap.util.UserCache getUserCache() { return new yarnwrap.util.UserCache(wrapperContained.getUserCache()); }
// public static yarnwrap.util.UserCache getUserCache() { return new yarnwrap.util.UserCache(net.minecraft.server.MinecraftServer.getUserCache()); }
public int getOpPermissionLevel() { return wrapperContained.getOpPermissionLevel(); }
// public static int getOpPermissionLevel() { return net.minecraft.server.MinecraftServer.getOpPermissionLevel(); }
public boolean isDemo() { return wrapperContained.isDemo(); }
// public static boolean isDemo() { return net.minecraft.server.MinecraftServer.isDemo(); }
public void setPlayerIdleTimeout(int playerIdleTimeout) { wrapperContained.setPlayerIdleTimeout(playerIdleTimeout); }
// public static void setPlayerIdleTimeout(int playerIdleTimeout, ) { net.minecraft.server.MinecraftServer.setPlayerIdleTimeout(playerIdleTimeout); }
public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.server.MinecraftServer.isRunning(); }
public boolean areCommandBlocksEnabled() { return wrapperContained.areCommandBlocksEnabled(); }
// public static boolean areCommandBlocksEnabled() { return net.minecraft.server.MinecraftServer.areCommandBlocksEnabled(); }
// public void tickWorlds(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tickWorlds(shouldKeepTicking); }
// public static void tickWorlds(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.MinecraftServer.tickWorlds(shouldKeepTicking); }
public void setPvpEnabled(boolean pvpEnabled) { wrapperContained.setPvpEnabled(pvpEnabled); }
// public static void setPvpEnabled(boolean pvpEnabled, ) { net.minecraft.server.MinecraftServer.setPvpEnabled(pvpEnabled); }
public boolean isDedicated() { return wrapperContained.isDedicated(); }
// public static boolean isDedicated() { return net.minecraft.server.MinecraftServer.isDedicated(); }
public java.lang.String getServerIp() { return wrapperContained.getServerIp(); }
// public static java.lang.String getServerIp() { return net.minecraft.server.MinecraftServer.getServerIp(); }
public boolean isLoading() { return wrapperContained.isLoading(); }
// public static boolean isLoading() { return net.minecraft.server.MinecraftServer.isLoading(); }
public void exit() { wrapperContained.exit(); }
// public static void exit() { net.minecraft.server.MinecraftServer.exit(); }
// public boolean setupServer() { return wrapperContained.setupServer(); }
// public static boolean setupServer() { return net.minecraft.server.MinecraftServer.setupServer(); }
public long getTimeReference() { return wrapperContained.getTimeReference(); }
// public static long getTimeReference() { return net.minecraft.server.MinecraftServer.getTimeReference(); }
public boolean isOnlineMode() { return wrapperContained.isOnlineMode(); }
// public static boolean isOnlineMode() { return net.minecraft.server.MinecraftServer.isOnlineMode(); }
public int getSpawnRadius(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getSpawnRadius(world.wrapperContained); }
// public static int getSpawnRadius(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.server.MinecraftServer.getSpawnRadius(world.wrapperContained); }
public java.nio.file.Path getRunDirectory() { return wrapperContained.getRunDirectory(); }
// public static java.nio.file.Path getRunDirectory() { return net.minecraft.server.MinecraftServer.getRunDirectory(); }
public void startDebug() { wrapperContained.startDebug(); }
// public static void startDebug() { net.minecraft.server.MinecraftServer.startDebug(); }
public void setMotd(java.lang.String motd) { wrapperContained.setMotd(motd); }
// public static void setMotd(java.lang.String motd, ) { net.minecraft.server.MinecraftServer.setMotd(motd); }
public int getPermissionLevel(com.mojang.authlib.GameProfile profile) { return wrapperContained.getPermissionLevel(profile); }
// public static int getPermissionLevel(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.MinecraftServer.getPermissionLevel(profile); }
public yarnwrap.resource.ResourcePackManager getDataPackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.getDataPackManager()); }
// public static yarnwrap.resource.ResourcePackManager getDataPackManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.server.MinecraftServer.getDataPackManager()); }
public yarnwrap.entity.boss.BossBarManager getBossBarManager() { return new yarnwrap.entity.boss.BossBarManager(wrapperContained.getBossBarManager()); }
// public static yarnwrap.entity.boss.BossBarManager getBossBarManager() { return new yarnwrap.entity.boss.BossBarManager(net.minecraft.server.MinecraftServer.getBossBarManager()); }
public void setDefaultGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setDefaultGameMode(gameMode.wrapperContained); }
// public static void setDefaultGameMode(yarnwrap.world.GameMode gameMode, ) { net.minecraft.server.MinecraftServer.setDefaultGameMode(gameMode.wrapperContained); }
public int getSpawnProtectionRadius() { return wrapperContained.getSpawnProtectionRadius(); }
// public static int getSpawnProtectionRadius() { return net.minecraft.server.MinecraftServer.getSpawnProtectionRadius(); }
public void setServerIp(java.lang.String serverIp) { wrapperContained.setServerIp(serverIp); }
// public static void setServerIp(java.lang.String serverIp, ) { net.minecraft.server.MinecraftServer.setServerIp(serverIp); }
public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
// public static com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return net.minecraft.server.MinecraftServer.getSessionService(); }
public yarnwrap.scoreboard.ServerScoreboard getScoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(wrapperContained.getScoreboard()); }
// public static yarnwrap.scoreboard.ServerScoreboard getScoreboard() { return new yarnwrap.scoreboard.ServerScoreboard(net.minecraft.server.MinecraftServer.getScoreboard()); }
public void setPlayerManager(yarnwrap.server.PlayerManager playerManager) { wrapperContained.setPlayerManager(playerManager.wrapperContained); }
// public static void setPlayerManager(yarnwrap.server.PlayerManager playerManager, ) { net.minecraft.server.MinecraftServer.setPlayerManager(playerManager.wrapperContained); }
public yarnwrap.server.world.ServerWorld getWorld(yarnwrap.registry.RegistryKey key) { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld(key.wrapperContained)); }
// public static yarnwrap.server.world.ServerWorld getWorld(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.MinecraftServer.getWorld(key.wrapperContained)); }
public yarnwrap.server.ServerAdvancementLoader getAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.getAdvancementLoader()); }
// public static yarnwrap.server.ServerAdvancementLoader getAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(net.minecraft.server.MinecraftServer.getAdvancementLoader()); }
public boolean isPvpEnabled() { return wrapperContained.isPvpEnabled(); }
// public static boolean isPvpEnabled() { return net.minecraft.server.MinecraftServer.isPvpEnabled(); }
// public void method_3854(java.lang.Thread thread,java.lang.Throwable throwable) { wrapperContained.method_3854(thread,throwable); }
// public static void method_3854(java.lang.Thread thread,java.lang.Throwable throwable, ) { net.minecraft.server.MinecraftServer.method_3854(thread,throwable); }
public com.mojang.datafixers.DataFixer getDataFixer() { return wrapperContained.getDataFixer(); }
// public static com.mojang.datafixers.DataFixer getDataFixer() { return net.minecraft.server.MinecraftServer.getDataFixer(); }
public void forcePlayerSampleUpdate() { wrapperContained.forcePlayerSampleUpdate(); }
// public static void forcePlayerSampleUpdate() { net.minecraft.server.MinecraftServer.forcePlayerSampleUpdate(); }
public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public static java.lang.String[] getPlayerNames() { return net.minecraft.server.MinecraftServer.getPlayerNames(); }
public yarnwrap.util.SystemDetails addExtraSystemDetails(yarnwrap.util.SystemDetails details) { return new yarnwrap.util.SystemDetails(wrapperContained.addExtraSystemDetails(details.wrapperContained)); }
// public static yarnwrap.util.SystemDetails addExtraSystemDetails(yarnwrap.util.SystemDetails details, ) { return new yarnwrap.util.SystemDetails(net.minecraft.server.MinecraftServer.addExtraSystemDetails(details.wrapperContained)); }
public boolean isRemote() { return wrapperContained.isRemote(); }
// public static boolean isRemote() { return net.minecraft.server.MinecraftServer.isRemote(); }
public int getPlayerIdleTimeout() { return wrapperContained.getPlayerIdleTimeout(); }
// public static int getPlayerIdleTimeout() { return net.minecraft.server.MinecraftServer.getPlayerIdleTimeout(); }
public void setOnlineMode(boolean onlineMode) { wrapperContained.setOnlineMode(onlineMode); }
// public static void setOnlineMode(boolean onlineMode, ) { net.minecraft.server.MinecraftServer.setOnlineMode(onlineMode); }
// public boolean shouldKeepTicking() { return wrapperContained.shouldKeepTicking(); }
// public static boolean shouldKeepTicking() { return net.minecraft.server.MinecraftServer.shouldKeepTicking(); }
// public boolean isMainThread() { return wrapperContained.isMainThread(); }
// public static boolean isMainThread() { return net.minecraft.server.MinecraftServer.isMainThread(); }
public boolean isStopping() { return wrapperContained.isStopping(); }
// public static boolean isStopping() { return net.minecraft.server.MinecraftServer.isStopping(); }
// public yarnwrap.util.profiler.Profiler startTickMetrics() { return new yarnwrap.util.profiler.Profiler(wrapperContained.startTickMetrics()); }
// public static yarnwrap.util.profiler.Profiler startTickMetrics() { return new yarnwrap.util.profiler.Profiler(net.minecraft.server.MinecraftServer.startTickMetrics()); }
// public void runTasksTillTickEnd() { wrapperContained.runTasksTillTickEnd(); }
// public static void runTasksTillTickEnd() { net.minecraft.server.MinecraftServer.runTasksTillTickEnd(); }
// public void setServerId(java.lang.String serverId) { wrapperContained.setServerId(serverId); }
// public static void setServerId(java.lang.String serverId, ) { net.minecraft.server.MinecraftServer.setServerId(serverId); }
// public void initScoreboard(yarnwrap.world.PersistentStateManager persistentStateManager) { wrapperContained.initScoreboard(persistentStateManager.wrapperContained); }
// public static void initScoreboard(yarnwrap.world.PersistentStateManager persistentStateManager, ) { net.minecraft.server.MinecraftServer.initScoreboard(persistentStateManager.wrapperContained); }
// public void setToDebugWorldProperties(yarnwrap.world.SaveProperties properties) { wrapperContained.setToDebugWorldProperties(properties.wrapperContained); }
// public static void setToDebugWorldProperties(yarnwrap.world.SaveProperties properties, ) { net.minecraft.server.MinecraftServer.setToDebugWorldProperties(properties.wrapperContained); }
// public void sendDifficulty(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendDifficulty(player.wrapperContained); }
// public static void sendDifficulty(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.MinecraftServer.sendDifficulty(player.wrapperContained); }
public boolean isHost(com.mojang.authlib.GameProfile profile) { return wrapperContained.isHost(profile); }
// public static boolean isHost(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.MinecraftServer.isHost(profile); }
public void setDifficultyLocked(boolean locked) { wrapperContained.setDifficultyLocked(locked); }
// public static void setDifficultyLocked(boolean locked, ) { net.minecraft.server.MinecraftServer.setDifficultyLocked(locked); }
// public boolean runOneTask() { return wrapperContained.runOneTask(); }
// public static boolean runOneTask() { return net.minecraft.server.MinecraftServer.runOneTask(); }
// public void dump(java.nio.file.Path path) { wrapperContained.dump(path); }
// public static void dump(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dump(path); }
// public void dumpGamerules(java.nio.file.Path path) { wrapperContained.dumpGamerules(path); }
// public static void dumpGamerules(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dumpGamerules(path); }
// public void dumpClasspath(java.nio.file.Path path) { wrapperContained.dumpClasspath(path); }
// public static void dumpClasspath(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dumpClasspath(path); }
// public void dumpStats(java.nio.file.Path path) { wrapperContained.dumpStats(path); }
// public static void dumpStats(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dumpStats(path); }
// public void dumpThreads(java.nio.file.Path path) { wrapperContained.dumpThreads(path); }
// public static void dumpThreads(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dumpThreads(path); }
public int getFunctionPermissionLevel() { return wrapperContained.getFunctionPermissionLevel(); }
// public static int getFunctionPermissionLevel() { return net.minecraft.server.MinecraftServer.getFunctionPermissionLevel(); }
public yarnwrap.command.DataCommandStorage getDataCommandStorage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.getDataCommandStorage()); }
// public static yarnwrap.command.DataCommandStorage getDataCommandStorage() { return new yarnwrap.command.DataCommandStorage(net.minecraft.server.MinecraftServer.getDataCommandStorage()); }
public yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(wrapperContained.getModStatus()); }
// public static yarnwrap.util.ModStatus getModStatus() { return new yarnwrap.util.ModStatus(net.minecraft.server.MinecraftServer.getModStatus()); }
public boolean isDebugRunning() { return wrapperContained.isDebugRunning(); }
// public static boolean isDebugRunning() { return net.minecraft.server.MinecraftServer.isDebugRunning(); }
public yarnwrap.util.profiler.ProfileResult stopDebug() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.stopDebug()); }
// public static yarnwrap.util.profiler.ProfileResult stopDebug() { return new yarnwrap.util.profiler.ProfileResult(net.minecraft.server.MinecraftServer.stopDebug()); }
public void endTickMetrics() { wrapperContained.endTickMetrics(); }
// public static void endTickMetrics() { net.minecraft.server.MinecraftServer.endTickMetrics(); }
public java.nio.file.Path getSavePath(yarnwrap.util.WorldSavePath worldSavePath) { return wrapperContained.getSavePath(worldSavePath.wrapperContained); }
// public static java.nio.file.Path getSavePath(yarnwrap.util.WorldSavePath worldSavePath, ) { return net.minecraft.server.MinecraftServer.getSavePath(worldSavePath.wrapperContained); }
public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites(); }
// public static boolean syncChunkWrites() { return net.minecraft.server.MinecraftServer.syncChunkWrites(); }
public yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.getStructureTemplateManager()); }
// public static yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(net.minecraft.server.MinecraftServer.getStructureTemplateManager()); }
public yarnwrap.world.SaveProperties getSaveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.getSaveProperties()); }
// public static yarnwrap.world.SaveProperties getSaveProperties() { return new yarnwrap.world.SaveProperties(net.minecraft.server.MinecraftServer.getSaveProperties()); }
// public void updateMobSpawnOptions() { wrapperContained.updateMobSpawnOptions(); }
// public static void updateMobSpawnOptions() { net.minecraft.server.MinecraftServer.updateMobSpawnOptions(); }
// public void updateDifficulty() { wrapperContained.updateDifficulty(); }
// public static void updateDifficulty() { net.minecraft.server.MinecraftServer.updateDifficulty(); }
// public void setupSpawn(yarnwrap.server.world.ServerWorld world,yarnwrap.world.level.ServerWorldProperties worldProperties,boolean bonusChest,boolean debugWorld) { wrapperContained.setupSpawn(world.wrapperContained,worldProperties.wrapperContained,bonusChest,debugWorld); }
// public static void setupSpawn(yarnwrap.server.world.ServerWorld world,yarnwrap.world.level.ServerWorldProperties worldProperties,boolean bonusChest,boolean debugWorld, ) { net.minecraft.server.MinecraftServer.setupSpawn(world.wrapperContained,worldProperties.wrapperContained,bonusChest,debugWorld); }
public boolean acceptsStatusQuery() { return wrapperContained.acceptsStatusQuery(); }
// public static boolean acceptsStatusQuery() { return net.minecraft.server.MinecraftServer.acceptsStatusQuery(); }
public int adjustTrackingDistance(int initialDistance) { return wrapperContained.adjustTrackingDistance(initialDistance); }
// public static int adjustTrackingDistance(int initialDistance, ) { return net.minecraft.server.MinecraftServer.adjustTrackingDistance(initialDistance); }
public java.util.Set getWorldRegistryKeys() { return wrapperContained.getWorldRegistryKeys(); }
// public static java.util.Set getWorldRegistryKeys() { return net.minecraft.server.MinecraftServer.getWorldRegistryKeys(); }
// public java.util.concurrent.CompletionStage method_29437(com.google.common.collect.ImmutableList resourcePacks) { return wrapperContained.method_29437(resourcePacks); }
// public static java.util.concurrent.CompletionStage method_29437(com.google.common.collect.ImmutableList resourcePacks, ) { return net.minecraft.server.MinecraftServer.method_29437(resourcePacks); }
public java.util.concurrent.CompletableFuture reloadResources(java.util.Collection dataPacks) { return wrapperContained.reloadResources(dataPacks); }
// public static java.util.concurrent.CompletableFuture reloadResources(java.util.Collection dataPacks, ) { return net.minecraft.server.MinecraftServer.reloadResources(dataPacks); }
// public void method_29440(java.util.Collection resourceManagerHolder) { wrapperContained.method_29440(resourceManagerHolder); }
// public static void method_29440(java.util.Collection resourceManagerHolder, ) { net.minecraft.server.MinecraftServer.method_29440(resourceManagerHolder); }
// public yarnwrap.resource.DataPackSettings createDataPackSettings(yarnwrap.resource.ResourcePackManager dataPackManager,boolean allowEnabling) { return new yarnwrap.resource.DataPackSettings(wrapperContained.createDataPackSettings(dataPackManager.wrapperContained,allowEnabling)); }
// public static yarnwrap.resource.DataPackSettings createDataPackSettings(yarnwrap.resource.ResourcePackManager dataPackManager,boolean allowEnabling, ) { return new yarnwrap.resource.DataPackSettings(net.minecraft.server.MinecraftServer.createDataPackSettings(dataPackManager.wrapperContained,allowEnabling)); }
// public yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.DataConfiguration dataConfiguration,boolean initMode,boolean safeMode) { return new yarnwrap.resource.DataConfiguration(wrapperContained.loadDataPacks(resourcePackManager.wrapperContained,dataConfiguration.wrapperContained,initMode,safeMode)); }
// public static yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.DataConfiguration dataConfiguration,boolean initMode,boolean safeMode, ) { return new yarnwrap.resource.DataConfiguration(net.minecraft.server.MinecraftServer.loadDataPacks(resourcePackManager.wrapperContained,dataConfiguration.wrapperContained,initMode,safeMode)); }
// public boolean method_29738(java.util.Collection name) { return wrapperContained.method_29738(name); }
// public static boolean method_29738(java.util.Collection name, ) { return net.minecraft.server.MinecraftServer.method_29738(name); }
// public yarnwrap.server.MinecraftServer startServer(java.util.function.Function serverFactory) { return new yarnwrap.server.MinecraftServer(wrapperContained.startServer(serverFactory)); }
// public static yarnwrap.server.MinecraftServer startServer(java.util.function.Function serverFactory, ) { return new yarnwrap.server.MinecraftServer(net.minecraft.server.MinecraftServer.startServer(serverFactory)); }
// public void runServer() { wrapperContained.runServer(); }
// public static void runServer() { net.minecraft.server.MinecraftServer.runServer(); }
public yarnwrap.server.world.ServerWorld getOverworld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getOverworld()); }
// public static yarnwrap.server.world.ServerWorld getOverworld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.MinecraftServer.getOverworld()); }
public Object getRegistryManager() { return wrapperContained.getRegistryManager(); }
// public static Object getRegistryManager() { return net.minecraft.server.MinecraftServer.getRegistryManager(); }
public int getRateLimit() { return wrapperContained.getRateLimit(); }
// public static int getRateLimit() { return net.minecraft.server.MinecraftServer.getRateLimit(); }
public yarnwrap.server.filter.TextStream createFilterer(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.server.filter.TextStream(wrapperContained.createFilterer(player.wrapperContained)); }
// public static yarnwrap.server.filter.TextStream createFilterer(yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.server.filter.TextStream(net.minecraft.server.MinecraftServer.createFilterer(player.wrapperContained)); }
// public void generateKeyPair() { wrapperContained.generateKeyPair(); }
// public static void generateKeyPair() { net.minecraft.server.MinecraftServer.generateKeyPair(); }
public boolean requireResourcePack() { return wrapperContained.requireResourcePack(); }
// public static boolean requireResourcePack() { return net.minecraft.server.MinecraftServer.requireResourcePack(); }
public yarnwrap.server.network.ServerPlayerInteractionManager getPlayerInteractionManager(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.server.network.ServerPlayerInteractionManager(wrapperContained.getPlayerInteractionManager(player.wrapperContained)); }
// public static yarnwrap.server.network.ServerPlayerInteractionManager getPlayerInteractionManager(yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.server.network.ServerPlayerInteractionManager(net.minecraft.server.MinecraftServer.getPlayerInteractionManager(player.wrapperContained)); }
public yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.getResourceManager()); }
// public static yarnwrap.resource.ResourceManager getResourceManager() { return new yarnwrap.resource.ResourceManager(net.minecraft.server.MinecraftServer.getResourceManager()); }
public java.net.Proxy getProxy() { return wrapperContained.getProxy(); }
// public static java.net.Proxy getProxy() { return net.minecraft.server.MinecraftServer.getProxy(); }
// public void dumpProperties(java.nio.file.Path file) { wrapperContained.dumpProperties(file); }
// public static void dumpProperties(java.nio.file.Path file, ) { net.minecraft.server.MinecraftServer.dumpProperties(file); }
// public void method_37318(yarnwrap.util.profiler.ProfileResult profileResult) { wrapperContained.method_37318(profileResult.wrapperContained); }
// public static void method_37318(yarnwrap.util.profiler.ProfileResult profileResult, ) { net.minecraft.server.MinecraftServer.method_37318(profileResult.wrapperContained); }
// public void method_37319(java.util.function.Consumer result) { wrapperContained.method_37319(result); }
// public static void method_37319(java.util.function.Consumer result, ) { net.minecraft.server.MinecraftServer.method_37319(result); }
public void setupRecorder(java.util.function.Consumer resultConsumer,java.util.function.Consumer dumpConsumer) { wrapperContained.setupRecorder(resultConsumer,dumpConsumer); }
// public static void setupRecorder(java.util.function.Consumer resultConsumer,java.util.function.Consumer dumpConsumer, ) { net.minecraft.server.MinecraftServer.setupRecorder(resultConsumer,dumpConsumer); }
public boolean isRecorderActive() { return wrapperContained.isRecorderActive(); }
// public static boolean isRecorderActive() { return net.minecraft.server.MinecraftServer.isRecorderActive(); }
public void resetRecorder() { wrapperContained.resetRecorder(); }
// public static void resetRecorder() { net.minecraft.server.MinecraftServer.resetRecorder(); }
public void stopRecorder() { wrapperContained.stopRecorder(); }
// public static void stopRecorder() { net.minecraft.server.MinecraftServer.stopRecorder(); }
public yarnwrap.util.SystemDetails addSystemDetails(yarnwrap.util.SystemDetails details) { return new yarnwrap.util.SystemDetails(wrapperContained.addSystemDetails(details.wrapperContained)); }
// public static yarnwrap.util.SystemDetails addSystemDetails(yarnwrap.util.SystemDetails details, ) { return new yarnwrap.util.SystemDetails(net.minecraft.server.MinecraftServer.addSystemDetails(details.wrapperContained)); }
// public void method_37329(java.nio.file.Path path) { wrapperContained.method_37329(path); }
// public static void method_37329(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.method_37329(path); }
// public java.lang.String method_38580(Object module) { return wrapperContained.method_38580(module); }
// public static java.lang.String method_38580(Object module, ) { return net.minecraft.server.MinecraftServer.method_38580(module); }
// public void dumpNativeModules(java.nio.file.Path path) { wrapperContained.dumpNativeModules(path); }
// public static void dumpNativeModules(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.dumpNativeModules(path); }
public boolean saveAll(boolean suppressLogs,boolean flush,boolean force) { return wrapperContained.saveAll(suppressLogs,flush,force); }
// public static boolean saveAll(boolean suppressLogs,boolean flush,boolean force, ) { return net.minecraft.server.MinecraftServer.saveAll(suppressLogs,flush,force); }
public boolean isSaving() { return wrapperContained.isSaving(); }
// public static boolean isSaving() { return net.minecraft.server.MinecraftServer.isSaving(); }
public boolean hideOnlinePlayers() { return wrapperContained.hideOnlinePlayers(); }
// public static boolean hideOnlinePlayers() { return net.minecraft.server.MinecraftServer.hideOnlinePlayers(); }
// public boolean method_40056(yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_40056(world.wrapperContained); }
// public static boolean method_40056(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.server.MinecraftServer.method_40056(world.wrapperContained); }
// public Object method_40374(yarnwrap.resource.LifecycledResourceManager dataPackContents) { return wrapperContained.method_40374(dataPackContents.wrapperContained); }
// public static Object method_40374(yarnwrap.resource.LifecycledResourceManager dataPackContents, ) { return net.minecraft.server.MinecraftServer.method_40374(dataPackContents.wrapperContained); }
// public void method_40375(yarnwrap.resource.LifecycledResourceManager dataPackContents,yarnwrap.server.DataPackContents throwable) { wrapperContained.method_40375(dataPackContents.wrapperContained,throwable.wrapperContained); }
// public static void method_40375(yarnwrap.resource.LifecycledResourceManager dataPackContents,yarnwrap.server.DataPackContents throwable, ) { net.minecraft.server.MinecraftServer.method_40375(dataPackContents.wrapperContained,throwable.wrapperContained); }
// public yarnwrap.util.crash.CrashReport createCrashReport(java.lang.Throwable throwable) { return new yarnwrap.util.crash.CrashReport(wrapperContained.createCrashReport(throwable)); }
// public static yarnwrap.util.crash.CrashReport createCrashReport(java.lang.Throwable throwable, ) { return new yarnwrap.util.crash.CrashReport(net.minecraft.server.MinecraftServer.createCrashReport(throwable)); }
public int getMaxChainedNeighborUpdates() { return wrapperContained.getMaxChainedNeighborUpdates(); }
// public static int getMaxChainedNeighborUpdates() { return net.minecraft.server.MinecraftServer.getMaxChainedNeighborUpdates(); }
public void forceStopRecorder() { wrapperContained.forceStopRecorder(); }
// public static void forceStopRecorder() { net.minecraft.server.MinecraftServer.forceStopRecorder(); }
public boolean shouldEnforceSecureProfile() { return wrapperContained.shouldEnforceSecureProfile(); }
// public static boolean shouldEnforceSecureProfile() { return net.minecraft.server.MinecraftServer.shouldEnforceSecureProfile(); }
// public void logChatMessage(yarnwrap.text.Text message,Object params,java.lang.String prefix) { wrapperContained.logChatMessage(message.wrapperContained,params,prefix); }
// public static void logChatMessage(yarnwrap.text.Text message,Object params,java.lang.String prefix, ) { net.minecraft.server.MinecraftServer.logChatMessage(message.wrapperContained,params,prefix); }
public java.util.Optional getResourcePackProperties() { return wrapperContained.getResourcePackProperties(); }
// public static java.util.Optional getResourcePackProperties() { return net.minecraft.server.MinecraftServer.getResourcePackProperties(); }
public com.mojang.authlib.GameProfile getHostProfile() { return wrapperContained.getHostProfile(); }
// public static com.mojang.authlib.GameProfile getHostProfile() { return net.minecraft.server.MinecraftServer.getHostProfile(); }
public void setHostProfile(com.mojang.authlib.GameProfile hostProfile) { wrapperContained.setHostProfile(hostProfile); }
// public static void setHostProfile(com.mojang.authlib.GameProfile hostProfile, ) { net.minecraft.server.MinecraftServer.setHostProfile(hostProfile); }
public yarnwrap.network.message.MessageDecorator getMessageDecorator() { return new yarnwrap.network.message.MessageDecorator(wrapperContained.getMessageDecorator()); }
// public static yarnwrap.network.message.MessageDecorator getMessageDecorator() { return new yarnwrap.network.message.MessageDecorator(net.minecraft.server.MinecraftServer.getMessageDecorator()); }
public yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.getServicesSignatureVerifier()); }
// public static yarnwrap.network.encryption.SignatureVerifier getServicesSignatureVerifier() { return new yarnwrap.network.encryption.SignatureVerifier(net.minecraft.server.MinecraftServer.getServicesSignatureVerifier()); }
public yarnwrap.registry.CombinedDynamicRegistries getCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.getCombinedDynamicRegistries()); }
// public static yarnwrap.registry.CombinedDynamicRegistries getCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.server.MinecraftServer.getCombinedDynamicRegistries()); }
// public void method_46841(yarnwrap.server.world.ServerWorld feature) { wrapperContained.method_46841(feature.wrapperContained); }
// public static void method_46841(yarnwrap.server.world.ServerWorld feature, ) { net.minecraft.server.MinecraftServer.method_46841(feature.wrapperContained); }
// public java.util.Optional method_46842(yarnwrap.registry.Registry featureRegistry) { return wrapperContained.method_46842(featureRegistry.wrapperContained); }
// public static java.util.Optional method_46842(yarnwrap.registry.Registry featureRegistry, ) { return net.minecraft.server.MinecraftServer.method_46842(featureRegistry.wrapperContained); }
// public java.util.Optional loadFavicon() { return wrapperContained.loadFavicon(); }
// public static java.util.Optional loadFavicon() { return net.minecraft.server.MinecraftServer.loadFavicon(); }
// public yarnwrap.server.ServerMetadata createMetadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.createMetadata()); }
// public static yarnwrap.server.ServerMetadata createMetadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.server.MinecraftServer.createMetadata()); }
// public Object createMetadataPlayers() { return wrapperContained.createMetadataPlayers(); }
// public static Object createMetadataPlayers() { return net.minecraft.server.MinecraftServer.createMetadataPlayers(); }
// public java.util.Optional method_49387(java.nio.file.Path path) { return wrapperContained.method_49387(path); }
// public static java.util.Optional method_49387(java.nio.file.Path path, ) { return net.minecraft.server.MinecraftServer.method_49387(path); }
// public boolean method_49388(java.nio.file.Path path) { return wrapperContained.method_49388(path); }
// public static boolean method_49388(java.nio.file.Path path, ) { return net.minecraft.server.MinecraftServer.method_49388(path); }
// public boolean method_49389(java.nio.file.Path path) { return wrapperContained.method_49389(path); }
// public static boolean method_49389(java.nio.file.Path path, ) { return net.minecraft.server.MinecraftServer.method_49389(path); }
public void sendTimeUpdatePackets() { wrapperContained.sendTimeUpdatePackets(); }
// public static void sendTimeUpdatePackets() { net.minecraft.server.MinecraftServer.sendTimeUpdatePackets(); }
// public void sendTimeUpdatePackets(yarnwrap.server.world.ServerWorld world) { wrapperContained.sendTimeUpdatePackets(world.wrapperContained); }
// public static void sendTimeUpdatePackets(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.MinecraftServer.sendTimeUpdatePackets(world.wrapperContained); }
public boolean shouldLogIps() { return wrapperContained.shouldLogIps(); }
// public static boolean shouldLogIps() { return net.minecraft.server.MinecraftServer.shouldLogIps(); }
// public void method_53501(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.method_53501(player.wrapperContained); }
// public static void method_53501(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.MinecraftServer.method_53501(player.wrapperContained); }
public boolean isPaused() { return wrapperContained.isPaused(); }
// public static boolean isPaused() { return net.minecraft.server.MinecraftServer.isPaused(); }
public void updateAutosaveTicks() { wrapperContained.updateAutosaveTicks(); }
// public static void updateAutosaveTicks() { net.minecraft.server.MinecraftServer.updateAutosaveTicks(); }
public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
// public static float getAverageTickTime() { return net.minecraft.server.MinecraftServer.getAverageTickTime(); }
public yarnwrap.server.ServerTickManager getTickManager() { return new yarnwrap.server.ServerTickManager(wrapperContained.getTickManager()); }
// public static yarnwrap.server.ServerTickManager getTickManager() { return new yarnwrap.server.ServerTickManager(net.minecraft.server.MinecraftServer.getTickManager()); }
public long getAverageNanosPerTick() { return wrapperContained.getAverageNanosPerTick(); }
// public static long getAverageNanosPerTick() { return net.minecraft.server.MinecraftServer.getAverageNanosPerTick(); }
public long[] getTickTimes() { return wrapperContained.getTickTimes(); }
// public static long[] getTickTimes() { return net.minecraft.server.MinecraftServer.getTickTimes(); }
// public int getAutosaveInterval() { return wrapperContained.getAutosaveInterval(); }
// public static int getAutosaveInterval() { return net.minecraft.server.MinecraftServer.getAutosaveInterval(); }
public boolean acceptsTransfers() { return wrapperContained.acceptsTransfers(); }
// public static boolean acceptsTransfers() { return net.minecraft.server.MinecraftServer.acceptsTransfers(); }
// public yarnwrap.util.profiler.log.DebugSampleLog getDebugSampleLog() { return new yarnwrap.util.profiler.log.DebugSampleLog(wrapperContained.getDebugSampleLog()); }
// public static yarnwrap.util.profiler.log.DebugSampleLog getDebugSampleLog() { return new yarnwrap.util.profiler.log.DebugSampleLog(net.minecraft.server.MinecraftServer.getDebugSampleLog()); }
// public void pushTickLog(long tickStartTime) { wrapperContained.pushTickLog(tickStartTime); }
// public static void pushTickLog(long tickStartTime, ) { net.minecraft.server.MinecraftServer.pushTickLog(tickStartTime); }
// public void pushFullTickLog() { wrapperContained.pushFullTickLog(); }
// public static void pushFullTickLog() { net.minecraft.server.MinecraftServer.pushFullTickLog(); }
// public void startTaskPerformanceLog() { wrapperContained.startTaskPerformanceLog(); }
// public static void startTaskPerformanceLog() { net.minecraft.server.MinecraftServer.startTaskPerformanceLog(); }
// public void pushPerformanceLogs() { wrapperContained.pushPerformanceLogs(); }
// public static void pushPerformanceLogs() { net.minecraft.server.MinecraftServer.pushPerformanceLogs(); }
public void subscribeToDebugSample(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.subscribeToDebugSample(player.wrapperContained,type.wrapperContained); }
// public static void subscribeToDebugSample(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type, ) { net.minecraft.server.MinecraftServer.subscribeToDebugSample(player.wrapperContained,type.wrapperContained); }
public boolean shouldPushTickTimeLog() { return wrapperContained.shouldPushTickTimeLog(); }
// public static boolean shouldPushTickTimeLog() { return net.minecraft.server.MinecraftServer.shouldPushTickTimeLog(); }
public Object getReloadableRegistries() { return wrapperContained.getReloadableRegistries(); }
// public static Object getReloadableRegistries() { return net.minecraft.server.MinecraftServer.getReloadableRegistries(); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
// public static yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.server.MinecraftServer.getBrewingRecipeRegistry()); }
// public void forceEnableRequestedFeatures(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { wrapperContained.forceEnableRequestedFeatures(resourcePackManager.wrapperContained,enabledFeatures.wrapperContained); }
// public static void forceEnableRequestedFeatures(yarnwrap.resource.ResourcePackManager resourcePackManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { net.minecraft.server.MinecraftServer.forceEnableRequestedFeatures(resourcePackManager.wrapperContained,enabledFeatures.wrapperContained); }
// public yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Collection enabledProfiles,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean allowEnabling) { return new yarnwrap.resource.DataConfiguration(wrapperContained.loadDataPacks(resourcePackManager.wrapperContained,enabledProfiles,enabledFeatures.wrapperContained,allowEnabling)); }
// public static yarnwrap.resource.DataConfiguration loadDataPacks(yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Collection enabledProfiles,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean allowEnabling, ) { return new yarnwrap.resource.DataConfiguration(net.minecraft.server.MinecraftServer.loadDataPacks(resourcePackManager.wrapperContained,enabledProfiles,enabledFeatures.wrapperContained,allowEnabling)); }
// public void setWorldGenException(java.lang.RuntimeException exception) { wrapperContained.setWorldGenException(exception); }
// public static void setWorldGenException(java.lang.RuntimeException exception, ) { net.minecraft.server.MinecraftServer.setWorldGenException(exception); }
// public boolean checkWorldGenException() { return wrapperContained.checkWorldGenException(); }
public static boolean checkWorldGenException() { return net.minecraft.server.MinecraftServer.checkWorldGenException(); }
public boolean isWorldAllowed(yarnwrap.world.World world) { return wrapperContained.isWorldAllowed(world.wrapperContained); }
// public static boolean isWorldAllowed(yarnwrap.world.World world, ) { return net.minecraft.server.MinecraftServer.isWorldAllowed(world.wrapperContained); }
public yarnwrap.server.ServerLinks getServerLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.getServerLinks()); }
// public static yarnwrap.server.ServerLinks getServerLinks() { return new yarnwrap.server.ServerLinks(net.minecraft.server.MinecraftServer.getServerLinks()); }
// public void writeChunkIoReport(yarnwrap.util.crash.CrashReport report,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.storage.StorageKey key) { wrapperContained.writeChunkIoReport(report.wrapperContained,pos.wrapperContained,key.wrapperContained); }
// public static void writeChunkIoReport(yarnwrap.util.crash.CrashReport report,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.storage.StorageKey key, ) { net.minecraft.server.MinecraftServer.writeChunkIoReport(report.wrapperContained,pos.wrapperContained,key.wrapperContained); }
public void tickNetworkIo() { wrapperContained.tickNetworkIo(); }
// public static void tickNetworkIo() { net.minecraft.server.MinecraftServer.tickNetworkIo(); }
// public int getPauseWhenEmptySeconds() { return wrapperContained.getPauseWhenEmptySeconds(); }
// public static int getPauseWhenEmptySeconds() { return net.minecraft.server.MinecraftServer.getPauseWhenEmptySeconds(); }
public void onPacketException(java.lang.Throwable exception,yarnwrap.network.packet.PacketType type) { wrapperContained.onPacketException(exception,type.wrapperContained); }
// public static void onPacketException(java.lang.Throwable exception,yarnwrap.network.packet.PacketType type, ) { net.minecraft.server.MinecraftServer.onPacketException(exception,type.wrapperContained); }
// public void runAutosave() { wrapperContained.runAutosave(); }
// public static void runAutosave() { net.minecraft.server.MinecraftServer.runAutosave(); }
public yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(wrapperContained.getFuelRegistry()); }
// public static yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(net.minecraft.server.MinecraftServer.getFuelRegistry()); }
// public void method_64261(java.nio.file.Path path) { wrapperContained.method_64261(path); }
// public static void method_64261(java.nio.file.Path path, ) { net.minecraft.server.MinecraftServer.method_64261(path); }
// public void handleCustomClickAction(yarnwrap.util.Identifier id,java.util.Optional payload) { wrapperContained.handleCustomClickAction(id.wrapperContained,payload); }
// public static void handleCustomClickAction(yarnwrap.util.Identifier id,java.util.Optional payload, ) { net.minecraft.server.MinecraftServer.handleCustomClickAction(id.wrapperContained,payload); }

}