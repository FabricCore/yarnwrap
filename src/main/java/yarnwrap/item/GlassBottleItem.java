package yarnwrap.item;
public class GlassBottleItem { public net.minecraft.item.GlassBottleItem wrapperContained; public GlassBottleItem(net.minecraft.item.GlassBottleItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack fill(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack outputStack) { return new yarnwrap.item.ItemStack(wrapperContained.fill(stack.wrapperContained,player.wrapperContained,outputStack.wrapperContained)); }
// public static yarnwrap.item.ItemStack fill(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack outputStack, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.GlassBottleItem.fill(stack.wrapperContained,player.wrapperContained,outputStack.wrapperContained)); }
// public boolean method_7726(yarnwrap.entity.AreaEffectCloudEntity entity) { return wrapperContained.method_7726(entity.wrapperContained); }
// public static boolean method_7726(yarnwrap.entity.AreaEffectCloudEntity entity, ) { return net.minecraft.item.GlassBottleItem.method_7726(entity.wrapperContained); }

}