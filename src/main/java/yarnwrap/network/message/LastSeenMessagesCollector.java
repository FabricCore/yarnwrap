package yarnwrap.network.message;
public class LastSeenMessagesCollector { public net.minecraft.network.message.LastSeenMessagesCollector wrapperContained; public LastSeenMessagesCollector(net.minecraft.network.message.LastSeenMessagesCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.network.message.AcknowledgedMessage[] acknowledgedMessages() { return wrapperContained.acknowledgedMessages; }
// public void acknowledgedMessages(net.minecraft.network.message.AcknowledgedMessage[] value) { wrapperContained.acknowledgedMessages = value; }
// public int nextIndex() { return wrapperContained.nextIndex; }
// public void nextIndex(int value) { wrapperContained.nextIndex = value; }
// public int messageCount() { return wrapperContained.messageCount; }
// public void messageCount(int value) { wrapperContained.messageCount = value; }
// public yarnwrap.network.message.MessageSignatureData lastAdded() { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.lastAdded); }
// public void lastAdded(yarnwrap.network.message.MessageSignatureData value) { wrapperContained.lastAdded = value.wrapperContained; }
public int resetMessageCount() { return wrapperContained.resetMessageCount(); }
// public void add(yarnwrap.network.message.AcknowledgedMessage message) { wrapperContained.add(message.wrapperContained); }
public void remove(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.remove(signature.wrapperContained); }
public boolean add(yarnwrap.network.message.MessageSignatureData signature,boolean displayed) { return wrapperContained.add(signature.wrapperContained,displayed); }
public Object collect() { return wrapperContained.collect(); }
public int getMessageCount() { return wrapperContained.getMessageCount(); }

}