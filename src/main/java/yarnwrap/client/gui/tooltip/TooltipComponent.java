package yarnwrap.client.gui.tooltip;
public class TooltipComponent { public net.minecraft.client.gui.tooltip.TooltipComponent wrapperContained; public TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.getHeight(textRenderer.wrapperContained); }
// public static int getHeight(yarnwrap.client.font.TextRenderer textRenderer, ) { return net.minecraft.client.gui.tooltip.TooltipComponent.getHeight(textRenderer.wrapperContained); }
// public yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.text.OrderedText text) { return new yarnwrap.client.gui.tooltip.TooltipComponent(wrapperContained.of(text.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.text.OrderedText text, ) { return new yarnwrap.client.gui.tooltip.TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent.of(text.wrapperContained)); }
// public yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.item.tooltip.TooltipData tooltipData) { return new yarnwrap.client.gui.tooltip.TooltipComponent(wrapperContained.of(tooltipData.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.item.tooltip.TooltipData tooltipData, ) { return new yarnwrap.client.gui.tooltip.TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent.of(tooltipData.wrapperContained)); }
public int getWidth(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.getWidth(textRenderer.wrapperContained); }
// public static int getWidth(yarnwrap.client.font.TextRenderer textRenderer, ) { return net.minecraft.client.gui.tooltip.TooltipComponent.getWidth(textRenderer.wrapperContained); }
// public void drawText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int x,int y) { wrapperContained.drawText(context.wrapperContained,textRenderer.wrapperContained,x,y); }
// public static void drawText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int x,int y, ) { net.minecraft.client.gui.tooltip.TooltipComponent.drawText(context.wrapperContained,textRenderer.wrapperContained,x,y); }
public void drawItems(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,int width,int height,yarnwrap.client.gui.DrawContext context) { wrapperContained.drawItems(textRenderer.wrapperContained,x,y,width,height,context.wrapperContained); }
// public static void drawItems(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,int width,int height,yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.tooltip.TooltipComponent.drawItems(textRenderer.wrapperContained,x,y,width,height,context.wrapperContained); }
public boolean isSticky() { return wrapperContained.isSticky(); }
// public static boolean isSticky() { return net.minecraft.client.gui.tooltip.TooltipComponent.isSticky(); }

}