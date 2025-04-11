package yarnwrap.network.packet.s2c.play;
public class ExplosionS2CPacket { public net.minecraft.network.packet.s2c.play.ExplosionS2CPacket wrapperContained; public ExplosionS2CPacket(net.minecraft.network.packet.s2c.play.ExplosionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float playerVelocityX() { return wrapperContained.playerVelocityX; }
// public void playerVelocityX(float value) { wrapperContained.playerVelocityX = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public float radius() { return wrapperContained.radius; }
// public void radius(float value) { wrapperContained.radius = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public java.util.List affectedBlocks() { return wrapperContained.affectedBlocks; }
// public void affectedBlocks(java.util.List value) { wrapperContained.affectedBlocks = value; }
// public float playerVelocityZ() { return wrapperContained.playerVelocityZ; }
// public void playerVelocityZ(float value) { wrapperContained.playerVelocityZ = value; }
// public float playerVelocityY() { return wrapperContained.playerVelocityY; }
// public void playerVelocityY(float value) { wrapperContained.playerVelocityY = value; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public void particle(yarnwrap.particle.ParticleEffect value) { wrapperContained.particle = value.wrapperContained; }
// public yarnwrap.particle.ParticleEffect emitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.emitterParticle); }
// public void emitterParticle(yarnwrap.particle.ParticleEffect value) { wrapperContained.emitterParticle = value.wrapperContained; }
// public Object destructionType() { return wrapperContained.destructionType; }
// // public void destructionType(Object value) { wrapperContained.destructionType = value; }
// public yarnwrap.registry.entry.RegistryEntry soundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.soundEvent); }
// public void soundEvent(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.soundEvent = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public ExplosionS2CPacket(double x,double y,double z,float radius,java.util.List affectedBlocks,yarnwrap.util.math.Vec3d playerVelocity,Object destructionType,yarnwrap.particle.ParticleEffect particle,yarnwrap.particle.ParticleEffect emitterParticle) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExplosionS2CPacket(x,y,z,radius,affectedBlocks,playerVelocity.wrapperContained,destructionType,particle.wrapperContained,emitterParticle.wrapperContained); }
// public ExplosionS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ExplosionS2CPacket(buf.wrapperContained); }
public float getPlayerVelocityX() { return wrapperContained.getPlayerVelocityX(); }
public float getPlayerVelocityY() { return wrapperContained.getPlayerVelocityY(); }
public float getPlayerVelocityZ() { return wrapperContained.getPlayerVelocityZ(); }
public double getX() { return wrapperContained.getX(); }
public float getRadius() { return wrapperContained.getRadius(); }
public double getY() { return wrapperContained.getY(); }
public double getZ() { return wrapperContained.getZ(); }
public java.util.List getAffectedBlocks() { return wrapperContained.getAffectedBlocks(); }
// public yarnwrap.util.math.BlockPos method_34121(int buf2) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_34121(buf2)); }
// public void method_34122(int buf2,int pos) { wrapperContained.method_34122(buf2,pos); }
public Object getDestructionType() { return wrapperContained.getDestructionType(); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public yarnwrap.particle.ParticleEffect getEmitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getEmitterParticle()); }
public yarnwrap.registry.entry.RegistryEntry getSoundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSoundEvent()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}