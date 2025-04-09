package yarnwrap.server;
public class PlayerManager { public net.minecraft.server.PlayerManager wrapperContained; public PlayerManager(net.minecraft.server.PlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

public java.io.File WHITELIST_FILE() { return wrapperContained.WHITELIST_FILE; }
// public yarnwrap.server.BannedPlayerList bannedProfiles() { return new yarnwrap.server.BannedPlayerList(wrapperContained.bannedProfiles); }
// public yarnwrap.server.BannedIpList bannedIps() { return new yarnwrap.server.BannedIpList(wrapperContained.bannedIps); }
// public java.util.Map advancementTrackers() { return wrapperContained.advancementTrackers; }
// public int maxPlayers() { return wrapperContained.maxPlayers; }
public java.io.File OPERATORS_FILE() { return wrapperContained.OPERATORS_FILE; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean cheatsAllowed() { return wrapperContained.cheatsAllowed; }
// public java.util.List players() { return wrapperContained.players; }
// public boolean whitelistEnabled() { return wrapperContained.whitelistEnabled; }
// public yarnwrap.server.OperatorList ops() { return new yarnwrap.server.OperatorList(wrapperContained.ops); }
// public java.util.Map playerMap() { return wrapperContained.playerMap; }
public java.io.File BANNED_PLAYERS_FILE() { return wrapperContained.BANNED_PLAYERS_FILE; }
// public java.text.SimpleDateFormat DATE_FORMATTER() { return wrapperContained.DATE_FORMATTER; }
// public int latencyUpdateTimer() { return wrapperContained.latencyUpdateTimer; }
// public yarnwrap.world.PlayerSaveHandler saveHandler() { return new yarnwrap.world.PlayerSaveHandler(wrapperContained.saveHandler); }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.server.Whitelist whitelist() { return new yarnwrap.server.Whitelist(wrapperContained.whitelist); }
// public java.util.Map statisticsMap() { return wrapperContained.statisticsMap; }
public java.io.File BANNED_IPS_FILE() { return wrapperContained.BANNED_IPS_FILE; }
// public yarnwrap.registry.CombinedDynamicRegistries registryManager() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.registryManager); }
// public int LATENCY_UPDATE_INTERVAL() { return wrapperContained.LATENCY_UPDATE_INTERVAL; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
public yarnwrap.text.Text FILTERED_FULL_TEXT() { return new yarnwrap.text.Text(wrapperContained.FILTERED_FULL_TEXT); }
public yarnwrap.text.Text DUPLICATE_LOGIN_TEXT() { return new yarnwrap.text.Text(wrapperContained.DUPLICATE_LOGIN_TEXT); }
// public yarnwrap.server.network.ServerPlayerEntity respawnPlayer(yarnwrap.server.network.ServerPlayerEntity player,boolean alive,Object removalReason) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.respawnPlayer(player.wrapperContained,alive,removalReason)); }
public void setWhitelistEnabled(boolean whitelistEnabled) { wrapperContained.setWhitelistEnabled(whitelistEnabled); }
public java.util.List getPlayersByIp(java.lang.String ip) { return wrapperContained.getPlayersByIp(ip); }
public java.lang.String[] getWhitelistedNames() { return wrapperContained.getWhitelistedNames(); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
public yarnwrap.server.BannedPlayerList getUserBanList() { return new yarnwrap.server.BannedPlayerList(wrapperContained.getUserBanList()); }
public void sendToTeam(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message) { wrapperContained.sendToTeam(source.wrapperContained,message.wrapperContained); }
public void sendToOtherTeams(yarnwrap.entity.player.PlayerEntity source,yarnwrap.text.Text message) { wrapperContained.sendToOtherTeams(source.wrapperContained,message.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer(java.lang.String name) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(name)); }
public yarnwrap.nbt.NbtCompound getUserData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUserData()); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
public boolean isOperator(com.mojang.authlib.GameProfile profile) { return wrapperContained.isOperator(profile); }
public void onPlayerConnect(yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ConnectedClientData clientData) { wrapperContained.onPlayerConnect(connection.wrapperContained,player.wrapperContained,clientData.wrapperContained); }
public java.util.List getPlayerList() { return wrapperContained.getPlayerList(); }
public void onDataPacksReloaded() { wrapperContained.onDataPacksReloaded(); }
public int getCurrentPlayerCount() { return wrapperContained.getCurrentPlayerCount(); }
public void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendCommandTree(player.wrapperContained); }
// public void savePlayerData(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.savePlayerData(player.wrapperContained); }
public yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.getAdvancementTracker(player.wrapperContained)); }
public boolean areCheatsAllowed() { return wrapperContained.areCheatsAllowed(); }
public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
public void sendToAll(yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAll(packet.wrapperContained); }
public void addToOperators(com.mojang.authlib.GameProfile profile) { wrapperContained.addToOperators(profile); }
public yarnwrap.stat.ServerStatHandler createStatHandler(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.stat.ServerStatHandler(wrapperContained.createStatHandler(player.wrapperContained)); }
public java.lang.String[] getOpNames() { return wrapperContained.getOpNames(); }
public yarnwrap.server.BannedIpList getIpBanList() { return new yarnwrap.server.BannedIpList(wrapperContained.getIpBanList()); }
public yarnwrap.text.Text checkCanJoin(java.net.SocketAddress address,com.mojang.authlib.GameProfile profile) { return new yarnwrap.text.Text(wrapperContained.checkCanJoin(address,profile)); }
public boolean isWhitelisted(com.mojang.authlib.GameProfile profile) { return wrapperContained.isWhitelisted(profile); }
// public void sendScoreboard(yarnwrap.scoreboard.ServerScoreboard scoreboard,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendScoreboard(scoreboard.wrapperContained,player.wrapperContained); }
public void sendToDimension(yarnwrap.network.packet.Packet packet,yarnwrap.registry.RegistryKey dimension) { wrapperContained.sendToDimension(packet.wrapperContained,dimension.wrapperContained); }
public yarnwrap.server.Whitelist getWhitelist() { return new yarnwrap.server.Whitelist(wrapperContained.getWhitelist()); }
public void setMainWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setMainWorld(world.wrapperContained); }
public int getMaxPlayerCount() { return wrapperContained.getMaxPlayerCount(); }
public void sendPlayerStatus(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendPlayerStatus(player.wrapperContained); }
// public void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player,int permissionLevel) { wrapperContained.sendCommandTree(player.wrapperContained,permissionLevel); }
public void disconnectAllPlayers() { wrapperContained.disconnectAllPlayers(); }
public void reloadWhitelist() { wrapperContained.reloadWhitelist(); }
public java.util.Optional loadPlayerData(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.loadPlayerData(player.wrapperContained); }
public void updatePlayerLatency() { wrapperContained.updatePlayerLatency(); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer(java.util.UUID uuid) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(uuid)); }
public yarnwrap.server.OperatorList getOpList() { return new yarnwrap.server.OperatorList(wrapperContained.getOpList()); }
public void removeFromOperators(com.mojang.authlib.GameProfile profile) { wrapperContained.removeFromOperators(profile); }
public void sendToAround(yarnwrap.entity.player.PlayerEntity player,double x,double y,double z,double distance,yarnwrap.registry.RegistryKey worldKey,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAround(player.wrapperContained,x,y,z,distance,worldKey.wrapperContained,packet.wrapperContained); }
public void sendWorldInfo(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.world.ServerWorld world) { wrapperContained.sendWorldInfo(player.wrapperContained,world.wrapperContained); }
public void setCheatsAllowed(boolean cheatsAllowed) { wrapperContained.setCheatsAllowed(cheatsAllowed); }
public void setViewDistance(int viewDistance) { wrapperContained.setViewDistance(viewDistance); }
public boolean canBypassPlayerLimit(com.mojang.authlib.GameProfile profile) { return wrapperContained.canBypassPlayerLimit(profile); }
public void remove(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.remove(player.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity createPlayer(com.mojang.authlib.GameProfile profile,yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.createPlayer(profile,syncedOptions.wrapperContained)); }
public boolean isWhitelistEnabled() { return wrapperContained.isWhitelistEnabled(); }
public void saveAllPlayerData() { wrapperContained.saveAllPlayerData(); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
public int getSimulationDistance() { return wrapperContained.getSimulationDistance(); }
public void broadcast(yarnwrap.text.Text message,java.util.function.Function playerMessageFactory,boolean overlay) { wrapperContained.broadcast(message.wrapperContained,playerMessageFactory,overlay); }
public void broadcast(yarnwrap.text.Text message,boolean overlay) { wrapperContained.broadcast(message.wrapperContained,overlay); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.network.ServerPlayerEntity sender,Object params) { wrapperContained.broadcast(message.wrapperContained,sender.wrapperContained,params); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,yarnwrap.server.command.ServerCommandSource source,Object params) { wrapperContained.broadcast(message.wrapperContained,source.wrapperContained,params); }
// public void broadcast(yarnwrap.network.message.SignedMessage message,java.util.function.Predicate shouldSendFiltered,yarnwrap.server.network.ServerPlayerEntity sender,Object params) { wrapperContained.broadcast(message.wrapperContained,shouldSendFiltered,sender.wrapperContained,params); }
// public boolean verify(yarnwrap.network.message.SignedMessage message) { return wrapperContained.verify(message.wrapperContained); }
public boolean disconnectDuplicateLogins(com.mojang.authlib.GameProfile profile) { return wrapperContained.disconnectDuplicateLogins(profile); }
public void sendStatusEffects(yarnwrap.entity.LivingEntity entity,yarnwrap.server.network.ServerPlayNetworkHandler networkHandler) { wrapperContained.sendStatusEffects(entity.wrapperContained,networkHandler.wrapperContained); }
public void sendStatusEffects(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStatusEffects(player.wrapperContained); }

}