package yarnwrap.server.network;
public class ServerPlayNetworkHandler { public net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained; public ServerPlayNetworkHandler(net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int messageCooldown() { return wrapperContained.messageCooldown; }
// public int movePacketsCount() { return wrapperContained.movePacketsCount; }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.util.math.Vec3d requestedTeleportPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.requestedTeleportPos); }
// public double updatedRiddenZ() { return wrapperContained.updatedRiddenZ; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public double updatedRiddenX() { return wrapperContained.updatedRiddenX; }
// public int requestedTeleportId() { return wrapperContained.requestedTeleportId; }
// public double lastTickRiddenY() { return wrapperContained.lastTickRiddenY; }
// public double updatedY() { return wrapperContained.updatedY; }
// public double lastTickZ() { return wrapperContained.lastTickZ; }
// public boolean vehicleFloating() { return wrapperContained.vehicleFloating; }
// public double lastTickX() { return wrapperContained.lastTickX; }
// public boolean floating() { return wrapperContained.floating; }
// public int creativeItemDropThreshold() { return wrapperContained.creativeItemDropThreshold; }
// public int lastTickMovePacketsCount() { return wrapperContained.lastTickMovePacketsCount; }
// public int vehicleFloatingTicks() { return wrapperContained.vehicleFloatingTicks; }
// public int floatingTicks() { return wrapperContained.floatingTicks; }
// public int prevTeleportCheckTicks() { return wrapperContained.prevTeleportCheckTicks; }
public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
// public double updatedRiddenY() { return wrapperContained.updatedRiddenY; }
// public double lastTickRiddenZ() { return wrapperContained.lastTickRiddenZ; }
// public double lastTickRiddenX() { return wrapperContained.lastTickRiddenX; }
// public double updatedZ() { return wrapperContained.updatedZ; }
// public double updatedX() { return wrapperContained.updatedX; }
// public double lastTickY() { return wrapperContained.lastTickY; }
// public yarnwrap.entity.Entity topmostRiddenEntity() { return new yarnwrap.entity.Entity(wrapperContained.topmostRiddenEntity); }
// public int DEFAULT_SEQUENCE() { return wrapperContained.DEFAULT_SEQUENCE; }
// public int sequence() { return wrapperContained.sequence; }
// public Object messageUnpacker() { return wrapperContained.messageUnpacker; }
// public yarnwrap.network.message.AcknowledgmentValidator acknowledgmentValidator() { return new yarnwrap.network.message.AcknowledgmentValidator(wrapperContained.acknowledgmentValidator); }
// public yarnwrap.network.message.MessageChainTaskQueue messageChainTaskQueue() { return new yarnwrap.network.message.MessageChainTaskQueue(wrapperContained.messageChainTaskQueue); }
// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public int MAX_PENDING_ACKNOWLEDGMENTS() { return wrapperContained.MAX_PENDING_ACKNOWLEDGMENTS; }
// public yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_VALIDATION_FAILED_TEXT); }
// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public boolean requestedReconfiguration() { return wrapperContained.requestedReconfiguration; }
public yarnwrap.server.network.ChunkDataSender chunkDataSender() { return new yarnwrap.server.network.ChunkDataSender(wrapperContained.chunkDataSender); }
// public yarnwrap.text.Text INVALID_COMMAND_SIGNATURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_COMMAND_SIGNATURE_TEXT); }
public void requestTeleport(double x,double y,double z,float yaw,float pitch,java.util.Set flags) { wrapperContained.requestTeleport(x,y,z,yaw,pitch,flags); }
public void requestTeleport(double x,double y,double z,float yaw,float pitch) { wrapperContained.requestTeleport(x,y,z,yaw,pitch); }
// public boolean isMovementInvalid(double x,double y,double z,float yaw,float pitch) { return wrapperContained.isMovementInvalid(x,y,z,yaw,pitch); }
public void syncWithPlayerPosition() { wrapperContained.syncWithPlayerPosition(); }
// public boolean isPlayerNotCollidingWithBlocks(yarnwrap.world.WorldView world,yarnwrap.util.math.Box box,double newX,double newY,double newZ) { return wrapperContained.isPlayerNotCollidingWithBlocks(world.wrapperContained,box.wrapperContained,newX,newY,newZ); }
// public boolean canPlace(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { return wrapperContained.canPlace(player.wrapperContained,stack.wrapperContained); }
// public boolean isEntityOnAir(yarnwrap.entity.Entity entity) { return wrapperContained.isEntityOnAir(entity.wrapperContained); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.Object text,java.util.function.BiFunction filterer) { return wrapperContained.filterText(text,filterer); }
// public void addBook(yarnwrap.server.filter.FilteredMessage title,java.util.List pages,int slotId) { wrapperContained.addBook(title.wrapperContained,pages,slotId); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.String text) { return wrapperContained.filterText(text); }
// public void updateBookContent(java.util.List pages,int slotId) { wrapperContained.updateBookContent(pages,slotId); }
// public java.util.concurrent.CompletableFuture filterTexts(java.util.List texts) { return wrapperContained.filterTexts(texts); }
// public void onSignUpdate(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet,java.util.List signText) { wrapperContained.onSignUpdate(packet.wrapperContained,signText); }
// public double clampHorizontal(double d) { return wrapperContained.clampHorizontal(d); }
// public double clampVertical(double d) { return wrapperContained.clampVertical(d); }
public void updateSequence(int sequence) { wrapperContained.updateSequence(sequence); }
// public boolean hasIllegalCharacter(java.lang.String message) { return wrapperContained.hasIllegalCharacter(message); }
// public void checkForSpam() { wrapperContained.checkForSpam(); }
// public void handleDecoratedMessage(yarnwrap.network.message.SignedMessage message) { wrapperContained.handleDecoratedMessage(message.wrapperContained); }
// public void validateMessage(java.lang.String message,java.lang.Runnable callback) { wrapperContained.validateMessage(message,callback); }
public void addPendingAcknowledgment(yarnwrap.network.message.SignedMessage message) { wrapperContained.addPendingAcknowledgment(message.wrapperContained); }
// public com.mojang.brigadier.ParseResults parse(java.lang.String command) { return wrapperContained.parse(command); }
// public java.util.Map collectArgumentMessages(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.command.argument.SignedArgumentList arguments,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return wrapperContained.collectArgumentMessages(packet.wrapperContained,arguments.wrapperContained,lastSeenMessages.wrapperContained); }
// public void handleCommandExecution(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { wrapperContained.handleCommandExecution(packet.wrapperContained,lastSeenMessages.wrapperContained); }
// public yarnwrap.network.message.SignedMessage getSignedMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return new yarnwrap.network.message.SignedMessage(wrapperContained.getSignedMessage(packet.wrapperContained,lastSeenMessages.wrapperContained)); }
// public void sendProfilelessChatMessage(yarnwrap.text.Text message,Object params) { wrapperContained.sendProfilelessChatMessage(message.wrapperContained,params); }
// public java.util.Optional validateAcknowledgment(Object acknowledgment) { return wrapperContained.validateAcknowledgment(acknowledgment); }
// public void sendChatMessage(yarnwrap.network.message.SignedMessage message,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,params); }
// public void handleMessageChainException(Object exception) { wrapperContained.handleMessageChainException(exception); }
// public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
public java.net.SocketAddress getConnectionAddress() { return wrapperContained.getConnectionAddress(); }
public void reconfigure() { wrapperContained.reconfigure(); }
// public void cleanUp() { wrapperContained.cleanUp(); }
// public int getMaxAllowedFloatingTicks(yarnwrap.entity.Entity vehicle) { return wrapperContained.getMaxAllowedFloatingTicks(vehicle.wrapperContained); }
// public yarnwrap.text.RawFilteredPair toRawFilteredPair(yarnwrap.server.filter.FilteredMessage message) { return new yarnwrap.text.RawFilteredPair(wrapperContained.toRawFilteredPair(message.wrapperContained)); }
// public Object createInvalidCommandSignatureException(java.lang.String command,java.util.List actual,java.util.List expected) { return wrapperContained.createInvalidCommandSignatureException(command,actual,expected); }
// public void executeCommand(java.lang.String command) { wrapperContained.executeCommand(command); }
// public java.util.Map toUnsignedSignatures(java.util.List arguments) { return wrapperContained.toUnsignedSignatures(arguments); }
// public boolean handlePendingTeleport() { return wrapperContained.handlePendingTeleport(); }

}