package yarnwrap.item.tooltip;
public class TooltipType { public net.minecraft.item.tooltip.TooltipType wrapperContained; public TooltipType(net.minecraft.item.tooltip.TooltipType wrapperContained) { this.wrapperContained = wrapperContained; }

public Object BASIC() { return wrapperContained.BASIC; }
public Object ADVANCED() { return wrapperContained.ADVANCED; }
public boolean isCreative() { return wrapperContained.isCreative(); }
public boolean isAdvanced() { return wrapperContained.isAdvanced(); }

}