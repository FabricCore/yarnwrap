package yarnwrap.screen;
public class GenericContainerScreenHandler { public net.minecraft.screen.GenericContainerScreenHandler wrapperContained; public GenericContainerScreenHandler(net.minecraft.screen.GenericContainerScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public int rows() { return wrapperContained.rows; }
// public void rows(int value) { wrapperContained.rows = value; }
// public int NUM_COLUMNS() { return wrapperContained.NUM_COLUMNS; }
// public void NUM_COLUMNS(int value) { wrapperContained.NUM_COLUMNS = value; }
// public GenericContainerScreenHandler(yarnwrap.screen.ScreenHandlerType type,int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,int rows) { this.wrapperContained = new net.minecraft.screen.GenericContainerScreenHandler(type.wrapperContained,syncId,playerInventory.wrapperContained,rows); }
public GenericContainerScreenHandler(yarnwrap.screen.ScreenHandlerType type,int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,int rows) { this.wrapperContained = new net.minecraft.screen.GenericContainerScreenHandler(type.wrapperContained,syncId,playerInventory.wrapperContained,inventory.wrapperContained,rows); }
public int getRows() { return wrapperContained.getRows(); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x1(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x1(syncId,playerInventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x3(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x3(syncId,playerInventory.wrapperContained,inventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x2(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x2(syncId,playerInventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x6(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x6(syncId,playerInventory.wrapperContained,inventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x3(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x3(syncId,playerInventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x4(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x4(syncId,playerInventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x5(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x5(syncId,playerInventory.wrapperContained)); }
public yarnwrap.screen.GenericContainerScreenHandler createGeneric9x6(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.GenericContainerScreenHandler(wrapperContained.createGeneric9x6(syncId,playerInventory.wrapperContained)); }
public yarnwrap.inventory.Inventory getInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.getInventory()); }

}