package yarnwrap.entity;
public class Tameable { public net.minecraft.entity.Tameable wrapperContained; public Tameable(net.minecraft.entity.Tameable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.LivingEntity getOwner() { return new yarnwrap.entity.LivingEntity(wrapperContained.getOwner()); }
// public static yarnwrap.entity.LivingEntity getOwner() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.Tameable.getOwner()); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.entity.Tameable.getWorld()); }
public yarnwrap.entity.LazyEntityReference getOwnerReference() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.getOwnerReference()); }
// public static yarnwrap.entity.LazyEntityReference getOwnerReference() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.Tameable.getOwnerReference()); }
public yarnwrap.entity.LivingEntity getTopLevelOwner() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTopLevelOwner()); }
// public static yarnwrap.entity.LivingEntity getTopLevelOwner() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.Tameable.getTopLevelOwner()); }

}