package yarnwrap.network.message;
public class MessageChain { public net.minecraft.network.message.MessageChain wrapperContained; public MessageChain(net.minecraft.network.message.MessageChain wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.message.MessageLink link() { return new yarnwrap.network.message.MessageLink(wrapperContained.link); }
// public java.time.Instant lastTimestamp() { return wrapperContained.lastTimestamp; }
public Object getUnpacker(yarnwrap.network.encryption.PlayerPublicKey playerPublicKey) { return wrapperContained.getUnpacker(playerPublicKey.wrapperContained); }
public Object getPacker(yarnwrap.network.encryption.Signer signer) { return wrapperContained.getPacker(signer.wrapperContained); }

}