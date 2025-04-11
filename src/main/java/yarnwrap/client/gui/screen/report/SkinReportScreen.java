package yarnwrap.client.gui.screen.report;
public class SkinReportScreen { public net.minecraft.client.gui.screen.report.SkinReportScreen wrapperContained; public SkinReportScreen(net.minecraft.client.gui.screen.report.SkinReportScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SKIN_WIDGET_WIDTH() { return wrapperContained.SKIN_WIDGET_WIDTH; }
// public void SKIN_WIDGET_WIDTH(int value) { wrapperContained.SKIN_WIDGET_WIDTH = value; }
// public int REASON_BUTTON_AND_COMMENTS_BOX_WIDTH() { return wrapperContained.REASON_BUTTON_AND_COMMENTS_BOX_WIDTH; }
// public void REASON_BUTTON_AND_COMMENTS_BOX_WIDTH(int value) { wrapperContained.REASON_BUTTON_AND_COMMENTS_BOX_WIDTH = value; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.EditBoxWidget commentsBox() { return new yarnwrap.client.gui.widget.EditBoxWidget(wrapperContained.commentsBox); }
// public void commentsBox(yarnwrap.client.gui.widget.EditBoxWidget value) { wrapperContained.commentsBox = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget selectReasonButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectReasonButton); }
// public void selectReasonButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectReasonButton = value.wrapperContained; }
public SkinReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,java.util.UUID reportedPlayerUuid,java.util.function.Supplier skinSupplier) { this.wrapperContained = new net.minecraft.client.gui.screen.report.SkinReportScreen(parent.wrapperContained,context.wrapperContained,reportedPlayerUuid,skinSupplier); }
// public SkinReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,Object reportBuilder) { this.wrapperContained = new net.minecraft.client.gui.screen.report.SkinReportScreen(parent.wrapperContained,context.wrapperContained,reportBuilder); }
public SkinReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,yarnwrap.client.session.report.SkinAbuseReport report) { this.wrapperContained = new net.minecraft.client.gui.screen.report.SkinReportScreen(parent.wrapperContained,context.wrapperContained,report.wrapperContained); }
// public void method_61151(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_61151(button.wrapperContained); }
// public void method_61152(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_61152(positioner.wrapperContained); }
// public void method_61153(yarnwrap.client.session.report.AbuseReportReason reason) { wrapperContained.method_61153(reason.wrapperContained); }
// public void method_61154(java.lang.String comments) { wrapperContained.method_61154(comments); }

}