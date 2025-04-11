package yarnwrap.server.network;
public class ServerPlayerEntity { public net.minecraft.server.network.ServerPlayerEntity wrapperContained; public ServerPlayerEntity(net.minecraft.server.network.ServerPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float lastHealthScore() { return wrapperContained.lastHealthScore; }
// public void lastHealthScore(float value) { wrapperContained.lastHealthScore = value; }
// public boolean disconnected() { return wrapperContained.disconnected; }
// public void disconnected(boolean value) { wrapperContained.disconnected = value; }
// public int lastLevelScore() { return wrapperContained.lastLevelScore; }
// public void lastLevelScore(int value) { wrapperContained.lastLevelScore = value; }
// public yarnwrap.stat.ServerStatHandler statHandler() { return new yarnwrap.stat.ServerStatHandler(wrapperContained.statHandler); }
// public void statHandler(yarnwrap.stat.ServerStatHandler value) { wrapperContained.statHandler = value.wrapperContained; }
// public int lastAirScore() { return wrapperContained.lastAirScore; }
// public void lastAirScore(int value) { wrapperContained.lastAirScore = value; }
public boolean seenCredits() { return wrapperContained.seenCredits; }
public void seenCredits(boolean value) { wrapperContained.seenCredits = value; }
// public yarnwrap.advancement.PlayerAdvancementTracker advancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.advancementTracker); }
// public void advancementTracker(yarnwrap.advancement.PlayerAdvancementTracker value) { wrapperContained.advancementTracker = value.wrapperContained; }
// public boolean clientChatColorsEnabled() { return wrapperContained.clientChatColorsEnabled; }
// public void clientChatColorsEnabled(boolean value) { wrapperContained.clientChatColorsEnabled = value; }
// public boolean syncedSaturationIsZero() { return wrapperContained.syncedSaturationIsZero; }
// public void syncedSaturationIsZero(boolean value) { wrapperContained.syncedSaturationIsZero = value; }
// public int levitationStartTick() { return wrapperContained.levitationStartTick; }
// public void levitationStartTick(int value) { wrapperContained.levitationStartTick = value; }
public yarnwrap.server.network.ServerPlayerInteractionManager interactionManager() { return new yarnwrap.server.network.ServerPlayerInteractionManager(wrapperContained.interactionManager); }
// public void interactionManager(yarnwrap.server.network.ServerPlayerInteractionManager value) { wrapperContained.interactionManager = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public long lastActionTime() { return wrapperContained.lastActionTime; }
// public void lastActionTime(long value) { wrapperContained.lastActionTime = value; }
// public int syncedExperience() { return wrapperContained.syncedExperience; }
// public void syncedExperience(int value) { wrapperContained.syncedExperience = value; }
// public int syncedFoodLevel() { return wrapperContained.syncedFoodLevel; }
// public void syncedFoodLevel(int value) { wrapperContained.syncedFoodLevel = value; }
// public int lastExperienceScore() { return wrapperContained.lastExperienceScore; }
// public void lastExperienceScore(int value) { wrapperContained.lastExperienceScore = value; }
// public int lastArmorScore() { return wrapperContained.lastArmorScore; }
// public void lastArmorScore(int value) { wrapperContained.lastArmorScore = value; }
// public int lastFoodScore() { return wrapperContained.lastFoodScore; }
// public void lastFoodScore(int value) { wrapperContained.lastFoodScore = value; }
// public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
// public void cameraEntity(yarnwrap.entity.Entity value) { wrapperContained.cameraEntity = value.wrapperContained; }
// public boolean inTeleportationState() { return wrapperContained.inTeleportationState; }
// public void inTeleportationState(boolean value) { wrapperContained.inTeleportationState = value; }
// public int screenHandlerSyncId() { return wrapperContained.screenHandlerSyncId; }
// public void screenHandlerSyncId(int value) { wrapperContained.screenHandlerSyncId = value; }
public yarnwrap.server.network.ServerPlayNetworkHandler networkHandler() { return new yarnwrap.server.network.ServerPlayNetworkHandler(wrapperContained.networkHandler); }
public void networkHandler(yarnwrap.server.network.ServerPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
public boolean notInAnyWorld() { return wrapperContained.notInAnyWorld; }
public void notInAnyWorld(boolean value) { wrapperContained.notInAnyWorld = value; }
// public yarnwrap.util.math.ChunkSectionPos watchedSection() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.watchedSection); }
// public void watchedSection(yarnwrap.util.math.ChunkSectionPos value) { wrapperContained.watchedSection = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d levitationStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.levitationStartPos); }
// public void levitationStartPos(yarnwrap.util.math.Vec3d value) { wrapperContained.levitationStartPos = value.wrapperContained; }
// public yarnwrap.network.message.ChatVisibility clientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(wrapperContained.clientChatVisibility); }
// public void clientChatVisibility(yarnwrap.network.message.ChatVisibility value) { wrapperContained.clientChatVisibility = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d enteredNetherPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.enteredNetherPos); }
// public void enteredNetherPos(yarnwrap.util.math.Vec3d value) { wrapperContained.enteredNetherPos = value.wrapperContained; }
public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.server.network.ServerRecipeBook recipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.server.network.ServerRecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
// public float syncedHealth() { return wrapperContained.syncedHealth; }
// public void syncedHealth(float value) { wrapperContained.syncedHealth = value; }
// public int joinInvulnerabilityTicks() { return wrapperContained.joinInvulnerabilityTicks; }
// public void joinInvulnerabilityTicks(int value) { wrapperContained.joinInvulnerabilityTicks = value; }
// public yarnwrap.registry.RegistryKey spawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.spawnPointDimension); }
// public void spawnPointDimension(yarnwrap.registry.RegistryKey value) { wrapperContained.spawnPointDimension = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos spawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.spawnPointPosition); }
// public void spawnPointPosition(yarnwrap.util.math.BlockPos value) { wrapperContained.spawnPointPosition = value.wrapperContained; }
// public boolean spawnForced() { return wrapperContained.spawnForced; }
// public void spawnForced(boolean value) { wrapperContained.spawnForced = value; }
// public float spawnAngle() { return wrapperContained.spawnAngle; }
// public void spawnAngle(float value) { wrapperContained.spawnAngle = value; }
// public yarnwrap.server.filter.TextStream textStream() { return new yarnwrap.server.filter.TextStream(wrapperContained.textStream); }
// public void textStream(yarnwrap.server.filter.TextStream value) { wrapperContained.textStream = value.wrapperContained; }
// public boolean filterText() { return wrapperContained.filterText; }
// public void filterText(boolean value) { wrapperContained.filterText = value; }
// public yarnwrap.screen.ScreenHandlerSyncHandler screenHandlerSyncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(wrapperContained.screenHandlerSyncHandler); }
// public void screenHandlerSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value) { wrapperContained.screenHandlerSyncHandler = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerListener screenHandlerListener() { return new yarnwrap.screen.ScreenHandlerListener(wrapperContained.screenHandlerListener); }
// public void screenHandlerListener(yarnwrap.screen.ScreenHandlerListener value) { wrapperContained.screenHandlerListener = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d fallStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.fallStartPos); }
// public void fallStartPos(yarnwrap.util.math.Vec3d value) { wrapperContained.fallStartPos = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d vehicleInLavaRidingPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.vehicleInLavaRidingPos); }
// public void vehicleInLavaRidingPos(yarnwrap.util.math.Vec3d value) { wrapperContained.vehicleInLavaRidingPos = value.wrapperContained; }
// public boolean allowServerListing() { return wrapperContained.allowServerListing; }
// public void allowServerListing(boolean value) { wrapperContained.allowServerListing = value; }
// public yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager() { return new yarnwrap.block.entity.SculkShriekerWarningManager(wrapperContained.sculkShriekerWarningManager); }
// public void sculkShriekerWarningManager(yarnwrap.block.entity.SculkShriekerWarningManager value) { wrapperContained.sculkShriekerWarningManager = value.wrapperContained; }
// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.PublicPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public yarnwrap.server.network.ChunkFilter chunkFilter() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.chunkFilter); }
// public void chunkFilter(yarnwrap.server.network.ChunkFilter value) { wrapperContained.chunkFilter = value.wrapperContained; }
// public java.lang.String language() { return wrapperContained.language; }
// public void language(java.lang.String value) { wrapperContained.language = value; }
// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER); }
// public void CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER); }
// public void CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER = value.wrapperContained; }
// public boolean spawnExtraParticlesOnFall() { return wrapperContained.spawnExtraParticlesOnFall; }
// public void spawnExtraParticlesOnFall(boolean value) { wrapperContained.spawnExtraParticlesOnFall = value; }
// public yarnwrap.util.math.BlockPos startRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.startRaidPos); }
// public void startRaidPos(yarnwrap.util.math.BlockPos value) { wrapperContained.startRaidPos = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d movement() { return new yarnwrap.util.math.Vec3d(wrapperContained.movement); }
// public void movement(yarnwrap.util.math.Vec3d value) { wrapperContained.movement = value.wrapperContained; }
public ServerPlayerEntity(yarnwrap.server.MinecraftServer server,yarnwrap.server.world.ServerWorld world,com.mojang.authlib.GameProfile profile,yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions) { this.wrapperContained = new net.minecraft.server.network.ServerPlayerEntity(server.wrapperContained,world.wrapperContained,profile,clientOptions.wrapperContained); }
public void copyFrom(yarnwrap.server.network.ServerPlayerEntity oldPlayer,boolean alive) { wrapperContained.copyFrom(oldPlayer.wrapperContained,alive); }
public yarnwrap.text.Text getPlayerListName() { return new yarnwrap.text.Text(wrapperContained.getPlayerListName()); }
public void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround) { wrapperContained.handleFall(xDifference,yDifference,zDifference,onGround); }
public boolean isInTeleportationState() { return wrapperContained.isInTeleportationState(); }
public java.lang.String getIp() { return wrapperContained.getIp(); }
// public yarnwrap.text.Style method_14210(yarnwrap.text.Text style) { return new yarnwrap.text.Style(wrapperContained.method_14210(style.wrapperContained)); }
// public void updateScores(yarnwrap.scoreboard.ScoreboardCriterion criterion,int score) { wrapperContained.updateScores(criterion.wrapperContained,score); }
public void setClientOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions) { wrapperContained.setClientOptions(clientOptions.wrapperContained); }
public void markHealthDirty() { wrapperContained.markHealthDirty(); }
public void updateInput(float sidewaysSpeed,float forwardSpeed,boolean jumping,boolean sneaking) { wrapperContained.updateInput(sidewaysSpeed,forwardSpeed,jumping,sneaking); }
public long getLastActionTime() { return wrapperContained.getLastActionTime(); }
// public void method_14221(int score) { wrapperContained.method_14221(score); }
// public void lookAtEntity(Object anchorPoint,yarnwrap.entity.Entity targetEntity,Object targetAnchor) { wrapperContained.lookAtEntity(anchorPoint,targetEntity.wrapperContained,targetAnchor); }
public void setCameraEntity(yarnwrap.entity.Entity entity) { wrapperContained.setCameraEntity(entity.wrapperContained); }
public void playerTick() { wrapperContained.playerTick(); }
// public void updateScoreboardScore(yarnwrap.scoreboard.ScoreHolder targetScoreHolder,yarnwrap.scoreboard.ScoreHolder aboutScoreHolder,net.minecraft.scoreboard.ScoreboardCriterion[] criterions) { wrapperContained.updateScoreboardScore(targetScoreHolder.wrapperContained,aboutScoreHolder.wrapperContained,criterions); }
public void setExperiencePoints(int points) { wrapperContained.setExperiencePoints(points); }
// public boolean isPvpEnabled() { return wrapperContained.isPvpEnabled(); }
public void onDisconnect() { wrapperContained.onDisconnect(); }
public yarnwrap.util.math.ChunkSectionPos getWatchedSection() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.getWatchedSection()); }
public void updateLastActionTime() { wrapperContained.updateLastActionTime(); }
// public void onScreenHandlerOpened(yarnwrap.screen.ScreenHandler screenHandler) { wrapperContained.onScreenHandlerOpened(screenHandler.wrapperContained); }
public yarnwrap.advancement.PlayerAdvancementTracker getAdvancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.getAdvancementTracker()); }
// public void incrementScreenHandlerSyncId() { wrapperContained.incrementScreenHandlerSyncId(); }
public yarnwrap.network.message.ChatVisibility getClientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(wrapperContained.getClientChatVisibility()); }
public boolean isDisconnected() { return wrapperContained.isDisconnected(); }
public void onTeleportationDone() { wrapperContained.onTeleportationDone(); }
public yarnwrap.entity.Entity getCameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.getCameraEntity()); }
// public int calculateSpawnOffsetMultiplier(int horizontalSpawnArea) { return wrapperContained.calculateSpawnOffsetMultiplier(horizontalSpawnArea); }
public yarnwrap.stat.ServerStatHandler getStatHandler() { return new yarnwrap.stat.ServerStatHandler(wrapperContained.getStatHandler()); }
// public void method_14250(int innerScore) { wrapperContained.method_14250(innerScore); }
public void teleport(yarnwrap.server.world.ServerWorld targetWorld,double x,double y,double z,float yaw,float pitch) { wrapperContained.teleport(targetWorld.wrapperContained,x,y,z,yaw,pitch); }
public void setExperienceLevel(int level) { wrapperContained.setExperienceLevel(level); }
public yarnwrap.server.network.ServerRecipeBook getRecipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.getRecipeBook()); }
public void setWatchedSection(yarnwrap.util.math.ChunkSectionPos section) { wrapperContained.setWatchedSection(section.wrapperContained); }
// public void worldChanged(yarnwrap.server.world.ServerWorld origin) { wrapperContained.worldChanged(origin.wrapperContained); }
// public void method_19504(yarnwrap.util.Unit unit) { wrapperContained.method_19504(unit.wrapperContained); }
public yarnwrap.util.math.BlockPos getSpawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPointPosition()); }
public yarnwrap.registry.RegistryKey getSpawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.getSpawnPointDimension()); }
public boolean isSpawnForced() { return wrapperContained.isSpawnForced(); }
// public boolean method_26283(yarnwrap.entity.mob.HostileEntity entity) { return wrapperContained.method_26283(entity.wrapperContained); }
public void setSpawnPoint(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos,float angle,boolean forced,boolean sendMessage) { wrapperContained.setSpawnPoint(dimension.wrapperContained,pos.wrapperContained,angle,forced,sendMessage); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedWithinRange(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedObstructed(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedObstructed(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isBedWithinRange(pos.wrapperContained); }
// public void method_29205(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_29205(encoded.wrapperContained); }
// public void method_29777(yarnwrap.entity.mob.MobEntity entity) { wrapperContained.method_29777(entity.wrapperContained); }
// public boolean method_29778(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_29778(entity.wrapperContained); }
// public void forgiveMobAnger() { wrapperContained.forgiveMobAnger(); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
public yarnwrap.server.filter.TextStream getTextStream() { return new yarnwrap.server.filter.TextStream(wrapperContained.getTextStream()); }
// public yarnwrap.world.GameMode gameModeFromNbt(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return new yarnwrap.world.GameMode(wrapperContained.gameModeFromNbt(nbt.wrapperContained,key)); }
// public yarnwrap.world.GameMode getServerGameMode(yarnwrap.world.GameMode backupGameMode) { return new yarnwrap.world.GameMode(wrapperContained.getServerGameMode(backupGameMode.wrapperContained)); }
public void readGameModeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readGameModeNbt(nbt.wrapperContained); }
// public void writeGameModeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeGameModeNbt(nbt.wrapperContained); }
public boolean shouldFilterMessagesSentTo(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.shouldFilterMessagesSentTo(player.wrapperContained); }
public void onSpawn() { wrapperContained.onSpawn(); }
public boolean areClientChatColorsEnabled() { return wrapperContained.areClientChatColorsEnabled(); }
// public void method_37412(yarnwrap.entity.player.PlayerInventory index) { wrapperContained.method_37412(index.wrapperContained); }
public boolean dropSelectedItem(boolean entireStack) { return wrapperContained.dropSelectedItem(entireStack); }
public void tickFallStartPos() { wrapperContained.tickFallStartPos(); }
public void tickVehicleInLavaRiding() { wrapperContained.tickVehicleInLavaRiding(); }
public boolean allowsServerListing() { return wrapperContained.allowsServerListing(); }
public void sendMessageToClient(yarnwrap.text.Text message,boolean overlay) { wrapperContained.sendMessageToClient(message.wrapperContained,overlay); }
// public void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
public void sendServerMetadata(yarnwrap.server.ServerMetadata metadata) { wrapperContained.sendServerMetadata(metadata.wrapperContained); }
// public boolean acceptsChatMessage() { return wrapperContained.acceptsChatMessage(); }
// public boolean acceptsMessage(boolean overlay) { return wrapperContained.acceptsMessage(overlay); }
public yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.getSession()); }
// public void method_45164(yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager) { wrapperContained.method_45164(sculkShriekerWarningManager.wrapperContained); }
// public void method_45165(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_45165(encoded.wrapperContained); }
public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
public void setServerWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setServerWorld(world.wrapperContained); }
public yarnwrap.server.world.ServerWorld getServerWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getServerWorld()); }
public void setOnGround(yarnwrap.util.math.Vec3d movement) { wrapperContained.setOnGround(movement.wrapperContained); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
public yarnwrap.server.network.ChunkFilter getChunkFilter() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.getChunkFilter()); }
public void setChunkFilter(yarnwrap.server.network.ChunkFilter chunkFilter) { wrapperContained.setChunkFilter(chunkFilter.wrapperContained); }
public yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo createCommonPlayerSpawnInfo(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.network.packet.s2c.play.CommonPlayerSpawnInfo(wrapperContained.createCommonPlayerSpawnInfo(world.wrapperContained)); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions getClientOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.getClientOptions()); }
public void increaseTravelMotionStats(double deltaX,double deltaY,double deltaZ) { wrapperContained.increaseTravelMotionStats(deltaX,deltaY,deltaZ); }
// public void increaseRidingMotionStats(double deltaX,double deltaY,double deltaZ) { wrapperContained.increaseRidingMotionStats(deltaX,deltaY,deltaZ); }
// public boolean isZero(double deltaX,double deltaY,double deltaZ) { return wrapperContained.isZero(deltaX,deltaY,deltaZ); }
// public java.util.stream.Stream method_54934(yarnwrap.util.Identifier recipe) { return wrapperContained.method_54934(recipe.wrapperContained); }
// public void updateCreativeInteractionRangeModifiers() { wrapperContained.updateCreativeInteractionRangeModifiers(); }
public void setSpawnExtraParticlesOnFall(boolean spawnExtraParticlesOnFall) { wrapperContained.setSpawnExtraParticlesOnFall(spawnExtraParticlesOnFall); }
// public void method_58583(yarnwrap.nbt.NbtCompound encoded) { wrapperContained.method_58583(encoded.wrapperContained); }
public void clearStartRaidPos() { wrapperContained.clearStartRaidPos(); }
public yarnwrap.util.math.BlockPos getStartRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartRaidPos()); }
public void setStartRaidPos(yarnwrap.util.math.BlockPos startRaidPos) { wrapperContained.setStartRaidPos(startRaidPos.wrapperContained); }
// public void method_58587(yarnwrap.util.math.BlockPos startRaidPos) { wrapperContained.method_58587(startRaidPos.wrapperContained); }
// public java.util.Optional findRespawnPosition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,float spawnAngle,boolean spawnForced,boolean alive) { return wrapperContained.findRespawnPosition(world.wrapperContained,pos.wrapperContained,spawnAngle,spawnForced,alive); }
// public Object method_60589(yarnwrap.util.math.BlockPos respawnPos) { return wrapperContained.method_60589(respawnPos.wrapperContained); }
// public yarnwrap.world.TeleportTarget getRespawnTarget(boolean alive,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getRespawnTarget(alive,postDimensionTransition)); }
public void setSpawnPointFrom(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.setSpawnPointFrom(player.wrapperContained); }
// public Object method_60593(yarnwrap.util.math.BlockPos respawnPos) { return wrapperContained.method_60593(respawnPos.wrapperContained); }
public void detachForDimensionChange() { wrapperContained.detachForDimensionChange(); }
public boolean changeGameMode(yarnwrap.world.GameMode gameMode) { return wrapperContained.changeGameMode(gameMode.wrapperContained); }

}