package yarnwrap.block.entity;
public class BrushableBlockEntity { public net.minecraft.block.entity.BrushableBlockEntity wrapperContained; public BrushableBlockEntity(net.minecraft.block.entity.BrushableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.BrushableBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.BrushableBlockEntity.LOGGER = value; }

// public java.lang.String LOOT_TABLE_NBT_KEY() { return wrapperContained.LOOT_TABLE_NBT_KEY; }
// public void LOOT_TABLE_NBT_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_NBT_KEY = value; }
// public static java.lang.String LOOT_TABLE_NBT_KEY() { return net.minecraft.block.entity.BrushableBlockEntity.LOOT_TABLE_NBT_KEY; }
// public static void LOOT_TABLE_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.BrushableBlockEntity.LOOT_TABLE_NBT_KEY = value; }

// public java.lang.String LOOT_TABLE_SEED_NBT_KEY() { return wrapperContained.LOOT_TABLE_SEED_NBT_KEY; }
// public void LOOT_TABLE_SEED_NBT_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_SEED_NBT_KEY = value; }
// public static java.lang.String LOOT_TABLE_SEED_NBT_KEY() { return net.minecraft.block.entity.BrushableBlockEntity.LOOT_TABLE_SEED_NBT_KEY; }
// public static void LOOT_TABLE_SEED_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.BrushableBlockEntity.LOOT_TABLE_SEED_NBT_KEY = value; }

// public java.lang.String HIT_DIRECTION_NBT_KEY() { return wrapperContained.HIT_DIRECTION_NBT_KEY; }
// public void HIT_DIRECTION_NBT_KEY(java.lang.String value) { wrapperContained.HIT_DIRECTION_NBT_KEY = value; }
// public static java.lang.String HIT_DIRECTION_NBT_KEY() { return net.minecraft.block.entity.BrushableBlockEntity.HIT_DIRECTION_NBT_KEY; }
// public static void HIT_DIRECTION_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.BrushableBlockEntity.HIT_DIRECTION_NBT_KEY = value; }

// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public void ITEM_NBT_KEY(java.lang.String value) { wrapperContained.ITEM_NBT_KEY = value; }
// public static java.lang.String ITEM_NBT_KEY() { return net.minecraft.block.entity.BrushableBlockEntity.ITEM_NBT_KEY; }
// public static void ITEM_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.BrushableBlockEntity.ITEM_NBT_KEY = value; }

// public int brushesCount() { return wrapperContained.brushesCount; }
// public void brushesCount(int value) { wrapperContained.brushesCount = value; }
// public static int brushesCount() { return net.minecraft.block.entity.BrushableBlockEntity.brushesCount; }
// public static void brushesCount(int value, ) { net.minecraft.block.entity.BrushableBlockEntity.brushesCount = value; }

// public long nextDustTime() { return wrapperContained.nextDustTime; }
// public void nextDustTime(long value) { wrapperContained.nextDustTime = value; }
// public static long nextDustTime() { return net.minecraft.block.entity.BrushableBlockEntity.nextDustTime; }
// public static void nextDustTime(long value, ) { net.minecraft.block.entity.BrushableBlockEntity.nextDustTime = value; }

// public long nextBrushTime() { return wrapperContained.nextBrushTime; }
// public void nextBrushTime(long value) { wrapperContained.nextBrushTime = value; }
// public static long nextBrushTime() { return net.minecraft.block.entity.BrushableBlockEntity.nextBrushTime; }
// public static void nextBrushTime(long value, ) { net.minecraft.block.entity.BrushableBlockEntity.nextBrushTime = value; }

// public yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(wrapperContained.item); }
// public void item(yarnwrap.item.ItemStack value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.BrushableBlockEntity.item); }
// public static void item(yarnwrap.item.ItemStack value, ) { net.minecraft.block.entity.BrushableBlockEntity.item = value.wrapperContained; }

// public yarnwrap.util.math.Direction hitDirection() { return new yarnwrap.util.math.Direction(wrapperContained.hitDirection); }
// public void hitDirection(yarnwrap.util.math.Direction value) { wrapperContained.hitDirection = value.wrapperContained; }
// public static yarnwrap.util.math.Direction hitDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.BrushableBlockEntity.hitDirection); }
// public static void hitDirection(yarnwrap.util.math.Direction value, ) { net.minecraft.block.entity.BrushableBlockEntity.hitDirection = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.block.entity.BrushableBlockEntity.lootTable); }
// public static void lootTable(yarnwrap.registry.RegistryKey value, ) { net.minecraft.block.entity.BrushableBlockEntity.lootTable = value.wrapperContained; }

// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
// public static long lootTableSeed() { return net.minecraft.block.entity.BrushableBlockEntity.lootTableSeed; }
// public static void lootTableSeed(long value, ) { net.minecraft.block.entity.BrushableBlockEntity.lootTableSeed = value; }

public BrushableBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BrushableBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean brush(long worldTime,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Direction hitDirection) { return wrapperContained.brush(worldTime,player.wrapperContained,hitDirection.wrapperContained); }
// public static boolean brush(long worldTime,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Direction hitDirection, ) { return net.minecraft.block.entity.BrushableBlockEntity.brush(worldTime,player.wrapperContained,hitDirection.wrapperContained); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable,long seed) { wrapperContained.setLootTable(lootTable.wrapperContained,seed); }
// public static void setLootTable(yarnwrap.registry.RegistryKey lootTable,long seed, ) { net.minecraft.block.entity.BrushableBlockEntity.setLootTable(lootTable.wrapperContained,seed); }
public void generateItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateItem(player.wrapperContained); }
// public static void generateItem(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.BrushableBlockEntity.generateItem(player.wrapperContained); }
// public void finishBrushing(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.finishBrushing(player.wrapperContained); }
// public static void finishBrushing(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.BrushableBlockEntity.finishBrushing(player.wrapperContained); }
public void scheduledTick() { wrapperContained.scheduledTick(); }
// public static void scheduledTick() { net.minecraft.block.entity.BrushableBlockEntity.scheduledTick(); }
// public void spawnItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.spawnItem(player.wrapperContained); }
// public static void spawnItem(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.BrushableBlockEntity.spawnItem(player.wrapperContained); }
// public boolean readLootTableFromNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLootTableFromNbt(nbt.wrapperContained); }
// public static boolean readLootTableFromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.block.entity.BrushableBlockEntity.readLootTableFromNbt(nbt.wrapperContained); }
// public boolean writeLootTableToNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.writeLootTableToNbt(nbt.wrapperContained); }
// public static boolean writeLootTableToNbt(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.block.entity.BrushableBlockEntity.writeLootTableToNbt(nbt.wrapperContained); }
public yarnwrap.util.math.Direction getHitDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getHitDirection()); }
// public static yarnwrap.util.math.Direction getHitDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.BrushableBlockEntity.getHitDirection()); }
public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public static yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.BrushableBlockEntity.getItem()); }
// public int getDustedLevel() { return wrapperContained.getDustedLevel(); }
// public static int getDustedLevel() { return net.minecraft.block.entity.BrushableBlockEntity.getDustedLevel(); }

}