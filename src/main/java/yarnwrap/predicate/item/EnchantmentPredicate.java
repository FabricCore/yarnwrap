package yarnwrap.predicate.item;
public class EnchantmentPredicate { public net.minecraft.predicate.item.EnchantmentPredicate wrapperContained; public EnchantmentPredicate(net.minecraft.predicate.item.EnchantmentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object levels() { return wrapperContained.levels; }
// // public void levels(Object value) { wrapperContained.levels = value; }
// // public static Object levels() { return net.minecraft.predicate.item.EnchantmentPredicate.levels; }
// // public static void levels(Object value, ) { net.minecraft.predicate.item.EnchantmentPredicate.levels = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.EnchantmentPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.EnchantmentPredicate.CODEC = value; }

// public EnchantmentPredicate(yarnwrap.registry.entry.RegistryEntry enchantment,Object levels) { this.wrapperContained = new net.minecraft.predicate.item.EnchantmentPredicate(enchantment.wrapperContained,levels); }
// public EnchantmentPredicate(yarnwrap.registry.entry.RegistryEntryList enchantments,Object levels) { this.wrapperContained = new net.minecraft.predicate.item.EnchantmentPredicate(enchantments.wrapperContained,levels); }
// public Object levels() { return wrapperContained.levels(); }
// // public static Object levels() { return net.minecraft.predicate.item.EnchantmentPredicate.levels(); }
// public com.mojang.datafixers.kinds.App method_53126(Object instance) { return wrapperContained.method_53126(instance); }
// public static com.mojang.datafixers.kinds.App method_53126(Object instance, ) { return net.minecraft.predicate.item.EnchantmentPredicate.method_53126(instance); }
// public boolean testLevel(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent,yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.testLevel(enchantmentsComponent.wrapperContained,enchantment.wrapperContained); }
// public static boolean testLevel(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent,yarnwrap.registry.entry.RegistryEntry enchantment, ) { return net.minecraft.predicate.item.EnchantmentPredicate.testLevel(enchantmentsComponent.wrapperContained,enchantment.wrapperContained); }
public boolean test(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent) { return wrapperContained.test(enchantmentsComponent.wrapperContained); }
// public static boolean test(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent, ) { return net.minecraft.predicate.item.EnchantmentPredicate.test(enchantmentsComponent.wrapperContained); }

}