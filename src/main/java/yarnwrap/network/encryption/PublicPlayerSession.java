package yarnwrap.network.encryption;
public class PublicPlayerSession { public net.minecraft.network.encryption.PublicPlayerSession wrapperContained; public PublicPlayerSession(net.minecraft.network.encryption.PublicPlayerSession wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(wrapperContained.publicKeyData); }
// public void publicKeyData(yarnwrap.network.encryption.PlayerPublicKey value) { wrapperContained.publicKeyData = value.wrapperContained; }
// public static yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(net.minecraft.network.encryption.PublicPlayerSession.publicKeyData); }
// public static void publicKeyData(yarnwrap.network.encryption.PlayerPublicKey value, ) { net.minecraft.network.encryption.PublicPlayerSession.publicKeyData = value.wrapperContained; }

// public yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(wrapperContained.publicKeyData()); }
// // public static yarnwrap.network.encryption.PlayerPublicKey publicKeyData() { return new yarnwrap.network.encryption.PlayerPublicKey(net.minecraft.network.encryption.PublicPlayerSession.publicKeyData()); }
public yarnwrap.network.message.MessageVerifier createVerifier(java.time.Duration gracePeriod) { return new yarnwrap.network.message.MessageVerifier(wrapperContained.createVerifier(gracePeriod)); }
// public static yarnwrap.network.message.MessageVerifier createVerifier(java.time.Duration gracePeriod, ) { return new yarnwrap.network.message.MessageVerifier(net.minecraft.network.encryption.PublicPlayerSession.createVerifier(gracePeriod)); }
public Object createUnpacker(java.util.UUID sender) { return wrapperContained.createUnpacker(sender); }
// public static Object createUnpacker(java.util.UUID sender, ) { return net.minecraft.network.encryption.PublicPlayerSession.createUnpacker(sender); }
public Object toSerialized() { return wrapperContained.toSerialized(); }
// public static Object toSerialized() { return net.minecraft.network.encryption.PublicPlayerSession.toSerialized(); }
public boolean isKeyExpired() { return wrapperContained.isKeyExpired(); }
// public static boolean isKeyExpired() { return net.minecraft.network.encryption.PublicPlayerSession.isKeyExpired(); }

}