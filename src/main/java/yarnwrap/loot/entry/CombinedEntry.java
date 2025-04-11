package yarnwrap.loot.entry;
public class CombinedEntry { public net.minecraft.loot.entry.CombinedEntry wrapperContained; public CombinedEntry(net.minecraft.loot.entry.CombinedEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public yarnwrap.loot.entry.EntryCombiner predicate() { return new yarnwrap.loot.entry.EntryCombiner(wrapperContained.predicate); }
// public void predicate(yarnwrap.loot.entry.EntryCombiner value) { wrapperContained.predicate = value.wrapperContained; }
// public CombinedEntry(java.util.List terms,java.util.List conditions) { this.wrapperContained = new net.minecraft.loot.entry.CombinedEntry(terms,conditions); }
// public yarnwrap.loot.entry.EntryCombiner combine(java.util.List terms) { return new yarnwrap.loot.entry.EntryCombiner(wrapperContained.combine(terms)); }
// public com.mojang.serialization.MapCodec createCodec(Object factory) { return wrapperContained.createCodec(factory); }
// public com.mojang.datafixers.kinds.App method_53280(Object instance) { return wrapperContained.method_53280(instance); }
// public java.util.List method_53281(yarnwrap.loot.entry.CombinedEntry entry) { return wrapperContained.method_53281(entry.wrapperContained); }

}