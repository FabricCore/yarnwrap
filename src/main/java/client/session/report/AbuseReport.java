package yarnwrap.client.session.report;
public class AbuseReport { public net.minecraft.client.session.report.AbuseReport wrapperContained; public AbuseReport(net.minecraft.client.session.report.AbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID reportId() { return wrapperContained.reportId; }
// public java.time.Instant currentTime() { return wrapperContained.currentTime; }
// public java.util.UUID reportedPlayerUuid() { return wrapperContained.reportedPlayerUuid; }
// public java.lang.String opinionComments() { return wrapperContained.opinionComments; }
// public yarnwrap.client.session.report.AbuseReportReason reason() { return new yarnwrap.client.session.report.AbuseReportReason(wrapperContained.reason); }
// public boolean attested() { return wrapperContained.attested; }
public yarnwrap.client.session.report.AbuseReport copy() { return new yarnwrap.client.session.report.AbuseReport(wrapperContained.copy()); }
public boolean playerUuidEquals(java.util.UUID uuid) { return wrapperContained.playerUuidEquals(uuid); }
public yarnwrap.client.gui.screen.Screen createReportScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createReportScreen(parent.wrapperContained,context.wrapperContained)); }

}