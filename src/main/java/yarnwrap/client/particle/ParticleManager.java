package yarnwrap.client.particle;
public class ParticleManager { public net.minecraft.client.particle.ParticleManager wrapperContained; public ParticleManager(net.minecraft.client.particle.ParticleManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List PARTICLE_TEXTURE_SHEETS() { return wrapperContained.PARTICLE_TEXTURE_SHEETS; }
// public void PARTICLE_TEXTURE_SHEETS(java.util.List value) { wrapperContained.PARTICLE_TEXTURE_SHEETS = value; }
// public java.util.Map spriteAwareFactories() { return wrapperContained.spriteAwareFactories; }
// public void spriteAwareFactories(java.util.Map value) { wrapperContained.spriteAwareFactories = value; }
// public yarnwrap.client.texture.SpriteAtlasTexture particleAtlasTexture() { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.particleAtlasTexture); }
// public void particleAtlasTexture(yarnwrap.client.texture.SpriteAtlasTexture value) { wrapperContained.particleAtlasTexture = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap groupCounts() { return wrapperContained.groupCounts; }
// public void groupCounts(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap value) { wrapperContained.groupCounts = value; }
// public int MAX_PARTICLE_COUNT() { return wrapperContained.MAX_PARTICLE_COUNT; }
// public void MAX_PARTICLE_COUNT(int value) { wrapperContained.MAX_PARTICLE_COUNT = value; }
// public java.util.Map particles() { return wrapperContained.particles; }
// public void particles(java.util.Map value) { wrapperContained.particles = value; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap factories() { return wrapperContained.factories; }
// public void factories(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.factories = value; }
// public java.util.Queue newParticles() { return wrapperContained.newParticles; }
// public void newParticles(java.util.Queue value) { wrapperContained.newParticles = value; }
// public java.util.Queue newEmitterParticles() { return wrapperContained.newEmitterParticles; }
// public void newEmitterParticles(java.util.Queue value) { wrapperContained.newEmitterParticles = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public yarnwrap.util.Identifier PARTICLES_PATH() { return new yarnwrap.util.Identifier(wrapperContained.PARTICLES_PATH); }
// public void PARTICLES_PATH(yarnwrap.util.Identifier value) { wrapperContained.PARTICLES_PATH = value.wrapperContained; }
public void clearAtlas() { wrapperContained.clearAtlas(); }
// public void registerFactory(yarnwrap.particle.ParticleType type,Object factory) { wrapperContained.registerFactory(type.wrapperContained,factory); }
// public java.util.Optional loadTextureList(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource) { return wrapperContained.loadTextureList(id.wrapperContained,resource.wrapperContained); }
// public void registerFactory(yarnwrap.particle.ParticleType type,yarnwrap.client.particle.ParticleFactory factory) { wrapperContained.registerFactory(type.wrapperContained,factory.wrapperContained); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
public void addBlockBreakParticles(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.addBlockBreakParticles(pos.wrapperContained,state.wrapperContained); }
// public void tickParticles(java.util.Collection particles) { wrapperContained.tickParticles(particles); }
public void renderParticles(yarnwrap.client.render.LightmapTextureManager lightmapTextureManager,yarnwrap.client.render.Camera camera,float tickDelta) { wrapperContained.renderParticles(lightmapTextureManager.wrapperContained,camera.wrapperContained,tickDelta); }
public void addEmitter(yarnwrap.entity.Entity entity,yarnwrap.particle.ParticleEffect parameters,int maxAge) { wrapperContained.addEmitter(entity.wrapperContained,parameters.wrapperContained,maxAge); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
public void addBlockBreakingParticles(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.addBlockBreakingParticles(pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.client.particle.Particle createParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.createParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }
public yarnwrap.client.particle.Particle addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }
public void tick() { wrapperContained.tick(); }
public void addParticle(yarnwrap.client.particle.Particle particle) { wrapperContained.addParticle(particle.wrapperContained); }
// public void tickParticle(yarnwrap.client.particle.Particle particle) { wrapperContained.tickParticle(particle.wrapperContained); }
public void addEmitter(yarnwrap.entity.Entity entity,yarnwrap.particle.ParticleEffect parameters) { wrapperContained.addEmitter(entity.wrapperContained,parameters.wrapperContained); }
// public void registerDefaultFactories() { wrapperContained.registerDefaultFactories(); }
// public boolean canAdd(yarnwrap.particle.ParticleGroup group) { return wrapperContained.canAdd(group.wrapperContained); }
// public void addTo(yarnwrap.particle.ParticleGroup group,int count) { wrapperContained.addTo(group.wrapperContained,count); }
// public void clearParticles() { wrapperContained.clearParticles(); }
// public void registerBlockLeakFactory(yarnwrap.particle.ParticleType type,Object factory) { wrapperContained.registerBlockLeakFactory(type.wrapperContained,factory); }

}