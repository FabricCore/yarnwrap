package yarnwrap.network.packet.c2s.login;
public class LoginKeyC2SPacket { public net.minecraft.network.packet.c2s.login.LoginKeyC2SPacket wrapperContained; public LoginKeyC2SPacket(net.minecraft.network.packet.c2s.login.LoginKeyC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] encryptedSecretKey() { return wrapperContained.encryptedSecretKey; }
// public void encryptedSecretKey(byte[] value) { wrapperContained.encryptedSecretKey = value; }
// public byte[] nonce() { return wrapperContained.nonce; }
// public void nonce(byte[] value) { wrapperContained.nonce = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public LoginKeyC2SPacket(javax.crypto.SecretKey secretKey,java.security.PublicKey publicKey,byte nonce) { this.wrapperContained = new net.minecraft.network.packet.c2s.login.LoginKeyC2SPacket(secretKey,publicKey,nonce); }
// public LoginKeyC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.login.LoginKeyC2SPacket(buf.wrapperContained); }
// public javax.crypto.SecretKey decryptSecretKey(java.security.PrivateKey privateKey) { return wrapperContained.decryptSecretKey(privateKey); }
// public boolean verifySignedNonce(byte nonce,java.security.PrivateKey[] privateKey) { return wrapperContained.verifySignedNonce(nonce,privateKey); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}