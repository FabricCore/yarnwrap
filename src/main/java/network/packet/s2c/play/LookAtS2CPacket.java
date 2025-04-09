package yarnwrap.network.packet.s2c.play;
public class LookAtS2CPacket { public net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained; public LookAtS2CPacket(net.minecraft.network.packet.s2c.play.LookAtS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public double targetY() { return wrapperContained.targetY; }
// public Object selfAnchor() { return wrapperContained.selfAnchor; }
// public double targetX() { return wrapperContained.targetX; }
// public boolean lookAtEntity() { return wrapperContained.lookAtEntity; }
// public int entityId() { return wrapperContained.entityId; }
// public Object targetAnchor() { return wrapperContained.targetAnchor; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object getSelfAnchor() { return wrapperContained.getSelfAnchor(); }
public yarnwrap.util.math.Vec3d getTargetPosition(yarnwrap.world.World world) { return new yarnwrap.util.math.Vec3d(wrapperContained.getTargetPosition(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}