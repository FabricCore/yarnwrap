package yarnwrap.client.gui.screen.option;
public class KeybindsScreen { public net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained; public KeybindsScreen(net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.option.KeyBinding selectedKeyBinding() { return new yarnwrap.client.option.KeyBinding(wrapperContained.selectedKeyBinding); }
public void selectedKeyBinding(yarnwrap.client.option.KeyBinding value) { wrapperContained.selectedKeyBinding = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding selectedKeyBinding() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.gui.screen.option.KeybindsScreen.selectedKeyBinding); }
// public static void selectedKeyBinding(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.selectedKeyBinding = value.wrapperContained; }

public long lastKeyCodeUpdateTime() { return wrapperContained.lastKeyCodeUpdateTime; }
public void lastKeyCodeUpdateTime(long value) { wrapperContained.lastKeyCodeUpdateTime = value; }
// public static long lastKeyCodeUpdateTime() { return net.minecraft.client.gui.screen.option.KeybindsScreen.lastKeyCodeUpdateTime; }
// public static void lastKeyCodeUpdateTime(long value, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.lastKeyCodeUpdateTime = value; }

// public yarnwrap.client.gui.screen.option.ControlsListWidget controlsList() { return new yarnwrap.client.gui.screen.option.ControlsListWidget(wrapperContained.controlsList); }
// public void controlsList(yarnwrap.client.gui.screen.option.ControlsListWidget value) { wrapperContained.controlsList = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.option.ControlsListWidget controlsList() { return new yarnwrap.client.gui.screen.option.ControlsListWidget(net.minecraft.client.gui.screen.option.KeybindsScreen.controlsList); }
// public static void controlsList(yarnwrap.client.gui.screen.option.ControlsListWidget value, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.controlsList = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget resetAllButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.resetAllButton); }
// public void resetAllButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.resetAllButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget resetAllButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.option.KeybindsScreen.resetAllButton); }
// public static void resetAllButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.resetAllButton = value.wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.KeybindsScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.TITLE_TEXT = value.wrapperContained; }

public KeybindsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.KeybindsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public void method_57748(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57748(button.wrapperContained); }
// public static void method_57748(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.method_57748(button.wrapperContained); }
// public void method_60342(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_60342(button.wrapperContained); }
// public static void method_60342(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.KeybindsScreen.method_60342(button.wrapperContained); }

}