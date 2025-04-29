package yarnwrap.client.gui.widget;
public class Widget { public net.minecraft.client.gui.widget.Widget wrapperContained; public Widget(net.minecraft.client.gui.widget.Widget wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.gui.widget.Widget.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.gui.widget.Widget.getWidth(); }
public void setY(int y) { wrapperContained.setY(y); }
// public static void setY(int y, ) { net.minecraft.client.gui.widget.Widget.setY(y); }
public void setX(int x) { wrapperContained.setX(x); }
// public static void setX(int x, ) { net.minecraft.client.gui.widget.Widget.setX(x); }
public int getX() { return wrapperContained.getX(); }
// public static int getX() { return net.minecraft.client.gui.widget.Widget.getX(); }
public int getY() { return wrapperContained.getY(); }
// public static int getY() { return net.minecraft.client.gui.widget.Widget.getY(); }
public yarnwrap.client.gui.ScreenRect getNavigationFocus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.getNavigationFocus()); }
// public static yarnwrap.client.gui.ScreenRect getNavigationFocus() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.widget.Widget.getNavigationFocus()); }
public void forEachChild(java.util.function.Consumer consumer) { wrapperContained.forEachChild(consumer); }
// public static void forEachChild(java.util.function.Consumer consumer, ) { net.minecraft.client.gui.widget.Widget.forEachChild(consumer); }
public void setPosition(int x,int y) { wrapperContained.setPosition(x,y); }
// public static void setPosition(int x,int y, ) { net.minecraft.client.gui.widget.Widget.setPosition(x,y); }

}