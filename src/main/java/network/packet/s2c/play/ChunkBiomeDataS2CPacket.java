package yarnwrap.network.packet.s2c.play;
public class ChunkBiomeDataS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained; public ChunkBiomeDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket create(java.util.List chunks) { return new yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket(wrapperContained.create(chunks)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}