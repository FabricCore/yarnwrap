package yarnwrap.client.particle;
public class DragonBreathParticle { public net.minecraft.client.particle.DragonBreathParticle wrapperContained; public DragonBreathParticle(net.minecraft.client.particle.DragonBreathParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public float MIN_RED() { return wrapperContained.MIN_RED; }
// public float MIN_GREEN() { return wrapperContained.MIN_GREEN; }
// public float MIN_BLUE() { return wrapperContained.MIN_BLUE; }
// public float MAX_RED() { return wrapperContained.MAX_RED; }
// public float MAX_GREEN() { return wrapperContained.MAX_GREEN; }
// public float MAX_BLUE() { return wrapperContained.MAX_BLUE; }
// public int MIN_COLOR() { return wrapperContained.MIN_COLOR; }
// public int MAX_COLOR() { return wrapperContained.MAX_COLOR; }
// public boolean reachedGround() { return wrapperContained.reachedGround; }

}