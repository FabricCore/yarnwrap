package yarnwrap.client.gui.screen;
public class ConfirmScreen { public net.minecraft.client.gui.screen.ConfirmScreen wrapperContained; public ConfirmScreen(net.minecraft.client.gui.screen.ConfirmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text noText() { return new yarnwrap.text.Text(wrapperContained.noText); }
// public void noText(yarnwrap.text.Text value) { wrapperContained.noText = value.wrapperContained; }
// public int buttonEnableTimer() { return wrapperContained.buttonEnableTimer; }
// public void buttonEnableTimer(int value) { wrapperContained.buttonEnableTimer = value; }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public yarnwrap.text.Text yesText() { return new yarnwrap.text.Text(wrapperContained.yesText); }
// public void yesText(yarnwrap.text.Text value) { wrapperContained.yesText = value.wrapperContained; }
// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
// public yarnwrap.client.font.MultilineText messageSplit() { return new yarnwrap.client.font.MultilineText(wrapperContained.messageSplit); }
// public void messageSplit(yarnwrap.client.font.MultilineText value) { wrapperContained.messageSplit = value.wrapperContained; }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public void buttons(java.util.List value) { wrapperContained.buttons = value; }
// public int TITLE_BOTTOM_MARGIN() { return wrapperContained.TITLE_BOTTOM_MARGIN; }
// public void TITLE_BOTTOM_MARGIN(int value) { wrapperContained.TITLE_BOTTOM_MARGIN = value; }
public void disableButtons(int ticks) { wrapperContained.disableButtons(ticks); }
// public void addButtons(int y) { wrapperContained.addButtons(y); }
// public void addButton(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.addButton(button.wrapperContained); }
// public int getTitleY() { return wrapperContained.getTitleY(); }
// public int getMessageY() { return wrapperContained.getMessageY(); }
// public int getMessagesHeight() { return wrapperContained.getMessagesHeight(); }

}