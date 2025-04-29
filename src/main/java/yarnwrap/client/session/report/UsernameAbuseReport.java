package yarnwrap.client.session.report;
public class UsernameAbuseReport { public net.minecraft.client.session.report.UsernameAbuseReport wrapperContained; public UsernameAbuseReport(net.minecraft.client.session.report.UsernameAbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String username() { return wrapperContained.username; }
// public void username(java.lang.String value) { wrapperContained.username = value; }
// public static java.lang.String username() { return net.minecraft.client.session.report.UsernameAbuseReport.username; }
// public static void username(java.lang.String value, ) { net.minecraft.client.session.report.UsernameAbuseReport.username = value; }

// public UsernameAbuseReport(java.util.UUID reportId,java.time.Instant currentTime,java.util.UUID reportedPlayerUuid,java.lang.String username) { this.wrapperContained = new net.minecraft.client.session.report.UsernameAbuseReport(reportId,currentTime,reportedPlayerUuid,username); }
public java.lang.String getUsername() { return wrapperContained.getUsername(); }
// public static java.lang.String getUsername() { return net.minecraft.client.session.report.UsernameAbuseReport.getUsername(); }

}