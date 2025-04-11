package yarnwrap.screen.slot;
public class SlotActionType { public net.minecraft.screen.slot.SlotActionType wrapperContained; public SlotActionType(net.minecraft.screen.slot.SlotActionType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.screen.slot.SlotActionType QUICK_CRAFT() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_CRAFT); }
// public void QUICK_CRAFT(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.QUICK_CRAFT = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType PICKUP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP); }
// public void PICKUP(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.PICKUP = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType SWAP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.SWAP); }
// public void SWAP(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.SWAP = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType PICKUP_ALL() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP_ALL); }
// public void PICKUP_ALL(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.PICKUP_ALL = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType QUICK_MOVE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_MOVE); }
// public void QUICK_MOVE(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.QUICK_MOVE = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType THROW() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.THROW); }
// public void THROW(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.THROW = value.wrapperContained; }
public yarnwrap.screen.slot.SlotActionType CLONE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.CLONE); }
// public void CLONE(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.CLONE = value.wrapperContained; }

}