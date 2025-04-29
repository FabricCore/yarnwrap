package yarnwrap.client.gui.navigation;
public class GuiNavigationPath { public net.minecraft.client.gui.navigation.GuiNavigationPath wrapperContained; public GuiNavigationPath(net.minecraft.client.gui.navigation.GuiNavigationPath wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.ParentElement element,yarnwrap.client.gui.navigation.GuiNavigationPath childPath) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.of(element.wrapperContained,childPath.wrapperContained)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.ParentElement element,yarnwrap.client.gui.navigation.GuiNavigationPath childPath, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.navigation.GuiNavigationPath.of(element.wrapperContained,childPath.wrapperContained)); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.Element leaf) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.of(leaf.wrapperContained)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.Element leaf, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.navigation.GuiNavigationPath.of(leaf.wrapperContained)); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.Element leaf,net.minecraft.client.gui.ParentElement[] elements) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.of(leaf.wrapperContained,elements)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath of(yarnwrap.client.gui.Element leaf,net.minecraft.client.gui.ParentElement[] elements, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.navigation.GuiNavigationPath.of(leaf.wrapperContained,elements)); }
public void setFocused(boolean focused) { wrapperContained.setFocused(focused); }
// public static void setFocused(boolean focused, ) { net.minecraft.client.gui.navigation.GuiNavigationPath.setFocused(focused); }

}