package yarnwrap.server.command;
public class ServerCommandSource { public net.minecraft.server.command.ServerCommandSource wrapperContained; public ServerCommandSource(net.minecraft.server.command.ServerCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.SignedCommandArguments signedArguments() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.signedArguments); }
// public void signedArguments(yarnwrap.network.message.SignedCommandArguments value) { wrapperContained.signedArguments = value.wrapperContained; }
// public static yarnwrap.network.message.SignedCommandArguments signedArguments() { return new yarnwrap.network.message.SignedCommandArguments(net.minecraft.server.command.ServerCommandSource.signedArguments); }
// public static void signedArguments(yarnwrap.network.message.SignedCommandArguments value, ) { net.minecraft.server.command.ServerCommandSource.signedArguments = value.wrapperContained; }

// public yarnwrap.util.thread.FutureQueue messageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(wrapperContained.messageChainTaskQueue); }
// public void messageChainTaskQueue(yarnwrap.util.thread.FutureQueue value) { wrapperContained.messageChainTaskQueue = value.wrapperContained; }
// public static yarnwrap.util.thread.FutureQueue messageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(net.minecraft.server.command.ServerCommandSource.messageChainTaskQueue); }
// public static void messageChainTaskQueue(yarnwrap.util.thread.FutureQueue value, ) { net.minecraft.server.command.ServerCommandSource.messageChainTaskQueue = value.wrapperContained; }

// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.returnValueConsumer = value.wrapperContained; }
// public static yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.server.command.ServerCommandSource.returnValueConsumer); }
// public static void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value, ) { net.minecraft.server.command.ServerCommandSource.returnValueConsumer = value.wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.server.command.ServerCommandSource.level; }
// public static void level(int value, ) { net.minecraft.server.command.ServerCommandSource.level = value; }

// public Object entityAnchor() { return wrapperContained.entityAnchor; }
// // public void entityAnchor(Object value) { wrapperContained.entityAnchor = value; }
// // public static Object entityAnchor() { return net.minecraft.server.command.ServerCommandSource.entityAnchor; }
// // public static void entityAnchor(Object value, ) { net.minecraft.server.command.ServerCommandSource.entityAnchor = value; }

// public yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(wrapperContained.position); }
// public void position(yarnwrap.util.math.Vec3d value) { wrapperContained.position = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.command.ServerCommandSource.position); }
// public static void position(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.command.ServerCommandSource.position = value.wrapperContained; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.command.ServerCommandSource.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.command.ServerCommandSource.server = value.wrapperContained; }

// public yarnwrap.server.command.CommandOutput output() { return new yarnwrap.server.command.CommandOutput(wrapperContained.output); }
// public void output(yarnwrap.server.command.CommandOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.server.command.CommandOutput output() { return new yarnwrap.server.command.CommandOutput(net.minecraft.server.command.ServerCommandSource.output); }
// public static void output(yarnwrap.server.command.CommandOutput value, ) { net.minecraft.server.command.ServerCommandSource.output = value.wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.server.command.ServerCommandSource.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.server.command.ServerCommandSource.entity = value.wrapperContained; }

// public yarnwrap.util.math.Vec2f rotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.Vec2f value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.math.Vec2f rotation() { return new yarnwrap.util.math.Vec2f(net.minecraft.server.command.ServerCommandSource.rotation); }
// public static void rotation(yarnwrap.util.math.Vec2f value, ) { net.minecraft.server.command.ServerCommandSource.rotation = value.wrapperContained; }

// public boolean silent() { return wrapperContained.silent; }
// public void silent(boolean value) { wrapperContained.silent = value; }
// public static boolean silent() { return net.minecraft.server.command.ServerCommandSource.silent; }
// public static void silent(boolean value, ) { net.minecraft.server.command.ServerCommandSource.silent = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_PLAYER_EXCEPTION() { return wrapperContained.REQUIRES_PLAYER_EXCEPTION; }
// public void REQUIRES_PLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REQUIRES_PLAYER_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_PLAYER_EXCEPTION() { return net.minecraft.server.command.ServerCommandSource.REQUIRES_PLAYER_EXCEPTION; }
// public static void REQUIRES_PLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.ServerCommandSource.REQUIRES_PLAYER_EXCEPTION = value; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.server.command.ServerCommandSource.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.server.command.ServerCommandSource.displayName = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.server.command.ServerCommandSource.name; }
// public static void name(java.lang.String value, ) { net.minecraft.server.command.ServerCommandSource.name = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_ENTITY_EXCEPTION() { return wrapperContained.REQUIRES_ENTITY_EXCEPTION; }
// public void REQUIRES_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REQUIRES_ENTITY_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_ENTITY_EXCEPTION() { return net.minecraft.server.command.ServerCommandSource.REQUIRES_ENTITY_EXCEPTION; }
// public static void REQUIRES_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.ServerCommandSource.REQUIRES_ENTITY_EXCEPTION = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.ServerCommandSource.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.server.command.ServerCommandSource.world = value.wrapperContained; }

public ServerCommandSource(yarnwrap.server.command.CommandOutput output,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec2f rot,yarnwrap.server.world.ServerWorld world,int level,java.lang.String name,yarnwrap.text.Text displayName,yarnwrap.server.MinecraftServer server,yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.server.command.ServerCommandSource(output.wrapperContained,pos.wrapperContained,rot.wrapperContained,world.wrapperContained,level,name,displayName.wrapperContained,server.wrapperContained,entity.wrapperContained); }
// public ServerCommandSource(yarnwrap.server.command.CommandOutput output,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec2f rot,yarnwrap.server.world.ServerWorld world,int level,java.lang.String name,yarnwrap.text.Text displayName,yarnwrap.server.MinecraftServer server,yarnwrap.entity.Entity entity,boolean silent,yarnwrap.command.ReturnValueConsumer resultStorer,Object entityAnchor,yarnwrap.network.message.SignedCommandArguments signedArguments,yarnwrap.util.thread.FutureQueue messageChainTaskQueue) { this.wrapperContained = new net.minecraft.server.command.ServerCommandSource(output.wrapperContained,pos.wrapperContained,rot.wrapperContained,world.wrapperContained,level,name,displayName.wrapperContained,server.wrapperContained,entity.wrapperContained,silent,resultStorer.wrapperContained,entityAnchor,signedArguments.wrapperContained,messageChainTaskQueue.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource withOutput(yarnwrap.server.command.CommandOutput output) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withOutput(output.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withOutput(yarnwrap.server.command.CommandOutput output, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withOutput(output.wrapperContained)); }
// public java.util.concurrent.CompletableFuture method_41212(Object registry) { return wrapperContained.method_41212(registry); }
// public static java.util.concurrent.CompletableFuture method_41212(Object registry, ) { return net.minecraft.server.command.ServerCommandSource.method_41212(registry); }
public yarnwrap.server.command.ServerCommandSource withSignedArguments(yarnwrap.network.message.SignedCommandArguments signedArguments,yarnwrap.util.thread.FutureQueue messageChainTaskQueue) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withSignedArguments(signedArguments.wrapperContained,messageChainTaskQueue.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withSignedArguments(yarnwrap.network.message.SignedCommandArguments signedArguments,yarnwrap.util.thread.FutureQueue messageChainTaskQueue, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withSignedArguments(signedArguments.wrapperContained,messageChainTaskQueue.wrapperContained)); }
public boolean isExecutedByPlayer() { return wrapperContained.isExecutedByPlayer(); }
// public static boolean isExecutedByPlayer() { return net.minecraft.server.command.ServerCommandSource.isExecutedByPlayer(); }
public yarnwrap.network.message.SignedCommandArguments getSignedArguments() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.getSignedArguments()); }
// public static yarnwrap.network.message.SignedCommandArguments getSignedArguments() { return new yarnwrap.network.message.SignedCommandArguments(net.minecraft.server.command.ServerCommandSource.getSignedArguments()); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer()); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.command.ServerCommandSource.getPlayer()); }
// public void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
// public static void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params, ) { net.minecraft.server.command.ServerCommandSource.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
public yarnwrap.util.thread.FutureQueue getMessageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(wrapperContained.getMessageChainTaskQueue()); }
// public static yarnwrap.util.thread.FutureQueue getMessageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(net.minecraft.server.command.ServerCommandSource.getMessageChainTaskQueue()); }
public boolean shouldFilterText(yarnwrap.server.network.ServerPlayerEntity recipient) { return wrapperContained.shouldFilterText(recipient.wrapperContained); }
// public static boolean shouldFilterText(yarnwrap.server.network.ServerPlayerEntity recipient, ) { return net.minecraft.server.command.ServerCommandSource.shouldFilterText(recipient.wrapperContained); }
public void sendMessage(yarnwrap.text.Text message) { wrapperContained.sendMessage(message.wrapperContained); }
// public static void sendMessage(yarnwrap.text.Text message, ) { net.minecraft.server.command.ServerCommandSource.sendMessage(message.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource withLevel(int level) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLevel(level)); }
// public static yarnwrap.server.command.ServerCommandSource withLevel(int level, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withLevel(level)); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayerOrThrow() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayerOrThrow()); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayerOrThrow() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.command.ServerCommandSource.getPlayerOrThrow()); }
public yarnwrap.server.command.ServerCommandSource withPosition(yarnwrap.util.math.Vec3d position) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withPosition(position.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withPosition(yarnwrap.util.math.Vec3d position, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withPosition(position.wrapperContained)); }
public yarnwrap.server.command.ServerCommandSource mergeReturnValueConsumers(yarnwrap.command.ReturnValueConsumer returnValueConsumer,java.util.function.BinaryOperator merger) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.mergeReturnValueConsumers(returnValueConsumer.wrapperContained,merger)); }
// public static yarnwrap.server.command.ServerCommandSource mergeReturnValueConsumers(yarnwrap.command.ReturnValueConsumer returnValueConsumer,java.util.function.BinaryOperator merger, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.mergeReturnValueConsumers(returnValueConsumer.wrapperContained,merger)); }
public yarnwrap.util.math.Vec2f getRotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.getRotation()); }
// public static yarnwrap.util.math.Vec2f getRotation() { return new yarnwrap.util.math.Vec2f(net.minecraft.server.command.ServerCommandSource.getRotation()); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
// public static yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.command.ServerCommandSource.getServer()); }
// public void sendToOps(yarnwrap.text.Text message) { wrapperContained.sendToOps(message.wrapperContained); }
// public static void sendToOps(yarnwrap.text.Text message, ) { net.minecraft.server.command.ServerCommandSource.sendToOps(message.wrapperContained); }
public void sendError(yarnwrap.text.Text message) { wrapperContained.sendError(message.wrapperContained); }
// public static void sendError(yarnwrap.text.Text message, ) { net.minecraft.server.command.ServerCommandSource.sendError(message.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.server.command.ServerCommandSource.getName(); }
public yarnwrap.server.command.ServerCommandSource withRotation(yarnwrap.util.math.Vec2f rotation) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withRotation(rotation.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withRotation(yarnwrap.util.math.Vec2f rotation, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withRotation(rotation.wrapperContained)); }
public yarnwrap.server.command.ServerCommandSource withSilent() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withSilent()); }
// public static yarnwrap.server.command.ServerCommandSource withSilent() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withSilent()); }
// public yarnwrap.server.command.ServerCommandSource withEntityAnchor(Object anchor) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withEntityAnchor(anchor)); }
// public static yarnwrap.server.command.ServerCommandSource withEntityAnchor(Object anchor, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withEntityAnchor(anchor)); }
public Object getEntityAnchor() { return wrapperContained.getEntityAnchor(); }
// public static Object getEntityAnchor() { return net.minecraft.server.command.ServerCommandSource.getEntityAnchor(); }
// public yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.entity.Entity entity,Object anchor) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLookingAt(entity.wrapperContained,anchor)); }
// public static yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.entity.Entity entity,Object anchor, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withLookingAt(entity.wrapperContained,anchor)); }
public yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.util.math.Vec3d position) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLookingAt(position.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.util.math.Vec3d position, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withLookingAt(position.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
// public static yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.command.ServerCommandSource.getPosition()); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.server.command.ServerCommandSource.getDisplayName()); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.ServerCommandSource.getWorld()); }
public void sendFeedback(java.util.function.Supplier feedbackSupplier,boolean broadcastToOps) { wrapperContained.sendFeedback(feedbackSupplier,broadcastToOps); }
// public static void sendFeedback(java.util.function.Supplier feedbackSupplier,boolean broadcastToOps, ) { net.minecraft.server.command.ServerCommandSource.sendFeedback(feedbackSupplier,broadcastToOps); }
public yarnwrap.server.command.ServerCommandSource withWorld(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withWorld(world.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withWorld(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withWorld(world.wrapperContained)); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
// public static yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(net.minecraft.server.command.ServerCommandSource.getEntity()); }
// public yarnwrap.entity.Entity getEntityOrThrow() { return new yarnwrap.entity.Entity(wrapperContained.getEntityOrThrow()); }
// public static yarnwrap.entity.Entity getEntityOrThrow() { return new yarnwrap.entity.Entity(net.minecraft.server.command.ServerCommandSource.getEntityOrThrow()); }
public yarnwrap.server.command.ServerCommandSource withMaxLevel(int level) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withMaxLevel(level)); }
// public static yarnwrap.server.command.ServerCommandSource withMaxLevel(int level, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withMaxLevel(level)); }
public yarnwrap.server.command.ServerCommandSource withEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withEntity(entity.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource withEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.ServerCommandSource.withEntity(entity.wrapperContained)); }

}