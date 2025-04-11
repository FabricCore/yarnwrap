package yarnwrap.registry;
public class VersionedIdentifier { public net.minecraft.registry.VersionedIdentifier wrapperContained; public VersionedIdentifier(net.minecraft.registry.VersionedIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public java.lang.String DEFAULT_NAMESPACE() { return wrapperContained.DEFAULT_NAMESPACE; }
// public void DEFAULT_NAMESPACE(java.lang.String value) { wrapperContained.DEFAULT_NAMESPACE = value; }
public boolean isVanilla() { return wrapperContained.isVanilla(); }
public yarnwrap.registry.VersionedIdentifier createVanilla(java.lang.String path) { return new yarnwrap.registry.VersionedIdentifier(wrapperContained.createVanilla(path)); }

}