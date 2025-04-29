package yarnwrap.client.particle;
public class SpellParticle { public net.minecraft.client.particle.SpellParticle wrapperContained; public SpellParticle(net.minecraft.client.particle.SpellParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.SpellParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.SpellParticle.spriteProvider = value.wrapperContained; }

// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(net.minecraft.client.particle.SpellParticle.RANDOM); }
// public static void RANDOM(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.particle.SpellParticle.RANDOM = value.wrapperContained; }

// public float defaultAlpha() { return wrapperContained.defaultAlpha; }
// public void defaultAlpha(float value) { wrapperContained.defaultAlpha = value; }
// public static float defaultAlpha() { return net.minecraft.client.particle.SpellParticle.defaultAlpha; }
// public static void defaultAlpha(float value, ) { net.minecraft.client.particle.SpellParticle.defaultAlpha = value; }

// public SpellParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.SpellParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }
// public boolean isInvisible() { return wrapperContained.isInvisible(); }
// public static boolean isInvisible() { return net.minecraft.client.particle.SpellParticle.isInvisible(); }

}