package yarnwrap.structure.rule;
public class LinearPosRuleTest { public net.minecraft.structure.rule.LinearPosRuleTest wrapperContained; public LinearPosRuleTest(net.minecraft.structure.rule.LinearPosRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float minChance() { return wrapperContained.minChance; }
// public float maxChance() { return wrapperContained.maxChance; }
// public int minDistance() { return wrapperContained.minDistance; }
// public int maxDistance() { return wrapperContained.maxDistance; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}