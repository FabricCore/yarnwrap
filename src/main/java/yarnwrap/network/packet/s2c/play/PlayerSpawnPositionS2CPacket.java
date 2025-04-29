package yarnwrap.network.packet.s2c.play;
public class PlayerSpawnPositionS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket wrapperContained; public PlayerSpawnPositionS2CPacket(net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.pos = value.wrapperContained; }

// public float angle() { return wrapperContained.angle; }
// public void angle(float value) { wrapperContained.angle = value; }
// public static float angle() { return net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.angle; }
// public static void angle(float value, ) { net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.angle = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.CODEC = value.wrapperContained; }

public PlayerSpawnPositionS2CPacket(yarnwrap.util.math.BlockPos pos,float angle) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket(pos.wrapperContained,angle); }
// public PlayerSpawnPositionS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.getPos()); }
public float getAngle() { return wrapperContained.getAngle(); }
// public static float getAngle() { return net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.getAngle(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket.write(buf.wrapperContained); }

}