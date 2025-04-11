package yarnwrap.structure.rule;
public class AlwaysTruePosRuleTest { public net.minecraft.structure.rule.AlwaysTruePosRuleTest wrapperContained; public AlwaysTruePosRuleTest(net.minecraft.structure.rule.AlwaysTruePosRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.rule.AlwaysTruePosRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTruePosRuleTest(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.rule.AlwaysTruePosRuleTest value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}