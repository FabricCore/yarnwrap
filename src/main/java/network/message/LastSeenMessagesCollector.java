package yarnwrap.network.message;
public class LastSeenMessagesCollector { public net.minecraft.network.message.LastSeenMessagesCollector wrapperContained; public LastSeenMessagesCollector(net.minecraft.network.message.LastSeenMessagesCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.network.message.AcknowledgedMessage[] acknowledgedMessages() { return wrapperContained.acknowledgedMessages; }
// public int nextIndex() { return wrapperContained.nextIndex; }
// public int messageCount() { return wrapperContained.messageCount; }
// public yarnwrap.network.message.MessageSignatureData lastAdded() { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.lastAdded); }
public int resetMessageCount() { return wrapperContained.resetMessageCount(); }
// public void add(yarnwrap.network.message.AcknowledgedMessage message) { wrapperContained.add(message.wrapperContained); }
public void remove(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.remove(signature.wrapperContained); }
public boolean add(yarnwrap.network.message.MessageSignatureData signature,boolean displayed) { return wrapperContained.add(signature.wrapperContained,displayed); }
public Object collect() { return wrapperContained.collect(); }
public int getMessageCount() { return wrapperContained.getMessageCount(); }

}