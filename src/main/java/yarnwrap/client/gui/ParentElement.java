package yarnwrap.client.gui;
public class ParentElement { public net.minecraft.client.gui.ParentElement wrapperContained; public ParentElement(net.minecraft.client.gui.ParentElement wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional hoveredElement(double mouseX,double mouseY) { return wrapperContained.hoveredElement(mouseX,mouseY); }
// public static java.util.Optional hoveredElement(double mouseX,double mouseY, ) { return net.minecraft.client.gui.ParentElement.hoveredElement(mouseX,mouseY); }
// public boolean method_20082(double element) { return wrapperContained.method_20082(element); }
// public static boolean method_20082(double element, ) { return net.minecraft.client.gui.ParentElement.method_20082(element); }
// public boolean method_20083(double element) { return wrapperContained.method_20083(element); }
// public static boolean method_20083(double element, ) { return net.minecraft.client.gui.ParentElement.method_20083(element); }
public void setFocused(yarnwrap.client.gui.Element focused) { wrapperContained.setFocused(focused.wrapperContained); }
// public static void setFocused(yarnwrap.client.gui.Element focused, ) { net.minecraft.client.gui.ParentElement.setFocused(focused.wrapperContained); }
public java.util.List children() { return wrapperContained.children(); }
// public static java.util.List children() { return net.minecraft.client.gui.ParentElement.children(); }
public boolean isDragging() { return wrapperContained.isDragging(); }
// public static boolean isDragging() { return net.minecraft.client.gui.ParentElement.isDragging(); }
public void setDragging(boolean dragging) { wrapperContained.setDragging(dragging); }
// public static void setDragging(boolean dragging, ) { net.minecraft.client.gui.ParentElement.setDragging(dragging); }
public yarnwrap.client.gui.Element getFocused() { return new yarnwrap.client.gui.Element(wrapperContained.getFocused()); }
// public static yarnwrap.client.gui.Element getFocused() { return new yarnwrap.client.gui.Element(net.minecraft.client.gui.ParentElement.getFocused()); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeNavigationPath(navigation)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.ParentElement.computeNavigationPath(navigation)); }
// // public yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeNavigationPath(navigation)); }
// // public static yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.ParentElement.computeNavigationPath(navigation)); }
// public java.lang.Integer method_48216(yarnwrap.client.gui.navigation.NavigationDirection element) { return wrapperContained.method_48216(element.wrapperContained); }
// public static java.lang.Integer method_48216(yarnwrap.client.gui.navigation.NavigationDirection element, ) { return net.minecraft.client.gui.ParentElement.method_48216(element.wrapperContained); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath computeChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.ParentElement.computeChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }
// public java.lang.Integer method_48219(yarnwrap.client.gui.navigation.NavigationDirection element) { return wrapperContained.method_48219(element.wrapperContained); }
// public static java.lang.Integer method_48219(yarnwrap.client.gui.navigation.NavigationDirection element, ) { return net.minecraft.client.gui.ParentElement.method_48219(element.wrapperContained); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeInitialChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeInitialChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }
// public static yarnwrap.client.gui.navigation.GuiNavigationPath computeInitialChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation, ) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(net.minecraft.client.gui.ParentElement.computeInitialChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }

}