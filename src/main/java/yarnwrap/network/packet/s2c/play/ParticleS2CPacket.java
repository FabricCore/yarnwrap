package yarnwrap.network.packet.s2c.play;
public class ParticleS2CPacket { public net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained; public ParticleS2CPacket(net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float offsetZ() { return wrapperContained.offsetZ; }
// public void offsetZ(float value) { wrapperContained.offsetZ = value; }
// public float offsetY() { return wrapperContained.offsetY; }
// public void offsetY(float value) { wrapperContained.offsetY = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public boolean longDistance() { return wrapperContained.longDistance; }
// public void longDistance(boolean value) { wrapperContained.longDistance = value; }
// public float offsetX() { return wrapperContained.offsetX; }
// public void offsetX(float value) { wrapperContained.offsetX = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.parameters); }
// public void parameters(yarnwrap.particle.ParticleEffect value) { wrapperContained.parameters = value.wrapperContained; }
// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public float getSpeed() { return wrapperContained.getSpeed(); }
public double getX() { return wrapperContained.getX(); }
public int getCount() { return wrapperContained.getCount(); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public float getOffsetX() { return wrapperContained.getOffsetX(); }
public float getOffsetY() { return wrapperContained.getOffsetY(); }
public float getOffsetZ() { return wrapperContained.getOffsetZ(); }
public yarnwrap.particle.ParticleEffect getParameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParameters()); }
public boolean isLongDistance() { return wrapperContained.isLongDistance(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}