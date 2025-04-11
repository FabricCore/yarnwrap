package yarnwrap.loot.function;
public class SetLootTableLootFunction { public net.minecraft.loot.function.SetLootTableLootFunction wrapperContained; public SetLootTableLootFunction(net.minecraft.loot.function.SetLootTableLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.block.entity.BlockEntityType type,yarnwrap.registry.RegistryKey lootTable) { return wrapperContained.builder(type.wrapperContained,lootTable.wrapperContained); }
public Object builder(yarnwrap.block.entity.BlockEntityType type,yarnwrap.registry.RegistryKey lootTable,long seed) { return wrapperContained.builder(type.wrapperContained,lootTable.wrapperContained,seed); }

}