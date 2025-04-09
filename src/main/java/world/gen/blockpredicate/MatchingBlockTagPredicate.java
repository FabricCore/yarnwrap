package yarnwrap.world.gen.blockpredicate;
public class MatchingBlockTagPredicate { public net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained; public MatchingBlockTagPredicate(net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey tag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.tag); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}