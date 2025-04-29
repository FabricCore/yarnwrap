package yarnwrap.screen.slot;
public class ForgingSlotsManager { public net.minecraft.screen.slot.ForgingSlotsManager wrapperContained; public ForgingSlotsManager(net.minecraft.screen.slot.ForgingSlotsManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List inputSlots() { return wrapperContained.inputSlots; }
// public void inputSlots(java.util.List value) { wrapperContained.inputSlots = value; }
// public static java.util.List inputSlots() { return net.minecraft.screen.slot.ForgingSlotsManager.inputSlots; }
// public static void inputSlots(java.util.List value, ) { net.minecraft.screen.slot.ForgingSlotsManager.inputSlots = value; }

// public Object resultSlot() { return wrapperContained.resultSlot; }
// // public void resultSlot(Object value) { wrapperContained.resultSlot = value; }
// // public static Object resultSlot() { return net.minecraft.screen.slot.ForgingSlotsManager.resultSlot; }
// // public static void resultSlot(Object value, ) { net.minecraft.screen.slot.ForgingSlotsManager.resultSlot = value; }

// public ForgingSlotsManager(java.util.List inputSlots,Object resultSlot) { this.wrapperContained = new net.minecraft.screen.slot.ForgingSlotsManager(inputSlots,resultSlot); }
// public Object create() { return wrapperContained.create(); }
public static Object create() { return net.minecraft.screen.slot.ForgingSlotsManager.create(); }
public boolean hasSlotIndex(int index) { return wrapperContained.hasSlotIndex(index); }
// public static boolean hasSlotIndex(int index, ) { return net.minecraft.screen.slot.ForgingSlotsManager.hasSlotIndex(index); }
public Object getResultSlot() { return wrapperContained.getResultSlot(); }
// public static Object getResultSlot() { return net.minecraft.screen.slot.ForgingSlotsManager.getResultSlot(); }
public Object getInputSlot(int index) { return wrapperContained.getInputSlot(index); }
// public static Object getInputSlot(int index, ) { return net.minecraft.screen.slot.ForgingSlotsManager.getInputSlot(index); }
public java.util.List getInputSlots() { return wrapperContained.getInputSlots(); }
// public static java.util.List getInputSlots() { return net.minecraft.screen.slot.ForgingSlotsManager.getInputSlots(); }
public int getInputSlotCount() { return wrapperContained.getInputSlotCount(); }
// public static int getInputSlotCount() { return net.minecraft.screen.slot.ForgingSlotsManager.getInputSlotCount(); }
public int getResultSlotIndex() { return wrapperContained.getResultSlotIndex(); }
// public static int getResultSlotIndex() { return net.minecraft.screen.slot.ForgingSlotsManager.getResultSlotIndex(); }
public java.util.List getInputSlotIndices() { return wrapperContained.getInputSlotIndices(); }
// public static java.util.List getInputSlotIndices() { return net.minecraft.screen.slot.ForgingSlotsManager.getInputSlotIndices(); }

}