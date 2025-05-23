package yarnwrap.server.network;
public class ServerPlayNetworkHandler { public net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained; public ServerPlayNetworkHandler(net.minecraft.server.network.ServerPlayNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int movePacketsCount() { return wrapperContained.movePacketsCount; }
// public void movePacketsCount(int value) { wrapperContained.movePacketsCount = value; }
// public static int movePacketsCount() { return net.minecraft.server.network.ServerPlayNetworkHandler.movePacketsCount; }
// public static void movePacketsCount(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.movePacketsCount = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.server.network.ServerPlayNetworkHandler.ticks; }
// public static void ticks(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.ticks = value; }

// public yarnwrap.util.math.Vec3d requestedTeleportPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.requestedTeleportPos); }
// public void requestedTeleportPos(yarnwrap.util.math.Vec3d value) { wrapperContained.requestedTeleportPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d requestedTeleportPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.ServerPlayNetworkHandler.requestedTeleportPos); }
// public static void requestedTeleportPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.requestedTeleportPos = value.wrapperContained; }

// public double updatedRiddenZ() { return wrapperContained.updatedRiddenZ; }
// public void updatedRiddenZ(double value) { wrapperContained.updatedRiddenZ = value; }
// public static double updatedRiddenZ() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenZ; }
// public static void updatedRiddenZ(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenZ = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerPlayNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.LOGGER = value; }

// public double updatedRiddenX() { return wrapperContained.updatedRiddenX; }
// public void updatedRiddenX(double value) { wrapperContained.updatedRiddenX = value; }
// public static double updatedRiddenX() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenX; }
// public static void updatedRiddenX(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenX = value; }

// public int requestedTeleportId() { return wrapperContained.requestedTeleportId; }
// public void requestedTeleportId(int value) { wrapperContained.requestedTeleportId = value; }
// public static int requestedTeleportId() { return net.minecraft.server.network.ServerPlayNetworkHandler.requestedTeleportId; }
// public static void requestedTeleportId(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.requestedTeleportId = value; }

// public double lastTickRiddenY() { return wrapperContained.lastTickRiddenY; }
// public void lastTickRiddenY(double value) { wrapperContained.lastTickRiddenY = value; }
// public static double lastTickRiddenY() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenY; }
// public static void lastTickRiddenY(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenY = value; }

// public double updatedY() { return wrapperContained.updatedY; }
// public void updatedY(double value) { wrapperContained.updatedY = value; }
// public static double updatedY() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedY; }
// public static void updatedY(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedY = value; }

// public double lastTickZ() { return wrapperContained.lastTickZ; }
// public void lastTickZ(double value) { wrapperContained.lastTickZ = value; }
// public static double lastTickZ() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickZ; }
// public static void lastTickZ(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickZ = value; }

// public boolean vehicleFloating() { return wrapperContained.vehicleFloating; }
// public void vehicleFloating(boolean value) { wrapperContained.vehicleFloating = value; }
// public static boolean vehicleFloating() { return net.minecraft.server.network.ServerPlayNetworkHandler.vehicleFloating; }
// public static void vehicleFloating(boolean value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.vehicleFloating = value; }

// public double lastTickX() { return wrapperContained.lastTickX; }
// public void lastTickX(double value) { wrapperContained.lastTickX = value; }
// public static double lastTickX() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickX; }
// public static void lastTickX(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickX = value; }

// public boolean floating() { return wrapperContained.floating; }
// public void floating(boolean value) { wrapperContained.floating = value; }
// public static boolean floating() { return net.minecraft.server.network.ServerPlayNetworkHandler.floating; }
// public static void floating(boolean value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.floating = value; }

// public int lastTickMovePacketsCount() { return wrapperContained.lastTickMovePacketsCount; }
// public void lastTickMovePacketsCount(int value) { wrapperContained.lastTickMovePacketsCount = value; }
// public static int lastTickMovePacketsCount() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickMovePacketsCount; }
// public static void lastTickMovePacketsCount(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickMovePacketsCount = value; }

// public int vehicleFloatingTicks() { return wrapperContained.vehicleFloatingTicks; }
// public void vehicleFloatingTicks(int value) { wrapperContained.vehicleFloatingTicks = value; }
// public static int vehicleFloatingTicks() { return net.minecraft.server.network.ServerPlayNetworkHandler.vehicleFloatingTicks; }
// public static void vehicleFloatingTicks(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.vehicleFloatingTicks = value; }

// public int floatingTicks() { return wrapperContained.floatingTicks; }
// public void floatingTicks(int value) { wrapperContained.floatingTicks = value; }
// public static int floatingTicks() { return net.minecraft.server.network.ServerPlayNetworkHandler.floatingTicks; }
// public static void floatingTicks(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.floatingTicks = value; }

// public int lastTeleportCheckTicks() { return wrapperContained.lastTeleportCheckTicks; }
// public void lastTeleportCheckTicks(int value) { wrapperContained.lastTeleportCheckTicks = value; }
// public static int lastTeleportCheckTicks() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTeleportCheckTicks; }
// public static void lastTeleportCheckTicks(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTeleportCheckTicks = value; }

public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
public void player(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.network.ServerPlayNetworkHandler.player); }
// public static void player(yarnwrap.server.network.ServerPlayerEntity value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.player = value.wrapperContained; }

// public double updatedRiddenY() { return wrapperContained.updatedRiddenY; }
// public void updatedRiddenY(double value) { wrapperContained.updatedRiddenY = value; }
// public static double updatedRiddenY() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenY; }
// public static void updatedRiddenY(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedRiddenY = value; }

// public double lastTickRiddenZ() { return wrapperContained.lastTickRiddenZ; }
// public void lastTickRiddenZ(double value) { wrapperContained.lastTickRiddenZ = value; }
// public static double lastTickRiddenZ() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenZ; }
// public static void lastTickRiddenZ(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenZ = value; }

// public double lastTickRiddenX() { return wrapperContained.lastTickRiddenX; }
// public void lastTickRiddenX(double value) { wrapperContained.lastTickRiddenX = value; }
// public static double lastTickRiddenX() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenX; }
// public static void lastTickRiddenX(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickRiddenX = value; }

// public double updatedZ() { return wrapperContained.updatedZ; }
// public void updatedZ(double value) { wrapperContained.updatedZ = value; }
// public static double updatedZ() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedZ; }
// public static void updatedZ(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedZ = value; }

// public double updatedX() { return wrapperContained.updatedX; }
// public void updatedX(double value) { wrapperContained.updatedX = value; }
// public static double updatedX() { return net.minecraft.server.network.ServerPlayNetworkHandler.updatedX; }
// public static void updatedX(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updatedX = value; }

// public double lastTickY() { return wrapperContained.lastTickY; }
// public void lastTickY(double value) { wrapperContained.lastTickY = value; }
// public static double lastTickY() { return net.minecraft.server.network.ServerPlayNetworkHandler.lastTickY; }
// public static void lastTickY(double value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.lastTickY = value; }

// public yarnwrap.entity.Entity topmostRiddenEntity() { return new yarnwrap.entity.Entity(wrapperContained.topmostRiddenEntity); }
// public void topmostRiddenEntity(yarnwrap.entity.Entity value) { wrapperContained.topmostRiddenEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity topmostRiddenEntity() { return new yarnwrap.entity.Entity(net.minecraft.server.network.ServerPlayNetworkHandler.topmostRiddenEntity); }
// public static void topmostRiddenEntity(yarnwrap.entity.Entity value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.topmostRiddenEntity = value.wrapperContained; }

// public int DEFAULT_SEQUENCE() { return wrapperContained.DEFAULT_SEQUENCE; }
// public void DEFAULT_SEQUENCE(int value) { wrapperContained.DEFAULT_SEQUENCE = value; }
// public static int DEFAULT_SEQUENCE() { return net.minecraft.server.network.ServerPlayNetworkHandler.DEFAULT_SEQUENCE; }
// public static void DEFAULT_SEQUENCE(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.DEFAULT_SEQUENCE = value; }

// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
// public static int sequence() { return net.minecraft.server.network.ServerPlayNetworkHandler.sequence; }
// public static void sequence(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.sequence = value; }

// public Object messageUnpacker() { return wrapperContained.messageUnpacker; }
// // public void messageUnpacker(Object value) { wrapperContained.messageUnpacker = value; }
// // public static Object messageUnpacker() { return net.minecraft.server.network.ServerPlayNetworkHandler.messageUnpacker; }
// // public static void messageUnpacker(Object value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.messageUnpacker = value; }

// public yarnwrap.network.message.AcknowledgmentValidator acknowledgmentValidator() { return new yarnwrap.network.message.AcknowledgmentValidator(wrapperContained.acknowledgmentValidator); }
// public void acknowledgmentValidator(yarnwrap.network.message.AcknowledgmentValidator value) { wrapperContained.acknowledgmentValidator = value.wrapperContained; }
// public static yarnwrap.network.message.AcknowledgmentValidator acknowledgmentValidator() { return new yarnwrap.network.message.AcknowledgmentValidator(net.minecraft.server.network.ServerPlayNetworkHandler.acknowledgmentValidator); }
// public static void acknowledgmentValidator(yarnwrap.network.message.AcknowledgmentValidator value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.acknowledgmentValidator = value.wrapperContained; }

// public yarnwrap.network.message.MessageChainTaskQueue messageChainTaskQueue() { return new yarnwrap.network.message.MessageChainTaskQueue(wrapperContained.messageChainTaskQueue); }
// public void messageChainTaskQueue(yarnwrap.network.message.MessageChainTaskQueue value) { wrapperContained.messageChainTaskQueue = value.wrapperContained; }
// public static yarnwrap.network.message.MessageChainTaskQueue messageChainTaskQueue() { return new yarnwrap.network.message.MessageChainTaskQueue(net.minecraft.server.network.ServerPlayNetworkHandler.messageChainTaskQueue); }
// public static void messageChainTaskQueue(yarnwrap.network.message.MessageChainTaskQueue value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.messageChainTaskQueue = value.wrapperContained; }

// public yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.signatureStorage); }
// public void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value) { wrapperContained.signatureStorage = value.wrapperContained; }
// public static yarnwrap.network.message.MessageSignatureStorage signatureStorage() { return new yarnwrap.network.message.MessageSignatureStorage(net.minecraft.server.network.ServerPlayNetworkHandler.signatureStorage); }
// public static void signatureStorage(yarnwrap.network.message.MessageSignatureStorage value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.signatureStorage = value.wrapperContained; }

// public int MAX_PENDING_ACKNOWLEDGMENTS() { return wrapperContained.MAX_PENDING_ACKNOWLEDGMENTS; }
// public void MAX_PENDING_ACKNOWLEDGMENTS(int value) { wrapperContained.MAX_PENDING_ACKNOWLEDGMENTS = value; }
// public static int MAX_PENDING_ACKNOWLEDGMENTS() { return net.minecraft.server.network.ServerPlayNetworkHandler.MAX_PENDING_ACKNOWLEDGMENTS; }
// public static void MAX_PENDING_ACKNOWLEDGMENTS(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.MAX_PENDING_ACKNOWLEDGMENTS = value; }

// public yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_VALIDATION_FAILED_TEXT); }
// public void CHAT_VALIDATION_FAILED_TEXT(yarnwrap.text.Text value) { wrapperContained.CHAT_VALIDATION_FAILED_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text CHAT_VALIDATION_FAILED_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerPlayNetworkHandler.CHAT_VALIDATION_FAILED_TEXT); }
// public static void CHAT_VALIDATION_FAILED_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.CHAT_VALIDATION_FAILED_TEXT = value.wrapperContained; }

// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.PublicPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(net.minecraft.server.network.ServerPlayNetworkHandler.session); }
// public static void session(yarnwrap.network.encryption.PublicPlayerSession value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.session = value.wrapperContained; }

// public boolean requestedReconfiguration() { return wrapperContained.requestedReconfiguration; }
// public void requestedReconfiguration(boolean value) { wrapperContained.requestedReconfiguration = value; }
// public static boolean requestedReconfiguration() { return net.minecraft.server.network.ServerPlayNetworkHandler.requestedReconfiguration; }
// public static void requestedReconfiguration(boolean value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.requestedReconfiguration = value; }

public yarnwrap.server.network.ChunkDataSender chunkDataSender() { return new yarnwrap.server.network.ChunkDataSender(wrapperContained.chunkDataSender); }
// public void chunkDataSender(yarnwrap.server.network.ChunkDataSender value) { wrapperContained.chunkDataSender = value.wrapperContained; }
// public static yarnwrap.server.network.ChunkDataSender chunkDataSender() { return new yarnwrap.server.network.ChunkDataSender(net.minecraft.server.network.ServerPlayNetworkHandler.chunkDataSender); }
// public static void chunkDataSender(yarnwrap.server.network.ChunkDataSender value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.chunkDataSender = value.wrapperContained; }

// public yarnwrap.text.Text INVALID_COMMAND_SIGNATURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_COMMAND_SIGNATURE_TEXT); }
// public void INVALID_COMMAND_SIGNATURE_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_COMMAND_SIGNATURE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text INVALID_COMMAND_SIGNATURE_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerPlayNetworkHandler.INVALID_COMMAND_SIGNATURE_TEXT); }
// public static void INVALID_COMMAND_SIGNATURE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.INVALID_COMMAND_SIGNATURE_TEXT = value.wrapperContained; }

// public boolean movedThisTick() { return wrapperContained.movedThisTick; }
// public void movedThisTick(boolean value) { wrapperContained.movedThisTick = value; }
// public static boolean movedThisTick() { return net.minecraft.server.network.ServerPlayNetworkHandler.movedThisTick; }
// public static void movedThisTick(boolean value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.movedThisTick = value; }

// public yarnwrap.util.Cooldown messageCooldown() { return new yarnwrap.util.Cooldown(wrapperContained.messageCooldown); }
// public void messageCooldown(yarnwrap.util.Cooldown value) { wrapperContained.messageCooldown = value.wrapperContained; }
// public static yarnwrap.util.Cooldown messageCooldown() { return new yarnwrap.util.Cooldown(net.minecraft.server.network.ServerPlayNetworkHandler.messageCooldown); }
// public static void messageCooldown(yarnwrap.util.Cooldown value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.messageCooldown = value.wrapperContained; }

// public yarnwrap.util.Cooldown creativeItemDropCooldown() { return new yarnwrap.util.Cooldown(wrapperContained.creativeItemDropCooldown); }
// public void creativeItemDropCooldown(yarnwrap.util.Cooldown value) { wrapperContained.creativeItemDropCooldown = value.wrapperContained; }
// public static yarnwrap.util.Cooldown creativeItemDropCooldown() { return new yarnwrap.util.Cooldown(net.minecraft.server.network.ServerPlayNetworkHandler.creativeItemDropCooldown); }
// public static void creativeItemDropCooldown(yarnwrap.util.Cooldown value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.creativeItemDropCooldown = value.wrapperContained; }

// public int globalChatMessageIndex() { return wrapperContained.globalChatMessageIndex; }
// public void globalChatMessageIndex(int value) { wrapperContained.globalChatMessageIndex = value; }
// public static int globalChatMessageIndex() { return net.minecraft.server.network.ServerPlayNetworkHandler.globalChatMessageIndex; }
// public static void globalChatMessageIndex(int value, ) { net.minecraft.server.network.ServerPlayNetworkHandler.globalChatMessageIndex = value; }

public ServerPlayNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ConnectedClientData clientData) { this.wrapperContained = new net.minecraft.server.network.ServerPlayNetworkHandler(server.wrapperContained,connection.wrapperContained,player.wrapperContained,clientData.wrapperContained); }
public void requestTeleport(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags) { wrapperContained.requestTeleport(pos.wrapperContained,flags); }
// public static void requestTeleport(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags, ) { net.minecraft.server.network.ServerPlayNetworkHandler.requestTeleport(pos.wrapperContained,flags); }
public void requestTeleport(double x,double y,double z,float yaw,float pitch) { wrapperContained.requestTeleport(x,y,z,yaw,pitch); }
// public static void requestTeleport(double x,double y,double z,float yaw,float pitch, ) { net.minecraft.server.network.ServerPlayNetworkHandler.requestTeleport(x,y,z,yaw,pitch); }
// public void method_14365(yarnwrap.network.packet.c2s.play.RequestCommandCompletionsC2SPacket suggestions) { wrapperContained.method_14365(suggestions.wrapperContained); }
// public static void method_14365(yarnwrap.network.packet.c2s.play.RequestCommandCompletionsC2SPacket suggestions, ) { net.minecraft.server.network.ServerPlayNetworkHandler.method_14365(suggestions.wrapperContained); }
// public boolean isMovementInvalid(double x,double y,double z,float yaw,float pitch) { return wrapperContained.isMovementInvalid(x,y,z,yaw,pitch); }
// public static boolean isMovementInvalid(double x,double y,double z,float yaw,float pitch, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.isMovementInvalid(x,y,z,yaw,pitch); }
public void syncWithPlayerPosition() { wrapperContained.syncWithPlayerPosition(); }
// public static void syncWithPlayerPosition() { net.minecraft.server.network.ServerPlayNetworkHandler.syncWithPlayerPosition(); }
// public boolean isPlayerNotCollidingWithBlocks(yarnwrap.world.WorldView world,yarnwrap.util.math.Box box,double newX,double newY,double newZ) { return wrapperContained.isPlayerNotCollidingWithBlocks(world.wrapperContained,box.wrapperContained,newX,newY,newZ); }
// public static boolean isPlayerNotCollidingWithBlocks(yarnwrap.world.WorldView world,yarnwrap.util.math.Box box,double newX,double newY,double newZ, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.isPlayerNotCollidingWithBlocks(world.wrapperContained,box.wrapperContained,newX,newY,newZ); }
// public boolean canPlace(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { return wrapperContained.canPlace(player.wrapperContained,stack.wrapperContained); }
// public static boolean canPlace(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.canPlace(player.wrapperContained,stack.wrapperContained); }
// public boolean isEntityOnAir(yarnwrap.entity.Entity entity) { return wrapperContained.isEntityOnAir(entity.wrapperContained); }
// public static boolean isEntityOnAir(yarnwrap.entity.Entity entity, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.isEntityOnAir(entity.wrapperContained); }
// public void method_31274(int texts) { wrapperContained.method_31274(texts); }
// public static void method_31274(int texts, ) { net.minecraft.server.network.ServerPlayNetworkHandler.method_31274(texts); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.Object text,java.util.function.BiFunction filterer) { return wrapperContained.filterText(text,filterer); }
// public static java.util.concurrent.CompletableFuture filterText(java.lang.Object text,java.util.function.BiFunction filterer, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.filterText(text,filterer); }
// public void addBook(yarnwrap.server.filter.FilteredMessage title,java.util.List pages,int slotId) { wrapperContained.addBook(title.wrapperContained,pages,slotId); }
// public static void addBook(yarnwrap.server.filter.FilteredMessage title,java.util.List pages,int slotId, ) { net.minecraft.server.network.ServerPlayNetworkHandler.addBook(title.wrapperContained,pages,slotId); }
// public java.util.concurrent.CompletableFuture filterText(java.lang.String text) { return wrapperContained.filterText(text); }
// public static java.util.concurrent.CompletableFuture filterText(java.lang.String text, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.filterText(text); }
// public void updateBookContent(java.util.List pages,int slotId) { wrapperContained.updateBookContent(pages,slotId); }
// public static void updateBookContent(java.util.List pages,int slotId, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updateBookContent(pages,slotId); }
// public java.util.concurrent.CompletableFuture filterTexts(java.util.List texts) { return wrapperContained.filterTexts(texts); }
// public static java.util.concurrent.CompletableFuture filterTexts(java.util.List texts, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.filterTexts(texts); }
// public void onSignUpdate(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet,java.util.List signText) { wrapperContained.onSignUpdate(packet.wrapperContained,signText); }
// public static void onSignUpdate(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket packet,java.util.List signText, ) { net.minecraft.server.network.ServerPlayNetworkHandler.onSignUpdate(packet.wrapperContained,signText); }
// public void method_31283(int texts) { wrapperContained.method_31283(texts); }
// public static void method_31283(int texts, ) { net.minecraft.server.network.ServerPlayNetworkHandler.method_31283(texts); }
// public java.lang.Object method_31284(java.lang.Object filtered) { return wrapperContained.method_31284(filtered); }
// public static java.lang.Object method_31284(java.lang.Object filtered, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.method_31284(filtered); }
// public void method_31285(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket texts) { wrapperContained.method_31285(texts.wrapperContained); }
// public static void method_31285(yarnwrap.network.packet.c2s.play.UpdateSignC2SPacket texts, ) { net.minecraft.server.network.ServerPlayNetworkHandler.method_31285(texts.wrapperContained); }
// public yarnwrap.text.RawFilteredPair method_33799(yarnwrap.server.filter.FilteredMessage page) { return new yarnwrap.text.RawFilteredPair(wrapperContained.method_33799(page.wrapperContained)); }
// public static yarnwrap.text.RawFilteredPair method_33799(yarnwrap.server.filter.FilteredMessage page, ) { return new yarnwrap.text.RawFilteredPair(net.minecraft.server.network.ServerPlayNetworkHandler.method_33799(page.wrapperContained)); }
// public double clampHorizontal(double d) { return wrapperContained.clampHorizontal(d); }
// public static double clampHorizontal(double d, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.clampHorizontal(d); }
// public double clampVertical(double d) { return wrapperContained.clampVertical(d); }
// public static double clampVertical(double d, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.clampVertical(d); }
public void updateSequence(int sequence) { wrapperContained.updateSequence(sequence); }
// public static void updateSequence(int sequence, ) { net.minecraft.server.network.ServerPlayNetworkHandler.updateSequence(sequence); }
// public boolean hasIllegalCharacter(java.lang.String message) { return wrapperContained.hasIllegalCharacter(message); }
// public static boolean hasIllegalCharacter(java.lang.String message, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.hasIllegalCharacter(message); }
// public void checkForSpam() { wrapperContained.checkForSpam(); }
// public static void checkForSpam() { net.minecraft.server.network.ServerPlayNetworkHandler.checkForSpam(); }
// public void handleDecoratedMessage(yarnwrap.network.message.SignedMessage message) { wrapperContained.handleDecoratedMessage(message.wrapperContained); }
// public static void handleDecoratedMessage(yarnwrap.network.message.SignedMessage message, ) { net.minecraft.server.network.ServerPlayNetworkHandler.handleDecoratedMessage(message.wrapperContained); }
// public void validateMessage(java.lang.String message,java.lang.Runnable callback) { wrapperContained.validateMessage(message,callback); }
// public static void validateMessage(java.lang.String message,java.lang.Runnable callback, ) { net.minecraft.server.network.ServerPlayNetworkHandler.validateMessage(message,callback); }
// public yarnwrap.server.command.ServerCommandSource method_45002(yarnwrap.network.message.SignedCommandArguments source) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.method_45002(source.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource method_45002(yarnwrap.network.message.SignedCommandArguments source, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.network.ServerPlayNetworkHandler.method_45002(source.wrapperContained)); }
// public com.mojang.brigadier.ParseResults parse(java.lang.String command) { return wrapperContained.parse(command); }
// public static com.mojang.brigadier.ParseResults parse(java.lang.String command, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.parse(command); }
// public java.util.Map collectArgumentMessages(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.command.argument.SignedArgumentList arguments,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return wrapperContained.collectArgumentMessages(packet.wrapperContained,arguments.wrapperContained,lastSeenMessages.wrapperContained); }
// public static java.util.Map collectArgumentMessages(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.command.argument.SignedArgumentList arguments,yarnwrap.network.message.LastSeenMessageList lastSeenMessages, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.collectArgumentMessages(packet.wrapperContained,arguments.wrapperContained,lastSeenMessages.wrapperContained); }
// public void handleCommandExecution(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { wrapperContained.handleCommandExecution(packet.wrapperContained,lastSeenMessages.wrapperContained); }
// public static void handleCommandExecution(yarnwrap.network.packet.c2s.play.ChatCommandSignedC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages, ) { net.minecraft.server.network.ServerPlayNetworkHandler.handleCommandExecution(packet.wrapperContained,lastSeenMessages.wrapperContained); }
// public yarnwrap.network.message.SignedMessage getSignedMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages) { return new yarnwrap.network.message.SignedMessage(wrapperContained.getSignedMessage(packet.wrapperContained,lastSeenMessages.wrapperContained)); }
// public static yarnwrap.network.message.SignedMessage getSignedMessage(yarnwrap.network.packet.c2s.play.ChatMessageC2SPacket packet,yarnwrap.network.message.LastSeenMessageList lastSeenMessages, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.server.network.ServerPlayNetworkHandler.getSignedMessage(packet.wrapperContained,lastSeenMessages.wrapperContained)); }
// public void method_45064(yarnwrap.network.message.SignedMessage filtered) { wrapperContained.method_45064(filtered.wrapperContained); }
// public static void method_45064(yarnwrap.network.message.SignedMessage filtered, ) { net.minecraft.server.network.ServerPlayNetworkHandler.method_45064(filtered.wrapperContained); }
// public void sendProfilelessChatMessage(yarnwrap.text.Text message,Object params) { wrapperContained.sendProfilelessChatMessage(message.wrapperContained,params); }
// public static void sendProfilelessChatMessage(yarnwrap.text.Text message,Object params, ) { net.minecraft.server.network.ServerPlayNetworkHandler.sendProfilelessChatMessage(message.wrapperContained,params); }
// public java.util.Optional validateAcknowledgment(Object acknowledgment) { return wrapperContained.validateAcknowledgment(acknowledgment); }
// public static java.util.Optional validateAcknowledgment(Object acknowledgment, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.validateAcknowledgment(acknowledgment); }
// public void sendChatMessage(yarnwrap.network.message.SignedMessage message,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,params); }
// public static void sendChatMessage(yarnwrap.network.message.SignedMessage message,Object params, ) { net.minecraft.server.network.ServerPlayNetworkHandler.sendChatMessage(message.wrapperContained,params); }
// public void handleMessageChainException(Object exception) { wrapperContained.handleMessageChainException(exception); }
// public static void handleMessageChainException(Object exception, ) { net.minecraft.server.network.ServerPlayNetworkHandler.handleMessageChainException(exception); }
// public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
// public static void setSession(yarnwrap.network.encryption.PublicPlayerSession session, ) { net.minecraft.server.network.ServerPlayNetworkHandler.setSession(session.wrapperContained); }
public java.net.SocketAddress getConnectionAddress() { return wrapperContained.getConnectionAddress(); }
// public static java.net.SocketAddress getConnectionAddress() { return net.minecraft.server.network.ServerPlayNetworkHandler.getConnectionAddress(); }
public void reconfigure() { wrapperContained.reconfigure(); }
// public static void reconfigure() { net.minecraft.server.network.ServerPlayNetworkHandler.reconfigure(); }
// public void cleanUp() { wrapperContained.cleanUp(); }
// public static void cleanUp() { net.minecraft.server.network.ServerPlayNetworkHandler.cleanUp(); }
// public int getMaxAllowedFloatingTicks(yarnwrap.entity.Entity vehicle) { return wrapperContained.getMaxAllowedFloatingTicks(vehicle.wrapperContained); }
// public static int getMaxAllowedFloatingTicks(yarnwrap.entity.Entity vehicle, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.getMaxAllowedFloatingTicks(vehicle.wrapperContained); }
// public yarnwrap.text.RawFilteredPair toRawFilteredPair(yarnwrap.server.filter.FilteredMessage message) { return new yarnwrap.text.RawFilteredPair(wrapperContained.toRawFilteredPair(message.wrapperContained)); }
// public static yarnwrap.text.RawFilteredPair toRawFilteredPair(yarnwrap.server.filter.FilteredMessage message, ) { return new yarnwrap.text.RawFilteredPair(net.minecraft.server.network.ServerPlayNetworkHandler.toRawFilteredPair(message.wrapperContained)); }
// public Object createInvalidCommandSignatureException(java.lang.String command,java.util.List actual,java.util.List expected) { return wrapperContained.createInvalidCommandSignatureException(command,actual,expected); }
// public static Object createInvalidCommandSignatureException(java.lang.String command,java.util.List actual,java.util.List expected, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.createInvalidCommandSignatureException(command,actual,expected); }
// public void executeCommand(java.lang.String command) { wrapperContained.executeCommand(command); }
// public static void executeCommand(java.lang.String command, ) { net.minecraft.server.network.ServerPlayNetworkHandler.executeCommand(command); }
// public java.util.Map toUnsignedSignatures(java.util.List arguments) { return wrapperContained.toUnsignedSignatures(arguments); }
// public static java.util.Map toUnsignedSignatures(java.util.List arguments, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.toUnsignedSignatures(arguments); }
// public boolean handlePendingTeleport() { return wrapperContained.handlePendingTeleport(); }
// public static boolean handlePendingTeleport() { return net.minecraft.server.network.ServerPlayNetworkHandler.handlePendingTeleport(); }
// public void handleMovement(yarnwrap.util.math.Vec3d movement) { wrapperContained.handleMovement(movement.wrapperContained); }
// public static void handleMovement(yarnwrap.util.math.Vec3d movement, ) { net.minecraft.server.network.ServerPlayNetworkHandler.handleMovement(movement.wrapperContained); }
// public boolean shouldCheckMovement(boolean elytra) { return wrapperContained.shouldCheckMovement(elytra); }
// public static boolean shouldCheckMovement(boolean elytra, ) { return net.minecraft.server.network.ServerPlayNetworkHandler.shouldCheckMovement(elytra); }
// public void onPickItem(yarnwrap.item.ItemStack stack) { wrapperContained.onPickItem(stack.wrapperContained); }
// public static void onPickItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.server.network.ServerPlayNetworkHandler.onPickItem(stack.wrapperContained); }
// public void copyBlockDataToStack(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.copyBlockDataToStack(state.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public static void copyBlockDataToStack(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack, ) { net.minecraft.server.network.ServerPlayNetworkHandler.copyBlockDataToStack(state.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}