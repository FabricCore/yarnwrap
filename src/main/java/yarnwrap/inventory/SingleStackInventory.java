package yarnwrap.inventory;
public class SingleStackInventory { public net.minecraft.inventory.SingleStackInventory wrapperContained; public SingleStackInventory(net.minecraft.inventory.SingleStackInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
// public static void setStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.inventory.SingleStackInventory.setStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack decreaseStack(int count) { return new yarnwrap.item.ItemStack(wrapperContained.decreaseStack(count)); }
// public static yarnwrap.item.ItemStack decreaseStack(int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.SingleStackInventory.decreaseStack(count)); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public static yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(net.minecraft.inventory.SingleStackInventory.getStack()); }
public yarnwrap.item.ItemStack emptyStack() { return new yarnwrap.item.ItemStack(wrapperContained.emptyStack()); }
// public static yarnwrap.item.ItemStack emptyStack() { return new yarnwrap.item.ItemStack(net.minecraft.inventory.SingleStackInventory.emptyStack()); }

}