package yarnwrap.structure.rule;
public class AlwaysTruePosRuleTest { public net.minecraft.structure.rule.AlwaysTruePosRuleTest wrapperContained; public AlwaysTruePosRuleTest(net.minecraft.structure.rule.AlwaysTruePosRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.rule.AlwaysTruePosRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTruePosRuleTest(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}