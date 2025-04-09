package yarnwrap.item;
public class GlassBottleItem { public net.minecraft.item.GlassBottleItem wrapperContained; public GlassBottleItem(net.minecraft.item.GlassBottleItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack fill(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack outputStack) { return new yarnwrap.item.ItemStack(wrapperContained.fill(stack.wrapperContained,player.wrapperContained,outputStack.wrapperContained)); }

}