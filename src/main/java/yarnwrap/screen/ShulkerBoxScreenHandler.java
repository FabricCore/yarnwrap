package yarnwrap.screen;
public class ShulkerBoxScreenHandler { public net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained; public ShulkerBoxScreenHandler(net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
public ShulkerBoxScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.ShulkerBoxScreenHandler(syncId,playerInventory.wrapperContained); }
public ShulkerBoxScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { this.wrapperContained = new net.minecraft.screen.ShulkerBoxScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained); }

}