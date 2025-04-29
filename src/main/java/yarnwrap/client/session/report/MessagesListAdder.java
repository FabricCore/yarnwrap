package yarnwrap.client.session.report;
public class MessagesListAdder { public net.minecraft.client.session.report.MessagesListAdder wrapperContained; public MessagesListAdder(net.minecraft.client.session.report.MessagesListAdder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.report.log.ChatLog log() { return new yarnwrap.client.session.report.log.ChatLog(wrapperContained.log); }
// public void log(yarnwrap.client.session.report.log.ChatLog value) { wrapperContained.log = value.wrapperContained; }
// public static yarnwrap.client.session.report.log.ChatLog log() { return new yarnwrap.client.session.report.log.ChatLog(net.minecraft.client.session.report.MessagesListAdder.log); }
// public static void log(yarnwrap.client.session.report.log.ChatLog value, ) { net.minecraft.client.session.report.MessagesListAdder.log = value.wrapperContained; }

// public java.util.function.Predicate reportablePredicate() { return wrapperContained.reportablePredicate; }
// public void reportablePredicate(java.util.function.Predicate value) { wrapperContained.reportablePredicate = value; }
// public static java.util.function.Predicate reportablePredicate() { return net.minecraft.client.session.report.MessagesListAdder.reportablePredicate; }
// public static void reportablePredicate(java.util.function.Predicate value, ) { net.minecraft.client.session.report.MessagesListAdder.reportablePredicate = value; }

// public yarnwrap.client.session.report.ContextMessageCollector contextMessageCollector() { return new yarnwrap.client.session.report.ContextMessageCollector(wrapperContained.contextMessageCollector); }
// public void contextMessageCollector(yarnwrap.client.session.report.ContextMessageCollector value) { wrapperContained.contextMessageCollector = value.wrapperContained; }
// public static yarnwrap.client.session.report.ContextMessageCollector contextMessageCollector() { return new yarnwrap.client.session.report.ContextMessageCollector(net.minecraft.client.session.report.MessagesListAdder.contextMessageCollector); }
// public static void contextMessageCollector(yarnwrap.client.session.report.ContextMessageCollector value, ) { net.minecraft.client.session.report.MessagesListAdder.contextMessageCollector = value.wrapperContained; }

// public int maxLogIndex() { return wrapperContained.maxLogIndex; }
// public void maxLogIndex(int value) { wrapperContained.maxLogIndex = value; }
// public static int maxLogIndex() { return net.minecraft.client.session.report.MessagesListAdder.maxLogIndex; }
// public static void maxLogIndex(int value, ) { net.minecraft.client.session.report.MessagesListAdder.maxLogIndex = value; }

// public int foldedMessageCount() { return wrapperContained.foldedMessageCount; }
// public void foldedMessageCount(int value) { wrapperContained.foldedMessageCount = value; }
// public static int foldedMessageCount() { return net.minecraft.client.session.report.MessagesListAdder.foldedMessageCount; }
// public static void foldedMessageCount(int value, ) { net.minecraft.client.session.report.MessagesListAdder.foldedMessageCount = value; }

// public yarnwrap.network.message.SignedMessage lastMessage() { return new yarnwrap.network.message.SignedMessage(wrapperContained.lastMessage); }
// public void lastMessage(yarnwrap.network.message.SignedMessage value) { wrapperContained.lastMessage = value.wrapperContained; }
// public static yarnwrap.network.message.SignedMessage lastMessage() { return new yarnwrap.network.message.SignedMessage(net.minecraft.client.session.report.MessagesListAdder.lastMessage); }
// public static void lastMessage(yarnwrap.network.message.SignedMessage value, ) { net.minecraft.client.session.report.MessagesListAdder.lastMessage = value.wrapperContained; }

// public yarnwrap.network.message.MessageLink link() { return new yarnwrap.network.message.MessageLink(wrapperContained.link); }
// public void link(yarnwrap.network.message.MessageLink value) { wrapperContained.link = value.wrapperContained; }
// public static yarnwrap.network.message.MessageLink link() { return new yarnwrap.network.message.MessageLink(net.minecraft.client.session.report.MessagesListAdder.link); }
// public static void link(yarnwrap.network.message.MessageLink value, ) { net.minecraft.client.session.report.MessagesListAdder.link = value.wrapperContained; }

public MessagesListAdder(yarnwrap.client.session.report.AbuseReportContext context,java.util.function.Predicate reportablePredicate) { this.wrapperContained = new net.minecraft.client.session.report.MessagesListAdder(context.wrapperContained,reportablePredicate); }
// public void add(int minAmount,Object messages) { wrapperContained.add(minAmount,messages); }
// public static void add(int minAmount,Object messages, ) { net.minecraft.client.session.report.MessagesListAdder.add(minAmount,messages); }
// public boolean tryAdd(Object messages,Object message) { return wrapperContained.tryAdd(messages,message); }
// public static boolean tryAdd(Object messages,Object message, ) { return net.minecraft.client.session.report.MessagesListAdder.tryAdd(messages,message); }

}