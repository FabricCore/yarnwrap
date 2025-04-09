package yarnwrap.client.gui.tooltip;
public class TooltipState { public net.minecraft.client.gui.tooltip.TooltipState wrapperContained; public TooltipState(net.minecraft.client.gui.tooltip.TooltipState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.tooltip.Tooltip tooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.tooltip); }
// public java.time.Duration delay() { return wrapperContained.delay; }
// public long renderCheckTime() { return wrapperContained.renderCheckTime; }
// public boolean prevShouldRender() { return wrapperContained.prevShouldRender; }
public yarnwrap.client.gui.tooltip.Tooltip getTooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.getTooltip()); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendNarrations(builder.wrapperContained); }
// public yarnwrap.client.gui.tooltip.TooltipPositioner createPositioner(yarnwrap.client.gui.ScreenRect focus,boolean hovered,boolean focused) { return new yarnwrap.client.gui.tooltip.TooltipPositioner(wrapperContained.createPositioner(focus.wrapperContained,hovered,focused)); }
public void setDelay(java.time.Duration delay) { wrapperContained.setDelay(delay); }
public void render(boolean hovered,boolean focused,yarnwrap.client.gui.ScreenRect focus) { wrapperContained.render(hovered,focused,focus.wrapperContained); }

}