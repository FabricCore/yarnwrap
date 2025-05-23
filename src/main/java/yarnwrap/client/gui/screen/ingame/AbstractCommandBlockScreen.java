package yarnwrap.client.gui.screen.ingame;
public class AbstractCommandBlockScreen { public net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained; public AbstractCommandBlockScreen(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget consoleCommandTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.consoleCommandTextField); }
// public void consoleCommandTextField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.consoleCommandTextField = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget consoleCommandTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.consoleCommandTextField); }
// public static void consoleCommandTextField(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.consoleCommandTextField = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.cancelButton); }
// public void cancelButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.cancelButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.cancelButton); }
// public static void cancelButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.cancelButton = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget previousOutputTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.previousOutputTextField); }
// public void previousOutputTextField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.previousOutputTextField = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget previousOutputTextField() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.previousOutputTextField); }
// public static void previousOutputTextField(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.previousOutputTextField = value.wrapperContained; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget toggleTrackingOutputButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.toggleTrackingOutputButton); }
// public void toggleTrackingOutputButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.toggleTrackingOutputButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.CyclingButtonWidget toggleTrackingOutputButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.toggleTrackingOutputButton); }
// public static void toggleTrackingOutputButton(yarnwrap.client.gui.widget.CyclingButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.toggleTrackingOutputButton = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public void doneButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.doneButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.doneButton); }
// public static void doneButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.doneButton = value.wrapperContained; }

// public yarnwrap.client.gui.screen.ChatInputSuggestor commandSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.commandSuggestor); }
// public void commandSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value) { wrapperContained.commandSuggestor = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ChatInputSuggestor commandSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.commandSuggestor); }
// public static void commandSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.commandSuggestor = value.wrapperContained; }

// public yarnwrap.text.Text SET_COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.SET_COMMAND_TEXT); }
// public void SET_COMMAND_TEXT(yarnwrap.text.Text value) { wrapperContained.SET_COMMAND_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text SET_COMMAND_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.SET_COMMAND_TEXT); }
// public static void SET_COMMAND_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.SET_COMMAND_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text COMMAND_TEXT() { return new yarnwrap.text.Text(wrapperContained.COMMAND_TEXT); }
// public void COMMAND_TEXT(yarnwrap.text.Text value) { wrapperContained.COMMAND_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text COMMAND_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.COMMAND_TEXT); }
// public static void COMMAND_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.COMMAND_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text PREVIOUS_OUTPUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREVIOUS_OUTPUT_TEXT); }
// public void PREVIOUS_OUTPUT_TEXT(yarnwrap.text.Text value) { wrapperContained.PREVIOUS_OUTPUT_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text PREVIOUS_OUTPUT_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.PREVIOUS_OUTPUT_TEXT); }
// public static void PREVIOUS_OUTPUT_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.PREVIOUS_OUTPUT_TEXT = value.wrapperContained; }

// public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
// public static yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.getCommandExecutor()); }
// public void syncSettingsToServer(yarnwrap.world.CommandBlockExecutor commandExecutor) { wrapperContained.syncSettingsToServer(commandExecutor.wrapperContained); }
// public static void syncSettingsToServer(yarnwrap.world.CommandBlockExecutor commandExecutor, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.syncSettingsToServer(commandExecutor.wrapperContained); }
// public void commitAndClose() { wrapperContained.commitAndClose(); }
// public static void commitAndClose() { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.commitAndClose(); }
// public void onCommandChanged(java.lang.String text) { wrapperContained.onCommandChanged(text); }
// public static void onCommandChanged(java.lang.String text, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.onCommandChanged(text); }
// public int getTrackOutputButtonHeight() { return wrapperContained.getTrackOutputButtonHeight(); }
// public static int getTrackOutputButtonHeight() { return net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.getTrackOutputButtonHeight(); }
// public void method_19875(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19875(button.wrapperContained); }
// public static void method_19875(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.method_19875(button.wrapperContained); }
// public void method_19876(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19876(button.wrapperContained); }
// public static void method_19876(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.method_19876(button.wrapperContained); }
// public void method_32641(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean trackOutput) { wrapperContained.method_32641(button.wrapperContained,trackOutput); }
// public static void method_32641(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean trackOutput, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.method_32641(button.wrapperContained,trackOutput); }
// public void setPreviousOutputText(boolean trackOutput) { wrapperContained.setPreviousOutputText(trackOutput); }
// public static void setPreviousOutputText(boolean trackOutput, ) { net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen.setPreviousOutputText(trackOutput); }

}