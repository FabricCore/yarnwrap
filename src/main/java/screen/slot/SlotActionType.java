package yarnwrap.screen.slot;
public class SlotActionType { public net.minecraft.screen.slot.SlotActionType wrapperContained; public SlotActionType(net.minecraft.screen.slot.SlotActionType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.screen.slot.SlotActionType QUICK_CRAFT() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_CRAFT); }
public yarnwrap.screen.slot.SlotActionType PICKUP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP); }
public yarnwrap.screen.slot.SlotActionType SWAP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.SWAP); }
public yarnwrap.screen.slot.SlotActionType PICKUP_ALL() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP_ALL); }
public yarnwrap.screen.slot.SlotActionType QUICK_MOVE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_MOVE); }
public yarnwrap.screen.slot.SlotActionType THROW() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.THROW); }
public yarnwrap.screen.slot.SlotActionType CLONE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.CLONE); }

}