package yarnwrap.loot.function;
public class SetItemLootFunction { public net.minecraft.loot.function.SetItemLootFunction wrapperContained; public SetItemLootFunction(net.minecraft.loot.function.SetItemLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }

}