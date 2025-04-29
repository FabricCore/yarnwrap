package yarnwrap.loot.condition;
public class ReferenceLootCondition { public net.minecraft.loot.condition.ReferenceLootCondition wrapperContained; public ReferenceLootCondition(net.minecraft.loot.condition.ReferenceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id); }
// public void id(yarnwrap.registry.RegistryKey value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(net.minecraft.loot.condition.ReferenceLootCondition.id); }
// public static void id(yarnwrap.registry.RegistryKey value, ) { net.minecraft.loot.condition.ReferenceLootCondition.id = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.loot.condition.ReferenceLootCondition.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.loot.condition.ReferenceLootCondition.LOGGER = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.ReferenceLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.ReferenceLootCondition.CODEC = value; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id()); }
// // public static yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(net.minecraft.loot.condition.ReferenceLootCondition.id()); }
// public Object builder(yarnwrap.registry.RegistryKey key) { return wrapperContained.builder(key.wrapperContained); }
// public static Object builder(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.loot.condition.ReferenceLootCondition.builder(key.wrapperContained); }
// public void method_51230(yarnwrap.loot.LootTableReporter entry) { wrapperContained.method_51230(entry.wrapperContained); }
// public static void method_51230(yarnwrap.loot.LootTableReporter entry, ) { net.minecraft.loot.condition.ReferenceLootCondition.method_51230(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53411(Object instance) { return wrapperContained.method_53411(instance); }
// public static com.mojang.datafixers.kinds.App method_53411(Object instance, ) { return net.minecraft.loot.condition.ReferenceLootCondition.method_53411(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.ReferenceLootCondition.test(context); }

}