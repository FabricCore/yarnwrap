package yarnwrap.client.session.report;
public class AbuseReportContext { public net.minecraft.client.session.report.AbuseReportContext wrapperContained; public AbuseReportContext(net.minecraft.client.session.report.AbuseReportContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_LOGS() { return wrapperContained.MAX_LOGS; }
// public void MAX_LOGS(int value) { wrapperContained.MAX_LOGS = value; }
// public static int MAX_LOGS() { return net.minecraft.client.session.report.AbuseReportContext.MAX_LOGS; }
// public static void MAX_LOGS(int value, ) { net.minecraft.client.session.report.AbuseReportContext.MAX_LOGS = value; }

// public yarnwrap.client.session.report.AbuseReportSender sender() { return new yarnwrap.client.session.report.AbuseReportSender(wrapperContained.sender); }
// public void sender(yarnwrap.client.session.report.AbuseReportSender value) { wrapperContained.sender = value.wrapperContained; }
// public static yarnwrap.client.session.report.AbuseReportSender sender() { return new yarnwrap.client.session.report.AbuseReportSender(net.minecraft.client.session.report.AbuseReportContext.sender); }
// public static void sender(yarnwrap.client.session.report.AbuseReportSender value, ) { net.minecraft.client.session.report.AbuseReportContext.sender = value.wrapperContained; }

// public yarnwrap.client.session.report.ReporterEnvironment environment() { return new yarnwrap.client.session.report.ReporterEnvironment(wrapperContained.environment); }
// public void environment(yarnwrap.client.session.report.ReporterEnvironment value) { wrapperContained.environment = value.wrapperContained; }
// public static yarnwrap.client.session.report.ReporterEnvironment environment() { return new yarnwrap.client.session.report.ReporterEnvironment(net.minecraft.client.session.report.AbuseReportContext.environment); }
// public static void environment(yarnwrap.client.session.report.ReporterEnvironment value, ) { net.minecraft.client.session.report.AbuseReportContext.environment = value.wrapperContained; }

// public yarnwrap.client.session.report.log.ChatLog chatLog() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.chatLog); }
// public void chatLog(yarnwrap.client.session.report.log.ChatLog value) { wrapperContained.chatLog = value.wrapperContained; }
// public static yarnwrap.client.session.report.log.ChatLog chatLog() { return new yarnwrap.client.session.report.log.ChatLog(net.minecraft.client.session.report.AbuseReportContext.chatLog); }
// public static void chatLog(yarnwrap.client.session.report.log.ChatLog value, ) { net.minecraft.client.session.report.AbuseReportContext.chatLog = value.wrapperContained; }

// public yarnwrap.client.session.report.AbuseReport draft() { return new yarnwrap.client.session.report.AbuseReport(wrapperContained.draft); }
// public void draft(yarnwrap.client.session.report.AbuseReport value) { wrapperContained.draft = value.wrapperContained; }
// public static yarnwrap.client.session.report.AbuseReport draft() { return new yarnwrap.client.session.report.AbuseReport(net.minecraft.client.session.report.AbuseReportContext.draft); }
// public static void draft(yarnwrap.client.session.report.AbuseReport value, ) { net.minecraft.client.session.report.AbuseReportContext.draft = value.wrapperContained; }

public AbuseReportContext(yarnwrap.client.session.report.AbuseReportSender sender,yarnwrap.client.session.report.ReporterEnvironment environment,yarnwrap.client.session.report.log.ChatLog chatLog) { this.wrapperContained = new net.minecraft.client.session.report.AbuseReportContext(sender.wrapperContained,environment.wrapperContained,chatLog.wrapperContained); }
public boolean environmentEquals(yarnwrap.client.session.report.ReporterEnvironment environment) { return wrapperContained.environmentEquals(environment.wrapperContained); }
// public static boolean environmentEquals(yarnwrap.client.session.report.ReporterEnvironment environment, ) { return net.minecraft.client.session.report.AbuseReportContext.environmentEquals(environment.wrapperContained); }
// public yarnwrap.client.session.report.AbuseReportContext create(yarnwrap.client.session.report.ReporterEnvironment environment,com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.create(environment.wrapperContained,userApiService)); }
// public static yarnwrap.client.session.report.AbuseReportContext create(yarnwrap.client.session.report.ReporterEnvironment environment,com.mojang.authlib.minecraft.UserApiService userApiService, ) { return new yarnwrap.client.session.report.AbuseReportContext(net.minecraft.client.session.report.AbuseReportContext.create(environment.wrapperContained,userApiService)); }
public yarnwrap.client.session.report.AbuseReportSender getSender() { return new yarnwrap.client.session.report.AbuseReportSender(wrapperContained.getSender()); }
// public static yarnwrap.client.session.report.AbuseReportSender getSender() { return new yarnwrap.client.session.report.AbuseReportSender(net.minecraft.client.session.report.AbuseReportContext.getSender()); }
// public void method_46551(yarnwrap.client.MinecraftClient confirmed) { wrapperContained.method_46551(confirmed.wrapperContained); }
// public static void method_46551(yarnwrap.client.MinecraftClient confirmed, ) { net.minecraft.client.session.report.AbuseReportContext.method_46551(confirmed.wrapperContained); }
public void tryShowDraftScreen(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,java.lang.Runnable callback,boolean quit) { wrapperContained.tryShowDraftScreen(client.wrapperContained,parent.wrapperContained,callback,quit); }
// public static void tryShowDraftScreen(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,java.lang.Runnable callback,boolean quit, ) { net.minecraft.client.session.report.AbuseReportContext.tryShowDraftScreen(client.wrapperContained,parent.wrapperContained,callback,quit); }
public void setDraft(yarnwrap.client.session.report.AbuseReport draft) { wrapperContained.setDraft(draft.wrapperContained); }
// public static void setDraft(yarnwrap.client.session.report.AbuseReport draft, ) { net.minecraft.client.session.report.AbuseReportContext.setDraft(draft.wrapperContained); }
public boolean draftPlayerUuidEquals(java.util.UUID uuid) { return wrapperContained.draftPlayerUuidEquals(uuid); }
// public static boolean draftPlayerUuidEquals(java.util.UUID uuid, ) { return net.minecraft.client.session.report.AbuseReportContext.draftPlayerUuidEquals(uuid); }
public yarnwrap.client.session.report.log.ChatLog getChatLog() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.getChatLog()); }
// public static yarnwrap.client.session.report.log.ChatLog getChatLog() { return new yarnwrap.client.session.report.log.ChatLog(net.minecraft.client.session.report.AbuseReportContext.getChatLog()); }
public boolean hasDraft() { return wrapperContained.hasDraft(); }
// public static boolean hasDraft() { return net.minecraft.client.session.report.AbuseReportContext.hasDraft(); }

}