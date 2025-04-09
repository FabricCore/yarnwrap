package yarnwrap.client.gui;
public class ScreenPos { public net.minecraft.client.gui.ScreenPos wrapperContained; public ScreenPos(net.minecraft.client.gui.ScreenPos wrapperContained) { this.wrapperContained = wrapperContained; }

public int getComponent(yarnwrap.client.gui.navigation.NavigationAxis axis) { return wrapperContained.getComponent(axis.wrapperContained); }
public yarnwrap.client.gui.ScreenPos of(yarnwrap.client.gui.navigation.NavigationAxis axis,int sameAxis,int otherAxis) { return new yarnwrap.client.gui.ScreenPos(wrapperContained.of(axis.wrapperContained,sameAxis,otherAxis)); }
public yarnwrap.client.gui.ScreenPos add(yarnwrap.client.gui.navigation.NavigationDirection direction) { return new yarnwrap.client.gui.ScreenPos(wrapperContained.add(direction.wrapperContained)); }

}