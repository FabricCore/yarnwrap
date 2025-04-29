package yarnwrap.client.gui.navigation;
public class GuiNavigationType { public net.minecraft.client.gui.navigation.GuiNavigationType wrapperContained; public GuiNavigationType(net.minecraft.client.gui.navigation.GuiNavigationType wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isMouse() { return wrapperContained.isMouse(); }
// public static boolean isMouse() { return net.minecraft.client.gui.navigation.GuiNavigationType.isMouse(); }
public boolean isKeyboard() { return wrapperContained.isKeyboard(); }
// public static boolean isKeyboard() { return net.minecraft.client.gui.navigation.GuiNavigationType.isKeyboard(); }

}