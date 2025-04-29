package yarnwrap.client.particle;
public class BlockDustParticle { public net.minecraft.client.particle.BlockDustParticle wrapperContained; public BlockDustParticle(net.minecraft.client.particle.BlockDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float sampleU() { return wrapperContained.sampleU; }
// public void sampleU(float value) { wrapperContained.sampleU = value; }
// public static float sampleU() { return net.minecraft.client.particle.BlockDustParticle.sampleU; }
// public static void sampleU(float value, ) { net.minecraft.client.particle.BlockDustParticle.sampleU = value; }

// public float sampleV() { return wrapperContained.sampleV; }
// public void sampleV(float value) { wrapperContained.sampleV = value; }
// public static float sampleV() { return net.minecraft.client.particle.BlockDustParticle.sampleV; }
// public static void sampleV(float value, ) { net.minecraft.client.particle.BlockDustParticle.sampleV = value; }

// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.particle.BlockDustParticle.blockPos); }
// public static void blockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.particle.BlockDustParticle.blockPos = value.wrapperContained; }

public BlockDustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.client.particle.BlockDustParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,state.wrapperContained); }
public BlockDustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos blockPos) { this.wrapperContained = new net.minecraft.client.particle.BlockDustParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,state.wrapperContained,blockPos.wrapperContained); }
// public yarnwrap.client.particle.BlockDustParticle create(yarnwrap.particle.BlockStateParticleEffect parameters,yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.BlockDustParticle(wrapperContained.create(parameters.wrapperContained,world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }
// public static yarnwrap.client.particle.BlockDustParticle create(yarnwrap.particle.BlockStateParticleEffect parameters,yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { return new yarnwrap.client.particle.BlockDustParticle(net.minecraft.client.particle.BlockDustParticle.create(parameters.wrapperContained,world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }

}