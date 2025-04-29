package yarnwrap.structure.rule;
public class AlwaysTrueRuleTest { public net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained; public AlwaysTrueRuleTest(net.minecraft.structure.rule.AlwaysTrueRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.rule.AlwaysTrueRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTrueRuleTest(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.rule.AlwaysTrueRuleTest value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.rule.AlwaysTrueRuleTest INSTANCE() { return new yarnwrap.structure.rule.AlwaysTrueRuleTest(net.minecraft.structure.rule.AlwaysTrueRuleTest.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.rule.AlwaysTrueRuleTest value, ) { net.minecraft.structure.rule.AlwaysTrueRuleTest.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.rule.AlwaysTrueRuleTest.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.rule.AlwaysTrueRuleTest.CODEC = value; }


}