package yarnwrap.client.gui.tooltip;
public class FocusedTooltipPositioner { public net.minecraft.client.gui.tooltip.FocusedTooltipPositioner wrapperContained; public FocusedTooltipPositioner(net.minecraft.client.gui.tooltip.FocusedTooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.ScreenRect focus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.focus); }
// public void focus(yarnwrap.client.gui.ScreenRect value) { wrapperContained.focus = value.wrapperContained; }

}