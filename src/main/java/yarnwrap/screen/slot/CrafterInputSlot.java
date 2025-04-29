package yarnwrap.screen.slot;
public class CrafterInputSlot { public net.minecraft.screen.slot.CrafterInputSlot wrapperContained; public CrafterInputSlot(net.minecraft.screen.slot.CrafterInputSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.CrafterScreenHandler crafterScreenHandler() { return new yarnwrap.screen.CrafterScreenHandler(wrapperContained.crafterScreenHandler); }
// public void crafterScreenHandler(yarnwrap.screen.CrafterScreenHandler value) { wrapperContained.crafterScreenHandler = value.wrapperContained; }
// public static yarnwrap.screen.CrafterScreenHandler crafterScreenHandler() { return new yarnwrap.screen.CrafterScreenHandler(net.minecraft.screen.slot.CrafterInputSlot.crafterScreenHandler); }
// public static void crafterScreenHandler(yarnwrap.screen.CrafterScreenHandler value, ) { net.minecraft.screen.slot.CrafterInputSlot.crafterScreenHandler = value.wrapperContained; }

public CrafterInputSlot(yarnwrap.inventory.Inventory inventory,int index,int x,int y,yarnwrap.screen.CrafterScreenHandler crafterScreenHandler) { this.wrapperContained = new net.minecraft.screen.slot.CrafterInputSlot(inventory.wrapperContained,index,x,y,crafterScreenHandler.wrapperContained); }

}