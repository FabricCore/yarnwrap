package yarnwrap.client.particle;
public class ParticleTextureData { public net.minecraft.client.particle.ParticleTextureData wrapperContained; public ParticleTextureData(net.minecraft.client.particle.ParticleTextureData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List textureList() { return wrapperContained.textureList; }
// public void textureList(java.util.List value) { wrapperContained.textureList = value; }
public java.util.List getTextureList() { return wrapperContained.getTextureList(); }
public yarnwrap.client.particle.ParticleTextureData load(com.google.gson.JsonObject json) { return new yarnwrap.client.particle.ParticleTextureData(wrapperContained.load(json)); }

}