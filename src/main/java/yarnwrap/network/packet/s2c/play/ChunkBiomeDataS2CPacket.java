package yarnwrap.network.packet.s2c.play;
public class ChunkBiomeDataS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained; public ChunkBiomeDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
// public static int MAX_SIZE() { return net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.MAX_SIZE; }
// public static void MAX_SIZE(int value, ) { net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.MAX_SIZE = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.CODEC = value.wrapperContained; }

// public ChunkBiomeDataS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket(buf.wrapperContained); }
// public yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket create(java.util.List chunks) { return new yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket(wrapperContained.create(chunks)); }
// public static yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket create(java.util.List chunks, ) { return new yarnwrap.network.packet.s2c.play.ChunkBiomeDataS2CPacket(net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.create(chunks)); }
// public void method_49686(yarnwrap.network.PacketByteBuf bufx,Object data) { wrapperContained.method_49686(bufx.wrapperContained,data); }
// public static void method_49686(yarnwrap.network.PacketByteBuf bufx,Object data, ) { net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.method_49686(bufx.wrapperContained,data); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket.write(buf.wrapperContained); }

}