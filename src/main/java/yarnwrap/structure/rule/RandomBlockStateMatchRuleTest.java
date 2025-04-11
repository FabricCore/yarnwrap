package yarnwrap.structure.rule;
public class RandomBlockStateMatchRuleTest { public net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained; public RandomBlockStateMatchRuleTest(net.minecraft.structure.rule.RandomBlockStateMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public RandomBlockStateMatchRuleTest(yarnwrap.block.BlockState blockState,float probability) { this.wrapperContained = new net.minecraft.structure.rule.RandomBlockStateMatchRuleTest(blockState.wrapperContained,probability); }
// public com.mojang.datafixers.kinds.App method_28993(Object instance) { return wrapperContained.method_28993(instance); }
// public java.lang.Float method_28994(yarnwrap.structure.rule.RandomBlockStateMatchRuleTest ruleTest) { return wrapperContained.method_28994(ruleTest.wrapperContained); }
// public yarnwrap.block.BlockState method_28995(yarnwrap.structure.rule.RandomBlockStateMatchRuleTest ruleTest) { return new yarnwrap.block.BlockState(wrapperContained.method_28995(ruleTest.wrapperContained)); }

}