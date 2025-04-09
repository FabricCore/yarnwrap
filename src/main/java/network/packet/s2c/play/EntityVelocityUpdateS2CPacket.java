package yarnwrap.network.packet.s2c.play;
public class EntityVelocityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained; public EntityVelocityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int velocityZ() { return wrapperContained.velocityZ; }
// public int velocityY() { return wrapperContained.velocityY; }
// public int velocityX() { return wrapperContained.velocityX; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public double getVelocityX() { return wrapperContained.getVelocityX(); }
public double getVelocityY() { return wrapperContained.getVelocityY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getVelocityZ() { return wrapperContained.getVelocityZ(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}