package yarnwrap.loot.function;
public class SetItemLootFunction { public net.minecraft.loot.function.SetItemLootFunction wrapperContained; public SetItemLootFunction(net.minecraft.loot.function.SetItemLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }

}