package yarnwrap.client.gui.screen;
public class NoticeScreen { public net.minecraft.client.gui.screen.NoticeScreen wrapperContained; public NoticeScreen(net.minecraft.client.gui.screen.NoticeScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Runnable actionHandler() { return wrapperContained.actionHandler; }
// public void actionHandler(java.lang.Runnable value) { wrapperContained.actionHandler = value; }
// public static java.lang.Runnable actionHandler() { return net.minecraft.client.gui.screen.NoticeScreen.actionHandler; }
// public static void actionHandler(java.lang.Runnable value, ) { net.minecraft.client.gui.screen.NoticeScreen.actionHandler = value; }

// public yarnwrap.text.Text notice() { return new yarnwrap.text.Text(wrapperContained.notice); }
// public void notice(yarnwrap.text.Text value) { wrapperContained.notice = value.wrapperContained; }
// public static yarnwrap.text.Text notice() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.NoticeScreen.notice); }
// public static void notice(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.NoticeScreen.notice = value.wrapperContained; }

// public yarnwrap.client.font.MultilineText noticeLines() { return new yarnwrap.client.font.MultilineText(wrapperContained.noticeLines); }
// public void noticeLines(yarnwrap.client.font.MultilineText value) { wrapperContained.noticeLines = value.wrapperContained; }
// public static yarnwrap.client.font.MultilineText noticeLines() { return new yarnwrap.client.font.MultilineText(net.minecraft.client.gui.screen.NoticeScreen.noticeLines); }
// public static void noticeLines(yarnwrap.client.font.MultilineText value, ) { net.minecraft.client.gui.screen.NoticeScreen.noticeLines = value.wrapperContained; }

// public yarnwrap.text.Text buttonText() { return new yarnwrap.text.Text(wrapperContained.buttonText); }
// public void buttonText(yarnwrap.text.Text value) { wrapperContained.buttonText = value.wrapperContained; }
// public static yarnwrap.text.Text buttonText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.NoticeScreen.buttonText); }
// public static void buttonText(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.NoticeScreen.buttonText = value.wrapperContained; }

// public int NOTICE_TEXT_Y() { return wrapperContained.NOTICE_TEXT_Y; }
// public void NOTICE_TEXT_Y(int value) { wrapperContained.NOTICE_TEXT_Y = value; }
// public static int NOTICE_TEXT_Y() { return net.minecraft.client.gui.screen.NoticeScreen.NOTICE_TEXT_Y; }
// public static void NOTICE_TEXT_Y(int value, ) { net.minecraft.client.gui.screen.NoticeScreen.NOTICE_TEXT_Y = value; }

// public boolean shouldCloseOnEsc() { return wrapperContained.shouldCloseOnEsc; }
// public void shouldCloseOnEsc(boolean value) { wrapperContained.shouldCloseOnEsc = value; }
// public static boolean shouldCloseOnEsc() { return net.minecraft.client.gui.screen.NoticeScreen.shouldCloseOnEsc; }
// public static void shouldCloseOnEsc(boolean value, ) { net.minecraft.client.gui.screen.NoticeScreen.shouldCloseOnEsc = value; }

public NoticeScreen(java.lang.Runnable actionHandler,yarnwrap.text.Text title,yarnwrap.text.Text notice) { this.wrapperContained = new net.minecraft.client.gui.screen.NoticeScreen(actionHandler,title.wrapperContained,notice.wrapperContained); }
public NoticeScreen(java.lang.Runnable actionHandler,yarnwrap.text.Text title,yarnwrap.text.Text notice,yarnwrap.text.Text buttonText,boolean shouldCloseOnEsc) { this.wrapperContained = new net.minecraft.client.gui.screen.NoticeScreen(actionHandler,title.wrapperContained,notice.wrapperContained,buttonText.wrapperContained,shouldCloseOnEsc); }
// public void method_19790(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19790(button.wrapperContained); }
// public static void method_19790(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.NoticeScreen.method_19790(button.wrapperContained); }

}