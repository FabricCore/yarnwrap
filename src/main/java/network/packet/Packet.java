package yarnwrap.network.packet;
public class Packet { public net.minecraft.network.packet.Packet wrapperContained; public Packet(net.minecraft.network.packet.Packet wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isWritingErrorSkippable() { return wrapperContained.isWritingErrorSkippable(); }
public void apply(yarnwrap.network.listener.PacketListener listener) { wrapperContained.apply(listener.wrapperContained); }
public yarnwrap.network.packet.PacketType getPacketId() { return new yarnwrap.network.packet.PacketType(wrapperContained.getPacketId()); }
public boolean transitionsNetworkState() { return wrapperContained.transitionsNetworkState(); }
// public yarnwrap.network.codec.PacketCodec createCodec(yarnwrap.network.codec.ValueFirstEncoder encoder,yarnwrap.network.codec.PacketDecoder decoder) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createCodec(encoder.wrapperContained,decoder.wrapperContained)); }

}