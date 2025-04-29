package yarnwrap.network.packet.s2c.play;
public class ChunkDeltaUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket wrapperContained; public ChunkDeltaUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.sectionPos); }
// public void sectionPos(yarnwrap.util.math.ChunkSectionPos value) { wrapperContained.sectionPos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.sectionPos); }
// public static void sectionPos(yarnwrap.util.math.ChunkSectionPos value, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.sectionPos = value.wrapperContained; }

// public short[] positions() { return wrapperContained.positions; }
// public void positions(short[] value) { wrapperContained.positions = value; }
// public static short[] positions() { return net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.positions; }
// public static void positions(short[] value, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.positions = value; }

// public net.minecraft.block.BlockState[] blockStates() { return wrapperContained.blockStates; }
// public void blockStates(net.minecraft.block.BlockState[] value) { wrapperContained.blockStates = value; }
// public static net.minecraft.block.BlockState[] blockStates() { return net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.blockStates; }
// public static void blockStates(net.minecraft.block.BlockState[] value, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.blockStates = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.CODEC = value.wrapperContained; }

// public ChunkDeltaUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket(buf.wrapperContained); }
public ChunkDeltaUpdateS2CPacket(yarnwrap.util.math.ChunkSectionPos sectionPos,it.unimi.dsi.fastutil.shorts.ShortSet positions,yarnwrap.world.chunk.ChunkSection section) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket(sectionPos.wrapperContained,positions,section.wrapperContained); }
public void visitUpdates(java.util.function.BiConsumer visitor) { wrapperContained.visitUpdates(visitor); }
// public static void visitUpdates(java.util.function.BiConsumer visitor, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.visitUpdates(visitor); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.write(buf.wrapperContained); }

}