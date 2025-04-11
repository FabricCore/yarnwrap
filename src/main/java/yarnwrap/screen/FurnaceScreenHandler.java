package yarnwrap.screen;
public class FurnaceScreenHandler { public net.minecraft.screen.FurnaceScreenHandler wrapperContained; public FurnaceScreenHandler(net.minecraft.screen.FurnaceScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public FurnaceScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.FurnaceScreenHandler(syncId,playerInventory.wrapperContained); }
public FurnaceScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.FurnaceScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained,propertyDelegate.wrapperContained); }

}