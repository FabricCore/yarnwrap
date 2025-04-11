package yarnwrap.network.encryption;
public class PlayerPublicKey { public net.minecraft.network.encryption.PlayerPublicKey wrapperContained; public PlayerPublicKey(net.minecraft.network.encryption.PlayerPublicKey wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.text.Text EXPIRED_PUBLIC_KEY_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPIRED_PUBLIC_KEY_TEXT); }
// public void EXPIRED_PUBLIC_KEY_TEXT(yarnwrap.text.Text value) { wrapperContained.EXPIRED_PUBLIC_KEY_TEXT = value.wrapperContained; }
public java.time.Duration EXPIRATION_GRACE_PERIOD() { return wrapperContained.EXPIRATION_GRACE_PERIOD; }
// public void EXPIRATION_GRACE_PERIOD(java.time.Duration value) { wrapperContained.EXPIRATION_GRACE_PERIOD = value; }
// public yarnwrap.text.Text INVALID_PUBLIC_KEY_SIGNATURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PUBLIC_KEY_SIGNATURE_TEXT); }
// public void INVALID_PUBLIC_KEY_SIGNATURE_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_PUBLIC_KEY_SIGNATURE_TEXT = value.wrapperContained; }
// public yarnwrap.network.encryption.PlayerPublicKey verifyAndDecode(yarnwrap.network.encryption.SignatureVerifier servicesSignatureVerifier,java.util.UUID playerUuid,Object publicKeyData) { return new yarnwrap.network.encryption.PlayerPublicKey(wrapperContained.verifyAndDecode(servicesSignatureVerifier.wrapperContained,playerUuid,publicKeyData)); }
public yarnwrap.network.encryption.SignatureVerifier createSignatureInstance() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.createSignatureInstance()); }

}