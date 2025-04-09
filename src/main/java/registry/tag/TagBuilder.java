package yarnwrap.registry.tag;
public class TagBuilder { public net.minecraft.registry.tag.TagBuilder wrapperContained; public TagBuilder(net.minecraft.registry.tag.TagBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
public yarnwrap.registry.tag.TagBuilder create() { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.create()); }
public java.util.List build() { return wrapperContained.build(); }
public yarnwrap.registry.tag.TagBuilder add(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.add(id.wrapperContained)); }
public yarnwrap.registry.tag.TagBuilder addTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.addTag(id.wrapperContained)); }
public yarnwrap.registry.tag.TagBuilder add(yarnwrap.registry.tag.TagEntry entry) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.add(entry.wrapperContained)); }
public yarnwrap.registry.tag.TagBuilder addOptional(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.addOptional(id.wrapperContained)); }
public yarnwrap.registry.tag.TagBuilder addOptionalTag(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.addOptionalTag(id.wrapperContained)); }

}