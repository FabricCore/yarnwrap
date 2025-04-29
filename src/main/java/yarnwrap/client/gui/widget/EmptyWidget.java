package yarnwrap.client.gui.widget;
public class EmptyWidget { public net.minecraft.client.gui.widget.EmptyWidget wrapperContained; public EmptyWidget(net.minecraft.client.gui.widget.EmptyWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.gui.widget.EmptyWidget.x; }
// public static void x(int value, ) { net.minecraft.client.gui.widget.EmptyWidget.x = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.gui.widget.EmptyWidget.y; }
// public static void y(int value, ) { net.minecraft.client.gui.widget.EmptyWidget.y = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.gui.widget.EmptyWidget.width; }
// public static void width(int value, ) { net.minecraft.client.gui.widget.EmptyWidget.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.gui.widget.EmptyWidget.height; }
// public static void height(int value, ) { net.minecraft.client.gui.widget.EmptyWidget.height = value; }

public EmptyWidget(int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.EmptyWidget(width,height); }
public EmptyWidget(int x,int y,int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.EmptyWidget(x,y,width,height); }
// public yarnwrap.client.gui.widget.EmptyWidget ofWidth(int width) { return new yarnwrap.client.gui.widget.EmptyWidget(wrapperContained.ofWidth(width)); }
// public static yarnwrap.client.gui.widget.EmptyWidget ofWidth(int width, ) { return new yarnwrap.client.gui.widget.EmptyWidget(net.minecraft.client.gui.widget.EmptyWidget.ofWidth(width)); }
// public yarnwrap.client.gui.widget.EmptyWidget ofHeight(int height) { return new yarnwrap.client.gui.widget.EmptyWidget(wrapperContained.ofHeight(height)); }
// public static yarnwrap.client.gui.widget.EmptyWidget ofHeight(int height, ) { return new yarnwrap.client.gui.widget.EmptyWidget(net.minecraft.client.gui.widget.EmptyWidget.ofHeight(height)); }

}