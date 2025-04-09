package yarnwrap.client.session.report;
public class AbuseReportType { public net.minecraft.client.session.report.AbuseReportType wrapperContained; public AbuseReportType(net.minecraft.client.session.report.AbuseReportType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public java.lang.String getName() { return wrapperContained.getName(); }

}