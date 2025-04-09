package yarnwrap.loot.entry;
public class SequenceEntry { public net.minecraft.loot.entry.SequenceEntry wrapperContained; public SequenceEntry(net.minecraft.loot.entry.SequenceEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }

}