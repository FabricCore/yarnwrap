package yarnwrap.entity.projectile.thrown;
public class ThrownItemEntity { public net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained; public ThrownItemEntity(net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.thrown.ThrownItemEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.thrown.ThrownItemEntity.ITEM = value.wrapperContained; }

// public ThrownItemEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ThrownItemEntity(type.wrapperContained,x,y,z,world.wrapperContained,stack.wrapperContained); }
// public ThrownItemEntity(yarnwrap.entity.EntityType type,yarnwrap.entity.LivingEntity owner,yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ThrownItemEntity(type.wrapperContained,owner.wrapperContained,world.wrapperContained,stack.wrapperContained); }
public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public static void setItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.projectile.thrown.ThrownItemEntity.setItem(stack.wrapperContained); }
// public yarnwrap.item.Item getDefaultItem() { return new yarnwrap.item.Item(wrapperContained.getDefaultItem()); }
// public static yarnwrap.item.Item getDefaultItem() { return new yarnwrap.item.Item(net.minecraft.entity.projectile.thrown.ThrownItemEntity.getDefaultItem()); }

}