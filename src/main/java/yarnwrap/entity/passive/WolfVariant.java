package yarnwrap.entity.passive;
public class WolfVariant { public net.minecraft.entity.passive.WolfVariant wrapperContained; public WolfVariant(net.minecraft.entity.passive.WolfVariant wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
// public yarnwrap.util.Identifier wildId() { return new yarnwrap.util.Identifier(wrapperContained.wildId); }
// public void wildId(yarnwrap.util.Identifier value) { wrapperContained.wildId = value.wrapperContained; }
// public yarnwrap.util.Identifier tameId() { return new yarnwrap.util.Identifier(wrapperContained.tameId); }
// public void tameId(yarnwrap.util.Identifier value) { wrapperContained.tameId = value.wrapperContained; }
// public yarnwrap.util.Identifier angryId() { return new yarnwrap.util.Identifier(wrapperContained.angryId); }
// public void angryId(yarnwrap.util.Identifier value) { wrapperContained.angryId = value.wrapperContained; }
// public yarnwrap.util.Identifier wildTextureId() { return new yarnwrap.util.Identifier(wrapperContained.wildTextureId); }
// public void wildTextureId(yarnwrap.util.Identifier value) { wrapperContained.wildTextureId = value.wrapperContained; }
// public yarnwrap.util.Identifier tameTextureId() { return new yarnwrap.util.Identifier(wrapperContained.tameTextureId); }
// public void tameTextureId(yarnwrap.util.Identifier value) { wrapperContained.tameTextureId = value.wrapperContained; }
// public yarnwrap.util.Identifier angryTextureId() { return new yarnwrap.util.Identifier(wrapperContained.angryTextureId); }
// public void angryTextureId(yarnwrap.util.Identifier value) { wrapperContained.angryTextureId = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntryList biomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.biomes); }
// public void biomes(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.biomes = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public WolfVariant(yarnwrap.util.Identifier wildId,yarnwrap.util.Identifier tameId,yarnwrap.util.Identifier angryId,yarnwrap.registry.entry.RegistryEntryList biomes) { this.wrapperContained = new net.minecraft.entity.passive.WolfVariant(wildId.wrapperContained,tameId.wrapperContained,angryId.wrapperContained,biomes.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public com.mojang.datafixers.kinds.App method_58064(Object instance) { return wrapperContained.method_58064(instance); }
public yarnwrap.util.Identifier getWildTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getWildTextureId()); }
// public yarnwrap.util.Identifier getTextureId(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.getTextureId(id.wrapperContained)); }
// public yarnwrap.util.Identifier method_58379(yarnwrap.entity.passive.WolfVariant wolfVariant) { return new yarnwrap.util.Identifier(wrapperContained.method_58379(wolfVariant.wrapperContained)); }
// public java.lang.String method_58380(java.lang.String oldPath) { return wrapperContained.method_58380(oldPath); }
public yarnwrap.util.Identifier getTameTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTameTextureId()); }
// public yarnwrap.util.Identifier method_58382(yarnwrap.entity.passive.WolfVariant wolfVariant) { return new yarnwrap.util.Identifier(wrapperContained.method_58382(wolfVariant.wrapperContained)); }
public yarnwrap.util.Identifier getAngryTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getAngryTextureId()); }
// public yarnwrap.util.Identifier method_58384(yarnwrap.entity.passive.WolfVariant wolfVariant) { return new yarnwrap.util.Identifier(wrapperContained.method_58384(wolfVariant.wrapperContained)); }
public yarnwrap.registry.entry.RegistryEntryList getBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getBiomes()); }

}