package yarnwrap.screen.slot;
public class FurnaceFuelSlot { public net.minecraft.screen.slot.FurnaceFuelSlot wrapperContained; public FurnaceFuelSlot(net.minecraft.screen.slot.FurnaceFuelSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.AbstractFurnaceScreenHandler handler() { return new yarnwrap.screen.AbstractFurnaceScreenHandler(wrapperContained.handler); }
public boolean isBucket(yarnwrap.item.ItemStack stack) { return wrapperContained.isBucket(stack.wrapperContained); }

}