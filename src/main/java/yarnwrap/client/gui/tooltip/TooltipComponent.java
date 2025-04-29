package yarnwrap.client.gui.tooltip;
public class TooltipComponent { public net.minecraft.client.gui.tooltip.TooltipComponent wrapperContained; public TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.gui.tooltip.TooltipComponent.getHeight(); }
// public yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.text.OrderedText text) { return new yarnwrap.client.gui.tooltip.TooltipComponent(wrapperContained.of(text.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.text.OrderedText text, ) { return new yarnwrap.client.gui.tooltip.TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent.of(text.wrapperContained)); }
// public yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.item.tooltip.TooltipData data) { return new yarnwrap.client.gui.tooltip.TooltipComponent(wrapperContained.of(data.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.TooltipComponent of(yarnwrap.item.tooltip.TooltipData data, ) { return new yarnwrap.client.gui.tooltip.TooltipComponent(net.minecraft.client.gui.tooltip.TooltipComponent.of(data.wrapperContained)); }
public int getWidth(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.getWidth(textRenderer.wrapperContained); }
// public static int getWidth(yarnwrap.client.font.TextRenderer textRenderer, ) { return net.minecraft.client.gui.tooltip.TooltipComponent.getWidth(textRenderer.wrapperContained); }
// public void drawText(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,org.joml.Matrix4f matrix,Object vertexConsumers) { wrapperContained.drawText(textRenderer.wrapperContained,x,y,matrix,vertexConsumers); }
// public static void drawText(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,org.joml.Matrix4f matrix,Object vertexConsumers, ) { net.minecraft.client.gui.tooltip.TooltipComponent.drawText(textRenderer.wrapperContained,x,y,matrix,vertexConsumers); }
public void drawItems(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,yarnwrap.client.gui.DrawContext context) { wrapperContained.drawItems(textRenderer.wrapperContained,x,y,context.wrapperContained); }
// public static void drawItems(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.tooltip.TooltipComponent.drawItems(textRenderer.wrapperContained,x,y,context.wrapperContained); }

}