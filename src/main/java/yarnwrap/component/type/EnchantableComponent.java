package yarnwrap.component.type;
public class EnchantableComponent { public net.minecraft.component.type.EnchantableComponent wrapperContained; public EnchantableComponent(net.minecraft.component.type.EnchantableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.EnchantableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.EnchantableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.EnchantableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.EnchantableComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_61710(Object instance) { return wrapperContained.method_61710(instance); }
// public static com.mojang.datafixers.kinds.App method_61710(Object instance, ) { return net.minecraft.component.type.EnchantableComponent.method_61710(instance); }

}