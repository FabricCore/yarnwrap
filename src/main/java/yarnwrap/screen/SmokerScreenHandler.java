package yarnwrap.screen;
public class SmokerScreenHandler { public net.minecraft.screen.SmokerScreenHandler wrapperContained; public SmokerScreenHandler(net.minecraft.screen.SmokerScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public SmokerScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.SmokerScreenHandler(syncId,playerInventory.wrapperContained); }
public SmokerScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.SmokerScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained,propertyDelegate.wrapperContained); }

}