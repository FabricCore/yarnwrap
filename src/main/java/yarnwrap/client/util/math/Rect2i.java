package yarnwrap.client.util.math;
public class Rect2i { public net.minecraft.client.util.math.Rect2i wrapperContained; public Rect2i(net.minecraft.client.util.math.Rect2i wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.util.math.Rect2i.height; }
// public static void height(int value, ) { net.minecraft.client.util.math.Rect2i.height = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.util.math.Rect2i.width; }
// public static void width(int value, ) { net.minecraft.client.util.math.Rect2i.width = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.util.math.Rect2i.y; }
// public static void y(int value, ) { net.minecraft.client.util.math.Rect2i.y = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.util.math.Rect2i.x; }
// public static void x(int value, ) { net.minecraft.client.util.math.Rect2i.x = value; }

public Rect2i(int x,int y,int width,int height) { this.wrapperContained = new net.minecraft.client.util.math.Rect2i(x,y,width,height); }
public boolean contains(int x,int y) { return wrapperContained.contains(x,y); }
// public static boolean contains(int x,int y, ) { return net.minecraft.client.util.math.Rect2i.contains(x,y); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.util.math.Rect2i.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.util.math.Rect2i.getHeight(); }
public int getX() { return wrapperContained.getX(); }
// public static int getX() { return net.minecraft.client.util.math.Rect2i.getX(); }
public int getY() { return wrapperContained.getY(); }
// public static int getY() { return net.minecraft.client.util.math.Rect2i.getY(); }
public void setX(int x) { wrapperContained.setX(x); }
// public static void setX(int x, ) { net.minecraft.client.util.math.Rect2i.setX(x); }
public void setStartPos(int x,int y) { wrapperContained.setStartPos(x,y); }
// public static void setStartPos(int x,int y, ) { net.minecraft.client.util.math.Rect2i.setStartPos(x,y); }
public yarnwrap.client.util.math.Rect2i intersection(yarnwrap.client.util.math.Rect2i rect) { return new yarnwrap.client.util.math.Rect2i(wrapperContained.intersection(rect.wrapperContained)); }
// public static yarnwrap.client.util.math.Rect2i intersection(yarnwrap.client.util.math.Rect2i rect, ) { return new yarnwrap.client.util.math.Rect2i(net.minecraft.client.util.math.Rect2i.intersection(rect.wrapperContained)); }
public void setY(int y) { wrapperContained.setY(y); }
// public static void setY(int y, ) { net.minecraft.client.util.math.Rect2i.setY(y); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
// public static void setWidth(int width, ) { net.minecraft.client.util.math.Rect2i.setWidth(width); }
public void setHeight(int height) { wrapperContained.setHeight(height); }
// public static void setHeight(int height, ) { net.minecraft.client.util.math.Rect2i.setHeight(height); }

}