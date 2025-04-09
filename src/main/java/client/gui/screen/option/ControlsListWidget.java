package yarnwrap.client.gui.screen.option;
public class ControlsListWidget { public net.minecraft.client.gui.screen.option.ControlsListWidget wrapperContained; public ControlsListWidget(net.minecraft.client.gui.screen.option.ControlsListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxKeyNameLength() { return wrapperContained.maxKeyNameLength; }
// public yarnwrap.client.gui.screen.option.KeybindsScreen parent() { return new yarnwrap.client.gui.screen.option.KeybindsScreen(wrapperContained.parent); }
public void update() { wrapperContained.update(); }
public void updateChildren() { wrapperContained.updateChildren(); }

}