package yarnwrap.client.particle;
public class GlowParticle { public net.minecraft.client.particle.GlowParticle wrapperContained; public GlowParticle(net.minecraft.client.particle.GlowParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(net.minecraft.client.particle.GlowParticle.RANDOM); }
// public static void RANDOM(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.particle.GlowParticle.RANDOM = value.wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.GlowParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.GlowParticle.spriteProvider = value.wrapperContained; }

// public GlowParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.GlowParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}