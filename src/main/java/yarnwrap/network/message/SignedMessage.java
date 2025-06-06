package yarnwrap.network.message;
public class SignedMessage { public net.minecraft.network.message.SignedMessage wrapperContained; public SignedMessage(net.minecraft.network.message.SignedMessage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration SERVERBOUND_TIME_TO_LIVE() { return wrapperContained.SERVERBOUND_TIME_TO_LIVE; }
// public void SERVERBOUND_TIME_TO_LIVE(java.time.Duration value) { wrapperContained.SERVERBOUND_TIME_TO_LIVE = value; }
public static java.time.Duration SERVERBOUND_TIME_TO_LIVE() { return net.minecraft.network.message.SignedMessage.SERVERBOUND_TIME_TO_LIVE; }
// public static void SERVERBOUND_TIME_TO_LIVE(java.time.Duration value, ) { net.minecraft.network.message.SignedMessage.SERVERBOUND_TIME_TO_LIVE = value; }

// public java.time.Duration CLIENTBOUND_TIME_TO_LIVE() { return wrapperContained.CLIENTBOUND_TIME_TO_LIVE; }
// public void CLIENTBOUND_TIME_TO_LIVE(java.time.Duration value) { wrapperContained.CLIENTBOUND_TIME_TO_LIVE = value; }
public static java.time.Duration CLIENTBOUND_TIME_TO_LIVE() { return net.minecraft.network.message.SignedMessage.CLIENTBOUND_TIME_TO_LIVE; }
// public static void CLIENTBOUND_TIME_TO_LIVE(java.time.Duration value, ) { net.minecraft.network.message.SignedMessage.CLIENTBOUND_TIME_TO_LIVE = value; }

// public java.util.UUID NIL_UUID() { return wrapperContained.NIL_UUID; }
// public void NIL_UUID(java.util.UUID value) { wrapperContained.NIL_UUID = value; }
// public static java.util.UUID NIL_UUID() { return net.minecraft.network.message.SignedMessage.NIL_UUID; }
// public static void NIL_UUID(java.util.UUID value, ) { net.minecraft.network.message.SignedMessage.NIL_UUID = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.network.message.SignedMessage.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.network.message.SignedMessage.CODEC = value; }

public yarnwrap.network.message.SignedMessage withoutUnsigned() { return new yarnwrap.network.message.SignedMessage(wrapperContained.withoutUnsigned()); }
// public static yarnwrap.network.message.SignedMessage withoutUnsigned() { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.withoutUnsigned()); }
public boolean isExpiredOnServer(java.time.Instant currentTime) { return wrapperContained.isExpiredOnServer(currentTime); }
// public static boolean isExpiredOnServer(java.time.Instant currentTime, ) { return net.minecraft.network.message.SignedMessage.isExpiredOnServer(currentTime); }
public boolean isExpiredOnClient(java.time.Instant currentTime) { return wrapperContained.isExpiredOnClient(currentTime); }
// public static boolean isExpiredOnClient(java.time.Instant currentTime, ) { return net.minecraft.network.message.SignedMessage.isExpiredOnClient(currentTime); }
public boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier) { return wrapperContained.verify(verifier.wrapperContained); }
// public static boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier, ) { return net.minecraft.network.message.SignedMessage.verify(verifier.wrapperContained); }
public java.lang.String getSignedContent() { return wrapperContained.getSignedContent(); }
// public static java.lang.String getSignedContent() { return net.minecraft.network.message.SignedMessage.getSignedContent(); }
public yarnwrap.network.message.SignedMessage withUnsignedContent(yarnwrap.text.Text unsignedContent) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withUnsignedContent(unsignedContent.wrapperContained)); }
// public static yarnwrap.network.message.SignedMessage withUnsignedContent(yarnwrap.text.Text unsignedContent, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.withUnsignedContent(unsignedContent.wrapperContained)); }
public java.time.Instant getTimestamp() { return wrapperContained.getTimestamp(); }
// public static java.time.Instant getTimestamp() { return net.minecraft.network.message.SignedMessage.getTimestamp(); }
public long getSalt() { return wrapperContained.getSalt(); }
// public static long getSalt() { return net.minecraft.network.message.SignedMessage.getSalt(); }
public boolean canVerifyFrom(java.util.UUID sender) { return wrapperContained.canVerifyFrom(sender); }
// public static boolean canVerifyFrom(java.util.UUID sender, ) { return net.minecraft.network.message.SignedMessage.canVerifyFrom(sender); }
// public yarnwrap.network.message.SignedMessage ofUnsigned(java.lang.String content) { return new yarnwrap.network.message.SignedMessage(wrapperContained.ofUnsigned(content)); }
// public static yarnwrap.network.message.SignedMessage ofUnsigned(java.lang.String content, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.ofUnsigned(content)); }
public yarnwrap.network.message.SignedMessage withFilterMask(yarnwrap.network.message.FilterMask filterMask) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withFilterMask(filterMask.wrapperContained)); }
// public static yarnwrap.network.message.SignedMessage withFilterMask(yarnwrap.network.message.FilterMask filterMask, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.withFilterMask(filterMask.wrapperContained)); }
// public yarnwrap.network.message.SignedMessage ofUnsigned(java.util.UUID sender,java.lang.String content) { return new yarnwrap.network.message.SignedMessage(wrapperContained.ofUnsigned(sender,content)); }
// public static yarnwrap.network.message.SignedMessage ofUnsigned(java.util.UUID sender,java.lang.String content, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.ofUnsigned(sender,content)); }
public yarnwrap.network.message.SignedMessage withFilterMaskEnabled(boolean enabled) { return new yarnwrap.network.message.SignedMessage(wrapperContained.withFilterMaskEnabled(enabled)); }
// public static yarnwrap.network.message.SignedMessage withFilterMaskEnabled(boolean enabled, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.withFilterMaskEnabled(enabled)); }
public boolean isFullyFiltered() { return wrapperContained.isFullyFiltered(); }
// public static boolean isFullyFiltered() { return net.minecraft.network.message.SignedMessage.isFullyFiltered(); }
// public void method_46289(Object updater) { wrapperContained.method_46289(updater); }
// public static void method_46289(Object updater, ) { net.minecraft.network.message.SignedMessage.method_46289(updater); }
// public void update(Object updater,yarnwrap.network.message.MessageLink link,yarnwrap.network.message.MessageBody body) { wrapperContained.update(updater,link.wrapperContained,body.wrapperContained); }
// public static void update(Object updater,yarnwrap.network.message.MessageLink link,yarnwrap.network.message.MessageBody body, ) { net.minecraft.network.message.SignedMessage.update(updater,link.wrapperContained,body.wrapperContained); }
public yarnwrap.text.Text getContent() { return new yarnwrap.text.Text(wrapperContained.getContent()); }
// public static yarnwrap.text.Text getContent() { return new yarnwrap.text.Text(net.minecraft.network.message.SignedMessage.getContent()); }
public java.util.UUID getSender() { return wrapperContained.getSender(); }
// public static java.util.UUID getSender() { return net.minecraft.network.message.SignedMessage.getSender(); }
public boolean isSenderMissing() { return wrapperContained.isSenderMissing(); }
// public static boolean isSenderMissing() { return net.minecraft.network.message.SignedMessage.isSenderMissing(); }
public boolean hasSignature() { return wrapperContained.hasSignature(); }
// public static boolean hasSignature() { return net.minecraft.network.message.SignedMessage.hasSignature(); }
// public com.mojang.datafixers.kinds.App method_46608(Object instance) { return wrapperContained.method_46608(instance); }
// public static com.mojang.datafixers.kinds.App method_46608(Object instance, ) { return net.minecraft.network.message.SignedMessage.method_46608(instance); }
// public java.util.Optional method_46609(yarnwrap.network.message.SignedMessage message) { return wrapperContained.method_46609(message.wrapperContained); }
// public static java.util.Optional method_46609(yarnwrap.network.message.SignedMessage message, ) { return net.minecraft.network.message.SignedMessage.method_46609(message.wrapperContained); }
// public yarnwrap.network.message.SignedMessage method_46610(yarnwrap.network.message.MessageLink link,java.util.Optional signature,yarnwrap.network.message.MessageBody signedBody,java.util.Optional unsignedContent,yarnwrap.network.message.FilterMask filterMask) { return new yarnwrap.network.message.SignedMessage(wrapperContained.method_46610(link.wrapperContained,signature,signedBody.wrapperContained,unsignedContent,filterMask.wrapperContained)); }
// public static yarnwrap.network.message.SignedMessage method_46610(yarnwrap.network.message.MessageLink link,java.util.Optional signature,yarnwrap.network.message.MessageBody signedBody,java.util.Optional unsignedContent,yarnwrap.network.message.FilterMask filterMask, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.method_46610(link.wrapperContained,signature,signedBody.wrapperContained,unsignedContent,filterMask.wrapperContained)); }
// public java.util.Optional method_46611(yarnwrap.network.message.SignedMessage message) { return wrapperContained.method_46611(message.wrapperContained); }
// public static java.util.Optional method_46611(yarnwrap.network.message.SignedMessage message, ) { return net.minecraft.network.message.SignedMessage.method_46611(message.wrapperContained); }
public yarnwrap.network.message.SignedMessage stripSignature() { return new yarnwrap.network.message.SignedMessage(wrapperContained.stripSignature()); }
// public static yarnwrap.network.message.SignedMessage stripSignature() { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedMessage.stripSignature()); }

}