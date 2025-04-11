package yarnwrap.block.entity;
public class BrushableBlockEntity { public net.minecraft.block.entity.BrushableBlockEntity wrapperContained; public BrushableBlockEntity(net.minecraft.block.entity.BrushableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String LOOT_TABLE_NBT_KEY() { return wrapperContained.LOOT_TABLE_NBT_KEY; }
// public void LOOT_TABLE_NBT_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_NBT_KEY = value; }
// public java.lang.String LOOT_TABLE_SEED_NBT_KEY() { return wrapperContained.LOOT_TABLE_SEED_NBT_KEY; }
// public void LOOT_TABLE_SEED_NBT_KEY(java.lang.String value) { wrapperContained.LOOT_TABLE_SEED_NBT_KEY = value; }
// public java.lang.String HIT_DIRECTION_NBT_KEY() { return wrapperContained.HIT_DIRECTION_NBT_KEY; }
// public void HIT_DIRECTION_NBT_KEY(java.lang.String value) { wrapperContained.HIT_DIRECTION_NBT_KEY = value; }
// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public void ITEM_NBT_KEY(java.lang.String value) { wrapperContained.ITEM_NBT_KEY = value; }
// public int brushesCount() { return wrapperContained.brushesCount; }
// public void brushesCount(int value) { wrapperContained.brushesCount = value; }
// public long nextDustTime() { return wrapperContained.nextDustTime; }
// public void nextDustTime(long value) { wrapperContained.nextDustTime = value; }
// public long nextBrushTime() { return wrapperContained.nextBrushTime; }
// public void nextBrushTime(long value) { wrapperContained.nextBrushTime = value; }
// public yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(wrapperContained.item); }
// public void item(yarnwrap.item.ItemStack value) { wrapperContained.item = value.wrapperContained; }
// public yarnwrap.util.math.Direction hitDirection() { return new yarnwrap.util.math.Direction(wrapperContained.hitDirection); }
// public void hitDirection(yarnwrap.util.math.Direction value) { wrapperContained.hitDirection = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
public BrushableBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BrushableBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean brush(long worldTime,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Direction hitDirection) { return wrapperContained.brush(worldTime,player.wrapperContained,hitDirection.wrapperContained); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable,long seed) { wrapperContained.setLootTable(lootTable.wrapperContained,seed); }
public void generateItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateItem(player.wrapperContained); }
// public void finishBrushing(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.finishBrushing(player.wrapperContained); }
public void scheduledTick() { wrapperContained.scheduledTick(); }
// public void spawnItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.spawnItem(player.wrapperContained); }
// public boolean readLootTableFromNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLootTableFromNbt(nbt.wrapperContained); }
// public boolean writeLootTableToNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.writeLootTableToNbt(nbt.wrapperContained); }
public yarnwrap.util.math.Direction getHitDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getHitDirection()); }
public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public int getDustedLevel() { return wrapperContained.getDustedLevel(); }

}