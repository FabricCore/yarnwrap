package yarnwrap.client.gui.tooltip;
public class TooltipState { public net.minecraft.client.gui.tooltip.TooltipState wrapperContained; public TooltipState(net.minecraft.client.gui.tooltip.TooltipState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.tooltip.Tooltip tooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.tooltip); }
// public void tooltip(yarnwrap.client.gui.tooltip.Tooltip value) { wrapperContained.tooltip = value.wrapperContained; }
// public static yarnwrap.client.gui.tooltip.Tooltip tooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.gui.tooltip.TooltipState.tooltip); }
// public static void tooltip(yarnwrap.client.gui.tooltip.Tooltip value, ) { net.minecraft.client.gui.tooltip.TooltipState.tooltip = value.wrapperContained; }

// public java.time.Duration delay() { return wrapperContained.delay; }
// public void delay(java.time.Duration value) { wrapperContained.delay = value; }
// public static java.time.Duration delay() { return net.minecraft.client.gui.tooltip.TooltipState.delay; }
// public static void delay(java.time.Duration value, ) { net.minecraft.client.gui.tooltip.TooltipState.delay = value; }

// public long renderCheckTime() { return wrapperContained.renderCheckTime; }
// public void renderCheckTime(long value) { wrapperContained.renderCheckTime = value; }
// public static long renderCheckTime() { return net.minecraft.client.gui.tooltip.TooltipState.renderCheckTime; }
// public static void renderCheckTime(long value, ) { net.minecraft.client.gui.tooltip.TooltipState.renderCheckTime = value; }

// public boolean prevShouldRender() { return wrapperContained.prevShouldRender; }
// public void prevShouldRender(boolean value) { wrapperContained.prevShouldRender = value; }
// public static boolean prevShouldRender() { return net.minecraft.client.gui.tooltip.TooltipState.prevShouldRender; }
// public static void prevShouldRender(boolean value, ) { net.minecraft.client.gui.tooltip.TooltipState.prevShouldRender = value; }

public yarnwrap.client.gui.tooltip.Tooltip getTooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.getTooltip()); }
// public static yarnwrap.client.gui.tooltip.Tooltip getTooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.gui.tooltip.TooltipState.getTooltip()); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
// public static void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip, ) { net.minecraft.client.gui.tooltip.TooltipState.setTooltip(tooltip.wrapperContained); }
public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendNarrations(builder.wrapperContained); }
// public static void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder, ) { net.minecraft.client.gui.tooltip.TooltipState.appendNarrations(builder.wrapperContained); }
// public yarnwrap.client.gui.tooltip.TooltipPositioner createPositioner(yarnwrap.client.gui.ScreenRect focus,boolean hovered,boolean focused) { return new yarnwrap.client.gui.tooltip.TooltipPositioner(wrapperContained.createPositioner(focus.wrapperContained,hovered,focused)); }
// public static yarnwrap.client.gui.tooltip.TooltipPositioner createPositioner(yarnwrap.client.gui.ScreenRect focus,boolean hovered,boolean focused, ) { return new yarnwrap.client.gui.tooltip.TooltipPositioner(net.minecraft.client.gui.tooltip.TooltipState.createPositioner(focus.wrapperContained,hovered,focused)); }
public void setDelay(java.time.Duration delay) { wrapperContained.setDelay(delay); }
// public static void setDelay(java.time.Duration delay, ) { net.minecraft.client.gui.tooltip.TooltipState.setDelay(delay); }
public void render(boolean hovered,boolean focused,yarnwrap.client.gui.ScreenRect focus) { wrapperContained.render(hovered,focused,focus.wrapperContained); }
// public static void render(boolean hovered,boolean focused,yarnwrap.client.gui.ScreenRect focus, ) { net.minecraft.client.gui.tooltip.TooltipState.render(hovered,focused,focus.wrapperContained); }

}