package yarnwrap.client.particle;
public class BubblePopParticle { public net.minecraft.client.particle.BubblePopParticle wrapperContained; public BubblePopParticle(net.minecraft.client.particle.BubblePopParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.BubblePopParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.BubblePopParticle.spriteProvider = value.wrapperContained; }

// public BubblePopParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.BubblePopParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}