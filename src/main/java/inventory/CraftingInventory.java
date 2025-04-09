package yarnwrap.inventory;
public class CraftingInventory { public net.minecraft.inventory.CraftingInventory wrapperContained; public CraftingInventory(net.minecraft.inventory.CraftingInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandler handler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.handler); }
// public int height() { return wrapperContained.height; }
// public int width() { return wrapperContained.width; }
// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }

}