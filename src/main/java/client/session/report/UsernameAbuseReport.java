package yarnwrap.client.session.report;
public class UsernameAbuseReport { public net.minecraft.client.session.report.UsernameAbuseReport wrapperContained; public UsernameAbuseReport(net.minecraft.client.session.report.UsernameAbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String username() { return wrapperContained.username; }
public java.lang.String getUsername() { return wrapperContained.getUsername(); }

}