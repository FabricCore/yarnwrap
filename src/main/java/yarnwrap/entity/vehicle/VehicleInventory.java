package yarnwrap.entity.vehicle;
public class VehicleInventory { public net.minecraft.entity.vehicle.VehicleInventory wrapperContained; public VehicleInventory(net.minecraft.entity.vehicle.VehicleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.vehicle.VehicleInventory.getBoundingBox()); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.VehicleInventory.getPos()); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public static boolean isRemoved() { return net.minecraft.entity.vehicle.VehicleInventory.isRemoved(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.entity.vehicle.VehicleInventory.getWorld()); }
public void resetInventory() { wrapperContained.resetInventory(); }
// public static void resetInventory() { net.minecraft.entity.vehicle.VehicleInventory.resetInventory(); }
public void setLootTableSeed(long lootTableSeed) { wrapperContained.setLootTableSeed(lootTableSeed); }
// public static void setLootTableSeed(long lootTableSeed, ) { net.minecraft.entity.vehicle.VehicleInventory.setLootTableSeed(lootTableSeed); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable) { wrapperContained.setLootTable(lootTable.wrapperContained); }
// public static void setLootTable(yarnwrap.registry.RegistryKey lootTable, ) { net.minecraft.entity.vehicle.VehicleInventory.setLootTable(lootTable.wrapperContained); }
public yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTable()); }
// public static yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.vehicle.VehicleInventory.getLootTable()); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
// public static long getLootTableSeed() { return net.minecraft.entity.vehicle.VehicleInventory.getLootTableSeed(); }
public yarnwrap.util.collection.DefaultedList getInventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getInventory()); }
// public static yarnwrap.util.collection.DefaultedList getInventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.vehicle.VehicleInventory.getInventory()); }
public void onBroken(yarnwrap.entity.damage.DamageSource source,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity vehicle) { wrapperContained.onBroken(source.wrapperContained,world.wrapperContained,vehicle.wrapperContained); }
// public static void onBroken(yarnwrap.entity.damage.DamageSource source,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity vehicle, ) { net.minecraft.entity.vehicle.VehicleInventory.onBroken(source.wrapperContained,world.wrapperContained,vehicle.wrapperContained); }
public yarnwrap.util.ActionResult open(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.open(player.wrapperContained)); }
// public static yarnwrap.util.ActionResult open(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.vehicle.VehicleInventory.open(player.wrapperContained)); }
// public void readInventoryFromData(yarnwrap.storage.ReadView view) { wrapperContained.readInventoryFromData(view.wrapperContained); }
// public static void readInventoryFromData(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.vehicle.VehicleInventory.readInventoryFromData(view.wrapperContained); }
public yarnwrap.item.ItemStack removeInventoryStack(int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.removeInventoryStack(slot,amount)); }
// public static yarnwrap.item.ItemStack removeInventoryStack(int slot,int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.vehicle.VehicleInventory.removeInventoryStack(slot,amount)); }
public void setInventoryStack(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setInventoryStack(slot,stack.wrapperContained); }
// public static void setInventoryStack(int slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.vehicle.VehicleInventory.setInventoryStack(slot,stack.wrapperContained); }
// public void writeInventoryToData(yarnwrap.storage.WriteView view) { wrapperContained.writeInventoryToData(view.wrapperContained); }
// public static void writeInventoryToData(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.vehicle.VehicleInventory.writeInventoryToData(view.wrapperContained); }
public yarnwrap.item.ItemStack removeInventoryStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeInventoryStack(slot)); }
// public static yarnwrap.item.ItemStack removeInventoryStack(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.vehicle.VehicleInventory.removeInventoryStack(slot)); }
public yarnwrap.item.ItemStack getInventoryStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getInventoryStack(slot)); }
// public static yarnwrap.item.ItemStack getInventoryStack(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.vehicle.VehicleInventory.getInventoryStack(slot)); }
public void generateInventoryLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateInventoryLoot(player.wrapperContained); }
// public static void generateInventoryLoot(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.vehicle.VehicleInventory.generateInventoryLoot(player.wrapperContained); }
public yarnwrap.inventory.StackReference getInventoryStackReference(int slot) { return new yarnwrap.inventory.StackReference(wrapperContained.getInventoryStackReference(slot)); }
// public static yarnwrap.inventory.StackReference getInventoryStackReference(int slot, ) { return new yarnwrap.inventory.StackReference(net.minecraft.entity.vehicle.VehicleInventory.getInventoryStackReference(slot)); }
public void clearInventory() { wrapperContained.clearInventory(); }
// public static void clearInventory() { net.minecraft.entity.vehicle.VehicleInventory.clearInventory(); }
public boolean canPlayerAccess(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerAccess(player.wrapperContained); }
// public static boolean canPlayerAccess(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.vehicle.VehicleInventory.canPlayerAccess(player.wrapperContained); }
public boolean isInventoryEmpty() { return wrapperContained.isInventoryEmpty(); }
// public static boolean isInventoryEmpty() { return net.minecraft.entity.vehicle.VehicleInventory.isInventoryEmpty(); }

}