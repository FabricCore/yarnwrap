package yarnwrap.client.particle;
public class ParticleTextureSheet { public net.minecraft.client.particle.ParticleTextureSheet wrapperContained; public ParticleTextureSheet(net.minecraft.client.particle.ParticleTextureSheet wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.particle.ParticleTextureSheet TERRAIN_SHEET() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.TERRAIN_SHEET); }
// public void TERRAIN_SHEET(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.TERRAIN_SHEET = value.wrapperContained; }
public yarnwrap.client.particle.ParticleTextureSheet PARTICLE_SHEET_OPAQUE() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.PARTICLE_SHEET_OPAQUE); }
// public void PARTICLE_SHEET_OPAQUE(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.PARTICLE_SHEET_OPAQUE = value.wrapperContained; }
public yarnwrap.client.particle.ParticleTextureSheet PARTICLE_SHEET_TRANSLUCENT() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.PARTICLE_SHEET_TRANSLUCENT); }
// public void PARTICLE_SHEET_TRANSLUCENT(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.PARTICLE_SHEET_TRANSLUCENT = value.wrapperContained; }
public yarnwrap.client.particle.ParticleTextureSheet PARTICLE_SHEET_LIT() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.PARTICLE_SHEET_LIT); }
// public void PARTICLE_SHEET_LIT(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.PARTICLE_SHEET_LIT = value.wrapperContained; }
public yarnwrap.client.particle.ParticleTextureSheet CUSTOM() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.CUSTOM); }
// public void CUSTOM(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.CUSTOM = value.wrapperContained; }
public yarnwrap.client.particle.ParticleTextureSheet NO_RENDER() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.NO_RENDER); }
// public void NO_RENDER(yarnwrap.client.particle.ParticleTextureSheet value) { wrapperContained.NO_RENDER = value.wrapperContained; }
public yarnwrap.client.render.BufferBuilder begin(yarnwrap.client.render.Tessellator tessellator,yarnwrap.client.texture.TextureManager textureManager) { return new yarnwrap.client.render.BufferBuilder(wrapperContained.begin(tessellator.wrapperContained,textureManager.wrapperContained)); }

}