package yarnwrap.world.gen.stateprovider;
public class NoiseThresholdBlockStateProvider { public net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider wrapperContained; public NoiseThresholdBlockStateProvider(net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float threshold() { return wrapperContained.threshold; }
// public void threshold(float value) { wrapperContained.threshold = value; }
// public float highChance() { return wrapperContained.highChance; }
// public void highChance(float value) { wrapperContained.highChance = value; }
// public yarnwrap.block.BlockState defaultState() { return new yarnwrap.block.BlockState(wrapperContained.defaultState); }
// public void defaultState(yarnwrap.block.BlockState value) { wrapperContained.defaultState = value.wrapperContained; }
// public java.util.List lowStates() { return wrapperContained.lowStates; }
// public void lowStates(java.util.List value) { wrapperContained.lowStates = value; }
// public java.util.List highStates() { return wrapperContained.highStates; }
// public void highStates(java.util.List value) { wrapperContained.highStates = value; }

}