package yarnwrap.loot.entry;
public class CombinedEntry { public net.minecraft.loot.entry.CombinedEntry wrapperContained; public CombinedEntry(net.minecraft.loot.entry.CombinedEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public yarnwrap.loot.entry.EntryCombiner predicate() { return new yarnwrap.loot.entry.EntryCombiner(wrapperContained.predicate); }
// public void predicate(yarnwrap.loot.entry.EntryCombiner value) { wrapperContained.predicate = value.wrapperContained; }
// public yarnwrap.loot.entry.EntryCombiner combine(java.util.List terms) { return new yarnwrap.loot.entry.EntryCombiner(wrapperContained.combine(terms)); }
// public com.mojang.serialization.MapCodec createCodec(Object factory) { return wrapperContained.createCodec(factory); }

}