package yarnwrap.client.particle;
public class CampfireSmokeParticle { public net.minecraft.client.particle.CampfireSmokeParticle wrapperContained; public CampfireSmokeParticle(net.minecraft.client.particle.CampfireSmokeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public CampfireSmokeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,boolean signal) { this.wrapperContained = new net.minecraft.client.particle.CampfireSmokeParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,signal); }

}