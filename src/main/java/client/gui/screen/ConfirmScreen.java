package yarnwrap.client.gui.screen;
public class ConfirmScreen { public net.minecraft.client.gui.screen.ConfirmScreen wrapperContained; public ConfirmScreen(net.minecraft.client.gui.screen.ConfirmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text noText() { return new yarnwrap.text.Text(wrapperContained.noText); }
// public int buttonEnableTimer() { return wrapperContained.buttonEnableTimer; }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public yarnwrap.text.Text yesText() { return new yarnwrap.text.Text(wrapperContained.yesText); }
// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public yarnwrap.client.font.MultilineText messageSplit() { return new yarnwrap.client.font.MultilineText(wrapperContained.messageSplit); }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public int TITLE_BOTTOM_MARGIN() { return wrapperContained.TITLE_BOTTOM_MARGIN; }
public void disableButtons(int ticks) { wrapperContained.disableButtons(ticks); }
// public void addButtons(int y) { wrapperContained.addButtons(y); }
// public void addButton(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.addButton(button.wrapperContained); }
// public int getTitleY() { return wrapperContained.getTitleY(); }
// public int getMessageY() { return wrapperContained.getMessageY(); }
// public int getMessagesHeight() { return wrapperContained.getMessagesHeight(); }

}