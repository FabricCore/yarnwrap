package yarnwrap.command;
public class EntitySelector { public net.minecraft.command.EntitySelector wrapperContained; public EntitySelector(net.minecraft.command.EntitySelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public java.util.function.Function positionOffset() { return wrapperContained.positionOffset; }
// public void positionOffset(java.util.function.Function value) { wrapperContained.positionOffset = value; }
// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public void box(yarnwrap.util.math.Box value) { wrapperContained.box = value.wrapperContained; }
// public Object distance() { return wrapperContained.distance; }
// // public void distance(Object value) { wrapperContained.distance = value; }
// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public void sorter(java.util.function.BiConsumer value) { wrapperContained.sorter = value; }
// public boolean usesAt() { return wrapperContained.usesAt; }
// public void usesAt(boolean value) { wrapperContained.usesAt = value; }
// public boolean senderOnly() { return wrapperContained.senderOnly; }
// public void senderOnly(boolean value) { wrapperContained.senderOnly = value; }
// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
// public void localWorldOnly(boolean value) { wrapperContained.localWorldOnly = value; }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
// public void includesNonPlayers(boolean value) { wrapperContained.includesNonPlayers = value; }
// public java.lang.String playerName() { return wrapperContained.playerName; }
// public void playerName(java.lang.String value) { wrapperContained.playerName = value; }
// public yarnwrap.util.TypeFilter entityFilter() { return new yarnwrap.util.TypeFilter(wrapperContained.entityFilter); }
// public void entityFilter(yarnwrap.util.TypeFilter value) { wrapperContained.entityFilter = value.wrapperContained; }
// public yarnwrap.util.TypeFilter PASSTHROUGH_FILTER() { return new yarnwrap.util.TypeFilter(wrapperContained.PASSTHROUGH_FILTER); }
// public void PASSTHROUGH_FILTER(yarnwrap.util.TypeFilter value) { wrapperContained.PASSTHROUGH_FILTER = value.wrapperContained; }
public int MAX_VALUE() { return wrapperContained.MAX_VALUE; }
// public void MAX_VALUE(int value) { wrapperContained.MAX_VALUE = value; }
public java.util.function.BiConsumer ARBITRARY() { return wrapperContained.ARBITRARY; }
// public void ARBITRARY(java.util.function.BiConsumer value) { wrapperContained.ARBITRARY = value; }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public void predicates(java.util.List value) { wrapperContained.predicates = value; }
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