package yarnwrap.server.dedicated;
public class ServerPropertiesHandler { public net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained; public ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean broadcastConsoleToOps() { return wrapperContained.broadcastConsoleToOps; }
public Object whiteList() { return wrapperContained.whiteList; }
public boolean enforceWhitelist() { return wrapperContained.enforceWhitelist; }
public boolean enableCommandBlock() { return wrapperContained.enableCommandBlock; }
public boolean allowFlight() { return wrapperContained.allowFlight; }
public boolean spawnNpcs() { return wrapperContained.spawnNpcs; }
public boolean allowNether() { return wrapperContained.allowNether; }
public int maxWorldSize() { return wrapperContained.maxWorldSize; }
public boolean onlineMode() { return wrapperContained.onlineMode; }
public int maxPlayers() { return wrapperContained.maxPlayers; }
public long maxTickTime() { return wrapperContained.maxTickTime; }
public int spawnProtection() { return wrapperContained.spawnProtection; }
public Object playerIdleTimeout() { return wrapperContained.playerIdleTimeout; }
public boolean enableRcon() { return wrapperContained.enableRcon; }
public boolean enableQuery() { return wrapperContained.enableQuery; }
public java.lang.String levelName() { return wrapperContained.levelName; }
public java.lang.String rconPassword() { return wrapperContained.rconPassword; }
public boolean broadcastRconToOps() { return wrapperContained.broadcastRconToOps; }
public java.lang.String motd() { return wrapperContained.motd; }
public boolean forceGameMode() { return wrapperContained.forceGameMode; }
public int rconPort() { return wrapperContained.rconPort; }
public java.lang.String serverIp() { return wrapperContained.serverIp; }
public java.lang.Boolean announcePlayerAchievements() { return wrapperContained.announcePlayerAchievements; }
public int queryPort() { return wrapperContained.queryPort; }
public boolean useNativeTransport() { return wrapperContained.useNativeTransport; }
public boolean pvp() { return wrapperContained.pvp; }
public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
public int serverPort() { return wrapperContained.serverPort; }
public boolean hardcore() { return wrapperContained.hardcore; }
public boolean preventProxyConnections() { return wrapperContained.preventProxyConnections; }
public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
public int networkCompressionThreshold() { return wrapperContained.networkCompressionThreshold; }
public int viewDistance() { return wrapperContained.viewDistance; }
public int opPermissionLevel() { return wrapperContained.opPermissionLevel; }
public int functionPermissionLevel() { return wrapperContained.functionPermissionLevel; }
public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites; }
public boolean enableJmxMonitoring() { return wrapperContained.enableJmxMonitoring; }
public boolean enableStatus() { return wrapperContained.enableStatus; }
public int entityBroadcastRangePercentage() { return wrapperContained.entityBroadcastRangePercentage; }
public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
public int rateLimit() { return wrapperContained.rateLimit; }
public java.lang.String textFilteringConfig() { return wrapperContained.textFilteringConfig; }
public int simulationDistance() { return wrapperContained.simulationDistance; }
public boolean hideOnlinePlayers() { return wrapperContained.hideOnlinePlayers; }
public int maxChainedNeighborUpdates() { return wrapperContained.maxChainedNeighborUpdates; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public boolean enforceSecureProfile() { return wrapperContained.enforceSecureProfile; }
public java.util.Optional serverResourcePackProperties() { return wrapperContained.serverResourcePackProperties; }
// public java.util.regex.Pattern SHA1_PATTERN() { return wrapperContained.SHA1_PATTERN; }
public yarnwrap.resource.DataPackSettings dataPackSettings() { return new yarnwrap.resource.DataPackSettings(wrapperContained.dataPackSettings); }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public Object worldGenProperties() { return wrapperContained.worldGenProperties; }
public boolean logIps() { return wrapperContained.logIps; }
public boolean acceptsTransfers() { return wrapperContained.acceptsTransfers; }
public java.lang.String regionFileCompression() { return wrapperContained.regionFileCompression; }
public java.lang.String bugReportLink() { return wrapperContained.bugReportLink; }
public yarnwrap.server.dedicated.ServerPropertiesHandler load(java.nio.file.Path path) { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.load(path)); }
// public java.util.Optional getServerResourcePackProperties(java.lang.String id,java.lang.String url,java.lang.String sha1,java.lang.String hash,boolean required,java.lang.String prompt) { return wrapperContained.getServerResourcePackProperties(id,url,sha1,hash,required,prompt); }
// public yarnwrap.text.Text parseResourcePackPrompt(java.lang.String prompt) { return new yarnwrap.text.Text(wrapperContained.parseResourcePackPrompt(prompt)); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder(yarnwrap.registry.DynamicRegistryManager dynamicRegistry) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDimensionsRegistryHolder(dynamicRegistry.wrapperContained)); }
// public yarnwrap.resource.DataPackSettings parseDataPackSettings(java.lang.String enabled,java.lang.String disabled) { return new yarnwrap.resource.DataPackSettings(wrapperContained.parseDataPackSettings(enabled,disabled)); }

}