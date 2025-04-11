package yarnwrap.entity.projectile;
public class SmallFireballEntity { public net.minecraft.entity.projectile.SmallFireballEntity wrapperContained; public SmallFireballEntity(net.minecraft.entity.projectile.SmallFireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public SmallFireballEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.entity.projectile.SmallFireballEntity(world.wrapperContained,x,y,z,velocity.wrapperContained); }
public SmallFireballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.entity.projectile.SmallFireballEntity(world.wrapperContained,owner.wrapperContained,velocity.wrapperContained); }

}