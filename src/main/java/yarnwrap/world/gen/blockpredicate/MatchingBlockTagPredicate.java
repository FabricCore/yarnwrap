package yarnwrap.world.gen.blockpredicate;
public class MatchingBlockTagPredicate { public net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained; public MatchingBlockTagPredicate(net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey tag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.tag); }
// public void tag(yarnwrap.registry.tag.TagKey value) { wrapperContained.tag = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public MatchingBlockTagPredicate(yarnwrap.util.math.Vec3i offset,yarnwrap.registry.tag.TagKey tag) { this.wrapperContained = new net.minecraft.world.gen.blockpredicate.MatchingBlockTagPredicate(offset.wrapperContained,tag.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_39915(yarnwrap.world.gen.blockpredicate.MatchingBlockTagPredicate predicate) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_39915(predicate.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_39916(Object instance) { return wrapperContained.method_39916(instance); }

}