package yarnwrap.network.packet.s2c.play;
public class BlockBreakingProgressS2CPacket { public net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained; public BlockBreakingProgressS2CPacket(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int progress() { return wrapperContained.progress; }
// public void progress(int value) { wrapperContained.progress = value; }
// public static int progress() { return net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.progress; }
// public static void progress(int value, ) { net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.progress = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.entityId = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.CODEC = value.wrapperContained; }

public BlockBreakingProgressS2CPacket(int entityId,yarnwrap.util.math.BlockPos pos,int progress) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket(entityId,pos.wrapperContained,progress); }
// public BlockBreakingProgressS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.getPos()); }
public int getProgress() { return wrapperContained.getProgress(); }
// public static int getProgress() { return net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.getProgress(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket.write(buf.wrapperContained); }

}