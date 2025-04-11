package yarnwrap.screen.slot;
public class ForgingSlotsManager { public net.minecraft.screen.slot.ForgingSlotsManager wrapperContained; public ForgingSlotsManager(net.minecraft.screen.slot.ForgingSlotsManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List inputSlots() { return wrapperContained.inputSlots; }
// public void inputSlots(java.util.List value) { wrapperContained.inputSlots = value; }
// public Object resultSlot() { return wrapperContained.resultSlot; }
// // public void resultSlot(Object value) { wrapperContained.resultSlot = value; }
public Object create() { return wrapperContained.create(); }
public boolean hasSlotIndex(int index) { return wrapperContained.hasSlotIndex(index); }
public Object getResultSlot() { return wrapperContained.getResultSlot(); }
public Object getInputSlot(int index) { return wrapperContained.getInputSlot(index); }
public java.util.List getInputSlots() { return wrapperContained.getInputSlots(); }
public int getInputSlotCount() { return wrapperContained.getInputSlotCount(); }
public int getResultSlotIndex() { return wrapperContained.getResultSlotIndex(); }
public java.util.List getInputSlotIndices() { return wrapperContained.getInputSlotIndices(); }

}