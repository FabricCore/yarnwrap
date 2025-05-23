package yarnwrap.entity;
public class InventoryOwner { public net.minecraft.entity.InventoryOwner wrapperContained; public InventoryOwner(net.minecraft.entity.InventoryOwner wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String INVENTORY_KEY() { return wrapperContained.INVENTORY_KEY; }
// public void INVENTORY_KEY(java.lang.String value) { wrapperContained.INVENTORY_KEY = value; }
public static java.lang.String INVENTORY_KEY() { return net.minecraft.entity.InventoryOwner.INVENTORY_KEY; }
// public static void INVENTORY_KEY(java.lang.String value, ) { net.minecraft.entity.InventoryOwner.INVENTORY_KEY = value; }

public yarnwrap.inventory.SimpleInventory getInventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.getInventory()); }
// public static yarnwrap.inventory.SimpleInventory getInventory() { return new yarnwrap.inventory.SimpleInventory(net.minecraft.entity.InventoryOwner.getInventory()); }
// public void pickUpItem(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.InventoryOwner inventoryOwner,yarnwrap.entity.ItemEntity item) { wrapperContained.pickUpItem(world.wrapperContained,entity.wrapperContained,inventoryOwner.wrapperContained,item.wrapperContained); }
// public static void pickUpItem(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.InventoryOwner inventoryOwner,yarnwrap.entity.ItemEntity item, ) { net.minecraft.entity.InventoryOwner.pickUpItem(world.wrapperContained,entity.wrapperContained,inventoryOwner.wrapperContained,item.wrapperContained); }
// public void writeInventory(yarnwrap.storage.WriteView view) { wrapperContained.writeInventory(view.wrapperContained); }
// public static void writeInventory(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.InventoryOwner.writeInventory(view.wrapperContained); }
// public void readInventory(yarnwrap.storage.ReadView view) { wrapperContained.readInventory(view.wrapperContained); }
// public static void readInventory(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.InventoryOwner.readInventory(view.wrapperContained); }
// public void method_68276(Object list) { wrapperContained.method_68276(list); }
// public static void method_68276(Object list, ) { net.minecraft.entity.InventoryOwner.method_68276(list); }

}