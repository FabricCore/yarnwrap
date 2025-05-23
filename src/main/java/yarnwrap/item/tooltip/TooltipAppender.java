package yarnwrap.item.tooltip;
public class TooltipAppender { public net.minecraft.item.tooltip.TooltipAppender wrapperContained; public TooltipAppender(net.minecraft.item.tooltip.TooltipAppender wrapperContained) { this.wrapperContained = wrapperContained; }

// public void appendTooltip(Object context,java.util.function.Consumer textConsumer,yarnwrap.item.tooltip.TooltipType type,yarnwrap.component.ComponentsAccess components) { wrapperContained.appendTooltip(context,textConsumer,type.wrapperContained,components.wrapperContained); }
// public static void appendTooltip(Object context,java.util.function.Consumer textConsumer,yarnwrap.item.tooltip.TooltipType type,yarnwrap.component.ComponentsAccess components, ) { net.minecraft.item.tooltip.TooltipAppender.appendTooltip(context,textConsumer,type.wrapperContained,components.wrapperContained); }

}