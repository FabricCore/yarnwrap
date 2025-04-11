package yarnwrap.world.gen.feature;
public class EndSpikeFeatureConfig { public net.minecraft.world.gen.feature.EndSpikeFeatureConfig wrapperContained; public EndSpikeFeatureConfig(net.minecraft.world.gen.feature.EndSpikeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos crystalBeamTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.crystalBeamTarget); }
// public void crystalBeamTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.crystalBeamTarget = value.wrapperContained; }
// public boolean crystalInvulnerable() { return wrapperContained.crystalInvulnerable; }
// public void crystalInvulnerable(boolean value) { wrapperContained.crystalInvulnerable = value; }
// public java.util.List spikes() { return wrapperContained.spikes; }
// public void spikes(java.util.List value) { wrapperContained.spikes = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public EndSpikeFeatureConfig(boolean crystalInvulnerable,java.util.List spikes,java.util.Optional crystalBeamTarget) { this.wrapperContained = new net.minecraft.world.gen.feature.EndSpikeFeatureConfig(crystalInvulnerable,spikes,crystalBeamTarget); }
public EndSpikeFeatureConfig(boolean crystalInvulnerable,java.util.List spikes,yarnwrap.util.math.BlockPos crystalBeamTarget) { this.wrapperContained = new net.minecraft.world.gen.feature.EndSpikeFeatureConfig(crystalInvulnerable,spikes,crystalBeamTarget.wrapperContained); }
public boolean isCrystalInvulnerable() { return wrapperContained.isCrystalInvulnerable(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public java.util.List getSpikes() { return wrapperContained.getSpikes(); }
// public java.util.Optional method_28789(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28789(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28790(Object instance) { return wrapperContained.method_28790(instance); }
// public java.util.List method_28791(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28791(config.wrapperContained); }
// public java.lang.Boolean method_28792(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28792(config.wrapperContained); }

}