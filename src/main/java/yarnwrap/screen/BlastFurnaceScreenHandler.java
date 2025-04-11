package yarnwrap.screen;
public class BlastFurnaceScreenHandler { public net.minecraft.screen.BlastFurnaceScreenHandler wrapperContained; public BlastFurnaceScreenHandler(net.minecraft.screen.BlastFurnaceScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public BlastFurnaceScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.BlastFurnaceScreenHandler(syncId,playerInventory.wrapperContained); }
public BlastFurnaceScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.BlastFurnaceScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained,propertyDelegate.wrapperContained); }

}