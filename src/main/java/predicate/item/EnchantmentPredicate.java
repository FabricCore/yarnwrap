package yarnwrap.predicate.item;
public class EnchantmentPredicate { public net.minecraft.predicate.item.EnchantmentPredicate wrapperContained; public EnchantmentPredicate(net.minecraft.predicate.item.EnchantmentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object levels() { return wrapperContained.levels; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public Object levels() { return wrapperContained.levels(); }
// public boolean testLevel(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent,yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.testLevel(enchantmentsComponent.wrapperContained,enchantment.wrapperContained); }
public boolean test(yarnwrap.component.type.ItemEnchantmentsComponent enchantmentsComponent) { return wrapperContained.test(enchantmentsComponent.wrapperContained); }

}