package yarnwrap.client.particle;
public class ConnectionParticle { public net.minecraft.client.particle.ConnectionParticle wrapperContained; public ConnectionParticle(net.minecraft.client.particle.ConnectionParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public double startZ() { return wrapperContained.startZ; }
// public void startZ(double value) { wrapperContained.startZ = value; }
// public static double startZ() { return net.minecraft.client.particle.ConnectionParticle.startZ; }
// public static void startZ(double value, ) { net.minecraft.client.particle.ConnectionParticle.startZ = value; }

// public double startY() { return wrapperContained.startY; }
// public void startY(double value) { wrapperContained.startY = value; }
// public static double startY() { return net.minecraft.client.particle.ConnectionParticle.startY; }
// public static void startY(double value, ) { net.minecraft.client.particle.ConnectionParticle.startY = value; }

// public double startX() { return wrapperContained.startX; }
// public void startX(double value) { wrapperContained.startX = value; }
// public static double startX() { return net.minecraft.client.particle.ConnectionParticle.startX; }
// public static void startX(double value, ) { net.minecraft.client.particle.ConnectionParticle.startX = value; }

// public boolean fullBrightness() { return wrapperContained.fullBrightness; }
// public void fullBrightness(boolean value) { wrapperContained.fullBrightness = value; }
// public static boolean fullBrightness() { return net.minecraft.client.particle.ConnectionParticle.fullBrightness; }
// public static void fullBrightness(boolean value, ) { net.minecraft.client.particle.ConnectionParticle.fullBrightness = value; }

// public Object dynamicAlpha() { return wrapperContained.dynamicAlpha; }
// // public void dynamicAlpha(Object value) { wrapperContained.dynamicAlpha = value; }
// // public static Object dynamicAlpha() { return net.minecraft.client.particle.ConnectionParticle.dynamicAlpha; }
// // public static void dynamicAlpha(Object value, ) { net.minecraft.client.particle.ConnectionParticle.dynamicAlpha = value; }

// public ConnectionParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,boolean fullBrightness,Object dynamicAlpha) { this.wrapperContained = new net.minecraft.client.particle.ConnectionParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,fullBrightness,dynamicAlpha); }

}