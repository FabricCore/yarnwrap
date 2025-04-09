package yarnwrap.inventory;
public class DoubleInventory { public net.minecraft.inventory.DoubleInventory wrapperContained; public DoubleInventory(net.minecraft.inventory.DoubleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory first() { return new yarnwrap.inventory.Inventory(wrapperContained.first); }
// public yarnwrap.inventory.Inventory second() { return new yarnwrap.inventory.Inventory(wrapperContained.second); }
public boolean isPart(yarnwrap.inventory.Inventory inventory) { return wrapperContained.isPart(inventory.wrapperContained); }

}