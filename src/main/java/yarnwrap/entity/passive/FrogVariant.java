package yarnwrap.entity.passive;
public class FrogVariant { public net.minecraft.entity.passive.FrogVariant wrapperContained; public FrogVariant(net.minecraft.entity.passive.FrogVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.passive.FrogVariant.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.passive.FrogVariant.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.entity.passive.FrogVariant register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.String id) { return new yarnwrap.entity.passive.FrogVariant(wrapperContained.register(registry.wrapperContained,key.wrapperContained,id)); }
// public static yarnwrap.entity.passive.FrogVariant register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.String id, ) { return new yarnwrap.entity.passive.FrogVariant(net.minecraft.entity.passive.FrogVariant.register(registry.wrapperContained,key.wrapperContained,id)); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.FrogVariant.of(id)); }
// public yarnwrap.entity.passive.FrogVariant registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.entity.passive.FrogVariant(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.entity.passive.FrogVariant registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.entity.passive.FrogVariant(net.minecraft.entity.passive.FrogVariant.registerAndGetDefault(registry.wrapperContained)); }

}