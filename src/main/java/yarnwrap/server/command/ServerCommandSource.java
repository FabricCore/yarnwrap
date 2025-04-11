package yarnwrap.server.command;
public class ServerCommandSource { public net.minecraft.server.command.ServerCommandSource wrapperContained; public ServerCommandSource(net.minecraft.server.command.ServerCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.SignedCommandArguments signedArguments() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.signedArguments); }
// public void signedArguments(yarnwrap.network.message.SignedCommandArguments value) { wrapperContained.signedArguments = value.wrapperContained; }
// public yarnwrap.util.thread.FutureQueue messageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(wrapperContained.messageChainTaskQueue); }
// public void messageChainTaskQueue(yarnwrap.util.thread.FutureQueue value) { wrapperContained.messageChainTaskQueue = value.wrapperContained; }
// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.returnValueConsumer = value.wrapperContained; }
// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public Object entityAnchor() { return wrapperContained.entityAnchor; }
// // public void entityAnchor(Object value) { wrapperContained.entityAnchor = value; }
// public yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(wrapperContained.position); }
// public void position(yarnwrap.util.math.Vec3d value) { wrapperContained.position = value.wrapperContained; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.server.command.CommandOutput output() { return new yarnwrap.server.command.CommandOutput(wrapperContained.output); }
// public void output(yarnwrap.server.command.CommandOutput value) { wrapperContained.output = value.wrapperContained; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public yarnwrap.util.math.Vec2f rotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.Vec2f value) { wrapperContained.rotation = value.wrapperContained; }
// public boolean silent() { return wrapperContained.silent; }
// public void silent(boolean value) { wrapperContained.silent = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_PLAYER_EXCEPTION() { return wrapperContained.REQUIRES_PLAYER_EXCEPTION; }
// public void REQUIRES_PLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REQUIRES_PLAYER_EXCEPTION = value; }
// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_ENTITY_EXCEPTION() { return wrapperContained.REQUIRES_ENTITY_EXCEPTION; }
// public void REQUIRES_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REQUIRES_ENTITY_EXCEPTION = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
public yarnwrap.server.command.ServerCommandSource withOutput(yarnwrap.server.command.CommandOutput output) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withOutput(output.wrapperContained)); }
public yarnwrap.server.command.ServerCommandSource withSignedArguments(yarnwrap.network.message.SignedCommandArguments signedArguments,yarnwrap.util.thread.FutureQueue messageChainTaskQueue) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withSignedArguments(signedArguments.wrapperContained,messageChainTaskQueue.wrapperContained)); }
public boolean isExecutedByPlayer() { return wrapperContained.isExecutedByPlayer(); }
public yarnwrap.network.message.SignedCommandArguments getSignedArguments() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.getSignedArguments()); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer()); }
// public void sendChatMessage(yarnwrap.network.message.SentMessage message,boolean filterMaskEnabled,Object params) { wrapperContained.sendChatMessage(message.wrapperContained,filterMaskEnabled,params); }
public yarnwrap.util.thread.FutureQueue getMessageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(wrapperContained.getMessageChainTaskQueue()); }
public boolean shouldFilterText(yarnwrap.server.network.ServerPlayerEntity recipient) { return wrapperContained.shouldFilterText(recipient.wrapperContained); }
public void sendMessage(yarnwrap.text.Text message) { wrapperContained.sendMessage(message.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource withLevel(int level) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLevel(level)); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayerOrThrow() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayerOrThrow()); }
public yarnwrap.server.command.ServerCommandSource withPosition(yarnwrap.util.math.Vec3d position) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withPosition(position.wrapperContained)); }
public yarnwrap.server.command.ServerCommandSource mergeReturnValueConsumers(yarnwrap.command.ReturnValueConsumer returnValueConsumer,java.util.function.BinaryOperator merger) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.mergeReturnValueConsumers(returnValueConsumer.wrapperContained,merger)); }
public yarnwrap.util.math.Vec2f getRotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.getRotation()); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
// public void sendToOps(yarnwrap.text.Text message) { wrapperContained.sendToOps(message.wrapperContained); }
public void sendError(yarnwrap.text.Text message) { wrapperContained.sendError(message.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.server.command.ServerCommandSource withRotation(yarnwrap.util.math.Vec2f rotation) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withRotation(rotation.wrapperContained)); }
public yarnwrap.server.command.ServerCommandSource withSilent() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withSilent()); }
// public yarnwrap.server.command.ServerCommandSource withEntityAnchor(Object anchor) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withEntityAnchor(anchor)); }
public Object getEntityAnchor() { return wrapperContained.getEntityAnchor(); }
// public yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.entity.Entity entity,Object anchor) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLookingAt(entity.wrapperContained,anchor)); }
public yarnwrap.server.command.ServerCommandSource withLookingAt(yarnwrap.util.math.Vec3d position) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withLookingAt(position.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public void sendFeedback(java.util.function.Supplier feedbackSupplier,boolean broadcastToOps) { wrapperContained.sendFeedback(feedbackSupplier,broadcastToOps); }
public yarnwrap.server.command.ServerCommandSource withWorld(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withWorld(world.wrapperContained)); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
// public yarnwrap.entity.Entity getEntityOrThrow() { return new yarnwrap.entity.Entity(wrapperContained.getEntityOrThrow()); }
public yarnwrap.server.command.ServerCommandSource withMaxLevel(int level) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withMaxLevel(level)); }
public yarnwrap.server.command.ServerCommandSource withEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.withEntity(entity.wrapperContained)); }

}