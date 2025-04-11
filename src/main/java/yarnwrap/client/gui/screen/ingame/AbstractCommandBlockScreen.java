package yarnwrap.client.gui.screen.ingame;
public class AbstractCommandBlockScreen { public net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained; public AbstractCommandBlockScreen(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ChatInputSuggestor commandSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.commandSuggestor); }
// public void commandSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value) { wrapperContained.commandSuggestor = value.wrapperContained; }
// public yarnwrap.text.Text SET_COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.SET_COMMAND_TEXT); }
// public void SET_COMMAND_TEXT(yarnwrap.text.Text value) { wrapperContained.SET_COMMAND_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.COMMAND_TEXT); }
// public void COMMAND_TEXT(yarnwrap.text.Text value) { wrapperContained.COMMAND_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text PREVIOUS_OUTPUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREVIOUS_OUTPUT_TEXT); }
// public void PREVIOUS_OUTPUT_TEXT(yarnwrap.text.Text value) { wrapperContained.PREVIOUS_OUTPUT_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget consoleCommandTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.consoleCommandTextField); }
// public void consoleCommandTextField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.consoleCommandTextField = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.cancelButton); }
// public void cancelButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.cancelButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget previousOutputTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.previousOutputTextField); }
// public void previousOutputTextField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.previousOutputTextField = value.wrapperContained; }
// public yarnwrap.client.gui.widget.CyclingButtonWidget toggleTrackingOutputButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.toggleTrackingOutputButton); }
// public void toggleTrackingOutputButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.toggleTrackingOutputButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public void doneButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.doneButton = value.wrapperContained; }
// public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
// public void syncSettingsToServer(yarnwrap.world.CommandBlockExecutor commandExecutor) { wrapperContained.syncSettingsToServer(commandExecutor.wrapperContained); }
// public void commitAndClose() { wrapperContained.commitAndClose(); }
// public void onCommandChanged(java.lang.String text) { wrapperContained.onCommandChanged(text); }
// public int getTrackOutputButtonHeight() { return wrapperContained.getTrackOutputButtonHeight(); }
// public void setPreviousOutputText(boolean trackOutput) { wrapperContained.setPreviousOutputText(trackOutput); }

}