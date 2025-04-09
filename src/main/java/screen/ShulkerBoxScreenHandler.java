package yarnwrap.screen;
public class ShulkerBoxScreenHandler { public net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained; public ShulkerBoxScreenHandler(net.minecraft.screen.ShulkerBoxScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }

}