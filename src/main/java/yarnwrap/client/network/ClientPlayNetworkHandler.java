package yarnwrap.client.network;
public class ClientPlayNetworkHandler { public net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained; public ClientPlayNetworkHandler(net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.util.UUID value) { wrapperContained.sessionId = value; }
// public int chunkLoadDistance() { return wrapperContained.chunkLoadDistance; }
// public void chunkLoadDistance(int value) { wrapperContained.chunkLoadDistance = value; }
// public Object worldProperties() { return wrapperContained.worldProperties; }
// // public void worldProperties(Object value) { wrapperContained.worldProperties = value; }
// public Object combinedDynamicRegistries() { return wrapperContained.combinedDynamicRegistries; }
// // public void combinedDynamicRegistries(Object value) { wrapperContained.combinedDynamicRegistries = value; }
// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public void worldKeys(java.util.Set value) { wrapperContained.worldKeys = value; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.recipe.RecipeManager recipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.recipeManager); }
// public void recipeManager(yarnwrap.recipe.RecipeManager value) { wrapperContained.recipeManager = value.wrapperContained; }
// public yarnwrap.client.network.ClientCommandSource commandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.commandSource); }
// public void commandSource(yarnwrap.client.network.ClientCommandSource value) { wrapperContained.commandSource = value.wrapperContained; }
// public yarnwrap.client.network.DataQueryHandler dataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(wrapperContained.dataQueryHandler); }
// public void dataQueryHandler(yarnwrap.client.network.DataQueryHandler value) { wrapperContained.dataQueryHandler = value.wrapperContained; }
// public java.util.Map playerListEntries() { return wrapperContained.playerListEntries; }
// public void playerListEntries(java.util.Map value) { wrapperContained.playerListEntries = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public void commandDispatcher(com.mojang.brigadier.CommandDispatcher value) { wrapperContained.commandDispatcher = value; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.advancementHandler); }
// public void advancementHandler(yarnwrap.client.network.ClientAdvancementManager value) { wrapperContained.advancementHandler = value.wrapperContained; }
// public Object messagePacker() { return wrapperContained.messagePacker; }
// // public void messagePacker(Object value) { wrapperContained.messagePacker = value; }
// public yarnwrap.network.message.LastSeenMessagesCollector lastSeenMessagesCollector() { return new yarnwrap.network.message.LastSeenMessagesCollector(wrapperContained.lastSeenMessagesCollector); }
// public void lastSeenMessagesCollector(yarnwrap.network.message.LastSeenMessagesCollector value) { wrapperContained.lastSeenMessagesCollector = value.wrapperContained; }
// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TITLE() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TITLE); }
// public void UNSECURE_SERVER_TOAST_TITLE(yarnwrap.text.Text value) { wrapperContained.UNSECURE_SERVER_TOAST_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TEXT); }
// public void UNSECURE_SERVER_TOAST_TEXT(yarnwrap.text.Text value) { wrapperContained.UNSECURE_SERVER_TOAST_TEXT = value.wrapperContained; }
// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value) { wrapperContained.signatureStorage = value.wrapperContained; }
// public yarnwrap.text.Text INVALID_PACKET_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PACKET_TEXT); }
// public void INVALID_PACKET_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_PACKET_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_VALIDATION_FAILED_TEXT); }
// public void CHAT_VALIDATION_FAILED_TEXT(yarnwrap.text.Text value) { wrapperContained.CHAT_VALIDATION_FAILED_TEXT = value.wrapperContained; }
// public int ACKNOWLEDGMENT_BATCH_SIZE() { return wrapperContained.ACKNOWLEDGMENT_BATCH_SIZE; }
// public void ACKNOWLEDGMENT_BATCH_SIZE(int value) { wrapperContained.ACKNOWLEDGMENT_BATCH_SIZE = value; }
// public java.util.Set listedPlayerListEntries() { return wrapperContained.listedPlayerListEntries; }
// public void listedPlayerListEntries(java.util.Set value) { wrapperContained.listedPlayerListEntries = value; }
// public yarnwrap.network.encryption.ClientPlayerSession session() { return new yarnwrap.network.encryption.ClientPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.ClientPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.enabledFeatures = value.wrapperContained; }
// public yarnwrap.text.Text RECONFIGURING_TEXT() { return new yarnwrap.text.Text(wrapperContained.RECONFIGURING_TEXT); }
// public void RECONFIGURING_TEXT(yarnwrap.text.Text value) { wrapperContained.RECONFIGURING_TEXT = value.wrapperContained; }
// public yarnwrap.client.network.ChunkBatchSizeCalculator chunkBatchSizeCalculator() { return new yarnwrap.client.network.ChunkBatchSizeCalculator(wrapperContained.chunkBatchSizeCalculator); }
// public void chunkBatchSizeCalculator(yarnwrap.client.network.ChunkBatchSizeCalculator value) { wrapperContained.chunkBatchSizeCalculator = value.wrapperContained; }
// public yarnwrap.client.network.PingMeasurer pingMeasurer() { return new yarnwrap.client.network.PingMeasurer(wrapperContained.pingMeasurer); }
// public void pingMeasurer(yarnwrap.client.network.PingMeasurer value) { wrapperContained.pingMeasurer = value.wrapperContained; }
// public boolean displayedUnsecureChatWarning() { return wrapperContained.displayedUnsecureChatWarning; }
// public void displayedUnsecureChatWarning(boolean value) { wrapperContained.displayedUnsecureChatWarning = value; }
// public boolean worldCleared() { return wrapperContained.worldCleared; }
// public void worldCleared(boolean value) { wrapperContained.worldCleared = value; }
// public yarnwrap.client.network.WorldLoadingState worldLoadingState() { return new yarnwrap.client.network.WorldLoadingState(wrapperContained.worldLoadingState); }
// public void worldLoadingState(yarnwrap.client.network.WorldLoadingState value) { wrapperContained.worldLoadingState = value.wrapperContained; }
// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
// public void secureChatEnforced(boolean value) { wrapperContained.secureChatEnforced = value; }
// public yarnwrap.client.network.DebugSampleSubscriber debugSampleSubscriber() { return new yarnwrap.client.network.DebugSampleSubscriber(wrapperContained.debugSampleSubscriber); }
// public void debugSampleSubscriber(yarnwrap.client.network.DebugSampleSubscriber value) { wrapperContained.debugSampleSubscriber = value.wrapperContained; }
// public yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.brewingRecipeRegistry); }
// public void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.brewingRecipeRegistry = value.wrapperContained; }
// public yarnwrap.client.search.SearchManager searchManager() { return new yarnwrap.client.search.SearchManager(wrapperContained.searchManager); }
// public void searchManager(yarnwrap.client.search.SearchManager value) { wrapperContained.searchManager = value.wrapperContained; }
// public ClientPlayNetworkHandler(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.network.ClientPlayNetworkHandler(client.wrapperContained); }
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
// public void method_34007(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.method_34007(pos.wrapperContained,state.wrapperContained); }
// public void method_34008(yarnwrap.entity.LivingEntity pair) { wrapperContained.method_34008(pair.wrapperContained); }
// public void method_34009(yarnwrap.screen.ScreenHandler recipe) { wrapperContained.method_34009(recipe.wrapperContained); }
// public void method_34010(yarnwrap.scoreboard.Team team) { wrapperContained.method_34010(team.wrapperContained); }
// public void method_34011(yarnwrap.client.recipebook.ClientRecipeBook recipe) { wrapperContained.method_34011(recipe.wrapperContained); }
// public void method_34012(yarnwrap.client.recipebook.ClientRecipeBook recipeResultCollection) { wrapperContained.method_34012(recipeResultCollection.wrapperContained); }
// public void method_37472(int entityId) { wrapperContained.method_37472(entityId); }
// public void loadChunk(int x,int z,yarnwrap.network.packet.s2c.play.ChunkData chunkData) { wrapperContained.loadChunk(x,z,chunkData.wrapperContained); }
// public void scheduleRenderChunk(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { wrapperContained.scheduleRenderChunk(chunk.wrapperContained,x,z); }
// public void method_38542(yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket blockEntity) { wrapperContained.method_38542(blockEntity.wrapperContained); }
// public void readLightData(int x,int z,yarnwrap.network.packet.s2c.play.LightData data) { wrapperContained.readLightData(x,z,data.wrapperContained); }
// public void playSpawnSound(yarnwrap.entity.Entity entity) { wrapperContained.playSpawnSound(entity.wrapperContained); }
public void acknowledge(yarnwrap.network.message.SignedMessage message,boolean displayed) { wrapperContained.acknowledge(message.wrapperContained,displayed); }
public boolean hasFeature(yarnwrap.resource.featuretoggle.FeatureSet feature) { return wrapperContained.hasFeature(feature.wrapperContained); }
// public yarnwrap.network.message.MessageSignatureData method_45722(java.time.Instant value) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.method_45722(value)); }
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
// public void method_46525(java.util.Optional keyPair) { wrapperContained.method_46525(keyPair); }
// public void method_46528(java.util.Optional keyPair) { wrapperContained.method_46528(keyPair); }
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