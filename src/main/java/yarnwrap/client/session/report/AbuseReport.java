package yarnwrap.client.session.report;
public class AbuseReport { public net.minecraft.client.session.report.AbuseReport wrapperContained; public AbuseReport(net.minecraft.client.session.report.AbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID reportId() { return wrapperContained.reportId; }
// public void reportId(java.util.UUID value) { wrapperContained.reportId = value; }
// public static java.util.UUID reportId() { return net.minecraft.client.session.report.AbuseReport.reportId; }
// public static void reportId(java.util.UUID value, ) { net.minecraft.client.session.report.AbuseReport.reportId = value; }

// public java.time.Instant currentTime() { return wrapperContained.currentTime; }
// public void currentTime(java.time.Instant value) { wrapperContained.currentTime = value; }
// public static java.time.Instant currentTime() { return net.minecraft.client.session.report.AbuseReport.currentTime; }
// public static void currentTime(java.time.Instant value, ) { net.minecraft.client.session.report.AbuseReport.currentTime = value; }

// public java.util.UUID reportedPlayerUuid() { return wrapperContained.reportedPlayerUuid; }
// public void reportedPlayerUuid(java.util.UUID value) { wrapperContained.reportedPlayerUuid = value; }
// public static java.util.UUID reportedPlayerUuid() { return net.minecraft.client.session.report.AbuseReport.reportedPlayerUuid; }
// public static void reportedPlayerUuid(java.util.UUID value, ) { net.minecraft.client.session.report.AbuseReport.reportedPlayerUuid = value; }

// public java.lang.String opinionComments() { return wrapperContained.opinionComments; }
// public void opinionComments(java.lang.String value) { wrapperContained.opinionComments = value; }
// public static java.lang.String opinionComments() { return net.minecraft.client.session.report.AbuseReport.opinionComments; }
// public static void opinionComments(java.lang.String value, ) { net.minecraft.client.session.report.AbuseReport.opinionComments = value; }

// public yarnwrap.client.session.report.AbuseReportReason reason() { return new yarnwrap.client.session.report.AbuseReportReason(wrapperContained.reason); }
// public void reason(yarnwrap.client.session.report.AbuseReportReason value) { wrapperContained.reason = value.wrapperContained; }
// public static yarnwrap.client.session.report.AbuseReportReason reason() { return new yarnwrap.client.session.report.AbuseReportReason(net.minecraft.client.session.report.AbuseReport.reason); }
// public static void reason(yarnwrap.client.session.report.AbuseReportReason value, ) { net.minecraft.client.session.report.AbuseReport.reason = value.wrapperContained; }

// public boolean attested() { return wrapperContained.attested; }
// public void attested(boolean value) { wrapperContained.attested = value; }
// public static boolean attested() { return net.minecraft.client.session.report.AbuseReport.attested; }
// public static void attested(boolean value, ) { net.minecraft.client.session.report.AbuseReport.attested = value; }

// public AbuseReport(java.util.UUID reportId,java.time.Instant currentTime,java.util.UUID reportedPlayerUuid) { this.wrapperContained = new net.minecraft.client.session.report.AbuseReport(reportId,currentTime,reportedPlayerUuid); }
public yarnwrap.client.session.report.AbuseReport copy() { return new yarnwrap.client.session.report.AbuseReport(wrapperContained.copy()); }
// public static yarnwrap.client.session.report.AbuseReport copy() { return new yarnwrap.client.session.report.AbuseReport(net.minecraft.client.session.report.AbuseReport.copy()); }
public boolean playerUuidEquals(java.util.UUID uuid) { return wrapperContained.playerUuidEquals(uuid); }
// public static boolean playerUuidEquals(java.util.UUID uuid, ) { return net.minecraft.client.session.report.AbuseReport.playerUuidEquals(uuid); }
public yarnwrap.client.gui.screen.Screen createReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createReportScreen(parent.wrapperContained,context.wrapperContained)); }
// public static yarnwrap.client.gui.screen.Screen createReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.session.report.AbuseReport.createReportScreen(parent.wrapperContained,context.wrapperContained)); }

}