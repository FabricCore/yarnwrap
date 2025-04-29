package yarnwrap.client.particle;
public class WhiteAshParticle { public net.minecraft.client.particle.WhiteAshParticle wrapperContained; public WhiteAshParticle(net.minecraft.client.particle.WhiteAshParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COLOR() { return wrapperContained.COLOR; }
// public void COLOR(int value) { wrapperContained.COLOR = value; }
// public static int COLOR() { return net.minecraft.client.particle.WhiteAshParticle.COLOR; }
// public static void COLOR(int value, ) { net.minecraft.client.particle.WhiteAshParticle.COLOR = value; }

// public WhiteAshParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.WhiteAshParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained); }

}