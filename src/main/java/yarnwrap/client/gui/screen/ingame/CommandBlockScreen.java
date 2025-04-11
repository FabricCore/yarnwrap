package yarnwrap.client.gui.screen.ingame;
public class CommandBlockScreen { public net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained; public CommandBlockScreen(net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.CommandBlockBlockEntity blockEntity() { return new yarnwrap.block.entity.CommandBlockBlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.CommandBlockBlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget redstoneTriggerButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.redstoneTriggerButton); }
// public void redstoneTriggerButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.redstoneTriggerButton = value.wrapperContained; }
// public boolean autoActivate() { return wrapperContained.autoActivate; }
// public void autoActivate(boolean value) { wrapperContained.autoActivate = value; }
// public boolean conditional() { return wrapperContained.conditional; }
// public void conditional(boolean value) { wrapperContained.conditional = value; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget modeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.modeButton); }
// public void modeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.modeButton = value.wrapperContained; }
// public Object mode() { return wrapperContained.mode; }
// // public void mode(Object value) { wrapperContained.mode = value; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget conditionalModeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.conditionalModeButton); }
// public void conditionalModeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.conditionalModeButton = value.wrapperContained; }
public void updateCommandBlock() { wrapperContained.updateCommandBlock(); }
// public void setButtonsActive(boolean active) { wrapperContained.setButtonsActive(active); }

}