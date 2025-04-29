package yarnwrap.client.particle;
public class SoulParticle { public net.minecraft.client.particle.SoulParticle wrapperContained; public SoulParticle(net.minecraft.client.particle.SoulParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.SoulParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.SoulParticle.spriteProvider = value.wrapperContained; }

// public boolean sculk() { return wrapperContained.sculk; }
// public void sculk(boolean value) { wrapperContained.sculk = value; }
// public static boolean sculk() { return net.minecraft.client.particle.SoulParticle.sculk; }
// public static void sculk(boolean value, ) { net.minecraft.client.particle.SoulParticle.sculk = value; }

// public SoulParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.SoulParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}