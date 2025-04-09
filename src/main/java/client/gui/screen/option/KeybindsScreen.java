package yarnwrap.client.gui.screen.option;
public class KeybindsScreen { public net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained; public KeybindsScreen(net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.option.KeyBinding selectedKeyBinding() { return new yarnwrap.client.option.KeyBinding(wrapperContained.selectedKeyBinding); }
public long lastKeyCodeUpdateTime() { return wrapperContained.lastKeyCodeUpdateTime; }
// public yarnwrap.client.gui.screen.option.ControlsListWidget controlsList() { return new yarnwrap.client.gui.screen.option.ControlsListWidget(wrapperContained.controlsList); }
// public yarnwrap.client.gui.widget.ButtonWidget resetAllButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.resetAllButton); }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }

}