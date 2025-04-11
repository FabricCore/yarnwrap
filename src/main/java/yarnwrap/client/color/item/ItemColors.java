package yarnwrap.client.color.item;
public class ItemColors { public net.minecraft.client.color.item.ItemColors wrapperContained; public ItemColors(net.minecraft.client.color.item.ItemColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IdList providers() { return new yarnwrap.util.collection.IdList(wrapperContained.providers); }
// public void providers(yarnwrap.util.collection.IdList value) { wrapperContained.providers = value.wrapperContained; }
// public int NO_COLOR() { return wrapperContained.NO_COLOR; }
// public void NO_COLOR(int value) { wrapperContained.NO_COLOR = value; }
public int getColor(yarnwrap.item.ItemStack item,int tintIndex) { return wrapperContained.getColor(item.wrapperContained,tintIndex); }
public yarnwrap.client.color.item.ItemColors create(yarnwrap.client.color.block.BlockColors blockColors) { return new yarnwrap.client.color.item.ItemColors(wrapperContained.create(blockColors.wrapperContained)); }
public void register(yarnwrap.client.color.item.ItemColorProvider provider,net.minecraft.item.ItemConvertible[] items) { wrapperContained.register(provider.wrapperContained,items); }

}