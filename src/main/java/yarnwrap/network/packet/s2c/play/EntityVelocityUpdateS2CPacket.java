package yarnwrap.network.packet.s2c.play;
public class EntityVelocityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained; public EntityVelocityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int velocityZ() { return wrapperContained.velocityZ; }
// public void velocityZ(int value) { wrapperContained.velocityZ = value; }
// public int velocityY() { return wrapperContained.velocityY; }
// public void velocityY(int value) { wrapperContained.velocityY = value; }
// public int velocityX() { return wrapperContained.velocityX; }
// public void velocityX(int value) { wrapperContained.velocityX = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public double getVelocityX() { return wrapperContained.getVelocityX(); }
public double getVelocityY() { return wrapperContained.getVelocityY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getVelocityZ() { return wrapperContained.getVelocityZ(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}