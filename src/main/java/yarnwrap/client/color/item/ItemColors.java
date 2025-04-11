package yarnwrap.client.color.item;
public class ItemColors { public net.minecraft.client.color.item.ItemColors wrapperContained; public ItemColors(net.minecraft.client.color.item.ItemColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IdList providers() { return new yarnwrap.util.collection.IdList(wrapperContained.providers); }
// public void providers(yarnwrap.util.collection.IdList value) { wrapperContained.providers = value.wrapperContained; }
// public int NO_COLOR() { return wrapperContained.NO_COLOR; }
// public void NO_COLOR(int value) { wrapperContained.NO_COLOR = value; }
// public int method_1699(yarnwrap.item.SpawnEggItem stack,yarnwrap.item.ItemStack tintIndex) { return wrapperContained.method_1699(stack.wrapperContained,tintIndex.wrapperContained); }
// public int method_1701(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_1701(stack.wrapperContained,tintIndex); }
// public int method_1702(yarnwrap.client.color.block.BlockColors stack,yarnwrap.item.ItemStack tintIndex) { return wrapperContained.method_1702(stack.wrapperContained,tintIndex.wrapperContained); }
public int getColor(yarnwrap.item.ItemStack item,int tintIndex) { return wrapperContained.getColor(item.wrapperContained,tintIndex); }
// public int method_1705(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_1705(stack.wrapperContained,tintIndex); }
public yarnwrap.client.color.item.ItemColors create(yarnwrap.client.color.block.BlockColors blockColors) { return new yarnwrap.client.color.item.ItemColors(wrapperContained.create(blockColors.wrapperContained)); }
// public int method_1707(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_1707(stack.wrapperContained,tintIndex); }
public void register(yarnwrap.client.color.item.ItemColorProvider provider,net.minecraft.item.ItemConvertible[] items) { wrapperContained.register(provider.wrapperContained,items); }
// public int method_43767(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_43767(stack.wrapperContained,tintIndex); }
// public int method_57705(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_57705(stack.wrapperContained,tintIndex); }
// public int method_57706(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_57706(stack.wrapperContained,tintIndex); }
// public int method_57707(yarnwrap.item.ItemStack stack,int tintIndex) { return wrapperContained.method_57707(stack.wrapperContained,tintIndex); }

}