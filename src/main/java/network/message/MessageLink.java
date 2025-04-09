package yarnwrap.network.message;
public class MessageLink { public net.minecraft.network.message.MessageLink wrapperContained; public MessageLink(net.minecraft.network.message.MessageLink wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.message.MessageLink next() { return new yarnwrap.network.message.MessageLink(wrapperContained.next()); }
// public void update(Object updater) { wrapperContained.update(updater); }
public yarnwrap.network.message.MessageLink of(java.util.UUID sender) { return new yarnwrap.network.message.MessageLink(wrapperContained.of(sender)); }
public yarnwrap.network.message.MessageLink of(java.util.UUID sender,java.util.UUID sessionId) { return new yarnwrap.network.message.MessageLink(wrapperContained.of(sender,sessionId)); }
public boolean linksTo(yarnwrap.network.message.MessageLink preceding) { return wrapperContained.linksTo(preceding.wrapperContained); }

}