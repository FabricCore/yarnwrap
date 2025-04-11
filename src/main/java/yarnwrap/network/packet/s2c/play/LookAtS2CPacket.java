package yarnwrap.network.packet.s2c.play;
public class LookAtS2CPacket { public net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained; public LookAtS2CPacket(net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public Object selfAnchor() { return wrapperContained.selfAnchor; }
// // public void selfAnchor(Object value) { wrapperContained.selfAnchor = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public boolean lookAtEntity() { return wrapperContained.lookAtEntity; }
// public void lookAtEntity(boolean value) { wrapperContained.lookAtEntity = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public Object targetAnchor() { return wrapperContained.targetAnchor; }
// // public void targetAnchor(Object value) { wrapperContained.targetAnchor = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public LookAtS2CPacket(Object selfAnchor,double targetX,double targetY,double targetZ) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(selfAnchor,targetX,targetY,targetZ); }
// public LookAtS2CPacket(Object selfAnchor,yarnwrap.entity.Entity entity,Object targetAnchor) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(selfAnchor,entity.wrapperContained,targetAnchor); }
// public LookAtS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LookAtS2CPacket(buf.wrapperContained); }
public Object getSelfAnchor() { return wrapperContained.getSelfAnchor(); }
public yarnwrap.util.math.Vec3d getTargetPosition(yarnwrap.world.World world) { return new yarnwrap.util.math.Vec3d(wrapperContained.getTargetPosition(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}