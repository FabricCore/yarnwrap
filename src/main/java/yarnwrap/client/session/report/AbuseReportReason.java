package yarnwrap.client.session.report;
public class AbuseReportReason { public net.minecraft.client.session.report.AbuseReportReason wrapperContained; public AbuseReportReason(net.minecraft.client.session.report.AbuseReportReason wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
public java.lang.String getId() { return wrapperContained.getId(); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }

}