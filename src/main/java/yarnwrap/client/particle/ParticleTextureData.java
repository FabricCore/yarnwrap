package yarnwrap.client.particle;
public class ParticleTextureData { public net.minecraft.client.particle.ParticleTextureData wrapperContained; public ParticleTextureData(net.minecraft.client.particle.ParticleTextureData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List textureList() { return wrapperContained.textureList; }
// public void textureList(java.util.List value) { wrapperContained.textureList = value; }
// public ParticleTextureData(java.util.List textureList) { this.wrapperContained = new net.minecraft.client.particle.ParticleTextureData(textureList); }
public java.util.List getTextureList() { return wrapperContained.getTextureList(); }
// public java.lang.String method_18827(com.google.gson.JsonElement texture) { return wrapperContained.method_18827(texture); }
public yarnwrap.client.particle.ParticleTextureData load(com.google.gson.JsonObject json) { return new yarnwrap.client.particle.ParticleTextureData(wrapperContained.load(json)); }

}