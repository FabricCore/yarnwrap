package yarnwrap.network.packet.s2c.play;
public class ChunkLoadDistanceS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket wrapperContained; public ChunkLoadDistanceS2CPacket(net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int distance() { return wrapperContained.distance; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getDistance() { return wrapperContained.getDistance(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}