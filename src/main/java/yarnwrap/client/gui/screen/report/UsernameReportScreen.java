package yarnwrap.client.gui.screen.report;
public class UsernameReportScreen { public net.minecraft.client.gui.screen.report.UsernameReportScreen wrapperContained; public UsernameReportScreen(net.minecraft.client.gui.screen.report.UsernameReportScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.EditBoxWidget commentsBox() { return new yarnwrap.client.gui.widget.EditBoxWidget(wrapperContained.commentsBox); }
// public void commentsBox(yarnwrap.client.gui.widget.EditBoxWidget value) { wrapperContained.commentsBox = value.wrapperContained; }
public UsernameReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,java.util.UUID reportedPlayerUuid,java.lang.String username) { this.wrapperContained = new net.minecraft.client.gui.screen.report.UsernameReportScreen(parent.wrapperContained,context.wrapperContained,reportedPlayerUuid,username); }
// public UsernameReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,Object reportBuilder) { this.wrapperContained = new net.minecraft.client.gui.screen.report.UsernameReportScreen(parent.wrapperContained,context.wrapperContained,reportBuilder); }
public UsernameReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,yarnwrap.client.session.report.UsernameAbuseReport report) { this.wrapperContained = new net.minecraft.client.gui.screen.report.UsernameReportScreen(parent.wrapperContained,context.wrapperContained,report.wrapperContained); }
// public void method_61148(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_61148(positioner.wrapperContained); }
// public void method_61149(java.lang.String comments) { wrapperContained.method_61149(comments); }
// public void method_61150(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_61150(positioner.wrapperContained); }

}