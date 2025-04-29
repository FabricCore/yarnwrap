package yarnwrap.client.gui.tooltip;
public class HoveredTooltipPositioner { public net.minecraft.client.gui.tooltip.HoveredTooltipPositioner wrapperContained; public HoveredTooltipPositioner(net.minecraft.client.gui.tooltip.HoveredTooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.tooltip.TooltipPositioner INSTANCE() { return new yarnwrap.client.gui.tooltip.TooltipPositioner(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.gui.tooltip.TooltipPositioner value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.client.gui.tooltip.TooltipPositioner INSTANCE() { return new yarnwrap.client.gui.tooltip.TooltipPositioner(net.minecraft.client.gui.tooltip.HoveredTooltipPositioner.INSTANCE); }
// public static void INSTANCE(yarnwrap.client.gui.tooltip.TooltipPositioner value, ) { net.minecraft.client.gui.tooltip.HoveredTooltipPositioner.INSTANCE = value.wrapperContained; }

// public void preventOverflow(int screenWidth,int screenHeight,org.joml.Vector2i pos,int width,int height) { wrapperContained.preventOverflow(screenWidth,screenHeight,pos,width,height); }
// public static void preventOverflow(int screenWidth,int screenHeight,org.joml.Vector2i pos,int width,int height, ) { net.minecraft.client.gui.tooltip.HoveredTooltipPositioner.preventOverflow(screenWidth,screenHeight,pos,width,height); }

}