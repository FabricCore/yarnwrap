package yarnwrap.structure.rule;
public class RandomBlockMatchRuleTest { public net.minecraft.structure.rule.RandomBlockMatchRuleTest wrapperContained; public RandomBlockMatchRuleTest(net.minecraft.structure.rule.RandomBlockMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}