package yarnwrap.network.packet.s2c.play;
public class ProjectilePowerS2CPacket { public net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained; public ProjectilePowerS2CPacket(net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public double accelerationPower() { return wrapperContained.accelerationPower; }
// public void accelerationPower(double value) { wrapperContained.accelerationPower = value; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getAccelerationPower() { return wrapperContained.getAccelerationPower(); }

}