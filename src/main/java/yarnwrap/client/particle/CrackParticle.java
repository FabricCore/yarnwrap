package yarnwrap.client.particle;
public class CrackParticle { public net.minecraft.client.particle.CrackParticle wrapperContained; public CrackParticle(net.minecraft.client.particle.CrackParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float sampleU() { return wrapperContained.sampleU; }
// public void sampleU(float value) { wrapperContained.sampleU = value; }
// public static float sampleU() { return net.minecraft.client.particle.CrackParticle.sampleU; }
// public static void sampleU(float value, ) { net.minecraft.client.particle.CrackParticle.sampleU = value; }

// public float sampleV() { return wrapperContained.sampleV; }
// public void sampleV(float value) { wrapperContained.sampleV = value; }
// public static float sampleV() { return net.minecraft.client.particle.CrackParticle.sampleV; }
// public static void sampleV(float value, ) { net.minecraft.client.particle.CrackParticle.sampleV = value; }

// public CrackParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.render.item.ItemRenderState itemRenderState) { this.wrapperContained = new net.minecraft.client.particle.CrackParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,itemRenderState.wrapperContained); }
// public CrackParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.client.render.item.ItemRenderState itemRenderState) { this.wrapperContained = new net.minecraft.client.particle.CrackParticle(world.wrapperContained,x,y,z,itemRenderState.wrapperContained); }

}