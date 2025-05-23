package yarnwrap.inventory;
public class SlotRanges { public net.minecraft.inventory.SlotRanges wrapperContained; public SlotRanges(net.minecraft.inventory.SlotRanges wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.inventory.SlotRanges.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.inventory.SlotRanges.CODEC = value; }

// public java.util.List SLOT_RANGES() { return wrapperContained.SLOT_RANGES; }
// public void SLOT_RANGES(java.util.List value) { wrapperContained.SLOT_RANGES = value; }
// public static java.util.List SLOT_RANGES() { return net.minecraft.inventory.SlotRanges.SLOT_RANGES; }
// public static void SLOT_RANGES(java.util.List value, ) { net.minecraft.inventory.SlotRanges.SLOT_RANGES = value; }

// public java.util.function.Function FROM_NAME() { return wrapperContained.FROM_NAME; }
// public void FROM_NAME(java.util.function.Function value) { wrapperContained.FROM_NAME = value; }
// public static java.util.function.Function FROM_NAME() { return net.minecraft.inventory.SlotRanges.FROM_NAME; }
// public static void FROM_NAME(java.util.function.Function value, ) { net.minecraft.inventory.SlotRanges.FROM_NAME = value; }

// public java.util.stream.Stream streamNames() { return wrapperContained.streamNames(); }
public static java.util.stream.Stream streamNames() { return net.minecraft.inventory.SlotRanges.streamNames(); }
// public boolean method_58079(yarnwrap.inventory.SlotRange slotRange) { return wrapperContained.method_58079(slotRange.wrapperContained); }
// public static boolean method_58079(yarnwrap.inventory.SlotRange slotRange, ) { return net.minecraft.inventory.SlotRanges.method_58079(slotRange.wrapperContained); }
// public yarnwrap.inventory.SlotRange fromName(java.lang.String name) { return new yarnwrap.inventory.SlotRange(wrapperContained.fromName(name)); }
// public static yarnwrap.inventory.SlotRange fromName(java.lang.String name, ) { return new yarnwrap.inventory.SlotRange(net.minecraft.inventory.SlotRanges.fromName(name)); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,int slotId) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotId)); }
// public static yarnwrap.inventory.SlotRange create(java.lang.String name,int slotId, ) { return new yarnwrap.inventory.SlotRange(net.minecraft.inventory.SlotRanges.create(name,slotId)); }
// public yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
// public static yarnwrap.inventory.SlotRange create(java.lang.String name,it.unimi.dsi.fastutil.ints.IntList slotIds, ) { return new yarnwrap.inventory.SlotRange(net.minecraft.inventory.SlotRanges.create(name,slotIds)); }
// // public yarnwrap.inventory.SlotRange create(java.lang.String name,int slotIds) { return new yarnwrap.inventory.SlotRange(wrapperContained.create(name,slotIds)); }
// // public static yarnwrap.inventory.SlotRange create(java.lang.String name,int slotIds, ) { return new yarnwrap.inventory.SlotRange(net.minecraft.inventory.SlotRanges.create(name,slotIds)); }
// public void method_58084(java.util.ArrayList list) { wrapperContained.method_58084(list); }
// public static void method_58084(java.util.ArrayList list, ) { net.minecraft.inventory.SlotRanges.method_58084(list); }
// public void createAndAdd(java.util.List list,java.lang.String name,int slotId) { wrapperContained.createAndAdd(list,name,slotId); }
// public static void createAndAdd(java.util.List list,java.lang.String name,int slotId, ) { net.minecraft.inventory.SlotRanges.createAndAdd(list,name,slotId); }
// public void createAndAdd(java.util.List list,java.lang.String baseName,int firstSlotId,int slotCount) { wrapperContained.createAndAdd(list,baseName,firstSlotId,slotCount); }
// public static void createAndAdd(java.util.List list,java.lang.String baseName,int firstSlotId,int slotCount, ) { net.minecraft.inventory.SlotRanges.createAndAdd(list,baseName,firstSlotId,slotCount); }
// // public void createAndAdd(java.util.List list,java.lang.String name,int slots) { wrapperContained.createAndAdd(list,name,slots); }
// // public static void createAndAdd(java.util.List list,java.lang.String name,int slots, ) { net.minecraft.inventory.SlotRanges.createAndAdd(list,name,slots); }
// public java.util.stream.Stream streamSingleSlotNames() { return wrapperContained.streamSingleSlotNames(); }
public static java.util.stream.Stream streamSingleSlotNames() { return net.minecraft.inventory.SlotRanges.streamSingleSlotNames(); }
// public java.lang.String method_58089(java.lang.String name) { return wrapperContained.method_58089(name); }
// public static java.lang.String method_58089(java.lang.String name, ) { return net.minecraft.inventory.SlotRanges.method_58089(name); }

}