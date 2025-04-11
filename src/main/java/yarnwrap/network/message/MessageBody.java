package yarnwrap.network.message;
public class MessageBody { public net.minecraft.network.message.MessageBody wrapperContained; public MessageBody(net.minecraft.network.message.MessageBody wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public void timestamp(java.time.Instant value) { wrapperContained.timestamp = value; }
// public yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.lastSeenMessages); }
// public void lastSeenMessages(yarnwrap.network.message.LastSeenMessageList value) { wrapperContained.lastSeenMessages = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// public yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.lastSeenMessages()); }
// public void update(Object updater) { wrapperContained.update(updater); }
public yarnwrap.network.message.MessageBody ofUnsigned(java.lang.String content) { return new yarnwrap.network.message.MessageBody(wrapperContained.ofUnsigned(content)); }
public Object toSerialized(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.toSerialized(storage.wrapperContained); }

}