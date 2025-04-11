package yarnwrap.client.gui;
public class ParentElement { public net.minecraft.client.gui.ParentElement wrapperContained; public ParentElement(net.minecraft.client.gui.ParentElement wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional hoveredElement(double mouseX,double mouseY) { return wrapperContained.hoveredElement(mouseX,mouseY); }
public void setFocused(yarnwrap.client.gui.Element focused) { wrapperContained.setFocused(focused.wrapperContained); }
public java.util.List children() { return wrapperContained.children(); }
public boolean isDragging() { return wrapperContained.isDragging(); }
public void setDragging(boolean dragging) { wrapperContained.setDragging(dragging); }
public yarnwrap.client.gui.Element getFocused() { return new yarnwrap.client.gui.Element(wrapperContained.getFocused()); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeNavigationPath(navigation)); }
// // public yarnwrap.client.gui.navigation.GuiNavigationPath computeNavigationPath(Object navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeNavigationPath(navigation)); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }
// public yarnwrap.client.gui.navigation.GuiNavigationPath computeInitialChildPath(yarnwrap.client.gui.ScreenRect focus,yarnwrap.client.gui.navigation.NavigationDirection direction,yarnwrap.client.gui.Element focused,yarnwrap.client.gui.navigation.GuiNavigation navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.computeInitialChildPath(focus.wrapperContained,direction.wrapperContained,focused.wrapperContained,navigation.wrapperContained)); }

}