package yarnwrap.client.session.report;
public class AbuseReportSender { public net.minecraft.client.session.report.AbuseReportSender wrapperContained; public AbuseReportSender(net.minecraft.client.session.report.AbuseReportSender wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canSendReports() { return wrapperContained.canSendReports(); }
// public yarnwrap.client.session.report.AbuseReportSender create(yarnwrap.client.session.report.ReporterEnvironment environment,com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.client.session.report.AbuseReportSender(wrapperContained.create(environment.wrapperContained,userApiService)); }
public java.util.concurrent.CompletableFuture send(java.util.UUID id,yarnwrap.client.session.report.AbuseReportType type,com.mojang.authlib.minecraft.report.AbuseReport report) { return wrapperContained.send(id,type.wrapperContained,report); }
public com.mojang.authlib.minecraft.report.AbuseReportLimits getLimits() { return wrapperContained.getLimits(); }

}