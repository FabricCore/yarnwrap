package yarnwrap.server;
public class PlayerManager { public net.minecraft.server.PlayerManager wrapperContained; public PlayerManager(net.minecraft.server.PlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File WHITELIST_FILE() { return wrapperContained.WHITELIST_FILE; }
// public void WHITELIST_FILE(java.io.File value) { wrapperContained.WHITELIST_FILE = value; }
public static java.io.File WHITELIST_FILE() { return net.minecraft.server.PlayerManager.WHITELIST_FILE; }
// public static void WHITELIST_FILE(java.io.File value, ) { net.minecraft.server.PlayerManager.WHITELIST_FILE = value; }

// public yarnwrap.server.BannedPlayerList bannedProfiles() { return new yarnwrap.server.BannedPlayerList(wrapperContained.bannedProfiles); }
// public void bannedProfiles(yarnwrap.server.BannedPlayerList value) { wrapperContained.bannedProfiles = value.wrapperContained; }
// public static yarnwrap.server.BannedPlayerList bannedProfiles() { return new yarnwrap.server.BannedPlayerList(net.minecraft.server.PlayerManager.bannedProfiles); }
// public static void bannedProfiles(yarnwrap.server.BannedPlayerList value, ) { net.minecraft.server.PlayerManager.bannedProfiles = value.wrapperContained; }

// public yarnwrap.server.BannedIpList bannedIps() { return new yarnwrap.server.BannedIpList(wrapperContained.bannedIps); }
// public void bannedIps(yarnwrap.server.BannedIpList value) { wrapperContained.bannedIps = value.wrapperContained; }
// public static yarnwrap.server.BannedIpList bannedIps() { return new yarnwrap.server.BannedIpList(net.minecraft.server.PlayerManager.bannedIps); }
// public static void bannedIps(yarnwrap.server.BannedIpList value, ) { net.minecraft.server.PlayerManager.bannedIps = value.wrapperContained; }

// public java.util.Map advancementTrackers() { return wrapperContained.advancementTrackers; }
// public void advancementTrackers(java.util.Map value) { wrapperContained.advancementTrackers = value; }
// public static java.util.Map advancementTrackers() { return net.minecraft.server.PlayerManager.advancementTrackers; }
// public static void advancementTrackers(java.util.Map value, ) { net.minecraft.server.PlayerManager.advancementTrackers = value; }

// public int maxPlayers() { return wrapperContained.maxPlayers; }
// public void maxPlayers(int value) { wrapperContained.maxPlayers = value; }
// public static int maxPlayers() { return net.minecraft.server.PlayerManager.maxPlayers; }
// public static void maxPlayers(int value, ) { net.minecraft.server.PlayerManager.maxPlayers = value; }

// public java.io.File OPERATORS_FILE() { return wrapperContained.OPERATORS_FILE; }
// public void OPERATORS_FILE(java.io.File value) { wrapperContained.OPERATORS_FILE = value; }
public static java.io.File OPERATORS_FILE() { return net.minecraft.server.PlayerManager.OPERATORS_FILE; }
// public static void OPERATORS_FILE(java.io.File value, ) { net.minecraft.server.PlayerManager.OPERATORS_FILE = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.PlayerManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.PlayerManager.LOGGER = value; }

// public boolean cheatsAllowed() { return wrapperContained.cheatsAllowed; }
// public void cheatsAllowed(boolean value) { wrapperContained.cheatsAllowed = value; }
// public static boolean cheatsAllowed() { return net.minecraft.server.PlayerManager.cheatsAllowed; }
// public static void cheatsAllowed(boolean value, ) { net.minecraft.server.PlayerManager.cheatsAllowed = value; }

// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public static java.util.List players() { return net.minecraft.server.PlayerManager.players; }
// public static void players(java.util.List value, ) { net.minecraft.server.PlayerManager.players = value; }

// public boolean whitelistEnabled() { return wrapperContained.whitelistEnabled; }
// public void whitelistEnabled(boolean value) { wrapperContained.whitelistEnabled = value; }
// public static boolean whitelistEnabled() { return net.minecraft.server.PlayerManager.whitelistEnabled; }
// public static void whitelistEnabled(boolean value, ) { net.minecraft.server.PlayerManager.whitelistEnabled = value; }

// public yarnwrap.server.OperatorList ops() { return new yarnwrap.server.OperatorList(wrapperContained.ops); }
// public void ops(yarnwrap.server.OperatorList value) { wrapperContained.ops = value.wrapperContained; }
// public static yarnwrap.server.OperatorList ops() { return new yarnwrap.server.OperatorList(net.minecraft.server.PlayerManager.ops); }
// public static void ops(yarnwrap.server.OperatorList value, ) { net.minecraft.server.PlayerManager.ops = value.wrapperContained; }

// public java.util.Map playerMap() { return wrapperContained.playerMap; }
// public void playerMap(java.util.Map value) { wrapperContained.playerMap = value; }
// public static java.util.Map playerMap() { return net.minecraft.server.PlayerManager.playerMap; }
// public static void playerMap(java.util.Map value, ) { net.minecraft.server.PlayerManager.playerMap = value; }

// public java.io.File BANNED_PLAYERS_FILE() { return wrapperContained.BANNED_PLAYERS_FILE; }
// public void BANNED_PLAYERS_FILE(java.io.File value) { wrapperContained.BANNED_PLAYERS_FILE = value; }
public static java.io.File BANNED_PLAYERS_FILE() { return net.minecraft.server.PlayerManager.BANNED_PLAYERS_FILE; }
// public static void BANNED_PLAYERS_FILE(java.io.File value, ) { net.minecraft.server.PlayerManager.BANNED_PLAYERS_FILE = value; }

// public java.text.SimpleDateFormat DATE_FORMATTER() { return wrapperContained.DATE_FORMATTER; }
// public void DATE_FORMATTER(java.text.SimpleDateFormat value) { wrapperContained.DATE_FORMATTER = value; }
// public static java.text.SimpleDateFormat DATE_FORMATTER() { return net.minecraft.server.PlayerManager.DATE_FORMATTER; }
// public static void DATE_FORMATTER(java.text.SimpleDateFormat value, ) { net.minecraft.server.PlayerManager.DATE_FORMATTER = value; }

// public int latencyUpdateTimer() { return wrapperContained.latencyUpdateTimer; }
// public void latencyUpdateTimer(int value) { wrapperContained.latencyUpdateTimer = value; }
// public static int latencyUpdateTimer() { return net.minecraft.server.PlayerManager.latencyUpdateTimer; }
// public static void latencyUpdateTimer(int value, ) { net.minecraft.server.PlayerManager.latencyUpdateTimer = value; }

// public yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(wrapperContained.saveHandler); }
// public void saveHandler(yarnwrap.world.PlayerSaveHandler value) { wrapperContained.saveHandler = value.wrapperContained; }
// public static yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(net.minecraft.server.PlayerManager.saveHandler); }
// public static void saveHandler(yarnwrap.world.PlayerSaveHandler value, ) { net.minecraft.server.PlayerManager.saveHandler = value.wrapperContained; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.server.PlayerManager.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.server.PlayerManager.viewDistance = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.PlayerManager.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.PlayerManager.server = value.wrapperContained; }

// public yarnwrap.server.Whitelist whitelist() { return new yarnwrap.server.Whitelist(wrapperContained.whitelist); }
// public void whitelist(yarnwrap.server.Whitelist value) { wrapperContained.whitelist = value.wrapperContained; }
// public static yarnwrap.server.Whitelist whitelist() { return new yarnwrap.server.Whitelist(net.minecraft.server.PlayerManager.whitelist); }
// public static void whitelist(yarnwrap.server.Whitelist value, ) { net.minecraft.server.PlayerManager.whitelist = value.wrapperContained; }

// public java.util.Map statisticsMap() { return wrapperContained.statisticsMap; }
// public void statisticsMap(java.util.Map value) { wrapperContained.statisticsMap = value; }
// public static java.util.Map statisticsMap() { return net.minecraft.server.PlayerManager.statisticsMap; }
// public static void statisticsMap(java.util.Map value, ) { net.minecraft.server.PlayerManager.statisticsMap = value; }

// public java.io.File BANNED_IPS_FILE() { return wrapperContained.BANNED_IPS_FILE; }
// public void BANNED_IPS_FILE(java.io.File value) { wrapperContained.BANNED_IPS_FILE = value; }
public static java.io.File BANNED_IPS_FILE() { return net.minecraft.server.PlayerManager.BANNED_IPS_FILE; }
// public static void BANNED_IPS_FILE(java.io.File value, ) { net.minecraft.server.PlayerManager.BANNED_IPS_FILE = value; }

// public yarnwrap.registry.CombinedDynamicRegistries registryManager() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.CombinedDynamicRegistries registryManager() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.server.PlayerManager.registryManager); }
// public static void registryManager(yarnwrap.registry.CombinedDynamicRegistries value, ) { net.minecraft.server.PlayerManager.registryManager = value.wrapperContained; }

// public int LATENCY_UPDATE_INTERVAL() { return wrapperContained.LATENCY_UPDATE_INTERVAL; }
// public void LATENCY_UPDATE_INTERVAL(int value) { wrapperContained.LATENCY_UPDATE_INTERVAL = value; }
// public static int LATENCY_UPDATE_INTERVAL() { return net.minecraft.server.PlayerManager.LATENCY_UPDATE_INTERVAL; }
// public static void LATENCY_UPDATE_INTERVAL(int value, ) { net.minecraft.server.PlayerManager.LATENCY_UPDATE_INTERVAL = value; }

// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.server.PlayerManager.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.server.PlayerManager.simulationDistance = value; }

// public yarnwrap.text.Text FILTERED_FULL_TEXT() { return new yarnwrap.text.Text(wrapperContained.FILTERED_FULL_TEXT); }
// public void FILTERED_FULL_TEXT(yarnwrap.text.Text value) { wrapperContained.FILTERED_FULL_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text FILTERED_FULL_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.PlayerManager.FILTERED_FULL_TEXT); }
// public static void FILTERED_FULL_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.PlayerManager.FILTERED_FULL_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text DUPLICATE_LOGIN_TEXT() { return new yarnwrap.text.Text(wrapperContained.DUPLICATE_LOGIN_TEXT); }
// public void DUPLICATE_LOGIN_TEXT(yarnwrap.text.Text value) { wrapperContained.DUPLICATE_LOGIN_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text DUPLICATE_LOGIN_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.PlayerManager.DUPLICATE_LOGIN_TEXT); }
// public static void DUPLICATE_LOGIN_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.PlayerManager.DUPLICATE_LOGIN_TEXT = value.wrapperContained; }

// public PlayerManager(yarnwrap.server.MinecraftServer server,yarnwrap.registry.CombinedDynamicRegistries registryManager,yarnwrap.world.PlayerSaveHandler saveHandler,int maxPlayers) { this.wrapperContained = new net.minecraft.server.PlayerManager(server.wrapperContained,registryManager.wrapperContained,saveHandler.wrapperContained,maxPlayers); }
// public yarnwrap.server.network.ServerPlayerEntity respawnPlayer(yarnwrap.server.network.ServerPlayerEntity player,boolean alive,Object removalReason) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.respawnPlayer(player.wrapperContained,alive,removalReason)); }
// public static yarnwrap.server.network.ServerPlayerEntity respawnPlayer(yarnwrap.server.network.ServerPlayerEntity player,boolean alive,Object removalReason, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.PlayerManager.respawnPlayer(player.wrapperContained,alive,removalReason)); }
public void setWhitelistEnabled(boolean whitelistEnabled) { wrapperContained.setWhitelistEnabled(whitelistEnabled); }
// public static void setWhitelistEnabled(boolean whitelistEnabled, ) { net.minecraft.server.PlayerManager.setWhitelistEnabled(whitelistEnabled); }
public java.util.List getPlayersByIp(java.lang.String ip) { return wrapperContained.getPlayersByIp(ip); }
// public static java.util.List getPlayersByIp(java.lang.String ip, ) { return net.minecraft.server.PlayerManager.getPlayersByIp(ip); }
public java.lang.String[] getWhitelistedNames() { return wrapperContained.getWhitelistedNames(); }
// public static java.lang.String[] getWhitelistedNames() { return net.minecraft.server.PlayerManager.getWhitelistedNames(); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
// public static yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.PlayerManager.getServer()); }
public yarnwrap.server.BannedPlayerList getUserBanList() { return new yarnwrap.server.BannedPlayerList(wrapperContained.getUserBanList()); }
// public static yarnwrap.server.BannedPlayerList getUserBanList() { return new yarnwrap.server.BannedPlayerList(net.minecraft.server.PlayerManager.getUserBanList()); }
public void sendToTeam(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message) { wrapperContained.sendToTeam(source.wrapperContained,message.wrapperContained); }
// public static void sendToTeam(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message, ) { net.minecraft.server.PlayerManager.sendToTeam(source.wrapperContained,message.wrapperContained); }
public void sendToOtherTeams(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message) { wrapperContained.sendToOtherTeams(source.wrapperContained,message.wrapperContained); }
// public static void sendToOtherTeams(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message, ) { net.minecraft.server.PlayerManager.sendToOtherTeams(source.wrapperContained,message.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer(java.lang.String name) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(name)); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer(java.lang.String name, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.PlayerManager.getPlayer(name)); }
public yarnwrap.nbt.NbtCompound getUserData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUserData()); }
// public static yarnwrap.nbt.NbtCompound getUserData() { return new yarnwrap.nbt.NbtCompound(net.minecraft.server.PlayerManager.getUserData()); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
// public static int getViewDistance() { return net.minecraft.server.PlayerManager.getViewDistance(); }
public boolean isOperator(com.mojang.authlib.GameProfile profile) { return wrapperContained.isOperator(profile); }
// public static boolean isOperator(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.PlayerManager.isOperator(profile); }
public void onPlayerConnect(yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ConnectedClientData clientData) { wrapperContained.onPlayerConnect(connection.wrapperContained,player.wrapperContained,clientData.wrapperContained); }
// public static void onPlayerConnect(yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ConnectedClientData clientData, ) { net.minecraft.server.PlayerManager.onPlayerConnect(connection.wrapperContained,player.wrapperContained,clientData.wrapperContained); }
public java.util.List getPlayerList() { return wrapperContained.getPlayerList(); }
// public static java.util.List getPlayerList() { return net.minecraft.server.PlayerManager.getPlayerList(); }
public void onDataPacksReloaded() { wrapperContained.onDataPacksReloaded(); }
// public static void onDataPacksReloaded() { net.minecraft.server.PlayerManager.onDataPacksReloaded(); }
public int getCurrentPlayerCount() { return wrapperContained.getCurrentPlayerCount(); }
// public static int getCurrentPlayerCount() { return net.minecraft.server.PlayerManager.getCurrentPlayerCount(); }
public void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendCommandTree(player.wrapperContained); }
// public static void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.sendCommandTree(player.wrapperContained); }
// public void savePlayerData(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.savePlayerData(player.wrapperContained); }
// public static void savePlayerData(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.savePlayerData(player.wrapperContained); }
public yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.getAdvancementTracker(player.wrapperContained)); }
// public static yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker(yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.advancement.PlayerAdvancementTracker(net.minecraft.server.PlayerManager.getAdvancementTracker(player.wrapperContained)); }
public boolean areCheatsAllowed() { return wrapperContained.areCheatsAllowed(); }
// public static boolean areCheatsAllowed() { return net.minecraft.server.PlayerManager.areCheatsAllowed(); }
public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public static java.lang.String[] getPlayerNames() { return net.minecraft.server.PlayerManager.getPlayerNames(); }
public void sendToAll(yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAll(packet.wrapperContained); }
// public static void sendToAll(yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.PlayerManager.sendToAll(packet.wrapperContained); }
public void addToOperators(com.mojang.authlib.GameProfile profile) { wrapperContained.addToOperators(profile); }
// public static void addToOperators(com.mojang.authlib.GameProfile profile, ) { net.minecraft.server.PlayerManager.addToOperators(profile); }
public yarnwrap.stat.ServerStatHandler createStatHandler(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.stat.ServerStatHandler(wrapperContained.createStatHandler(player.wrapperContained)); }
// public static yarnwrap.stat.ServerStatHandler createStatHandler(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.stat.ServerStatHandler(net.minecraft.server.PlayerManager.createStatHandler(player.wrapperContained)); }
public java.lang.String[] getOpNames() { return wrapperContained.getOpNames(); }
// public static java.lang.String[] getOpNames() { return net.minecraft.server.PlayerManager.getOpNames(); }
public yarnwrap.server.BannedIpList getIpBanList() { return new yarnwrap.server.BannedIpList(wrapperContained.getIpBanList()); }
// public static yarnwrap.server.BannedIpList getIpBanList() { return new yarnwrap.server.BannedIpList(net.minecraft.server.PlayerManager.getIpBanList()); }
public yarnwrap.text.Text checkCanJoin(java.net.SocketAddress address,com.mojang.authlib.GameProfile profile) { return new yarnwrap.text.Text(wrapperContained.checkCanJoin(address,profile)); }
// public static yarnwrap.text.Text checkCanJoin(java.net.SocketAddress address,com.mojang.authlib.GameProfile profile, ) { return new yarnwrap.text.Text(net.minecraft.server.PlayerManager.checkCanJoin(address,profile)); }
public boolean isWhitelisted(com.mojang.authlib.GameProfile profile) { return wrapperContained.isWhitelisted(profile); }
// public static boolean isWhitelisted(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.PlayerManager.isWhitelisted(profile); }
// public void sendScoreboard(yarnwrap.scoreboard.ServerScoreboard scoreboard,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendScoreboard(scoreboard.wrapperContained,player.wrapperContained); }
// public static void sendScoreboard(yarnwrap.scoreboard.ServerScoreboard scoreboard,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.sendScoreboard(scoreboard.wrapperContained,player.wrapperContained); }
public void sendToDimension(yarnwrap.network.packet.Packet packet,yarnwrap.registry.RegistryKey dimension) { wrapperContained.sendToDimension(packet.wrapperContained,dimension.wrapperContained); }
// public static void sendToDimension(yarnwrap.network.packet.Packet packet,yarnwrap.registry.RegistryKey dimension, ) { net.minecraft.server.PlayerManager.sendToDimension(packet.wrapperContained,dimension.wrapperContained); }
public yarnwrap.server.Whitelist getWhitelist() { return new yarnwrap.server.Whitelist(wrapperContained.getWhitelist()); }
// public static yarnwrap.server.Whitelist getWhitelist() { return new yarnwrap.server.Whitelist(net.minecraft.server.PlayerManager.getWhitelist()); }
public void setMainWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setMainWorld(world.wrapperContained); }
// public static void setMainWorld(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.PlayerManager.setMainWorld(world.wrapperContained); }
public int getMaxPlayerCount() { return wrapperContained.getMaxPlayerCount(); }
// public static int getMaxPlayerCount() { return net.minecraft.server.PlayerManager.getMaxPlayerCount(); }
public void sendPlayerStatus(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendPlayerStatus(player.wrapperContained); }
// public static void sendPlayerStatus(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.sendPlayerStatus(player.wrapperContained); }
// public void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player,int permissionLevel) { wrapperContained.sendCommandTree(player.wrapperContained,permissionLevel); }
// public static void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player,int permissionLevel, ) { net.minecraft.server.PlayerManager.sendCommandTree(player.wrapperContained,permissionLevel); }
public void disconnectAllPlayers() { wrapperContained.disconnectAllPlayers(); }
// public static void disconnectAllPlayers() { net.minecraft.server.PlayerManager.disconnectAllPlayers(); }
public void reloadWhitelist() { wrapperContained.reloadWhitelist(); }
// public static void reloadWhitelist() { net.minecraft.server.PlayerManager.reloadWhitelist(); }
// public java.util.Optional loadPlayerData(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.ErrorReporter errorReporter) { return wrapperContained.loadPlayerData(player.wrapperContained,errorReporter.wrapperContained); }
// public static java.util.Optional loadPlayerData(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.ErrorReporter errorReporter, ) { return net.minecraft.server.PlayerManager.loadPlayerData(player.wrapperContained,errorReporter.wrapperContained); }
public void updatePlayerLatency() { wrapperContained.updatePlayerLatency(); }
// public static void updatePlayerLatency() { net.minecraft.server.PlayerManager.updatePlayerLatency(); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer(java.util.UUID uuid) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(uuid)); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer(java.util.UUID uuid, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.PlayerManager.getPlayer(uuid)); }
public yarnwrap.server.OperatorList getOpList() { return new yarnwrap.server.OperatorList(wrapperContained.getOpList()); }
// public static yarnwrap.server.OperatorList getOpList() { return new yarnwrap.server.OperatorList(net.minecraft.server.PlayerManager.getOpList()); }
public void removeFromOperators(com.mojang.authlib.GameProfile profile) { wrapperContained.removeFromOperators(profile); }
// public static void removeFromOperators(com.mojang.authlib.GameProfile profile, ) { net.minecraft.server.PlayerManager.removeFromOperators(profile); }
public void sendToAround(yarnwrap.entity.player.PlayerEntity player,double x,double y,double z,double distance,yarnwrap.registry.RegistryKey worldKey,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAround(player.wrapperContained,x,y,z,distance,worldKey.wrapperContained,packet.wrapperContained); }
// public static void sendToAround(yarnwrap.entity.player.PlayerEntity player,double x,double y,double z,double distance,yarnwrap.registry.RegistryKey worldKey,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.PlayerManager.sendToAround(player.wrapperContained,x,y,z,distance,worldKey.wrapperContained,packet.wrapperContained); }
public void sendWorldInfo(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.world.ServerWorld world) { wrapperContained.sendWorldInfo(player.wrapperContained,world.wrapperContained); }
// public static void sendWorldInfo(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.PlayerManager.sendWorldInfo(player.wrapperContained,world.wrapperContained); }
public void setCheatsAllowed(boolean cheatsAllowed) { wrapperContained.setCheatsAllowed(cheatsAllowed); }
// public static void setCheatsAllowed(boolean cheatsAllowed, ) { net.minecraft.server.PlayerManager.setCheatsAllowed(cheatsAllowed); }
public void setViewDistance(int viewDistance) { wrapperContained.setViewDistance(viewDistance); }
// public static void setViewDistance(int viewDistance, ) { net.minecraft.server.PlayerManager.setViewDistance(viewDistance); }
public boolean canBypassPlayerLimit(com.mojang.authlib.GameProfile profile) { return wrapperContained.canBypassPlayerLimit(profile); }
// public static boolean canBypassPlayerLimit(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.PlayerManager.canBypassPlayerLimit(profile); }
public void remove(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.remove(player.wrapperContained); }
// public static void remove(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.remove(player.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity createPlayer(com.mojang.authlib.GameProfile profile,yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.createPlayer(profile,syncedOptions.wrapperContained)); }
// public static yarnwrap.server.network.ServerPlayerEntity createPlayer(com.mojang.authlib.GameProfile profile,yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.PlayerManager.createPlayer(profile,syncedOptions.wrapperContained)); }
public boolean isWhitelistEnabled() { return wrapperContained.isWhitelistEnabled(); }
// public static boolean isWhitelistEnabled() { return net.minecraft.server.PlayerManager.isWhitelistEnabled(); }
public void saveAllPlayerData() { wrapperContained.saveAllPlayerData(); }
// public static void saveAllPlayerData() { net.minecraft.server.PlayerManager.saveAllPlayerData(); }
// public void method_31441(yarnwrap.entity.Entity entity) { wrapperContained.method_31441(entity.wrapperContained); }
// public static void method_31441(yarnwrap.entity.Entity entity, ) { net.minecraft.server.PlayerManager.method_31441(entity.wrapperContained); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
// public static void setSimulationDistance(int simulationDistance, ) { net.minecraft.server.PlayerManager.setSimulationDistance(simulationDistance); }
public int getSimulationDistance() { return wrapperContained.getSimulationDistance(); }
// public static int getSimulationDistance() { return net.minecraft.server.PlayerManager.getSimulationDistance(); }
// public yarnwrap.text.Text method_43511(yarnwrap.text.Text player) { return new yarnwrap.text.Text(wrapperContained.method_43511(player.wrapperContained)); }
// public static yarnwrap.text.Text method_43511(yarnwrap.text.Text player, ) { return new yarnwrap.text.Text(net.minecraft.server.PlayerManager.method_43511(player.wrapperContained)); }
public void broadcast(yarnwrap.text.Text message,java.util.function.Function playerMessageFactory,boolean overlay) { wrapperContained.broadcast(message.wrapperContained,playerMessageFactory,overlay); }
// public static void broadcast(yarnwrap.text.Text message,java.util.function.Function playerMessageFactory,boolean overlay, ) { net.minecraft.server.PlayerManager.broadcast(message.wrapperContained,playerMessageFactory,overlay); }
public void broadcast(yarnwrap.text.Text message,boolean overlay) { wrapperContained.broadcast(message.wrapperContained,overlay); }
// public static void broadcast(yarnwrap.text.Text message,boolean overlay, ) { net.minecraft.server.PlayerManager.broadcast(message.wrapperContained,overlay); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.network.ServerPlayerEntity sender,Object params) { wrapperContained.broadcast(message.wrapperContained,sender.wrapperContained,params); }
// public static void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.network.ServerPlayerEntity sender,Object params, ) { net.minecraft.server.PlayerManager.broadcast(message.wrapperContained,sender.wrapperContained,params); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.command.ServerCommandSource source,Object params) { wrapperContained.broadcast(message.wrapperContained,source.wrapperContained,params); }
// public static void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.command.ServerCommandSource source,Object params, ) { net.minecraft.server.PlayerManager.broadcast(message.wrapperContained,source.wrapperContained,params); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,java.util.function.Predicate shouldSendFiltered,yarnwrap.server.network.ServerPlayerEntity sender,Object params) { wrapperContained.broadcast(message.wrapperContained,shouldSendFiltered,sender.wrapperContained,params); }
// public static void broadcast(yarnwrap.network.message.SignedMessage message,java.util.function.Predicate shouldSendFiltered,yarnwrap.server.network.ServerPlayerEntity sender,Object params, ) { net.minecraft.server.PlayerManager.broadcast(message.wrapperContained,shouldSendFiltered,sender.wrapperContained,params); }
// public boolean verify(yarnwrap.network.message.SignedMessage message) { return wrapperContained.verify(message.wrapperContained); }
// public static boolean verify(yarnwrap.network.message.SignedMessage message, ) { return net.minecraft.server.PlayerManager.verify(message.wrapperContained); }
public boolean disconnectDuplicateLogins(com.mojang.authlib.GameProfile profile) { return wrapperContained.disconnectDuplicateLogins(profile); }
// public static boolean disconnectDuplicateLogins(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.server.PlayerManager.disconnectDuplicateLogins(profile); }
// public java.util.Optional method_55634(yarnwrap.storage.ReadView view) { return wrapperContained.method_55634(view.wrapperContained); }
// public static java.util.Optional method_55634(yarnwrap.storage.ReadView view, ) { return net.minecraft.server.PlayerManager.method_55634(view.wrapperContained); }
public void sendStatusEffects(yarnwrap.entity.LivingEntity entity,yarnwrap.server.network.ServerPlayNetworkHandler networkHandler) { wrapperContained.sendStatusEffects(entity.wrapperContained,networkHandler.wrapperContained); }
// public static void sendStatusEffects(yarnwrap.entity.LivingEntity entity,yarnwrap.server.network.ServerPlayNetworkHandler networkHandler, ) { net.minecraft.server.PlayerManager.sendStatusEffects(entity.wrapperContained,networkHandler.wrapperContained); }
public void sendStatusEffects(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStatusEffects(player.wrapperContained); }
// public static void sendStatusEffects(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.PlayerManager.sendStatusEffects(player.wrapperContained); }
// public void method_68176(yarnwrap.server.network.ServerPlayerEntity view) { wrapperContained.method_68176(view.wrapperContained); }
// public static void method_68176(yarnwrap.server.network.ServerPlayerEntity view, ) { net.minecraft.server.PlayerManager.method_68176(view.wrapperContained); }

}