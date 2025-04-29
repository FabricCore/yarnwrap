package yarnwrap.server.dedicated;
public class ServerPropertiesHandler { public net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained; public ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean broadcastConsoleToOps() { return wrapperContained.broadcastConsoleToOps; }
// public void broadcastConsoleToOps(boolean value) { wrapperContained.broadcastConsoleToOps = value; }
// public static boolean broadcastConsoleToOps() { return net.minecraft.server.dedicated.ServerPropertiesHandler.broadcastConsoleToOps; }
// public static void broadcastConsoleToOps(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.broadcastConsoleToOps = value; }

public Object whiteList() { return wrapperContained.whiteList; }
// // public void whiteList(Object value) { wrapperContained.whiteList = value; }
// // public static Object whiteList() { return net.minecraft.server.dedicated.ServerPropertiesHandler.whiteList; }
// // public static void whiteList(Object value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.whiteList = value; }

public boolean enforceWhitelist() { return wrapperContained.enforceWhitelist; }
// public void enforceWhitelist(boolean value) { wrapperContained.enforceWhitelist = value; }
// public static boolean enforceWhitelist() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enforceWhitelist; }
// public static void enforceWhitelist(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enforceWhitelist = value; }

public boolean enableCommandBlock() { return wrapperContained.enableCommandBlock; }
// public void enableCommandBlock(boolean value) { wrapperContained.enableCommandBlock = value; }
// public static boolean enableCommandBlock() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enableCommandBlock; }
// public static void enableCommandBlock(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enableCommandBlock = value; }

public boolean allowFlight() { return wrapperContained.allowFlight; }
// public void allowFlight(boolean value) { wrapperContained.allowFlight = value; }
// public static boolean allowFlight() { return net.minecraft.server.dedicated.ServerPropertiesHandler.allowFlight; }
// public static void allowFlight(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.allowFlight = value; }

public boolean spawnNpcs() { return wrapperContained.spawnNpcs; }
// public void spawnNpcs(boolean value) { wrapperContained.spawnNpcs = value; }
// public static boolean spawnNpcs() { return net.minecraft.server.dedicated.ServerPropertiesHandler.spawnNpcs; }
// public static void spawnNpcs(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.spawnNpcs = value; }

public boolean allowNether() { return wrapperContained.allowNether; }
// public void allowNether(boolean value) { wrapperContained.allowNether = value; }
// public static boolean allowNether() { return net.minecraft.server.dedicated.ServerPropertiesHandler.allowNether; }
// public static void allowNether(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.allowNether = value; }

public int maxWorldSize() { return wrapperContained.maxWorldSize; }
// public void maxWorldSize(int value) { wrapperContained.maxWorldSize = value; }
// public static int maxWorldSize() { return net.minecraft.server.dedicated.ServerPropertiesHandler.maxWorldSize; }
// public static void maxWorldSize(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.maxWorldSize = value; }

public boolean onlineMode() { return wrapperContained.onlineMode; }
// public void onlineMode(boolean value) { wrapperContained.onlineMode = value; }
// public static boolean onlineMode() { return net.minecraft.server.dedicated.ServerPropertiesHandler.onlineMode; }
// public static void onlineMode(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.onlineMode = value; }

public int maxPlayers() { return wrapperContained.maxPlayers; }
// public void maxPlayers(int value) { wrapperContained.maxPlayers = value; }
// public static int maxPlayers() { return net.minecraft.server.dedicated.ServerPropertiesHandler.maxPlayers; }
// public static void maxPlayers(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.maxPlayers = value; }

public long maxTickTime() { return wrapperContained.maxTickTime; }
// public void maxTickTime(long value) { wrapperContained.maxTickTime = value; }
// public static long maxTickTime() { return net.minecraft.server.dedicated.ServerPropertiesHandler.maxTickTime; }
// public static void maxTickTime(long value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.maxTickTime = value; }

public int spawnProtection() { return wrapperContained.spawnProtection; }
// public void spawnProtection(int value) { wrapperContained.spawnProtection = value; }
// public static int spawnProtection() { return net.minecraft.server.dedicated.ServerPropertiesHandler.spawnProtection; }
// public static void spawnProtection(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.spawnProtection = value; }

public Object playerIdleTimeout() { return wrapperContained.playerIdleTimeout; }
// // public void playerIdleTimeout(Object value) { wrapperContained.playerIdleTimeout = value; }
// // public static Object playerIdleTimeout() { return net.minecraft.server.dedicated.ServerPropertiesHandler.playerIdleTimeout; }
// // public static void playerIdleTimeout(Object value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.playerIdleTimeout = value; }

public boolean enableRcon() { return wrapperContained.enableRcon; }
// public void enableRcon(boolean value) { wrapperContained.enableRcon = value; }
// public static boolean enableRcon() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enableRcon; }
// public static void enableRcon(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enableRcon = value; }

public boolean enableQuery() { return wrapperContained.enableQuery; }
// public void enableQuery(boolean value) { wrapperContained.enableQuery = value; }
// public static boolean enableQuery() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enableQuery; }
// public static void enableQuery(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enableQuery = value; }

public java.lang.String levelName() { return wrapperContained.levelName; }
// public void levelName(java.lang.String value) { wrapperContained.levelName = value; }
// public static java.lang.String levelName() { return net.minecraft.server.dedicated.ServerPropertiesHandler.levelName; }
// public static void levelName(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.levelName = value; }

public java.lang.String rconPassword() { return wrapperContained.rconPassword; }
// public void rconPassword(java.lang.String value) { wrapperContained.rconPassword = value; }
// public static java.lang.String rconPassword() { return net.minecraft.server.dedicated.ServerPropertiesHandler.rconPassword; }
// public static void rconPassword(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.rconPassword = value; }

public boolean broadcastRconToOps() { return wrapperContained.broadcastRconToOps; }
// public void broadcastRconToOps(boolean value) { wrapperContained.broadcastRconToOps = value; }
// public static boolean broadcastRconToOps() { return net.minecraft.server.dedicated.ServerPropertiesHandler.broadcastRconToOps; }
// public static void broadcastRconToOps(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.broadcastRconToOps = value; }

public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public static java.lang.String motd() { return net.minecraft.server.dedicated.ServerPropertiesHandler.motd; }
// public static void motd(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.motd = value; }

public boolean forceGameMode() { return wrapperContained.forceGameMode; }
// public void forceGameMode(boolean value) { wrapperContained.forceGameMode = value; }
// public static boolean forceGameMode() { return net.minecraft.server.dedicated.ServerPropertiesHandler.forceGameMode; }
// public static void forceGameMode(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.forceGameMode = value; }

public int rconPort() { return wrapperContained.rconPort; }
// public void rconPort(int value) { wrapperContained.rconPort = value; }
// public static int rconPort() { return net.minecraft.server.dedicated.ServerPropertiesHandler.rconPort; }
// public static void rconPort(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.rconPort = value; }

public java.lang.String serverIp() { return wrapperContained.serverIp; }
// public void serverIp(java.lang.String value) { wrapperContained.serverIp = value; }
// public static java.lang.String serverIp() { return net.minecraft.server.dedicated.ServerPropertiesHandler.serverIp; }
// public static void serverIp(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.serverIp = value; }

public java.lang.Boolean announcePlayerAchievements() { return wrapperContained.announcePlayerAchievements; }
// public void announcePlayerAchievements(java.lang.Boolean value) { wrapperContained.announcePlayerAchievements = value; }
// public static java.lang.Boolean announcePlayerAchievements() { return net.minecraft.server.dedicated.ServerPropertiesHandler.announcePlayerAchievements; }
// public static void announcePlayerAchievements(java.lang.Boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.announcePlayerAchievements = value; }

public int queryPort() { return wrapperContained.queryPort; }
// public void queryPort(int value) { wrapperContained.queryPort = value; }
// public static int queryPort() { return net.minecraft.server.dedicated.ServerPropertiesHandler.queryPort; }
// public static void queryPort(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.queryPort = value; }

public boolean useNativeTransport() { return wrapperContained.useNativeTransport; }
// public void useNativeTransport(boolean value) { wrapperContained.useNativeTransport = value; }
// public static boolean useNativeTransport() { return net.minecraft.server.dedicated.ServerPropertiesHandler.useNativeTransport; }
// public static void useNativeTransport(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.useNativeTransport = value; }

public boolean pvp() { return wrapperContained.pvp; }
// public void pvp(boolean value) { wrapperContained.pvp = value; }
// public static boolean pvp() { return net.minecraft.server.dedicated.ServerPropertiesHandler.pvp; }
// public static void pvp(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.pvp = value; }

public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public void spawnMonsters(boolean value) { wrapperContained.spawnMonsters = value; }
// public static boolean spawnMonsters() { return net.minecraft.server.dedicated.ServerPropertiesHandler.spawnMonsters; }
// public static void spawnMonsters(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.spawnMonsters = value; }

public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
// public void spawnAnimals(boolean value) { wrapperContained.spawnAnimals = value; }
// public static boolean spawnAnimals() { return net.minecraft.server.dedicated.ServerPropertiesHandler.spawnAnimals; }
// public static void spawnAnimals(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.spawnAnimals = value; }

public int serverPort() { return wrapperContained.serverPort; }
// public void serverPort(int value) { wrapperContained.serverPort = value; }
// public static int serverPort() { return net.minecraft.server.dedicated.ServerPropertiesHandler.serverPort; }
// public static void serverPort(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.serverPort = value; }

public boolean hardcore() { return wrapperContained.hardcore; }
// public void hardcore(boolean value) { wrapperContained.hardcore = value; }
// public static boolean hardcore() { return net.minecraft.server.dedicated.ServerPropertiesHandler.hardcore; }
// public static void hardcore(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.hardcore = value; }

public boolean preventProxyConnections() { return wrapperContained.preventProxyConnections; }
// public void preventProxyConnections(boolean value) { wrapperContained.preventProxyConnections = value; }
// public static boolean preventProxyConnections() { return net.minecraft.server.dedicated.ServerPropertiesHandler.preventProxyConnections; }
// public static void preventProxyConnections(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.preventProxyConnections = value; }

public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public static yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(net.minecraft.server.dedicated.ServerPropertiesHandler.difficulty); }
// public static void difficulty(yarnwrap.world.Difficulty value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.difficulty = value.wrapperContained; }

public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.dedicated.ServerPropertiesHandler.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.gameMode = value.wrapperContained; }

public int networkCompressionThreshold() { return wrapperContained.networkCompressionThreshold; }
// public void networkCompressionThreshold(int value) { wrapperContained.networkCompressionThreshold = value; }
// public static int networkCompressionThreshold() { return net.minecraft.server.dedicated.ServerPropertiesHandler.networkCompressionThreshold; }
// public static void networkCompressionThreshold(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.networkCompressionThreshold = value; }

public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.server.dedicated.ServerPropertiesHandler.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.viewDistance = value; }

public int opPermissionLevel() { return wrapperContained.opPermissionLevel; }
// public void opPermissionLevel(int value) { wrapperContained.opPermissionLevel = value; }
// public static int opPermissionLevel() { return net.minecraft.server.dedicated.ServerPropertiesHandler.opPermissionLevel; }
// public static void opPermissionLevel(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.opPermissionLevel = value; }

public int functionPermissionLevel() { return wrapperContained.functionPermissionLevel; }
// public void functionPermissionLevel(int value) { wrapperContained.functionPermissionLevel = value; }
// public static int functionPermissionLevel() { return net.minecraft.server.dedicated.ServerPropertiesHandler.functionPermissionLevel; }
// public static void functionPermissionLevel(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.functionPermissionLevel = value; }

public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites; }
// public void syncChunkWrites(boolean value) { wrapperContained.syncChunkWrites = value; }
// public static boolean syncChunkWrites() { return net.minecraft.server.dedicated.ServerPropertiesHandler.syncChunkWrites; }
// public static void syncChunkWrites(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.syncChunkWrites = value; }

public boolean enableJmxMonitoring() { return wrapperContained.enableJmxMonitoring; }
// public void enableJmxMonitoring(boolean value) { wrapperContained.enableJmxMonitoring = value; }
// public static boolean enableJmxMonitoring() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enableJmxMonitoring; }
// public static void enableJmxMonitoring(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enableJmxMonitoring = value; }

public boolean enableStatus() { return wrapperContained.enableStatus; }
// public void enableStatus(boolean value) { wrapperContained.enableStatus = value; }
// public static boolean enableStatus() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enableStatus; }
// public static void enableStatus(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enableStatus = value; }

public int entityBroadcastRangePercentage() { return wrapperContained.entityBroadcastRangePercentage; }
// public void entityBroadcastRangePercentage(int value) { wrapperContained.entityBroadcastRangePercentage = value; }
// public static int entityBroadcastRangePercentage() { return net.minecraft.server.dedicated.ServerPropertiesHandler.entityBroadcastRangePercentage; }
// public static void entityBroadcastRangePercentage(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.entityBroadcastRangePercentage = value; }

public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
// public static yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.server.dedicated.ServerPropertiesHandler.generatorOptions); }
// public static void generatorOptions(yarnwrap.world.gen.GeneratorOptions value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.generatorOptions = value.wrapperContained; }

public int rateLimit() { return wrapperContained.rateLimit; }
// public void rateLimit(int value) { wrapperContained.rateLimit = value; }
// public static int rateLimit() { return net.minecraft.server.dedicated.ServerPropertiesHandler.rateLimit; }
// public static void rateLimit(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.rateLimit = value; }

public java.lang.String textFilteringConfig() { return wrapperContained.textFilteringConfig; }
// public void textFilteringConfig(java.lang.String value) { wrapperContained.textFilteringConfig = value; }
// public static java.lang.String textFilteringConfig() { return net.minecraft.server.dedicated.ServerPropertiesHandler.textFilteringConfig; }
// public static void textFilteringConfig(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.textFilteringConfig = value; }

public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.server.dedicated.ServerPropertiesHandler.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.simulationDistance = value; }

public boolean hideOnlinePlayers() { return wrapperContained.hideOnlinePlayers; }
// public void hideOnlinePlayers(boolean value) { wrapperContained.hideOnlinePlayers = value; }
// public static boolean hideOnlinePlayers() { return net.minecraft.server.dedicated.ServerPropertiesHandler.hideOnlinePlayers; }
// public static void hideOnlinePlayers(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.hideOnlinePlayers = value; }

public int maxChainedNeighborUpdates() { return wrapperContained.maxChainedNeighborUpdates; }
// public void maxChainedNeighborUpdates(int value) { wrapperContained.maxChainedNeighborUpdates = value; }
// public static int maxChainedNeighborUpdates() { return net.minecraft.server.dedicated.ServerPropertiesHandler.maxChainedNeighborUpdates; }
// public static void maxChainedNeighborUpdates(int value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.maxChainedNeighborUpdates = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.ServerPropertiesHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.LOGGER = value; }

public boolean enforceSecureProfile() { return wrapperContained.enforceSecureProfile; }
// public void enforceSecureProfile(boolean value) { wrapperContained.enforceSecureProfile = value; }
// public static boolean enforceSecureProfile() { return net.minecraft.server.dedicated.ServerPropertiesHandler.enforceSecureProfile; }
// public static void enforceSecureProfile(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.enforceSecureProfile = value; }

public java.util.Optional serverResourcePackProperties() { return wrapperContained.serverResourcePackProperties; }
// public void serverResourcePackProperties(java.util.Optional value) { wrapperContained.serverResourcePackProperties = value; }
// public static java.util.Optional serverResourcePackProperties() { return net.minecraft.server.dedicated.ServerPropertiesHandler.serverResourcePackProperties; }
// public static void serverResourcePackProperties(java.util.Optional value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.serverResourcePackProperties = value; }

// public java.util.regex.Pattern SHA1_PATTERN() { return wrapperContained.SHA1_PATTERN; }
// public void SHA1_PATTERN(java.util.regex.Pattern value) { wrapperContained.SHA1_PATTERN = value; }
// public static java.util.regex.Pattern SHA1_PATTERN() { return net.minecraft.server.dedicated.ServerPropertiesHandler.SHA1_PATTERN; }
// public static void SHA1_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.SHA1_PATTERN = value; }

public yarnwrap.resource.DataPackSettings dataPackSettings() { return new yarnwrap.resource.DataPackSettings(wrapperContained.dataPackSettings); }
// public void dataPackSettings(yarnwrap.resource.DataPackSettings value) { wrapperContained.dataPackSettings = value.wrapperContained; }
// public static yarnwrap.resource.DataPackSettings dataPackSettings() { return new yarnwrap.resource.DataPackSettings(net.minecraft.server.dedicated.ServerPropertiesHandler.dataPackSettings); }
// public static void dataPackSettings(yarnwrap.resource.DataPackSettings value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.dataPackSettings = value.wrapperContained; }

// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public static com.google.common.base.Splitter COMMA_SPLITTER() { return net.minecraft.server.dedicated.ServerPropertiesHandler.COMMA_SPLITTER; }
// public static void COMMA_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.COMMA_SPLITTER = value; }

// public Object worldGenProperties() { return wrapperContained.worldGenProperties; }
// // public void worldGenProperties(Object value) { wrapperContained.worldGenProperties = value; }
// // public static Object worldGenProperties() { return net.minecraft.server.dedicated.ServerPropertiesHandler.worldGenProperties; }
// // public static void worldGenProperties(Object value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.worldGenProperties = value; }

public boolean logIps() { return wrapperContained.logIps; }
// public void logIps(boolean value) { wrapperContained.logIps = value; }
// public static boolean logIps() { return net.minecraft.server.dedicated.ServerPropertiesHandler.logIps; }
// public static void logIps(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.logIps = value; }

public boolean acceptsTransfers() { return wrapperContained.acceptsTransfers; }
public void acceptsTransfers(boolean value) { wrapperContained.acceptsTransfers = value; }
// public static boolean acceptsTransfers() { return net.minecraft.server.dedicated.ServerPropertiesHandler.acceptsTransfers; }
// public static void acceptsTransfers(boolean value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.acceptsTransfers = value; }

public java.lang.String regionFileCompression() { return wrapperContained.regionFileCompression; }
// public void regionFileCompression(java.lang.String value) { wrapperContained.regionFileCompression = value; }
// public static java.lang.String regionFileCompression() { return net.minecraft.server.dedicated.ServerPropertiesHandler.regionFileCompression; }
// public static void regionFileCompression(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.regionFileCompression = value; }

public java.lang.String bugReportLink() { return wrapperContained.bugReportLink; }
// public void bugReportLink(java.lang.String value) { wrapperContained.bugReportLink = value; }
// public static java.lang.String bugReportLink() { return net.minecraft.server.dedicated.ServerPropertiesHandler.bugReportLink; }
// public static void bugReportLink(java.lang.String value, ) { net.minecraft.server.dedicated.ServerPropertiesHandler.bugReportLink = value; }

// public yarnwrap.server.dedicated.ServerPropertiesHandler load(java.nio.file.Path path) { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.load(path)); }
// public static yarnwrap.server.dedicated.ServerPropertiesHandler load(java.nio.file.Path path, ) { return new yarnwrap.server.dedicated.ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesHandler.load(path)); }
// public java.lang.Integer method_16715(java.lang.Integer maxWorldSize) { return wrapperContained.method_16715(maxWorldSize); }
// public static java.lang.Integer method_16715(java.lang.Integer maxWorldSize, ) { return net.minecraft.server.dedicated.ServerPropertiesHandler.method_16715(maxWorldSize); }
// public java.lang.Integer method_27905(java.lang.Integer percentage) { return wrapperContained.method_27905(percentage); }
// public static java.lang.Integer method_27905(java.lang.Integer percentage, ) { return net.minecraft.server.dedicated.ServerPropertiesHandler.method_27905(percentage); }
// public java.lang.String method_41005(java.lang.String type) { return wrapperContained.method_41005(type); }
// public static java.lang.String method_41005(java.lang.String type, ) { return net.minecraft.server.dedicated.ServerPropertiesHandler.method_41005(type); }
// public com.google.gson.JsonObject method_41186(java.lang.String generatorSettings) { return wrapperContained.method_41186(generatorSettings); }
// public static com.google.gson.JsonObject method_41186(java.lang.String generatorSettings, ) { return net.minecraft.server.dedicated.ServerPropertiesHandler.method_41186(generatorSettings); }
// public java.util.Optional getServerResourcePackProperties(java.lang.String id,java.lang.String url,java.lang.String sha1,java.lang.String hash,boolean required,java.lang.String prompt) { return wrapperContained.getServerResourcePackProperties(id,url,sha1,hash,required,prompt); }
// public static java.util.Optional getServerResourcePackProperties(java.lang.String id,java.lang.String url,java.lang.String sha1,java.lang.String hash,boolean required,java.lang.String prompt, ) { return net.minecraft.server.dedicated.ServerPropertiesHandler.getServerResourcePackProperties(id,url,sha1,hash,required,prompt); }
// public yarnwrap.text.Text parseResourcePackPrompt(java.lang.String prompt) { return new yarnwrap.text.Text(wrapperContained.parseResourcePackPrompt(prompt)); }
// public static yarnwrap.text.Text parseResourcePackPrompt(java.lang.String prompt, ) { return new yarnwrap.text.Text(net.minecraft.server.dedicated.ServerPropertiesHandler.parseResourcePackPrompt(prompt)); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder(yarnwrap.registry.DynamicRegistryManager dynamicRegistry) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDimensionsRegistryHolder(dynamicRegistry.wrapperContained)); }
// public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder(yarnwrap.registry.DynamicRegistryManager dynamicRegistry, ) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.server.dedicated.ServerPropertiesHandler.createDimensionsRegistryHolder(dynamicRegistry.wrapperContained)); }
// public yarnwrap.resource.DataPackSettings parseDataPackSettings(java.lang.String enabled,java.lang.String disabled) { return new yarnwrap.resource.DataPackSettings(wrapperContained.parseDataPackSettings(enabled,disabled)); }
// public static yarnwrap.resource.DataPackSettings parseDataPackSettings(java.lang.String enabled,java.lang.String disabled, ) { return new yarnwrap.resource.DataPackSettings(net.minecraft.server.dedicated.ServerPropertiesHandler.parseDataPackSettings(enabled,disabled)); }

}