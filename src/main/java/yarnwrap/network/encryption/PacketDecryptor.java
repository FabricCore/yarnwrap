package yarnwrap.network.encryption;
public class PacketDecryptor { public net.minecraft.network.encryption.PacketDecryptor wrapperContained; public PacketDecryptor(net.minecraft.network.encryption.PacketDecryptor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(wrapperContained.manager); }
// public void manager(yarnwrap.network.encryption.PacketEncryptionManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(net.minecraft.network.encryption.PacketDecryptor.manager); }
// public static void manager(yarnwrap.network.encryption.PacketEncryptionManager value, ) { net.minecraft.network.encryption.PacketDecryptor.manager = value.wrapperContained; }

public PacketDecryptor(javax.crypto.Cipher cipher) { this.wrapperContained = new net.minecraft.network.encryption.PacketDecryptor(cipher); }
// public void decode(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,java.util.List result) { wrapperContained.decode(context,buf,result); }
// public static void decode(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,java.util.List result, ) { net.minecraft.network.encryption.PacketDecryptor.decode(context,buf,result); }

}