package yarnwrap.world.gen.stateprovider;
public class NoiseThresholdBlockStateProvider { public net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider wrapperContained; public NoiseThresholdBlockStateProvider(net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float threshold() { return wrapperContained.threshold; }
// public float highChance() { return wrapperContained.highChance; }
// public yarnwrap.block.BlockState defaultState() { return new yarnwrap.block.BlockState(wrapperContained.defaultState); }
// public java.util.List lowStates() { return wrapperContained.lowStates; }
// public java.util.List highStates() { return wrapperContained.highStates; }

}