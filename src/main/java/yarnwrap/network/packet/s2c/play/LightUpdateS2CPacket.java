package yarnwrap.network.packet.s2c.play;
public class LightUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained; public LightUpdateS2CPacket(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkZ() { return wrapperContained.chunkZ; }
// public void chunkZ(int value) { wrapperContained.chunkZ = value; }
// public static int chunkZ() { return net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.chunkZ; }
// public static void chunkZ(int value, ) { net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.chunkZ = value; }

// public int chunkX() { return wrapperContained.chunkX; }
// public void chunkX(int value) { wrapperContained.chunkX = value; }
// public static int chunkX() { return net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.chunkX; }
// public static void chunkX(int value, ) { net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.chunkX = value; }

// public yarnwrap.network.packet.s2c.play.LightData data() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.data); }
// public void data(yarnwrap.network.packet.s2c.play.LightData value) { wrapperContained.data = value.wrapperContained; }
// public static yarnwrap.network.packet.s2c.play.LightData data() { return new yarnwrap.network.packet.s2c.play.LightData(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.data); }
// public static void data(yarnwrap.network.packet.s2c.play.LightData value, ) { net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.data = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.CODEC = value.wrapperContained; }

public LightUpdateS2CPacket(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.chunk.light.LightingProvider lightProvider,java.util.BitSet skyBits,java.util.BitSet blockBits) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket(chunkPos.wrapperContained,lightProvider.wrapperContained,skyBits,blockBits); }
// public LightUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket(buf.wrapperContained); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
// public static int getChunkZ() { return net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.getChunkZ(); }
public int getChunkX() { return wrapperContained.getChunkX(); }
// public static int getChunkX() { return net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.getChunkX(); }
public yarnwrap.network.packet.s2c.play.LightData getData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.getData()); }
// public static yarnwrap.network.packet.s2c.play.LightData getData() { return new yarnwrap.network.packet.s2c.play.LightData(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.getData()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket.write(buf.wrapperContained); }

}