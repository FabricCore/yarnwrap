package yarnwrap.client.gui.screen.report;
public class ChatReportScreen { public net.minecraft.client.gui.screen.report.ChatReportScreen wrapperContained; public ChatReportScreen(net.minecraft.client.gui.screen.report.ChatReportScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SELECT_CHAT_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECT_CHAT_TEXT); }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public yarnwrap.client.gui.widget.EditBoxWidget commentsBox() { return new yarnwrap.client.gui.widget.EditBoxWidget(wrapperContained.commentsBox); }
// public yarnwrap.client.gui.widget.ButtonWidget selectChatButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectChatButton); }
// public yarnwrap.client.gui.widget.ButtonWidget selectReasonButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectReasonButton); }

}