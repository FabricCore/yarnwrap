package yarnwrap.block.entity;
public class LootableContainerBlockEntity { public net.minecraft.block.entity.LootableContainerBlockEntity wrapperContained; public LootableContainerBlockEntity(net.minecraft.block.entity.LootableContainerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }

}