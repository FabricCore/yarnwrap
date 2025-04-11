package yarnwrap.client.color.item;
public class ItemColorProvider { public net.minecraft.client.color.item.ItemColorProvider wrapperContained; public ItemColorProvider(net.minecraft.client.color.item.ItemColorProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public int getColor(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.getColor(stack.wrapperContained,tintIndex); }

}