package yarnwrap.client.particle;
public class BlockDustParticle { public net.minecraft.client.particle.BlockDustParticle wrapperContained; public BlockDustParticle(net.minecraft.client.particle.BlockDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float sampleU() { return wrapperContained.sampleU; }
// public void sampleU(float value) { wrapperContained.sampleU = value; }
// public float sampleV() { return wrapperContained.sampleV; }
// public void sampleV(float value) { wrapperContained.sampleV = value; }
// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public yarnwrap.client.particle.BlockDustParticle create(yarnwrap.particle.BlockStateParticleEffect parameters,yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.BlockDustParticle(wrapperContained.create(parameters.wrapperContained,world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }

}