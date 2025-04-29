package yarnwrap.client.particle;
public class DustPlumeParticle { public net.minecraft.client.particle.DustPlumeParticle wrapperContained; public DustPlumeParticle(net.minecraft.client.particle.DustPlumeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COLOR() { return wrapperContained.COLOR; }
// public void COLOR(int value) { wrapperContained.COLOR = value; }
// public static int COLOR() { return net.minecraft.client.particle.DustPlumeParticle.COLOR; }
// public static void COLOR(int value, ) { net.minecraft.client.particle.DustPlumeParticle.COLOR = value; }

// public DustPlumeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.DustPlumeParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained); }

}