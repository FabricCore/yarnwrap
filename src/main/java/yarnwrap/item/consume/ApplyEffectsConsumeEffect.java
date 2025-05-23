package yarnwrap.item.consume;
public class ApplyEffectsConsumeEffect { public net.minecraft.item.consume.ApplyEffectsConsumeEffect wrapperContained; public ApplyEffectsConsumeEffect(net.minecraft.item.consume.ApplyEffectsConsumeEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.item.consume.ApplyEffectsConsumeEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.item.consume.ApplyEffectsConsumeEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.consume.ApplyEffectsConsumeEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.consume.ApplyEffectsConsumeEffect.PACKET_CODEC = value.wrapperContained; }

public ApplyEffectsConsumeEffect(java.util.List effects) { this.wrapperContained = new net.minecraft.item.consume.ApplyEffectsConsumeEffect(effects); }
public ApplyEffectsConsumeEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { this.wrapperContained = new net.minecraft.item.consume.ApplyEffectsConsumeEffect(effect.wrapperContained); }
public ApplyEffectsConsumeEffect(yarnwrap.entity.effect.StatusEffectInstance effect,float probability) { this.wrapperContained = new net.minecraft.item.consume.ApplyEffectsConsumeEffect(effect.wrapperContained,probability); }
// public com.mojang.datafixers.kinds.App method_62865(Object instance) { return wrapperContained.method_62865(instance); }
// public static com.mojang.datafixers.kinds.App method_62865(Object instance, ) { return net.minecraft.item.consume.ApplyEffectsConsumeEffect.method_62865(instance); }

}