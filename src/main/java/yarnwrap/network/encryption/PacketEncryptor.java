package yarnwrap.network.encryption;
public class PacketEncryptor { public net.minecraft.network.encryption.PacketEncryptor wrapperContained; public PacketEncryptor(net.minecraft.network.encryption.PacketEncryptor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(wrapperContained.manager); }
// public void manager(yarnwrap.network.encryption.PacketEncryptionManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(net.minecraft.network.encryption.PacketEncryptor.manager); }
// public static void manager(yarnwrap.network.encryption.PacketEncryptionManager value, ) { net.minecraft.network.encryption.PacketEncryptor.manager = value.wrapperContained; }

public PacketEncryptor(javax.crypto.Cipher cipher) { this.wrapperContained = new net.minecraft.network.encryption.PacketEncryptor(cipher); }
// public void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,io.netty.buffer.ByteBuf result) { wrapperContained.encode(context,buf,result); }
// public static void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,io.netty.buffer.ByteBuf result, ) { net.minecraft.network.encryption.PacketEncryptor.encode(context,buf,result); }

}