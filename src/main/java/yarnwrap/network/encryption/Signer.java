package yarnwrap.network.encryption;
public class Signer { public net.minecraft.network.encryption.Signer wrapperContained; public Signer(net.minecraft.network.encryption.Signer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.network.encryption.Signer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.encryption.Signer.LOGGER = value; }

// public byte[] method_44178(java.lang.String updatable) { return wrapperContained.method_44178(updatable); }
// public static byte[] method_44178(java.lang.String updatable, ) { return net.minecraft.network.encryption.Signer.method_44178(updatable); }
// public yarnwrap.network.encryption.Signer create(java.security.PrivateKey privateKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.Signer(wrapperContained.create(privateKey,algorithm)); }
// public static yarnwrap.network.encryption.Signer create(java.security.PrivateKey privateKey,java.lang.String algorithm, ) { return new yarnwrap.network.encryption.Signer(net.minecraft.network.encryption.Signer.create(privateKey,algorithm)); }
// public byte[] sign(byte data) { return wrapperContained.sign(data); }
// public static byte[] sign(byte data, ) { return net.minecraft.network.encryption.Signer.sign(data); }
// public void method_44181(byte updater) { wrapperContained.method_44181(updater); }
// public static void method_44181(byte updater, ) { net.minecraft.network.encryption.Signer.method_44181(updater); }
public byte[] sign(yarnwrap.network.encryption.SignatureUpdatable updatable) { return wrapperContained.sign(updatable.wrapperContained); }
// public static byte[] sign(yarnwrap.network.encryption.SignatureUpdatable updatable, ) { return net.minecraft.network.encryption.Signer.sign(updatable.wrapperContained); }

}