package yarnwrap.network.packet.s2c.play;
public class ChunkDeltaUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket wrapperContained; public ChunkDeltaUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.sectionPos); }
// public short[] positions() { return wrapperContained.positions; }
// public net.minecraft.block.BlockState[] blockStates() { return wrapperContained.blockStates; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public void visitUpdates(java.util.function.BiConsumer visitor) { wrapperContained.visitUpdates(visitor); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}