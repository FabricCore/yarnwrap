package yarnwrap.entity.projectile.thrown;
public class SplashPotionEntity { public net.minecraft.entity.projectile.thrown.SplashPotionEntity wrapperContained; public SplashPotionEntity(net.minecraft.entity.projectile.thrown.SplashPotionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public SplashPotionEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SplashPotionEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public SplashPotionEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SplashPotionEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public int method_67150(double baseDuration) { return wrapperContained.method_67150(baseDuration); }
// public static int method_67150(double baseDuration, ) { return net.minecraft.entity.projectile.thrown.SplashPotionEntity.method_67150(baseDuration); }

}