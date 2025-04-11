package yarnwrap.entity;
public class OminousItemSpawnerEntity { public net.minecraft.entity.OminousItemSpawnerEntity wrapperContained; public OminousItemSpawnerEntity(net.minecraft.entity.OminousItemSpawnerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SPAWN_ITEM_AFTER_TICKS() { return wrapperContained.MIN_SPAWN_ITEM_AFTER_TICKS; }
// public void MIN_SPAWN_ITEM_AFTER_TICKS(int value) { wrapperContained.MIN_SPAWN_ITEM_AFTER_TICKS = value; }
// public int MAX_SPAWN_ITEM_AFTER_TICKS() { return wrapperContained.MAX_SPAWN_ITEM_AFTER_TICKS; }
// public void MAX_SPAWN_ITEM_AFTER_TICKS(int value) { wrapperContained.MAX_SPAWN_ITEM_AFTER_TICKS = value; }
// public java.lang.String SPAWN_ITEM_AFTER_TICKS_NBT_KEY() { return wrapperContained.SPAWN_ITEM_AFTER_TICKS_NBT_KEY; }
// public void SPAWN_ITEM_AFTER_TICKS_NBT_KEY(java.lang.String value) { wrapperContained.SPAWN_ITEM_AFTER_TICKS_NBT_KEY = value; }
// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public void ITEM_NBT_KEY(java.lang.String value) { wrapperContained.ITEM_NBT_KEY = value; }
// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public long spawnItemAfterTicks() { return wrapperContained.spawnItemAfterTicks; }
// public void spawnItemAfterTicks(long value) { wrapperContained.spawnItemAfterTicks = value; }
// public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
public yarnwrap.entity.OminousItemSpawnerEntity create(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.OminousItemSpawnerEntity(wrapperContained.create(world.wrapperContained,stack.wrapperContained)); }
public void addParticles() { wrapperContained.addParticles(); }
public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public void tickServer() { wrapperContained.tickServer(); }
// public void tickClient() { wrapperContained.tickClient(); }
// public void spawnItem() { wrapperContained.spawnItem(); }

}