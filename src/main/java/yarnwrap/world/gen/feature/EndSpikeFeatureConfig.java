package yarnwrap.world.gen.feature;
public class EndSpikeFeatureConfig { public net.minecraft.world.gen.feature.EndSpikeFeatureConfig wrapperContained; public EndSpikeFeatureConfig(net.minecraft.world.gen.feature.EndSpikeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos crystalBeamTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.crystalBeamTarget); }
// public void crystalBeamTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.crystalBeamTarget = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos crystalBeamTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.EndSpikeFeatureConfig.crystalBeamTarget); }
// public static void crystalBeamTarget(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.gen.feature.EndSpikeFeatureConfig.crystalBeamTarget = value.wrapperContained; }

// public boolean crystalInvulnerable() { return wrapperContained.crystalInvulnerable; }
// public void crystalInvulnerable(boolean value) { wrapperContained.crystalInvulnerable = value; }
// public static boolean crystalInvulnerable() { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.crystalInvulnerable; }
// public static void crystalInvulnerable(boolean value, ) { net.minecraft.world.gen.feature.EndSpikeFeatureConfig.crystalInvulnerable = value; }

// public java.util.List spikes() { return wrapperContained.spikes; }
// public void spikes(java.util.List value) { wrapperContained.spikes = value; }
// public static java.util.List spikes() { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.spikes; }
// public static void spikes(java.util.List value, ) { net.minecraft.world.gen.feature.EndSpikeFeatureConfig.spikes = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.EndSpikeFeatureConfig.CODEC = value; }

// public EndSpikeFeatureConfig(boolean crystalInvulnerable,java.util.List spikes,java.util.Optional crystalBeamTarget) { this.wrapperContained = new net.minecraft.world.gen.feature.EndSpikeFeatureConfig(crystalInvulnerable,spikes,crystalBeamTarget); }
public EndSpikeFeatureConfig(boolean crystalInvulnerable,java.util.List spikes,yarnwrap.util.math.BlockPos crystalBeamTarget) { this.wrapperContained = new net.minecraft.world.gen.feature.EndSpikeFeatureConfig(crystalInvulnerable,spikes,crystalBeamTarget.wrapperContained); }
public boolean isCrystalInvulnerable() { return wrapperContained.isCrystalInvulnerable(); }
// public static boolean isCrystalInvulnerable() { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.isCrystalInvulnerable(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.EndSpikeFeatureConfig.getPos()); }
public java.util.List getSpikes() { return wrapperContained.getSpikes(); }
// public static java.util.List getSpikes() { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.getSpikes(); }
// public java.util.Optional method_28789(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28789(config.wrapperContained); }
// public static java.util.Optional method_28789(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config, ) { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.method_28789(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28790(Object instance) { return wrapperContained.method_28790(instance); }
// public static com.mojang.datafixers.kinds.App method_28790(Object instance, ) { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.method_28790(instance); }
// public java.util.List method_28791(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28791(config.wrapperContained); }
// public static java.util.List method_28791(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config, ) { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.method_28791(config.wrapperContained); }
// public java.lang.Boolean method_28792(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config) { return wrapperContained.method_28792(config.wrapperContained); }
// public static java.lang.Boolean method_28792(yarnwrap.world.gen.feature.EndSpikeFeatureConfig config, ) { return net.minecraft.world.gen.feature.EndSpikeFeatureConfig.method_28792(config.wrapperContained); }

}