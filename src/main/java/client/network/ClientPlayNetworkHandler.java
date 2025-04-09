package yarnwrap.client.network;
public class ClientPlayNetworkHandler { public net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained; public ClientPlayNetworkHandler(net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public int chunkLoadDistance() { return wrapperContained.chunkLoadDistance; }
// public Object worldProperties() { return wrapperContained.worldProperties; }
// public Object combinedDynamicRegistries() { return wrapperContained.combinedDynamicRegistries; }
// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public yarnwrap.recipe.RecipeManager recipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.recipeManager); }
// public yarnwrap.client.network.ClientCommandSource commandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.commandSource); }
// public yarnwrap.client.network.DataQueryHandler dataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(wrapperContained.dataQueryHandler); }
// public java.util.Map playerListEntries() { return wrapperContained.playerListEntries; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.advancementHandler); }
// public Object messagePacker() { return wrapperContained.messagePacker; }
// public yarnwrap.network.message.LastSeenMessagesCollector lastSeenMessagesCollector() { return new yarnwrap.network.message.LastSeenMessagesCollector(wrapperContained.lastSeenMessagesCollector); }
// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TITLE() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TITLE); }
// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TEXT); }
// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public yarnwrap.text.Text INVALID_PACKET_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PACKET_TEXT); }
// public yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_VALIDATION_FAILED_TEXT); }
// public int ACKNOWLEDGMENT_BATCH_SIZE() { return wrapperContained.ACKNOWLEDGMENT_BATCH_SIZE; }
// public java.util.Set listedPlayerListEntries() { return wrapperContained.listedPlayerListEntries; }
// public yarnwrap.network.encryption.ClientPlayerSession session() { return new yarnwrap.network.encryption.ClientPlayerSession(wrapperContained.session); }
// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public yarnwrap.text.Text RECONFIGURING_TEXT() { return new yarnwrap.text.Text(wrapperContained.RECONFIGURING_TEXT); }
// public yarnwrap.client.network.ChunkBatchSizeCalculator chunkBatchSizeCalculator() { return new yarnwrap.client.network.ChunkBatchSizeCalculator(wrapperContained.chunkBatchSizeCalculator); }
// public yarnwrap.client.network.PingMeasurer pingMeasurer() { return new yarnwrap.client.network.PingMeasurer(wrapperContained.pingMeasurer); }
// public boolean displayedUnsecureChatWarning() { return wrapperContained.displayedUnsecureChatWarning; }
// public boolean worldCleared() { return wrapperContained.worldCleared; }
// public yarnwrap.client.network.WorldLoadingState worldLoadingState() { return new yarnwrap.client.network.WorldLoadingState(wrapperContained.worldLoadingState); }
// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
// public yarnwrap.client.network.DebugSampleSubscriber debugSampleSubscriber() { return new yarnwrap.client.network.DebugSampleSubscriber(wrapperContained.debugSampleSubscriber); }
// public yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.brewingRecipeRegistry); }
// public yarnwrap.client.search.SearchManager searchManager() { return new yarnwrap.client.search.SearchManager(wrapperContained.searchManager); }
public java.util.UUID getSessionId() { return wrapperContained.getSessionId(); }
// public yarnwrap.item.ItemStack getActiveTotemOfUndying(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.getActiveTotemOfUndying(player.wrapperContained)); }
public yarnwrap.client.network.ClientAdvancementManager getAdvancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.getAdvancementHandler()); }
// public void updateLighting(int chunkX,int chunkZ,yarnwrap.world.chunk.light.LightingProvider provider,yarnwrap.world.LightType type,java.util.BitSet inited,java.util.BitSet uninited,java.util.Iterator nibbles) { wrapperContained.updateLighting(chunkX,chunkZ,provider.wrapperContained,type.wrapperContained,inited,uninited,nibbles); }
public yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.util.UUID uuid) { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry(uuid)); }
public yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.lang.String profileName) { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry(profileName)); }
public yarnwrap.client.network.ClientCommandSource getCommandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.getCommandSource()); }
public yarnwrap.client.network.DataQueryHandler getDataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(wrapperContained.getDataQueryHandler()); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
public java.util.Collection getPlayerList() { return wrapperContained.getPlayerList(); }
public com.mojang.brigadier.CommandDispatcher getCommandDispatcher() { return wrapperContained.getCommandDispatcher(); }
public yarnwrap.client.world.ClientWorld getWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.getWorld()); }
public Object getRegistryManager() { return wrapperContained.getRegistryManager(); }
public java.util.Set getWorldKeys() { return wrapperContained.getWorldKeys(); }
public java.util.Collection getPlayerUuids() { return wrapperContained.getPlayerUuids(); }
// public void loadChunk(int x,int z,yarnwrap.network.packet.s2c.play.ChunkData chunkData) { wrapperContained.loadChunk(x,z,chunkData.wrapperContained); }
// public void scheduleRenderChunk(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { wrapperContained.scheduleRenderChunk(chunk.wrapperContained,x,z); }
// public void readLightData(int x,int z,yarnwrap.network.packet.s2c.play.LightData data) { wrapperContained.readLightData(x,z,data.wrapperContained); }
// public void playSpawnSound(yarnwrap.entity.Entity entity) { wrapperContained.playSpawnSound(entity.wrapperContained); }
public void acknowledge(yarnwrap.network.message.SignedMessage message,boolean displayed) { wrapperContained.acknowledge(message.wrapperContained,displayed); }
public boolean hasFeature(yarnwrap.resource.featuretoggle.FeatureSet feature) { return wrapperContained.hasFeature(feature.wrapperContained); }
// public void handlePlayerListAction(Object action,Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry) { wrapperContained.handlePlayerListAction(action,receivedEntry,currentEntry.wrapperContained); }
// public void setPublicSession(Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry) { wrapperContained.setPublicSession(receivedEntry,currentEntry.wrapperContained); }
public void sendChatMessage(java.lang.String content) { wrapperContained.sendChatMessage(content); }
public void sendChatCommand(java.lang.String command) { wrapperContained.sendChatCommand(command); }
public boolean sendCommand(java.lang.String command) { return wrapperContained.sendCommand(command); }
public java.util.Collection getListedPlayerListEntries() { return wrapperContained.getListedPlayerListEntries(); }
// public com.mojang.brigadier.ParseResults parse(java.lang.String command) { return wrapperContained.parse(command); }
public yarnwrap.client.network.ServerInfo getServerInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.getServerInfo()); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
// public void sendAcknowledgment() { wrapperContained.sendAcknowledgment(); }
// public boolean isSecureChatEnforced() { return wrapperContained.isSecureChatEnforced(); }
public void updateKeyPair(yarnwrap.network.encryption.PlayerKeyPair keyPair) { wrapperContained.updateKeyPair(keyPair.wrapperContained); }
public void unloadWorld() { wrapperContained.unloadWorld(); }
public yarnwrap.network.ClientConnection getConnection() { return new yarnwrap.network.ClientConnection(wrapperContained.getConnection()); }
// public void unloadChunk(yarnwrap.network.packet.s2c.play.UnloadChunkS2CPacket packet) { wrapperContained.unloadChunk(packet.wrapperContained); }
// public void warnOnUnknownPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.warnOnUnknownPayload(payload.wrapperContained); }
// public yarnwrap.entity.Entity createEntity(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet) { return new yarnwrap.entity.Entity(wrapperContained.createEntity(packet.wrapperContained)); }
// public void startWorldLoading(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.world.ClientWorld world,Object worldEntryReason) { wrapperContained.startWorldLoading(player.wrapperContained,world.wrapperContained,worldEntryReason); }
public void clearWorld() { wrapperContained.clearWorld(); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
// public Object getWorldEntryReason(boolean dead,yarnwrap.registry.RegistryKey from,yarnwrap.registry.RegistryKey to) { return wrapperContained.getWorldEntryReason(dead,from.wrapperContained,to.wrapperContained); }
public void refreshSearchManager() { wrapperContained.refreshSearchManager(); }
public yarnwrap.client.search.SearchManager getSearchManager() { return new yarnwrap.client.search.SearchManager(wrapperContained.getSearchManager()); }
public yarnwrap.server.ServerLinks getServerLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.getServerLinks()); }

}