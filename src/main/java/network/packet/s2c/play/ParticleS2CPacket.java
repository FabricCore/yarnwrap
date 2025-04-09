package yarnwrap.network.packet.s2c.play;
public class ParticleS2CPacket { public net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained; public ParticleS2CPacket(net.minecraft.network.packet.s2c.play.ParticleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float offsetZ() { return wrapperContained.offsetZ; }
// public float offsetY() { return wrapperContained.offsetY; }
// public int count() { return wrapperContained.count; }
// public boolean longDistance() { return wrapperContained.longDistance; }
// public float offsetX() { return wrapperContained.offsetX; }
// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public double x() { return wrapperContained.x; }
// public yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.parameters); }
// public float speed() { return wrapperContained.speed; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
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