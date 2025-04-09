package yarnwrap.entity;
public class FlyingItemEntity { public net.minecraft.entity.FlyingItemEntity wrapperContained; public FlyingItemEntity(net.minecraft.entity.FlyingItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }

}