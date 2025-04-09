package yarnwrap.command;
public class EntitySelector { public net.minecraft.command.EntitySelector wrapperContained; public EntitySelector(net.minecraft.command.EntitySelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public int limit() { return wrapperContained.limit; }
// public java.util.function.Function positionOffset() { return wrapperContained.positionOffset; }
// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public Object distance() { return wrapperContained.distance; }
// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public boolean usesAt() { return wrapperContained.usesAt; }
// public boolean senderOnly() { return wrapperContained.senderOnly; }
// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
// public java.lang.String playerName() { return wrapperContained.playerName; }
// public yarnwrap.util.TypeFilter entityFilter() { return new yarnwrap.util.TypeFilter(wrapperContained.entityFilter); }
// public yarnwrap.util.TypeFilter PASSTHROUGH_FILTER() { return new yarnwrap.util.TypeFilter(wrapperContained.PASSTHROUGH_FILTER); }
public int MAX_VALUE() { return wrapperContained.MAX_VALUE; }
public java.util.function.BiConsumer ARBITRARY() { return wrapperContained.ARBITRARY; }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public boolean usesAt() { return wrapperContained.usesAt(); }
// public int getAppendLimit() { return wrapperContained.getAppendLimit(); }
// public yarnwrap.util.math.Box getOffsetBox(yarnwrap.util.math.Vec3d offset) { return new yarnwrap.util.math.Box(wrapperContained.getOffsetBox(offset.wrapperContained)); }
// public yarnwrap.entity.Entity getEntity(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(source.wrapperContained)); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayer(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(source.wrapperContained)); }
// public java.util.List getPlayers(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.getPlayers(source.wrapperContained); }
// public java.util.List getEntities(yarnwrap.util.math.Vec3d pos,java.util.List entities) { return wrapperContained.getEntities(pos.wrapperContained,entities); }
public int getLimit() { return wrapperContained.getLimit(); }
// public java.util.List getEntities(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.getEntities(source.wrapperContained); }
// public java.util.function.Predicate getPositionPredicate(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Box box,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.getPositionPredicate(pos.wrapperContained,box.wrapperContained,enabledFeatures.wrapperContained); }
// public void checkSourcePermission(yarnwrap.server.command.ServerCommandSource source) { wrapperContained.checkSourcePermission(source.wrapperContained); }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers(); }
public boolean isSenderOnly() { return wrapperContained.isSenderOnly(); }
public boolean isLocalWorldOnly() { return wrapperContained.isLocalWorldOnly(); }
public yarnwrap.text.Text getNames(java.util.List entities) { return new yarnwrap.text.Text(wrapperContained.getNames(entities)); }
// public void appendEntitiesFromWorld(java.util.List entities,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Box box,java.util.function.Predicate predicate) { wrapperContained.appendEntitiesFromWorld(entities,world.wrapperContained,box.wrapperContained,predicate); }

}