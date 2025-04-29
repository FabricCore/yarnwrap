package yarnwrap.entity.projectile;
public class SpectralArrowEntity { public net.minecraft.entity.projectile.SpectralArrowEntity wrapperContained; public SpectralArrowEntity(net.minecraft.entity.projectile.SpectralArrowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public static int duration() { return net.minecraft.entity.projectile.SpectralArrowEntity.duration; }
// public static void duration(int value, ) { net.minecraft.entity.projectile.SpectralArrowEntity.duration = value; }

public SpectralArrowEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.SpectralArrowEntity(world.wrapperContained,x,y,z,stack.wrapperContained,shotFrom.wrapperContained); }
public SpectralArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.SpectralArrowEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained,shotFrom.wrapperContained); }

}