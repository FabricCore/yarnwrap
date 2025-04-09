package yarnwrap.inventory;
public class SingleStackInventory { public net.minecraft.inventory.SingleStackInventory wrapperContained; public SingleStackInventory(net.minecraft.inventory.SingleStackInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack decreaseStack(int count) { return new yarnwrap.item.ItemStack(wrapperContained.decreaseStack(count)); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
public yarnwrap.item.ItemStack emptyStack() { return new yarnwrap.item.ItemStack(wrapperContained.emptyStack()); }

}