package yarnwrap.inventory;
public class SlotRanges { public net.minecraft.inventory.SlotRanges wrapperContained; public SlotRanges(net.minecraft.inventory.SlotRanges wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.List SLOT_RANGES() { return wrapperContained.SLOT_RANGES; }
// public java.util.function.Function FROM_NAME() { return wrapperContained.FROM_NAME; }
public java.util.stream.Stream streamNames() { return wrapperContained.streamNames(); }
public yarnwrap.inventory.SlotRange fromName(java.lang.String name) { return new yarnwrap.inventory.SlotRange(wrapperContained.fromName(name)); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,int slotId) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotId)); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
// // public yarnwrap.inventory.SlotRange create(java.lang.String name,int slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
// public void createAndAdd(java.util.List list,java.lang.String name,int slotId) { wrapperContained.createAndAdd(list,name,slotId); }
// public void createAndAdd(java.util.List list,java.lang.String baseName,int firstSlotId,int lastSlotId) { wrapperContained.createAndAdd(list,baseName,firstSlotId,lastSlotId); }
// // public void createAndAdd(java.util.List list,java.lang.String name,int slots) { wrapperContained.createAndAdd(list,name,slots); }
public java.util.stream.Stream streamSingleSlotNames() { return wrapperContained.streamSingleSlotNames(); }

}