package yarnwrap.world.gen.blockpredicate;
public class MatchingBlockTagPredicate { public net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained; public MatchingBlockTagPredicate(net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey tag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.tag); }
// public void tag(yarnwrap.registry.tag.TagKey value) { wrapperContained.tag = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}