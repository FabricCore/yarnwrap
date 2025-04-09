package yarnwrap.scoreboard.number;
public class NumberFormatTypes { public net.minecraft.scoreboard.number.NumberFormatTypes wrapperContained; public NumberFormatTypes(net.minecraft.scoreboard.number.NumberFormatTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
public yarnwrap.scoreboard.number.NumberFormatType registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }

}