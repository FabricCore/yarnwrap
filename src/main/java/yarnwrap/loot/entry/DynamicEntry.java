package yarnwrap.loot.entry;
public class DynamicEntry { public net.minecraft.loot.entry.DynamicEntry wrapperContained; public DynamicEntry(net.minecraft.loot.entry.DynamicEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.DynamicEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.DynamicEntry.CODEC = value; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.loot.entry.DynamicEntry.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.loot.entry.DynamicEntry.name = value.wrapperContained; }

// public DynamicEntry(yarnwrap.util.Identifier name,int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.DynamicEntry(name.wrapperContained,weight,quality,conditions,functions); }
// public Object builder(yarnwrap.util.Identifier name) { return wrapperContained.builder(name.wrapperContained); }
// public static Object builder(yarnwrap.util.Identifier name, ) { return net.minecraft.loot.entry.DynamicEntry.builder(name.wrapperContained); }
// public yarnwrap.loot.entry.LeafEntry method_391(yarnwrap.util.Identifier weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_391(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_391(yarnwrap.util.Identifier weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.DynamicEntry.method_391(weight.wrapperContained,quality,conditions,functions)); }
// public yarnwrap.util.Identifier method_53282(yarnwrap.loot.entry.DynamicEntry entry) { return new yarnwrap.util.Identifier(wrapperContained.method_53282(entry.wrapperContained)); }
// public static yarnwrap.util.Identifier method_53282(yarnwrap.loot.entry.DynamicEntry entry, ) { return new yarnwrap.util.Identifier(net.minecraft.loot.entry.DynamicEntry.method_53282(entry.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53283(Object instance) { return wrapperContained.method_53283(instance); }
// public static com.mojang.datafixers.kinds.App method_53283(Object instance, ) { return net.minecraft.loot.entry.DynamicEntry.method_53283(instance); }

}