package yarnwrap.predicate;
public class TagPredicate { public net.minecraft.predicate.TagPredicate wrapperContained; public TagPredicate(net.minecraft.predicate.TagPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.predicate.TagPredicate expected(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.TagPredicate(wrapperContained.expected(tag.wrapperContained)); }
public boolean test(yarnwrap.registry.entry.RegistryEntry registryEntry) { return wrapperContained.test(registryEntry.wrapperContained); }
public yarnwrap.predicate.TagPredicate unexpected(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.TagPredicate(wrapperContained.unexpected(tag.wrapperContained)); }
public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.createCodec(registryRef.wrapperContained); }

}