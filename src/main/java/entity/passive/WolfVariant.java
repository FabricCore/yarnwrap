package yarnwrap.entity.passive;
public class WolfVariant { public net.minecraft.entity.passive.WolfVariant wrapperContained; public WolfVariant(net.minecraft.entity.passive.WolfVariant wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public yarnwrap.util.Identifier wildId() { return new yarnwrap.util.Identifier(wrapperContained.wildId); }
// public yarnwrap.util.Identifier tameId() { return new yarnwrap.util.Identifier(wrapperContained.tameId); }
// public yarnwrap.util.Identifier angryId() { return new yarnwrap.util.Identifier(wrapperContained.angryId); }
// public yarnwrap.util.Identifier wildTextureId() { return new yarnwrap.util.Identifier(wrapperContained.wildTextureId); }
// public yarnwrap.util.Identifier tameTextureId() { return new yarnwrap.util.Identifier(wrapperContained.tameTextureId); }
// public yarnwrap.util.Identifier angryTextureId() { return new yarnwrap.util.Identifier(wrapperContained.angryTextureId); }
// public yarnwrap.registry.entry.RegistryEntryList biomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.biomes); }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
public yarnwrap.util.Identifier getWildTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getWildTextureId()); }
// public yarnwrap.util.Identifier getTextureId(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.getTextureId(id.wrapperContained)); }
public yarnwrap.util.Identifier getTameTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTameTextureId()); }
public yarnwrap.util.Identifier getAngryTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getAngryTextureId()); }
public yarnwrap.registry.entry.RegistryEntryList getBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getBiomes()); }

}