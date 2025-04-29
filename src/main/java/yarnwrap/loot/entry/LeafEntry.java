package yarnwrap.loot.entry;
public class LeafEntry { public net.minecraft.loot.entry.LeafEntry wrapperContained; public LeafEntry(net.minecraft.loot.entry.LeafEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_WEIGHT() { return wrapperContained.DEFAULT_WEIGHT; }
// public void DEFAULT_WEIGHT(int value) { wrapperContained.DEFAULT_WEIGHT = value; }
public static int DEFAULT_WEIGHT() { return net.minecraft.loot.entry.LeafEntry.DEFAULT_WEIGHT; }
// public static void DEFAULT_WEIGHT(int value, ) { net.minecraft.loot.entry.LeafEntry.DEFAULT_WEIGHT = value; }

// public int DEFAULT_QUALITY() { return wrapperContained.DEFAULT_QUALITY; }
// public void DEFAULT_QUALITY(int value) { wrapperContained.DEFAULT_QUALITY = value; }
public static int DEFAULT_QUALITY() { return net.minecraft.loot.entry.LeafEntry.DEFAULT_QUALITY; }
// public static void DEFAULT_QUALITY(int value, ) { net.minecraft.loot.entry.LeafEntry.DEFAULT_QUALITY = value; }

// public int quality() { return wrapperContained.quality; }
// public void quality(int value) { wrapperContained.quality = value; }
// public static int quality() { return net.minecraft.loot.entry.LeafEntry.quality; }
// public static void quality(int value, ) { net.minecraft.loot.entry.LeafEntry.quality = value; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public static int weight() { return net.minecraft.loot.entry.LeafEntry.weight; }
// public static void weight(int value, ) { net.minecraft.loot.entry.LeafEntry.weight = value; }

// public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public static java.util.List functions() { return net.minecraft.loot.entry.LeafEntry.functions; }
// public static void functions(java.util.List value, ) { net.minecraft.loot.entry.LeafEntry.functions = value; }

// public java.util.function.BiFunction compiledFunctions() { return wrapperContained.compiledFunctions; }
// public void compiledFunctions(java.util.function.BiFunction value) { wrapperContained.compiledFunctions = value; }
// public static java.util.function.BiFunction compiledFunctions() { return net.minecraft.loot.entry.LeafEntry.compiledFunctions; }
// public static void compiledFunctions(java.util.function.BiFunction value, ) { net.minecraft.loot.entry.LeafEntry.compiledFunctions = value; }

// public yarnwrap.loot.LootChoice choice() { return new yarnwrap.loot.LootChoice(wrapperContained.choice); }
// public void choice(yarnwrap.loot.LootChoice value) { wrapperContained.choice = value.wrapperContained; }
// public static yarnwrap.loot.LootChoice choice() { return new yarnwrap.loot.LootChoice(net.minecraft.loot.entry.LeafEntry.choice); }
// public static void choice(yarnwrap.loot.LootChoice value, ) { net.minecraft.loot.entry.LeafEntry.choice = value.wrapperContained; }

// public LeafEntry(int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.LeafEntry(weight,quality,conditions,functions); }
// public void generateLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.generateLoot(lootConsumer,context.wrapperContained); }
// public static void generateLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context, ) { net.minecraft.loot.entry.LeafEntry.generateLoot(lootConsumer,context.wrapperContained); }
// public Object builder(Object factory) { return wrapperContained.builder(factory); }
// public static Object builder(Object factory, ) { return net.minecraft.loot.entry.LeafEntry.builder(factory); }
// public java.util.List method_53289(yarnwrap.loot.entry.LeafEntry entry) { return wrapperContained.method_53289(entry.wrapperContained); }
// public static java.util.List method_53289(yarnwrap.loot.entry.LeafEntry entry, ) { return net.minecraft.loot.entry.LeafEntry.method_53289(entry.wrapperContained); }
// public Object addLeafFields(Object instance) { return wrapperContained.addLeafFields(instance); }
// public static Object addLeafFields(Object instance, ) { return net.minecraft.loot.entry.LeafEntry.addLeafFields(instance); }
// public java.lang.Integer method_53291(yarnwrap.loot.entry.LeafEntry entry) { return wrapperContained.method_53291(entry.wrapperContained); }
// public static java.lang.Integer method_53291(yarnwrap.loot.entry.LeafEntry entry, ) { return net.minecraft.loot.entry.LeafEntry.method_53291(entry.wrapperContained); }
// public java.lang.Integer method_53292(yarnwrap.loot.entry.LeafEntry entry) { return wrapperContained.method_53292(entry.wrapperContained); }
// public static java.lang.Integer method_53292(yarnwrap.loot.entry.LeafEntry entry, ) { return net.minecraft.loot.entry.LeafEntry.method_53292(entry.wrapperContained); }

}