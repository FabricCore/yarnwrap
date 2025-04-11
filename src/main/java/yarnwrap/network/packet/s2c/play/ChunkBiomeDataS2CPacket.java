package yarnwrap.network.packet.s2c.play;
public class ChunkBiomeDataS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained; public ChunkBiomeDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public ChunkBiomeDataS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket(buf.wrapperContained); }
public yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket create(java.util.List chunks) { return new yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket(wrapperContained.create(chunks)); }
// public void method_49686(yarnwrap.network.PacketByteBuf bufx,Object data) { wrapperContained.method_49686(bufx.wrapperContained,data); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}