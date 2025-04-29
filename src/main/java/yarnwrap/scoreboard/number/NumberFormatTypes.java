package yarnwrap.scoreboard.number;
public class NumberFormatTypes { public net.minecraft.scoreboard.number.NumberFormatTypes wrapperContained; public NumberFormatTypes(net.minecraft.scoreboard.number.NumberFormatTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.MapCodec REGISTRY_CODEC() { return net.minecraft.scoreboard.number.NumberFormatTypes.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.scoreboard.number.NumberFormatTypes.REGISTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.scoreboard.number.NumberFormatTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.scoreboard.number.NumberFormatTypes.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.scoreboard.number.NumberFormatTypes.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.scoreboard.number.NumberFormatTypes.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.scoreboard.number.NumberFormatTypes.OPTIONAL_PACKET_CODEC); }
// public static void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.scoreboard.number.NumberFormatTypes.OPTIONAL_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.scoreboard.number.NumberFormatType registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.scoreboard.number.NumberFormatType registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.scoreboard.number.NumberFormatType(net.minecraft.scoreboard.number.NumberFormatTypes.registerAndGetDefault(registry.wrapperContained)); }

}