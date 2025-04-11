package yarnwrap.network.encryption;
public class Signer { public net.minecraft.network.encryption.Signer wrapperContained; public Signer(net.minecraft.network.encryption.Signer wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public byte[] method_44178(java.lang.String updatable) { return wrapperContained.method_44178(updatable); }
// public yarnwrap.network.encryption.Signer create(java.security.PrivateKey privateKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.Signer(wrapperContained.create(privateKey,algorithm)); }
// public byte[] sign(byte data) { return wrapperContained.sign(data); }
// public void method_44181(byte updater) { wrapperContained.method_44181(updater); }
public byte[] sign(yarnwrap.network.encryption.SignatureUpdatable updatable) { return wrapperContained.sign(updatable.wrapperContained); }

}