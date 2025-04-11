package yarnwrap.client.gui.navigation;
public class GuiNavigationType { public net.minecraft.client.gui.navigation.GuiNavigationType wrapperContained; public GuiNavigationType(net.minecraft.client.gui.navigation.GuiNavigationType wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isMouse() { return wrapperContained.isMouse(); }
public boolean isKeyboard() { return wrapperContained.isKeyboard(); }

}