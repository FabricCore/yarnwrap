package yarnwrap.client.particle;
public class VibrationParticle { public net.minecraft.client.particle.VibrationParticle wrapperContained; public VibrationParticle(net.minecraft.client.particle.VibrationParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.event.PositionSource vibration() { return new yarnwrap.world.event.PositionSource(wrapperContained.vibration); }
// public void vibration(yarnwrap.world.event.PositionSource value) { wrapperContained.vibration = value.wrapperContained; }
// public VibrationParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.world.event.PositionSource vibration,int maxAge) { this.wrapperContained = new net.minecraft.client.particle.VibrationParticle(world.wrapperContained,x,y,z,vibration.wrapperContained,maxAge); }

}