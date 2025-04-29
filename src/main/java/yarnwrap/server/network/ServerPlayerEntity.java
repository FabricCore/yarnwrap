package yarnwrap.server.network;
public class ServerPlayerEntity { public net.minecraft.server.network.ServerPlayerEntity wrapperContained; public ServerPlayerEntity(net.minecraft.server.network.ServerPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float lastHealthScore() { return wrapperContained.lastHealthScore; }
// public void lastHealthScore(float value) { wrapperContained.lastHealthScore = value; }
// public static float lastHealthScore() { return net.minecraft.server.network.ServerPlayerEntity.lastHealthScore; }
// public static void lastHealthScore(float value, ) { net.minecraft.server.network.ServerPlayerEntity.lastHealthScore = value; }

// public boolean disconnected() { return wrapperContained.disconnected; }
// public void disconnected(boolean value) { wrapperContained.disconnected = value; }
// public static boolean disconnected() { return net.minecraft.server.network.ServerPlayerEntity.disconnected; }
// public static void disconnected(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.disconnected = value; }

// public int lastLevelScore() { return wrapperContained.lastLevelScore; }
// public void lastLevelScore(int value) { wrapperContained.lastLevelScore = value; }
// public static int lastLevelScore() { return net.minecraft.server.network.ServerPlayerEntity.lastLevelScore; }
// public static void lastLevelScore(int value, ) { net.minecraft.server.network.ServerPlayerEntity.lastLevelScore = value; }

// public yarnwrap.stat.ServerStatHandler statHandler() { return new yarnwrap.stat.ServerStatHandler(wrapperContained.statHandler); }
// public void statHandler(yarnwrap.stat.ServerStatHandler value) { wrapperContained.statHandler = value.wrapperContained; }
// public static yarnwrap.stat.ServerStatHandler statHandler() { return new yarnwrap.stat.ServerStatHandler(net.minecraft.server.network.ServerPlayerEntity.statHandler); }
// public static void statHandler(yarnwrap.stat.ServerStatHandler value, ) { net.minecraft.server.network.ServerPlayerEntity.statHandler = value.wrapperContained; }

// public int lastAirScore() { return wrapperContained.lastAirScore; }
// public void lastAirScore(int value) { wrapperContained.lastAirScore = value; }
// public static int lastAirScore() { return net.minecraft.server.network.ServerPlayerEntity.lastAirScore; }
// public static void lastAirScore(int value, ) { net.minecraft.server.network.ServerPlayerEntity.lastAirScore = value; }

public boolean seenCredits() { return wrapperContained.seenCredits; }
public void seenCredits(boolean value) { wrapperContained.seenCredits = value; }
// public static boolean seenCredits() { return net.minecraft.server.network.ServerPlayerEntity.seenCredits; }
// public static void seenCredits(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.seenCredits = value; }

// public yarnwrap.advancement.PlayerAdvancementTracker advancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.advancementTracker); }
// public void advancementTracker(yarnwrap.advancement.PlayerAdvancementTracker value) { wrapperContained.advancementTracker = value.wrapperContained; }
// public static yarnwrap.advancement.PlayerAdvancementTracker advancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(net.minecraft.server.network.ServerPlayerEntity.advancementTracker); }
// public static void advancementTracker(yarnwrap.advancement.PlayerAdvancementTracker value, ) { net.minecraft.server.network.ServerPlayerEntity.advancementTracker = value.wrapperContained; }

// public boolean clientChatColorsEnabled() { return wrapperContained.clientChatColorsEnabled; }
// public void clientChatColorsEnabled(boolean value) { wrapperContained.clientChatColorsEnabled = value; }
// public static boolean clientChatColorsEnabled() { return net.minecraft.server.network.ServerPlayerEntity.clientChatColorsEnabled; }
// public static void clientChatColorsEnabled(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.clientChatColorsEnabled = value; }

// public boolean syncedSaturationIsZero() { return wrapperContained.syncedSaturationIsZero; }
// public void syncedSaturationIsZero(boolean value) { wrapperContained.syncedSaturationIsZero = value; }
// public static boolean syncedSaturationIsZero() { return net.minecraft.server.network.ServerPlayerEntity.syncedSaturationIsZero; }
// public static void syncedSaturationIsZero(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.syncedSaturationIsZero = value; }

// public int levitationStartTick() { return wrapperContained.levitationStartTick; }
// public void levitationStartTick(int value) { wrapperContained.levitationStartTick = value; }
// public static int levitationStartTick() { return net.minecraft.server.network.ServerPlayerEntity.levitationStartTick; }
// public static void levitationStartTick(int value, ) { net.minecraft.server.network.ServerPlayerEntity.levitationStartTick = value; }

public yarnwrap.server.network.ServerPlayerInteractionManager interactionManager() { return new yarnwrap.server.network.ServerPlayerInteractionManager(wrapperContained.interactionManager); }
// public void interactionManager(yarnwrap.server.network.ServerPlayerInteractionManager value) { wrapperContained.interactionManager = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerInteractionManager interactionManager() { return new yarnwrap.server.network.ServerPlayerInteractionManager(net.minecraft.server.network.ServerPlayerEntity.interactionManager); }
// public static void interactionManager(yarnwrap.server.network.ServerPlayerInteractionManager value, ) { net.minecraft.server.network.ServerPlayerEntity.interactionManager = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerPlayerEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerPlayerEntity.LOGGER = value; }

// public long lastActionTime() { return wrapperContained.lastActionTime; }
// public void lastActionTime(long value) { wrapperContained.lastActionTime = value; }
// public static long lastActionTime() { return net.minecraft.server.network.ServerPlayerEntity.lastActionTime; }
// public static void lastActionTime(long value, ) { net.minecraft.server.network.ServerPlayerEntity.lastActionTime = value; }

// public int syncedExperience() { return wrapperContained.syncedExperience; }
// public void syncedExperience(int value) { wrapperContained.syncedExperience = value; }
// public static int syncedExperience() { return net.minecraft.server.network.ServerPlayerEntity.syncedExperience; }
// public static void syncedExperience(int value, ) { net.minecraft.server.network.ServerPlayerEntity.syncedExperience = value; }

// public int syncedFoodLevel() { return wrapperContained.syncedFoodLevel; }
// public void syncedFoodLevel(int value) { wrapperContained.syncedFoodLevel = value; }
// public static int syncedFoodLevel() { return net.minecraft.server.network.ServerPlayerEntity.syncedFoodLevel; }
// public static void syncedFoodLevel(int value, ) { net.minecraft.server.network.ServerPlayerEntity.syncedFoodLevel = value; }

// public int lastExperienceScore() { return wrapperContained.lastExperienceScore; }
// public void lastExperienceScore(int value) { wrapperContained.lastExperienceScore = value; }
// public static int lastExperienceScore() { return net.minecraft.server.network.ServerPlayerEntity.lastExperienceScore; }
// public static void lastExperienceScore(int value, ) { net.minecraft.server.network.ServerPlayerEntity.lastExperienceScore = value; }

// public int lastArmorScore() { return wrapperContained.lastArmorScore; }
// public void lastArmorScore(int value) { wrapperContained.lastArmorScore = value; }
// public static int lastArmorScore() { return net.minecraft.server.network.ServerPlayerEntity.lastArmorScore; }
// public static void lastArmorScore(int value, ) { net.minecraft.server.network.ServerPlayerEntity.lastArmorScore = value; }

// public int lastFoodScore() { return wrapperContained.lastFoodScore; }
// public void lastFoodScore(int value) { wrapperContained.lastFoodScore = value; }
// public static int lastFoodScore() { return net.minecraft.server.network.ServerPlayerEntity.lastFoodScore; }
// public static void lastFoodScore(int value, ) { net.minecraft.server.network.ServerPlayerEntity.lastFoodScore = value; }

// public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
// public void cameraEntity(yarnwrap.entity.Entity value) { wrapperContained.cameraEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(net.minecraft.server.network.ServerPlayerEntity.cameraEntity); }
// public static void cameraEntity(yarnwrap.entity.Entity value, ) { net.minecraft.server.network.ServerPlayerEntity.cameraEntity = value.wrapperContained; }

// public boolean inTeleportationState() { return wrapperContained.inTeleportationState; }
// public void inTeleportationState(boolean value) { wrapperContained.inTeleportationState = value; }
// public static boolean inTeleportationState() { return net.minecraft.server.network.ServerPlayerEntity.inTeleportationState; }
// public static void inTeleportationState(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.inTeleportationState = value; }

// public int screenHandlerSyncId() { return wrapperContained.screenHandlerSyncId; }
// public void screenHandlerSyncId(int value) { wrapperContained.screenHandlerSyncId = value; }
// public static int screenHandlerSyncId() { return net.minecraft.server.network.ServerPlayerEntity.screenHandlerSyncId; }
// public static void screenHandlerSyncId(int value, ) { net.minecraft.server.network.ServerPlayerEntity.screenHandlerSyncId = value; }

public yarnwrap.server.network.ServerPlayNetworkHandler networkHandler() { return new yarnwrap.server.network.ServerPlayNetworkHandler(wrapperContained.networkHandler); }
public void networkHandler(yarnwrap.server.network.ServerPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayNetworkHandler networkHandler() { return new yarnwrap.server.network.ServerPlayNetworkHandler(net.minecraft.server.network.ServerPlayerEntity.networkHandler); }
// public static void networkHandler(yarnwrap.server.network.ServerPlayNetworkHandler value, ) { net.minecraft.server.network.ServerPlayerEntity.networkHandler = value.wrapperContained; }

public boolean notInAnyWorld() { return wrapperContained.notInAnyWorld; }
public void notInAnyWorld(boolean value) { wrapperContained.notInAnyWorld = value; }
// public static boolean notInAnyWorld() { return net.minecraft.server.network.ServerPlayerEntity.notInAnyWorld; }
// public static void notInAnyWorld(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.notInAnyWorld = value; }

// public yarnwrap.util.math.ChunkSectionPos watchedSection() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.watchedSection); }
// public void watchedSection(yarnwrap.util.math.ChunkSectionPos value) { wrapperContained.watchedSection = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkSectionPos watchedSection() { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.server.network.ServerPlayerEntity.watchedSection); }
// public static void watchedSection(yarnwrap.util.math.ChunkSectionPos value, ) { net.minecraft.server.network.ServerPlayerEntity.watchedSection = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d levitationStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.levitationStartPos); }
// public void levitationStartPos(yarnwrap.util.math.Vec3d value) { wrapperContained.levitationStartPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d levitationStartPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayerEntity.levitationStartPos); }
// public static void levitationStartPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayerEntity.levitationStartPos = value.wrapperContained; }

// public yarnwrap.network.message.ChatVisibility clientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(wrapperContained.clientChatVisibility); }
// public void clientChatVisibility(yarnwrap.network.message.ChatVisibility value) { wrapperContained.clientChatVisibility = value.wrapperContained; }
// public static yarnwrap.network.message.ChatVisibility clientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(net.minecraft.server.network.ServerPlayerEntity.clientChatVisibility); }
// public static void clientChatVisibility(yarnwrap.network.message.ChatVisibility value, ) { net.minecraft.server.network.ServerPlayerEntity.clientChatVisibility = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d enteredNetherPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.enteredNetherPos); }
// public void enteredNetherPos(yarnwrap.util.math.Vec3d value) { wrapperContained.enteredNetherPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d enteredNetherPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayerEntity.enteredNetherPos); }
// public static void enteredNetherPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayerEntity.enteredNetherPos = value.wrapperContained; }

public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.network.ServerPlayerEntity.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.network.ServerPlayerEntity.server = value.wrapperContained; }

// public yarnwrap.server.network.ServerRecipeBook recipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.server.network.ServerRecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
// public static yarnwrap.server.network.ServerRecipeBook recipeBook() { return new yarnwrap.server.network.ServerRecipeBook(net.minecraft.server.network.ServerPlayerEntity.recipeBook); }
// public static void recipeBook(yarnwrap.server.network.ServerRecipeBook value, ) { net.minecraft.server.network.ServerPlayerEntity.recipeBook = value.wrapperContained; }

// public float syncedHealth() { return wrapperContained.syncedHealth; }
// public void syncedHealth(float value) { wrapperContained.syncedHealth = value; }
// public static float syncedHealth() { return net.minecraft.server.network.ServerPlayerEntity.syncedHealth; }
// public static void syncedHealth(float value, ) { net.minecraft.server.network.ServerPlayerEntity.syncedHealth = value; }

// public int joinInvulnerabilityTicks() { return wrapperContained.joinInvulnerabilityTicks; }
// public void joinInvulnerabilityTicks(int value) { wrapperContained.joinInvulnerabilityTicks = value; }
// public static int joinInvulnerabilityTicks() { return net.minecraft.server.network.ServerPlayerEntity.joinInvulnerabilityTicks; }
// public static void joinInvulnerabilityTicks(int value, ) { net.minecraft.server.network.ServerPlayerEntity.joinInvulnerabilityTicks = value; }

// public yarnwrap.registry.RegistryKey spawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.spawnPointDimension); }
// public void spawnPointDimension(yarnwrap.registry.RegistryKey value) { wrapperContained.spawnPointDimension = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey spawnPointDimension() { return new yarnwrap.registry.RegistryKey(net.minecraft.server.network.ServerPlayerEntity.spawnPointDimension); }
// public static void spawnPointDimension(yarnwrap.registry.RegistryKey value, ) { net.minecraft.server.network.ServerPlayerEntity.spawnPointDimension = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos spawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.spawnPointPosition); }
// public void spawnPointPosition(yarnwrap.util.math.BlockPos value) { wrapperContained.spawnPointPosition = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos spawnPointPosition() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerEntity.spawnPointPosition); }
// public static void spawnPointPosition(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.network.ServerPlayerEntity.spawnPointPosition = value.wrapperContained; }

// public boolean spawnForced() { return wrapperContained.spawnForced; }
// public void spawnForced(boolean value) { wrapperContained.spawnForced = value; }
// public static boolean spawnForced() { return net.minecraft.server.network.ServerPlayerEntity.spawnForced; }
// public static void spawnForced(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.spawnForced = value; }

// public float spawnAngle() { return wrapperContained.spawnAngle; }
// public void spawnAngle(float value) { wrapperContained.spawnAngle = value; }
// public static float spawnAngle() { return net.minecraft.server.network.ServerPlayerEntity.spawnAngle; }
// public static void spawnAngle(float value, ) { net.minecraft.server.network.ServerPlayerEntity.spawnAngle = value; }

// public yarnwrap.server.filter.TextStream textStream() { return new yarnwrap.server.filter.TextStream(wrapperContained.textStream); }
// public void textStream(yarnwrap.server.filter.TextStream value) { wrapperContained.textStream = value.wrapperContained; }
// public static yarnwrap.server.filter.TextStream textStream() { return new yarnwrap.server.filter.TextStream(net.minecraft.server.network.ServerPlayerEntity.textStream); }
// public static void textStream(yarnwrap.server.filter.TextStream value, ) { net.minecraft.server.network.ServerPlayerEntity.textStream = value.wrapperContained; }

// public boolean filterText() { return wrapperContained.filterText; }
// public void filterText(boolean value) { wrapperContained.filterText = value; }
// public static boolean filterText() { return net.minecraft.server.network.ServerPlayerEntity.filterText; }
// public static void filterText(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.filterText = value; }

// public yarnwrap.screen.ScreenHandlerSyncHandler screenHandlerSyncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(wrapperContained.screenHandlerSyncHandler); }
// public void screenHandlerSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value) { wrapperContained.screenHandlerSyncHandler = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerSyncHandler screenHandlerSyncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(net.minecraft.server.network.ServerPlayerEntity.screenHandlerSyncHandler); }
// public static void screenHandlerSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value, ) { net.minecraft.server.network.ServerPlayerEntity.screenHandlerSyncHandler = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerListener screenHandlerListener() { return new yarnwrap.screen.ScreenHandlerListener(wrapperContained.screenHandlerListener); }
// public void screenHandlerListener(yarnwrap.screen.ScreenHandlerListener value) { wrapperContained.screenHandlerListener = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerListener screenHandlerListener() { return new yarnwrap.screen.ScreenHandlerListener(net.minecraft.server.network.ServerPlayerEntity.screenHandlerListener); }
// public static void screenHandlerListener(yarnwrap.screen.ScreenHandlerListener value, ) { net.minecraft.server.network.ServerPlayerEntity.screenHandlerListener = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d fallStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.fallStartPos); }
// public void fallStartPos(yarnwrap.util.math.Vec3d value) { wrapperContained.fallStartPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d fallStartPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayerEntity.fallStartPos); }
// public static void fallStartPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayerEntity.fallStartPos = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d vehicleInLavaRidingPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.vehicleInLavaRidingPos); }
// public void vehicleInLavaRidingPos(yarnwrap.util.math.Vec3d value) { wrapperContained.vehicleInLavaRidingPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d vehicleInLavaRidingPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayerEntity.vehicleInLavaRidingPos); }
// public static void vehicleInLavaRidingPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayerEntity.vehicleInLavaRidingPos = value.wrapperContained; }

// public boolean allowServerListing() { return wrapperContained.allowServerListing; }
// public void allowServerListing(boolean value) { wrapperContained.allowServerListing = value; }
// public static boolean allowServerListing() { return net.minecraft.server.network.ServerPlayerEntity.allowServerListing; }
// public static void allowServerListing(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.allowServerListing = value; }

// public yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager() { return new yarnwrap.block.entity.SculkShriekerWarningManager(wrapperContained.sculkShriekerWarningManager); }
// public void sculkShriekerWarningManager(yarnwrap.block.entity.SculkShriekerWarningManager value) { wrapperContained.sculkShriekerWarningManager = value.wrapperContained; }
// public static yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager() { return new yarnwrap.block.entity.SculkShriekerWarningManager(net.minecraft.server.network.ServerPlayerEntity.sculkShriekerWarningManager); }
// public static void sculkShriekerWarningManager(yarnwrap.block.entity.SculkShriekerWarningManager value, ) { net.minecraft.server.network.ServerPlayerEntity.sculkShriekerWarningManager = value.wrapperContained; }

// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.PublicPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(net.minecraft.server.network.ServerPlayerEntity.session); }
// public static void session(yarnwrap.network.encryption.PublicPlayerSession value, ) { net.minecraft.server.network.ServerPlayerEntity.session = value.wrapperContained; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.server.network.ServerPlayerEntity.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.server.network.ServerPlayerEntity.viewDistance = value; }

// public yarnwrap.server.network.ChunkFilter chunkFilter() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.chunkFilter); }
// public void chunkFilter(yarnwrap.server.network.ChunkFilter value) { wrapperContained.chunkFilter = value.wrapperContained; }
// public static yarnwrap.server.network.ChunkFilter chunkFilter() { return new yarnwrap.server.network.ChunkFilter(net.minecraft.server.network.ServerPlayerEntity.chunkFilter); }
// public static void chunkFilter(yarnwrap.server.network.ChunkFilter value, ) { net.minecraft.server.network.ServerPlayerEntity.chunkFilter = value.wrapperContained; }

// public java.lang.String language() { return wrapperContained.language; }
// public void language(java.lang.String value) { wrapperContained.language = value; }
// public static java.lang.String language() { return net.minecraft.server.network.ServerPlayerEntity.language; }
// public static void language(java.lang.String value, ) { net.minecraft.server.network.ServerPlayerEntity.language = value; }

// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER); }
// public void CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }
// public static yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.server.network.ServerPlayerEntity.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER); }
// public static void CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value, ) { net.minecraft.server.network.ServerPlayerEntity.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }

// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER); }
// public void CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }
// public static yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.server.network.ServerPlayerEntity.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER); }
// public static void CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value, ) { net.minecraft.server.network.ServerPlayerEntity.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }

// public boolean spawnExtraParticlesOnFall() { return wrapperContained.spawnExtraParticlesOnFall; }
// public void spawnExtraParticlesOnFall(boolean value) { wrapperContained.spawnExtraParticlesOnFall = value; }
// public static boolean spawnExtraParticlesOnFall() { return net.minecraft.server.network.ServerPlayerEntity.spawnExtraParticlesOnFall; }
// public static void spawnExtraParticlesOnFall(boolean value, ) { net.minecraft.server.network.ServerPlayerEntity.spawnExtraParticlesOnFall = value; }

// public yarnwrap.util.math.BlockPos startRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.startRaidPos); }
// public void startRaidPos(yarnwrap.util.math.BlockPos value) { wrapperContained.startRaidPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos startRaidPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerEntity.startRaidPos); }
// public static void startRaidPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.network.ServerPlayerEntity.startRaidPos = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d movement() { return new yarnwrap.util.math.Vec3d(wrapperContained.movement); }
// public void movement(yarnwrap.util.math.Vec3d value) { wrapperContained.movement = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d movement() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayerEntity.movement); }
// public static void movement(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayerEntity.movement = value.wrapperContained; }

public ServerPlayerEntity(yarnwrap.server.MinecraftServer server,yarnwrap.server.world.ServerWorld world,com.mojang.authlib.GameProfile profile,yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions) { this.wrapperContained = new net.minecraft.server.network.ServerPlayerEntity(server.wrapperContained,world.wrapperContained,profile,clientOptions.wrapperContained); }
public void copyFrom(yarnwrap.server.network.ServerPlayerEntity oldPlayer,boolean alive) { wrapperContained.copyFrom(oldPlayer.wrapperContained,alive); }
// public static void copyFrom(yarnwrap.server.network.ServerPlayerEntity oldPlayer,boolean alive, ) { net.minecraft.server.network.ServerPlayerEntity.copyFrom(oldPlayer.wrapperContained,alive); }
public yarnwrap.text.Text getPlayerListName() { return new yarnwrap.text.Text(wrapperContained.getPlayerListName()); }
// public static yarnwrap.text.Text getPlayerListName() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerPlayerEntity.getPlayerListName()); }
public void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround) { wrapperContained.handleFall(xDifference,yDifference,zDifference,onGround); }
// public static void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround, ) { net.minecraft.server.network.ServerPlayerEntity.handleFall(xDifference,yDifference,zDifference,onGround); }
public boolean isInTeleportationState() { return wrapperContained.isInTeleportationState(); }
// public static boolean isInTeleportationState() { return net.minecraft.server.network.ServerPlayerEntity.isInTeleportationState(); }
public java.lang.String getIp() { return wrapperContained.getIp(); }
// public static java.lang.String getIp() { return net.minecraft.server.network.ServerPlayerEntity.getIp(); }
// public yarnwrap.text.Style method_14210(yarnwrap.text.Text style) { return new yarnwrap.text.Style(wrapperContained.method_14210(style.wrapperContained)); }
// public static yarnwrap.text.Style method_14210(yarnwrap.text.Text style, ) { return new yarnwrap.text.Style(net.minecraft.server.network.ServerPlayerEntity.method_14210(style.wrapperContained)); }
// public void updateScores(yarnwrap.scoreboard.ScoreboardCriterion criterion,int score) { wrapperContained.updateScores(criterion.wrapperContained,score); }
// public static void updateScores(yarnwrap.scoreboard.ScoreboardCriterion criterion,int score, ) { net.minecraft.server.network.ServerPlayerEntity.updateScores(criterion.wrapperContained,score); }
public void setClientOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions) { wrapperContained.setClientOptions(clientOptions.wrapperContained); }
// public static void setClientOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions, ) { net.minecraft.server.network.ServerPlayerEntity.setClientOptions(clientOptions.wrapperContained); }
public void markHealthDirty() { wrapperContained.markHealthDirty(); }
// public static void markHealthDirty() { net.minecraft.server.network.ServerPlayerEntity.markHealthDirty(); }
public void updateInput(float sidewaysSpeed,float forwardSpeed,boolean jumping,boolean sneaking) { wrapperContained.updateInput(sidewaysSpeed,forwardSpeed,jumping,sneaking); }
// public static void updateInput(float sidewaysSpeed,float forwardSpeed,boolean jumping,boolean sneaking, ) { net.minecraft.server.network.ServerPlayerEntity.updateInput(sidewaysSpeed,forwardSpeed,jumping,sneaking); }
public long getLastActionTime() { return wrapperContained.getLastActionTime(); }
// public static long getLastActionTime() { return net.minecraft.server.network.ServerPlayerEntity.getLastActionTime(); }
// public void method_14221(int score) { wrapperContained.method_14221(score); }
// public static void method_14221(int score, ) { net.minecraft.server.network.ServerPlayerEntity.method_14221(score); }
// public void lookAtEntity(Object anchorPoint,yarnwrap.entity.Entity targetEntity,Object targetAnchor) { wrapperContained.lookAtEntity(anchorPoint,targetEntity.wrapperContained,targetAnchor); }
// public static void lookAtEntity(Object anchorPoint,yarnwrap.entity.Entity targetEntity,Object targetAnchor, ) { net.minecraft.server.network.ServerPlayerEntity.lookAtEntity(anchorPoint,targetEntity.wrapperContained,targetAnchor); }
public void setCameraEntity(yarnwrap.entity.Entity entity) { wrapperContained.setCameraEntity(entity.wrapperContained); }
// public static void setCameraEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.network.ServerPlayerEntity.setCameraEntity(entity.wrapperContained); }
public void playerTick() { wrapperContained.playerTick(); }
// public static void playerTick() { net.minecraft.server.network.ServerPlayerEntity.playerTick(); }
// public void updateScoreboardScore(yarnwrap.scoreboard.ScoreHolder targetScoreHolder,yarnwrap.scoreboard.ScoreHolder aboutScoreHolder,net.minecraft.scoreboard.ScoreboardCriterion[] criterions) { wrapperContained.updateScoreboardScore(targetScoreHolder.wrapperContained,aboutScoreHolder.wrapperContained,criterions); }
// public static void updateScoreboardScore(yarnwrap.scoreboard.ScoreHolder targetScoreHolder,yarnwrap.scoreboard.ScoreHolder aboutScoreHolder,net.minecraft.scoreboard.ScoreboardCriterion[] criterions, ) { net.minecraft.server.network.ServerPlayerEntity.updateScoreboardScore(targetScoreHolder.wrapperContained,aboutScoreHolder.wrapperContained,criterions); }
public void setExperiencePoints(int points) { wrapperContained.setExperiencePoints(points); }
// public static void setExperiencePoints(int points, ) { net.minecraft.server.network.ServerPlayerEntity.setExperiencePoints(points); }
// public boolean isPvpEnabled() { return wrapperContained.isPvpEnabled(); }
// public static boolean isPvpEnabled() { return net.minecraft.server.network.ServerPlayerEntity.isPvpEnabled(); }
public void onDisconnect() { wrapperContained.onDisconnect(); }
// public static void onDisconnect() { net.minecraft.server.network.ServerPlayerEntity.onDisconnect(); }
public yarnwrap.util.math.ChunkSectionPos getWatchedSection() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.getWatchedSection()); }
// public static yarnwrap.util.math.ChunkSectionPos getWatchedSection() { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.server.network.ServerPlayerEntity.getWatchedSection()); }
public void updateLastActionTime() { wrapperContained.updateLastActionTime(); }
// public static void updateLastActionTime() { net.minecraft.server.network.ServerPlayerEntity.updateLastActionTime(); }
// public void onScreenHandlerOpened(yarnwrap.screen.ScreenHandler screenHandler) { wrapperContained.onScreenHandlerOpened(screenHandler.wrapperContained); }
// public static void onScreenHandlerOpened(yarnwrap.screen.ScreenHandler screenHandler, ) { net.minecraft.server.network.ServerPlayerEntity.onScreenHandlerOpened(screenHandler.wrapperContained); }
public yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.getAdvancementTracker()); }
// public static yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(net.minecraft.server.network.ServerPlayerEntity.getAdvancementTracker()); }
// public void incrementScreenHandlerSyncId() { wrapperContained.incrementScreenHandlerSyncId(); }
// public static void incrementScreenHandlerSyncId() { net.minecraft.server.network.ServerPlayerEntity.incrementScreenHandlerSyncId(); }
public yarnwrap.network.message.ChatVisibility getClientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(wrapperContained.getClientChatVisibility()); }
// public static yarnwrap.network.message.ChatVisibility getClientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(net.minecraft.server.network.ServerPlayerEntity.getClientChatVisibility()); }
public boolean isDisconnected() { return wrapperContained.isDisconnected(); }
// public static boolean isDisconnected() { return net.minecraft.server.network.ServerPlayerEntity.isDisconnected(); }
public void onTeleportationDone() { wrapperContained.onTeleportationDone(); }
// public static void onTeleportationDone() { net.minecraft.server.network.ServerPlayerEntity.onTeleportationDone(); }
public yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.getCameraEntity()); }
// public static yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(net.minecraft.server.network.ServerPlayerEntity.getCameraEntity()); }
// public int calculateSpawnOffsetMultiplier(int horizontalSpawnArea) { return wrapperContained.calculateSpawnOffsetMultiplier(horizontalSpawnArea); }
// public static int calculateSpawnOffsetMultiplier(int horizontalSpawnArea, ) { return net.minecraft.server.network.ServerPlayerEntity.calculateSpawnOffsetMultiplier(horizontalSpawnArea); }
public yarnwrap.stat.ServerStatHandler getStatHandler() { return new yarnwrap.stat.ServerStatHandler(wrapperContained.getStatHandler()); }
// public static yarnwrap.stat.ServerStatHandler getStatHandler() { return new yarnwrap.stat.ServerStatHandler(net.minecraft.server.network.ServerPlayerEntity.getStatHandler()); }
// public void method_14250(int innerScore) { wrapperContained.method_14250(innerScore); }
// public static void method_14250(int innerScore, ) { net.minecraft.server.network.ServerPlayerEntity.method_14250(innerScore); }
public void teleport(yarnwrap.server.world.ServerWorld targetWorld,double x,double y,double z,float yaw,float pitch) { wrapperContained.teleport(targetWorld.wrapperContained,x,y,z,yaw,pitch); }
// public static void teleport(yarnwrap.server.world.ServerWorld targetWorld,double x,double y,double z,float yaw,float pitch, ) { net.minecraft.server.network.ServerPlayerEntity.teleport(targetWorld.wrapperContained,x,y,z,yaw,pitch); }
public void setExperienceLevel(int level) { wrapperContained.setExperienceLevel(level); }
// public static void setExperienceLevel(int level, ) { net.minecraft.server.network.ServerPlayerEntity.setExperienceLevel(level); }
public yarnwrap.server.network.ServerRecipeBook getRecipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.getRecipeBook()); }
// public static yarnwrap.server.network.ServerRecipeBook getRecipeBook() { return new yarnwrap.server.network.ServerRecipeBook(net.minecraft.server.network.ServerPlayerEntity.getRecipeBook()); }
public void setWatchedSection(yarnwrap.util.math.ChunkSectionPos section) { wrapperContained.setWatchedSection(section.wrapperContained); }
// public static void setWatchedSection(yarnwrap.util.math.ChunkSectionPos section, ) { net.minecraft.server.network.ServerPlayerEntity.setWatchedSection(section.wrapperContained); }
// public void worldChanged(yarnwrap.server.world.ServerWorld origin) { wrapperContained.worldChanged(origin.wrapperContained); }
// public static void worldChanged(yarnwrap.server.world.ServerWorld origin, ) { net.minecraft.server.network.ServerPlayerEntity.worldChanged(origin.wrapperContained); }
// public void method_19504(yarnwrap.util.Unit unit) { wrapperContained.method_19504(unit.wrapperContained); }
// public static void method_19504(yarnwrap.util.Unit unit, ) { net.minecraft.server.network.ServerPlayerEntity.method_19504(unit.wrapperContained); }
public yarnwrap.util.math.BlockPos getSpawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPointPosition()); }
// public static yarnwrap.util.math.BlockPos getSpawnPointPosition() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerEntity.getSpawnPointPosition()); }
public yarnwrap.registry.RegistryKey getSpawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.getSpawnPointDimension()); }
// public static yarnwrap.registry.RegistryKey getSpawnPointDimension() { return new yarnwrap.registry.RegistryKey(net.minecraft.server.network.ServerPlayerEntity.getSpawnPointDimension()); }
public boolean isSpawnForced() { return wrapperContained.isSpawnForced(); }
// public static boolean isSpawnForced() { return net.minecraft.server.network.ServerPlayerEntity.isSpawnForced(); }
// public boolean method_26283(yarnwrap.entity.mob.HostileEntity entity) { return wrapperContained.method_26283(entity.wrapperContained); }
// public static boolean method_26283(yarnwrap.entity.mob.HostileEntity entity, ) { return net.minecraft.server.network.ServerPlayerEntity.method_26283(entity.wrapperContained); }
public void setSpawnPoint(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos,float angle,boolean forced,boolean sendMessage) { wrapperContained.setSpawnPoint(dimension.wrapperContained,pos.wrapperContained,angle,forced,sendMessage); }
// public static void setSpawnPoint(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos,float angle,boolean forced,boolean sendMessage, ) { net.minecraft.server.network.ServerPlayerEntity.setSpawnPoint(dimension.wrapperContained,pos.wrapperContained,angle,forced,sendMessage); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedWithinRange(pos.wrapperContained,direction.wrapperContained); }
// public static boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.server.network.ServerPlayerEntity.isBedWithinRange(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedObstructed(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedObstructed(pos.wrapperContained,direction.wrapperContained); }
// public static boolean isBedObstructed(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.server.network.ServerPlayerEntity.isBedObstructed(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isBedWithinRange(pos.wrapperContained); }
// public static boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.network.ServerPlayerEntity.isBedWithinRange(pos.wrapperContained); }
// public void method_29205(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_29205(encoded.wrapperContained); }
// public static void method_29205(yarnwrap.nbt.NbtCompound encoded, ) { net.minecraft.server.network.ServerPlayerEntity.method_29205(encoded.wrapperContained); }
// public void method_29777(yarnwrap.entity.mob.MobEntity entity) { wrapperContained.method_29777(entity.wrapperContained); }
// public static void method_29777(yarnwrap.entity.mob.MobEntity entity, ) { net.minecraft.server.network.ServerPlayerEntity.method_29777(entity.wrapperContained); }
// public boolean method_29778(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_29778(entity.wrapperContained); }
// public static boolean method_29778(yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.server.network.ServerPlayerEntity.method_29778(entity.wrapperContained); }
// public void forgiveMobAnger() { wrapperContained.forgiveMobAnger(); }
// public static void forgiveMobAnger() { net.minecraft.server.network.ServerPlayerEntity.forgiveMobAnger(); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
// public static float getSpawnAngle() { return net.minecraft.server.network.ServerPlayerEntity.getSpawnAngle(); }
public yarnwrap.server.filter.TextStream getTextStream() { return new yarnwrap.server.filter.TextStream(wrapperContained.getTextStream()); }
// public static yarnwrap.server.filter.TextStream getTextStream() { return new yarnwrap.server.filter.TextStream(net.minecraft.server.network.ServerPlayerEntity.getTextStream()); }
// public yarnwrap.world.GameMode gameModeFromNbt(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return new yarnwrap.world.GameMode(wrapperContained.gameModeFromNbt(nbt.wrapperContained,key)); }
// public static yarnwrap.world.GameMode gameModeFromNbt(yarnwrap.nbt.NbtCompound nbt,java.lang.String key, ) { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerEntity.gameModeFromNbt(nbt.wrapperContained,key)); }
// public yarnwrap.world.GameMode getServerGameMode(yarnwrap.world.GameMode backupGameMode) { return new yarnwrap.world.GameMode(wrapperContained.getServerGameMode(backupGameMode.wrapperContained)); }
// public static yarnwrap.world.GameMode getServerGameMode(yarnwrap.world.GameMode backupGameMode, ) { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerEntity.getServerGameMode(backupGameMode.wrapperContained)); }
public void readGameModeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readGameModeNbt(nbt.wrapperContained); }
// public static void readGameModeNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.server.network.ServerPlayerEntity.readGameModeNbt(nbt.wrapperContained); }
// public void writeGameModeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeGameModeNbt(nbt.wrapperContained); }
// public static void writeGameModeNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.server.network.ServerPlayerEntity.writeGameModeNbt(nbt.wrapperContained); }
public boolean shouldFilterMessagesSentTo(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.shouldFilterMessagesSentTo(player.wrapperContained); }
// public static boolean shouldFilterMessagesSentTo(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.network.ServerPlayerEntity.shouldFilterMessagesSentTo(player.wrapperContained); }
public void onSpawn() { wrapperContained.onSpawn(); }
// public static void onSpawn() { net.minecraft.server.network.ServerPlayerEntity.onSpawn(); }
public boolean areClientChatColorsEnabled() { return wrapperContained.areClientChatColorsEnabled(); }
// public static boolean areClientChatColorsEnabled() { return net.minecraft.server.network.ServerPlayerEntity.areClientChatColorsEnabled(); }
// public void method_37412(yarnwrap.entity.player.PlayerInventory index) { wrapperContained.method_37412(index.wrapperContained); }
// public static void method_37412(yarnwrap.entity.player.PlayerInventory index, ) { net.minecraft.server.network.ServerPlayerEntity.method_37412(index.wrapperContained); }
public boolean dropSelectedItem(boolean entireStack) { return wrapperContained.dropSelectedItem(entireStack); }
// public static boolean dropSelectedItem(boolean entireStack, ) { return net.minecraft.server.network.ServerPlayerEntity.dropSelectedItem(entireStack); }
public void tickFallStartPos() { wrapperContained.tickFallStartPos(); }
// public static void tickFallStartPos() { net.minecraft.server.network.ServerPlayerEntity.tickFallStartPos(); }
public void tickVehicleInLavaRiding() { wrapperContained.tickVehicleInLavaRiding(); }
// public static void tickVehicleInLavaRiding() { net.minecraft.server.network.ServerPlayerEntity.tickVehicleInLavaRiding(); }
public boolean allowsServerListing() { return wrapperContained.allowsServerListing(); }
// public static boolean allowsServerListing() { return net.minecraft.server.network.ServerPlayerEntity.allowsServerListing(); }
public void sendMessageToClient(yarnwrap.text.Text message,boolean overlay) { wrapperContained.sendMessageToClient(message.wrapperContained,overlay); }
// public static void sendMessageToClient(yarnwrap.text.Text message,boolean overlay, ) { net.minecraft.server.network.ServerPlayerEntity.sendMessageToClient(message.wrapperContained,overlay); }
// public void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
// public static void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params, ) { net.minecraft.server.network.ServerPlayerEntity.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
public void sendServerMetadata(yarnwrap.server.ServerMetadata metadata) { wrapperContained.sendServerMetadata(metadata.wrapperContained); }
// public static void sendServerMetadata(yarnwrap.server.ServerMetadata metadata, ) { net.minecraft.server.network.ServerPlayerEntity.sendServerMetadata(metadata.wrapperContained); }
// public boolean acceptsChatMessage() { return wrapperContained.acceptsChatMessage(); }
// public static boolean acceptsChatMessage() { return net.minecraft.server.network.ServerPlayerEntity.acceptsChatMessage(); }
// public boolean acceptsMessage(boolean overlay) { return wrapperContained.acceptsMessage(overlay); }
// public static boolean acceptsMessage(boolean overlay, ) { return net.minecraft.server.network.ServerPlayerEntity.acceptsMessage(overlay); }
public yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.getSession()); }
// public static yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(net.minecraft.server.network.ServerPlayerEntity.getSession()); }
// public void method_45164(yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager) { wrapperContained.method_45164(sculkShriekerWarningManager.wrapperContained); }
// public static void method_45164(yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager, ) { net.minecraft.server.network.ServerPlayerEntity.method_45164(sculkShriekerWarningManager.wrapperContained); }
// public void method_45165(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_45165(encoded.wrapperContained); }
// public static void method_45165(yarnwrap.nbt.NbtCompound encoded, ) { net.minecraft.server.network.ServerPlayerEntity.method_45165(encoded.wrapperContained); }
public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
// public static void setSession(yarnwrap.network.encryption.PublicPlayerSession session, ) { net.minecraft.server.network.ServerPlayerEntity.setSession(session.wrapperContained); }
public void setServerWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setServerWorld(world.wrapperContained); }
// public static void setServerWorld(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.network.ServerPlayerEntity.setServerWorld(world.wrapperContained); }
public yarnwrap.server.world.ServerWorld getServerWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getServerWorld()); }
// public static yarnwrap.server.world.ServerWorld getServerWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.network.ServerPlayerEntity.getServerWorld()); }
public void setOnGround(yarnwrap.util.math.Vec3d movement) { wrapperContained.setOnGround(movement.wrapperContained); }
// public static void setOnGround(yarnwrap.util.math.Vec3d movement, ) { net.minecraft.server.network.ServerPlayerEntity.setOnGround(movement.wrapperContained); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
// public static int getViewDistance() { return net.minecraft.server.network.ServerPlayerEntity.getViewDistance(); }
public yarnwrap.server.network.ChunkFilter getChunkFilter() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.getChunkFilter()); }
// public static yarnwrap.server.network.ChunkFilter getChunkFilter() { return new yarnwrap.server.network.ChunkFilter(net.minecraft.server.network.ServerPlayerEntity.getChunkFilter()); }
public void setChunkFilter(yarnwrap.server.network.ChunkFilter chunkFilter) { wrapperContained.setChunkFilter(chunkFilter.wrapperContained); }
// public static void setChunkFilter(yarnwrap.server.network.ChunkFilter chunkFilter, ) { net.minecraft.server.network.ServerPlayerEntity.setChunkFilter(chunkFilter.wrapperContained); }
public yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo createCommonPlayerSpawnInfo(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo(wrapperContained.createCommonPlayerSpawnInfo(world.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo createCommonPlayerSpawnInfo(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo(net.minecraft.server.network.ServerPlayerEntity.createCommonPlayerSpawnInfo(world.wrapperContained)); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions getClientOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.getClientOptions()); }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions getClientOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.server.network.ServerPlayerEntity.getClientOptions()); }
public void increaseTravelMotionStats(double deltaX,double deltaY,double deltaZ) { wrapperContained.increaseTravelMotionStats(deltaX,deltaY,deltaZ); }
// public static void increaseTravelMotionStats(double deltaX,double deltaY,double deltaZ, ) { net.minecraft.server.network.ServerPlayerEntity.increaseTravelMotionStats(deltaX,deltaY,deltaZ); }
// public void increaseRidingMotionStats(double deltaX,double deltaY,double deltaZ) { wrapperContained.increaseRidingMotionStats(deltaX,deltaY,deltaZ); }
// public static void increaseRidingMotionStats(double deltaX,double deltaY,double deltaZ, ) { net.minecraft.server.network.ServerPlayerEntity.increaseRidingMotionStats(deltaX,deltaY,deltaZ); }
// public boolean isZero(double deltaX,double deltaY,double deltaZ) { return wrapperContained.isZero(deltaX,deltaY,deltaZ); }
// public static boolean isZero(double deltaX,double deltaY,double deltaZ, ) { return net.minecraft.server.network.ServerPlayerEntity.isZero(deltaX,deltaY,deltaZ); }
// public java.util.stream.Stream method_54934(yarnwrap.util.Identifier recipe) { return wrapperContained.method_54934(recipe.wrapperContained); }
// public static java.util.stream.Stream method_54934(yarnwrap.util.Identifier recipe, ) { return net.minecraft.server.network.ServerPlayerEntity.method_54934(recipe.wrapperContained); }
// public void updateCreativeInteractionRangeModifiers() { wrapperContained.updateCreativeInteractionRangeModifiers(); }
// public static void updateCreativeInteractionRangeModifiers() { net.minecraft.server.network.ServerPlayerEntity.updateCreativeInteractionRangeModifiers(); }
public void setSpawnExtraParticlesOnFall(boolean spawnExtraParticlesOnFall) { wrapperContained.setSpawnExtraParticlesOnFall(spawnExtraParticlesOnFall); }
// public static void setSpawnExtraParticlesOnFall(boolean spawnExtraParticlesOnFall, ) { net.minecraft.server.network.ServerPlayerEntity.setSpawnExtraParticlesOnFall(spawnExtraParticlesOnFall); }
// public void method_58583(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_58583(encoded.wrapperContained); }
// public static void method_58583(yarnwrap.nbt.NbtCompound encoded, ) { net.minecraft.server.network.ServerPlayerEntity.method_58583(encoded.wrapperContained); }
public void clearStartRaidPos() { wrapperContained.clearStartRaidPos(); }
// public static void clearStartRaidPos() { net.minecraft.server.network.ServerPlayerEntity.clearStartRaidPos(); }
public yarnwrap.util.math.BlockPos getStartRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartRaidPos()); }
// public static yarnwrap.util.math.BlockPos getStartRaidPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerEntity.getStartRaidPos()); }
public void setStartRaidPos(yarnwrap.util.math.BlockPos startRaidPos) { wrapperContained.setStartRaidPos(startRaidPos.wrapperContained); }
// public static void setStartRaidPos(yarnwrap.util.math.BlockPos startRaidPos, ) { net.minecraft.server.network.ServerPlayerEntity.setStartRaidPos(startRaidPos.wrapperContained); }
// public void method_58587(yarnwrap.util.math.BlockPos startRaidPos) { wrapperContained.method_58587(startRaidPos.wrapperContained); }
// public static void method_58587(yarnwrap.util.math.BlockPos startRaidPos, ) { net.minecraft.server.network.ServerPlayerEntity.method_58587(startRaidPos.wrapperContained); }
// public java.util.Optional findRespawnPosition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,float spawnAngle,boolean spawnForced,boolean alive) { return wrapperContained.findRespawnPosition(world.wrapperContained,pos.wrapperContained,spawnAngle,spawnForced,alive); }
// public static java.util.Optional findRespawnPosition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,float spawnAngle,boolean spawnForced,boolean alive, ) { return net.minecraft.server.network.ServerPlayerEntity.findRespawnPosition(world.wrapperContained,pos.wrapperContained,spawnAngle,spawnForced,alive); }
// public Object method_60589(yarnwrap.util.math.BlockPos respawnPos) { return wrapperContained.method_60589(respawnPos.wrapperContained); }
// public static Object method_60589(yarnwrap.util.math.BlockPos respawnPos, ) { return net.minecraft.server.network.ServerPlayerEntity.method_60589(respawnPos.wrapperContained); }
// public yarnwrap.world.TeleportTarget getRespawnTarget(boolean alive,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getRespawnTarget(alive,postDimensionTransition)); }
// public static yarnwrap.world.TeleportTarget getRespawnTarget(boolean alive,Object postDimensionTransition, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.server.network.ServerPlayerEntity.getRespawnTarget(alive,postDimensionTransition)); }
public void setSpawnPointFrom(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.setSpawnPointFrom(player.wrapperContained); }
// public static void setSpawnPointFrom(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.ServerPlayerEntity.setSpawnPointFrom(player.wrapperContained); }
// public Object method_60593(yarnwrap.util.math.BlockPos respawnPos) { return wrapperContained.method_60593(respawnPos.wrapperContained); }
// public static Object method_60593(yarnwrap.util.math.BlockPos respawnPos, ) { return net.minecraft.server.network.ServerPlayerEntity.method_60593(respawnPos.wrapperContained); }
public void detachForDimensionChange() { wrapperContained.detachForDimensionChange(); }
// public static void detachForDimensionChange() { net.minecraft.server.network.ServerPlayerEntity.detachForDimensionChange(); }
public boolean changeGameMode(yarnwrap.world.GameMode gameMode) { return wrapperContained.changeGameMode(gameMode.wrapperContained); }
// public static boolean changeGameMode(yarnwrap.world.GameMode gameMode, ) { return net.minecraft.server.network.ServerPlayerEntity.changeGameMode(gameMode.wrapperContained); }

}