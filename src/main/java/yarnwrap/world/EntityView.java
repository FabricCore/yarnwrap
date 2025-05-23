package yarnwrap.world;
public class EntityView { public net.minecraft.world.EntityView wrapperContained; public EntityView(net.minecraft.world.EntityView wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getOtherEntities(yarnwrap.entity.Entity except,yarnwrap.util.math.Box box,java.util.function.Predicate predicate) { return wrapperContained.getOtherEntities(except.wrapperContained,box.wrapperContained,predicate); }
// public static java.util.List getOtherEntities(yarnwrap.entity.Entity except,yarnwrap.util.math.Box box,java.util.function.Predicate predicate, ) { return net.minecraft.world.EntityView.getOtherEntities(except.wrapperContained,box.wrapperContained,predicate); }
public java.util.List getOtherEntities(yarnwrap.entity.Entity except,yarnwrap.util.math.Box box) { return wrapperContained.getOtherEntities(except.wrapperContained,box.wrapperContained); }
// public static java.util.List getOtherEntities(yarnwrap.entity.Entity except,yarnwrap.util.math.Box box, ) { return net.minecraft.world.EntityView.getOtherEntities(except.wrapperContained,box.wrapperContained); }
public java.util.List getEntitiesByClass(java.lang.Class entityClass,yarnwrap.util.math.Box box,java.util.function.Predicate predicate) { return wrapperContained.getEntitiesByClass(entityClass,box.wrapperContained,predicate); }
// public static java.util.List getEntitiesByClass(java.lang.Class entityClass,yarnwrap.util.math.Box box,java.util.function.Predicate predicate, ) { return net.minecraft.world.EntityView.getEntitiesByClass(entityClass,box.wrapperContained,predicate); }
public yarnwrap.entity.player.PlayerEntity getClosestPlayer(double x,double y,double z,double maxDistance,java.util.function.Predicate targetPredicate) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getClosestPlayer(x,y,z,maxDistance,targetPredicate)); }
// public static yarnwrap.entity.player.PlayerEntity getClosestPlayer(double x,double y,double z,double maxDistance,java.util.function.Predicate targetPredicate, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.world.EntityView.getClosestPlayer(x,y,z,maxDistance,targetPredicate)); }
public boolean doesNotIntersectEntities(yarnwrap.entity.Entity except,yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.doesNotIntersectEntities(except.wrapperContained,shape.wrapperContained); }
// public static boolean doesNotIntersectEntities(yarnwrap.entity.Entity except,yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.world.EntityView.doesNotIntersectEntities(except.wrapperContained,shape.wrapperContained); }
public java.util.List getEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate) { return wrapperContained.getEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate); }
// public static java.util.List getEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate, ) { return net.minecraft.world.EntityView.getEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate); }
public java.util.List getPlayers() { return wrapperContained.getPlayers(); }
// public static java.util.List getPlayers() { return net.minecraft.world.EntityView.getPlayers(); }
public boolean isPlayerInRange(double x,double y,double z,double range) { return wrapperContained.isPlayerInRange(x,y,z,range); }
// public static boolean isPlayerInRange(double x,double y,double z,double range, ) { return net.minecraft.world.EntityView.isPlayerInRange(x,y,z,range); }
public yarnwrap.entity.player.PlayerEntity getClosestPlayer(double x,double y,double z,double maxDistance,boolean ignoreCreative) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getClosestPlayer(x,y,z,maxDistance,ignoreCreative)); }
// public static yarnwrap.entity.player.PlayerEntity getClosestPlayer(double x,double y,double z,double maxDistance,boolean ignoreCreative, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.world.EntityView.getClosestPlayer(x,y,z,maxDistance,ignoreCreative)); }
public yarnwrap.entity.player.PlayerEntity getClosestPlayer(yarnwrap.entity.Entity entity,double maxDistance) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getClosestPlayer(entity.wrapperContained,maxDistance)); }
// public static yarnwrap.entity.player.PlayerEntity getClosestPlayer(yarnwrap.entity.Entity entity,double maxDistance, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.world.EntityView.getClosestPlayer(entity.wrapperContained,maxDistance)); }
public java.util.List getNonSpectatingEntities(java.lang.Class entityClass,yarnwrap.util.math.Box box) { return wrapperContained.getNonSpectatingEntities(entityClass,box.wrapperContained); }
// public static java.util.List getNonSpectatingEntities(java.lang.Class entityClass,yarnwrap.util.math.Box box, ) { return net.minecraft.world.EntityView.getNonSpectatingEntities(entityClass,box.wrapperContained); }
public yarnwrap.entity.player.PlayerEntity getPlayerByUuid(java.util.UUID uuid) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getPlayerByUuid(uuid)); }
// public static yarnwrap.entity.player.PlayerEntity getPlayerByUuid(java.util.UUID uuid, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.world.EntityView.getPlayerByUuid(uuid)); }
public java.util.List getEntityCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.getEntityCollisions(entity.wrapperContained,box.wrapperContained); }
// public static java.util.List getEntityCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box, ) { return net.minecraft.world.EntityView.getEntityCollisions(entity.wrapperContained,box.wrapperContained); }

}