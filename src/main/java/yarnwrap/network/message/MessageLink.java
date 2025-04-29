package yarnwrap.network.message;
public class MessageLink { public net.minecraft.network.message.MessageLink wrapperContained; public MessageLink(net.minecraft.network.message.MessageLink wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.network.message.MessageLink.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.network.message.MessageLink.CODEC = value; }

public yarnwrap.network.message.MessageLink next() { return new yarnwrap.network.message.MessageLink(wrapperContained.next()); }
// public static yarnwrap.network.message.MessageLink next() { return new yarnwrap.network.message.MessageLink(net.minecraft.network.message.MessageLink.next()); }
// public void update(Object updater) { wrapperContained.update(updater); }
// public static void update(Object updater, ) { net.minecraft.network.message.MessageLink.update(updater); }
// public yarnwrap.network.message.MessageLink of(java.util.UUID sender) { return new yarnwrap.network.message.MessageLink(wrapperContained.of(sender)); }
// public static yarnwrap.network.message.MessageLink of(java.util.UUID sender, ) { return new yarnwrap.network.message.MessageLink(net.minecraft.network.message.MessageLink.of(sender)); }
// public yarnwrap.network.message.MessageLink of(java.util.UUID sender,java.util.UUID sessionId) { return new yarnwrap.network.message.MessageLink(wrapperContained.of(sender,sessionId)); }
// public static yarnwrap.network.message.MessageLink of(java.util.UUID sender,java.util.UUID sessionId, ) { return new yarnwrap.network.message.MessageLink(net.minecraft.network.message.MessageLink.of(sender,sessionId)); }
public boolean linksTo(yarnwrap.network.message.MessageLink preceding) { return wrapperContained.linksTo(preceding.wrapperContained); }
// public static boolean linksTo(yarnwrap.network.message.MessageLink preceding, ) { return net.minecraft.network.message.MessageLink.linksTo(preceding.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_46614(Object instance) { return wrapperContained.method_46614(instance); }
// public static com.mojang.datafixers.kinds.App method_46614(Object instance, ) { return net.minecraft.network.message.MessageLink.method_46614(instance); }

}