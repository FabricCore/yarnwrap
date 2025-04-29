package yarnwrap.client.gui.tooltip;
public class FocusedTooltipPositioner { public net.minecraft.client.gui.tooltip.FocusedTooltipPositioner wrapperContained; public FocusedTooltipPositioner(net.minecraft.client.gui.tooltip.FocusedTooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.ScreenRect focus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.focus); }
// public void focus(yarnwrap.client.gui.ScreenRect value) { wrapperContained.focus = value.wrapperContained; }
// public static yarnwrap.client.gui.ScreenRect focus() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.tooltip.FocusedTooltipPositioner.focus); }
// public static void focus(yarnwrap.client.gui.ScreenRect value, ) { net.minecraft.client.gui.tooltip.FocusedTooltipPositioner.focus = value.wrapperContained; }

public FocusedTooltipPositioner(yarnwrap.client.gui.ScreenRect focus) { this.wrapperContained = new net.minecraft.client.gui.tooltip.FocusedTooltipPositioner(focus.wrapperContained); }

}