package yarnwrap.structure.rule;
public class LinearPosRuleTest { public net.minecraft.structure.rule.LinearPosRuleTest wrapperContained; public LinearPosRuleTest(net.minecraft.structure.rule.LinearPosRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public float minChance() { return wrapperContained.minChance; }
// public void minChance(float value) { wrapperContained.minChance = value; }
// public float maxChance() { return wrapperContained.maxChance; }
// public void maxChance(float value) { wrapperContained.maxChance = value; }
// public int minDistance() { return wrapperContained.minDistance; }
// public void minDistance(int value) { wrapperContained.minDistance = value; }
// public int maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(int value) { wrapperContained.maxDistance = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public LinearPosRuleTest(float minChance,float maxChance,int minDistance,int maxDistance) { this.wrapperContained = new net.minecraft.structure.rule.LinearPosRuleTest(minChance,maxChance,minDistance,maxDistance); }
// public com.mojang.datafixers.kinds.App method_28976(Object instance) { return wrapperContained.method_28976(instance); }
// public java.lang.Integer method_28977(yarnwrap.structure.rule.LinearPosRuleTest ruleTest) { return wrapperContained.method_28977(ruleTest.wrapperContained); }
// public java.lang.Integer method_28978(yarnwrap.structure.rule.LinearPosRuleTest ruleTest) { return wrapperContained.method_28978(ruleTest.wrapperContained); }
// public java.lang.Float method_28979(yarnwrap.structure.rule.LinearPosRuleTest ruleTest) { return wrapperContained.method_28979(ruleTest.wrapperContained); }
// public java.lang.Float method_28980(yarnwrap.structure.rule.LinearPosRuleTest ruleTest) { return wrapperContained.method_28980(ruleTest.wrapperContained); }

}