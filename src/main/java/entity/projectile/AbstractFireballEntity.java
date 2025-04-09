package yarnwrap.entity.projectile;
public class AbstractFireballEntity { public net.minecraft.entity.projectile.AbstractFireballEntity wrapperContained; public AbstractFireballEntity(net.minecraft.entity.projectile.AbstractFireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }

}