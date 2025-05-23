package yarnwrap.client.gui.screen;
public class SleepingChatScreen { public net.minecraft.client.gui.screen.SleepingChatScreen wrapperContained; public SleepingChatScreen(net.minecraft.client.gui.screen.SleepingChatScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget stopSleepingButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.stopSleepingButton); }
// public void stopSleepingButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.stopSleepingButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget stopSleepingButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.SleepingChatScreen.stopSleepingButton); }
// public static void stopSleepingButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.SleepingChatScreen.stopSleepingButton = value.wrapperContained; }

// public void stopSleeping() { wrapperContained.stopSleeping(); }
// public static void stopSleeping() { net.minecraft.client.gui.screen.SleepingChatScreen.stopSleeping(); }
// public void method_19819(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19819(button.wrapperContained); }
// public static void method_19819(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.SleepingChatScreen.method_19819(button.wrapperContained); }
public void closeChatIfEmpty() { wrapperContained.closeChatIfEmpty(); }
// public static void closeChatIfEmpty() { net.minecraft.client.gui.screen.SleepingChatScreen.closeChatIfEmpty(); }

}