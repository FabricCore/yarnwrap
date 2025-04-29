package yarnwrap.client.particle;
public class AnimatedParticle { public net.minecraft.client.particle.AnimatedParticle wrapperContained; public AnimatedParticle(net.minecraft.client.particle.AnimatedParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.AnimatedParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.AnimatedParticle.spriteProvider = value.wrapperContained; }

// public float targetBlue() { return wrapperContained.targetBlue; }
// public void targetBlue(float value) { wrapperContained.targetBlue = value; }
// public static float targetBlue() { return net.minecraft.client.particle.AnimatedParticle.targetBlue; }
// public static void targetBlue(float value, ) { net.minecraft.client.particle.AnimatedParticle.targetBlue = value; }

// public float targetGreen() { return wrapperContained.targetGreen; }
// public void targetGreen(float value) { wrapperContained.targetGreen = value; }
// public static float targetGreen() { return net.minecraft.client.particle.AnimatedParticle.targetGreen; }
// public static void targetGreen(float value, ) { net.minecraft.client.particle.AnimatedParticle.targetGreen = value; }

// public float targetRed() { return wrapperContained.targetRed; }
// public void targetRed(float value) { wrapperContained.targetRed = value; }
// public static float targetRed() { return net.minecraft.client.particle.AnimatedParticle.targetRed; }
// public static void targetRed(float value, ) { net.minecraft.client.particle.AnimatedParticle.targetRed = value; }

// public boolean changesColor() { return wrapperContained.changesColor; }
// public void changesColor(boolean value) { wrapperContained.changesColor = value; }
// public static boolean changesColor() { return net.minecraft.client.particle.AnimatedParticle.changesColor; }
// public static void changesColor(boolean value, ) { net.minecraft.client.particle.AnimatedParticle.changesColor = value; }

// public AnimatedParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.client.particle.SpriteProvider spriteProvider,float upwardsAcceleration) { this.wrapperContained = new net.minecraft.client.particle.AnimatedParticle(world.wrapperContained,x,y,z,spriteProvider.wrapperContained,upwardsAcceleration); }
public void setTargetColor(int rgbHex) { wrapperContained.setTargetColor(rgbHex); }
// public static void setTargetColor(int rgbHex, ) { net.minecraft.client.particle.AnimatedParticle.setTargetColor(rgbHex); }
public void setColor(int rgbHex) { wrapperContained.setColor(rgbHex); }
// public static void setColor(int rgbHex, ) { net.minecraft.client.particle.AnimatedParticle.setColor(rgbHex); }

}