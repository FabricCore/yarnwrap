package yarnwrap.network.packet.s2c.play;
public class PlayerSpawnPositionS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket wrapperContained; public PlayerSpawnPositionS2CPacket(net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public float angle() { return wrapperContained.angle; }
// public void angle(float value) { wrapperContained.angle = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public float getAngle() { return wrapperContained.getAngle(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}