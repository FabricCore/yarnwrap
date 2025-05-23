package yarnwrap.network.packet.s2c.play;
public class EntityPositionS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained; public EntityPositionS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.entityId = value; }

// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public static boolean onGround() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.onGround; }
// public static void onGround(boolean value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.onGround = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.CODEC = value.wrapperContained; }

// public int entityId() { return wrapperContained.entityId(); }
// // public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.entityId(); }
// public boolean onGround() { return wrapperContained.onGround(); }
// // public static boolean onGround() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.onGround(); }
// public yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket create(int entityId,yarnwrap.entity.player.PlayerPosition change,java.util.Set relatives,boolean onGround) { return new yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket(wrapperContained.create(entityId,change.wrapperContained,relatives,onGround)); }
// public static yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket create(int entityId,yarnwrap.entity.player.PlayerPosition change,java.util.Set relatives,boolean onGround, ) { return new yarnwrap.network.packet.s2c.play.EntityPositionS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.create(entityId,change.wrapperContained,relatives,onGround)); }

}