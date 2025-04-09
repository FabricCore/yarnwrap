package yarnwrap.client.gui.screen.ingame;
public class CommandBlockScreen { public net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained; public CommandBlockScreen(net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.CommandBlockBlockEntity blockEntity() { return new yarnwrap.block.entity.CommandBlockBlockEntity(wrapperContained.blockEntity); }
// public yarnwrap.client.gui.widget.CyclingButtonWidget redstoneTriggerButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.redstoneTriggerButton); }
// public boolean autoActivate() { return wrapperContained.autoActivate; }
// public boolean conditional() { return wrapperContained.conditional; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget modeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.modeButton); }
// public Object mode() { return wrapperContained.mode; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget conditionalModeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.conditionalModeButton); }
public void updateCommandBlock() { wrapperContained.updateCommandBlock(); }
// public void setButtonsActive(boolean active) { wrapperContained.setButtonsActive(active); }

}