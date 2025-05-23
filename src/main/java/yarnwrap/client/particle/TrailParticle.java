package yarnwrap.client.particle;
public class TrailParticle { public net.minecraft.client.particle.TrailParticle wrapperContained; public TrailParticle(net.minecraft.client.particle.TrailParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d target() { return new yarnwrap.util.math.Vec3d(wrapperContained.target); }
// public void target(yarnwrap.util.math.Vec3d value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d target() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.particle.TrailParticle.target); }
// public static void target(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.particle.TrailParticle.target = value.wrapperContained; }

// public TrailParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.util.math.Vec3d target,int color) { this.wrapperContained = new net.minecraft.client.particle.TrailParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,target.wrapperContained,color); }

}