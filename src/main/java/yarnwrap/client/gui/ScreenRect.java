package yarnwrap.client.gui;
public class ScreenRect { public net.minecraft.client.gui.ScreenRect wrapperContained; public ScreenRect(net.minecraft.client.gui.ScreenRect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.ScreenRect EMPTY() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.ScreenRect value) { wrapperContained.EMPTY = value.wrapperContained; }
public ScreenRect(int sameAxis,int otherAxis,int width,int height) { this.wrapperContained = new net.minecraft.client.gui.ScreenRect(sameAxis,otherAxis,width,height); }
public yarnwrap.client.gui.ScreenRect empty() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.empty()); }
public int getLength(yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.getLength(axis.wrapperContained); }
public yarnwrap.client.gui.ScreenRect of(yarnwrap.client.gui.navigation.NavigationAxis axis,int sameAxisCoord,int otherAxisCoord,int sameAxisLength,int otherAxisLength) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.of(axis.wrapperContained,sameAxisCoord,otherAxisCoord,sameAxisLength,otherAxisLength)); }
public yarnwrap.client.gui.ScreenRect add(yarnwrap.client.gui.navigation.NavigationDirection direction) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.add(direction.wrapperContained)); }
public boolean overlaps(yarnwrap.client.gui.ScreenRect other) { return wrapperContained.overlaps(other.wrapperContained); }
public boolean overlaps(yarnwrap.client.gui.ScreenRect other,yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.overlaps(other.wrapperContained,axis.wrapperContained); }
public int getCenter(yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.getCenter(axis.wrapperContained); }
public int getBoundingCoordinate(yarnwrap.client.gui.navigation.NavigationDirection direction) { return wrapperContained.getBoundingCoordinate(direction.wrapperContained); }
public yarnwrap.client.gui.ScreenRect getBorder(yarnwrap.client.gui.navigation.NavigationDirection direction) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.getBorder(direction.wrapperContained)); }
public int getTop() { return wrapperContained.getTop(); }
public int getBottom() { return wrapperContained.getBottom(); }
public int getLeft() { return wrapperContained.getLeft(); }
public int getRight() { return wrapperContained.getRight(); }
public yarnwrap.client.gui.ScreenRect intersection(yarnwrap.client.gui.ScreenRect other) { return new yarnwrap.client.gui.ScreenRect(wrapperContained.intersection(other.wrapperContained)); }
public boolean contains(int x,int y) { return wrapperContained.contains(x,y); }

}