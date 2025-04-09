package yarnwrap.structure.rule;
public class AlwaysTrueRuleTest { public net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained; public AlwaysTrueRuleTest(net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.rule.AlwaysTrueRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTrueRuleTest(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}