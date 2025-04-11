package yarnwrap.structure.rule;
public class RandomBlockMatchRuleTest { public net.minecraft.structure.rule.RandomBlockMatchRuleTest wrapperContained; public RandomBlockMatchRuleTest(net.minecraft.structure.rule.RandomBlockMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public RandomBlockMatchRuleTest(yarnwrap.block.Block block,float probability) { this.wrapperContained = new net.minecraft.structure.rule.RandomBlockMatchRuleTest(block.wrapperContained,probability); }
// public com.mojang.datafixers.kinds.App method_28990(Object instance) { return wrapperContained.method_28990(instance); }
// public java.lang.Float method_28991(yarnwrap.structure.rule.RandomBlockMatchRuleTest ruleTest) { return wrapperContained.method_28991(ruleTest.wrapperContained); }
// public yarnwrap.block.Block method_28992(yarnwrap.structure.rule.RandomBlockMatchRuleTest ruleTest) { return new yarnwrap.block.Block(wrapperContained.method_28992(ruleTest.wrapperContained)); }

}