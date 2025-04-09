package yarnwrap.entity;
public class OminousItemSpawnerEntity { public net.minecraft.entity.OminousItemSpawnerEntity wrapperContained; public OminousItemSpawnerEntity(net.minecraft.entity.OminousItemSpawnerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SPAWN_ITEM_AFTER_TICKS() { return wrapperContained.MIN_SPAWN_ITEM_AFTER_TICKS; }
// public int MAX_SPAWN_ITEM_AFTER_TICKS() { return wrapperContained.MAX_SPAWN_ITEM_AFTER_TICKS; }
// public java.lang.String SPAWN_ITEM_AFTER_TICKS_NBT_KEY() { return wrapperContained.SPAWN_ITEM_AFTER_TICKS_NBT_KEY; }
// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public long spawnItemAfterTicks() { return wrapperContained.spawnItemAfterTicks; }
// public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
public yarnwrap.entity.OminousItemSpawnerEntity create(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.OminousItemSpawnerEntity(wrapperContained.create(world.wrapperContained,stack.wrapperContained)); }
public void addParticles() { wrapperContained.addParticles(); }
public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public void tickServer() { wrapperContained.tickServer(); }
// public void tickClient() { wrapperContained.tickClient(); }
// public void spawnItem() { wrapperContained.spawnItem(); }

}