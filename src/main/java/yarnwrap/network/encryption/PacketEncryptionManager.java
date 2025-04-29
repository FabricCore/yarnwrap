package yarnwrap.network.encryption;
public class PacketEncryptionManager { public net.minecraft.network.encryption.PacketEncryptionManager wrapperContained; public PacketEncryptionManager(net.minecraft.network.encryption.PacketEncryptionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public javax.crypto.Cipher cipher() { return wrapperContained.cipher; }
// public void cipher(javax.crypto.Cipher value) { wrapperContained.cipher = value; }
// public static javax.crypto.Cipher cipher() { return net.minecraft.network.encryption.PacketEncryptionManager.cipher; }
// public static void cipher(javax.crypto.Cipher value, ) { net.minecraft.network.encryption.PacketEncryptionManager.cipher = value; }

// public byte[] conversionBuffer() { return wrapperContained.conversionBuffer; }
// public void conversionBuffer(byte[] value) { wrapperContained.conversionBuffer = value; }
// public static byte[] conversionBuffer() { return net.minecraft.network.encryption.PacketEncryptionManager.conversionBuffer; }
// public static void conversionBuffer(byte[] value, ) { net.minecraft.network.encryption.PacketEncryptionManager.conversionBuffer = value; }

// public byte[] encryptionBuffer() { return wrapperContained.encryptionBuffer; }
// public void encryptionBuffer(byte[] value) { wrapperContained.encryptionBuffer = value; }
// public static byte[] encryptionBuffer() { return net.minecraft.network.encryption.PacketEncryptionManager.encryptionBuffer; }
// public static void encryptionBuffer(byte[] value, ) { net.minecraft.network.encryption.PacketEncryptionManager.encryptionBuffer = value; }

// public PacketEncryptionManager(javax.crypto.Cipher cipher) { this.wrapperContained = new net.minecraft.network.encryption.PacketEncryptionManager(cipher); }
// public void encrypt(io.netty.buffer.ByteBuf buf,io.netty.buffer.ByteBuf result) { wrapperContained.encrypt(buf,result); }
// public static void encrypt(io.netty.buffer.ByteBuf buf,io.netty.buffer.ByteBuf result, ) { net.minecraft.network.encryption.PacketEncryptionManager.encrypt(buf,result); }
// public byte[] toByteArray(io.netty.buffer.ByteBuf buf) { return wrapperContained.toByteArray(buf); }
// public static byte[] toByteArray(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.encryption.PacketEncryptionManager.toByteArray(buf); }
// public io.netty.buffer.ByteBuf decrypt(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf) { return wrapperContained.decrypt(context,buf); }
// public static io.netty.buffer.ByteBuf decrypt(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.encryption.PacketEncryptionManager.decrypt(context,buf); }

}