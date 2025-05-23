package yarnwrap.entity.projectile.thrown;
public class EggEntity { public net.minecraft.entity.projectile.thrown.EggEntity wrapperContained; public EggEntity(net.minecraft.entity.projectile.thrown.EggEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions EMPTY_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.EMPTY_DIMENSIONS); }
// public void EMPTY_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.EMPTY_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions EMPTY_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.projectile.thrown.EggEntity.EMPTY_DIMENSIONS); }
// public static void EMPTY_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.projectile.thrown.EggEntity.EMPTY_DIMENSIONS = value.wrapperContained; }

public EggEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EggEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public EggEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EggEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public java.util.Optional method_67534(yarnwrap.registry.entry.LazyRegistryEntryReference variant) { return wrapperContained.method_67534(variant.wrapperContained); }
// public static java.util.Optional method_67534(yarnwrap.registry.entry.LazyRegistryEntryReference variant, ) { return net.minecraft.entity.projectile.thrown.EggEntity.method_67534(variant.wrapperContained); }

}