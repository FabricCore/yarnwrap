package yarnwrap.structure.rule;
public class TagMatchRuleTest { public net.minecraft.structure.rule.TagMatchRuleTest wrapperContained; public TagMatchRuleTest(net.minecraft.structure.rule.TagMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey tag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.tag); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}