package yarnwrap.client.gui.widget;
public class Widget { public net.minecraft.client.gui.widget.Widget wrapperContained; public Widget(net.minecraft.client.gui.widget.Widget wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight() { return wrapperContained.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
public void setY(int y) { wrapperContained.setY(y); }
public void setX(int x) { wrapperContained.setX(x); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public yarnwrap.client.gui.ScreenRect getNavigationFocus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.getNavigationFocus()); }
public void forEachChild(java.util.function.Consumer consumer) { wrapperContained.forEachChild(consumer); }
public void setPosition(int x,int y) { wrapperContained.setPosition(x,y); }

}