package yarnwrap.client.particle;
public class ShriekParticle { public net.minecraft.client.particle.ShriekParticle wrapperContained; public ShriekParticle(net.minecraft.client.particle.ShriekParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float X_ROTATION() { return wrapperContained.X_ROTATION; }
// public void X_ROTATION(float value) { wrapperContained.X_ROTATION = value; }
// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
// public ShriekParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,int delay) { this.wrapperContained = new net.minecraft.client.particle.ShriekParticle(world.wrapperContained,x,y,z,delay); }

}