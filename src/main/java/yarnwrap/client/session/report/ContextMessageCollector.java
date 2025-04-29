package yarnwrap.client.session.report;
public class ContextMessageCollector { public net.minecraft.client.session.report.ContextMessageCollector wrapperContained; public ContextMessageCollector(net.minecraft.client.session.report.ContextMessageCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public int leadingContextMessageCount() { return wrapperContained.leadingContextMessageCount; }
// public void leadingContextMessageCount(int value) { wrapperContained.leadingContextMessageCount = value; }
// public static int leadingContextMessageCount() { return net.minecraft.client.session.report.ContextMessageCollector.leadingContextMessageCount; }
// public static void leadingContextMessageCount(int value, ) { net.minecraft.client.session.report.ContextMessageCollector.leadingContextMessageCount = value; }

// public java.util.List contextMessages() { return wrapperContained.contextMessages; }
// public void contextMessages(java.util.List value) { wrapperContained.contextMessages = value; }
// public static java.util.List contextMessages() { return net.minecraft.client.session.report.ContextMessageCollector.contextMessages; }
// public static void contextMessages(java.util.List value, ) { net.minecraft.client.session.report.ContextMessageCollector.contextMessages = value; }

public ContextMessageCollector(int leadingContextMessageCount) { this.wrapperContained = new net.minecraft.client.session.report.ContextMessageCollector(leadingContextMessageCount); }
public boolean hasContextMessage() { return wrapperContained.hasContextMessage(); }
// public static boolean hasContextMessage() { return net.minecraft.client.session.report.ContextMessageCollector.hasContextMessage(); }
// public void add(yarnwrap.client.session.report.log.ChatLog log,it.unimi.dsi.fastutil.ints.IntCollection selections,Object consumer) { wrapperContained.add(log.wrapperContained,selections,consumer); }
// public static void add(yarnwrap.client.session.report.log.ChatLog log,it.unimi.dsi.fastutil.ints.IntCollection selections,Object consumer, ) { net.minecraft.client.session.report.ContextMessageCollector.add(log.wrapperContained,selections,consumer); }
public void add(yarnwrap.network.message.SignedMessage message) { wrapperContained.add(message.wrapperContained); }
// public static void add(yarnwrap.network.message.SignedMessage message, ) { net.minecraft.client.session.report.ContextMessageCollector.add(message.wrapperContained); }
public boolean tryLink(yarnwrap.network.message.SignedMessage message) { return wrapperContained.tryLink(message.wrapperContained); }
// public static boolean tryLink(yarnwrap.network.message.SignedMessage message, ) { return net.minecraft.client.session.report.ContextMessageCollector.tryLink(message.wrapperContained); }

}