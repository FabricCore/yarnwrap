package yarnwrap.loot.function;
public class SetItemLootFunction { public net.minecraft.loot.function.SetItemLootFunction wrapperContained; public SetItemLootFunction(net.minecraft.loot.function.SetItemLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetItemLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetItemLootFunction.CODEC = value; }

// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.SetItemLootFunction.item); }
// public static void item(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.function.SetItemLootFunction.item = value.wrapperContained; }

// public SetItemLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry item) { this.wrapperContained = new net.minecraft.loot.function.SetItemLootFunction(conditions,item.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_59749(yarnwrap.loot.function.SetItemLootFunction lootFunction) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_59749(lootFunction.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_59749(yarnwrap.loot.function.SetItemLootFunction lootFunction, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.SetItemLootFunction.method_59749(lootFunction.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_59750(Object instance) { return wrapperContained.method_59750(instance); }
// public static com.mojang.datafixers.kinds.App method_59750(Object instance, ) { return net.minecraft.loot.function.SetItemLootFunction.method_59750(instance); }

}