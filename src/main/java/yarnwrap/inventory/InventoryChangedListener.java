package yarnwrap.inventory;
public class InventoryChangedListener { public net.minecraft.inventory.InventoryChangedListener wrapperContained; public InventoryChangedListener(net.minecraft.inventory.InventoryChangedListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onInventoryChanged(yarnwrap.inventory.Inventory sender) { wrapperContained.onInventoryChanged(sender.wrapperContained); }

}