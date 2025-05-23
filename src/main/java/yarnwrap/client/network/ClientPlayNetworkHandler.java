package yarnwrap.client.network;
public class ClientPlayNetworkHandler { public net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained; public ClientPlayNetworkHandler(net.minecraft.client.network.ClientPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.network.ClientPlayNetworkHandler.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.random = value.wrapperContained; }

// public yarnwrap.client.network.ClientCommandSource commandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.commandSource); }
// public void commandSource(yarnwrap.client.network.ClientCommandSource value) { wrapperContained.commandSource = value.wrapperContained; }
// public static yarnwrap.client.network.ClientCommandSource commandSource() { return new yarnwrap.client.network.ClientCommandSource(net.minecraft.client.network.ClientPlayNetworkHandler.commandSource); }
// public static void commandSource(yarnwrap.client.network.ClientCommandSource value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.commandSource = value.wrapperContained; }

// public yarnwrap.client.network.DataQueryHandler dataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(wrapperContained.dataQueryHandler); }
// public void dataQueryHandler(yarnwrap.client.network.DataQueryHandler value) { wrapperContained.dataQueryHandler = value.wrapperContained; }
// public static yarnwrap.client.network.DataQueryHandler dataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(net.minecraft.client.network.ClientPlayNetworkHandler.dataQueryHandler); }
// public static void dataQueryHandler(yarnwrap.client.network.DataQueryHandler value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.dataQueryHandler = value.wrapperContained; }

// public java.util.Map playerListEntries() { return wrapperContained.playerListEntries; }
// public void playerListEntries(java.util.Map value) { wrapperContained.playerListEntries = value; }
// public static java.util.Map playerListEntries() { return net.minecraft.client.network.ClientPlayNetworkHandler.playerListEntries; }
// public static void playerListEntries(java.util.Map value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.playerListEntries = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientPlayNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.LOGGER = value; }

// public com.mojang.brigadier.CommandDispatcher commandDispatcher() { return wrapperContained.commandDispatcher; }
// public void commandDispatcher(com.mojang.brigadier.CommandDispatcher value) { wrapperContained.commandDispatcher = value; }
// public static com.mojang.brigadier.CommandDispatcher commandDispatcher() { return net.minecraft.client.network.ClientPlayNetworkHandler.commandDispatcher; }
// public static void commandDispatcher(com.mojang.brigadier.CommandDispatcher value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.commandDispatcher = value; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public static com.mojang.authlib.GameProfile profile() { return net.minecraft.client.network.ClientPlayNetworkHandler.profile; }
// public static void profile(com.mojang.authlib.GameProfile value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.profile = value; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.network.ClientPlayNetworkHandler.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.world = value.wrapperContained; }

// public yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.advancementHandler); }
// public void advancementHandler(yarnwrap.client.network.ClientAdvancementManager value) { wrapperContained.advancementHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(net.minecraft.client.network.ClientPlayNetworkHandler.advancementHandler); }
// public static void advancementHandler(yarnwrap.client.network.ClientAdvancementManager value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.advancementHandler = value.wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.util.UUID value) { wrapperContained.sessionId = value; }
// public static java.util.UUID sessionId() { return net.minecraft.client.network.ClientPlayNetworkHandler.sessionId; }
// public static void sessionId(java.util.UUID value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.sessionId = value; }

// public int chunkLoadDistance() { return wrapperContained.chunkLoadDistance; }
// public void chunkLoadDistance(int value) { wrapperContained.chunkLoadDistance = value; }
// public static int chunkLoadDistance() { return net.minecraft.client.network.ClientPlayNetworkHandler.chunkLoadDistance; }
// public static void chunkLoadDistance(int value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.chunkLoadDistance = value; }

// public Object worldProperties() { return wrapperContained.worldProperties; }
// // public void worldProperties(Object value) { wrapperContained.worldProperties = value; }
// // public static Object worldProperties() { return net.minecraft.client.network.ClientPlayNetworkHandler.worldProperties; }
// // public static void worldProperties(Object value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.worldProperties = value; }

// public Object combinedDynamicRegistries() { return wrapperContained.combinedDynamicRegistries; }
// // public void combinedDynamicRegistries(Object value) { wrapperContained.combinedDynamicRegistries = value; }
// // public static Object combinedDynamicRegistries() { return net.minecraft.client.network.ClientPlayNetworkHandler.combinedDynamicRegistries; }
// // public static void combinedDynamicRegistries(Object value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.combinedDynamicRegistries = value; }

// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public void worldKeys(java.util.Set value) { wrapperContained.worldKeys = value; }
// public static java.util.Set worldKeys() { return net.minecraft.client.network.ClientPlayNetworkHandler.worldKeys; }
// public static void worldKeys(java.util.Set value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.worldKeys = value; }

// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.client.network.ClientPlayNetworkHandler.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.simulationDistance = value; }

// public Object messagePacker() { return wrapperContained.messagePacker; }
// // public void messagePacker(Object value) { wrapperContained.messagePacker = value; }
// // public static Object messagePacker() { return net.minecraft.client.network.ClientPlayNetworkHandler.messagePacker; }
// // public static void messagePacker(Object value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.messagePacker = value; }

// public yarnwrap.network.message.LastSeenMessagesCollector lastSeenMessagesCollector() { return new yarnwrap.network.message.LastSeenMessagesCollector(wrapperContained.lastSeenMessagesCollector); }
// public void lastSeenMessagesCollector(yarnwrap.network.message.LastSeenMessagesCollector value) { wrapperContained.lastSeenMessagesCollector = value.wrapperContained; }
// public static yarnwrap.network.message.LastSeenMessagesCollector lastSeenMessagesCollector() { return new yarnwrap.network.message.LastSeenMessagesCollector(net.minecraft.client.network.ClientPlayNetworkHandler.lastSeenMessagesCollector); }
// public static void lastSeenMessagesCollector(yarnwrap.network.message.LastSeenMessagesCollector value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.lastSeenMessagesCollector = value.wrapperContained; }

// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TITLE() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TITLE); }
// public void UNSECURE_SERVER_TOAST_TITLE(yarnwrap.text.Text value) { wrapperContained.UNSECURE_SERVER_TOAST_TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text UNSECURE_SERVER_TOAST_TITLE() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.UNSECURE_SERVER_TOAST_TITLE); }
// public static void UNSECURE_SERVER_TOAST_TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.UNSECURE_SERVER_TOAST_TITLE = value.wrapperContained; }

// public yarnwrap.text.Text UNSECURE_SERVER_TOAST_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNSECURE_SERVER_TOAST_TEXT); }
// public void UNSECURE_SERVER_TOAST_TEXT(yarnwrap.text.Text value) { wrapperContained.UNSECURE_SERVER_TOAST_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text UNSECURE_SERVER_TOAST_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.UNSECURE_SERVER_TOAST_TEXT); }
// public static void UNSECURE_SERVER_TOAST_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.UNSECURE_SERVER_TOAST_TEXT = value.wrapperContained; }

// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value) { wrapperContained.signatureStorage = value.wrapperContained; }
// public static yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(net.minecraft.client.network.ClientPlayNetworkHandler.signatureStorage); }
// public static void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.signatureStorage = value.wrapperContained; }

// public yarnwrap.text.Text INVALID_PACKET_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PACKET_TEXT); }
// public void INVALID_PACKET_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_PACKET_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text INVALID_PACKET_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.INVALID_PACKET_TEXT); }
// public static void INVALID_PACKET_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.INVALID_PACKET_TEXT = value.wrapperContained; }

// public int ACKNOWLEDGMENT_BATCH_SIZE() { return wrapperContained.ACKNOWLEDGMENT_BATCH_SIZE; }
// public void ACKNOWLEDGMENT_BATCH_SIZE(int value) { wrapperContained.ACKNOWLEDGMENT_BATCH_SIZE = value; }
// public static int ACKNOWLEDGMENT_BATCH_SIZE() { return net.minecraft.client.network.ClientPlayNetworkHandler.ACKNOWLEDGMENT_BATCH_SIZE; }
// public static void ACKNOWLEDGMENT_BATCH_SIZE(int value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.ACKNOWLEDGMENT_BATCH_SIZE = value; }

// public java.util.Set listedPlayerListEntries() { return wrapperContained.listedPlayerListEntries; }
// public void listedPlayerListEntries(java.util.Set value) { wrapperContained.listedPlayerListEntries = value; }
// public static java.util.Set listedPlayerListEntries() { return net.minecraft.client.network.ClientPlayNetworkHandler.listedPlayerListEntries; }
// public static void listedPlayerListEntries(java.util.Set value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.listedPlayerListEntries = value; }

// public yarnwrap.network.encryption.ClientPlayerSession session() { return new yarnwrap.network.encryption.ClientPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.ClientPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.network.encryption.ClientPlayerSession session() { return new yarnwrap.network.encryption.ClientPlayerSession(net.minecraft.client.network.ClientPlayNetworkHandler.session); }
// public static void session(yarnwrap.network.encryption.ClientPlayerSession value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.session = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.enabledFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.client.network.ClientPlayNetworkHandler.enabledFeatures); }
// public static void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.enabledFeatures = value.wrapperContained; }

// public yarnwrap.text.Text RECONFIGURING_TEXT() { return new yarnwrap.text.Text(wrapperContained.RECONFIGURING_TEXT); }
// public void RECONFIGURING_TEXT(yarnwrap.text.Text value) { wrapperContained.RECONFIGURING_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text RECONFIGURING_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.RECONFIGURING_TEXT); }
// public static void RECONFIGURING_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.RECONFIGURING_TEXT = value.wrapperContained; }

// public yarnwrap.client.network.ChunkBatchSizeCalculator chunkBatchSizeCalculator() { return new yarnwrap.client.network.ChunkBatchSizeCalculator(wrapperContained.chunkBatchSizeCalculator); }
// public void chunkBatchSizeCalculator(yarnwrap.client.network.ChunkBatchSizeCalculator value) { wrapperContained.chunkBatchSizeCalculator = value.wrapperContained; }
// public static yarnwrap.client.network.ChunkBatchSizeCalculator chunkBatchSizeCalculator() { return new yarnwrap.client.network.ChunkBatchSizeCalculator(net.minecraft.client.network.ClientPlayNetworkHandler.chunkBatchSizeCalculator); }
// public static void chunkBatchSizeCalculator(yarnwrap.client.network.ChunkBatchSizeCalculator value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.chunkBatchSizeCalculator = value.wrapperContained; }

// public yarnwrap.client.network.PingMeasurer pingMeasurer() { return new yarnwrap.client.network.PingMeasurer(wrapperContained.pingMeasurer); }
// public void pingMeasurer(yarnwrap.client.network.PingMeasurer value) { wrapperContained.pingMeasurer = value.wrapperContained; }
// public static yarnwrap.client.network.PingMeasurer pingMeasurer() { return new yarnwrap.client.network.PingMeasurer(net.minecraft.client.network.ClientPlayNetworkHandler.pingMeasurer); }
// public static void pingMeasurer(yarnwrap.client.network.PingMeasurer value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.pingMeasurer = value.wrapperContained; }

// public boolean displayedUnsecureChatWarning() { return wrapperContained.displayedUnsecureChatWarning; }
// public void displayedUnsecureChatWarning(boolean value) { wrapperContained.displayedUnsecureChatWarning = value; }
// public static boolean displayedUnsecureChatWarning() { return net.minecraft.client.network.ClientPlayNetworkHandler.displayedUnsecureChatWarning; }
// public static void displayedUnsecureChatWarning(boolean value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.displayedUnsecureChatWarning = value; }

// public boolean worldCleared() { return wrapperContained.worldCleared; }
// public void worldCleared(boolean value) { wrapperContained.worldCleared = value; }
// public static boolean worldCleared() { return net.minecraft.client.network.ClientPlayNetworkHandler.worldCleared; }
// public static void worldCleared(boolean value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.worldCleared = value; }

// public yarnwrap.client.network.WorldLoadingState worldLoadingState() { return new yarnwrap.client.network.WorldLoadingState(wrapperContained.worldLoadingState); }
// public void worldLoadingState(yarnwrap.client.network.WorldLoadingState value) { wrapperContained.worldLoadingState = value.wrapperContained; }
// public static yarnwrap.client.network.WorldLoadingState worldLoadingState() { return new yarnwrap.client.network.WorldLoadingState(net.minecraft.client.network.ClientPlayNetworkHandler.worldLoadingState); }
// public static void worldLoadingState(yarnwrap.client.network.WorldLoadingState value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.worldLoadingState = value.wrapperContained; }

// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public static yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.client.network.ClientPlayNetworkHandler.scoreboard); }
// public static void scoreboard(yarnwrap.scoreboard.Scoreboard value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.scoreboard = value.wrapperContained; }

// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
// public void secureChatEnforced(boolean value) { wrapperContained.secureChatEnforced = value; }
// public static boolean secureChatEnforced() { return net.minecraft.client.network.ClientPlayNetworkHandler.secureChatEnforced; }
// public static void secureChatEnforced(boolean value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.secureChatEnforced = value; }

// public yarnwrap.client.network.DebugSampleSubscriber debugSampleSubscriber() { return new yarnwrap.client.network.DebugSampleSubscriber(wrapperContained.debugSampleSubscriber); }
// public void debugSampleSubscriber(yarnwrap.client.network.DebugSampleSubscriber value) { wrapperContained.debugSampleSubscriber = value.wrapperContained; }
// public static yarnwrap.client.network.DebugSampleSubscriber debugSampleSubscriber() { return new yarnwrap.client.network.DebugSampleSubscriber(net.minecraft.client.network.ClientPlayNetworkHandler.debugSampleSubscriber); }
// public static void debugSampleSubscriber(yarnwrap.client.network.DebugSampleSubscriber value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.debugSampleSubscriber = value.wrapperContained; }

// public yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.brewingRecipeRegistry); }
// public void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.brewingRecipeRegistry = value.wrapperContained; }
// public static yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.client.network.ClientPlayNetworkHandler.brewingRecipeRegistry); }
// public static void brewingRecipeRegistry(yarnwrap.recipe.BrewingRecipeRegistry value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.brewingRecipeRegistry = value.wrapperContained; }

// public yarnwrap.client.search.SearchManager searchManager() { return new yarnwrap.client.search.SearchManager(wrapperContained.searchManager); }
// public void searchManager(yarnwrap.client.search.SearchManager value) { wrapperContained.searchManager = value.wrapperContained; }
// public static yarnwrap.client.search.SearchManager searchManager() { return new yarnwrap.client.search.SearchManager(net.minecraft.client.network.ClientPlayNetworkHandler.searchManager); }
// public static void searchManager(yarnwrap.client.search.SearchManager value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.searchManager = value.wrapperContained; }

// public yarnwrap.item.FuelRegistry fuelRegistry() { return new yarnwrap.item.FuelRegistry(wrapperContained.fuelRegistry); }
// public void fuelRegistry(yarnwrap.item.FuelRegistry value) { wrapperContained.fuelRegistry = value.wrapperContained; }
// public static yarnwrap.item.FuelRegistry fuelRegistry() { return new yarnwrap.item.FuelRegistry(net.minecraft.client.network.ClientPlayNetworkHandler.fuelRegistry); }
// public static void fuelRegistry(yarnwrap.item.FuelRegistry value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.fuelRegistry = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture profileKeyPairFuture() { return wrapperContained.profileKeyPairFuture; }
// public void profileKeyPairFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.profileKeyPairFuture = value; }
// public static java.util.concurrent.CompletableFuture profileKeyPairFuture() { return net.minecraft.client.network.ClientPlayNetworkHandler.profileKeyPairFuture; }
// public static void profileKeyPairFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.profileKeyPairFuture = value; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions); }
// public void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value) { wrapperContained.syncedOptions = value.wrapperContained; }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.client.network.ClientPlayNetworkHandler.syncedOptions); }
// public static void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.syncedOptions = value.wrapperContained; }

// public yarnwrap.client.recipebook.ClientRecipeManager recipeManager() { return new yarnwrap.client.recipebook.ClientRecipeManager(wrapperContained.recipeManager); }
// public void recipeManager(yarnwrap.client.recipebook.ClientRecipeManager value) { wrapperContained.recipeManager = value.wrapperContained; }
// public static yarnwrap.client.recipebook.ClientRecipeManager recipeManager() { return new yarnwrap.client.recipebook.ClientRecipeManager(net.minecraft.client.network.ClientPlayNetworkHandler.recipeManager); }
// public static void recipeManager(yarnwrap.client.recipebook.ClientRecipeManager value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.recipeManager = value.wrapperContained; }

// public java.util.OptionalInt removedPlayerVehicleId() { return wrapperContained.removedPlayerVehicleId; }
// public void removedPlayerVehicleId(java.util.OptionalInt value) { wrapperContained.removedPlayerVehicleId = value; }
// public static java.util.OptionalInt removedPlayerVehicleId() { return net.minecraft.client.network.ClientPlayNetworkHandler.removedPlayerVehicleId; }
// public static void removedPlayerVehicleId(java.util.OptionalInt value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.removedPlayerVehicleId = value; }

// public java.util.List cachedData() { return wrapperContained.cachedData; }
// public void cachedData(java.util.List value) { wrapperContained.cachedData = value; }
// public static java.util.List cachedData() { return net.minecraft.client.network.ClientPlayNetworkHandler.cachedData; }
// public static void cachedData(java.util.List value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.cachedData = value; }

// public Object componentHasher() { return wrapperContained.componentHasher; }
// // public void componentHasher(Object value) { wrapperContained.componentHasher = value; }
// // public static Object componentHasher() { return net.minecraft.client.network.ClientPlayNetworkHandler.componentHasher; }
// // public static void componentHasher(Object value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.componentHasher = value; }

// public int globalChatMessageIndex() { return wrapperContained.globalChatMessageIndex; }
// public void globalChatMessageIndex(int value) { wrapperContained.globalChatMessageIndex = value; }
// public static int globalChatMessageIndex() { return net.minecraft.client.network.ClientPlayNetworkHandler.globalChatMessageIndex; }
// public static void globalChatMessageIndex(int value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.globalChatMessageIndex = value; }

// public yarnwrap.text.Text BAD_CHAT_INDEX_TEXT() { return new yarnwrap.text.Text(wrapperContained.BAD_CHAT_INDEX_TEXT); }
// public void BAD_CHAT_INDEX_TEXT(yarnwrap.text.Text value) { wrapperContained.BAD_CHAT_INDEX_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text BAD_CHAT_INDEX_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.BAD_CHAT_INDEX_TEXT); }
// public static void BAD_CHAT_INDEX_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.BAD_CHAT_INDEX_TEXT = value.wrapperContained; }

// public yarnwrap.client.world.ClientWaypointHandler waypointHandler() { return new yarnwrap.client.world.ClientWaypointHandler(wrapperContained.waypointHandler); }
// public void waypointHandler(yarnwrap.client.world.ClientWaypointHandler value) { wrapperContained.waypointHandler = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWaypointHandler waypointHandler() { return new yarnwrap.client.world.ClientWaypointHandler(net.minecraft.client.network.ClientPlayNetworkHandler.waypointHandler); }
// public static void waypointHandler(yarnwrap.client.world.ClientWaypointHandler value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.waypointHandler = value.wrapperContained; }

// public yarnwrap.client.network.ClientCommandSource restrictedCommandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.restrictedCommandSource); }
// public void restrictedCommandSource(yarnwrap.client.network.ClientCommandSource value) { wrapperContained.restrictedCommandSource = value.wrapperContained; }
// public static yarnwrap.client.network.ClientCommandSource restrictedCommandSource() { return new yarnwrap.client.network.ClientCommandSource(net.minecraft.client.network.ClientPlayNetworkHandler.restrictedCommandSource); }
// public static void restrictedCommandSource(yarnwrap.client.network.ClientCommandSource value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.restrictedCommandSource = value.wrapperContained; }

// public yarnwrap.text.Text CONFIRM_COMMAND_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CONFIRM_COMMAND_TITLE_TEXT); }
// public void CONFIRM_COMMAND_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.CONFIRM_COMMAND_TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text CONFIRM_COMMAND_TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientPlayNetworkHandler.CONFIRM_COMMAND_TITLE_TEXT); }
// public static void CONFIRM_COMMAND_TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.CONFIRM_COMMAND_TITLE_TEXT = value.wrapperContained; }

// public Object COMMAND_NODE_FACTORY() { return wrapperContained.COMMAND_NODE_FACTORY; }
// public void COMMAND_NODE_FACTORY(Object value) { wrapperContained.COMMAND_NODE_FACTORY = value; }
// // public static Object COMMAND_NODE_FACTORY() { return net.minecraft.client.network.ClientPlayNetworkHandler.COMMAND_NODE_FACTORY; }
// public static void COMMAND_NODE_FACTORY(Object value, ) { net.minecraft.client.network.ClientPlayNetworkHandler.COMMAND_NODE_FACTORY = value; }

// public ClientPlayNetworkHandler(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.network.ClientPlayNetworkHandler(client.wrapperContained); }
public yarnwrap.client.network.ClientAdvancementManager getAdvancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.getAdvancementHandler()); }
// public static yarnwrap.client.network.ClientAdvancementManager getAdvancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(net.minecraft.client.network.ClientPlayNetworkHandler.getAdvancementHandler()); }
// public void updateLighting(int chunkX,int chunkZ,yarnwrap.world.chunk.light.LightingProvider provider,yarnwrap.world.LightType type,java.util.BitSet inited,java.util.BitSet uninited,java.util.Iterator nibbles,boolean scheduleBlockRenders) { wrapperContained.updateLighting(chunkX,chunkZ,provider.wrapperContained,type.wrapperContained,inited,uninited,nibbles,scheduleBlockRenders); }
// public static void updateLighting(int chunkX,int chunkZ,yarnwrap.world.chunk.light.LightingProvider provider,yarnwrap.world.LightType type,java.util.BitSet inited,java.util.BitSet uninited,java.util.Iterator nibbles,boolean scheduleBlockRenders, ) { net.minecraft.client.network.ClientPlayNetworkHandler.updateLighting(chunkX,chunkZ,provider.wrapperContained,type.wrapperContained,inited,uninited,nibbles,scheduleBlockRenders); }
public yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.util.UUID uuid) { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry(uuid)); }
// public static yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.util.UUID uuid, ) { return new yarnwrap.client.network.PlayerListEntry(net.minecraft.client.network.ClientPlayNetworkHandler.getPlayerListEntry(uuid)); }
public yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.lang.String profileName) { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry(profileName)); }
// public static yarnwrap.client.network.PlayerListEntry getPlayerListEntry(java.lang.String profileName, ) { return new yarnwrap.client.network.PlayerListEntry(net.minecraft.client.network.ClientPlayNetworkHandler.getPlayerListEntry(profileName)); }
public yarnwrap.client.network.ClientCommandSource getCommandSource() { return new yarnwrap.client.network.ClientCommandSource(wrapperContained.getCommandSource()); }
// public static yarnwrap.client.network.ClientCommandSource getCommandSource() { return new yarnwrap.client.network.ClientCommandSource(net.minecraft.client.network.ClientPlayNetworkHandler.getCommandSource()); }
public yarnwrap.client.network.DataQueryHandler getDataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(wrapperContained.getDataQueryHandler()); }
// public static yarnwrap.client.network.DataQueryHandler getDataQueryHandler() { return new yarnwrap.client.network.DataQueryHandler(net.minecraft.client.network.ClientPlayNetworkHandler.getDataQueryHandler()); }
public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
// public static com.mojang.authlib.GameProfile getProfile() { return net.minecraft.client.network.ClientPlayNetworkHandler.getProfile(); }
public java.util.Collection getPlayerList() { return wrapperContained.getPlayerList(); }
// public static java.util.Collection getPlayerList() { return net.minecraft.client.network.ClientPlayNetworkHandler.getPlayerList(); }
public com.mojang.brigadier.CommandDispatcher getCommandDispatcher() { return wrapperContained.getCommandDispatcher(); }
// public static com.mojang.brigadier.CommandDispatcher getCommandDispatcher() { return net.minecraft.client.network.ClientPlayNetworkHandler.getCommandDispatcher(); }
public yarnwrap.client.world.ClientWorld getWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.getWorld()); }
// public static yarnwrap.client.world.ClientWorld getWorld() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.network.ClientPlayNetworkHandler.getWorld()); }
public java.util.UUID getSessionId() { return wrapperContained.getSessionId(); }
// public static java.util.UUID getSessionId() { return net.minecraft.client.network.ClientPlayNetworkHandler.getSessionId(); }
// public yarnwrap.item.ItemStack getActiveDeathProtector(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.getActiveDeathProtector(player.wrapperContained)); }
// public static yarnwrap.item.ItemStack getActiveDeathProtector(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.item.ItemStack(net.minecraft.client.network.ClientPlayNetworkHandler.getActiveDeathProtector(player.wrapperContained)); }
public Object getRegistryManager() { return wrapperContained.getRegistryManager(); }
// public static Object getRegistryManager() { return net.minecraft.client.network.ClientPlayNetworkHandler.getRegistryManager(); }
public java.util.Set getWorldKeys() { return wrapperContained.getWorldKeys(); }
// public static java.util.Set getWorldKeys() { return net.minecraft.client.network.ClientPlayNetworkHandler.getWorldKeys(); }
public java.util.Collection getPlayerUuids() { return wrapperContained.getPlayerUuids(); }
// public static java.util.Collection getPlayerUuids() { return net.minecraft.client.network.ClientPlayNetworkHandler.getPlayerUuids(); }
// public void method_34007(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.method_34007(pos.wrapperContained,state.wrapperContained); }
// public static void method_34007(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_34007(pos.wrapperContained,state.wrapperContained); }
// public void method_34008(yarnwrap.entity.LivingEntity pair) { wrapperContained.method_34008(pair.wrapperContained); }
// public static void method_34008(yarnwrap.entity.LivingEntity pair, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_34008(pair.wrapperContained); }
// public void method_34010(yarnwrap.scoreboard.Team team) { wrapperContained.method_34010(team.wrapperContained); }
// public static void method_34010(yarnwrap.scoreboard.Team team, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_34010(team.wrapperContained); }
// public void loadChunk(int x,int z,yarnwrap.network.packet.s2c.play.ChunkData chunkData) { wrapperContained.loadChunk(x,z,chunkData.wrapperContained); }
// public static void loadChunk(int x,int z,yarnwrap.network.packet.s2c.play.ChunkData chunkData, ) { net.minecraft.client.network.ClientPlayNetworkHandler.loadChunk(x,z,chunkData.wrapperContained); }
// public void scheduleRenderChunk(yarnwrap.world.chunk.WorldChunk chunk,int x,int z) { wrapperContained.scheduleRenderChunk(chunk.wrapperContained,x,z); }
// public static void scheduleRenderChunk(yarnwrap.world.chunk.WorldChunk chunk,int x,int z, ) { net.minecraft.client.network.ClientPlayNetworkHandler.scheduleRenderChunk(chunk.wrapperContained,x,z); }
// public void method_38542(yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket blockEntity) { wrapperContained.method_38542(blockEntity.wrapperContained); }
// public static void method_38542(yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket blockEntity, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_38542(blockEntity.wrapperContained); }
// public void readLightData(int x,int z,yarnwrap.network.packet.s2c.play.LightData data,boolean scheduleBlockRenders) { wrapperContained.readLightData(x,z,data.wrapperContained,scheduleBlockRenders); }
// public static void readLightData(int x,int z,yarnwrap.network.packet.s2c.play.LightData data,boolean scheduleBlockRenders, ) { net.minecraft.client.network.ClientPlayNetworkHandler.readLightData(x,z,data.wrapperContained,scheduleBlockRenders); }
// public void playSpawnSound(yarnwrap.entity.Entity entity) { wrapperContained.playSpawnSound(entity.wrapperContained); }
// public static void playSpawnSound(yarnwrap.entity.Entity entity, ) { net.minecraft.client.network.ClientPlayNetworkHandler.playSpawnSound(entity.wrapperContained); }
public void acknowledge(yarnwrap.network.message.MessageSignatureData signature,boolean displayed) { wrapperContained.acknowledge(signature.wrapperContained,displayed); }
// public static void acknowledge(yarnwrap.network.message.MessageSignatureData signature,boolean displayed, ) { net.minecraft.client.network.ClientPlayNetworkHandler.acknowledge(signature.wrapperContained,displayed); }
public boolean hasFeature(yarnwrap.resource.featuretoggle.FeatureSet feature) { return wrapperContained.hasFeature(feature.wrapperContained); }
// public static boolean hasFeature(yarnwrap.resource.featuretoggle.FeatureSet feature, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.hasFeature(feature.wrapperContained); }
// public yarnwrap.network.message.MessageSignatureData method_45722(java.time.Instant value) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.method_45722(value)); }
// public static yarnwrap.network.message.MessageSignatureData method_45722(java.time.Instant value, ) { return new yarnwrap.network.message.MessageSignatureData(net.minecraft.client.network.ClientPlayNetworkHandler.method_45722(value)); }
// public void handlePlayerListAction(Object action,Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry) { wrapperContained.handlePlayerListAction(action,receivedEntry,currentEntry.wrapperContained); }
// public static void handlePlayerListAction(Object action,Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry, ) { net.minecraft.client.network.ClientPlayNetworkHandler.handlePlayerListAction(action,receivedEntry,currentEntry.wrapperContained); }
// public void setPublicSession(Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry) { wrapperContained.setPublicSession(receivedEntry,currentEntry.wrapperContained); }
// public static void setPublicSession(Object receivedEntry,yarnwrap.client.network.PlayerListEntry currentEntry, ) { net.minecraft.client.network.ClientPlayNetworkHandler.setPublicSession(receivedEntry,currentEntry.wrapperContained); }
public void sendChatMessage(java.lang.String content) { wrapperContained.sendChatMessage(content); }
// public static void sendChatMessage(java.lang.String content, ) { net.minecraft.client.network.ClientPlayNetworkHandler.sendChatMessage(content); }
public void sendChatCommand(java.lang.String command) { wrapperContained.sendChatCommand(command); }
// public static void sendChatCommand(java.lang.String command, ) { net.minecraft.client.network.ClientPlayNetworkHandler.sendChatCommand(command); }
public java.util.Collection getListedPlayerListEntries() { return wrapperContained.getListedPlayerListEntries(); }
// public static java.util.Collection getListedPlayerListEntries() { return net.minecraft.client.network.ClientPlayNetworkHandler.getListedPlayerListEntries(); }
public yarnwrap.client.network.ServerInfo getServerInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.getServerInfo()); }
// public static yarnwrap.client.network.ServerInfo getServerInfo() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ClientPlayNetworkHandler.getServerInfo()); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.client.network.ClientPlayNetworkHandler.getEnabledFeatures()); }
// public void sendAcknowledgment() { wrapperContained.sendAcknowledgment(); }
// public static void sendAcknowledgment() { net.minecraft.client.network.ClientPlayNetworkHandler.sendAcknowledgment(); }
// public boolean isSecureChatEnforced() { return wrapperContained.isSecureChatEnforced(); }
// public static boolean isSecureChatEnforced() { return net.minecraft.client.network.ClientPlayNetworkHandler.isSecureChatEnforced(); }
// public void updateKeyPair(yarnwrap.network.encryption.PlayerKeyPair keyPair) { wrapperContained.updateKeyPair(keyPair.wrapperContained); }
// public static void updateKeyPair(yarnwrap.network.encryption.PlayerKeyPair keyPair, ) { net.minecraft.client.network.ClientPlayNetworkHandler.updateKeyPair(keyPair.wrapperContained); }
public void unloadWorld() { wrapperContained.unloadWorld(); }
// public static void unloadWorld() { net.minecraft.client.network.ClientPlayNetworkHandler.unloadWorld(); }
public yarnwrap.network.ClientConnection getConnection() { return new yarnwrap.network.ClientConnection(wrapperContained.getConnection()); }
// public static yarnwrap.network.ClientConnection getConnection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.network.ClientPlayNetworkHandler.getConnection()); }
// public void unloadChunk(yarnwrap.network.packet.s2c.play.UnloadChunkS2CPacket packet) { wrapperContained.unloadChunk(packet.wrapperContained); }
// public static void unloadChunk(yarnwrap.network.packet.s2c.play.UnloadChunkS2CPacket packet, ) { net.minecraft.client.network.ClientPlayNetworkHandler.unloadChunk(packet.wrapperContained); }
// public void warnOnUnknownPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.warnOnUnknownPayload(payload.wrapperContained); }
// public static void warnOnUnknownPayload(yarnwrap.network.packet.CustomPayload payload, ) { net.minecraft.client.network.ClientPlayNetworkHandler.warnOnUnknownPayload(payload.wrapperContained); }
// public yarnwrap.entity.Entity createEntity(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet) { return new yarnwrap.entity.Entity(wrapperContained.createEntity(packet.wrapperContained)); }
// public static yarnwrap.entity.Entity createEntity(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet, ) { return new yarnwrap.entity.Entity(net.minecraft.client.network.ClientPlayNetworkHandler.createEntity(packet.wrapperContained)); }
// public void startWorldLoading(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.world.ClientWorld world,Object worldEntryReason) { wrapperContained.startWorldLoading(player.wrapperContained,world.wrapperContained,worldEntryReason); }
// public static void startWorldLoading(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.world.ClientWorld world,Object worldEntryReason, ) { net.minecraft.client.network.ClientPlayNetworkHandler.startWorldLoading(player.wrapperContained,world.wrapperContained,worldEntryReason); }
public void clearWorld() { wrapperContained.clearWorld(); }
// public static void clearWorld() { net.minecraft.client.network.ClientPlayNetworkHandler.clearWorld(); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
// public static yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.client.network.ClientPlayNetworkHandler.getScoreboard()); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
// public static yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.client.network.ClientPlayNetworkHandler.getBrewingRecipeRegistry()); }
// public Object getWorldEntryReason(boolean dead,yarnwrap.registry.RegistryKey from,yarnwrap.registry.RegistryKey to) { return wrapperContained.getWorldEntryReason(dead,from.wrapperContained,to.wrapperContained); }
// public static Object getWorldEntryReason(boolean dead,yarnwrap.registry.RegistryKey from,yarnwrap.registry.RegistryKey to, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.getWorldEntryReason(dead,from.wrapperContained,to.wrapperContained); }
public void refreshSearchManager() { wrapperContained.refreshSearchManager(); }
// public static void refreshSearchManager() { net.minecraft.client.network.ClientPlayNetworkHandler.refreshSearchManager(); }
public yarnwrap.client.search.SearchManager getSearchManager() { return new yarnwrap.client.search.SearchManager(wrapperContained.getSearchManager()); }
// public static yarnwrap.client.search.SearchManager getSearchManager() { return new yarnwrap.client.search.SearchManager(net.minecraft.client.network.ClientPlayNetworkHandler.getSearchManager()); }
public yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(wrapperContained.getFuelRegistry()); }
// public static yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(net.minecraft.client.network.ClientPlayNetworkHandler.getFuelRegistry()); }
// public Object startTagReload(yarnwrap.registry.RegistryKey registryRef,Object serialized) { return wrapperContained.startTagReload(registryRef.wrapperContained,serialized); }
// public static Object startTagReload(yarnwrap.registry.RegistryKey registryRef,Object serialized, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.startTagReload(registryRef.wrapperContained,serialized); }
public void syncOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions) { wrapperContained.syncOptions(syncedOptions.wrapperContained); }
// public static void syncOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions, ) { net.minecraft.client.network.ClientPlayNetworkHandler.syncOptions(syncedOptions.wrapperContained); }
// public void method_62150(boolean registryRef,java.util.List serialized) { wrapperContained.method_62150(registryRef,serialized); }
// public static void method_62150(boolean registryRef,java.util.List serialized, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_62150(registryRef,serialized); }
public void fetchProfileKey() { wrapperContained.fetchProfileKey(); }
// public static void fetchProfileKey() { net.minecraft.client.network.ClientPlayNetworkHandler.fetchProfileKey(); }
// public void method_64896(int id) { wrapperContained.method_64896(id); }
// public static void method_64896(int id, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_64896(id); }
// public boolean setPosition(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags,yarnwrap.entity.Entity entity) { return wrapperContained.setPosition(pos.wrapperContained,flags,entity.wrapperContained); }
// public static boolean setPosition(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags,yarnwrap.entity.Entity entity, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.setPosition(pos.wrapperContained,flags,entity.wrapperContained); }
// public void refreshRecipeBook(yarnwrap.client.recipebook.ClientRecipeBook recipeBook) { wrapperContained.refreshRecipeBook(recipeBook.wrapperContained); }
// public static void refreshRecipeBook(yarnwrap.client.recipebook.ClientRecipeBook recipeBook, ) { net.minecraft.client.network.ClientPlayNetworkHandler.refreshRecipeBook(recipeBook.wrapperContained); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
// public static yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(net.minecraft.client.network.ClientPlayNetworkHandler.getRecipeManager()); }
// public void clearCachedData() { wrapperContained.clearCachedData(); }
// public static void clearCachedData() { net.minecraft.client.network.ClientPlayNetworkHandler.clearCachedData(); }
public void registerForCleaning(yarnwrap.client.world.DataCache dataCache) { wrapperContained.registerForCleaning(dataCache.wrapperContained); }
// public static void registerForCleaning(yarnwrap.client.world.DataCache dataCache, ) { net.minecraft.client.network.ClientPlayNetworkHandler.registerForCleaning(dataCache.wrapperContained); }
// public Object getComponentHasher() { return wrapperContained.getComponentHasher(); }
// public static Object getComponentHasher() { return net.minecraft.client.network.ClientPlayNetworkHandler.getComponentHasher(); }
// public java.lang.Integer method_68824(yarnwrap.registry.RegistryOps component) { return wrapperContained.method_68824(component.wrapperContained); }
// public static java.lang.Integer method_68824(yarnwrap.registry.RegistryOps component, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.method_68824(component.wrapperContained); }
// public java.lang.IllegalArgumentException method_68825(yarnwrap.component.Component error) { return wrapperContained.method_68825(error.wrapperContained); }
// public static java.lang.IllegalArgumentException method_68825(yarnwrap.component.Component error, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.method_68825(error.wrapperContained); }
// public yarnwrap.client.world.ClientWaypointHandler getWaypointHandler() { return new yarnwrap.client.world.ClientWaypointHandler(wrapperContained.getWaypointHandler()); }
// public static yarnwrap.client.world.ClientWaypointHandler getWaypointHandler() { return new yarnwrap.client.world.ClientWaypointHandler(net.minecraft.client.network.ClientPlayNetworkHandler.getWaypointHandler()); }
// public boolean validate(com.mojang.brigadier.ParseResults parseResults) { return wrapperContained.validate(parseResults); }
// public static boolean validate(com.mojang.brigadier.ParseResults parseResults, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.validate(parseResults); }
// public void openConfirmCommandScreen(java.lang.String command,java.lang.String message) { wrapperContained.openConfirmCommandScreen(command,message); }
// public static void openConfirmCommandScreen(java.lang.String command,java.lang.String message, ) { net.minecraft.client.network.ClientPlayNetworkHandler.openConfirmCommandScreen(command,message); }
// public void runClickEventCommand(java.lang.String command) { wrapperContained.runClickEventCommand(command); }
// public static void runClickEventCommand(java.lang.String command, ) { net.minecraft.client.network.ClientPlayNetworkHandler.runClickEventCommand(command); }
// public void method_71928(java.lang.String confirmed) { wrapperContained.method_71928(confirmed); }
// public static void method_71928(java.lang.String confirmed, ) { net.minecraft.client.network.ClientPlayNetworkHandler.method_71928(confirmed); }
// public Object parseCommand(java.lang.String command) { return wrapperContained.parseCommand(command); }
// public static Object parseCommand(java.lang.String command, ) { return net.minecraft.client.network.ClientPlayNetworkHandler.parseCommand(command); }

}