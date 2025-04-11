package yarnwrap.client.session.report;
public class MessagesListAdder { public net.minecraft.client.session.report.MessagesListAdder wrapperContained; public MessagesListAdder(net.minecraft.client.session.report.MessagesListAdder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.report.log.ChatLog log() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.log); }
// public void log(yarnwrap.client.session.report.log.ChatLog value) { wrapperContained.log = value.wrapperContained; }
// public java.util.function.Predicate reportablePredicate() { return wrapperContained.reportablePredicate; }
// public void reportablePredicate(java.util.function.Predicate value) { wrapperContained.reportablePredicate = value; }
// public yarnwrap.client.session.report.ContextMessageCollector contextMessageCollector() { return new yarnwrap.client.session.report.ContextMessageCollector(wrapperContained.contextMessageCollector); }
// public void contextMessageCollector(yarnwrap.client.session.report.ContextMessageCollector value) { wrapperContained.contextMessageCollector = value.wrapperContained; }
// public int maxLogIndex() { return wrapperContained.maxLogIndex; }
// public void maxLogIndex(int value) { wrapperContained.maxLogIndex = value; }
// public int foldedMessageCount() { return wrapperContained.foldedMessageCount; }
// public void foldedMessageCount(int value) { wrapperContained.foldedMessageCount = value; }
// public yarnwrap.network.message.SignedMessage lastMessage() { return new yarnwrap.network.message.SignedMessage(wrapperContained.lastMessage); }
// public void lastMessage(yarnwrap.network.message.SignedMessage value) { wrapperContained.lastMessage = value.wrapperContained; }
// public yarnwrap.network.message.MessageLink link() { return new yarnwrap.network.message.MessageLink(wrapperContained.link); }
// public void link(yarnwrap.network.message.MessageLink value) { wrapperContained.link = value.wrapperContained; }
public MessagesListAdder(yarnwrap.client.session.report.AbuseReportContext context,java.util.function.Predicate reportablePredicate) { this.wrapperContained = new net.minecraft.client.session.report.MessagesListAdder(context.wrapperContained,reportablePredicate); }
// public void add(int minAmount,Object messages) { wrapperContained.add(minAmount,messages); }
// public boolean tryAdd(Object messages,Object message) { return wrapperContained.tryAdd(messages,message); }

}