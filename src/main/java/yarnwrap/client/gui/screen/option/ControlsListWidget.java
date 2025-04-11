package yarnwrap.client.gui.screen.option;
public class ControlsListWidget { public net.minecraft.client.gui.screen.option.ControlsListWidget wrapperContained; public ControlsListWidget(net.minecraft.client.gui.screen.option.ControlsListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxKeyNameLength() { return wrapperContained.maxKeyNameLength; }
// public void maxKeyNameLength(int value) { wrapperContained.maxKeyNameLength = value; }
// public yarnwrap.client.gui.screen.option.KeybindsScreen parent() { return new yarnwrap.client.gui.screen.option.KeybindsScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.option.KeybindsScreen value) { wrapperContained.parent = value.wrapperContained; }
public void update() { wrapperContained.update(); }
public void updateChildren() { wrapperContained.updateChildren(); }

}