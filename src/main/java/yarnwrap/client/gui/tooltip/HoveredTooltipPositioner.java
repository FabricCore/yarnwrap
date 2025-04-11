package yarnwrap.client.gui.tooltip;
public class HoveredTooltipPositioner { public net.minecraft.client.gui.tooltip.HoveredTooltipPositioner wrapperContained; public HoveredTooltipPositioner(net.minecraft.client.gui.tooltip.HoveredTooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.tooltip.TooltipPositioner INSTANCE() { return new yarnwrap.client.gui.tooltip.TooltipPositioner(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.gui.tooltip.TooltipPositioner value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public void preventOverflow(int screenWidth,int screenHeight,org.joml.Vector2i pos,int width,int height) { wrapperContained.preventOverflow(screenWidth,screenHeight,pos,width,height); }

}