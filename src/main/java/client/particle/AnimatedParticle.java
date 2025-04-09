package yarnwrap.client.particle;
public class AnimatedParticle { public net.minecraft.client.particle.AnimatedParticle wrapperContained; public AnimatedParticle(net.minecraft.client.particle.AnimatedParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public float targetBlue() { return wrapperContained.targetBlue; }
// public float targetGreen() { return wrapperContained.targetGreen; }
// public float targetRed() { return wrapperContained.targetRed; }
// public boolean changesColor() { return wrapperContained.changesColor; }
public void setTargetColor(int rgbHex) { wrapperContained.setTargetColor(rgbHex); }
public void setColor(int rgbHex) { wrapperContained.setColor(rgbHex); }

}