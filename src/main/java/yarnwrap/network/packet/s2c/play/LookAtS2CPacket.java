package yarnwrap.network.packet.s2c.play;
public class LookAtS2CPacket { public net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained; public LookAtS2CPacket(net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetZ = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetY; }
// public static void targetY(double value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetY = value; }

// public Object selfAnchor() { return wrapperContained.selfAnchor; }
// // public void selfAnchor(Object value) { wrapperContained.selfAnchor = value; }
// // public static Object selfAnchor() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.selfAnchor; }
// // public static void selfAnchor(Object value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.selfAnchor = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetX; }
// public static void targetX(double value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetX = value; }

// public boolean lookAtEntity() { return wrapperContained.lookAtEntity; }
// public void lookAtEntity(boolean value) { wrapperContained.lookAtEntity = value; }
// public static boolean lookAtEntity() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.lookAtEntity; }
// public static void lookAtEntity(boolean value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.lookAtEntity = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.entityId = value; }

// public Object targetAnchor() { return wrapperContained.targetAnchor; }
// // public void targetAnchor(Object value) { wrapperContained.targetAnchor = value; }
// // public static Object targetAnchor() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetAnchor; }
// // public static void targetAnchor(Object value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.targetAnchor = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.LookAtS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.CODEC = value.wrapperContained; }

// public LookAtS2CPacket(Object selfAnchor,double targetX,double targetY,double targetZ) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(selfAnchor,targetX,targetY,targetZ); }
// public LookAtS2CPacket(Object selfAnchor,yarnwrap.entity.Entity entity,Object targetAnchor) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(selfAnchor,entity.wrapperContained,targetAnchor); }
// public LookAtS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(buf.wrapperContained); }
public Object getSelfAnchor() { return wrapperContained.getSelfAnchor(); }
// public static Object getSelfAnchor() { return net.minecraft.network.packet.s2c.play.LookAtS2CPacket.getSelfAnchor(); }
public yarnwrap.util.math.Vec3d getTargetPosition(yarnwrap.world.World world) { return new yarnwrap.util.math.Vec3d(wrapperContained.getTargetPosition(world.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getTargetPosition(yarnwrap.world.World world, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.network.packet.s2c.play.LookAtS2CPacket.getTargetPosition(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.LookAtS2CPacket.write(buf.wrapperContained); }

}