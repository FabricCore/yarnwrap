package yarnwrap.client.session.report;
public class AbuseReportContext { public net.minecraft.client.session.report.AbuseReportContext wrapperContained; public AbuseReportContext(net.minecraft.client.session.report.AbuseReportContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_LOGS() { return wrapperContained.MAX_LOGS; }
// public yarnwrap.client.session.report.AbuseReportSender sender() { return new yarnwrap.client.session.report.AbuseReportSender(wrapperContained.sender); }
// public yarnwrap.client.session.report.ReporterEnvironment environment() { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.environment); }
// public yarnwrap.client.session.report.log.ChatLog chatLog() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.chatLog); }
// public yarnwrap.client.session.report.AbuseReport draft() { return new yarnwrap.client.session.report.AbuseReport(wrapperContained.draft); }
public boolean environmentEquals(yarnwrap.client.session.report.ReporterEnvironment environment) { return wrapperContained.environmentEquals(environment.wrapperContained); }
public yarnwrap.client.session.report.AbuseReportContext create(yarnwrap.client.session.report.ReporterEnvironment environment,com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.create(environment.wrapperContained,userApiService)); }
public yarnwrap.client.session.report.AbuseReportSender getSender() { return new yarnwrap.client.session.report.AbuseReportSender(wrapperContained.getSender()); }
public void tryShowDraftScreen(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,java.lang.Runnable callback,boolean quit) { wrapperContained.tryShowDraftScreen(client.wrapperContained,parent.wrapperContained,callback,quit); }
public void setDraft(yarnwrap.client.session.report.AbuseReport draft) { wrapperContained.setDraft(draft.wrapperContained); }
public boolean draftPlayerUuidEquals(java.util.UUID uuid) { return wrapperContained.draftPlayerUuidEquals(uuid); }
public yarnwrap.client.session.report.log.ChatLog getChatLog() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.getChatLog()); }
public boolean hasDraft() { return wrapperContained.hasDraft(); }

}