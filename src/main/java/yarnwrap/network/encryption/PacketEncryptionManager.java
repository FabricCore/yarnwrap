package yarnwrap.network.encryption;
public class PacketEncryptionManager { public net.minecraft.network.encryption.PacketEncryptionManager wrapperContained; public PacketEncryptionManager(net.minecraft.network.encryption.PacketEncryptionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public javax.crypto.Cipher cipher() { return wrapperContained.cipher; }
// public void cipher(javax.crypto.Cipher value) { wrapperContained.cipher = value; }
// public byte[] conversionBuffer() { return wrapperContained.conversionBuffer; }
// public void conversionBuffer(byte[] value) { wrapperContained.conversionBuffer = value; }
// public byte[] encryptionBuffer() { return wrapperContained.encryptionBuffer; }
// public void encryptionBuffer(byte[] value) { wrapperContained.encryptionBuffer = value; }
// public PacketEncryptionManager(javax.crypto.Cipher cipher) { this.wrapperContained = new net.minecraft.network.encryption.PacketEncryptionManager(cipher); }
// public void encrypt(io.netty.buffer.ByteBuf buf,io.netty.buffer.ByteBuf result) { wrapperContained.encrypt(buf,result); }
// public byte[] toByteArray(io.netty.buffer.ByteBuf buf) { return wrapperContained.toByteArray(buf); }
// public io.netty.buffer.ByteBuf decrypt(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf) { return wrapperContained.decrypt(context,buf); }

}