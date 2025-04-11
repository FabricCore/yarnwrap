package yarnwrap.client.gui.screen.option;
public class KeybindsScreen { public net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained; public KeybindsScreen(net.minecraft.client.gui.screen.option.KeybindsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.option.KeyBinding selectedKeyBinding() { return new yarnwrap.client.option.KeyBinding(wrapperContained.selectedKeyBinding); }
public void selectedKeyBinding(yarnwrap.client.option.KeyBinding value) { wrapperContained.selectedKeyBinding = value.wrapperContained; }
public long lastKeyCodeUpdateTime() { return wrapperContained.lastKeyCodeUpdateTime; }
public void lastKeyCodeUpdateTime(long value) { wrapperContained.lastKeyCodeUpdateTime = value; }
// public yarnwrap.client.gui.screen.option.ControlsListWidget controlsList() { return new yarnwrap.client.gui.screen.option.ControlsListWidget(wrapperContained.controlsList); }
// public void controlsList(yarnwrap.client.gui.screen.option.ControlsListWidget value) { wrapperContained.controlsList = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget resetAllButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.resetAllButton); }
// public void resetAllButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.resetAllButton = value.wrapperContained; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }

}