package yarnwrap.entity;
public class InventoryOwner { public net.minecraft.entity.InventoryOwner wrapperContained; public InventoryOwner(net.minecraft.entity.InventoryOwner wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String INVENTORY_KEY() { return wrapperContained.INVENTORY_KEY; }
// public void INVENTORY_KEY(java.lang.String value) { wrapperContained.INVENTORY_KEY = value; }
public static java.lang.String INVENTORY_KEY() { return net.minecraft.entity.InventoryOwner.INVENTORY_KEY; }
// public static void INVENTORY_KEY(java.lang.String value, ) { net.minecraft.entity.InventoryOwner.INVENTORY_KEY = value; }

public yarnwrap.inventory.SimpleInventory getInventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.getInventory()); }
// public static yarnwrap.inventory.SimpleInventory getInventory() { return new yarnwrap.inventory.SimpleInventory(net.minecraft.entity.InventoryOwner.getInventory()); }
// public void pickUpItem(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.InventoryOwner inventoryOwner,yarnwrap.entity.ItemEntity item) { wrapperContained.pickUpItem(entity.wrapperContained,inventoryOwner.wrapperContained,item.wrapperContained); }
// public static void pickUpItem(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.InventoryOwner inventoryOwner,yarnwrap.entity.ItemEntity item, ) { net.minecraft.entity.InventoryOwner.pickUpItem(entity.wrapperContained,inventoryOwner.wrapperContained,item.wrapperContained); }
// public void writeInventory(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeInventory(nbt.wrapperContained); }
// public static void writeInventory(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.InventoryOwner.writeInventory(nbt.wrapperContained); }
// public void readInventory(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readInventory(nbt.wrapperContained); }
// public static void readInventory(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.InventoryOwner.readInventory(nbt.wrapperContained); }

}