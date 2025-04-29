package yarnwrap.client.particle;
public class GustEmitterParticle { public net.minecraft.client.particle.GustEmitterParticle wrapperContained; public GustEmitterParticle(net.minecraft.client.particle.GustEmitterParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public double deviation() { return wrapperContained.deviation; }
// public void deviation(double value) { wrapperContained.deviation = value; }
// public static double deviation() { return net.minecraft.client.particle.GustEmitterParticle.deviation; }
// public static void deviation(double value, ) { net.minecraft.client.particle.GustEmitterParticle.deviation = value; }

// public int interval() { return wrapperContained.interval; }
// public void interval(int value) { wrapperContained.interval = value; }
// public static int interval() { return net.minecraft.client.particle.GustEmitterParticle.interval; }
// public static void interval(int value, ) { net.minecraft.client.particle.GustEmitterParticle.interval = value; }

// public GustEmitterParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double deviation,int maxAge,int interval) { this.wrapperContained = new net.minecraft.client.particle.GustEmitterParticle(world.wrapperContained,x,y,z,deviation,maxAge,interval); }

}