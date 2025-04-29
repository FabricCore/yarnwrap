package yarnwrap.entity.projectile;
public class AbstractFireballEntity { public net.minecraft.entity.projectile.AbstractFireballEntity wrapperContained; public AbstractFireballEntity(net.minecraft.entity.projectile.AbstractFireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.AbstractFireballEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.AbstractFireballEntity.ITEM = value.wrapperContained; }

public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public static void setItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.projectile.AbstractFireballEntity.setItem(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public static yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.AbstractFireballEntity.getItem()); }

}