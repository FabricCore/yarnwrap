package yarnwrap.inventory;
public class SidedInventory { public net.minecraft.inventory.SidedInventory wrapperContained; public SidedInventory(net.minecraft.inventory.SidedInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canInsert(int slot,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction dir) { return wrapperContained.canInsert(slot,stack.wrapperContained,dir.wrapperContained); }
// public static boolean canInsert(int slot,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction dir, ) { return net.minecraft.inventory.SidedInventory.canInsert(slot,stack.wrapperContained,dir.wrapperContained); }
public boolean canExtract(int slot,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction dir) { return wrapperContained.canExtract(slot,stack.wrapperContained,dir.wrapperContained); }
// public static boolean canExtract(int slot,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction dir, ) { return net.minecraft.inventory.SidedInventory.canExtract(slot,stack.wrapperContained,dir.wrapperContained); }
public int[] getAvailableSlots(yarnwrap.util.math.Direction side) { return wrapperContained.getAvailableSlots(side.wrapperContained); }
// public static int[] getAvailableSlots(yarnwrap.util.math.Direction side, ) { return net.minecraft.inventory.SidedInventory.getAvailableSlots(side.wrapperContained); }

}