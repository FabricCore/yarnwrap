package yarnwrap.network.message;
public class MessageVerifier { public net.minecraft.network.message.MessageVerifier wrapperContained; public MessageVerifier(net.minecraft.network.message.MessageVerifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.MessageVerifier NO_SIGNATURE() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.NO_SIGNATURE); }
// public void NO_SIGNATURE(yarnwrap.network.message.MessageVerifier value) { wrapperContained.NO_SIGNATURE = value.wrapperContained; }
public yarnwrap.network.message.MessageVerifier UNVERIFIED() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.UNVERIFIED); }
// public void UNVERIFIED(yarnwrap.network.message.MessageVerifier value) { wrapperContained.UNVERIFIED = value.wrapperContained; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.network.message.SignedMessage ensureVerified(yarnwrap.network.message.SignedMessage message) { return new yarnwrap.network.message.SignedMessage(wrapperContained.ensureVerified(message.wrapperContained)); }

}