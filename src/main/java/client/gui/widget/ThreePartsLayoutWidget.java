package yarnwrap.client.gui.widget;
public class ThreePartsLayoutWidget { public net.minecraft.client.gui.widget.ThreePartsLayoutWidget wrapperContained; public ThreePartsLayoutWidget(net.minecraft.client.gui.widget.ThreePartsLayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_HEADER_FOOTER_HEIGHT() { return wrapperContained.DEFAULT_HEADER_FOOTER_HEIGHT; }
// public yarnwrap.client.gui.widget.SimplePositioningWidget header() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.header); }
// public yarnwrap.client.gui.widget.SimplePositioningWidget footer() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.footer); }
// public yarnwrap.client.gui.widget.SimplePositioningWidget body() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.body); }
// public yarnwrap.client.gui.screen.Screen screen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.screen); }
// public int headerHeight() { return wrapperContained.headerHeight; }
// public int footerHeight() { return wrapperContained.footerHeight; }
// public int FOOTER_MARGIN_TOP() { return wrapperContained.FOOTER_MARGIN_TOP; }
public void setFooterHeight(int footerHeight) { wrapperContained.setFooterHeight(footerHeight); }
public yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addHeader(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addHeader(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addHeader(widget.wrapperContained,callback)); }
public int getFooterHeight() { return wrapperContained.getFooterHeight(); }
public void setHeaderHeight(int headerHeight) { wrapperContained.setHeaderHeight(headerHeight); }
public yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addFooter(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addFooter(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addFooter(widget.wrapperContained,callback)); }
public int getHeaderHeight() { return wrapperContained.getHeaderHeight(); }
public yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addBody(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget addBody(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.addBody(widget.wrapperContained,callback)); }
public void addHeader(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { wrapperContained.addHeader(text.wrapperContained,textRenderer.wrapperContained); }
public int getContentHeight() { return wrapperContained.getContentHeight(); }

}