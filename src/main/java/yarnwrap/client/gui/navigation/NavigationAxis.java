package yarnwrap.client.gui.navigation;
public class NavigationAxis { public net.minecraft.client.gui.navigation.NavigationAxis wrapperContained; public NavigationAxis(net.minecraft.client.gui.navigation.NavigationAxis wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.navigation.NavigationAxis getOther() { return new yarnwrap.client.gui.navigation.NavigationAxis(wrapperContained.getOther()); }
// public static yarnwrap.client.gui.navigation.NavigationAxis getOther() { return new yarnwrap.client.gui.navigation.NavigationAxis(net.minecraft.client.gui.navigation.NavigationAxis.getOther()); }
public yarnwrap.client.gui.navigation.NavigationDirection getDirection(boolean positive) { return new yarnwrap.client.gui.navigation.NavigationDirection(wrapperContained.getDirection(positive)); }
// public static yarnwrap.client.gui.navigation.NavigationDirection getDirection(boolean positive, ) { return new yarnwrap.client.gui.navigation.NavigationDirection(net.minecraft.client.gui.navigation.NavigationAxis.getDirection(positive)); }
public yarnwrap.client.gui.navigation.NavigationDirection getPositiveDirection() { return new yarnwrap.client.gui.navigation.NavigationDirection(wrapperContained.getPositiveDirection()); }
// public static yarnwrap.client.gui.navigation.NavigationDirection getPositiveDirection() { return new yarnwrap.client.gui.navigation.NavigationDirection(net.minecraft.client.gui.navigation.NavigationAxis.getPositiveDirection()); }
public yarnwrap.client.gui.navigation.NavigationDirection getNegativeDirection() { return new yarnwrap.client.gui.navigation.NavigationDirection(wrapperContained.getNegativeDirection()); }
// public static yarnwrap.client.gui.navigation.NavigationDirection getNegativeDirection() { return new yarnwrap.client.gui.navigation.NavigationDirection(net.minecraft.client.gui.navigation.NavigationAxis.getNegativeDirection()); }

}