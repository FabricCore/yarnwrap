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
// public TagEntry(yarnwrap.util.Identifier id,boolean tag,boolean required) { this.wrapperContained = new net.minecraft.registry.tag.TagEntry(id.wrapperContained,tag,required); }
// public TagEntry(Object id,boolean required) { this.wrapperContained = new net.minecraft.registry.tag.TagEntry(id,required); }
// public boolean resolve(Object valueGetter,java.util.function.Consumer idConsumer) { return wrapperContained.resolve(valueGetter,idConsumer); }
public void forEachRequiredTagId(java.util.function.Consumer idConsumer) { wrapperContained.forEachRequiredTagId(idConsumer); }
public boolean canAdd(java.util.function.Predicate directEntryPredicate,java.util.function.Predicate tagEntryPredicate) { return wrapperContained.canAdd(directEntryPredicate,tagEntryPredicate); }
// public Object getIdForCodec() { return wrapperContained.getIdForCodec(); }
public yarnwrap.registry.tag.TagEntry create(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.create(id.wrapperContained)); }
// public com.mojang.datafixers.util.Either method_43938(yarnwrap.registry.tag.TagEntry entry) { return wrapperContained.method_43938(entry.wrapperContained); }
// public yarnwrap.registry.tag.TagEntry method_43939(Object id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.method_43939(id)); }
// public yarnwrap.registry.tag.TagEntry method_43940(com.mojang.datafixers.util.Either either) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.method_43940(either)); }
// public com.mojang.datafixers.kinds.App method_43941(Object instance) { return wrapperContained.method_43941(instance); }
public yarnwrap.registry.tag.TagEntry createOptional(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createOptional(id.wrapperContained)); }
// public yarnwrap.registry.tag.TagEntry method_43943(yarnwrap.registry.tag.TagEntry entry) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.method_43943(entry.wrapperContained)); }
public void forEachOptionalTagId(java.util.function.Consumer idConsumer) { wrapperContained.forEachOptionalTagId(idConsumer); }
public yarnwrap.registry.tag.TagEntry createTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createTag(id.wrapperContained)); }
// public java.lang.Boolean method_43946(yarnwrap.registry.tag.TagEntry entry) { return wrapperContained.method_43946(entry.wrapperContained); }
public yarnwrap.registry.tag.TagEntry createOptionalTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagEntry(wrapperContained.createOptionalTag(id.wrapperContained)); }

}