package yarnwrap.inventory;
public class LootableInventory { public net.minecraft.inventory.LootableInventory wrapperContained; public LootableInventory(net.minecraft.inventory.LootableInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String LOOT_TABLE_KEY() { return wrapperContained.LOOT_TABLE_KEY; }
// public void LOOT_TABLE_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_KEY = value; }
public java.lang.String LOOT_TABLE_SEED_KEY() { return wrapperContained.LOOT_TABLE_SEED_KEY; }
// public void LOOT_TABLE_SEED_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_SEED_KEY = value; }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable) { wrapperContained.setLootTable(lootTable.wrapperContained); }
public void setLootTableSeed(long lootTableSeed) { wrapperContained.setLootTableSeed(lootTableSeed); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTableId,long lootTableSeed) { wrapperContained.setLootTable(lootTableId.wrapperContained,lootTableSeed); }
// public void setLootTable(yarnwrap.world.BlockView world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTableId) { wrapperContained.setLootTable(world.wrapperContained,random.wrapperContained,pos.wrapperContained,lootTableId.wrapperContained); }
public yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTable()); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
public boolean readLootTable(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLootTable(nbt.wrapperContained); }
public boolean writeLootTable(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.writeLootTable(nbt.wrapperContained); }
public void generateLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateLoot(player.wrapperContained); }

}