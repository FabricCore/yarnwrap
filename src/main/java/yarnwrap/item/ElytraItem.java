package yarnwrap.item;
public class ElytraItem { public net.minecraft.item.ElytraItem wrapperContained; public ElytraItem(net.minecraft.item.ElytraItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isUsable(yarnwrap.item.ItemStack stack) { return wrapperContained.isUsable(stack.wrapperContained); }
// public static boolean isUsable(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ElytraItem.isUsable(stack.wrapperContained); }

}