package yarnwrap.entity;
public class InventoryOwner { public net.minecraft.entity.InventoryOwner wrapperContained; public InventoryOwner(net.minecraft.entity.InventoryOwner wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String INVENTORY_KEY() { return wrapperContained.INVENTORY_KEY; }
public yarnwrap.inventory.SimpleInventory getInventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.getInventory()); }
// public void pickUpItem(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.InventoryOwner inventoryOwner,yarnwrap.entity.ItemEntity item) { wrapperContained.pickUpItem(entity.wrapperContained,inventoryOwner.wrapperContained,item.wrapperContained); }
// public void writeInventory(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeInventory(nbt.wrapperContained); }
// public void readInventory(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readInventory(nbt.wrapperContained); }

}