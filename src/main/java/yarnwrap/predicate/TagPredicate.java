package yarnwrap.predicate;
public class TagPredicate { public net.minecraft.predicate.TagPredicate wrapperContained; public TagPredicate(net.minecraft.predicate.TagPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public TagPredicate(yarnwrap.registry.tag.TagKey tag,boolean expected) { this.wrapperContained = new net.minecraft.predicate.TagPredicate(tag.wrapperContained,expected); }
public yarnwrap.predicate.TagPredicate expected(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.TagPredicate(wrapperContained.expected(tag.wrapperContained)); }
public boolean test(yarnwrap.registry.entry.RegistryEntry registryEntry) { return wrapperContained.test(registryEntry.wrapperContained); }
public yarnwrap.predicate.TagPredicate unexpected(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.TagPredicate(wrapperContained.unexpected(tag.wrapperContained)); }
public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.createCodec(registryRef.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53246(yarnwrap.registry.RegistryKey instance) { return wrapperContained.method_53246(instance.wrapperContained); }

}