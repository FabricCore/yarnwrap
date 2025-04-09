package yarnwrap.network.packet.s2c.play;
public class ExplosionS2CPacket { public net.minecraft.network.packet.s2c.play.ExplosionS2CPacket wrapperContained; public ExplosionS2CPacket(net.minecraft.network.packet.s2c.play.ExplosionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float playerVelocityX() { return wrapperContained.playerVelocityX; }
// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public float radius() { return wrapperContained.radius; }
// public double x() { return wrapperContained.x; }
// public java.util.List affectedBlocks() { return wrapperContained.affectedBlocks; }
// public float playerVelocityZ() { return wrapperContained.playerVelocityZ; }
// public float playerVelocityY() { return wrapperContained.playerVelocityY; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public yarnwrap.particle.ParticleEffect emitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.emitterParticle); }
// public Object destructionType() { return wrapperContained.destructionType; }
// public yarnwrap.registry.entry.RegistryEntry soundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.soundEvent); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public float getPlayerVelocityX() { return wrapperContained.getPlayerVelocityX(); }
public float getPlayerVelocityY() { return wrapperContained.getPlayerVelocityY(); }
public float getPlayerVelocityZ() { return wrapperContained.getPlayerVelocityZ(); }
public double getX() { return wrapperContained.getX(); }
public float getRadius() { return wrapperContained.getRadius(); }
public double getY() { return wrapperContained.getY(); }
public double getZ() { return wrapperContained.getZ(); }
public java.util.List getAffectedBlocks() { return wrapperContained.getAffectedBlocks(); }
public Object getDestructionType() { return wrapperContained.getDestructionType(); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public yarnwrap.particle.ParticleEffect getEmitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getEmitterParticle()); }
public yarnwrap.registry.entry.RegistryEntry getSoundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSoundEvent()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}