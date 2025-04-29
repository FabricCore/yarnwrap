package yarnwrap.entity.vehicle;
public class StorageMinecartEntity { public net.minecraft.entity.vehicle.StorageMinecartEntity wrapperContained; public StorageMinecartEntity(net.minecraft.entity.vehicle.StorageMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lootSeed() { return wrapperContained.lootSeed; }
// public void lootSeed(long value) { wrapperContained.lootSeed = value; }
// public static long lootSeed() { return net.minecraft.entity.vehicle.StorageMinecartEntity.lootSeed; }
// public static void lootSeed(long value, ) { net.minecraft.entity.vehicle.StorageMinecartEntity.lootSeed = value; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.vehicle.StorageMinecartEntity.lootTable); }
// public static void lootTable(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.vehicle.StorageMinecartEntity.lootTable = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.vehicle.StorageMinecartEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.vehicle.StorageMinecartEntity.inventory = value.wrapperContained; }

// public StorageMinecartEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.vehicle.StorageMinecartEntity(type.wrapperContained,x,y,z,world.wrapperContained); }
// public yarnwrap.screen.ScreenHandler getScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.ScreenHandler(wrapperContained.getScreenHandler(syncId,playerInventory.wrapperContained)); }
// public static yarnwrap.screen.ScreenHandler getScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.entity.vehicle.StorageMinecartEntity.getScreenHandler(syncId,playerInventory.wrapperContained)); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable,long lootSeed) { wrapperContained.setLootTable(lootTable.wrapperContained,lootSeed); }
// public static void setLootTable(yarnwrap.registry.RegistryKey lootTable,long lootSeed, ) { net.minecraft.entity.vehicle.StorageMinecartEntity.setLootTable(lootTable.wrapperContained,lootSeed); }

}