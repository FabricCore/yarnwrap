package yarnwrap.client.gui.screen;
public class ConfirmScreen { public net.minecraft.client.gui.screen.ConfirmScreen wrapperContained; public ConfirmScreen(net.minecraft.client.gui.screen.ConfirmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text noText() { return new yarnwrap.text.Text(wrapperContained.noText); }
// public void noText(yarnwrap.text.Text value) { wrapperContained.noText = value.wrapperContained; }
// public static yarnwrap.text.Text noText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ConfirmScreen.noText); }
// public static void noText(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ConfirmScreen.noText = value.wrapperContained; }

// public int buttonEnableTimer() { return wrapperContained.buttonEnableTimer; }
// public void buttonEnableTimer(int value) { wrapperContained.buttonEnableTimer = value; }
// public static int buttonEnableTimer() { return net.minecraft.client.gui.screen.ConfirmScreen.buttonEnableTimer; }
// public static void buttonEnableTimer(int value, ) { net.minecraft.client.gui.screen.ConfirmScreen.buttonEnableTimer = value; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ConfirmScreen.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ConfirmScreen.message = value.wrapperContained; }

// public yarnwrap.text.Text yesText() { return new yarnwrap.text.Text(wrapperContained.yesText); }
// public void yesText(yarnwrap.text.Text value) { wrapperContained.yesText = value.wrapperContained; }
// public static yarnwrap.text.Text yesText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ConfirmScreen.yesText); }
// public static void yesText(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ConfirmScreen.yesText = value.wrapperContained; }

// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
// public static it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return net.minecraft.client.gui.screen.ConfirmScreen.callback; }
// public static void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value, ) { net.minecraft.client.gui.screen.ConfirmScreen.callback = value; }

// public yarnwrap.client.font.MultilineText messageSplit() { return new yarnwrap.client.font.MultilineText(wrapperContained.messageSplit); }
// public void messageSplit(yarnwrap.client.font.MultilineText value) { wrapperContained.messageSplit = value.wrapperContained; }
// public static yarnwrap.client.font.MultilineText messageSplit() { return new yarnwrap.client.font.MultilineText(net.minecraft.client.gui.screen.ConfirmScreen.messageSplit); }
// public static void messageSplit(yarnwrap.client.font.MultilineText value, ) { net.minecraft.client.gui.screen.ConfirmScreen.messageSplit = value.wrapperContained; }

// public java.util.List buttons() { return wrapperContained.buttons; }
// public void buttons(java.util.List value) { wrapperContained.buttons = value; }
// public static java.util.List buttons() { return net.minecraft.client.gui.screen.ConfirmScreen.buttons; }
// public static void buttons(java.util.List value, ) { net.minecraft.client.gui.screen.ConfirmScreen.buttons = value; }

// public int TITLE_BOTTOM_MARGIN() { return wrapperContained.TITLE_BOTTOM_MARGIN; }
// public void TITLE_BOTTOM_MARGIN(int value) { wrapperContained.TITLE_BOTTOM_MARGIN = value; }
// public static int TITLE_BOTTOM_MARGIN() { return net.minecraft.client.gui.screen.ConfirmScreen.TITLE_BOTTOM_MARGIN; }
// public static void TITLE_BOTTOM_MARGIN(int value, ) { net.minecraft.client.gui.screen.ConfirmScreen.TITLE_BOTTOM_MARGIN = value; }

public ConfirmScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmScreen(callback,title.wrapperContained,message.wrapperContained); }
public ConfirmScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title,yarnwrap.text.Text message,yarnwrap.text.Text yesText,yarnwrap.text.Text noText) { this.wrapperContained = new net.minecraft.client.gui.screen.ConfirmScreen(callback,title.wrapperContained,message.wrapperContained,yesText.wrapperContained,noText.wrapperContained); }
public void disableButtons(int ticks) { wrapperContained.disableButtons(ticks); }
// public static void disableButtons(int ticks, ) { net.minecraft.client.gui.screen.ConfirmScreen.disableButtons(ticks); }
// public void addButtons(int y) { wrapperContained.addButtons(y); }
// public static void addButtons(int y, ) { net.minecraft.client.gui.screen.ConfirmScreen.addButtons(y); }
// public void addButton(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.addButton(button.wrapperContained); }
// public static void addButton(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmScreen.addButton(button.wrapperContained); }
// public void method_37053(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_37053(button.wrapperContained); }
// public static void method_37053(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmScreen.method_37053(button.wrapperContained); }
// public void method_37054(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_37054(button.wrapperContained); }
// public static void method_37054(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ConfirmScreen.method_37054(button.wrapperContained); }
// public int getTitleY() { return wrapperContained.getTitleY(); }
// public static int getTitleY() { return net.minecraft.client.gui.screen.ConfirmScreen.getTitleY(); }
// public int getMessageY() { return wrapperContained.getMessageY(); }
// public static int getMessageY() { return net.minecraft.client.gui.screen.ConfirmScreen.getMessageY(); }
// public int getMessagesHeight() { return wrapperContained.getMessagesHeight(); }
// public static int getMessagesHeight() { return net.minecraft.client.gui.screen.ConfirmScreen.getMessagesHeight(); }

}