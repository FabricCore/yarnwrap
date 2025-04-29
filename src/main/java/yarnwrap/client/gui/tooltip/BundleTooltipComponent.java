package yarnwrap.client.gui.tooltip;
public class BundleTooltipComponent { public net.minecraft.client.gui.tooltip.BundleTooltipComponent wrapperContained; public BundleTooltipComponent(net.minecraft.client.gui.tooltip.BundleTooltipComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WIDTH_PER_COLUMN() { return wrapperContained.WIDTH_PER_COLUMN; }
// public void WIDTH_PER_COLUMN(int value) { wrapperContained.WIDTH_PER_COLUMN = value; }
// public static int WIDTH_PER_COLUMN() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.WIDTH_PER_COLUMN; }
// public static void WIDTH_PER_COLUMN(int value, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.WIDTH_PER_COLUMN = value; }

// public int HEIGHT_PER_ROW() { return wrapperContained.HEIGHT_PER_ROW; }
// public void HEIGHT_PER_ROW(int value) { wrapperContained.HEIGHT_PER_ROW = value; }
// public static int HEIGHT_PER_ROW() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.HEIGHT_PER_ROW; }
// public static void HEIGHT_PER_ROW(int value, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.HEIGHT_PER_ROW = value; }

// public yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BACKGROUND_TEXTURE); }
// public void BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.tooltip.BundleTooltipComponent.BACKGROUND_TEXTURE); }
// public static void BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.component.type.BundleContentsComponent bundleContents() { return new yarnwrap.component.type.BundleContentsComponent(wrapperContained.bundleContents); }
// public void bundleContents(yarnwrap.component.type.BundleContentsComponent value) { wrapperContained.bundleContents = value.wrapperContained; }
// public static yarnwrap.component.type.BundleContentsComponent bundleContents() { return new yarnwrap.component.type.BundleContentsComponent(net.minecraft.client.gui.tooltip.BundleTooltipComponent.bundleContents); }
// public static void bundleContents(yarnwrap.component.type.BundleContentsComponent value, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.bundleContents = value.wrapperContained; }

public BundleTooltipComponent(yarnwrap.component.type.BundleContentsComponent bundleContents) { this.wrapperContained = new net.minecraft.client.gui.tooltip.BundleTooltipComponent(bundleContents.wrapperContained); }
// public void drawSlot(int x,int y,int index,boolean shouldBlock,yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer) { wrapperContained.drawSlot(x,y,index,shouldBlock,context.wrapperContained,textRenderer.wrapperContained); }
// public static void drawSlot(int x,int y,int index,boolean shouldBlock,yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.drawSlot(x,y,index,shouldBlock,context.wrapperContained,textRenderer.wrapperContained); }
// public void draw(yarnwrap.client.gui.DrawContext context,int x,int y,Object sprite) { wrapperContained.draw(context.wrapperContained,x,y,sprite); }
// public static void draw(yarnwrap.client.gui.DrawContext context,int x,int y,Object sprite, ) { net.minecraft.client.gui.tooltip.BundleTooltipComponent.draw(context.wrapperContained,x,y,sprite); }
// public int getColumns() { return wrapperContained.getColumns(); }
// public static int getColumns() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.getColumns(); }
// public int getRows() { return wrapperContained.getRows(); }
// public static int getRows() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.getRows(); }
// public int getColumnsWidth() { return wrapperContained.getColumnsWidth(); }
// public static int getColumnsWidth() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.getColumnsWidth(); }
// public int getRowsHeight() { return wrapperContained.getRowsHeight(); }
// public static int getRowsHeight() { return net.minecraft.client.gui.tooltip.BundleTooltipComponent.getRowsHeight(); }

}