package yarnwrap.structure.rule;
public class AlwaysTrueRuleTest { public net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained; public AlwaysTrueRuleTest(net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.rule.AlwaysTrueRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTrueRuleTest(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.rule.AlwaysTrueRuleTest value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}