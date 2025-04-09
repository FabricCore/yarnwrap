package yarnwrap.loot.entry;
public class TagEntry { public net.minecraft.loot.entry.TagEntry wrapperContained; public TagEntry(net.minecraft.loot.entry.TagEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey name() { return new yarnwrap.registry.tag.TagKey(wrapperContained.name); }
// public boolean expand() { return wrapperContained.expand; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.registry.tag.TagKey name) { return wrapperContained.builder(name.wrapperContained); }
public Object expandBuilder(yarnwrap.registry.tag.TagKey name) { return wrapperContained.expandBuilder(name.wrapperContained); }
// public boolean grow(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootChoiceExpander) { return wrapperContained.grow(context.wrapperContained,lootChoiceExpander); }

}