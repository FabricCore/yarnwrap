package yarnwrap.entity.vehicle;
public class AbstractChestBoatEntity { public net.minecraft.entity.vehicle.AbstractChestBoatEntity wrapperContained; public AbstractChestBoatEntity(net.minecraft.entity.vehicle.AbstractChestBoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public static int INVENTORY_SIZE() { return net.minecraft.entity.vehicle.AbstractChestBoatEntity.INVENTORY_SIZE; }
// public static void INVENTORY_SIZE(int value, ) { net.minecraft.entity.vehicle.AbstractChestBoatEntity.INVENTORY_SIZE = value; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.vehicle.AbstractChestBoatEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.vehicle.AbstractChestBoatEntity.inventory = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.vehicle.AbstractChestBoatEntity.lootTable); }
// public static void lootTable(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.vehicle.AbstractChestBoatEntity.lootTable = value.wrapperContained; }

// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
// public static long lootTableSeed() { return net.minecraft.entity.vehicle.AbstractChestBoatEntity.lootTableSeed; }
// public static void lootTableSeed(long value, ) { net.minecraft.entity.vehicle.AbstractChestBoatEntity.lootTableSeed = value; }

public void generateLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateLoot(player.wrapperContained); }
// public static void generateLoot(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.vehicle.AbstractChestBoatEntity.generateLoot(player.wrapperContained); }

}