package yarnwrap.network.listener;
public class ServerPlayPacketListener { public net.minecraft.network.listener.ServerPlayPacketListener wrapperContained; public ServerPlayPacketListener(net.minecraft.network.listener.ServerPlayPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onClientCommand(yarnwrap.network.packet.c2s.play.ClientCommandC2SPacket packet) { wrapperContained.onClientCommand(packet.wrapperContained); }
// public static void onClientCommand(yarnwrap.network.packet.c2s.play.ClientCommandC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onClientCommand(packet.wrapperContained); }
public void onPlayerInteractBlock(yarnwrap.network.packet.c2s.play.PlayerInteractBlockC2SPacket packet) { wrapperContained.onPlayerInteractBlock(packet.wrapperContained); }
// public static void onPlayerInteractBlock(yarnwrap.network.packet.c2s.play.PlayerInteractBlockC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerInteractBlock(packet.wrapperContained); }
public void onRecipeBookData(yarnwrap.network.packet.c2s.play.RecipeBookDataC2SPacket packet) { wrapperContained.onRecipeBookData(packet.wrapperContained); }
// public static void onRecipeBookData(yarnwrap.network.packet.c2s.play.RecipeBookDataC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onRecipeBookData(packet.wrapperContained); }
public void onChatMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet) { wrapperContained.onChatMessage(packet.wrapperContained); }
// public static void onChatMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onChatMessage(packet.wrapperContained); }
public void onUpdateCommandBlockMinecart(yarnwrap.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket packet) { wrapperContained.onUpdateCommandBlockMinecart(packet.wrapperContained); }
// public static void onUpdateCommandBlockMinecart(yarnwrap.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateCommandBlockMinecart(packet.wrapperContained); }
public void onTeleportConfirm(yarnwrap.network.packet.c2s.play.TeleportConfirmC2SPacket packet) { wrapperContained.onTeleportConfirm(packet.wrapperContained); }
// public static void onTeleportConfirm(yarnwrap.network.packet.c2s.play.TeleportConfirmC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onTeleportConfirm(packet.wrapperContained); }
public void onUpdateStructureBlock(yarnwrap.network.packet.c2s.play.UpdateStructureBlockC2SPacket packet) { wrapperContained.onUpdateStructureBlock(packet.wrapperContained); }
// public static void onUpdateStructureBlock(yarnwrap.network.packet.c2s.play.UpdateStructureBlockC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateStructureBlock(packet.wrapperContained); }
public void onHandSwing(yarnwrap.network.packet.c2s.play.HandSwingC2SPacket packet) { wrapperContained.onHandSwing(packet.wrapperContained); }
// public static void onHandSwing(yarnwrap.network.packet.c2s.play.HandSwingC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onHandSwing(packet.wrapperContained); }
public void onBookUpdate(yarnwrap.network.packet.c2s.play.BookUpdateC2SPacket packet) { wrapperContained.onBookUpdate(packet.wrapperContained); }
// public static void onBookUpdate(yarnwrap.network.packet.c2s.play.BookUpdateC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onBookUpdate(packet.wrapperContained); }
public void onCloseHandledScreen(yarnwrap.network.packet.c2s.play.CloseHandledScreenC2SPacket packet) { wrapperContained.onCloseHandledScreen(packet.wrapperContained); }
// public static void onCloseHandledScreen(yarnwrap.network.packet.c2s.play.CloseHandledScreenC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onCloseHandledScreen(packet.wrapperContained); }
public void onButtonClick(yarnwrap.network.packet.c2s.play.ButtonClickC2SPacket packet) { wrapperContained.onButtonClick(packet.wrapperContained); }
// public static void onButtonClick(yarnwrap.network.packet.c2s.play.ButtonClickC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onButtonClick(packet.wrapperContained); }
public void onUpdateSelectedSlot(yarnwrap.network.packet.c2s.play.UpdateSelectedSlotC2SPacket packet) { wrapperContained.onUpdateSelectedSlot(packet.wrapperContained); }
// public static void onUpdateSelectedSlot(yarnwrap.network.packet.c2s.play.UpdateSelectedSlotC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateSelectedSlot(packet.wrapperContained); }
public void onUpdateBeacon(yarnwrap.network.packet.c2s.play.UpdateBeaconC2SPacket packet) { wrapperContained.onUpdateBeacon(packet.wrapperContained); }
// public static void onUpdateBeacon(yarnwrap.network.packet.c2s.play.UpdateBeaconC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateBeacon(packet.wrapperContained); }
public void onAdvancementTab(yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket packet) { wrapperContained.onAdvancementTab(packet.wrapperContained); }
// public static void onAdvancementTab(yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onAdvancementTab(packet.wrapperContained); }
public void onRequestCommandCompletions(yarnwrap.network.packet.c2s.play.RequestCommandCompletionsC2SPacket packet) { wrapperContained.onRequestCommandCompletions(packet.wrapperContained); }
// public static void onRequestCommandCompletions(yarnwrap.network.packet.c2s.play.RequestCommandCompletionsC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onRequestCommandCompletions(packet.wrapperContained); }
public void onRenameItem(yarnwrap.network.packet.c2s.play.RenameItemC2SPacket packet) { wrapperContained.onRenameItem(packet.wrapperContained); }
// public static void onRenameItem(yarnwrap.network.packet.c2s.play.RenameItemC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onRenameItem(packet.wrapperContained); }
public void onCraftRequest(yarnwrap.network.packet.c2s.play.CraftRequestC2SPacket packet) { wrapperContained.onCraftRequest(packet.wrapperContained); }
// public static void onCraftRequest(yarnwrap.network.packet.c2s.play.CraftRequestC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onCraftRequest(packet.wrapperContained); }
public void onPlayerInteractEntity(yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket packet) { wrapperContained.onPlayerInteractEntity(packet.wrapperContained); }
// public static void onPlayerInteractEntity(yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerInteractEntity(packet.wrapperContained); }
public void onPlayerMove(yarnwrap.network.packet.c2s.play.PlayerMoveC2SPacket packet) { wrapperContained.onPlayerMove(packet.wrapperContained); }
// public static void onPlayerMove(yarnwrap.network.packet.c2s.play.PlayerMoveC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerMove(packet.wrapperContained); }
public void onBoatPaddleState(yarnwrap.network.packet.c2s.play.BoatPaddleStateC2SPacket packet) { wrapperContained.onBoatPaddleState(packet.wrapperContained); }
// public static void onBoatPaddleState(yarnwrap.network.packet.c2s.play.BoatPaddleStateC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onBoatPaddleState(packet.wrapperContained); }
public void onPlayerInteractItem(yarnwrap.network.packet.c2s.play.PlayerInteractItemC2SPacket packet) { wrapperContained.onPlayerInteractItem(packet.wrapperContained); }
// public static void onPlayerInteractItem(yarnwrap.network.packet.c2s.play.PlayerInteractItemC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerInteractItem(packet.wrapperContained); }
public void onPlayerAction(yarnwrap.network.packet.c2s.play.PlayerActionC2SPacket packet) { wrapperContained.onPlayerAction(packet.wrapperContained); }
// public static void onPlayerAction(yarnwrap.network.packet.c2s.play.PlayerActionC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerAction(packet.wrapperContained); }
public void onPlayerInput(yarnwrap.network.packet.c2s.play.PlayerInputC2SPacket packet) { wrapperContained.onPlayerInput(packet.wrapperContained); }
// public static void onPlayerInput(yarnwrap.network.packet.c2s.play.PlayerInputC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerInput(packet.wrapperContained); }
public void onClientStatus(yarnwrap.network.packet.c2s.play.ClientStatusC2SPacket packet) { wrapperContained.onClientStatus(packet.wrapperContained); }
// public static void onClientStatus(yarnwrap.network.packet.c2s.play.ClientStatusC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onClientStatus(packet.wrapperContained); }
public void onCreativeInventoryAction(yarnwrap.network.packet.c2s.play.CreativeInventoryActionC2SPacket packet) { wrapperContained.onCreativeInventoryAction(packet.wrapperContained); }
// public static void onCreativeInventoryAction(yarnwrap.network.packet.c2s.play.CreativeInventoryActionC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onCreativeInventoryAction(packet.wrapperContained); }
public void onUpdateSign(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet) { wrapperContained.onUpdateSign(packet.wrapperContained); }
// public static void onUpdateSign(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateSign(packet.wrapperContained); }
public void onQueryBlockNbt(yarnwrap.network.packet.c2s.play.QueryBlockNbtC2SPacket packet) { wrapperContained.onQueryBlockNbt(packet.wrapperContained); }
// public static void onQueryBlockNbt(yarnwrap.network.packet.c2s.play.QueryBlockNbtC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onQueryBlockNbt(packet.wrapperContained); }
public void onSpectatorTeleport(yarnwrap.network.packet.c2s.play.SpectatorTeleportC2SPacket packet) { wrapperContained.onSpectatorTeleport(packet.wrapperContained); }
// public static void onSpectatorTeleport(yarnwrap.network.packet.c2s.play.SpectatorTeleportC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onSpectatorTeleport(packet.wrapperContained); }
public void onQueryEntityNbt(yarnwrap.network.packet.c2s.play.QueryEntityNbtC2SPacket packet) { wrapperContained.onQueryEntityNbt(packet.wrapperContained); }
// public static void onQueryEntityNbt(yarnwrap.network.packet.c2s.play.QueryEntityNbtC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onQueryEntityNbt(packet.wrapperContained); }
public void onClickSlot(yarnwrap.network.packet.c2s.play.ClickSlotC2SPacket packet) { wrapperContained.onClickSlot(packet.wrapperContained); }
// public static void onClickSlot(yarnwrap.network.packet.c2s.play.ClickSlotC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onClickSlot(packet.wrapperContained); }
public void onUpdateCommandBlock(yarnwrap.network.packet.c2s.play.UpdateCommandBlockC2SPacket packet) { wrapperContained.onUpdateCommandBlock(packet.wrapperContained); }
// public static void onUpdateCommandBlock(yarnwrap.network.packet.c2s.play.UpdateCommandBlockC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateCommandBlock(packet.wrapperContained); }
public void onVehicleMove(yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket packet) { wrapperContained.onVehicleMove(packet.wrapperContained); }
// public static void onVehicleMove(yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onVehicleMove(packet.wrapperContained); }
public void onSelectMerchantTrade(yarnwrap.network.packet.c2s.play.SelectMerchantTradeC2SPacket packet) { wrapperContained.onSelectMerchantTrade(packet.wrapperContained); }
// public static void onSelectMerchantTrade(yarnwrap.network.packet.c2s.play.SelectMerchantTradeC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onSelectMerchantTrade(packet.wrapperContained); }
public void onUpdatePlayerAbilities(yarnwrap.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket packet) { wrapperContained.onUpdatePlayerAbilities(packet.wrapperContained); }
// public static void onUpdatePlayerAbilities(yarnwrap.network.packet.c2s.play.UpdatePlayerAbilitiesC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdatePlayerAbilities(packet.wrapperContained); }
public void onPickFromInventory(yarnwrap.network.packet.c2s.play.PickFromInventoryC2SPacket packet) { wrapperContained.onPickFromInventory(packet.wrapperContained); }
// public static void onPickFromInventory(yarnwrap.network.packet.c2s.play.PickFromInventoryC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPickFromInventory(packet.wrapperContained); }
public void onUpdateJigsaw(yarnwrap.network.packet.c2s.play.UpdateJigsawC2SPacket packet) { wrapperContained.onUpdateJigsaw(packet.wrapperContained); }
// public static void onUpdateJigsaw(yarnwrap.network.packet.c2s.play.UpdateJigsawC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateJigsaw(packet.wrapperContained); }
public void onUpdateDifficulty(yarnwrap.network.packet.c2s.play.UpdateDifficultyC2SPacket packet) { wrapperContained.onUpdateDifficulty(packet.wrapperContained); }
// public static void onUpdateDifficulty(yarnwrap.network.packet.c2s.play.UpdateDifficultyC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateDifficulty(packet.wrapperContained); }
public void onUpdateDifficultyLock(yarnwrap.network.packet.c2s.play.UpdateDifficultyLockC2SPacket packet) { wrapperContained.onUpdateDifficultyLock(packet.wrapperContained); }
// public static void onUpdateDifficultyLock(yarnwrap.network.packet.c2s.play.UpdateDifficultyLockC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onUpdateDifficultyLock(packet.wrapperContained); }
public void onJigsawGenerating(yarnwrap.network.packet.c2s.play.JigsawGeneratingC2SPacket packet) { wrapperContained.onJigsawGenerating(packet.wrapperContained); }
// public static void onJigsawGenerating(yarnwrap.network.packet.c2s.play.JigsawGeneratingC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onJigsawGenerating(packet.wrapperContained); }
public void onRecipeCategoryOptions(yarnwrap.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket packet) { wrapperContained.onRecipeCategoryOptions(packet.wrapperContained); }
// public static void onRecipeCategoryOptions(yarnwrap.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onRecipeCategoryOptions(packet.wrapperContained); }
public void onCommandExecution(yarnwrap.network.packet.c2s.play.CommandExecutionC2SPacket packet) { wrapperContained.onCommandExecution(packet.wrapperContained); }
// public static void onCommandExecution(yarnwrap.network.packet.c2s.play.CommandExecutionC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onCommandExecution(packet.wrapperContained); }
public void onMessageAcknowledgment(yarnwrap.network.packet.c2s.play.MessageAcknowledgmentC2SPacket packet) { wrapperContained.onMessageAcknowledgment(packet.wrapperContained); }
// public static void onMessageAcknowledgment(yarnwrap.network.packet.c2s.play.MessageAcknowledgmentC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onMessageAcknowledgment(packet.wrapperContained); }
public void onPlayerSession(yarnwrap.network.packet.c2s.play.PlayerSessionC2SPacket packet) { wrapperContained.onPlayerSession(packet.wrapperContained); }
// public static void onPlayerSession(yarnwrap.network.packet.c2s.play.PlayerSessionC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onPlayerSession(packet.wrapperContained); }
public void onAcknowledgeChunks(yarnwrap.network.packet.c2s.play.AcknowledgeChunksC2SPacket packet) { wrapperContained.onAcknowledgeChunks(packet.wrapperContained); }
// public static void onAcknowledgeChunks(yarnwrap.network.packet.c2s.play.AcknowledgeChunksC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onAcknowledgeChunks(packet.wrapperContained); }
public void onAcknowledgeReconfiguration(yarnwrap.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket packet) { wrapperContained.onAcknowledgeReconfiguration(packet.wrapperContained); }
// public static void onAcknowledgeReconfiguration(yarnwrap.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onAcknowledgeReconfiguration(packet.wrapperContained); }
public void onSlotChangedState(yarnwrap.network.packet.c2s.play.SlotChangedStateC2SPacket packet) { wrapperContained.onSlotChangedState(packet.wrapperContained); }
// public static void onSlotChangedState(yarnwrap.network.packet.c2s.play.SlotChangedStateC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onSlotChangedState(packet.wrapperContained); }
public void onDebugSampleSubscription(yarnwrap.network.packet.c2s.play.DebugSampleSubscriptionC2SPacket packet) { wrapperContained.onDebugSampleSubscription(packet.wrapperContained); }
// public static void onDebugSampleSubscription(yarnwrap.network.packet.c2s.play.DebugSampleSubscriptionC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onDebugSampleSubscription(packet.wrapperContained); }
public void onChatCommandSigned(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet) { wrapperContained.onChatCommandSigned(packet.wrapperContained); }
// public static void onChatCommandSigned(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet, ) { net.minecraft.network.listener.ServerPlayPacketListener.onChatCommandSigned(packet.wrapperContained); }

}