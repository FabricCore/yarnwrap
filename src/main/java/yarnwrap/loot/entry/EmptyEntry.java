package yarnwrap.loot.entry;
public class EmptyEntry { public net.minecraft.loot.entry.EmptyEntry wrapperContained; public EmptyEntry(net.minecraft.loot.entry.EmptyEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder() { return wrapperContained.builder(); }

}