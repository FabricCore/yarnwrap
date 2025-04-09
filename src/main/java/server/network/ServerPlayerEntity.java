package yarnwrap.server.network;
public class ServerPlayerEntity { public net.minecraft.server.network.ServerPlayerEntity wrapperContained; public ServerPlayerEntity(net.minecraft.server.network.ServerPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float lastHealthScore() { return wrapperContained.lastHealthScore; }
// public boolean disconnected() { return wrapperContained.disconnected; }
// public int lastLevelScore() { return wrapperContained.lastLevelScore; }
// public yarnwrap.stat.ServerStatHandler statHandler() { return new yarnwrap.stat.ServerStatHandler(wrapperContained.statHandler); }
// public int lastAirScore() { return wrapperContained.lastAirScore; }
public boolean seenCredits() { return wrapperContained.seenCredits; }
// public yarnwrap.advancement.PlayerAdvancementTracker advancementTracker() { return new yarnwrap.advancement.PlayerAdvancementTracker(wrapperContained.advancementTracker); }
// public boolean clientChatColorsEnabled() { return wrapperContained.clientChatColorsEnabled; }
// public boolean syncedSaturationIsZero() { return wrapperContained.syncedSaturationIsZero; }
// public int levitationStartTick() { return wrapperContained.levitationStartTick; }
public yarnwrap.server.network.ServerPlayerInteractionManager interactionManager() { return new yarnwrap.server.network.ServerPlayerInteractionManager(wrapperContained.interactionManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public long lastActionTime() { return wrapperContained.lastActionTime; }
// public int syncedExperience() { return wrapperContained.syncedExperience; }
// public int syncedFoodLevel() { return wrapperContained.syncedFoodLevel; }
// public int lastExperienceScore() { return wrapperContained.lastExperienceScore; }
// public int lastArmorScore() { return wrapperContained.lastArmorScore; }
// public int lastFoodScore() { return wrapperContained.lastFoodScore; }
// public yarnwrap.entity.Entity cameraEntity() { return new yarnwrap.entity.Entity(wrapperContained.cameraEntity); }
// public boolean inTeleportationState() { return wrapperContained.inTeleportationState; }
// public int screenHandlerSyncId() { return wrapperContained.screenHandlerSyncId; }
public yarnwrap.server.network.ServerPlayNetworkHandler networkHandler() { return new yarnwrap.server.network.ServerPlayNetworkHandler(wrapperContained.networkHandler); }
public boolean notInAnyWorld() { return wrapperContained.notInAnyWorld; }
// public yarnwrap.util.math.ChunkSectionPos watchedSection() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.watchedSection); }
// public yarnwrap.util.math.Vec3d levitationStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.levitationStartPos); }
// public yarnwrap.network.message.ChatVisibility clientChatVisibility() { return new yarnwrap.network.message.ChatVisibility(wrapperContained.clientChatVisibility); }
// public yarnwrap.util.math.Vec3d enteredNetherPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.enteredNetherPos); }
public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.server.network.ServerRecipeBook recipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.recipeBook); }
// public float syncedHealth() { return wrapperContained.syncedHealth; }
// public int joinInvulnerabilityTicks() { return wrapperContained.joinInvulnerabilityTicks; }
// public yarnwrap.registry.RegistryKey spawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.spawnPointDimension); }
// public yarnwrap.util.math.BlockPos spawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.spawnPointPosition); }
// public boolean spawnForced() { return wrapperContained.spawnForced; }
// public float spawnAngle() { return wrapperContained.spawnAngle; }
// public yarnwrap.server.filter.TextStream textStream() { return new yarnwrap.server.filter.TextStream(wrapperContained.textStream); }
// public boolean filterText() { return wrapperContained.filterText; }
// public yarnwrap.screen.ScreenHandlerSyncHandler screenHandlerSyncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(wrapperContained.screenHandlerSyncHandler); }
// public yarnwrap.screen.ScreenHandlerListener screenHandlerListener() { return new yarnwrap.screen.ScreenHandlerListener(wrapperContained.screenHandlerListener); }
// public yarnwrap.util.math.Vec3d fallStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.fallStartPos); }
// public yarnwrap.util.math.Vec3d vehicleInLavaRidingPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.vehicleInLavaRidingPos); }
// public boolean allowServerListing() { return wrapperContained.allowServerListing; }
// public yarnwrap.block.entity.SculkShriekerWarningManager sculkShriekerWarningManager() { return new yarnwrap.block.entity.SculkShriekerWarningManager(wrapperContained.sculkShriekerWarningManager); }
// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public yarnwrap.server.network.ChunkFilter chunkFilter() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.chunkFilter); }
// public java.lang.String language() { return wrapperContained.language; }
// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_BLOCK_INTERACTION_RANGE_MODIFIER); }
// public yarnwrap.entity.attribute.EntityAttributeModifier CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.CREATIVE_ENTITY_INTERACTION_RANGE_MODIFIER); }
// public boolean spawnExtraParticlesOnFall() { return wrapperContained.spawnExtraParticlesOnFall; }
// public yarnwrap.util.math.BlockPos startRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.startRaidPos); }
// public yarnwrap.util.math.Vec3d movement() { return new yarnwrap.util.math.Vec3d(wrapperContained.movement); }
public void copyFrom(yarnwrap.server.network.ServerPlayerEntity oldPlayer,boolean alive) { wrapperContained.copyFrom(oldPlayer.wrapperContained,alive); }
public yarnwrap.text.Text getPlayerListName() { return new yarnwrap.text.Text(wrapperContained.getPlayerListName()); }
public void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround) { wrapperContained.handleFall(xDifference,yDifference,zDifference,onGround); }
public boolean isInTeleportationState() { return wrapperContained.isInTeleportationState(); }
public java.lang.String getIp() { return wrapperContained.getIp(); }
// public void updateScores(yarnwrap.scoreboard.ScoreboardCriterion criterion,int score) { wrapperContained.updateScores(criterion.wrapperContained,score); }
public void setClientOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions clientOptions) { wrapperContained.setClientOptions(clientOptions.wrapperContained); }
public void markHealthDirty() { wrapperContained.markHealthDirty(); }
public void updateInput(float sidewaysSpeed,float forwardSpeed,boolean jumping,boolean sneaking) { wrapperContained.updateInput(sidewaysSpeed,forwardSpeed,jumping,sneaking); }
public long getLastActionTime() { return wrapperContained.getLastActionTime(); }
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
public void teleport(yarnwrap.server.world.ServerWorld targetWorld,double x,double y,double z,float yaw,float pitch) { wrapperContained.teleport(targetWorld.wrapperContained,x,y,z,yaw,pitch); }
public void setExperienceLevel(int level) { wrapperContained.setExperienceLevel(level); }
public yarnwrap.server.network.ServerRecipeBook getRecipeBook() { return new yarnwrap.server.network.ServerRecipeBook(wrapperContained.getRecipeBook()); }
public void setWatchedSection(yarnwrap.util.math.ChunkSectionPos section) { wrapperContained.setWatchedSection(section.wrapperContained); }
// public void worldChanged(yarnwrap.server.world.ServerWorld origin) { wrapperContained.worldChanged(origin.wrapperContained); }
public yarnwrap.util.math.BlockPos getSpawnPointPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPointPosition()); }
public yarnwrap.registry.RegistryKey getSpawnPointDimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.getSpawnPointDimension()); }
public boolean isSpawnForced() { return wrapperContained.isSpawnForced(); }
public void setSpawnPoint(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos,float angle,boolean forced,boolean sendMessage) { wrapperContained.setSpawnPoint(dimension.wrapperContained,pos.wrapperContained,angle,forced,sendMessage); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedWithinRange(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedObstructed(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isBedObstructed(pos.wrapperContained,direction.wrapperContained); }
// public boolean isBedWithinRange(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isBedWithinRange(pos.wrapperContained); }
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
// public void updateCreativeInteractionRangeModifiers() { wrapperContained.updateCreativeInteractionRangeModifiers(); }
public void setSpawnExtraParticlesOnFall(boolean spawnExtraParticlesOnFall) { wrapperContained.setSpawnExtraParticlesOnFall(spawnExtraParticlesOnFall); }
public void clearStartRaidPos() { wrapperContained.clearStartRaidPos(); }
public yarnwrap.util.math.BlockPos getStartRaidPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartRaidPos()); }
public void setStartRaidPos(yarnwrap.util.math.BlockPos startRaidPos) { wrapperContained.setStartRaidPos(startRaidPos.wrapperContained); }
// public java.util.Optional findRespawnPosition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,float spawnAngle,boolean spawnForced,boolean alive) { return wrapperContained.findRespawnPosition(world.wrapperContained,pos.wrapperContained,spawnAngle,spawnForced,alive); }
// public yarnwrap.world.TeleportTarget getRespawnTarget(boolean alive,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getRespawnTarget(alive,postDimensionTransition)); }
public void setSpawnPointFrom(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.setSpawnPointFrom(player.wrapperContained); }
public void detachForDimensionChange() { wrapperContained.detachForDimensionChange(); }
public boolean changeGameMode(yarnwrap.world.GameMode gameMode) { return wrapperContained.changeGameMode(gameMode.wrapperContained); }

}