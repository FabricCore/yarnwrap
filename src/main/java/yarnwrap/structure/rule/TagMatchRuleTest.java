package yarnwrap.structure.rule;
public class TagMatchRuleTest { public net.minecraft.structure.rule.TagMatchRuleTest wrapperContained; public TagMatchRuleTest(net.minecraft.structure.rule.TagMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey tag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.tag); }
// public void tag(yarnwrap.registry.tag.TagKey value) { wrapperContained.tag = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public TagMatchRuleTest(yarnwrap.registry.tag.TagKey tag) { this.wrapperContained = new net.minecraft.structure.rule.TagMatchRuleTest(tag.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_28999(yarnwrap.structure.rule.TagMatchRuleTest ruleTest) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_28999(ruleTest.wrapperContained)); }

}