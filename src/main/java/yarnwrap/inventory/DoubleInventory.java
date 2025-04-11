package yarnwrap.inventory;
public class DoubleInventory { public net.minecraft.inventory.DoubleInventory wrapperContained; public DoubleInventory(net.minecraft.inventory.DoubleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory first() { return new yarnwrap.inventory.Inventory(wrapperContained.first); }
// public void first(yarnwrap.inventory.Inventory value) { wrapperContained.first = value.wrapperContained; }
// public yarnwrap.inventory.Inventory second() { return new yarnwrap.inventory.Inventory(wrapperContained.second); }
// public void second(yarnwrap.inventory.Inventory value) { wrapperContained.second = value.wrapperContained; }
public DoubleInventory(yarnwrap.inventory.Inventory first,yarnwrap.inventory.Inventory second) { this.wrapperContained = new net.minecraft.inventory.DoubleInventory(first.wrapperContained,second.wrapperContained); }
public boolean isPart(yarnwrap.inventory.Inventory inventory) { return wrapperContained.isPart(inventory.wrapperContained); }

}