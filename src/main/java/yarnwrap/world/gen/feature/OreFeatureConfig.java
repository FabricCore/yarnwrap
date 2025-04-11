package yarnwrap.world.gen.feature;
public class OreFeatureConfig { public net.minecraft.world.gen.feature.OreFeatureConfig wrapperContained; public OreFeatureConfig(net.minecraft.world.gen.feature.OreFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.List targets() { return wrapperContained.targets; }
// public void targets(java.util.List value) { wrapperContained.targets = value; }
public float discardOnAirChance() { return wrapperContained.discardOnAirChance; }
// public void discardOnAirChance(float value) { wrapperContained.discardOnAirChance = value; }
public Object createTarget(yarnwrap.structure.rule.RuleTest test,yarnwrap.block.BlockState state) { return wrapperContained.createTarget(test.wrapperContained,state.wrapperContained); }

}