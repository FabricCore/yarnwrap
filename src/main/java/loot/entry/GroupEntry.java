package yarnwrap.loot.entry;
public class GroupEntry { public net.minecraft.loot.entry.GroupEntry wrapperContained; public GroupEntry(net.minecraft.loot.entry.GroupEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }

}