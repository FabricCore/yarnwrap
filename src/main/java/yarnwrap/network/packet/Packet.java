package yarnwrap.network.packet;
public class Packet { public net.minecraft.network.packet.Packet wrapperContained; public Packet(net.minecraft.network.packet.Packet wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isWritingErrorSkippable() { return wrapperContained.isWritingErrorSkippable(); }
// public static boolean isWritingErrorSkippable() { return net.minecraft.network.packet.Packet.isWritingErrorSkippable(); }
public boolean transitionsNetworkState() { return wrapperContained.transitionsNetworkState(); }
// public static boolean transitionsNetworkState() { return net.minecraft.network.packet.Packet.transitionsNetworkState(); }
// public yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.network.codec.ValueFirstEncoder encoder,yarnwrap.network.codec.PacketDecoder decoder) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(encoder.wrapperContained,decoder.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.network.codec.ValueFirstEncoder encoder,yarnwrap.network.codec.PacketDecoder decoder, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.Packet.createCodec(encoder.wrapperContained,decoder.wrapperContained)); }
public yarnwrap.network.packet.PacketType getPacketType() { return new yarnwrap.network.packet.PacketType(wrapperContained.getPacketType()); }
// public static yarnwrap.network.packet.PacketType getPacketType() { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.Packet.getPacketType()); }
public void apply(yarnwrap.network.listener.PacketListener listener) { wrapperContained.apply(listener.wrapperContained); }
// public static void apply(yarnwrap.network.listener.PacketListener listener, ) { net.minecraft.network.packet.Packet.apply(listener.wrapperContained); }

}