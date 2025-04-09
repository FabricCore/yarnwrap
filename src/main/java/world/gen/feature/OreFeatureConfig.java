package yarnwrap.world.gen.feature;
public class OreFeatureConfig { public net.minecraft.world.gen.feature.OreFeatureConfig wrapperContained; public OreFeatureConfig(net.minecraft.world.gen.feature.OreFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public int size() { return wrapperContained.size; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.util.List targets() { return wrapperContained.targets; }
public float discardOnAirChance() { return wrapperContained.discardOnAirChance; }
public Object createTarget(yarnwrap.structure.rule.RuleTest test,yarnwrap.block.BlockState state) { return wrapperContained.createTarget(test.wrapperContained,state.wrapperContained); }

}