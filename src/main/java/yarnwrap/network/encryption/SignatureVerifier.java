package yarnwrap.network.encryption;
public class SignatureVerifier { public net.minecraft.network.encryption.SignatureVerifier wrapperContained; public SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.encryption.SignatureVerifier NOOP() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.network.encryption.SignatureVerifier value) { wrapperContained.NOOP = value.wrapperContained; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean verify(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData,java.security.Signature[] signature) { return wrapperContained.verify(updatable.wrapperContained,signatureData,signature); }
// public yarnwrap.network.encryption.SignatureVerifier create(com.mojang.authlib.yggdrasil.ServicesKeySet servicesKeySet,com.mojang.authlib.yggdrasil.ServicesKeyType servicesKeyType) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(servicesKeySet,servicesKeyType)); }
// public yarnwrap.network.encryption.SignatureVerifier create(java.security.PublicKey publicKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(publicKey,algorithm)); }
// public boolean validate(byte signedData,byte signatureData) { return wrapperContained.validate(signedData,signatureData); }

}