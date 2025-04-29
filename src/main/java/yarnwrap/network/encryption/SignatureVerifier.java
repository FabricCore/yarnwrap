package yarnwrap.network.encryption;
public class SignatureVerifier { public net.minecraft.network.encryption.SignatureVerifier wrapperContained; public SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.SignatureVerifier NOOP() { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.network.encryption.SignatureVerifier value) { wrapperContained.NOOP = value.wrapperContained; }
public static yarnwrap.network.encryption.SignatureVerifier NOOP() { return new yarnwrap.network.encryption.SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier.NOOP); }
// public static void NOOP(yarnwrap.network.encryption.SignatureVerifier value, ) { net.minecraft.network.encryption.SignatureVerifier.NOOP = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.network.encryption.SignatureVerifier.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.encryption.SignatureVerifier.LOGGER = value; }

// public boolean method_44170(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData) { return wrapperContained.method_44170(updatable.wrapperContained,signatureData); }
// public static boolean method_44170(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData, ) { return net.minecraft.network.encryption.SignatureVerifier.method_44170(updatable.wrapperContained,signatureData); }
// public boolean verify(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData,java.security.Signature[] signature) { return wrapperContained.verify(updatable.wrapperContained,signatureData,signature); }
// public static boolean verify(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData,java.security.Signature[] signature, ) { return net.minecraft.network.encryption.SignatureVerifier.verify(updatable.wrapperContained,signatureData,signature); }
// public yarnwrap.network.encryption.SignatureVerifier create(com.mojang.authlib.yggdrasil.ServicesKeySet servicesKeySet,com.mojang.authlib.yggdrasil.ServicesKeyType servicesKeyType) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(servicesKeySet,servicesKeyType)); }
// public static yarnwrap.network.encryption.SignatureVerifier create(com.mojang.authlib.yggdrasil.ServicesKeySet servicesKeySet,com.mojang.authlib.yggdrasil.ServicesKeyType servicesKeyType, ) { return new yarnwrap.network.encryption.SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier.create(servicesKeySet,servicesKeyType)); }
// public boolean method_44173(yarnwrap.network.encryption.SignatureUpdatable keyInfo) { return wrapperContained.method_44173(keyInfo.wrapperContained); }
// public static boolean method_44173(yarnwrap.network.encryption.SignatureUpdatable keyInfo, ) { return net.minecraft.network.encryption.SignatureVerifier.method_44173(keyInfo.wrapperContained); }
// public boolean method_44174(java.lang.String updatable,java.security.PublicKey signatureData) { return wrapperContained.method_44174(updatable,signatureData); }
// public static boolean method_44174(java.lang.String updatable,java.security.PublicKey signatureData, ) { return net.minecraft.network.encryption.SignatureVerifier.method_44174(updatable,signatureData); }
// public yarnwrap.network.encryption.SignatureVerifier create(java.security.PublicKey publicKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.SignatureVerifier(wrapperContained.create(publicKey,algorithm)); }
// public static yarnwrap.network.encryption.SignatureVerifier create(java.security.PublicKey publicKey,java.lang.String algorithm, ) { return new yarnwrap.network.encryption.SignatureVerifier(net.minecraft.network.encryption.SignatureVerifier.create(publicKey,algorithm)); }
// public void method_44176(byte updater) { wrapperContained.method_44176(updater); }
// public static void method_44176(byte updater, ) { net.minecraft.network.encryption.SignatureVerifier.method_44176(updater); }
// public boolean validate(byte signedData,byte signatureData) { return wrapperContained.validate(signedData,signatureData); }
// public static boolean validate(byte signedData,byte signatureData, ) { return net.minecraft.network.encryption.SignatureVerifier.validate(signedData,signatureData); }
// public boolean method_51496(java.util.Collection updatable,yarnwrap.network.encryption.SignatureUpdatable signatureData) { return wrapperContained.method_51496(updatable,signatureData.wrapperContained); }
// public static boolean method_51496(java.util.Collection updatable,yarnwrap.network.encryption.SignatureUpdatable signatureData, ) { return net.minecraft.network.encryption.SignatureVerifier.method_51496(updatable,signatureData.wrapperContained); }
// public boolean validate(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData) { return wrapperContained.validate(updatable.wrapperContained,signatureData); }
// public static boolean validate(yarnwrap.network.encryption.SignatureUpdatable updatable,byte signatureData, ) { return net.minecraft.network.encryption.SignatureVerifier.validate(updatable.wrapperContained,signatureData); }

}