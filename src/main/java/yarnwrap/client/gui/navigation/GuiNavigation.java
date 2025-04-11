package yarnwrap.client.gui.navigation;
public class GuiNavigation { public net.minecraft.client.gui.navigation.GuiNavigation wrapperContained; public GuiNavigation(net.minecraft.client.gui.navigation.GuiNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.navigation.NavigationDirection getDirection() { return new yarnwrap.client.gui.navigation.NavigationDirection(wrapperContained.getDirection()); }

}