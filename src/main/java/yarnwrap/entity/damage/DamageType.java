package yarnwrap.entity.damage;
public class DamageType { public net.minecraft.entity.damage.DamageType wrapperContained; public DamageType(net.minecraft.entity.damage.DamageType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.damage.DamageType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.damage.DamageType.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.damage.DamageType.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.damage.DamageType.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.damage.DamageType.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.damage.DamageType.ENTRY_PACKET_CODEC = value.wrapperContained; }

public DamageType(java.lang.String msgId,float exhaustion) { this.wrapperContained = new net.minecraft.entity.damage.DamageType(msgId,exhaustion); }
public DamageType(java.lang.String msgId,float exhaustion,yarnwrap.entity.damage.DamageEffects effects) { this.wrapperContained = new net.minecraft.entity.damage.DamageType(msgId,exhaustion,effects.wrapperContained); }
public DamageType(java.lang.String msgId,yarnwrap.entity.damage.DamageScaling scaling,float exhaustion) { this.wrapperContained = new net.minecraft.entity.damage.DamageType(msgId,scaling.wrapperContained,exhaustion); }
public DamageType(java.lang.String msgId,yarnwrap.entity.damage.DamageScaling scaling,float exhaustion,yarnwrap.entity.damage.DamageEffects effects) { this.wrapperContained = new net.minecraft.entity.damage.DamageType(msgId,scaling.wrapperContained,exhaustion,effects.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_48838(Object instance) { return wrapperContained.method_48838(instance); }
// public static com.mojang.datafixers.kinds.App method_48838(Object instance, ) { return net.minecraft.entity.damage.DamageType.method_48838(instance); }

}