package yarnwrap.client.gui.tooltip;
public class TooltipSubmenuHandler { public net.minecraft.client.gui.tooltip.TooltipSubmenuHandler wrapperContained; public TooltipSubmenuHandler(net.minecraft.client.gui.tooltip.TooltipSubmenuHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean onScroll(double horizontal,double vertical,int slotId,yarnwrap.item.ItemStack item) { return wrapperContained.onScroll(horizontal,vertical,slotId,item.wrapperContained); }
// public static boolean onScroll(double horizontal,double vertical,int slotId,yarnwrap.item.ItemStack item, ) { return net.minecraft.client.gui.tooltip.TooltipSubmenuHandler.onScroll(horizontal,vertical,slotId,item.wrapperContained); }
public boolean isApplicableTo(yarnwrap.screen.slot.Slot slot) { return wrapperContained.isApplicableTo(slot.wrapperContained); }
// public static boolean isApplicableTo(yarnwrap.screen.slot.Slot slot, ) { return net.minecraft.client.gui.tooltip.TooltipSubmenuHandler.isApplicableTo(slot.wrapperContained); }
public void reset(yarnwrap.screen.slot.Slot slot) { wrapperContained.reset(slot.wrapperContained); }
// public static void reset(yarnwrap.screen.slot.Slot slot, ) { net.minecraft.client.gui.tooltip.TooltipSubmenuHandler.reset(slot.wrapperContained); }
public void onMouseClick(yarnwrap.screen.slot.Slot slot,yarnwrap.screen.slot.SlotActionType actionType) { wrapperContained.onMouseClick(slot.wrapperContained,actionType.wrapperContained); }
// public static void onMouseClick(yarnwrap.screen.slot.Slot slot,yarnwrap.screen.slot.SlotActionType actionType, ) { net.minecraft.client.gui.tooltip.TooltipSubmenuHandler.onMouseClick(slot.wrapperContained,actionType.wrapperContained); }

}