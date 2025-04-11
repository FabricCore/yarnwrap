package yarnwrap.network.encryption;
public class SignatureVerifier { public net.minecraft.network.encryption.SignatureVerifier wrapperContained; public SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.encryption.SignatureVerifier NOOP() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.network.encryption.SignatureVerifier value) { wrapperContained.NOOP = value.wrapperContained; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean method_44170(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData) { return wrapperContained.method_44170(updatable.wrapperContained,signatureData); }
// public boolean verify(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData,java.security.Signature[] signature) { return wrapperContained.verify(updatable.wrapperContained,signatureData,signature); }
// public yarnwrap.network.encryption.SignatureVerifier create(com.mojang.authlib.yggdrasil.ServicesKeySet servicesKeySet,com.mojang.authlib.yggdrasil.ServicesKeyType servicesKeyType) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(servicesKeySet,servicesKeyType)); }
// public boolean method_44173(yarnwrap.network.encryption.SignatureUpdatable keyInfo) { return wrapperContained.method_44173(keyInfo.wrapperContained); }
// public boolean method_44174(java.lang.String updatable,java.security.PublicKey signatureData) { return wrapperContained.method_44174(updatable,signatureData); }
// public yarnwrap.network.encryption.SignatureVerifier create(java.security.PublicKey publicKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(publicKey,algorithm)); }
// public void method_44176(byte updater) { wrapperContained.method_44176(updater); }
// public boolean validate(byte signedData,byte signatureData) { return wrapperContained.validate(signedData,signatureData); }
// public boolean method_51496(java.util.Collection updatable,yarnwrap.network.encryption.SignatureUpdatable signatureData) { return wrapperContained.method_51496(updatable,signatureData.wrapperContained); }
// public boolean validate(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData) { return wrapperContained.validate(updatable.wrapperContained,signatureData); }

}