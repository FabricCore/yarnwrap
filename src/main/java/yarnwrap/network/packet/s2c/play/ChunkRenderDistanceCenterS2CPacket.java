package yarnwrap.network.packet.s2c.play;
public class ChunkRenderDistanceCenterS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket wrapperContained; public ChunkRenderDistanceCenterS2CPacket(net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkX() { return wrapperContained.chunkX; }
// public void chunkX(int value) { wrapperContained.chunkX = value; }
// public int chunkZ() { return wrapperContained.chunkZ; }
// public void chunkZ(int value) { wrapperContained.chunkZ = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public ChunkRenderDistanceCenterS2CPacket(int x,int z) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket(x,z); }
// public ChunkRenderDistanceCenterS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket(buf.wrapperContained); }
public int getChunkX() { return wrapperContained.getChunkX(); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}