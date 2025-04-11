package yarnwrap.item.tooltip;
public class TooltipType { public net.minecraft.item.tooltip.TooltipType wrapperContained; public TooltipType(net.minecraft.item.tooltip.TooltipType wrapperContained) { this.wrapperContained = wrapperContained; }

public Object BASIC() { return wrapperContained.BASIC; }
// // public void BASIC(Object value) { wrapperContained.BASIC = value; }
public Object ADVANCED() { return wrapperContained.ADVANCED; }
// // public void ADVANCED(Object value) { wrapperContained.ADVANCED = value; }
public boolean isCreative() { return wrapperContained.isCreative(); }
public boolean isAdvanced() { return wrapperContained.isAdvanced(); }

}