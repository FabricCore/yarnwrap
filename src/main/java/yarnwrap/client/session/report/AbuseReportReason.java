package yarnwrap.client.session.report;
public class AbuseReportReason { public net.minecraft.client.session.report.AbuseReportReason wrapperContained; public AbuseReportReason(net.minecraft.client.session.report.AbuseReportReason wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.client.session.report.AbuseReportReason.id; }
// public static void id(java.lang.String value, ) { net.minecraft.client.session.report.AbuseReportReason.id = value; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public static yarnwrap.text.Text text() { return new yarnwrap.text.Text(net.minecraft.client.session.report.AbuseReportReason.text); }
// public static void text(yarnwrap.text.Text value, ) { net.minecraft.client.session.report.AbuseReportReason.text = value.wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.client.session.report.AbuseReportReason.description); }
// public static void description(yarnwrap.text.Text value, ) { net.minecraft.client.session.report.AbuseReportReason.description = value.wrapperContained; }

// public AbuseReportReason(java.lang.String id) { this.wrapperContained = new net.minecraft.client.session.report.AbuseReportReason(id); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.client.session.report.AbuseReportReason.getId(); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
// public static yarnwrap.text.Text getText() { return new yarnwrap.text.Text(net.minecraft.client.session.report.AbuseReportReason.getText()); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
// public static yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(net.minecraft.client.session.report.AbuseReportReason.getDescription()); }

}