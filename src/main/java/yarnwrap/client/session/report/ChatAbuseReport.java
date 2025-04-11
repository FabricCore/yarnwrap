package yarnwrap.client.session.report;
public class ChatAbuseReport { public net.minecraft.client.session.report.ChatAbuseReport wrapperContained; public ChatAbuseReport(net.minecraft.client.session.report.ChatAbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntSet selectedMessages() { return wrapperContained.selectedMessages; }
// public void selectedMessages(it.unimi.dsi.fastutil.ints.IntSet value) { wrapperContained.selectedMessages = value; }
public void toggleMessageSelection(int index,com.mojang.authlib.minecraft.report.AbuseReportLimits limits) { wrapperContained.toggleMessageSelection(index,limits); }

}