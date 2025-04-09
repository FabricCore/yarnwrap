package yarnwrap.client.gui.screen.ingame;
public class AbstractCommandBlockScreen { public net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained; public AbstractCommandBlockScreen(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ChatInputSuggestor commandSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.commandSuggestor); }
// public yarnwrap.text.Text SET_COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.SET_COMMAND_TEXT); }
// public yarnwrap.text.Text COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.COMMAND_TEXT); }
// public yarnwrap.text.Text PREVIOUS_OUTPUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREVIOUS_OUTPUT_TEXT); }
// public yarnwrap.client.gui.widget.TextFieldWidget consoleCommandTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.consoleCommandTextField); }
// public yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.cancelButton); }
// public yarnwrap.client.gui.widget.TextFieldWidget previousOutputTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.previousOutputTextField); }
// public yarnwrap.client.gui.widget.CyclingButtonWidget toggleTrackingOutputButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.toggleTrackingOutputButton); }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
// public void syncSettingsToServer(yarnwrap.world.CommandBlockExecutor commandExecutor) { wrapperContained.syncSettingsToServer(commandExecutor.wrapperContained); }
// public void commitAndClose() { wrapperContained.commitAndClose(); }
// public void onCommandChanged(java.lang.String text) { wrapperContained.onCommandChanged(text); }
// public int getTrackOutputButtonHeight() { return wrapperContained.getTrackOutputButtonHeight(); }
// public void setPreviousOutputText(boolean trackOutput) { wrapperContained.setPreviousOutputText(trackOutput); }

}