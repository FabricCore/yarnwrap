package yarnwrap.network.encryption;
public class PacketEncryptor { public net.minecraft.network.encryption.PacketEncryptor wrapperContained; public PacketEncryptor(net.minecraft.network.encryption.PacketEncryptor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PacketEncryptionManager manager() { return new yarnwrap.network.encryption.PacketEncryptionManager(wrapperContained.manager); }
// public void manager(yarnwrap.network.encryption.PacketEncryptionManager value) { wrapperContained.manager = value.wrapperContained; }

}