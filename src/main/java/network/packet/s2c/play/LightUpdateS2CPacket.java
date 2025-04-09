package yarnwrap.network.packet.s2c.play;
public class LightUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained; public LightUpdateS2CPacket(net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int chunkZ() { return wrapperContained.chunkZ; }
// public int chunkX() { return wrapperContained.chunkX; }
// public yarnwrap.network.packet.s2c.play.LightData data() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.data); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getChunkZ() { return wrapperContained.getChunkZ(); }
public int getChunkX() { return wrapperContained.getChunkX(); }
public yarnwrap.network.packet.s2c.play.LightData getData() { return new yarnwrap.network.packet.s2c.play.LightData(wrapperContained.getData()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}