package yarnwrap.inventory;
public class SlotRange { public net.minecraft.inventory.SlotRange wrapperContained; public SlotRange(net.minecraft.inventory.SlotRange wrapperContained) { this.wrapperContained = wrapperContained; }

public it.unimi.dsi.fastutil.ints.IntList getSlotIds() { return wrapperContained.getSlotIds(); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
public int getSlotCount() { return wrapperContained.getSlotCount(); }

}