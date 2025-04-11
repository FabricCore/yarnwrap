package yarnwrap.loot.entry;
public class EmptyEntry { public net.minecraft.loot.entry.EmptyEntry wrapperContained; public EmptyEntry(net.minecraft.loot.entry.EmptyEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public EmptyEntry(int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.EmptyEntry(weight,quality,conditions,functions); }
public Object builder() { return wrapperContained.builder(); }
// public com.mojang.datafixers.kinds.App method_53284(Object instance) { return wrapperContained.method_53284(instance); }

}