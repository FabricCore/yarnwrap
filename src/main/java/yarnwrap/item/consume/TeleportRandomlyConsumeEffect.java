package yarnwrap.item.consume;
public class TeleportRandomlyConsumeEffect { public net.minecraft.item.consume.TeleportRandomlyConsumeEffect wrapperContained; public TeleportRandomlyConsumeEffect(net.minecraft.item.consume.TeleportRandomlyConsumeEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.item.consume.TeleportRandomlyConsumeEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.item.consume.TeleportRandomlyConsumeEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.consume.TeleportRandomlyConsumeEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.consume.TeleportRandomlyConsumeEffect.PACKET_CODEC = value.wrapperContained; }

// public float DEFAULT_DIAMETER() { return wrapperContained.DEFAULT_DIAMETER; }
// public void DEFAULT_DIAMETER(float value) { wrapperContained.DEFAULT_DIAMETER = value; }
// public static float DEFAULT_DIAMETER() { return net.minecraft.item.consume.TeleportRandomlyConsumeEffect.DEFAULT_DIAMETER; }
// public static void DEFAULT_DIAMETER(float value, ) { net.minecraft.item.consume.TeleportRandomlyConsumeEffect.DEFAULT_DIAMETER = value; }

// public com.mojang.datafixers.kinds.App method_62870(Object instance) { return wrapperContained.method_62870(instance); }
// public static com.mojang.datafixers.kinds.App method_62870(Object instance, ) { return net.minecraft.item.consume.TeleportRandomlyConsumeEffect.method_62870(instance); }

}