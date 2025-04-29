package yarnwrap.network.message;
public class MessageBody { public net.minecraft.network.message.MessageBody wrapperContained; public MessageBody(net.minecraft.network.message.MessageBody wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public void timestamp(java.time.Instant value) { wrapperContained.timestamp = value; }
// public static java.time.Instant timestamp() { return net.minecraft.network.message.MessageBody.timestamp; }
// public static void timestamp(java.time.Instant value, ) { net.minecraft.network.message.MessageBody.timestamp = value; }

// public yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.lastSeenMessages); }
// public void lastSeenMessages(yarnwrap.network.message.LastSeenMessageList value) { wrapperContained.lastSeenMessages = value.wrapperContained; }
// public static yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(net.minecraft.network.message.MessageBody.lastSeenMessages); }
// public static void lastSeenMessages(yarnwrap.network.message.LastSeenMessageList value, ) { net.minecraft.network.message.MessageBody.lastSeenMessages = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.network.message.MessageBody.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.network.message.MessageBody.CODEC = value; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// // public static java.time.Instant timestamp() { return net.minecraft.network.message.MessageBody.timestamp(); }
// public yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.lastSeenMessages()); }
// // public static yarnwrap.network.message.LastSeenMessageList lastSeenMessages() { return new yarnwrap.network.message.LastSeenMessageList(net.minecraft.network.message.MessageBody.lastSeenMessages()); }
// public void update(Object updater) { wrapperContained.update(updater); }
// public static void update(Object updater, ) { net.minecraft.network.message.MessageBody.update(updater); }
// public yarnwrap.network.message.MessageBody ofUnsigned(java.lang.String content) { return new yarnwrap.network.message.MessageBody(wrapperContained.ofUnsigned(content)); }
// public static yarnwrap.network.message.MessageBody ofUnsigned(java.lang.String content, ) { return new yarnwrap.network.message.MessageBody(net.minecraft.network.message.MessageBody.ofUnsigned(content)); }
public Object toSerialized(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.toSerialized(storage.wrapperContained); }
// public static Object toSerialized(yarnwrap.network.message.MessageSignatureStorage storage, ) { return net.minecraft.network.message.MessageBody.toSerialized(storage.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_46612(Object instance) { return wrapperContained.method_46612(instance); }
// public static com.mojang.datafixers.kinds.App method_46612(Object instance, ) { return net.minecraft.network.message.MessageBody.method_46612(instance); }

}