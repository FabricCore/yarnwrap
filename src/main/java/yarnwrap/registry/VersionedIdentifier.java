package yarnwrap.registry;
public class VersionedIdentifier { public net.minecraft.registry.VersionedIdentifier wrapperContained; public VersionedIdentifier(net.minecraft.registry.VersionedIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.registry.VersionedIdentifier.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.registry.VersionedIdentifier.PACKET_CODEC = value.wrapperContained; }

// public java.lang.String DEFAULT_NAMESPACE() { return wrapperContained.DEFAULT_NAMESPACE; }
// public void DEFAULT_NAMESPACE(java.lang.String value) { wrapperContained.DEFAULT_NAMESPACE = value; }
public static java.lang.String DEFAULT_NAMESPACE() { return net.minecraft.registry.VersionedIdentifier.DEFAULT_NAMESPACE; }
// public static void DEFAULT_NAMESPACE(java.lang.String value, ) { net.minecraft.registry.VersionedIdentifier.DEFAULT_NAMESPACE = value; }

public boolean isVanilla() { return wrapperContained.isVanilla(); }
// public static boolean isVanilla() { return net.minecraft.registry.VersionedIdentifier.isVanilla(); }
// public yarnwrap.registry.VersionedIdentifier createVanilla(java.lang.String path) { return new yarnwrap.registry.VersionedIdentifier(wrapperContained.createVanilla(path)); }
// public static yarnwrap.registry.VersionedIdentifier createVanilla(java.lang.String path, ) { return new yarnwrap.registry.VersionedIdentifier(net.minecraft.registry.VersionedIdentifier.createVanilla(path)); }

}