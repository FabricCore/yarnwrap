package yarnwrap.loot.entry;
public class DynamicEntry { public net.minecraft.loot.entry.DynamicEntry wrapperContained; public DynamicEntry(net.minecraft.loot.entry.DynamicEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
public Object builder(yarnwrap.util.Identifier name) { return wrapperContained.builder(name.wrapperContained); }

}