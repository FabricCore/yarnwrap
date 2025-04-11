package yarnwrap.client.gui.tooltip;
public class WidgetTooltipPositioner { public net.minecraft.client.gui.tooltip.WidgetTooltipPositioner wrapperContained; public WidgetTooltipPositioner(net.minecraft.client.gui.tooltip.WidgetTooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.ScreenRect focus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.focus); }
// public void focus(yarnwrap.client.gui.ScreenRect value) { wrapperContained.focus = value.wrapperContained; }
public WidgetTooltipPositioner(yarnwrap.client.gui.ScreenRect focus) { this.wrapperContained = new net.minecraft.client.gui.tooltip.WidgetTooltipPositioner(focus.wrapperContained); }
// public int getOffsetY(int tooltipY,int widgetY,int widgetHeight) { return wrapperContained.getOffsetY(tooltipY,widgetY,widgetHeight); }

}