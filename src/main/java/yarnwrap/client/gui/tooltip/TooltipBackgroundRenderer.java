package yarnwrap.client.gui.tooltip;
public class TooltipBackgroundRenderer { public net.minecraft.client.gui.tooltip.TooltipBackgroundRenderer wrapperContained; public TooltipBackgroundRenderer(net.minecraft.client.gui.tooltip.TooltipBackgroundRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BACKGROUND_COLOR() { return wrapperContained.BACKGROUND_COLOR; }
// public void BACKGROUND_COLOR(int value) { wrapperContained.BACKGROUND_COLOR = value; }
// public int START_Y_BORDER_COLOR() { return wrapperContained.START_Y_BORDER_COLOR; }
// public void START_Y_BORDER_COLOR(int value) { wrapperContained.START_Y_BORDER_COLOR = value; }
// public int END_Y_BORDER_COLOR() { return wrapperContained.END_Y_BORDER_COLOR; }
// public void END_Y_BORDER_COLOR(int value) { wrapperContained.END_Y_BORDER_COLOR = value; }
public void render(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height,int z) { wrapperContained.render(context.wrapperContained,x,y,width,height,z); }
// public void renderVerticalLine(yarnwrap.client.gui.DrawContext context,int x,int y,int height,int z,int startColor,int endColor) { wrapperContained.renderVerticalLine(context.wrapperContained,x,y,height,z,startColor,endColor); }
// public void renderBorder(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height,int z,int startColor,int endColor) { wrapperContained.renderBorder(context.wrapperContained,x,y,width,height,z,startColor,endColor); }
// public void renderVerticalLine(yarnwrap.client.gui.DrawContext context,int x,int y,int height,int z,int color) { wrapperContained.renderVerticalLine(context.wrapperContained,x,y,height,z,color); }
// public void renderRectangle(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height,int z,int color) { wrapperContained.renderRectangle(context.wrapperContained,x,y,width,height,z,color); }
// public void renderHorizontalLine(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int z,int color) { wrapperContained.renderHorizontalLine(context.wrapperContained,x,y,width,z,color); }

}