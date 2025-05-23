package yarnwrap.entity.player;
public class PlayerPosition { public net.minecraft.entity.player.PlayerPosition wrapperContained; public PlayerPosition(net.minecraft.entity.player.PlayerPosition wrapperContained) { this.wrapperContained = wrapperContained; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.entity.player.PlayerPosition.yaw; }
// public static void yaw(float value, ) { net.minecraft.entity.player.PlayerPosition.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.entity.player.PlayerPosition.pitch; }
// public static void pitch(float value, ) { net.minecraft.entity.player.PlayerPosition.pitch = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.player.PlayerPosition.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.player.PlayerPosition.PACKET_CODEC = value.wrapperContained; }

// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.entity.player.PlayerPosition.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.entity.player.PlayerPosition.pitch(); }
// public double resolve(double delta,double value,java.util.Set flags,yarnwrap.network.packet.s2c.play.PositionFlag deltaFlag) { return wrapperContained.resolve(delta,value,flags,deltaFlag.wrapperContained); }
// public static double resolve(double delta,double value,java.util.Set flags,yarnwrap.network.packet.s2c.play.PositionFlag deltaFlag, ) { return net.minecraft.entity.player.PlayerPosition.resolve(delta,value,flags,deltaFlag.wrapperContained); }
// public yarnwrap.entity.player.PlayerPosition fromEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.player.PlayerPosition(wrapperContained.fromEntity(entity.wrapperContained)); }
// public static yarnwrap.entity.player.PlayerPosition fromEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.player.PlayerPosition(net.minecraft.entity.player.PlayerPosition.fromEntity(entity.wrapperContained)); }
// public yarnwrap.entity.player.PlayerPosition apply(yarnwrap.entity.player.PlayerPosition currentPos,yarnwrap.entity.player.PlayerPosition newPos,java.util.Set flags) { return new yarnwrap.entity.player.PlayerPosition(wrapperContained.apply(currentPos.wrapperContained,newPos.wrapperContained,flags)); }
// public static yarnwrap.entity.player.PlayerPosition apply(yarnwrap.entity.player.PlayerPosition currentPos,yarnwrap.entity.player.PlayerPosition newPos,java.util.Set flags, ) { return new yarnwrap.entity.player.PlayerPosition(net.minecraft.entity.player.PlayerPosition.apply(currentPos.wrapperContained,newPos.wrapperContained,flags)); }
// public yarnwrap.entity.player.PlayerPosition fromTeleportTarget(yarnwrap.world.TeleportTarget teleportTarget) { return new yarnwrap.entity.player.PlayerPosition(wrapperContained.fromTeleportTarget(teleportTarget.wrapperContained)); }
// public static yarnwrap.entity.player.PlayerPosition fromTeleportTarget(yarnwrap.world.TeleportTarget teleportTarget, ) { return new yarnwrap.entity.player.PlayerPosition(net.minecraft.entity.player.PlayerPosition.fromTeleportTarget(teleportTarget.wrapperContained)); }

}