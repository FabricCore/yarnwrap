package yarnwrap.network.packet.s2c.play;
public class ProjectilePowerS2CPacket { public net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained; public ProjectilePowerS2CPacket(net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int entityId() { return wrapperContained.entityId; }
// public double accelerationPower() { return wrapperContained.accelerationPower; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getAccelerationPower() { return wrapperContained.getAccelerationPower(); }

}