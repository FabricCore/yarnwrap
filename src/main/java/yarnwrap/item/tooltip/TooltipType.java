package yarnwrap.item.tooltip;
public class TooltipType { public net.minecraft.item.tooltip.TooltipType wrapperContained; public TooltipType(net.minecraft.item.tooltip.TooltipType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object BASIC() { return wrapperContained.BASIC; }
// // public void BASIC(Object value) { wrapperContained.BASIC = value; }
// public static Object BASIC() { return net.minecraft.item.tooltip.TooltipType.BASIC; }
// // public static void BASIC(Object value, ) { net.minecraft.item.tooltip.TooltipType.BASIC = value; }

// public Object ADVANCED() { return wrapperContained.ADVANCED; }
// // public void ADVANCED(Object value) { wrapperContained.ADVANCED = value; }
// public static Object ADVANCED() { return net.minecraft.item.tooltip.TooltipType.ADVANCED; }
// // public static void ADVANCED(Object value, ) { net.minecraft.item.tooltip.TooltipType.ADVANCED = value; }

public boolean isAdvanced() { return wrapperContained.isAdvanced(); }
// public static boolean isAdvanced() { return net.minecraft.item.tooltip.TooltipType.isAdvanced(); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public static boolean isCreative() { return net.minecraft.item.tooltip.TooltipType.isCreative(); }

}