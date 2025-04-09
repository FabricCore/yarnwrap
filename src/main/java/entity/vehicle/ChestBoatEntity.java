package yarnwrap.entity.vehicle;
public class ChestBoatEntity { public net.minecraft.entity.vehicle.ChestBoatEntity wrapperContained; public ChestBoatEntity(net.minecraft.entity.vehicle.ChestBoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
public void generateLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateLoot(player.wrapperContained); }

}