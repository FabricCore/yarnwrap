package yarnwrap.item;
public class ItemConvertible { public net.minecraft.item.ItemConvertible wrapperContained; public ItemConvertible(net.minecraft.item.ItemConvertible wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(wrapperContained.asItem()); }

}