package yarnwrap.entity.projectile.thrown;
public class LingeringPotionEntity { public net.minecraft.entity.projectile.thrown.LingeringPotionEntity wrapperContained; public LingeringPotionEntity(net.minecraft.entity.projectile.thrown.LingeringPotionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public LingeringPotionEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.LingeringPotionEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public LingeringPotionEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.LingeringPotionEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }

}