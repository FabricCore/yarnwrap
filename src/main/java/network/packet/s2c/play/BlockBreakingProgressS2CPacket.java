package yarnwrap.network.packet.s2c.play;
public class BlockBreakingProgressS2CPacket { public net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained; public BlockBreakingProgressS2CPacket(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int progress() { return wrapperContained.progress; }
// public int entityId() { return wrapperContained.entityId; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getProgress() { return wrapperContained.getProgress(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}