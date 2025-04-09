package yarnwrap.client.gui.tooltip;
public class BundleTooltipComponent { public net.minecraft.client.gui.tooltip.BundleTooltipComponent wrapperContained; public BundleTooltipComponent(net.minecraft.client.gui.tooltip.BundleTooltipComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WIDTH_PER_COLUMN() { return wrapperContained.WIDTH_PER_COLUMN; }
// public int HEIGHT_PER_ROW() { return wrapperContained.HEIGHT_PER_ROW; }
// public yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BACKGROUND_TEXTURE); }
// public yarnwrap.component.type.BundleContentsComponent bundleContents() { return new yarnwrap.component.type.BundleContentsComponent(wrapperContained.bundleContents); }
// public void drawSlot(int x,int y,int index,boolean shouldBlock,yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer) { wrapperContained.drawSlot(x,y,index,shouldBlock,context.wrapperContained,textRenderer.wrapperContained); }
// public void draw(yarnwrap.client.gui.DrawContext context,int x,int y,Object sprite) { wrapperContained.draw(context.wrapperContained,x,y,sprite); }
// public int getColumns() { return wrapperContained.getColumns(); }
// public int getRows() { return wrapperContained.getRows(); }
// public int getColumnsWidth() { return wrapperContained.getColumnsWidth(); }
// public int getRowsHeight() { return wrapperContained.getRowsHeight(); }

}