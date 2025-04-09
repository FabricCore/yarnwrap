package yarnwrap.server.command;
public class ServerCommandSource { public net.minecraft.server.command.ServerCommandSource wrapperContained; public ServerCommandSource(net.minecraft.server.command.ServerCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.SignedCommandArguments signedArguments() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.signedArguments); }
// public yarnwrap.util.thread.FutureQueue messageChainTaskQueue() { return new yarnwrap.util.thread.FutureQueue(wrapperContained.messageChainTaskQueue); }
// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public int level() { return wrapperContained.level; }
// public Object entityAnchor() { return wrapperContained.entityAnchor; }
// public yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(wrapperContained.position); }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.server.command.CommandOutput output() { return new yarnwrap.server.command.CommandOutput(wrapperContained.output); }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public yarnwrap.util.math.Vec2f rotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.rotation); }
// public boolean silent() { return wrapperContained.silent; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_PLAYER_EXCEPTION() { return wrapperContained.REQUIRES_PLAYER_EXCEPTION; }
// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public java.lang.String name() { return wrapperContained.name; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REQUIRES_ENTITY_EXCEPTION() { return wrapperContained.REQUIRES_ENTITY_EXCEPTION; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
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