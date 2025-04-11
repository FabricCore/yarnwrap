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
public OreFeatureConfig(java.util.List targets,int size) { this.wrapperContained = new net.minecraft.world.gen.feature.OreFeatureConfig(targets,size); }
public OreFeatureConfig(java.util.List targets,int size,float discardOnAirChance) { this.wrapperContained = new net.minecraft.world.gen.feature.OreFeatureConfig(targets,size,discardOnAirChance); }
public OreFeatureConfig(yarnwrap.structure.rule.RuleTest test,yarnwrap.block.BlockState state,int size) { this.wrapperContained = new net.minecraft.world.gen.feature.OreFeatureConfig(test.wrapperContained,state.wrapperContained,size); }
public OreFeatureConfig(yarnwrap.structure.rule.RuleTest test,yarnwrap.block.BlockState state,int size,float discardOnAirChance) { this.wrapperContained = new net.minecraft.world.gen.feature.OreFeatureConfig(test.wrapperContained,state.wrapperContained,size,discardOnAirChance); }
// public java.util.List method_28745(yarnwrap.world.gen.feature.OreFeatureConfig config) { return wrapperContained.method_28745(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33992(Object instance) { return wrapperContained.method_33992(instance); }
// public java.lang.Float method_33993(yarnwrap.world.gen.feature.OreFeatureConfig config) { return wrapperContained.method_33993(config.wrapperContained); }
public Object createTarget(yarnwrap.structure.rule.RuleTest test,yarnwrap.block.BlockState state) { return wrapperContained.createTarget(test.wrapperContained,state.wrapperContained); }
// public java.lang.Integer method_33995(yarnwrap.world.gen.feature.OreFeatureConfig config) { return wrapperContained.method_33995(config.wrapperContained); }

}