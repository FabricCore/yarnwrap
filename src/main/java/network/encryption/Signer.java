package yarnwrap.network.encryption;
public class Signer { public net.minecraft.network.encryption.Signer wrapperContained; public Signer(net.minecraft.network.encryption.Signer wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.encryption.Signer create(java.security.PrivateKey privateKey,java.lang.String algorithm) { return new yarnwrap.network.encryption.Signer(wrapperContained.create(privateKey,algorithm)); }
// public byte[] sign(byte data) { return wrapperContained.sign(data); }

}