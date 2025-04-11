package yarnwrap.client.gui.screen;
public class SleepingChatScreen { public net.minecraft.client.gui.screen.SleepingChatScreen wrapperContained; public SleepingChatScreen(net.minecraft.client.gui.screen.SleepingChatScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget stopSleepingButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.stopSleepingButton); }
// public void stopSleepingButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.stopSleepingButton = value.wrapperContained; }
// public void stopSleeping() { wrapperContained.stopSleeping(); }
public void closeChatIfEmpty() { wrapperContained.closeChatIfEmpty(); }

}