package yarnwrap.screen;
public class ShulkerBoxScreenHandler { public net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained; public ShulkerBoxScreenHandler(net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.ShulkerBoxScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.ShulkerBoxScreenHandler.inventory = value.wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public static int INVENTORY_SIZE() { return net.minecraft.screen.ShulkerBoxScreenHandler.INVENTORY_SIZE; }
// public static void INVENTORY_SIZE(int value, ) { net.minecraft.screen.ShulkerBoxScreenHandler.INVENTORY_SIZE = value; }

public ShulkerBoxScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.ShulkerBoxScreenHandler(syncId,playerInventory.wrapperContained); }
public ShulkerBoxScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { this.wrapperContained = new net.minecraft.screen.ShulkerBoxScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained); }

}