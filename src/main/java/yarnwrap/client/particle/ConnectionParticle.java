package yarnwrap.client.particle;
public class ConnectionParticle { public net.minecraft.client.particle.ConnectionParticle wrapperContained; public ConnectionParticle(net.minecraft.client.particle.ConnectionParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public double startZ() { return wrapperContained.startZ; }
// public void startZ(double value) { wrapperContained.startZ = value; }
// public double startY() { return wrapperContained.startY; }
// public void startY(double value) { wrapperContained.startY = value; }
// public double startX() { return wrapperContained.startX; }
// public void startX(double value) { wrapperContained.startX = value; }
// public boolean fullBrightness() { return wrapperContained.fullBrightness; }
// public void fullBrightness(boolean value) { wrapperContained.fullBrightness = value; }
// public Object dynamicAlpha() { return wrapperContained.dynamicAlpha; }
// // public void dynamicAlpha(Object value) { wrapperContained.dynamicAlpha = value; }
// public ConnectionParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,boolean fullBrightness,Object dynamicAlpha) { this.wrapperContained = new net.minecraft.client.particle.ConnectionParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,fullBrightness,dynamicAlpha); }

}