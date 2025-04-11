package yarnwrap.client.particle;
public class AnimatedParticle { public net.minecraft.client.particle.AnimatedParticle wrapperContained; public AnimatedParticle(net.minecraft.client.particle.AnimatedParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public float targetBlue() { return wrapperContained.targetBlue; }
// public void targetBlue(float value) { wrapperContained.targetBlue = value; }
// public float targetGreen() { return wrapperContained.targetGreen; }
// public void targetGreen(float value) { wrapperContained.targetGreen = value; }
// public float targetRed() { return wrapperContained.targetRed; }
// public void targetRed(float value) { wrapperContained.targetRed = value; }
// public boolean changesColor() { return wrapperContained.changesColor; }
// public void changesColor(boolean value) { wrapperContained.changesColor = value; }
// public AnimatedParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.client.particle.SpriteProvider spriteProvider,float upwardsAcceleration) { this.wrapperContained = new net.minecraft.client.particle.AnimatedParticle(world.wrapperContained,x,y,z,spriteProvider.wrapperContained,upwardsAcceleration); }
public void setTargetColor(int rgbHex) { wrapperContained.setTargetColor(rgbHex); }
public void setColor(int rgbHex) { wrapperContained.setColor(rgbHex); }

}