package yarnwrap.inventory;
public class CraftingInventory { public net.minecraft.inventory.CraftingInventory wrapperContained; public CraftingInventory(net.minecraft.inventory.CraftingInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandler handler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.handler); }
// public void handler(yarnwrap.screen.ScreenHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandler handler() { return new yarnwrap.screen.ScreenHandler(net.minecraft.inventory.CraftingInventory.handler); }
// public static void handler(yarnwrap.screen.ScreenHandler value, ) { net.minecraft.inventory.CraftingInventory.handler = value.wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.inventory.CraftingInventory.height; }
// public static void height(int value, ) { net.minecraft.inventory.CraftingInventory.height = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.inventory.CraftingInventory.width; }
// public static void width(int value, ) { net.minecraft.inventory.CraftingInventory.width = value; }

// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }
// public void stacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.stacks = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.inventory.CraftingInventory.stacks); }
// public static void stacks(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.inventory.CraftingInventory.stacks = value.wrapperContained; }

public CraftingInventory(yarnwrap.screen.ScreenHandler handler,int width,int height) { this.wrapperContained = new net.minecraft.inventory.CraftingInventory(handler.wrapperContained,width,height); }
// public CraftingInventory(yarnwrap.screen.ScreenHandler handler,int width,int height,yarnwrap.util.collection.DefaultedList stacks) { this.wrapperContained = new net.minecraft.inventory.CraftingInventory(handler.wrapperContained,width,height,stacks.wrapperContained); }

}