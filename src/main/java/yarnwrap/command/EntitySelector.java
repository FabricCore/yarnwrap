package yarnwrap.command;
public class EntitySelector { public net.minecraft.command.EntitySelector wrapperContained; public EntitySelector(net.minecraft.command.EntitySelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.command.EntitySelector.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.command.EntitySelector.uuid = value; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public static int limit() { return net.minecraft.command.EntitySelector.limit; }
// public static void limit(int value, ) { net.minecraft.command.EntitySelector.limit = value; }

// public java.util.function.Function positionOffset() { return wrapperContained.positionOffset; }
// public void positionOffset(java.util.function.Function value) { wrapperContained.positionOffset = value; }
// public static java.util.function.Function positionOffset() { return net.minecraft.command.EntitySelector.positionOffset; }
// public static void positionOffset(java.util.function.Function value, ) { net.minecraft.command.EntitySelector.positionOffset = value; }

// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public void box(yarnwrap.util.math.Box value) { wrapperContained.box = value.wrapperContained; }
// public static yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(net.minecraft.command.EntitySelector.box); }
// public static void box(yarnwrap.util.math.Box value, ) { net.minecraft.command.EntitySelector.box = value.wrapperContained; }

// public Object distance() { return wrapperContained.distance; }
// // public void distance(Object value) { wrapperContained.distance = value; }
// // public static Object distance() { return net.minecraft.command.EntitySelector.distance; }
// // public static void distance(Object value, ) { net.minecraft.command.EntitySelector.distance = value; }

// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public void sorter(java.util.function.BiConsumer value) { wrapperContained.sorter = value; }
// public static java.util.function.BiConsumer sorter() { return net.minecraft.command.EntitySelector.sorter; }
// public static void sorter(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelector.sorter = value; }

// public boolean usesAt() { return wrapperContained.usesAt; }
// public void usesAt(boolean value) { wrapperContained.usesAt = value; }
// public static boolean usesAt() { return net.minecraft.command.EntitySelector.usesAt; }
// public static void usesAt(boolean value, ) { net.minecraft.command.EntitySelector.usesAt = value; }

// public boolean senderOnly() { return wrapperContained.senderOnly; }
// public void senderOnly(boolean value) { wrapperContained.senderOnly = value; }
// public static boolean senderOnly() { return net.minecraft.command.EntitySelector.senderOnly; }
// public static void senderOnly(boolean value, ) { net.minecraft.command.EntitySelector.senderOnly = value; }

// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
// public void localWorldOnly(boolean value) { wrapperContained.localWorldOnly = value; }
// public static boolean localWorldOnly() { return net.minecraft.command.EntitySelector.localWorldOnly; }
// public static void localWorldOnly(boolean value, ) { net.minecraft.command.EntitySelector.localWorldOnly = value; }

// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
// public void includesNonPlayers(boolean value) { wrapperContained.includesNonPlayers = value; }
// public static boolean includesNonPlayers() { return net.minecraft.command.EntitySelector.includesNonPlayers; }
// public static void includesNonPlayers(boolean value, ) { net.minecraft.command.EntitySelector.includesNonPlayers = value; }

// public java.lang.String playerName() { return wrapperContained.playerName; }
// public void playerName(java.lang.String value) { wrapperContained.playerName = value; }
// public static java.lang.String playerName() { return net.minecraft.command.EntitySelector.playerName; }
// public static void playerName(java.lang.String value, ) { net.minecraft.command.EntitySelector.playerName = value; }

// public yarnwrap.util.TypeFilter entityFilter() { return new yarnwrap.util.TypeFilter(wrapperContained.entityFilter); }
// public void entityFilter(yarnwrap.util.TypeFilter value) { wrapperContained.entityFilter = value.wrapperContained; }
// public static yarnwrap.util.TypeFilter entityFilter() { return new yarnwrap.util.TypeFilter(net.minecraft.command.EntitySelector.entityFilter); }
// public static void entityFilter(yarnwrap.util.TypeFilter value, ) { net.minecraft.command.EntitySelector.entityFilter = value.wrapperContained; }

// public yarnwrap.util.TypeFilter PASSTHROUGH_FILTER() { return new yarnwrap.util.TypeFilter(wrapperContained.PASSTHROUGH_FILTER); }
// public void PASSTHROUGH_FILTER(yarnwrap.util.TypeFilter value) { wrapperContained.PASSTHROUGH_FILTER = value.wrapperContained; }
// public static yarnwrap.util.TypeFilter PASSTHROUGH_FILTER() { return new yarnwrap.util.TypeFilter(net.minecraft.command.EntitySelector.PASSTHROUGH_FILTER); }
// public static void PASSTHROUGH_FILTER(yarnwrap.util.TypeFilter value, ) { net.minecraft.command.EntitySelector.PASSTHROUGH_FILTER = value.wrapperContained; }

// public int MAX_VALUE() { return wrapperContained.MAX_VALUE; }
// public void MAX_VALUE(int value) { wrapperContained.MAX_VALUE = value; }
public static int MAX_VALUE() { return net.minecraft.command.EntitySelector.MAX_VALUE; }
// public static void MAX_VALUE(int value, ) { net.minecraft.command.EntitySelector.MAX_VALUE = value; }

// public java.util.function.BiConsumer ARBITRARY() { return wrapperContained.ARBITRARY; }
// public void ARBITRARY(java.util.function.BiConsumer value) { wrapperContained.ARBITRARY = value; }
public static java.util.function.BiConsumer ARBITRARY() { return net.minecraft.command.EntitySelector.ARBITRARY; }
// public static void ARBITRARY(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelector.ARBITRARY = value; }

// public java.util.List predicates() { return wrapperContained.predicates; }
// public void predicates(java.util.List value) { wrapperContained.predicates = value; }
// public static java.util.List predicates() { return net.minecraft.command.EntitySelector.predicates; }
// public static void predicates(java.util.List value, ) { net.minecraft.command.EntitySelector.predicates = value; }

// public EntitySelector(int count,boolean includesNonPlayers,boolean localWorldOnly,java.util.List predicates,Object distance,java.util.function.Function positionOffset,yarnwrap.util.math.Box box,java.util.function.BiConsumer sorter,boolean senderOnly,java.lang.String playerName,java.util.UUID uuid,yarnwrap.entity.EntityType type,boolean usesAt) { this.wrapperContained = new net.minecraft.command.EntitySelector(count,includesNonPlayers,localWorldOnly,predicates,distance,positionOffset,box.wrapperContained,sorter,senderOnly,playerName,uuid,type.wrapperContained,usesAt); }
// public boolean usesAt() { return wrapperContained.usesAt(); }
// // public static boolean usesAt() { return net.minecraft.command.EntitySelector.usesAt(); }
// public void method_47802(yarnwrap.util.math.Vec3d pos,java.util.List entities) { wrapperContained.method_47802(pos.wrapperContained,entities); }
// public static void method_47802(yarnwrap.util.math.Vec3d pos,java.util.List entities, ) { net.minecraft.command.EntitySelector.method_47802(pos.wrapperContained,entities); }
// public int getAppendLimit() { return wrapperContained.getAppendLimit(); }
// public static int getAppendLimit() { return net.minecraft.command.EntitySelector.getAppendLimit(); }
// public boolean method_61159(yarnwrap.resource.featuretoggle.FeatureSet entity) { return wrapperContained.method_61159(entity.wrapperContained); }
// public static boolean method_61159(yarnwrap.resource.featuretoggle.FeatureSet entity, ) { return net.minecraft.command.EntitySelector.method_61159(entity.wrapperContained); }
// public yarnwrap.util.math.Box getOffsetBox(yarnwrap.util.math.Vec3d offset) { return new yarnwrap.util.math.Box(wrapperContained.getOffsetBox(offset.wrapperContained)); }
// public static yarnwrap.util.math.Box getOffsetBox(yarnwrap.util.math.Vec3d offset, ) { return new yarnwrap.util.math.Box(net.minecraft.command.EntitySelector.getOffsetBox(offset.wrapperContained)); }
// public yarnwrap.entity.Entity getEntity(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(source.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.entity.Entity(net.minecraft.command.EntitySelector.getEntity(source.wrapperContained)); }
// public boolean method_9810(yarnwrap.util.math.Box entity) { return wrapperContained.method_9810(entity.wrapperContained); }
// public static boolean method_9810(yarnwrap.util.math.Box entity, ) { return net.minecraft.command.EntitySelector.method_9810(entity.wrapperContained); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayer(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(source.wrapperContained)); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.command.EntitySelector.getPlayer(source.wrapperContained)); }
// public boolean method_9812(yarnwrap.util.math.Vec3d entity) { return wrapperContained.method_9812(entity.wrapperContained); }
// public static boolean method_9812(yarnwrap.util.math.Vec3d entity, ) { return net.minecraft.command.EntitySelector.method_9812(entity.wrapperContained); }
// public java.util.List getPlayers(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.getPlayers(source.wrapperContained); }
// public static java.util.List getPlayers(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.command.EntitySelector.getPlayers(source.wrapperContained); }
// public java.util.List getEntities(yarnwrap.util.math.Vec3d pos,java.util.List entities) { return wrapperContained.getEntities(pos.wrapperContained,entities); }
// public static java.util.List getEntities(yarnwrap.util.math.Vec3d pos,java.util.List entities, ) { return net.minecraft.command.EntitySelector.getEntities(pos.wrapperContained,entities); }
public int getLimit() { return wrapperContained.getLimit(); }
// public static int getLimit() { return net.minecraft.command.EntitySelector.getLimit(); }
// public java.util.List getEntities(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.getEntities(source.wrapperContained); }
// public static java.util.List getEntities(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.command.EntitySelector.getEntities(source.wrapperContained); }
// public java.util.function.Predicate getPositionPredicate(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Box box,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.getPositionPredicate(pos.wrapperContained,box.wrapperContained,enabledFeatures.wrapperContained); }
// public static java.util.function.Predicate getPositionPredicate(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Box box,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return net.minecraft.command.EntitySelector.getPositionPredicate(pos.wrapperContained,box.wrapperContained,enabledFeatures.wrapperContained); }
// public void checkSourcePermission(yarnwrap.server.command.ServerCommandSource source) { wrapperContained.checkSourcePermission(source.wrapperContained); }
// public static void checkSourcePermission(yarnwrap.server.command.ServerCommandSource source, ) { net.minecraft.command.EntitySelector.checkSourcePermission(source.wrapperContained); }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers(); }
// // public static boolean includesNonPlayers() { return net.minecraft.command.EntitySelector.includesNonPlayers(); }
public boolean isSenderOnly() { return wrapperContained.isSenderOnly(); }
// public static boolean isSenderOnly() { return net.minecraft.command.EntitySelector.isSenderOnly(); }
public boolean isLocalWorldOnly() { return wrapperContained.isLocalWorldOnly(); }
// public static boolean isLocalWorldOnly() { return net.minecraft.command.EntitySelector.isLocalWorldOnly(); }
// public yarnwrap.text.Text getNames(java.util.List entities) { return new yarnwrap.text.Text(wrapperContained.getNames(entities)); }
// public static yarnwrap.text.Text getNames(java.util.List entities, ) { return new yarnwrap.text.Text(net.minecraft.command.EntitySelector.getNames(entities)); }
// public void appendEntitiesFromWorld(java.util.List entities,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Box box,java.util.function.Predicate predicate) { wrapperContained.appendEntitiesFromWorld(entities,world.wrapperContained,box.wrapperContained,predicate); }
// public static void appendEntitiesFromWorld(java.util.List entities,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Box box,java.util.function.Predicate predicate, ) { net.minecraft.command.EntitySelector.appendEntitiesFromWorld(entities,world.wrapperContained,box.wrapperContained,predicate); }

}