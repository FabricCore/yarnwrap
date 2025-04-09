package yarnwrap.client.particle;
public class BillboardParticle { public net.minecraft.client.particle.BillboardParticle wrapperContained; public BillboardParticle(net.minecraft.client.particle.BillboardParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
public float getSize(float tickDelta) { return wrapperContained.getSize(tickDelta); }
// public float getMinU() { return wrapperContained.getMinU(); }
// public float getMaxU() { return wrapperContained.getMaxU(); }
// public float getMinV() { return wrapperContained.getMinV(); }
// public float getMaxV() { return wrapperContained.getMaxV(); }
public Object getRotator() { return wrapperContained.getRotator(); }

}