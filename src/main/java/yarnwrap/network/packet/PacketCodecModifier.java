package yarnwrap.network.packet;
public class PacketCodecModifier { public net.minecraft.network.packet.PacketCodecModifier wrapperContained; public PacketCodecModifier(net.minecraft.network.packet.PacketCodecModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec apply(yarnwrap.network.codec.PacketCodec packetCodec,java.lang.Object context) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.apply(packetCodec.wrapperContained,context)); }
// public static yarnwrap.network.codec.PacketCodec apply(yarnwrap.network.codec.PacketCodec packetCodec,java.lang.Object context, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.PacketCodecModifier.apply(packetCodec.wrapperContained,context)); }

}