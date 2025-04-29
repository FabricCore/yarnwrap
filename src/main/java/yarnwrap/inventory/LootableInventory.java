package yarnwrap.inventory;
public class LootableInventory { public net.minecraft.inventory.LootableInventory wrapperContained; public LootableInventory(net.minecraft.inventory.LootableInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LOOT_TABLE_KEY() { return wrapperContained.LOOT_TABLE_KEY; }
// public void LOOT_TABLE_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_KEY = value; }
public static java.lang.String LOOT_TABLE_KEY() { return net.minecraft.inventory.LootableInventory.LOOT_TABLE_KEY; }
// public static void LOOT_TABLE_KEY(java.lang.String value, ) { net.minecraft.inventory.LootableInventory.LOOT_TABLE_KEY = value; }

// public java.lang.String LOOT_TABLE_SEED_KEY() { return wrapperContained.LOOT_TABLE_SEED_KEY; }
// public void LOOT_TABLE_SEED_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_SEED_KEY = value; }
public static java.lang.String LOOT_TABLE_SEED_KEY() { return net.minecraft.inventory.LootableInventory.LOOT_TABLE_SEED_KEY; }
// public static void LOOT_TABLE_SEED_KEY(java.lang.String value, ) { net.minecraft.inventory.LootableInventory.LOOT_TABLE_SEED_KEY = value; }

public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.inventory.LootableInventory.getWorld()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.inventory.LootableInventory.getPos()); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable) { wrapperContained.setLootTable(lootTable.wrapperContained); }
// public static void setLootTable(yarnwrap.registry.RegistryKey lootTable, ) { net.minecraft.inventory.LootableInventory.setLootTable(lootTable.wrapperContained); }
public void setLootTableSeed(long lootTableSeed) { wrapperContained.setLootTableSeed(lootTableSeed); }
// public static void setLootTableSeed(long lootTableSeed, ) { net.minecraft.inventory.LootableInventory.setLootTableSeed(lootTableSeed); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTableId,long lootTableSeed) { wrapperContained.setLootTable(lootTableId.wrapperContained,lootTableSeed); }
// public static void setLootTable(yarnwrap.registry.RegistryKey lootTableId,long lootTableSeed, ) { net.minecraft.inventory.LootableInventory.setLootTable(lootTableId.wrapperContained,lootTableSeed); }
// public void setLootTable(yarnwrap.world.BlockView world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTableId) { wrapperContained.setLootTable(world.wrapperContained,random.wrapperContained,pos.wrapperContained,lootTableId.wrapperContained); }
// public static void setLootTable(yarnwrap.world.BlockView world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTableId, ) { net.minecraft.inventory.LootableInventory.setLootTable(world.wrapperContained,random.wrapperContained,pos.wrapperContained,lootTableId.wrapperContained); }
public yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTable()); }
// public static yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.inventory.LootableInventory.getLootTable()); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
// public static long getLootTableSeed() { return net.minecraft.inventory.LootableInventory.getLootTableSeed(); }
public boolean readLootTable(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLootTable(nbt.wrapperContained); }
// public static boolean readLootTable(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.inventory.LootableInventory.readLootTable(nbt.wrapperContained); }
public boolean writeLootTable(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.writeLootTable(nbt.wrapperContained); }
// public static boolean writeLootTable(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.inventory.LootableInventory.writeLootTable(nbt.wrapperContained); }
public void generateLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateLoot(player.wrapperContained); }
// public static void generateLoot(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.inventory.LootableInventory.generateLoot(player.wrapperContained); }

}