package yarnwrap.loot.entry;
public class LootTableEntry { public net.minecraft.loot.entry.LootTableEntry wrapperContained; public LootTableEntry(net.minecraft.loot.entry.LootTableEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.LootTableEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.LootTableEntry.CODEC = value; }

// public com.mojang.datafixers.util.Either value() { return wrapperContained.value; }
// public void value(com.mojang.datafixers.util.Either value) { wrapperContained.value = value; }
// public static com.mojang.datafixers.util.Either value() { return net.minecraft.loot.entry.LootTableEntry.value; }
// public static void value(com.mojang.datafixers.util.Either value, ) { net.minecraft.loot.entry.LootTableEntry.value = value; }

// public LootTableEntry(com.mojang.datafixers.util.Either value,int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.LootTableEntry(value,weight,quality,conditions,functions); }
// public Object builder(yarnwrap.registry.RegistryKey key) { return wrapperContained.builder(key.wrapperContained); }
// public static Object builder(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.loot.entry.LootTableEntry.builder(key.wrapperContained); }
// public yarnwrap.loot.entry.LeafEntry method_430(yarnwrap.registry.RegistryKey weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_430(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_430(yarnwrap.registry.RegistryKey weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.LootTableEntry.method_430(weight.wrapperContained,quality,conditions,functions)); }
// public void method_51222(yarnwrap.loot.LootTableReporter table) { wrapperContained.method_51222(table.wrapperContained); }
// public static void method_51222(yarnwrap.loot.LootTableReporter table, ) { net.minecraft.loot.entry.LootTableEntry.method_51222(table.wrapperContained); }
// public void method_51223(yarnwrap.loot.LootTableReporter key) { wrapperContained.method_51223(key.wrapperContained); }
// public static void method_51223(yarnwrap.loot.LootTableReporter key, ) { net.minecraft.loot.entry.LootTableEntry.method_51223(key.wrapperContained); }
// public com.mojang.datafixers.util.Either method_53293(yarnwrap.loot.entry.LootTableEntry entry) { return wrapperContained.method_53293(entry.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_53293(yarnwrap.loot.entry.LootTableEntry entry, ) { return net.minecraft.loot.entry.LootTableEntry.method_53293(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53294(Object instance) { return wrapperContained.method_53294(instance); }
// public static com.mojang.datafixers.kinds.App method_53294(Object instance, ) { return net.minecraft.loot.entry.LootTableEntry.method_53294(instance); }
// public yarnwrap.loot.LootTable method_57630(yarnwrap.loot.context.LootContext key) { return new yarnwrap.loot.LootTable(wrapperContained.method_57630(key.wrapperContained)); }
// public static yarnwrap.loot.LootTable method_57630(yarnwrap.loot.context.LootContext key, ) { return new yarnwrap.loot.LootTable(net.minecraft.loot.entry.LootTableEntry.method_57630(key.wrapperContained)); }
// public Object builder(yarnwrap.loot.LootTable table) { return wrapperContained.builder(table.wrapperContained); }
// public static Object builder(yarnwrap.loot.LootTable table, ) { return net.minecraft.loot.entry.LootTableEntry.builder(table.wrapperContained); }
// public yarnwrap.loot.entry.LeafEntry method_57632(yarnwrap.loot.LootTable weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_57632(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_57632(yarnwrap.loot.LootTable weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.LootTableEntry.method_57632(weight.wrapperContained,quality,conditions,functions)); }
// public void method_57633(yarnwrap.loot.LootTableReporter entry) { wrapperContained.method_57633(entry.wrapperContained); }
// public static void method_57633(yarnwrap.loot.LootTableReporter entry, ) { net.minecraft.loot.entry.LootTableEntry.method_57633(entry.wrapperContained); }
// public yarnwrap.loot.LootTable method_57634(yarnwrap.loot.LootTable table) { return new yarnwrap.loot.LootTable(wrapperContained.method_57634(table.wrapperContained)); }
// public static yarnwrap.loot.LootTable method_57634(yarnwrap.loot.LootTable table, ) { return new yarnwrap.loot.LootTable(net.minecraft.loot.entry.LootTableEntry.method_57634(table.wrapperContained)); }

}