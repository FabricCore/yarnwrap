package yarnwrap.client.session.report;
public class AbuseReport { public net.minecraft.client.session.report.AbuseReport wrapperContained; public AbuseReport(net.minecraft.client.session.report.AbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID reportId() { return wrapperContained.reportId; }
// public void reportId(java.util.UUID value) { wrapperContained.reportId = value; }
// public java.time.Instant currentTime() { return wrapperContained.currentTime; }
// public void currentTime(java.time.Instant value) { wrapperContained.currentTime = value; }
// public java.util.UUID reportedPlayerUuid() { return wrapperContained.reportedPlayerUuid; }
// public void reportedPlayerUuid(java.util.UUID value) { wrapperContained.reportedPlayerUuid = value; }
// public java.lang.String opinionComments() { return wrapperContained.opinionComments; }
// public void opinionComments(java.lang.String value) { wrapperContained.opinionComments = value; }
// public yarnwrap.client.session.report.AbuseReportReason reason() { return new yarnwrap.client.session.report.AbuseReportReason(wrapperContained.reason); }
// public void reason(yarnwrap.client.session.report.AbuseReportReason value) { wrapperContained.reason = value.wrapperContained; }
// public boolean attested() { return wrapperContained.attested; }
// public void attested(boolean value) { wrapperContained.attested = value; }
// public AbuseReport(java.util.UUID reportId,java.time.Instant currentTime,java.util.UUID reportedPlayerUuid) { this.wrapperContained = new net.minecraft.client.session.report.AbuseReport(reportId,currentTime,reportedPlayerUuid); }
public yarnwrap.client.session.report.AbuseReport copy() { return new yarnwrap.client.session.report.AbuseReport(wrapperContained.copy()); }
public boolean playerUuidEquals(java.util.UUID uuid) { return wrapperContained.playerUuidEquals(uuid); }
public yarnwrap.client.gui.screen.Screen createReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createReportScreen(parent.wrapperContained,context.wrapperContained)); }

}