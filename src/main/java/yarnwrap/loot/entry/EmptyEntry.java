package yarnwrap.loot.entry;
public class EmptyEntry { public net.minecraft.loot.entry.EmptyEntry wrapperContained; public EmptyEntry(net.minecraft.loot.entry.EmptyEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.EmptyEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.EmptyEntry.CODEC = value; }

// public EmptyEntry(int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.EmptyEntry(weight,quality,conditions,functions); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.entry.EmptyEntry.builder(); }
// public com.mojang.datafixers.kinds.App method_53284(Object instance) { return wrapperContained.method_53284(instance); }
// public static com.mojang.datafixers.kinds.App method_53284(Object instance, ) { return net.minecraft.loot.entry.EmptyEntry.method_53284(instance); }

}