package yarnwrap.world.entity;
public class EntityQueriable { public net.minecraft.world.entity.EntityQueriable wrapperContained; public EntityQueriable(net.minecraft.world.entity.EntityQueriable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.entity.UniquelyIdentifiable getEntity(java.util.UUID uuid) { return new yarnwrap.world.entity.UniquelyIdentifiable(wrapperContained.getEntity(uuid)); }
// public static yarnwrap.world.entity.UniquelyIdentifiable getEntity(java.util.UUID uuid, ) { return new yarnwrap.world.entity.UniquelyIdentifiable(net.minecraft.world.entity.EntityQueriable.getEntity(uuid)); }

}