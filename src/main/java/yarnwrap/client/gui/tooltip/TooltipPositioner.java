package yarnwrap.client.gui.tooltip;
public class TooltipPositioner { public net.minecraft.client.gui.tooltip.TooltipPositioner wrapperContained; public TooltipPositioner(net.minecraft.client.gui.tooltip.TooltipPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

public org.joml.Vector2ic getPosition(int screenWidth,int screenHeight,int x,int y,int width,int height) { return wrapperContained.getPosition(screenWidth,screenHeight,x,y,width,height); }
// public static org.joml.Vector2ic getPosition(int screenWidth,int screenHeight,int x,int y,int width,int height, ) { return net.minecraft.client.gui.tooltip.TooltipPositioner.getPosition(screenWidth,screenHeight,x,y,width,height); }

}