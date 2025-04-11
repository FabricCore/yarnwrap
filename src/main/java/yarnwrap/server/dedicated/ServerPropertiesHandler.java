package yarnwrap.server.dedicated;
public class ServerPropertiesHandler { public net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained; public ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean broadcastConsoleToOps() { return wrapperContained.broadcastConsoleToOps; }
// public void broadcastConsoleToOps(boolean value) { wrapperContained.broadcastConsoleToOps = value; }
public Object whiteList() { return wrapperContained.whiteList; }
// // public void whiteList(Object value) { wrapperContained.whiteList = value; }
public boolean enforceWhitelist() { return wrapperContained.enforceWhitelist; }
// public void enforceWhitelist(boolean value) { wrapperContained.enforceWhitelist = value; }
public boolean enableCommandBlock() { return wrapperContained.enableCommandBlock; }
// public void enableCommandBlock(boolean value) { wrapperContained.enableCommandBlock = value; }
public boolean allowFlight() { return wrapperContained.allowFlight; }
// public void allowFlight(boolean value) { wrapperContained.allowFlight = value; }
public boolean spawnNpcs() { return wrapperContained.spawnNpcs; }
// public void spawnNpcs(boolean value) { wrapperContained.spawnNpcs = value; }
public boolean allowNether() { return wrapperContained.allowNether; }
// public void allowNether(boolean value) { wrapperContained.allowNether = value; }
public int maxWorldSize() { return wrapperContained.maxWorldSize; }
// public void maxWorldSize(int value) { wrapperContained.maxWorldSize = value; }
public boolean onlineMode() { return wrapperContained.onlineMode; }
// public void onlineMode(boolean value) { wrapperContained.onlineMode = value; }
public int maxPlayers() { return wrapperContained.maxPlayers; }
// public void maxPlayers(int value) { wrapperContained.maxPlayers = value; }
public long maxTickTime() { return wrapperContained.maxTickTime; }
// public void maxTickTime(long value) { wrapperContained.maxTickTime = value; }
public int spawnProtection() { return wrapperContained.spawnProtection; }
// public void spawnProtection(int value) { wrapperContained.spawnProtection = value; }
public Object playerIdleTimeout() { return wrapperContained.playerIdleTimeout; }
// // public void playerIdleTimeout(Object value) { wrapperContained.playerIdleTimeout = value; }
public boolean enableRcon() { return wrapperContained.enableRcon; }
// public void enableRcon(boolean value) { wrapperContained.enableRcon = value; }
public boolean enableQuery() { return wrapperContained.enableQuery; }
// public void enableQuery(boolean value) { wrapperContained.enableQuery = value; }
public java.lang.String levelName() { return wrapperContained.levelName; }
// public void levelName(java.lang.String value) { wrapperContained.levelName = value; }
public java.lang.String rconPassword() { return wrapperContained.rconPassword; }
// public void rconPassword(java.lang.String value) { wrapperContained.rconPassword = value; }
public boolean broadcastRconToOps() { return wrapperContained.broadcastRconToOps; }
// public void broadcastRconToOps(boolean value) { wrapperContained.broadcastRconToOps = value; }
public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
public boolean forceGameMode() { return wrapperContained.forceGameMode; }
// public void forceGameMode(boolean value) { wrapperContained.forceGameMode = value; }
public int rconPort() { return wrapperContained.rconPort; }
// public void rconPort(int value) { wrapperContained.rconPort = value; }
public java.lang.String serverIp() { return wrapperContained.serverIp; }
// public void serverIp(java.lang.String value) { wrapperContained.serverIp = value; }
public java.lang.Boolean announcePlayerAchievements() { return wrapperContained.announcePlayerAchievements; }
// public void announcePlayerAchievements(java.lang.Boolean value) { wrapperContained.announcePlayerAchievements = value; }
public int queryPort() { return wrapperContained.queryPort; }
// public void queryPort(int value) { wrapperContained.queryPort = value; }
public boolean useNativeTransport() { return wrapperContained.useNativeTransport; }
// public void useNativeTransport(boolean value) { wrapperContained.useNativeTransport = value; }
public boolean pvp() { return wrapperContained.pvp; }
// public void pvp(boolean value) { wrapperContained.pvp = value; }
public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public void spawnMonsters(boolean value) { wrapperContained.spawnMonsters = value; }
public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
// public void spawnAnimals(boolean value) { wrapperContained.spawnAnimals = value; }
public int serverPort() { return wrapperContained.serverPort; }
// public void serverPort(int value) { wrapperContained.serverPort = value; }
public boolean hardcore() { return wrapperContained.hardcore; }
// public void hardcore(boolean value) { wrapperContained.hardcore = value; }
public boolean preventProxyConnections() { return wrapperContained.preventProxyConnections; }
// public void preventProxyConnections(boolean value) { wrapperContained.preventProxyConnections = value; }
public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
public int networkCompressionThreshold() { return wrapperContained.networkCompressionThreshold; }
// public void networkCompressionThreshold(int value) { wrapperContained.networkCompressionThreshold = value; }
public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
public int opPermissionLevel() { return wrapperContained.opPermissionLevel; }
// public void opPermissionLevel(int value) { wrapperContained.opPermissionLevel = value; }
public int functionPermissionLevel() { return wrapperContained.functionPermissionLevel; }
// public void functionPermissionLevel(int value) { wrapperContained.functionPermissionLevel = value; }
public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites; }
// public void syncChunkWrites(boolean value) { wrapperContained.syncChunkWrites = value; }
public boolean enableJmxMonitoring() { return wrapperContained.enableJmxMonitoring; }
// public void enableJmxMonitoring(boolean value) { wrapperContained.enableJmxMonitoring = value; }
public boolean enableStatus() { return wrapperContained.enableStatus; }
// public void enableStatus(boolean value) { wrapperContained.enableStatus = value; }
public int entityBroadcastRangePercentage() { return wrapperContained.entityBroadcastRangePercentage; }
// public void entityBroadcastRangePercentage(int value) { wrapperContained.entityBroadcastRangePercentage = value; }
public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
public int rateLimit() { return wrapperContained.rateLimit; }
// public void rateLimit(int value) { wrapperContained.rateLimit = value; }
public java.lang.String textFilteringConfig() { return wrapperContained.textFilteringConfig; }
// public void textFilteringConfig(java.lang.String value) { wrapperContained.textFilteringConfig = value; }
public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
public boolean hideOnlinePlayers() { return wrapperContained.hideOnlinePlayers; }
// public void hideOnlinePlayers(boolean value) { wrapperContained.hideOnlinePlayers = value; }
public int maxChainedNeighborUpdates() { return wrapperContained.maxChainedNeighborUpdates; }
// public void maxChainedNeighborUpdates(int value) { wrapperContained.maxChainedNeighborUpdates = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public boolean enforceSecureProfile() { return wrapperContained.enforceSecureProfile; }
// public void enforceSecureProfile(boolean value) { wrapperContained.enforceSecureProfile = value; }
public java.util.Optional serverResourcePackProperties() { return wrapperContained.serverResourcePackProperties; }
// public void serverResourcePackProperties(java.util.Optional value) { wrapperContained.serverResourcePackProperties = value; }
// public java.util.regex.Pattern SHA1_PATTERN() { return wrapperContained.SHA1_PATTERN; }
// public void SHA1_PATTERN(java.util.regex.Pattern value) { wrapperContained.SHA1_PATTERN = value; }
public yarnwrap.resource.DataPackSettings dataPackSettings() { return new yarnwrap.resource.DataPackSettings(wrapperContained.dataPackSettings); }
// public void dataPackSettings(yarnwrap.resource.DataPackSettings value) { wrapperContained.dataPackSettings = value.wrapperContained; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public Object worldGenProperties() { return wrapperContained.worldGenProperties; }
// // public void worldGenProperties(Object value) { wrapperContained.worldGenProperties = value; }
public boolean logIps() { return wrapperContained.logIps; }
// public void logIps(boolean value) { wrapperContained.logIps = value; }
public boolean acceptsTransfers() { return wrapperContained.acceptsTransfers; }
public void acceptsTransfers(boolean value) { wrapperContained.acceptsTransfers = value; }
public java.lang.String regionFileCompression() { return wrapperContained.regionFileCompression; }
// public void regionFileCompression(java.lang.String value) { wrapperContained.regionFileCompression = value; }
public java.lang.String bugReportLink() { return wrapperContained.bugReportLink; }
// public void bugReportLink(java.lang.String value) { wrapperContained.bugReportLink = value; }
public yarnwrap.server.dedicated.ServerPropertiesHandler load(java.nio.file.Path path) { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.load(path)); }
// public java.util.Optional getServerResourcePackProperties(java.lang.String id,java.lang.String url,java.lang.String sha1,java.lang.String hash,boolean required,java.lang.String prompt) { return wrapperContained.getServerResourcePackProperties(id,url,sha1,hash,required,prompt); }
// public yarnwrap.text.Text parseResourcePackPrompt(java.lang.String prompt) { return new yarnwrap.text.Text(wrapperContained.parseResourcePackPrompt(prompt)); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder(yarnwrap.registry.DynamicRegistryManager dynamicRegistry) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDimensionsRegistryHolder(dynamicRegistry.wrapperContained)); }
// public yarnwrap.resource.DataPackSettings parseDataPackSettings(java.lang.String enabled,java.lang.String disabled) { return new yarnwrap.resource.DataPackSettings(wrapperContained.parseDataPackSettings(enabled,disabled)); }

}