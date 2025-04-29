package yarnwrap.entity.projectile.thrown;
public class ThrownItemEntity { public net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained; public ThrownItemEntity(net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.thrown.ThrownItemEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.thrown.ThrownItemEntity.ITEM = value.wrapperContained; }

public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public static void setItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.projectile.thrown.ThrownItemEntity.setItem(stack.wrapperContained); }
// public yarnwrap.item.Item getDefaultItem() { return new yarnwrap.item.Item(wrapperContained.getDefaultItem()); }
// public static yarnwrap.item.Item getDefaultItem() { return new yarnwrap.item.Item(net.minecraft.entity.projectile.thrown.ThrownItemEntity.getDefaultItem()); }

}