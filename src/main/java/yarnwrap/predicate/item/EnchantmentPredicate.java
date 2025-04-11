package yarnwrap.predicate.item;
public class EnchantmentPredicate { public net.minecraft.predicate.item.EnchantmentPredicate wrapperContained; public EnchantmentPredicate(net.minecraft.predicate.item.EnchantmentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object levels() { return wrapperContained.levels; }
// // public void levels(Object value) { wrapperContained.levels = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public EnchantmentPredicate(yarnwrap.registry.entry.RegistryEntry enchantment,Object levels) { this.wrapperContained = new net.minecraft.predicate.item.EnchantmentPredicate(enchantment.wrapperContained,levels); }
// public EnchantmentPredicate(yarnwrap.registry.entry.RegistryEntryList enchantments,Object levels) { this.wrapperContained = new net.minecraft.predicate.item.EnchantmentPredicate(enchantments.wrapperContained,levels); }
// public Object levels() { return wrapperContained.levels(); }
// public com.mojang.datafixers.kinds.App method_53126(Object instance) { return wrapperContained.method_53126(instance); }
// public boolean testLevel(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent,yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.testLevel(enchantmentsComponent.wrapperContained,enchantment.wrapperContained); }
public boolean test(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent) { return wrapperContained.test(enchantmentsComponent.wrapperContained); }

}