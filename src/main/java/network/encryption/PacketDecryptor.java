package yarnwrap.network.encryption;
public class PacketDecryptor { public net.minecraft.network.encryption.PacketDecryptor wrapperContained; public PacketDecryptor(net.minecraft.network.encryption.PacketDecryptor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(wrapperContained.manager); }

}