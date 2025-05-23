package yarnwrap.component.type;
public class DamageResistantComponent { public net.minecraft.component.type.DamageResistantComponent wrapperContained; public DamageResistantComponent(net.minecraft.component.type.DamageResistantComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.DamageResistantComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.DamageResistantComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.DamageResistantComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.DamageResistantComponent.PACKET_CODEC = value.wrapperContained; }

public boolean resists(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.resists(damageSource.wrapperContained); }
// public static boolean resists(yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.component.type.DamageResistantComponent.resists(damageSource.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_64199(Object instance) { return wrapperContained.method_64199(instance); }
// public static com.mojang.datafixers.kinds.App method_64199(Object instance, ) { return net.minecraft.component.type.DamageResistantComponent.method_64199(instance); }

}