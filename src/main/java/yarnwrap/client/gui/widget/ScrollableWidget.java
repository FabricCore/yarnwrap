package yarnwrap.client.gui.widget;
public class ScrollableWidget { public net.minecraft.client.gui.widget.ScrollableWidget wrapperContained; public ScrollableWidget(net.minecraft.client.gui.widget.ScrollableWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int PADDING() { return wrapperContained.PADDING; }
// public void PADDING(int value) { wrapperContained.PADDING = value; }
// public double scrollY() { return wrapperContained.scrollY; }
// public void scrollY(double value) { wrapperContained.scrollY = value; }
// public boolean scrollbarDragged() { return wrapperContained.scrollbarDragged; }
// public void scrollbarDragged(boolean value) { wrapperContained.scrollbarDragged = value; }
// public yarnwrap.client.gui.screen.ButtonTextures TEXT_FIELD_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXT_FIELD_TEXTURES); }
// public void TEXT_FIELD_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXT_FIELD_TEXTURES = value.wrapperContained; }
// public yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_TEXTURE); }
// public void SCROLLER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_TEXTURE = value.wrapperContained; }
// public int SCROLLER_WIDTH() { return wrapperContained.SCROLLER_WIDTH; }
// public void SCROLLER_WIDTH(int value) { wrapperContained.SCROLLER_WIDTH = value; }
// public int getPadding() { return wrapperContained.getPadding(); }
// public void setScrollY(double scrollY) { wrapperContained.setScrollY(scrollY); }
// public boolean isVisible(int top,int bottom) { return wrapperContained.isVisible(top,bottom); }
// public void renderOverlay(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderOverlay(context.wrapperContained); }
// public int getPaddingDoubled() { return wrapperContained.getPaddingDoubled(); }
// public void drawBox(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawBox(context.wrapperContained); }
// public double getScrollY() { return wrapperContained.getScrollY(); }
// public boolean isWithinBounds(double mouseX,double mouseY) { return wrapperContained.isWithinBounds(mouseX,mouseY); }
// public void renderContents(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderContents(context.wrapperContained,mouseX,mouseY,delta); }
// public int getMaxScrollY() { return wrapperContained.getMaxScrollY(); }
// public int getContentsHeight() { return wrapperContained.getContentsHeight(); }
// public boolean overflows() { return wrapperContained.overflows(); }
// public double getDeltaYPerScroll() { return wrapperContained.getDeltaYPerScroll(); }
// public int getScrollbarThumbHeight() { return wrapperContained.getScrollbarThumbHeight(); }
// public int getContentsHeightWithPadding() { return wrapperContained.getContentsHeightWithPadding(); }
// public void drawScrollbar(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawScrollbar(context.wrapperContained); }
// public void drawBox(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height) { wrapperContained.drawBox(context.wrapperContained,x,y,width,height); }
public int getScrollerWidth() { return wrapperContained.getScrollerWidth(); }

}