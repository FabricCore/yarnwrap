package yarnwrap.inventory;
public class SlotRange { public net.minecraft.inventory.SlotRange wrapperContained; public SlotRange(net.minecraft.inventory.SlotRange wrapperContained) { this.wrapperContained = wrapperContained; }

public it.unimi.dsi.fastutil.ints.IntList getSlotIds() { return wrapperContained.getSlotIds(); }
// public static it.unimi.dsi.fastutil.ints.IntList getSlotIds() { return net.minecraft.inventory.SlotRange.getSlotIds(); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
// public static yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds, ) { return new yarnwrap.inventory.SlotRange(net.minecraft.inventory.SlotRange.create(name,slotIds)); }
public int getSlotCount() { return wrapperContained.getSlotCount(); }
// public static int getSlotCount() { return net.minecraft.inventory.SlotRange.getSlotCount(); }

}