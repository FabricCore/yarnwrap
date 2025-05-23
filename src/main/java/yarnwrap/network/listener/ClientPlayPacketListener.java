package yarnwrap.network.listener;
public class ClientPlayPacketListener { public net.minecraft.network.listener.ClientPlayPacketListener wrapperContained; public ClientPlayPacketListener(net.minecraft.network.listener.ClientPlayPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onParticle(yarnwrap.network.packet.s2c.play.ParticleS2CPacket packet) { wrapperContained.onParticle(packet.wrapperContained); }
// public static void onParticle(yarnwrap.network.packet.s2c.play.ParticleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onParticle(packet.wrapperContained); }
public void onBossBar(yarnwrap.network.packet.s2c.play.BossBarS2CPacket packet) { wrapperContained.onBossBar(packet.wrapperContained); }
// public static void onBossBar(yarnwrap.network.packet.s2c.play.BossBarS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBossBar(packet.wrapperContained); }
public void onWorldTimeUpdate(yarnwrap.network.packet.s2c.play.WorldTimeUpdateS2CPacket packet) { wrapperContained.onWorldTimeUpdate(packet.wrapperContained); }
// public static void onWorldTimeUpdate(yarnwrap.network.packet.s2c.play.WorldTimeUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldTimeUpdate(packet.wrapperContained); }
public void onEntityPassengersSet(yarnwrap.network.packet.s2c.play.EntityPassengersSetS2CPacket packet) { wrapperContained.onEntityPassengersSet(packet.wrapperContained); }
// public static void onEntityPassengersSet(yarnwrap.network.packet.s2c.play.EntityPassengersSetS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityPassengersSet(packet.wrapperContained); }
public void onCommandSuggestions(yarnwrap.network.packet.s2c.play.CommandSuggestionsS2CPacket packet) { wrapperContained.onCommandSuggestions(packet.wrapperContained); }
// public static void onCommandSuggestions(yarnwrap.network.packet.s2c.play.CommandSuggestionsS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onCommandSuggestions(packet.wrapperContained); }
public void onStopSound(yarnwrap.network.packet.s2c.play.StopSoundS2CPacket packet) { wrapperContained.onStopSound(packet.wrapperContained); }
// public static void onStopSound(yarnwrap.network.packet.s2c.play.StopSoundS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onStopSound(packet.wrapperContained); }
public void onEntityStatusEffect(yarnwrap.network.packet.s2c.play.EntityStatusEffectS2CPacket packet) { wrapperContained.onEntityStatusEffect(packet.wrapperContained); }
// public static void onEntityStatusEffect(yarnwrap.network.packet.s2c.play.EntityStatusEffectS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityStatusEffect(packet.wrapperContained); }
public void onGameStateChange(yarnwrap.network.packet.s2c.play.GameStateChangeS2CPacket packet) { wrapperContained.onGameStateChange(packet.wrapperContained); }
// public static void onGameStateChange(yarnwrap.network.packet.s2c.play.GameStateChangeS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onGameStateChange(packet.wrapperContained); }
public void onEntityPosition(yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket packet) { wrapperContained.onEntityPosition(packet.wrapperContained); }
// public static void onEntityPosition(yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityPosition(packet.wrapperContained); }
public void onCooldownUpdate(yarnwrap.network.packet.s2c.play.CooldownUpdateS2CPacket packet) { wrapperContained.onCooldownUpdate(packet.wrapperContained); }
// public static void onCooldownUpdate(yarnwrap.network.packet.s2c.play.CooldownUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onCooldownUpdate(packet.wrapperContained); }
public void onMapUpdate(yarnwrap.network.packet.s2c.play.MapUpdateS2CPacket packet) { wrapperContained.onMapUpdate(packet.wrapperContained); }
// public static void onMapUpdate(yarnwrap.network.packet.s2c.play.MapUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onMapUpdate(packet.wrapperContained); }
public void onOpenHorseScreen(yarnwrap.network.packet.s2c.play.OpenHorseScreenS2CPacket packet) { wrapperContained.onOpenHorseScreen(packet.wrapperContained); }
// public static void onOpenHorseScreen(yarnwrap.network.packet.s2c.play.OpenHorseScreenS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onOpenHorseScreen(packet.wrapperContained); }
public void onCraftFailedResponse(yarnwrap.network.packet.s2c.play.CraftFailedResponseS2CPacket packet) { wrapperContained.onCraftFailedResponse(packet.wrapperContained); }
// public static void onCraftFailedResponse(yarnwrap.network.packet.s2c.play.CraftFailedResponseS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onCraftFailedResponse(packet.wrapperContained); }
public void onLookAt(yarnwrap.network.packet.s2c.play.LookAtS2CPacket packet) { wrapperContained.onLookAt(packet.wrapperContained); }
// public static void onLookAt(yarnwrap.network.packet.s2c.play.LookAtS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onLookAt(packet.wrapperContained); }
public void onEntityTrackerUpdate(yarnwrap.network.packet.s2c.play.EntityTrackerUpdateS2CPacket packet) { wrapperContained.onEntityTrackerUpdate(packet.wrapperContained); }
// public static void onEntityTrackerUpdate(yarnwrap.network.packet.s2c.play.EntityTrackerUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityTrackerUpdate(packet.wrapperContained); }
public void onBlockEntityUpdate(yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket packet) { wrapperContained.onBlockEntityUpdate(packet.wrapperContained); }
// public static void onBlockEntityUpdate(yarnwrap.network.packet.s2c.play.BlockEntityUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBlockEntityUpdate(packet.wrapperContained); }
public void onEntitiesDestroy(yarnwrap.network.packet.s2c.play.EntitiesDestroyS2CPacket packet) { wrapperContained.onEntitiesDestroy(packet.wrapperContained); }
// public static void onEntitiesDestroy(yarnwrap.network.packet.s2c.play.EntitiesDestroyS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntitiesDestroy(packet.wrapperContained); }
public void onWorldEvent(yarnwrap.network.packet.s2c.play.WorldEventS2CPacket packet) { wrapperContained.onWorldEvent(packet.wrapperContained); }
// public static void onWorldEvent(yarnwrap.network.packet.s2c.play.WorldEventS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldEvent(packet.wrapperContained); }
public void onTeam(yarnwrap.network.packet.s2c.play.TeamS2CPacket packet) { wrapperContained.onTeam(packet.wrapperContained); }
// public static void onTeam(yarnwrap.network.packet.s2c.play.TeamS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTeam(packet.wrapperContained); }
public void onChunkDeltaUpdate(yarnwrap.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket packet) { wrapperContained.onChunkDeltaUpdate(packet.wrapperContained); }
// public static void onChunkDeltaUpdate(yarnwrap.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkDeltaUpdate(packet.wrapperContained); }
public void onExperienceBarUpdate(yarnwrap.network.packet.s2c.play.ExperienceBarUpdateS2CPacket packet) { wrapperContained.onExperienceBarUpdate(packet.wrapperContained); }
// public static void onExperienceBarUpdate(yarnwrap.network.packet.s2c.play.ExperienceBarUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onExperienceBarUpdate(packet.wrapperContained); }
public void onCloseScreen(yarnwrap.network.packet.s2c.play.CloseScreenS2CPacket packet) { wrapperContained.onCloseScreen(packet.wrapperContained); }
// public static void onCloseScreen(yarnwrap.network.packet.s2c.play.CloseScreenS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onCloseScreen(packet.wrapperContained); }
public void onPlayerListHeader(yarnwrap.network.packet.s2c.play.PlayerListHeaderS2CPacket packet) { wrapperContained.onPlayerListHeader(packet.wrapperContained); }
// public static void onPlayerListHeader(yarnwrap.network.packet.s2c.play.PlayerListHeaderS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerListHeader(packet.wrapperContained); }
public void onSynchronizeRecipes(yarnwrap.network.packet.s2c.play.SynchronizeRecipesS2CPacket packet) { wrapperContained.onSynchronizeRecipes(packet.wrapperContained); }
// public static void onSynchronizeRecipes(yarnwrap.network.packet.s2c.play.SynchronizeRecipesS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSynchronizeRecipes(packet.wrapperContained); }
public void onUnloadChunk(yarnwrap.network.packet.s2c.play.UnloadChunkS2CPacket packet) { wrapperContained.onUnloadChunk(packet.wrapperContained); }
// public static void onUnloadChunk(yarnwrap.network.packet.s2c.play.UnloadChunkS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onUnloadChunk(packet.wrapperContained); }
public void onSignEditorOpen(yarnwrap.network.packet.s2c.play.SignEditorOpenS2CPacket packet) { wrapperContained.onSignEditorOpen(packet.wrapperContained); }
// public static void onSignEditorOpen(yarnwrap.network.packet.s2c.play.SignEditorOpenS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSignEditorOpen(packet.wrapperContained); }
public void onScreenHandlerSlotUpdate(yarnwrap.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket packet) { wrapperContained.onScreenHandlerSlotUpdate(packet.wrapperContained); }
// public static void onScreenHandlerSlotUpdate(yarnwrap.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScreenHandlerSlotUpdate(packet.wrapperContained); }
public void onEntityAttach(yarnwrap.network.packet.s2c.play.EntityAttachS2CPacket packet) { wrapperContained.onEntityAttach(packet.wrapperContained); }
// public static void onEntityAttach(yarnwrap.network.packet.s2c.play.EntityAttachS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityAttach(packet.wrapperContained); }
public void onSetCameraEntity(yarnwrap.network.packet.s2c.play.SetCameraEntityS2CPacket packet) { wrapperContained.onSetCameraEntity(packet.wrapperContained); }
// public static void onSetCameraEntity(yarnwrap.network.packet.s2c.play.SetCameraEntityS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSetCameraEntity(packet.wrapperContained); }
public void onEntitySpawn(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet) { wrapperContained.onEntitySpawn(packet.wrapperContained); }
// public static void onEntitySpawn(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntitySpawn(packet.wrapperContained); }
public void onPlayerList(yarnwrap.network.packet.s2c.play.PlayerListS2CPacket packet) { wrapperContained.onPlayerList(packet.wrapperContained); }
// public static void onPlayerList(yarnwrap.network.packet.s2c.play.PlayerListS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerList(packet.wrapperContained); }
public void onRecipeBookRemove(yarnwrap.network.packet.s2c.play.RecipeBookRemoveS2CPacket packet) { wrapperContained.onRecipeBookRemove(packet.wrapperContained); }
// public static void onRecipeBookRemove(yarnwrap.network.packet.s2c.play.RecipeBookRemoveS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onRecipeBookRemove(packet.wrapperContained); }
public void onBlockBreakingProgress(yarnwrap.network.packet.s2c.play.BlockBreakingProgressS2CPacket packet) { wrapperContained.onBlockBreakingProgress(packet.wrapperContained); }
// public static void onBlockBreakingProgress(yarnwrap.network.packet.s2c.play.BlockBreakingProgressS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBlockBreakingProgress(packet.wrapperContained); }
public void onPlayerRespawn(yarnwrap.network.packet.s2c.play.PlayerRespawnS2CPacket packet) { wrapperContained.onPlayerRespawn(packet.wrapperContained); }
// public static void onPlayerRespawn(yarnwrap.network.packet.s2c.play.PlayerRespawnS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerRespawn(packet.wrapperContained); }
public void onScoreboardScoreUpdate(yarnwrap.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket packet) { wrapperContained.onScoreboardScoreUpdate(packet.wrapperContained); }
// public static void onScoreboardScoreUpdate(yarnwrap.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScoreboardScoreUpdate(packet.wrapperContained); }
public void onRemoveEntityStatusEffect(yarnwrap.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket packet) { wrapperContained.onRemoveEntityStatusEffect(packet.wrapperContained); }
// public static void onRemoveEntityStatusEffect(yarnwrap.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onRemoveEntityStatusEffect(packet.wrapperContained); }
public void onGameJoin(yarnwrap.network.packet.s2c.play.GameJoinS2CPacket packet) { wrapperContained.onGameJoin(packet.wrapperContained); }
// public static void onGameJoin(yarnwrap.network.packet.s2c.play.GameJoinS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onGameJoin(packet.wrapperContained); }
public void onHealthUpdate(yarnwrap.network.packet.s2c.play.HealthUpdateS2CPacket packet) { wrapperContained.onHealthUpdate(packet.wrapperContained); }
// public static void onHealthUpdate(yarnwrap.network.packet.s2c.play.HealthUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onHealthUpdate(packet.wrapperContained); }
public void onExplosion(yarnwrap.network.packet.s2c.play.ExplosionS2CPacket packet) { wrapperContained.onExplosion(packet.wrapperContained); }
// public static void onExplosion(yarnwrap.network.packet.s2c.play.ExplosionS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onExplosion(packet.wrapperContained); }
public void onPlaySoundFromEntity(yarnwrap.network.packet.s2c.play.PlaySoundFromEntityS2CPacket packet) { wrapperContained.onPlaySoundFromEntity(packet.wrapperContained); }
// public static void onPlaySoundFromEntity(yarnwrap.network.packet.s2c.play.PlaySoundFromEntityS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlaySoundFromEntity(packet.wrapperContained); }
public void onNbtQueryResponse(yarnwrap.network.packet.s2c.play.NbtQueryResponseS2CPacket packet) { wrapperContained.onNbtQueryResponse(packet.wrapperContained); }
// public static void onNbtQueryResponse(yarnwrap.network.packet.s2c.play.NbtQueryResponseS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onNbtQueryResponse(packet.wrapperContained); }
public void onChunkData(yarnwrap.network.packet.s2c.play.ChunkDataS2CPacket packet) { wrapperContained.onChunkData(packet.wrapperContained); }
// public static void onChunkData(yarnwrap.network.packet.s2c.play.ChunkDataS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkData(packet.wrapperContained); }
public void onStatistics(yarnwrap.network.packet.s2c.play.StatisticsS2CPacket packet) { wrapperContained.onStatistics(packet.wrapperContained); }
// public static void onStatistics(yarnwrap.network.packet.s2c.play.StatisticsS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onStatistics(packet.wrapperContained); }
public void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet) { wrapperContained.onAdvancements(packet.wrapperContained); }
// public static void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onAdvancements(packet.wrapperContained); }
public void onScreenHandlerPropertyUpdate(yarnwrap.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket packet) { wrapperContained.onScreenHandlerPropertyUpdate(packet.wrapperContained); }
// public static void onScreenHandlerPropertyUpdate(yarnwrap.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScreenHandlerPropertyUpdate(packet.wrapperContained); }
public void onEntityVelocityUpdate(yarnwrap.network.packet.s2c.play.EntityVelocityUpdateS2CPacket packet) { wrapperContained.onEntityVelocityUpdate(packet.wrapperContained); }
// public static void onEntityVelocityUpdate(yarnwrap.network.packet.s2c.play.EntityVelocityUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityVelocityUpdate(packet.wrapperContained); }
public void onVehicleMove(yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket packet) { wrapperContained.onVehicleMove(packet.wrapperContained); }
// public static void onVehicleMove(yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onVehicleMove(packet.wrapperContained); }
public void onUpdateSelectedSlot(yarnwrap.network.packet.s2c.play.UpdateSelectedSlotS2CPacket packet) { wrapperContained.onUpdateSelectedSlot(packet.wrapperContained); }
// public static void onUpdateSelectedSlot(yarnwrap.network.packet.s2c.play.UpdateSelectedSlotS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onUpdateSelectedSlot(packet.wrapperContained); }
public void onBlockUpdate(yarnwrap.network.packet.s2c.play.BlockUpdateS2CPacket packet) { wrapperContained.onBlockUpdate(packet.wrapperContained); }
// public static void onBlockUpdate(yarnwrap.network.packet.s2c.play.BlockUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBlockUpdate(packet.wrapperContained); }
public void onEntitySetHeadYaw(yarnwrap.network.packet.s2c.play.EntitySetHeadYawS2CPacket packet) { wrapperContained.onEntitySetHeadYaw(packet.wrapperContained); }
// public static void onEntitySetHeadYaw(yarnwrap.network.packet.s2c.play.EntitySetHeadYawS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntitySetHeadYaw(packet.wrapperContained); }
public void onDifficulty(yarnwrap.network.packet.s2c.play.DifficultyS2CPacket packet) { wrapperContained.onDifficulty(packet.wrapperContained); }
// public static void onDifficulty(yarnwrap.network.packet.s2c.play.DifficultyS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onDifficulty(packet.wrapperContained); }
public void onPlayerSpawnPosition(yarnwrap.network.packet.s2c.play.PlayerSpawnPositionS2CPacket packet) { wrapperContained.onPlayerSpawnPosition(packet.wrapperContained); }
// public static void onPlayerSpawnPosition(yarnwrap.network.packet.s2c.play.PlayerSpawnPositionS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerSpawnPosition(packet.wrapperContained); }
public void onLightUpdate(yarnwrap.network.packet.s2c.play.LightUpdateS2CPacket packet) { wrapperContained.onLightUpdate(packet.wrapperContained); }
// public static void onLightUpdate(yarnwrap.network.packet.s2c.play.LightUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onLightUpdate(packet.wrapperContained); }
public void onScoreboardObjectiveUpdate(yarnwrap.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket packet) { wrapperContained.onScoreboardObjectiveUpdate(packet.wrapperContained); }
// public static void onScoreboardObjectiveUpdate(yarnwrap.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScoreboardObjectiveUpdate(packet.wrapperContained); }
public void onCommandTree(yarnwrap.network.packet.s2c.play.CommandTreeS2CPacket packet) { wrapperContained.onCommandTree(packet.wrapperContained); }
// public static void onCommandTree(yarnwrap.network.packet.s2c.play.CommandTreeS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onCommandTree(packet.wrapperContained); }
public void onPlaySound(yarnwrap.network.packet.s2c.play.PlaySoundS2CPacket packet) { wrapperContained.onPlaySound(packet.wrapperContained); }
// public static void onPlaySound(yarnwrap.network.packet.s2c.play.PlaySoundS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlaySound(packet.wrapperContained); }
public void onEntityStatus(yarnwrap.network.packet.s2c.play.EntityStatusS2CPacket packet) { wrapperContained.onEntityStatus(packet.wrapperContained); }
// public static void onEntityStatus(yarnwrap.network.packet.s2c.play.EntityStatusS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityStatus(packet.wrapperContained); }
public void onEntityAttributes(yarnwrap.network.packet.s2c.play.EntityAttributesS2CPacket packet) { wrapperContained.onEntityAttributes(packet.wrapperContained); }
// public static void onEntityAttributes(yarnwrap.network.packet.s2c.play.EntityAttributesS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityAttributes(packet.wrapperContained); }
public void onItemPickupAnimation(yarnwrap.network.packet.s2c.play.ItemPickupAnimationS2CPacket packet) { wrapperContained.onItemPickupAnimation(packet.wrapperContained); }
// public static void onItemPickupAnimation(yarnwrap.network.packet.s2c.play.ItemPickupAnimationS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onItemPickupAnimation(packet.wrapperContained); }
public void onEntityEquipmentUpdate(yarnwrap.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket packet) { wrapperContained.onEntityEquipmentUpdate(packet.wrapperContained); }
// public static void onEntityEquipmentUpdate(yarnwrap.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityEquipmentUpdate(packet.wrapperContained); }
public void onInventory(yarnwrap.network.packet.s2c.play.InventoryS2CPacket packet) { wrapperContained.onInventory(packet.wrapperContained); }
// public static void onInventory(yarnwrap.network.packet.s2c.play.InventoryS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onInventory(packet.wrapperContained); }
public void onPlayerAbilities(yarnwrap.network.packet.s2c.play.PlayerAbilitiesS2CPacket packet) { wrapperContained.onPlayerAbilities(packet.wrapperContained); }
// public static void onPlayerAbilities(yarnwrap.network.packet.s2c.play.PlayerAbilitiesS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerAbilities(packet.wrapperContained); }
public void onEntity(yarnwrap.network.packet.s2c.play.EntityS2CPacket packet) { wrapperContained.onEntity(packet.wrapperContained); }
// public static void onEntity(yarnwrap.network.packet.s2c.play.EntityS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntity(packet.wrapperContained); }
public void onPlayerPositionLook(yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket packet) { wrapperContained.onPlayerPositionLook(packet.wrapperContained); }
// public static void onPlayerPositionLook(yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerPositionLook(packet.wrapperContained); }
public void onBlockEvent(yarnwrap.network.packet.s2c.play.BlockEventS2CPacket packet) { wrapperContained.onBlockEvent(packet.wrapperContained); }
// public static void onBlockEvent(yarnwrap.network.packet.s2c.play.BlockEventS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBlockEvent(packet.wrapperContained); }
public void onScoreboardDisplay(yarnwrap.network.packet.s2c.play.ScoreboardDisplayS2CPacket packet) { wrapperContained.onScoreboardDisplay(packet.wrapperContained); }
// public static void onScoreboardDisplay(yarnwrap.network.packet.s2c.play.ScoreboardDisplayS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScoreboardDisplay(packet.wrapperContained); }
public void onEntityAnimation(yarnwrap.network.packet.s2c.play.EntityAnimationS2CPacket packet) { wrapperContained.onEntityAnimation(packet.wrapperContained); }
// public static void onEntityAnimation(yarnwrap.network.packet.s2c.play.EntityAnimationS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityAnimation(packet.wrapperContained); }
public void onSelectAdvancementTab(yarnwrap.network.packet.s2c.play.SelectAdvancementTabS2CPacket packet) { wrapperContained.onSelectAdvancementTab(packet.wrapperContained); }
// public static void onSelectAdvancementTab(yarnwrap.network.packet.s2c.play.SelectAdvancementTabS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSelectAdvancementTab(packet.wrapperContained); }
public void onOpenWrittenBook(yarnwrap.network.packet.s2c.play.OpenWrittenBookS2CPacket packet) { wrapperContained.onOpenWrittenBook(packet.wrapperContained); }
// public static void onOpenWrittenBook(yarnwrap.network.packet.s2c.play.OpenWrittenBookS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onOpenWrittenBook(packet.wrapperContained); }
public void onSetTradeOffers(yarnwrap.network.packet.s2c.play.SetTradeOffersS2CPacket packet) { wrapperContained.onSetTradeOffers(packet.wrapperContained); }
// public static void onSetTradeOffers(yarnwrap.network.packet.s2c.play.SetTradeOffersS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSetTradeOffers(packet.wrapperContained); }
public void onOpenScreen(yarnwrap.network.packet.s2c.play.OpenScreenS2CPacket packet) { wrapperContained.onOpenScreen(packet.wrapperContained); }
// public static void onOpenScreen(yarnwrap.network.packet.s2c.play.OpenScreenS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onOpenScreen(packet.wrapperContained); }
public void onChunkLoadDistance(yarnwrap.network.packet.s2c.play.ChunkLoadDistanceS2CPacket packet) { wrapperContained.onChunkLoadDistance(packet.wrapperContained); }
// public static void onChunkLoadDistance(yarnwrap.network.packet.s2c.play.ChunkLoadDistanceS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkLoadDistance(packet.wrapperContained); }
public void onChunkRenderDistanceCenter(yarnwrap.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket packet) { wrapperContained.onChunkRenderDistanceCenter(packet.wrapperContained); }
// public static void onChunkRenderDistanceCenter(yarnwrap.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkRenderDistanceCenter(packet.wrapperContained); }
public void onPlayerActionResponse(yarnwrap.network.packet.s2c.play.PlayerActionResponseS2CPacket packet) { wrapperContained.onPlayerActionResponse(packet.wrapperContained); }
// public static void onPlayerActionResponse(yarnwrap.network.packet.s2c.play.PlayerActionResponseS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerActionResponse(packet.wrapperContained); }
public void onTitleClear(yarnwrap.network.packet.s2c.play.ClearTitleS2CPacket packet) { wrapperContained.onTitleClear(packet.wrapperContained); }
// public static void onTitleClear(yarnwrap.network.packet.s2c.play.ClearTitleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTitleClear(packet.wrapperContained); }
public void onWorldBorderInitialize(yarnwrap.network.packet.s2c.play.WorldBorderInitializeS2CPacket packet) { wrapperContained.onWorldBorderInitialize(packet.wrapperContained); }
// public static void onWorldBorderInitialize(yarnwrap.network.packet.s2c.play.WorldBorderInitializeS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderInitialize(packet.wrapperContained); }
public void onEndCombat(yarnwrap.network.packet.s2c.play.EndCombatS2CPacket packet) { wrapperContained.onEndCombat(packet.wrapperContained); }
// public static void onEndCombat(yarnwrap.network.packet.s2c.play.EndCombatS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEndCombat(packet.wrapperContained); }
public void onEnterCombat(yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket packet) { wrapperContained.onEnterCombat(packet.wrapperContained); }
// public static void onEnterCombat(yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEnterCombat(packet.wrapperContained); }
public void onDeathMessage(yarnwrap.network.packet.s2c.play.DeathMessageS2CPacket packet) { wrapperContained.onDeathMessage(packet.wrapperContained); }
// public static void onDeathMessage(yarnwrap.network.packet.s2c.play.DeathMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onDeathMessage(packet.wrapperContained); }
public void onOverlayMessage(yarnwrap.network.packet.s2c.play.OverlayMessageS2CPacket packet) { wrapperContained.onOverlayMessage(packet.wrapperContained); }
// public static void onOverlayMessage(yarnwrap.network.packet.s2c.play.OverlayMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onOverlayMessage(packet.wrapperContained); }
public void onWorldBorderCenterChanged(yarnwrap.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket packet) { wrapperContained.onWorldBorderCenterChanged(packet.wrapperContained); }
// public static void onWorldBorderCenterChanged(yarnwrap.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderCenterChanged(packet.wrapperContained); }
public void onWorldBorderInterpolateSize(yarnwrap.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket packet) { wrapperContained.onWorldBorderInterpolateSize(packet.wrapperContained); }
// public static void onWorldBorderInterpolateSize(yarnwrap.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderInterpolateSize(packet.wrapperContained); }
public void onWorldBorderSizeChanged(yarnwrap.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket packet) { wrapperContained.onWorldBorderSizeChanged(packet.wrapperContained); }
// public static void onWorldBorderSizeChanged(yarnwrap.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderSizeChanged(packet.wrapperContained); }
public void onWorldBorderWarningTimeChanged(yarnwrap.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket packet) { wrapperContained.onWorldBorderWarningTimeChanged(packet.wrapperContained); }
// public static void onWorldBorderWarningTimeChanged(yarnwrap.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderWarningTimeChanged(packet.wrapperContained); }
public void onWorldBorderWarningBlocksChanged(yarnwrap.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket packet) { wrapperContained.onWorldBorderWarningBlocksChanged(packet.wrapperContained); }
// public static void onWorldBorderWarningBlocksChanged(yarnwrap.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWorldBorderWarningBlocksChanged(packet.wrapperContained); }
public void onSubtitle(yarnwrap.network.packet.s2c.play.SubtitleS2CPacket packet) { wrapperContained.onSubtitle(packet.wrapperContained); }
// public static void onSubtitle(yarnwrap.network.packet.s2c.play.SubtitleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSubtitle(packet.wrapperContained); }
public void onTitle(yarnwrap.network.packet.s2c.play.TitleS2CPacket packet) { wrapperContained.onTitle(packet.wrapperContained); }
// public static void onTitle(yarnwrap.network.packet.s2c.play.TitleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTitle(packet.wrapperContained); }
public void onTitleFade(yarnwrap.network.packet.s2c.play.TitleFadeS2CPacket packet) { wrapperContained.onTitleFade(packet.wrapperContained); }
// public static void onTitleFade(yarnwrap.network.packet.s2c.play.TitleFadeS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTitleFade(packet.wrapperContained); }
public void onSimulationDistance(yarnwrap.network.packet.s2c.play.SimulationDistanceS2CPacket packet) { wrapperContained.onSimulationDistance(packet.wrapperContained); }
// public static void onSimulationDistance(yarnwrap.network.packet.s2c.play.SimulationDistanceS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSimulationDistance(packet.wrapperContained); }
public void onChatMessage(yarnwrap.network.packet.s2c.play.ChatMessageS2CPacket packet) { wrapperContained.onChatMessage(packet.wrapperContained); }
// public static void onChatMessage(yarnwrap.network.packet.s2c.play.ChatMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChatMessage(packet.wrapperContained); }
public void onGameMessage(yarnwrap.network.packet.s2c.play.GameMessageS2CPacket packet) { wrapperContained.onGameMessage(packet.wrapperContained); }
// public static void onGameMessage(yarnwrap.network.packet.s2c.play.GameMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onGameMessage(packet.wrapperContained); }
public void onServerMetadata(yarnwrap.network.packet.s2c.play.ServerMetadataS2CPacket packet) { wrapperContained.onServerMetadata(packet.wrapperContained); }
// public static void onServerMetadata(yarnwrap.network.packet.s2c.play.ServerMetadataS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onServerMetadata(packet.wrapperContained); }
public void onChatSuggestions(yarnwrap.network.packet.s2c.play.ChatSuggestionsS2CPacket packet) { wrapperContained.onChatSuggestions(packet.wrapperContained); }
// public static void onChatSuggestions(yarnwrap.network.packet.s2c.play.ChatSuggestionsS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChatSuggestions(packet.wrapperContained); }
public void onRemoveMessage(yarnwrap.network.packet.s2c.play.RemoveMessageS2CPacket packet) { wrapperContained.onRemoveMessage(packet.wrapperContained); }
// public static void onRemoveMessage(yarnwrap.network.packet.s2c.play.RemoveMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onRemoveMessage(packet.wrapperContained); }
public void onProfilelessChatMessage(yarnwrap.network.packet.s2c.play.ProfilelessChatMessageS2CPacket packet) { wrapperContained.onProfilelessChatMessage(packet.wrapperContained); }
// public static void onProfilelessChatMessage(yarnwrap.network.packet.s2c.play.ProfilelessChatMessageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onProfilelessChatMessage(packet.wrapperContained); }
public void onPlayerRemove(yarnwrap.network.packet.s2c.play.PlayerRemoveS2CPacket packet) { wrapperContained.onPlayerRemove(packet.wrapperContained); }
// public static void onPlayerRemove(yarnwrap.network.packet.s2c.play.PlayerRemoveS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerRemove(packet.wrapperContained); }
public void onBundle(yarnwrap.network.packet.s2c.play.BundleS2CPacket packet) { wrapperContained.onBundle(packet.wrapperContained); }
// public static void onBundle(yarnwrap.network.packet.s2c.play.BundleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onBundle(packet.wrapperContained); }
public void onDamageTilt(yarnwrap.network.packet.s2c.play.DamageTiltS2CPacket packet) { wrapperContained.onDamageTilt(packet.wrapperContained); }
// public static void onDamageTilt(yarnwrap.network.packet.s2c.play.DamageTiltS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onDamageTilt(packet.wrapperContained); }
public void onEntityDamage(yarnwrap.network.packet.s2c.play.EntityDamageS2CPacket packet) { wrapperContained.onEntityDamage(packet.wrapperContained); }
// public static void onEntityDamage(yarnwrap.network.packet.s2c.play.EntityDamageS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityDamage(packet.wrapperContained); }
public void onChunkBiomeData(yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket packet) { wrapperContained.onChunkBiomeData(packet.wrapperContained); }
// public static void onChunkBiomeData(yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkBiomeData(packet.wrapperContained); }
public void onEnterReconfiguration(yarnwrap.network.packet.s2c.play.EnterReconfigurationS2CPacket packet) { wrapperContained.onEnterReconfiguration(packet.wrapperContained); }
// public static void onEnterReconfiguration(yarnwrap.network.packet.s2c.play.EnterReconfigurationS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEnterReconfiguration(packet.wrapperContained); }
public void onChunkSent(yarnwrap.network.packet.s2c.play.ChunkSentS2CPacket packet) { wrapperContained.onChunkSent(packet.wrapperContained); }
// public static void onChunkSent(yarnwrap.network.packet.s2c.play.ChunkSentS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onChunkSent(packet.wrapperContained); }
public void onStartChunkSend(yarnwrap.network.packet.s2c.play.StartChunkSendS2CPacket packet) { wrapperContained.onStartChunkSend(packet.wrapperContained); }
// public static void onStartChunkSend(yarnwrap.network.packet.s2c.play.StartChunkSendS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onStartChunkSend(packet.wrapperContained); }
public void onUpdateTickRate(yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket packet) { wrapperContained.onUpdateTickRate(packet.wrapperContained); }
// public static void onUpdateTickRate(yarnwrap.network.packet.s2c.play.UpdateTickRateS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onUpdateTickRate(packet.wrapperContained); }
public void onTickStep(yarnwrap.network.packet.s2c.play.TickStepS2CPacket packet) { wrapperContained.onTickStep(packet.wrapperContained); }
// public static void onTickStep(yarnwrap.network.packet.s2c.play.TickStepS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTickStep(packet.wrapperContained); }
public void onScoreboardScoreReset(yarnwrap.network.packet.s2c.play.ScoreboardScoreResetS2CPacket packet) { wrapperContained.onScoreboardScoreReset(packet.wrapperContained); }
// public static void onScoreboardScoreReset(yarnwrap.network.packet.s2c.play.ScoreboardScoreResetS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onScoreboardScoreReset(packet.wrapperContained); }
public void onDebugSample(yarnwrap.network.packet.s2c.play.DebugSampleS2CPacket packet) { wrapperContained.onDebugSample(packet.wrapperContained); }
// public static void onDebugSample(yarnwrap.network.packet.s2c.play.DebugSampleS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onDebugSample(packet.wrapperContained); }
public void onProjectilePower(yarnwrap.network.packet.s2c.play.ProjectilePowerS2CPacket packet) { wrapperContained.onProjectilePower(packet.wrapperContained); }
// public static void onProjectilePower(yarnwrap.network.packet.s2c.play.ProjectilePowerS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onProjectilePower(packet.wrapperContained); }
public void onMoveMinecartAlongTrack(yarnwrap.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket packet) { wrapperContained.onMoveMinecartAlongTrack(packet.wrapperContained); }
// public static void onMoveMinecartAlongTrack(yarnwrap.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onMoveMinecartAlongTrack(packet.wrapperContained); }
public void onSetCursorItem(yarnwrap.network.packet.s2c.play.SetCursorItemS2CPacket packet) { wrapperContained.onSetCursorItem(packet.wrapperContained); }
// public static void onSetCursorItem(yarnwrap.network.packet.s2c.play.SetCursorItemS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSetCursorItem(packet.wrapperContained); }
public void onSetPlayerInventory(yarnwrap.network.packet.s2c.play.SetPlayerInventoryS2CPacket packet) { wrapperContained.onSetPlayerInventory(packet.wrapperContained); }
// public static void onSetPlayerInventory(yarnwrap.network.packet.s2c.play.SetPlayerInventoryS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onSetPlayerInventory(packet.wrapperContained); }
public void onEntityPositionSync(yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket packet) { wrapperContained.onEntityPositionSync(packet.wrapperContained); }
// public static void onEntityPositionSync(yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onEntityPositionSync(packet.wrapperContained); }
public void onPlayerRotation(yarnwrap.network.packet.s2c.play.PlayerRotationS2CPacket packet) { wrapperContained.onPlayerRotation(packet.wrapperContained); }
// public static void onPlayerRotation(yarnwrap.network.packet.s2c.play.PlayerRotationS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onPlayerRotation(packet.wrapperContained); }
public void onRecipeBookAdd(yarnwrap.network.packet.s2c.play.RecipeBookAddS2CPacket packet) { wrapperContained.onRecipeBookAdd(packet.wrapperContained); }
// public static void onRecipeBookAdd(yarnwrap.network.packet.s2c.play.RecipeBookAddS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onRecipeBookAdd(packet.wrapperContained); }
public void onRecipeBookSettings(yarnwrap.network.packet.s2c.play.RecipeBookSettingsS2CPacket packet) { wrapperContained.onRecipeBookSettings(packet.wrapperContained); }
// public static void onRecipeBookSettings(yarnwrap.network.packet.s2c.play.RecipeBookSettingsS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onRecipeBookSettings(packet.wrapperContained); }
public void onTestInstanceBlockStatus(yarnwrap.network.packet.s2c.play.TestInstanceBlockStatusS2CPacket packet) { wrapperContained.onTestInstanceBlockStatus(packet.wrapperContained); }
// public static void onTestInstanceBlockStatus(yarnwrap.network.packet.s2c.play.TestInstanceBlockStatusS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onTestInstanceBlockStatus(packet.wrapperContained); }
// public void onWaypoint(yarnwrap.network.packet.s2c.play.WaypointS2CPacket packet) { wrapperContained.onWaypoint(packet.wrapperContained); }
// public static void onWaypoint(yarnwrap.network.packet.s2c.play.WaypointS2CPacket packet, ) { net.minecraft.network.listener.ClientPlayPacketListener.onWaypoint(packet.wrapperContained); }

}