package yarnwrap.loot.entry;
public class ItemEntry { public net.minecraft.loot.entry.ItemEntry wrapperContained; public ItemEntry(net.minecraft.loot.entry.ItemEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
public Object builder(yarnwrap.item.ItemConvertible drop) { return wrapperContained.builder(drop.wrapperContained); }

}