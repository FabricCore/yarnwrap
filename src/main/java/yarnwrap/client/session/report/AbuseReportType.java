package yarnwrap.client.session.report;
public class AbuseReportType { public net.minecraft.client.session.report.AbuseReportType wrapperContained; public AbuseReportType(net.minecraft.client.session.report.AbuseReportType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public AbuseReportType(java.lang.String name) { this.wrapperContained = new net.minecraft.client.session.report.AbuseReportType(name); }
public java.lang.String getName() { return wrapperContained.getName(); }

}