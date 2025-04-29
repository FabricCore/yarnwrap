package yarnwrap.network.message;
public class LastSeenMessagesCollector { public net.minecraft.network.message.LastSeenMessagesCollector wrapperContained; public LastSeenMessagesCollector(net.minecraft.network.message.LastSeenMessagesCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.network.message.AcknowledgedMessage[] acknowledgedMessages() { return wrapperContained.acknowledgedMessages; }
// public void acknowledgedMessages(net.minecraft.network.message.AcknowledgedMessage[] value) { wrapperContained.acknowledgedMessages = value; }
// public static net.minecraft.network.message.AcknowledgedMessage[] acknowledgedMessages() { return net.minecraft.network.message.LastSeenMessagesCollector.acknowledgedMessages; }
// public static void acknowledgedMessages(net.minecraft.network.message.AcknowledgedMessage[] value, ) { net.minecraft.network.message.LastSeenMessagesCollector.acknowledgedMessages = value; }

// public int nextIndex() { return wrapperContained.nextIndex; }
// public void nextIndex(int value) { wrapperContained.nextIndex = value; }
// public static int nextIndex() { return net.minecraft.network.message.LastSeenMessagesCollector.nextIndex; }
// public static void nextIndex(int value, ) { net.minecraft.network.message.LastSeenMessagesCollector.nextIndex = value; }

// public int messageCount() { return wrapperContained.messageCount; }
// public void messageCount(int value) { wrapperContained.messageCount = value; }
// public static int messageCount() { return net.minecraft.network.message.LastSeenMessagesCollector.messageCount; }
// public static void messageCount(int value, ) { net.minecraft.network.message.LastSeenMessagesCollector.messageCount = value; }

// public yarnwrap.network.message.MessageSignatureData lastAdded() { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.lastAdded); }
// public void lastAdded(yarnwrap.network.message.MessageSignatureData value) { wrapperContained.lastAdded = value.wrapperContained; }
// public static yarnwrap.network.message.MessageSignatureData lastAdded() { return new yarnwrap.network.message.MessageSignatureData(net.minecraft.network.message.LastSeenMessagesCollector.lastAdded); }
// public static void lastAdded(yarnwrap.network.message.MessageSignatureData value, ) { net.minecraft.network.message.LastSeenMessagesCollector.lastAdded = value.wrapperContained; }

public LastSeenMessagesCollector(int size) { this.wrapperContained = new net.minecraft.network.message.LastSeenMessagesCollector(size); }
public int resetMessageCount() { return wrapperContained.resetMessageCount(); }
// public static int resetMessageCount() { return net.minecraft.network.message.LastSeenMessagesCollector.resetMessageCount(); }
// public void add(yarnwrap.network.message.AcknowledgedMessage message) { wrapperContained.add(message.wrapperContained); }
// public static void add(yarnwrap.network.message.AcknowledgedMessage message, ) { net.minecraft.network.message.LastSeenMessagesCollector.add(message.wrapperContained); }
public void remove(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.remove(signature.wrapperContained); }
// public static void remove(yarnwrap.network.message.MessageSignatureData signature, ) { net.minecraft.network.message.LastSeenMessagesCollector.remove(signature.wrapperContained); }
public boolean add(yarnwrap.network.message.MessageSignatureData signature,boolean displayed) { return wrapperContained.add(signature.wrapperContained,displayed); }
// public static boolean add(yarnwrap.network.message.MessageSignatureData signature,boolean displayed, ) { return net.minecraft.network.message.LastSeenMessagesCollector.add(signature.wrapperContained,displayed); }
public Object collect() { return wrapperContained.collect(); }
// public static Object collect() { return net.minecraft.network.message.LastSeenMessagesCollector.collect(); }
public int getMessageCount() { return wrapperContained.getMessageCount(); }
// public static int getMessageCount() { return net.minecraft.network.message.LastSeenMessagesCollector.getMessageCount(); }

}