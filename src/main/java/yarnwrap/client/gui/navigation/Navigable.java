package yarnwrap.client.gui.navigation;
public class Navigable { public net.minecraft.client.gui.navigation.Navigable wrapperContained; public Navigable(net.minecraft.client.gui.navigation.Navigable wrapperContained) { this.wrapperContained = wrapperContained; }

public int getNavigationOrder() { return wrapperContained.getNavigationOrder(); }
// public static int getNavigationOrder() { return net.minecraft.client.gui.navigation.Navigable.getNavigationOrder(); }

}