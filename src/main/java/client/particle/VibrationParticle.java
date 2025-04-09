package yarnwrap.client.particle;
public class VibrationParticle { public net.minecraft.client.particle.VibrationParticle wrapperContained; public VibrationParticle(net.minecraft.client.particle.VibrationParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.event.PositionSource vibration() { return new yarnwrap.world.event.PositionSource(wrapperContained.vibration); }

}