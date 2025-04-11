package yarnwrap.client.session.report;
public class ContextMessageCollector { public net.minecraft.client.session.report.ContextMessageCollector wrapperContained; public ContextMessageCollector(net.minecraft.client.session.report.ContextMessageCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public int leadingContextMessageCount() { return wrapperContained.leadingContextMessageCount; }
// public void leadingContextMessageCount(int value) { wrapperContained.leadingContextMessageCount = value; }
// public java.util.List contextMessages() { return wrapperContained.contextMessages; }
// public void contextMessages(java.util.List value) { wrapperContained.contextMessages = value; }
public boolean hasContextMessage() { return wrapperContained.hasContextMessage(); }
// public void add(yarnwrap.client.session.report.log.ChatLog log,it.unimi.dsi.fastutil.ints.IntCollection selections,Object consumer) { wrapperContained.add(log.wrapperContained,selections,consumer); }
public void add(yarnwrap.network.message.SignedMessage message) { wrapperContained.add(message.wrapperContained); }
public boolean tryLink(yarnwrap.network.message.SignedMessage message) { return wrapperContained.tryLink(message.wrapperContained); }

}