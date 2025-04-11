package yarnwrap.entity.vehicle;
public class StorageMinecartEntity { public net.minecraft.entity.vehicle.StorageMinecartEntity wrapperContained; public StorageMinecartEntity(net.minecraft.entity.vehicle.StorageMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lootSeed() { return wrapperContained.lootSeed; }
// public void lootSeed(long value) { wrapperContained.lootSeed = value; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandler getScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.ScreenHandler(wrapperContained.getScreenHandler(syncId,playerInventory.wrapperContained)); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable,long lootSeed) { wrapperContained.setLootTable(lootTable.wrapperContained,lootSeed); }

}