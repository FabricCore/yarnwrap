package yarnwrap.loot.entry;
public class ItemEntry { public net.minecraft.loot.entry.ItemEntry wrapperContained; public ItemEntry(net.minecraft.loot.entry.ItemEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.ItemEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.ItemEntry.CODEC = value; }

// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.entry.ItemEntry.item); }
// public static void item(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.entry.ItemEntry.item = value.wrapperContained; }

// public ItemEntry(yarnwrap.registry.entry.RegistryEntry item,int weight,int quality,java.util.List conditions,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.entry.ItemEntry(item.wrapperContained,weight,quality,conditions,functions); }
// public yarnwrap.loot.entry.LeafEntry method_409(yarnwrap.item.ItemConvertible weight,int quality,int conditions,java.util.List functions) { return new yarnwrap.loot.entry.LeafEntry(wrapperContained.method_409(weight.wrapperContained,quality,conditions,functions)); }
// public static yarnwrap.loot.entry.LeafEntry method_409(yarnwrap.item.ItemConvertible weight,int quality,int conditions,java.util.List functions, ) { return new yarnwrap.loot.entry.LeafEntry(net.minecraft.loot.entry.ItemEntry.method_409(weight.wrapperContained,quality,conditions,functions)); }
// public Object builder(yarnwrap.item.ItemConvertible drop) { return wrapperContained.builder(drop.wrapperContained); }
// public static Object builder(yarnwrap.item.ItemConvertible drop, ) { return net.minecraft.loot.entry.ItemEntry.builder(drop.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_53285(yarnwrap.loot.entry.ItemEntry entry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_53285(entry.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_53285(yarnwrap.loot.entry.ItemEntry entry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.entry.ItemEntry.method_53285(entry.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53286(Object instance) { return wrapperContained.method_53286(instance); }
// public static com.mojang.datafixers.kinds.App method_53286(Object instance, ) { return net.minecraft.loot.entry.ItemEntry.method_53286(instance); }

}