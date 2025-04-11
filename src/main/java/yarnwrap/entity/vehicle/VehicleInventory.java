package yarnwrap.entity.vehicle;
public class VehicleInventory { public net.minecraft.entity.vehicle.VehicleInventory wrapperContained; public VehicleInventory(net.minecraft.entity.vehicle.VehicleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public void resetInventory() { wrapperContained.resetInventory(); }
public void setLootTableSeed(long lootTableSeed) { wrapperContained.setLootTableSeed(lootTableSeed); }
public void setLootTable(yarnwrap.registry.RegistryKey lootTable) { wrapperContained.setLootTable(lootTable.wrapperContained); }
public yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTable()); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
public yarnwrap.util.collection.DefaultedList getInventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getInventory()); }
public void onBroken(yarnwrap.entity.damage.DamageSource source,yarnwrap.world.World world,yarnwrap.entity.Entity vehicle) { wrapperContained.onBroken(source.wrapperContained,world.wrapperContained,vehicle.wrapperContained); }
public yarnwrap.util.ActionResult open(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.open(player.wrapperContained)); }
// public void readInventoryFromNbt(yarnwrap.nbt.NbtCompound nbt,Object registriesLookup) { wrapperContained.readInventoryFromNbt(nbt.wrapperContained,registriesLookup); }
public yarnwrap.item.ItemStack removeInventoryStack(int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.removeInventoryStack(slot,amount)); }
public void setInventoryStack(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setInventoryStack(slot,stack.wrapperContained); }
// public void writeInventoryToNbt(yarnwrap.nbt.NbtCompound nbt,Object registriesLookup) { wrapperContained.writeInventoryToNbt(nbt.wrapperContained,registriesLookup); }
public yarnwrap.item.ItemStack removeInventoryStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeInventoryStack(slot)); }
public yarnwrap.item.ItemStack getInventoryStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getInventoryStack(slot)); }
public void generateInventoryLoot(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.generateInventoryLoot(player.wrapperContained); }
public yarnwrap.inventory.StackReference getInventoryStackReference(int slot) { return new yarnwrap.inventory.StackReference(wrapperContained.getInventoryStackReference(slot)); }
public void clearInventory() { wrapperContained.clearInventory(); }
public boolean canPlayerAccess(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerAccess(player.wrapperContained); }
public boolean isInventoryEmpty() { return wrapperContained.isInventoryEmpty(); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }

}