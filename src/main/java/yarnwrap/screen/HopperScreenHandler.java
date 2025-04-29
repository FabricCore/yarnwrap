package yarnwrap.screen;
public class HopperScreenHandler { public net.minecraft.screen.HopperScreenHandler wrapperContained; public HopperScreenHandler(net.minecraft.screen.HopperScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SLOT_COUNT() { return wrapperContained.SLOT_COUNT; }
// public void SLOT_COUNT(int value) { wrapperContained.SLOT_COUNT = value; }
public static int SLOT_COUNT() { return net.minecraft.screen.HopperScreenHandler.SLOT_COUNT; }
// public static void SLOT_COUNT(int value, ) { net.minecraft.screen.HopperScreenHandler.SLOT_COUNT = value; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.HopperScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.HopperScreenHandler.inventory = value.wrapperContained; }

public HopperScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.HopperScreenHandler(syncId,playerInventory.wrapperContained); }
public HopperScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory) { this.wrapperContained = new net.minecraft.screen.HopperScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained); }

}