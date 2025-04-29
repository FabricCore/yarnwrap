package yarnwrap.network.packet.s2c.play;
public class ChunkDataS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket wrapperContained; public ChunkDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkZ() { return wrapperContained.chunkZ; }
// public void chunkZ(int value) { wrapperContained.chunkZ = value; }
// public static int chunkZ() { return net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkZ; }
// public static void chunkZ(int value, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkZ = value; }

// public int chunkX() { return wrapperContained.chunkX; }
// public void chunkX(int value) { wrapperContained.chunkX = value; }
// public static int chunkX() { return net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkX; }
// public static void chunkX(int value, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkX = value; }

// public yarnwrap.network.packet.s2c.play.ChunkData chunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(wrapperContained.chunkData); }
// public void chunkData(yarnwrap.network.packet.s2c.play.ChunkData value) { wrapperContained.chunkData = value.wrapperContained; }
// public static yarnwrap.network.packet.s2c.play.ChunkData chunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkData); }
// public static void chunkData(yarnwrap.network.packet.s2c.play.ChunkData value, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.chunkData = value.wrapperContained; }

// public yarnwrap.network.packet.s2c.play.LightData lightData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.lightData); }
// public void lightData(yarnwrap.network.packet.s2c.play.LightData value) { wrapperContained.lightData = value.wrapperContained; }
// public static yarnwrap.network.packet.s2c.play.LightData lightData() { return new yarnwrap.network.packet.s2c.play.LightData(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.lightData); }
// public static void lightData(yarnwrap.network.packet.s2c.play.LightData value, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.lightData = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.CODEC = value.wrapperContained; }

public ChunkDataS2CPacket(yarnwrap.world.chunk.WorldChunk chunk,yarnwrap.world.chunk.light.LightingProvider lightProvider,java.util.BitSet skyBits,java.util.BitSet blockBits) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket(chunk.wrapperContained,lightProvider.wrapperContained,skyBits,blockBits); }
// public ChunkDataS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket(buf.wrapperContained); }
public int getChunkX() { return wrapperContained.getChunkX(); }
// public static int getChunkX() { return net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.getChunkX(); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
// public static int getChunkZ() { return net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.getChunkZ(); }
public yarnwrap.network.packet.s2c.play.ChunkData getChunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(wrapperContained.getChunkData()); }
// public static yarnwrap.network.packet.s2c.play.ChunkData getChunkData() { return new yarnwrap.network.packet.s2c.play.ChunkData(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.getChunkData()); }
public yarnwrap.network.packet.s2c.play.LightData getLightData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.getLightData()); }
// public static yarnwrap.network.packet.s2c.play.LightData getLightData() { return new yarnwrap.network.packet.s2c.play.LightData(net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.getLightData()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket.write(buf.wrapperContained); }

}