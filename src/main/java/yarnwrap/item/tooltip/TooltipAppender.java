package yarnwrap.item.tooltip;
public class TooltipAppender { public net.minecraft.item.tooltip.TooltipAppender wrapperContained; public TooltipAppender(net.minecraft.item.tooltip.TooltipAppender wrapperContained) { this.wrapperContained = wrapperContained; }

// public void appendTooltip(Object context,java.util.function.Consumer tooltip,yarnwrap.item.tooltip.TooltipType type) { wrapperContained.appendTooltip(context,tooltip,type.wrapperContained); }
// public static void appendTooltip(Object context,java.util.function.Consumer tooltip,yarnwrap.item.tooltip.TooltipType type, ) { net.minecraft.item.tooltip.TooltipAppender.appendTooltip(context,tooltip,type.wrapperContained); }

}