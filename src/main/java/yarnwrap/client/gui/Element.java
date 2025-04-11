package yarnwrap.client.gui;
public class Element { public net.minecraft.client.gui.Element wrapperContained; public Element(net.minecraft.client.gui.Element wrapperContained) { this.wrapperContained = wrapperContained; }

public long MAX_DOUBLE_CLICK_INTERVAL() { return wrapperContained.MAX_DOUBLE_CLICK_INTERVAL; }
// public void MAX_DOUBLE_CLICK_INTERVAL(long value) { wrapperContained.MAX_DOUBLE_CLICK_INTERVAL = value; }
public void mouseMoved(double mouseX,double mouseY) { wrapperContained.mouseMoved(mouseX,mouseY); }
public boolean keyReleased(int keyCode,int scanCode,int modifiers) { return wrapperContained.keyReleased(keyCode,scanCode,modifiers); }
public void setFocused(boolean focused) { wrapperContained.setFocused(focused); }
public boolean isFocused() { return wrapperContained.isFocused(); }
public boolean charTyped(char chr,int modifiers) { return wrapperContained.charTyped(chr,modifiers); }
public boolean mouseScrolled(double mouseX,double mouseY,double horizontalAmount,double verticalAmount) { return wrapperContained.mouseScrolled(mouseX,mouseY,horizontalAmount,verticalAmount); }
public boolean mouseClicked(double mouseX,double mouseY,int button) { return wrapperContained.mouseClicked(mouseX,mouseY,button); }
public boolean mouseDragged(double mouseX,double mouseY,int button,double deltaX,double deltaY) { return wrapperContained.mouseDragged(mouseX,mouseY,button,deltaX,deltaY); }
public boolean keyPressed(int keyCode,int scanCode,int modifiers) { return wrapperContained.keyPressed(keyCode,scanCode,modifiers); }
public boolean isMouseOver(double mouseX,double mouseY) { return wrapperContained.isMouseOver(mouseX,mouseY); }
public boolean mouseReleased(double mouseX,double mouseY,int button) { return wrapperContained.mouseReleased(mouseX,mouseY,button); }
public yarnwrap.client.gui.ScreenRect getNavigationFocus() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.getNavigationFocus()); }
public yarnwrap.client.gui.navigation.GuiNavigationPath getNavigationPath(yarnwrap.client.gui.navigation.GuiNavigation navigation) { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.getNavigationPath(navigation.wrapperContained)); }
public yarnwrap.client.gui.navigation.GuiNavigationPath getFocusedPath() { return new yarnwrap.client.gui.navigation.GuiNavigationPath(wrapperContained.getFocusedPath()); }

}