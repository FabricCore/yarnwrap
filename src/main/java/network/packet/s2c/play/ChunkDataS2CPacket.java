package yarnwrap.network.packet.s2c.play;
public class ChunkDataS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket wrapperContained; public ChunkDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkZ() { return wrapperContained.chunkZ; }
// public int chunkX() { return wrapperContained.chunkX; }
// public yarnwrap.network.packet.s2c.play.ChunkData chunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(wrapperContained.chunkData); }
// public yarnwrap.network.packet.s2c.play.LightData lightData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.lightData); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getChunkX() { return wrapperContained.getChunkX(); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
public yarnwrap.network.packet.s2c.play.ChunkData getChunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(wrapperContained.getChunkData()); }
public yarnwrap.network.packet.s2c.play.LightData getLightData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.getLightData()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}