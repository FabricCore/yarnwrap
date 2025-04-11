package yarnwrap.loot.entry;
public class LootTableEntry { public net.minecraft.loot.entry.LootTableEntry wrapperContained; public LootTableEntry(net.minecraft.loot.entry.LootTableEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.util.Either value() { return wrapperContained.value; }
// public void value(com.mojang.datafixers.util.Either value) { wrapperContained.value = value; }
public Object builder(yarnwrap.registry.RegistryKey key) { return wrapperContained.builder(key.wrapperContained); }
public Object builder(yarnwrap.loot.LootTable table) { return wrapperContained.builder(table.wrapperContained); }

}