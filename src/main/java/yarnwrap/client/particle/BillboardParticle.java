package yarnwrap.client.particle;
public class BillboardParticle { public net.minecraft.client.particle.BillboardParticle wrapperContained; public BillboardParticle(net.minecraft.client.particle.BillboardParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public static float scale() { return net.minecraft.client.particle.BillboardParticle.scale; }
// public static void scale(float value, ) { net.minecraft.client.particle.BillboardParticle.scale = value; }

public float getSize(float tickDelta) { return wrapperContained.getSize(tickDelta); }
// public static float getSize(float tickDelta, ) { return net.minecraft.client.particle.BillboardParticle.getSize(tickDelta); }
// public float getMinU() { return wrapperContained.getMinU(); }
// public static float getMinU() { return net.minecraft.client.particle.BillboardParticle.getMinU(); }
// public float getMaxU() { return wrapperContained.getMaxU(); }
// public static float getMaxU() { return net.minecraft.client.particle.BillboardParticle.getMaxU(); }
// public float getMinV() { return wrapperContained.getMinV(); }
// public static float getMinV() { return net.minecraft.client.particle.BillboardParticle.getMinV(); }
// public float getMaxV() { return wrapperContained.getMaxV(); }
// public static float getMaxV() { return net.minecraft.client.particle.BillboardParticle.getMaxV(); }
public Object getRotator() { return wrapperContained.getRotator(); }
// public static Object getRotator() { return net.minecraft.client.particle.BillboardParticle.getRotator(); }

}