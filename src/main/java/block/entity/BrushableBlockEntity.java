package yarnwrap.block.entity;
public class BrushableBlockEntity { public net.minecraft.block.entity.BrushableBlockEntity wrapperContained; public BrushableBlockEntity(net.minecraft.block.entity.BrushableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String LOOT_TABLE_NBT_KEY() { return wrapperContained.LOOT_TABLE_NBT_KEY; }
// public java.lang.String LOOT_TABLE_SEED_NBT_KEY() { return wrapperContained.LOOT_TABLE_SEED_NBT_KEY; }
// public java.lang.String HIT_DIRECTION_NBT_KEY() { return wrapperContained.HIT_DIRECTION_NBT_KEY; }
// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public int brushesCount() { return wrapperContained.brushesCount; }
// public long nextDustTime() { return wrapperContained.nextDustTime; }
// public long nextBrushTime() { return wrapperContained.nextBrushTime; }
// public yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(wrapperContained.item); }
// public yarnwrap.util.math.Direction hitDirection() { return new yarnwrap.util.math.Direction(wrapperContained.hitDirection); }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
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