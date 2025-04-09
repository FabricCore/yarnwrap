package yarnwrap.loot.function;
public class SetLootTableLootFunction { public net.minecraft.loot.function.SetLootTableLootFunction wrapperContained; public SetLootTableLootFunction(net.minecraft.loot.function.SetLootTableLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public long seed() { return wrapperContained.seed; }
// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.block.entity.BlockEntityType type,yarnwrap.registry.RegistryKey lootTable) { return wrapperContained.builder(type.wrapperContained,lootTable.wrapperContained); }
public Object builder(yarnwrap.block.entity.BlockEntityType type,yarnwrap.registry.RegistryKey lootTable,long seed) { return wrapperContained.builder(type.wrapperContained,lootTable.wrapperContained,seed); }

}