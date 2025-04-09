package yarnwrap.network.packet.s2c.play;
public class StartChunkSendS2CPacket { public net.minecraft.network.packet.s2c.play.StartChunkSendS2CPacket wrapperContained; public StartChunkSendS2CPacket(net.minecraft.network.packet.s2c.play.StartChunkSendS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.s2c.play.StartChunkSendS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.play.StartChunkSendS2CPacket(wrapperContained.INSTANCE); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}