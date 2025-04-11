package yarnwrap.network.packet.s2c.play;
public class LightUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained; public LightUpdateS2CPacket(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkZ() { return wrapperContained.chunkZ; }
// public void chunkZ(int value) { wrapperContained.chunkZ = value; }
// public int chunkX() { return wrapperContained.chunkX; }
// public void chunkX(int value) { wrapperContained.chunkX = value; }
// public yarnwrap.network.packet.s2c.play.LightData data() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.data); }
// public void data(yarnwrap.network.packet.s2c.play.LightData value) { wrapperContained.data = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
public int getChunkX() { return wrapperContained.getChunkX(); }
public yarnwrap.network.packet.s2c.play.LightData getData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.getData()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}