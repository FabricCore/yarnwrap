package yarnwrap.registry.tag;
public class TagEntry { public net.minecraft.registry.tag.TagEntry wrapperContained; public TagEntry(net.minecraft.registry.tag.TagEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
// public boolean tag() { return wrapperContained.tag; }
// public void tag(boolean value) { wrapperContained.tag = value; }
// public boolean required() { return wrapperContained.required; }
// public void required(boolean value) { wrapperContained.required = value; }
// public boolean resolve(Object valueGetter,java.util.function.Consumer idConsumer) { return wrapperContained.resolve(valueGetter,idConsumer); }
public void forEachRequiredTagId(java.util.function.Consumer idConsumer) { wrapperContained.forEachRequiredTagId(idConsumer); }
public boolean canAdd(java.util.function.Predicate directEntryPredicate,java.util.function.Predicate tagEntryPredicate) { return wrapperContained.canAdd(directEntryPredicate,tagEntryPredicate); }
// public Object getIdForCodec() { return wrapperContained.getIdForCodec(); }
public yarnwrap.registry.tag.TagEntry create(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.create(id.wrapperContained)); }
public yarnwrap.registry.tag.TagEntry createOptional(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createOptional(id.wrapperContained)); }
public void forEachOptionalTagId(java.util.function.Consumer idConsumer) { wrapperContained.forEachOptionalTagId(idConsumer); }
public yarnwrap.registry.tag.TagEntry createTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createTag(id.wrapperContained)); }
public yarnwrap.registry.tag.TagEntry createOptionalTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createOptionalTag(id.wrapperContained)); }

}