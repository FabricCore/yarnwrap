package yarnwrap.screen;
public class Generic3x3ContainerScreenHandler { public net.minecraft.screen.Generic3x3ContainerScreenHandler wrapperContained; public Generic3x3ContainerScreenHandler(net.minecraft.screen.Generic3x3ContainerScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CONTAINER_SIZE() { return wrapperContained.CONTAINER_SIZE; }
// public void CONTAINER_SIZE(int value) { wrapperContained.CONTAINER_SIZE = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
public Generic3x3ContainerScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.Generic3x3ContainerScreenHandler(syncId,playerInventory.wrapperContained); }
public Generic3x3ContainerScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { this.wrapperContained = new net.minecraft.screen.Generic3x3ContainerScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained); }

}