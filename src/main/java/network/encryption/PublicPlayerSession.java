package yarnwrap.network.encryption;
public class PublicPlayerSession { public net.minecraft.network.encryption.PublicPlayerSession wrapperContained; public PublicPlayerSession(net.minecraft.network.encryption.PublicPlayerSession wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(wrapperContained.publicKeyData); }
// public yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(wrapperContained.publicKeyData()); }
public yarnwrap.network.message.MessageVerifier createVerifier(java.time.Duration gracePeriod) { return new yarnwrap.network.message.MessageVerifier(wrapperContained.createVerifier(gracePeriod)); }
public Object createUnpacker(java.util.UUID sender) { return wrapperContained.createUnpacker(sender); }
public Object toSerialized() { return wrapperContained.toSerialized(); }
public boolean isKeyExpired() { return wrapperContained.isKeyExpired(); }

}