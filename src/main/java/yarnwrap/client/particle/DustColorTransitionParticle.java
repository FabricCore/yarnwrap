package yarnwrap.client.particle;
public class DustColorTransitionParticle { public net.minecraft.client.particle.DustColorTransitionParticle wrapperContained; public DustColorTransitionParticle(net.minecraft.client.particle.DustColorTransitionParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Vector3f startColor() { return wrapperContained.startColor; }
// public void startColor(org.joml.Vector3f value) { wrapperContained.startColor = value; }
// public org.joml.Vector3f endColor() { return wrapperContained.endColor; }
// public void endColor(org.joml.Vector3f value) { wrapperContained.endColor = value; }
// public DustColorTransitionParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.particle.DustColorTransitionParticleEffect parameters,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.DustColorTransitionParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,parameters.wrapperContained,spriteProvider.wrapperContained); }
// public org.joml.Vector3f darken(org.joml.Vector3f color,float multiplier) { return wrapperContained.darken(color,multiplier); }
// public void updateColor(float tickDelta) { wrapperContained.updateColor(tickDelta); }

}