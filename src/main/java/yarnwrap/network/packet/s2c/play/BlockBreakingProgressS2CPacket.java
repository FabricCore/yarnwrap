package yarnwrap.network.packet.s2c.play;
public class BlockBreakingProgressS2CPacket { public net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained; public BlockBreakingProgressS2CPacket(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int progress() { return wrapperContained.progress; }
// public void progress(int value) { wrapperContained.progress = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public BlockBreakingProgressS2CPacket(int entityId,yarnwrap.util.math.BlockPos pos,int progress) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket(entityId,pos.wrapperContained,progress); }
// public BlockBreakingProgressS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getProgress() { return wrapperContained.getProgress(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}