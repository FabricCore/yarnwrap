package yarnwrap.network.message;
public class SignedMessage { public net.minecraft.network.message.SignedMessage wrapperContained; public SignedMessage(net.minecraft.network.message.SignedMessage wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.Duration SERVERBOUND_TIME_TO_LIVE() { return wrapperContained.SERVERBOUND_TIME_TO_LIVE; }
public java.time.Duration CLIENTBOUND_TIME_TO_LIVE() { return wrapperContained.CLIENTBOUND_TIME_TO_LIVE; }
// public java.util.UUID NIL_UUID() { return wrapperContained.NIL_UUID; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.message.SignedMessage withoutUnsigned() { return new yarnwrap.network.message.SignedMessage(wrapperContained.withoutUnsigned()); }
public boolean isExpiredOnServer(java.time.Instant currentTime) { return wrapperContained.isExpiredOnServer(currentTime); }
public boolean isExpiredOnClient(java.time.Instant currentTime) { return wrapperContained.isExpiredOnClient(currentTime); }
public boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier) { return wrapperContained.verify(verifier.wrapperContained); }
public java.lang.String getSignedContent() { return wrapperContained.getSignedContent(); }
public yarnwrap.network.message.SignedMessage withUnsignedContent(yarnwrap.text.Text unsignedContent) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withUnsignedContent(unsignedContent.wrapperContained)); }
public java.time.Instant getTimestamp() { return wrapperContained.getTimestamp(); }
public long getSalt() { return wrapperContained.getSalt(); }
public boolean canVerifyFrom(java.util.UUID sender) { return wrapperContained.canVerifyFrom(sender); }
public yarnwrap.network.message.SignedMessage ofUnsigned(java.lang.String content) { return new yarnwrap.network.message.SignedMessage(wrapperContained.ofUnsigned(content)); }
public yarnwrap.network.message.SignedMessage withFilterMask(yarnwrap.network.message.FilterMask filterMask) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withFilterMask(filterMask.wrapperContained)); }
public yarnwrap.network.message.SignedMessage ofUnsigned(java.util.UUID sender,java.lang.String content) { return new yarnwrap.network.message.SignedMessage(wrapperContained.ofUnsigned(sender,content)); }
public yarnwrap.network.message.SignedMessage withFilterMaskEnabled(boolean enabled) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withFilterMaskEnabled(enabled)); }
public boolean isFullyFiltered() { return wrapperContained.isFullyFiltered(); }
// public void update(Object updater,yarnwrap.network.message.MessageLink link,yarnwrap.network.message.MessageBody body) { wrapperContained.update(updater,link.wrapperContained,body.wrapperContained); }
public yarnwrap.text.Text getContent() { return new yarnwrap.text.Text(wrapperContained.getContent()); }
public java.util.UUID getSender() { return wrapperContained.getSender(); }
public boolean isSenderMissing() { return wrapperContained.isSenderMissing(); }
public boolean hasSignature() { return wrapperContained.hasSignature(); }
public yarnwrap.network.message.SignedMessage stripSignature() { return new yarnwrap.network.message.SignedMessage(wrapperContained.stripSignature()); }

}