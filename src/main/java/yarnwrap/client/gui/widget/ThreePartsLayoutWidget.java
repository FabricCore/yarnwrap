package yarnwrap.client.gui.widget;
public class ThreePartsLayoutWidget { public net.minecraft.client.gui.widget.ThreePartsLayoutWidget wrapperContained; public ThreePartsLayoutWidget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_HEADER_FOOTER_HEIGHT() { return wrapperContained.DEFAULT_HEADER_FOOTER_HEIGHT; }
// public void DEFAULT_HEADER_FOOTER_HEIGHT(int value) { wrapperContained.DEFAULT_HEADER_FOOTER_HEIGHT = value; }
public static int DEFAULT_HEADER_FOOTER_HEIGHT() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.DEFAULT_HEADER_FOOTER_HEIGHT; }
// public static void DEFAULT_HEADER_FOOTER_HEIGHT(int value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.DEFAULT_HEADER_FOOTER_HEIGHT = value; }

// public yarnwrap.client.gui.widget.SimplePositioningWidget header() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.header); }
// public void header(yarnwrap.client.gui.widget.SimplePositioningWidget value) { wrapperContained.header = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget header() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.header); }
// public static void header(yarnwrap.client.gui.widget.SimplePositioningWidget value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.header = value.wrapperContained; }

// public yarnwrap.client.gui.widget.SimplePositioningWidget footer() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.footer); }
// public void footer(yarnwrap.client.gui.widget.SimplePositioningWidget value) { wrapperContained.footer = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget footer() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.footer); }
// public static void footer(yarnwrap.client.gui.widget.SimplePositioningWidget value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.footer = value.wrapperContained; }

// public yarnwrap.client.gui.widget.SimplePositioningWidget body() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.body); }
// public void body(yarnwrap.client.gui.widget.SimplePositioningWidget value) { wrapperContained.body = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget body() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.body); }
// public static void body(yarnwrap.client.gui.widget.SimplePositioningWidget value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.body = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen screen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.screen); }
// public void screen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.screen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen screen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.screen); }
// public static void screen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.screen = value.wrapperContained; }

// public int headerHeight() { return wrapperContained.headerHeight; }
// public void headerHeight(int value) { wrapperContained.headerHeight = value; }
// public static int headerHeight() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.headerHeight; }
// public static void headerHeight(int value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.headerHeight = value; }

// public int footerHeight() { return wrapperContained.footerHeight; }
// public void footerHeight(int value) { wrapperContained.footerHeight = value; }
// public static int footerHeight() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.footerHeight; }
// public static void footerHeight(int value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.footerHeight = value; }

// public int FOOTER_MARGIN_TOP() { return wrapperContained.FOOTER_MARGIN_TOP; }
// public void FOOTER_MARGIN_TOP(int value) { wrapperContained.FOOTER_MARGIN_TOP = value; }
// public static int FOOTER_MARGIN_TOP() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.FOOTER_MARGIN_TOP; }
// public static void FOOTER_MARGIN_TOP(int value, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.FOOTER_MARGIN_TOP = value; }

public ThreePartsLayoutWidget(yarnwrap.client.gui.screen.Screen screen) { this.wrapperContained = new net.minecraft.client.gui.widget.ThreePartsLayoutWidget(screen.wrapperContained); }
public ThreePartsLayoutWidget(yarnwrap.client.gui.screen.Screen screen,int headerFooterHeight) { this.wrapperContained = new net.minecraft.client.gui.widget.ThreePartsLayoutWidget(screen.wrapperContained,headerFooterHeight); }
public ThreePartsLayoutWidget(yarnwrap.client.gui.screen.Screen screen,int headerHeight,int footerHeight) { this.wrapperContained = new net.minecraft.client.gui.widget.ThreePartsLayoutWidget(screen.wrapperContained,headerHeight,footerHeight); }
public void setFooterHeight(int footerHeight) { wrapperContained.setFooterHeight(footerHeight); }
// public static void setFooterHeight(int footerHeight, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.setFooterHeight(footerHeight); }
public yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addHeader(widget.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addHeader(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addHeader(widget.wrapperContained,callback)); }
// public static yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addHeader(widget.wrapperContained,callback)); }
public int getFooterHeight() { return wrapperContained.getFooterHeight(); }
// public static int getFooterHeight() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.getFooterHeight(); }
public void setHeaderHeight(int headerHeight) { wrapperContained.setHeaderHeight(headerHeight); }
// public static void setHeaderHeight(int headerHeight, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.setHeaderHeight(headerHeight); }
public yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addFooter(widget.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addFooter(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addFooter(widget.wrapperContained,callback)); }
// public static yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addFooter(widget.wrapperContained,callback)); }
public int getHeaderHeight() { return wrapperContained.getHeaderHeight(); }
// public static int getHeaderHeight() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.getHeaderHeight(); }
public yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addBody(widget.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addBody(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addBody(widget.wrapperContained,callback)); }
// public static yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addBody(widget.wrapperContained,callback)); }
public void addHeader(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { wrapperContained.addHeader(text.wrapperContained,textRenderer.wrapperContained); }
// public static void addHeader(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer, ) { net.minecraft.client.gui.widget.ThreePartsLayoutWidget.addHeader(text.wrapperContained,textRenderer.wrapperContained); }
public int getContentHeight() { return wrapperContained.getContentHeight(); }
// public static int getContentHeight() { return net.minecraft.client.gui.widget.ThreePartsLayoutWidget.getContentHeight(); }

}