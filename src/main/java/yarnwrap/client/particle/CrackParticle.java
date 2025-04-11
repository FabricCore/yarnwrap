package yarnwrap.client.particle;
public class CrackParticle { public net.minecraft.client.particle.CrackParticle wrapperContained; public CrackParticle(net.minecraft.client.particle.CrackParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float sampleU() { return wrapperContained.sampleU; }
// public void sampleU(float value) { wrapperContained.sampleU = value; }
// public float sampleV() { return wrapperContained.sampleV; }
// public void sampleV(float value) { wrapperContained.sampleV = value; }
// public CrackParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.client.particle.CrackParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,stack.wrapperContained); }
// public CrackParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.client.particle.CrackParticle(world.wrapperContained,x,y,z,stack.wrapperContained); }

}