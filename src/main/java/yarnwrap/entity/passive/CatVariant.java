package yarnwrap.entity.passive;
public class CatVariant { public net.minecraft.entity.passive.CatVariant wrapperContained; public CatVariant(net.minecraft.entity.passive.CatVariant wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.entity.passive.CatVariant register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.String textureId) { return new yarnwrap.entity.passive.CatVariant(wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureId)); }
public yarnwrap.entity.passive.CatVariant registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.entity.passive.CatVariant(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}