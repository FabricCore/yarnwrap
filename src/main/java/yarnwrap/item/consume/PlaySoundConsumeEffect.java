package yarnwrap.item.consume;
public class PlaySoundConsumeEffect { public net.minecraft.item.consume.PlaySoundConsumeEffect wrapperContained; public PlaySoundConsumeEffect(net.minecraft.item.consume.PlaySoundConsumeEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.item.consume.PlaySoundConsumeEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.item.consume.PlaySoundConsumeEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.consume.PlaySoundConsumeEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.consume.PlaySoundConsumeEffect.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_62868(Object instance) { return wrapperContained.method_62868(instance); }
// public static com.mojang.datafixers.kinds.App method_62868(Object instance, ) { return net.minecraft.item.consume.PlaySoundConsumeEffect.method_62868(instance); }

}