package yarnwrap.entity.projectile.thrown;
public class ExperienceBottleEntity { public net.minecraft.entity.projectile.thrown.ExperienceBottleEntity wrapperContained; public ExperienceBottleEntity(net.minecraft.entity.projectile.thrown.ExperienceBottleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public ExperienceBottleEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ExperienceBottleEntity(world.wrapperContained,x,y,z); }
public ExperienceBottleEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ExperienceBottleEntity(world.wrapperContained,owner.wrapperContained); }

}