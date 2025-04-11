package yarnwrap.entity.projectile.thrown;
public class ThrownEntity { public net.minecraft.entity.projectile.thrown.ThrownEntity wrapperContained; public ThrownEntity(net.minecraft.entity.projectile.thrown.ThrownEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public ThrownEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ThrownEntity(type.wrapperContained,x,y,z,world.wrapperContained); }
// public ThrownEntity(yarnwrap.entity.EntityType type,yarnwrap.entity.LivingEntity owner,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ThrownEntity(type.wrapperContained,owner.wrapperContained,world.wrapperContained); }

}