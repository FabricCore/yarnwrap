package yarnwrap.client.util.math;
public class Rect2i { public net.minecraft.client.util.math.Rect2i wrapperContained; public Rect2i(net.minecraft.client.util.math.Rect2i wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
public boolean contains(int x,int y) { return wrapperContained.contains(x,y); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public void setX(int x) { wrapperContained.setX(x); }
public void setStartPos(int x,int y) { wrapperContained.setStartPos(x,y); }
public yarnwrap.client.util.math.Rect2i intersection(yarnwrap.client.util.math.Rect2i rect) { return new yarnwrap.client.util.math.Rect2i(wrapperContained.intersection(rect.wrapperContained)); }
public void setY(int y) { wrapperContained.setY(y); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
public void setHeight(int height) { wrapperContained.setHeight(height); }

}