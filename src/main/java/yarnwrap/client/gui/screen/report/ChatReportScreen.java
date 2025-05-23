package yarnwrap.client.gui.screen.report;
public class ChatReportScreen { public net.minecraft.client.gui.screen.report.ChatReportScreen wrapperContained; public ChatReportScreen(net.minecraft.client.gui.screen.report.ChatReportScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SELECT_CHAT_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECT_CHAT_TEXT); }
// public void SELECT_CHAT_TEXT(yarnwrap.text.Text value) { wrapperContained.SELECT_CHAT_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text SELECT_CHAT_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.report.ChatReportScreen.SELECT_CHAT_TEXT); }
// public static void SELECT_CHAT_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.SELECT_CHAT_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.report.ChatReportScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.TITLE_TEXT = value.wrapperContained; }

// public yarnwrap.client.gui.widget.EditBoxWidget commentsBox() { return new yarnwrap.client.gui.widget.EditBoxWidget(wrapperContained.commentsBox); }
// public void commentsBox(yarnwrap.client.gui.widget.EditBoxWidget value) { wrapperContained.commentsBox = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.EditBoxWidget commentsBox() { return new yarnwrap.client.gui.widget.EditBoxWidget(net.minecraft.client.gui.screen.report.ChatReportScreen.commentsBox); }
// public static void commentsBox(yarnwrap.client.gui.widget.EditBoxWidget value, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.commentsBox = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget selectChatButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectChatButton); }
// public void selectChatButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectChatButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget selectChatButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.report.ChatReportScreen.selectChatButton); }
// public static void selectChatButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.selectChatButton = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget selectReasonButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectReasonButton); }
// public void selectReasonButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectReasonButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget selectReasonButton() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.report.ChatReportScreen.selectReasonButton); }
// public static void selectReasonButton(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.selectReasonButton = value.wrapperContained; }

public ChatReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext reporter,java.util.UUID reportedPlayerUuid) { this.wrapperContained = new net.minecraft.client.gui.screen.report.ChatReportScreen(parent.wrapperContained,reporter.wrapperContained,reportedPlayerUuid); }
public ChatReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,yarnwrap.client.session.report.ChatAbuseReport report) { this.wrapperContained = new net.minecraft.client.gui.screen.report.ChatReportScreen(parent.wrapperContained,context.wrapperContained,report.wrapperContained); }
// public ChatReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,Object reportBuilder) { this.wrapperContained = new net.minecraft.client.gui.screen.report.ChatReportScreen(parent.wrapperContained,context.wrapperContained,reportBuilder); }
// public void method_61142(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_61142(button.wrapperContained); }
// public static void method_61142(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61142(button.wrapperContained); }
// public void method_61143(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_61143(positioner.wrapperContained); }
// public static void method_61143(yarnwrap.client.gui.widget.Positioner positioner, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61143(positioner.wrapperContained); }
// public void method_61144(Object updatedReportBuilder) { wrapperContained.method_61144(updatedReportBuilder); }
// public static void method_61144(Object updatedReportBuilder, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61144(updatedReportBuilder); }
// public void method_61145(yarnwrap.client.session.report.AbuseReportReason reason) { wrapperContained.method_61145(reason.wrapperContained); }
// public static void method_61145(yarnwrap.client.session.report.AbuseReportReason reason, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61145(reason.wrapperContained); }
// public void method_61146(java.lang.String comments) { wrapperContained.method_61146(comments); }
// public static void method_61146(java.lang.String comments, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61146(comments); }
// public void method_61147(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_61147(button.wrapperContained); }
// public static void method_61147(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.report.ChatReportScreen.method_61147(button.wrapperContained); }

}