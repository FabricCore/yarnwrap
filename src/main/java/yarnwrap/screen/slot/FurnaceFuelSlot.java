package yarnwrap.screen.slot;
public class FurnaceFuelSlot { public net.minecraft.screen.slot.FurnaceFuelSlot wrapperContained; public FurnaceFuelSlot(net.minecraft.screen.slot.FurnaceFuelSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.AbstractFurnaceScreenHandler handler() { return new yarnwrap.screen.AbstractFurnaceScreenHandler(wrapperContained.handler); }
// public void handler(yarnwrap.screen.AbstractFurnaceScreenHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.screen.AbstractFurnaceScreenHandler handler() { return new yarnwrap.screen.AbstractFurnaceScreenHandler(net.minecraft.screen.slot.FurnaceFuelSlot.handler); }
// public static void handler(yarnwrap.screen.AbstractFurnaceScreenHandler value, ) { net.minecraft.screen.slot.FurnaceFuelSlot.handler = value.wrapperContained; }

public FurnaceFuelSlot(yarnwrap.screen.AbstractFurnaceScreenHandler handler,yarnwrap.inventory.Inventory inventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.FurnaceFuelSlot(handler.wrapperContained,inventory.wrapperContained,index,x,y); }
// public boolean isBucket(yarnwrap.item.ItemStack stack) { return wrapperContained.isBucket(stack.wrapperContained); }
// public static boolean isBucket(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.slot.FurnaceFuelSlot.isBucket(stack.wrapperContained); }

}