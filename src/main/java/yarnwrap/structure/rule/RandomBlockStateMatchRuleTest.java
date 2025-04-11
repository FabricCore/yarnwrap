package yarnwrap.structure.rule;
public class RandomBlockStateMatchRuleTest { public net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained; public RandomBlockStateMatchRuleTest(net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}