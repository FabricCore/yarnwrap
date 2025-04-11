package yarnwrap.network.message;
public class MessageChain { public net.minecraft.network.message.MessageChain wrapperContained; public MessageChain(net.minecraft.network.message.MessageChain wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.network.message.MessageLink link() { return new yarnwrap.network.message.MessageLink(wrapperContained.link); }
// public void link(yarnwrap.network.message.MessageLink value) { wrapperContained.link = value.wrapperContained; }
// public java.time.Instant lastTimestamp() { return wrapperContained.lastTimestamp; }
// public void lastTimestamp(java.time.Instant value) { wrapperContained.lastTimestamp = value; }
public MessageChain(java.util.UUID sender,java.util.UUID sessionId) { this.wrapperContained = new net.minecraft.network.message.MessageChain(sender,sessionId); }
public Object getUnpacker(yarnwrap.network.encryption.PlayerPublicKey playerPublicKey) { return wrapperContained.getUnpacker(playerPublicKey.wrapperContained); }
public Object getPacker(yarnwrap.network.encryption.Signer signer) { return wrapperContained.getPacker(signer.wrapperContained); }
// public yarnwrap.network.message.MessageSignatureData method_46311(yarnwrap.network.encryption.Signer body) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.method_46311(body.wrapperContained)); }
// public void method_46313(yarnwrap.network.message.MessageLink updatable) { wrapperContained.method_46313(updatable.wrapperContained); }

}