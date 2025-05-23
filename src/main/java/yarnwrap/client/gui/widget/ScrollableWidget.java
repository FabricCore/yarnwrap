package yarnwrap.client.gui.widget;
public class ScrollableWidget { public net.minecraft.client.gui.widget.ScrollableWidget wrapperContained; public ScrollableWidget(net.minecraft.client.gui.widget.ScrollableWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public double scrollY() { return wrapperContained.scrollY; }
// public void scrollY(double value) { wrapperContained.scrollY = value; }
// public static double scrollY() { return net.minecraft.client.gui.widget.ScrollableWidget.scrollY; }
// public static void scrollY(double value, ) { net.minecraft.client.gui.widget.ScrollableWidget.scrollY = value; }

// public boolean scrollbarDragged() { return wrapperContained.scrollbarDragged; }
// public void scrollbarDragged(boolean value) { wrapperContained.scrollbarDragged = value; }
// public static boolean scrollbarDragged() { return net.minecraft.client.gui.widget.ScrollableWidget.scrollbarDragged; }
// public static void scrollbarDragged(boolean value, ) { net.minecraft.client.gui.widget.ScrollableWidget.scrollbarDragged = value; }

// public yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_TEXTURE); }
// public void SCROLLER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.widget.ScrollableWidget.SCROLLER_TEXTURE); }
// public static void SCROLLER_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.widget.ScrollableWidget.SCROLLER_TEXTURE = value.wrapperContained; }

// public int SCROLLBAR_WIDTH() { return wrapperContained.SCROLLBAR_WIDTH; }
// public void SCROLLBAR_WIDTH(int value) { wrapperContained.SCROLLBAR_WIDTH = value; }
public static int SCROLLBAR_WIDTH() { return net.minecraft.client.gui.widget.ScrollableWidget.SCROLLBAR_WIDTH; }
// public static void SCROLLBAR_WIDTH(int value, ) { net.minecraft.client.gui.widget.ScrollableWidget.SCROLLBAR_WIDTH = value; }

// public yarnwrap.util.Identifier SCROLLER_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_BACKGROUND_TEXTURE); }
// public void SCROLLER_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SCROLLER_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.widget.ScrollableWidget.SCROLLER_BACKGROUND_TEXTURE); }
// public static void SCROLLER_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.widget.ScrollableWidget.SCROLLER_BACKGROUND_TEXTURE = value.wrapperContained; }

public void setScrollY(double scrollY) { wrapperContained.setScrollY(scrollY); }
// public static void setScrollY(double scrollY, ) { net.minecraft.client.gui.widget.ScrollableWidget.setScrollY(scrollY); }
public double getScrollY() { return wrapperContained.getScrollY(); }
// public static double getScrollY() { return net.minecraft.client.gui.widget.ScrollableWidget.getScrollY(); }
public int getMaxScrollY() { return wrapperContained.getMaxScrollY(); }
// public static int getMaxScrollY() { return net.minecraft.client.gui.widget.ScrollableWidget.getMaxScrollY(); }
// public boolean overflows() { return wrapperContained.overflows(); }
// public static boolean overflows() { return net.minecraft.client.gui.widget.ScrollableWidget.overflows(); }
// public double getDeltaYPerScroll() { return wrapperContained.getDeltaYPerScroll(); }
// public static double getDeltaYPerScroll() { return net.minecraft.client.gui.widget.ScrollableWidget.getDeltaYPerScroll(); }
// public int getScrollbarThumbHeight() { return wrapperContained.getScrollbarThumbHeight(); }
// public static int getScrollbarThumbHeight() { return net.minecraft.client.gui.widget.ScrollableWidget.getScrollbarThumbHeight(); }
// public int getContentsHeightWithPadding() { return wrapperContained.getContentsHeightWithPadding(); }
// public static int getContentsHeightWithPadding() { return net.minecraft.client.gui.widget.ScrollableWidget.getContentsHeightWithPadding(); }
// public void drawScrollbar(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawScrollbar(context.wrapperContained); }
// public static void drawScrollbar(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.widget.ScrollableWidget.drawScrollbar(context.wrapperContained); }
public boolean checkScrollbarDragged(double mouseX,double mouseY,int button) { return wrapperContained.checkScrollbarDragged(mouseX,mouseY,button); }
// public static boolean checkScrollbarDragged(double mouseX,double mouseY,int button, ) { return net.minecraft.client.gui.widget.ScrollableWidget.checkScrollbarDragged(mouseX,mouseY,button); }
public void refreshScroll() { wrapperContained.refreshScroll(); }
// public static void refreshScroll() { net.minecraft.client.gui.widget.ScrollableWidget.refreshScroll(); }
// public int getScrollbarX() { return wrapperContained.getScrollbarX(); }
// public static int getScrollbarX() { return net.minecraft.client.gui.widget.ScrollableWidget.getScrollbarX(); }
// public int getScrollbarThumbY() { return wrapperContained.getScrollbarThumbY(); }
// public static int getScrollbarThumbY() { return net.minecraft.client.gui.widget.ScrollableWidget.getScrollbarThumbY(); }

}