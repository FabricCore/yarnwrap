package yarnwrap.client.gui;
public class ScreenRect { public net.minecraft.client.gui.ScreenRect wrapperContained; public ScreenRect(net.minecraft.client.gui.ScreenRect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.ScreenRect EMPTY() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.ScreenRect value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.client.gui.ScreenRect EMPTY() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.EMPTY); }
// public static void EMPTY(yarnwrap.client.gui.ScreenRect value, ) { net.minecraft.client.gui.ScreenRect.EMPTY = value.wrapperContained; }

public ScreenRect(int sameAxis,int otherAxis,int width,int height) { this.wrapperContained = new net.minecraft.client.gui.ScreenRect(sameAxis,otherAxis,width,height); }
// public yarnwrap.client.gui.ScreenRect empty() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.empty()); }
public static yarnwrap.client.gui.ScreenRect empty() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.empty()); }
public int getLength(yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.getLength(axis.wrapperContained); }
// public static int getLength(yarnwrap.client.gui.navigation.NavigationAxis axis, ) { return net.minecraft.client.gui.ScreenRect.getLength(axis.wrapperContained); }
// public yarnwrap.client.gui.ScreenRect of(yarnwrap.client.gui.navigation.NavigationAxis axis,int sameAxisCoord,int otherAxisCoord,int sameAxisLength,int otherAxisLength) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.of(axis.wrapperContained,sameAxisCoord,otherAxisCoord,sameAxisLength,otherAxisLength)); }
// public static yarnwrap.client.gui.ScreenRect of(yarnwrap.client.gui.navigation.NavigationAxis axis,int sameAxisCoord,int otherAxisCoord,int sameAxisLength,int otherAxisLength, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.of(axis.wrapperContained,sameAxisCoord,otherAxisCoord,sameAxisLength,otherAxisLength)); }
public yarnwrap.client.gui.ScreenRect add(yarnwrap.client.gui.navigation.NavigationDirection direction) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.add(direction.wrapperContained)); }
// public static yarnwrap.client.gui.ScreenRect add(yarnwrap.client.gui.navigation.NavigationDirection direction, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.add(direction.wrapperContained)); }
public boolean overlaps(yarnwrap.client.gui.ScreenRect other) { return wrapperContained.overlaps(other.wrapperContained); }
// public static boolean overlaps(yarnwrap.client.gui.ScreenRect other, ) { return net.minecraft.client.gui.ScreenRect.overlaps(other.wrapperContained); }
public boolean overlaps(yarnwrap.client.gui.ScreenRect other,yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.overlaps(other.wrapperContained,axis.wrapperContained); }
// public static boolean overlaps(yarnwrap.client.gui.ScreenRect other,yarnwrap.client.gui.navigation.NavigationAxis axis, ) { return net.minecraft.client.gui.ScreenRect.overlaps(other.wrapperContained,axis.wrapperContained); }
public int getCenter(yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.getCenter(axis.wrapperContained); }
// public static int getCenter(yarnwrap.client.gui.navigation.NavigationAxis axis, ) { return net.minecraft.client.gui.ScreenRect.getCenter(axis.wrapperContained); }
public int getBoundingCoordinate(yarnwrap.client.gui.navigation.NavigationDirection direction) { return wrapperContained.getBoundingCoordinate(direction.wrapperContained); }
// public static int getBoundingCoordinate(yarnwrap.client.gui.navigation.NavigationDirection direction, ) { return net.minecraft.client.gui.ScreenRect.getBoundingCoordinate(direction.wrapperContained); }
public yarnwrap.client.gui.ScreenRect getBorder(yarnwrap.client.gui.navigation.NavigationDirection direction) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.getBorder(direction.wrapperContained)); }
// public static yarnwrap.client.gui.ScreenRect getBorder(yarnwrap.client.gui.navigation.NavigationDirection direction, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.getBorder(direction.wrapperContained)); }
public int getTop() { return wrapperContained.getTop(); }
// public static int getTop() { return net.minecraft.client.gui.ScreenRect.getTop(); }
public int getBottom() { return wrapperContained.getBottom(); }
// public static int getBottom() { return net.minecraft.client.gui.ScreenRect.getBottom(); }
public int getLeft() { return wrapperContained.getLeft(); }
// public static int getLeft() { return net.minecraft.client.gui.ScreenRect.getLeft(); }
public int getRight() { return wrapperContained.getRight(); }
// public static int getRight() { return net.minecraft.client.gui.ScreenRect.getRight(); }
public yarnwrap.client.gui.ScreenRect intersection(yarnwrap.client.gui.ScreenRect other) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.intersection(other.wrapperContained)); }
// public static yarnwrap.client.gui.ScreenRect intersection(yarnwrap.client.gui.ScreenRect other, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.intersection(other.wrapperContained)); }
public boolean contains(int x,int y) { return wrapperContained.contains(x,y); }
// public static boolean contains(int x,int y, ) { return net.minecraft.client.gui.ScreenRect.contains(x,y); }
// public yarnwrap.client.gui.ScreenRect transform(org.joml.Matrix3x2f transformation) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.transform(transformation)); }
// public static yarnwrap.client.gui.ScreenRect transform(org.joml.Matrix3x2f transformation, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.transform(transformation)); }
// public yarnwrap.client.gui.ScreenRect transformEachVertex(org.joml.Matrix3x2f transformation) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.transformEachVertex(transformation)); }
// public static yarnwrap.client.gui.ScreenRect transformEachVertex(org.joml.Matrix3x2f transformation, ) { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.ScreenRect.transformEachVertex(transformation)); }
// public boolean intersects(yarnwrap.client.gui.ScreenRect other) { return wrapperContained.intersects(other.wrapperContained); }
// public static boolean intersects(yarnwrap.client.gui.ScreenRect other, ) { return net.minecraft.client.gui.ScreenRect.intersects(other.wrapperContained); }
// public boolean contains(yarnwrap.client.gui.ScreenRect other) { return wrapperContained.contains(other.wrapperContained); }
// public static boolean contains(yarnwrap.client.gui.ScreenRect other, ) { return net.minecraft.client.gui.ScreenRect.contains(other.wrapperContained); }

}