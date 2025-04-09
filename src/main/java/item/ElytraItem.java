package yarnwrap.item;
public class ElytraItem { public net.minecraft.item.ElytraItem wrapperContained; public ElytraItem(net.minecraft.item.ElytraItem wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isUsable(yarnwrap.item.ItemStack stack) { return wrapperContained.isUsable(stack.wrapperContained); }

}