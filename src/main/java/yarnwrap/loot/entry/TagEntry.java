package yarnwrap.loot.entry;
public class TagEntry { public net.minecraft.loot.entry.TagEntry wrapperContained; public TagEntry(net.minecraft.loot.entry.TagEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey name() { return new yarnwrap.registry.tag.TagKey(wrapperContained.name); }
// public void name(yarnwrap.registry.tag.TagKey value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey name() { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.entry.TagEntry.name); }
// public static void name(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.loot.entry.TagEntry.name = value.wrapperContained; }

// public boolean expand() { return wrapperContained.expand; }
// public void expand(boolean value) { wrapperContained.expand = value; }
// public static boolean expand() { return net.minecraft.loot.entry.TagEntry.expand; }
// public static void expand(boolean value, ) { net.minecraft.loot.entry.TagEntry.expand = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.TagEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.TagEntry.CODEC = value; }

// public TagEntry(yarnwrap.registry.tag.TagKey name,boolean expand,int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.TagEntry(name.wrapperContained,expand,weight,quality,conditions,functions); }
// public Object builder(yarnwrap.registry.tag.TagKey name) { return wrapperContained.builder(name.wrapperContained); }
// public static Object builder(yarnwrap.registry.tag.TagKey name, ) { return net.minecraft.loot.entry.TagEntry.builder(name.wrapperContained); }
// public yarnwrap.loot.entry.LeafEntry method_35518(yarnwrap.registry.tag.TagKey weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_35518(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_35518(yarnwrap.registry.tag.TagKey weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.TagEntry.method_35518(weight.wrapperContained,quality,conditions,functions)); }
// public yarnwrap.loot.entry.LeafEntry method_444(yarnwrap.registry.tag.TagKey weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_444(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_444(yarnwrap.registry.tag.TagKey weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.TagEntry.method_444(weight.wrapperContained,quality,conditions,functions)); }
// public Object expandBuilder(yarnwrap.registry.tag.TagKey name) { return wrapperContained.expandBuilder(name.wrapperContained); }
// public static Object expandBuilder(yarnwrap.registry.tag.TagKey name, ) { return net.minecraft.loot.entry.TagEntry.expandBuilder(name.wrapperContained); }
// public boolean grow(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootChoiceExpander) { return wrapperContained.grow(context.wrapperContained,lootChoiceExpander); }
// public static boolean grow(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootChoiceExpander, ) { return net.minecraft.loot.entry.TagEntry.grow(context.wrapperContained,lootChoiceExpander); }
// public void method_449(java.util.function.Consumer entry) { wrapperContained.method_449(entry); }
// public static void method_449(java.util.function.Consumer entry, ) { net.minecraft.loot.entry.TagEntry.method_449(entry); }
// public java.lang.Boolean method_53295(yarnwrap.loot.entry.TagEntry entry) { return wrapperContained.method_53295(entry.wrapperContained); }
// public static java.lang.Boolean method_53295(yarnwrap.loot.entry.TagEntry entry, ) { return net.minecraft.loot.entry.TagEntry.method_53295(entry.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_53296(yarnwrap.loot.entry.TagEntry entry) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_53296(entry.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_53296(yarnwrap.loot.entry.TagEntry entry, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.entry.TagEntry.method_53296(entry.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53297(Object instance) { return wrapperContained.method_53297(instance); }
// public static com.mojang.datafixers.kinds.App method_53297(Object instance, ) { return net.minecraft.loot.entry.TagEntry.method_53297(instance); }

}