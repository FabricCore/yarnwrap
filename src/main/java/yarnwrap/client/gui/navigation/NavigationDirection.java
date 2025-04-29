package yarnwrap.client.gui.navigation;
public class NavigationDirection { public net.minecraft.client.gui.navigation.NavigationDirection wrapperContained; public NavigationDirection(net.minecraft.client.gui.navigation.NavigationDirection wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntComparator comparator() { return wrapperContained.comparator; }
// public void comparator(it.unimi.dsi.fastutil.ints.IntComparator value) { wrapperContained.comparator = value; }
// public static it.unimi.dsi.fastutil.ints.IntComparator comparator() { return net.minecraft.client.gui.navigation.NavigationDirection.comparator; }
// public static void comparator(it.unimi.dsi.fastutil.ints.IntComparator value, ) { net.minecraft.client.gui.navigation.NavigationDirection.comparator = value; }

public yarnwrap.client.gui.navigation.NavigationAxis getAxis() { return new yarnwrap.client.gui.navigation.NavigationAxis(wrapperContained.getAxis()); }
// public static yarnwrap.client.gui.navigation.NavigationAxis getAxis() { return new yarnwrap.client.gui.navigation.NavigationAxis(net.minecraft.client.gui.navigation.NavigationDirection.getAxis()); }
public boolean isAfter(int a,int b) { return wrapperContained.isAfter(a,b); }
// public static boolean isAfter(int a,int b, ) { return net.minecraft.client.gui.navigation.NavigationDirection.isAfter(a,b); }
public yarnwrap.client.gui.navigation.NavigationDirection getOpposite() { return new yarnwrap.client.gui.navigation.NavigationDirection(wrapperContained.getOpposite()); }
// public static yarnwrap.client.gui.navigation.NavigationDirection getOpposite() { return new yarnwrap.client.gui.navigation.NavigationDirection(net.minecraft.client.gui.navigation.NavigationDirection.getOpposite()); }
public boolean isBefore(int a,int b) { return wrapperContained.isBefore(a,b); }
// public static boolean isBefore(int a,int b, ) { return net.minecraft.client.gui.navigation.NavigationDirection.isBefore(a,b); }
public boolean isPositive() { return wrapperContained.isPositive(); }
// public static boolean isPositive() { return net.minecraft.client.gui.navigation.NavigationDirection.isPositive(); }
// public int method_48242(int a,int b) { return wrapperContained.method_48242(a,b); }
// public static int method_48242(int a,int b, ) { return net.minecraft.client.gui.navigation.NavigationDirection.method_48242(a,b); }
public it.unimi.dsi.fastutil.ints.IntComparator getComparator() { return wrapperContained.getComparator(); }
// public static it.unimi.dsi.fastutil.ints.IntComparator getComparator() { return net.minecraft.client.gui.navigation.NavigationDirection.getComparator(); }

}