package yarnwrap.entity;
public class Tameable { public net.minecraft.entity.Tameable wrapperContained; public Tameable(net.minecraft.entity.Tameable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.LivingEntity getOwner() { return new yarnwrap.entity.LivingEntity(wrapperContained.getOwner()); }
public yarnwrap.world.EntityView getWorld() { return new yarnwrap.world.EntityView(wrapperContained.getWorld()); }
public java.util.UUID getOwnerUuid() { return wrapperContained.getOwnerUuid(); }

}