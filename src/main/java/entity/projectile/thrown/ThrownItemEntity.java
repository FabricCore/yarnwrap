package yarnwrap.entity.projectile.thrown;
public class ThrownItemEntity { public net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained; public ThrownItemEntity(net.minecraft.entity.projectile.thrown.ThrownItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public yarnwrap.item.Item getDefaultItem() { return new yarnwrap.item.Item(wrapperContained.getDefaultItem()); }

}