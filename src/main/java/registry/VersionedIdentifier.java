package yarnwrap.registry;
public class VersionedIdentifier { public net.minecraft.registry.VersionedIdentifier wrapperContained; public VersionedIdentifier(net.minecraft.registry.VersionedIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public java.lang.String DEFAULT_NAMESPACE() { return wrapperContained.DEFAULT_NAMESPACE; }
public boolean isVanilla() { return wrapperContained.isVanilla(); }
public yarnwrap.registry.VersionedIdentifier createVanilla(java.lang.String path) { return new yarnwrap.registry.VersionedIdentifier(wrapperContained.createVanilla(path)); }

}