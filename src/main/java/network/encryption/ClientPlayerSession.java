package yarnwrap.network.encryption;
public class ClientPlayerSession { public net.minecraft.network.encryption.ClientPlayerSession wrapperContained; public ClientPlayerSession(net.minecraft.network.encryption.ClientPlayerSession wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.encryption.ClientPlayerSession create(yarnwrap.network.encryption.PlayerKeyPair keyPair) { return new yarnwrap.network.encryption.ClientPlayerSession(wrapperContained.create(keyPair.wrapperContained)); }
public Object createPacker(java.util.UUID sender) { return wrapperContained.createPacker(sender); }
public yarnwrap.network.encryption.PublicPlayerSession toPublicSession() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.toPublicSession()); }

}