package yarnwrap.network.packet.s2c.play;
public class ChunkRenderDistanceCenterS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket wrapperContained; public ChunkRenderDistanceCenterS2CPacket(net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkX() { return wrapperContained.chunkX; }
// public int chunkZ() { return wrapperContained.chunkZ; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getChunkX() { return wrapperContained.getChunkX(); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}