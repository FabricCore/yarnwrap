package yarnwrap.server.network;
public class ServerPlayNetworkHandler { public net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained; public ServerPlayNetworkHandler(net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int messageCooldown() { return wrapperContained.messageCooldown; }
// public void messageCooldown(int value) { wrapperContained.messageCooldown = value; }
// public int movePacketsCount() { return wrapperContained.movePacketsCount; }
// public void movePacketsCount(int value) { wrapperContained.movePacketsCount = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.util.math.Vec3d requestedTeleportPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.requestedTeleportPos); }
// public void requestedTeleportPos(yarnwrap.util.math.Vec3d value) { wrapperContained.requestedTeleportPos = value.wrapperContained; }
// public double updatedRiddenZ() { return wrapperContained.updatedRiddenZ; }
// public void updatedRiddenZ(double value) { wrapperContained.updatedRiddenZ = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public double updatedRiddenX() { return wrapperContained.updatedRiddenX; }
// public void updatedRiddenX(double value) { wrapperContained.updatedRiddenX = value; }
// public int requestedTeleportId() { return wrapperContained.requestedTeleportId; }
// public void requestedTeleportId(int value) { wrapperContained.requestedTeleportId = value; }
// public double lastTickRiddenY() { return wrapperContained.lastTickRiddenY; }
// public void lastTickRiddenY(double value) { wrapperContained.lastTickRiddenY = value; }
// public double updatedY() { return wrapperContained.updatedY; }
// public void updatedY(double value) { wrapperContained.updatedY = value; }
// public double lastTickZ() { return wrapperContained.lastTickZ; }
// public void lastTickZ(double value) { wrapperContained.lastTickZ = value; }
// public boolean vehicleFloating() { return wrapperContained.vehicleFloating; }
// public void vehicleFloating(boolean value) { wrapperContained.vehicleFloating = value; }
// public double lastTickX() { return wrapperContained.lastTickX; }
// public void lastTickX(double value) { wrapperContained.lastTickX = value; }
// public boolean floating() { return wrapperContained.floating; }
// public void floating(boolean value) { wrapperContained.floating = value; }
// public int creativeItemDropThreshold() { return wrapperContained.creativeItemDropThreshold; }
// public void creativeItemDropThreshold(int value) { wrapperContained.creativeItemDropThreshold = value; }
// public int lastTickMovePacketsCount() { return wrapperContained.lastTickMovePacketsCount; }
// public void lastTickMovePacketsCount(int value) { wrapperContained.lastTickMovePacketsCount = value; }
// public int vehicleFloatingTicks() { return wrapperContained.vehicleFloatingTicks; }
// public void vehicleFloatingTicks(int value) { wrapperContained.vehicleFloatingTicks = value; }
// public int floatingTicks() { return wrapperContained.floatingTicks; }
// public void floatingTicks(int value) { wrapperContained.floatingTicks = value; }
// public int prevTeleportCheckTicks() { return wrapperContained.prevTeleportCheckTicks; }
// public void prevTeleportCheckTicks(int value) { wrapperContained.prevTeleportCheckTicks = value; }
public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
public void player(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public double updatedRiddenY() { return wrapperContained.updatedRiddenY; }
// public void updatedRiddenY(double value) { wrapperContained.updatedRiddenY = value; }
// public double lastTickRiddenZ() { return wrapperContained.lastTickRiddenZ; }
// public void lastTickRiddenZ(double value) { wrapperContained.lastTickRiddenZ = value; }
// public double lastTickRiddenX() { return wrapperContained.lastTickRiddenX; }
// public void lastTickRiddenX(double value) { wrapperContained.lastTickRiddenX = value; }
// public double updatedZ() { return wrapperContained.updatedZ; }
// public void updatedZ(double value) { wrapperContained.updatedZ = value; }
// public double updatedX() { return wrapperContained.updatedX; }
// public void updatedX(double value) { wrapperContained.updatedX = value; }
// public double lastTickY() { return wrapperContained.lastTickY; }
// public void lastTickY(double value) { wrapperContained.lastTickY = value; }
// public yarnwrap.entity.Entity topmostRiddenEntity() { return new yarnwrap.entity.Entity(wrapperContained.topmostRiddenEntity); }
// public void topmostRiddenEntity(yarnwrap.entity.Entity value) { wrapperContained.topmostRiddenEntity = value.wrapperContained; }
// public int DEFAULT_SEQUENCE() { return wrapperContained.DEFAULT_SEQUENCE; }
// public void DEFAULT_SEQUENCE(int value) { wrapperContained.DEFAULT_SEQUENCE = value; }
// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
// public Object messageUnpacker() { return wrapperContained.messageUnpacker; }
// // public void messageUnpacker(Object value) { wrapperContained.messageUnpacker = value; }
// public yarnwrap.network.message.AcknowledgmentValidator acknowledgmentValidator() { return new yarnwrap.network.message.AcknowledgmentValidator(wrapperContained.acknowledgmentValidator); }
// public void acknowledgmentValidator(yarnwrap.network.message.AcknowledgmentValidator value) { wrapperContained.acknowledgmentValidator = value.wrapperContained; }
// public yarnwrap.network.message.MessageChainTaskQueue messageChainTaskQueue() { return new yarnwrap.network.message.MessageChainTaskQueue(wrapperContained.messageChainTaskQueue); }
// public void messageChainTaskQueue(yarnwrap.network.message.MessageChainTaskQueue value) { wrapperContained.messageChainTaskQueue = value.wrapperContained; }
// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value) { wrapperContained.signatureStorage = value.wrapperContained; }
// public int MAX_PENDING_ACKNOWLEDGMENTS() { return wrapperContained.MAX_PENDING_ACKNOWLEDGMENTS; }
// public void MAX_PENDING_ACKNOWLEDGMENTS(int value) { wrapperContained.MAX_PENDING_ACKNOWLEDGMENTS = value; }
// public yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_VALIDATION_FAILED_TEXT); }
// public void CHAT_VALIDATION_FAILED_TEXT(yarnwrap.text.Text value) { wrapperContained.CHAT_VALIDATION_FAILED_TEXT = value.wrapperContained; }
// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.PublicPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public boolean requestedReconfiguration() { return wrapperContained.requestedReconfiguration; }
// public void requestedReconfiguration(boolean value) { wrapperContained.requestedReconfiguration = value; }
public yarnwrap.server.network.ChunkDataSender chunkDataSender() { return new yarnwrap.server.network.ChunkDataSender(wrapperContained.chunkDataSender); }
// public void chunkDataSender(yarnwrap.server.network.ChunkDataSender value) { wrapperContained.chunkDataSender = value.wrapperContained; }
// public yarnwrap.text.Text INVALID_COMMAND_SIGNATURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_COMMAND_SIGNATURE_TEXT); }
// public void INVALID_COMMAND_SIGNATURE_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_COMMAND_SIGNATURE_TEXT = value.wrapperContained; }
public ServerPlayNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ConnectedClientData clientData) { this.wrapperContained = new net.minecraft.server.network.ServerPlayNetworkHandler(server.wrapperContained,connection.wrapperContained,player.wrapperContained,clientData.wrapperContained); }
public void requestTeleport(double x,double y,double z,float yaw,float pitch,java.util.Set flags) { wrapperContained.requestTeleport(x,y,z,yaw,pitch,flags); }
public void requestTeleport(double x,double y,double z,float yaw,float pitch) { wrapperContained.requestTeleport(x,y,z,yaw,pitch); }
// public void method_14365(yarnwrap.network.packet.c2s.play.RequestCommandCompletionsC2SPacket suggestions) { wrapperContained.method_14365(suggestions.wrapperContained); }
// public boolean isMovementInvalid(double x,double y,double z,float yaw,float pitch) { return wrapperContained.isMovementInvalid(x,y,z,yaw,pitch); }
public void syncWithPlayerPosition() { wrapperContained.syncWithPlayerPosition(); }
// public void method_17820(yarnwrap.network.packet.c2s.play.CraftRequestC2SPacket recipe) { wrapperContained.method_17820(recipe.wrapperContained); }
// public boolean isPlayerNotCollidingWithBlocks(yarnwrap.world.WorldView world,yarnwrap.util.math.Box box,double newX,double newY,double newZ) { return wrapperContained.isPlayerNotCollidingWithBlocks(world.wrapperContained,box.wrapperContained,newX,newY,newZ); }
// public boolean canPlace(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { return wrapperContained.canPlace(player.wrapperContained,stack.wrapperContained); }
// public boolean isEntityOnAir(yarnwrap.entity.Entity entity) { return wrapperContained.isEntityOnAir(entity.wrapperContained); }
// public void method_31274(int texts) { wrapperContained.method_31274(texts); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.Object text,java.util.function.BiFunction filterer) { return wrapperContained.filterText(text,filterer); }
// public void addBook(yarnwrap.server.filter.FilteredMessage title,java.util.List pages,int slotId) { wrapperContained.addBook(title.wrapperContained,pages,slotId); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.String text) { return wrapperContained.filterText(text); }
// public void updateBookContent(java.util.List pages,int slotId) { wrapperContained.updateBookContent(pages,slotId); }
// public java.util.concurrent.CompletableFuture filterTexts(java.util.List texts) { return wrapperContained.filterTexts(texts); }
// public void onSignUpdate(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet,java.util.List signText) { wrapperContained.onSignUpdate(packet.wrapperContained,signText); }
// public void method_31283(int texts) { wrapperContained.method_31283(texts); }
// public java.lang.Object method_31284(java.lang.Object filtered) { return wrapperContained.method_31284(filtered); }
// public void method_31285(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket texts) { wrapperContained.method_31285(texts.wrapperContained); }
// public yarnwrap.text.RawFilteredPair method_33799(yarnwrap.server.filter.FilteredMessage page) { return new yarnwrap.text.RawFilteredPair(wrapperContained.method_33799(page.wrapperContained)); }
// public double clampHorizontal(double d) { return wrapperContained.clampHorizontal(d); }
// public double clampVertical(double d) { return wrapperContained.clampVertical(d); }
public void updateSequence(int sequence) { wrapperContained.updateSequence(sequence); }
// public boolean hasIllegalCharacter(java.lang.String message) { return wrapperContained.hasIllegalCharacter(message); }
// public void checkForSpam() { wrapperContained.checkForSpam(); }
// public void handleDecoratedMessage(yarnwrap.network.message.SignedMessage message) { wrapperContained.handleDecoratedMessage(message.wrapperContained); }
// public void validateMessage(java.lang.String message,java.lang.Runnable callback) { wrapperContained.validateMessage(message,callback); }
public void addPendingAcknowledgment(yarnwrap.network.message.SignedMessage message) { wrapperContained.addPendingAcknowledgment(message.wrapperContained); }
// public yarnwrap.server.command.ServerCommandSource method_45002(yarnwrap.network.message.SignedCommandArguments source) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.method_45002(source.wrapperContained)); }
// public com.mojang.brigadier.ParseResults parse(java.lang.String command) { return wrapperContained.parse(command); }
// public java.util.Map collectArgumentMessages(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.command.argument.SignedArgumentList arguments,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return wrapperContained.collectArgumentMessages(packet.wrapperContained,arguments.wrapperContained,lastSeenMessages.wrapperContained); }
// public void handleCommandExecution(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { wrapperContained.handleCommandExecution(packet.wrapperContained,lastSeenMessages.wrapperContained); }
// public yarnwrap.network.message.SignedMessage getSignedMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return new yarnwrap.network.message.SignedMessage(wrapperContained.getSignedMessage(packet.wrapperContained,lastSeenMessages.wrapperContained)); }
// public void method_45064(yarnwrap.network.message.SignedMessage filtered) { wrapperContained.method_45064(filtered.wrapperContained); }
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