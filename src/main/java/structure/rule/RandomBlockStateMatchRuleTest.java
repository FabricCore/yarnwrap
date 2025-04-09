package yarnwrap.structure.rule;
public class RandomBlockStateMatchRuleTest { public net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained; public RandomBlockStateMatchRuleTest(net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}