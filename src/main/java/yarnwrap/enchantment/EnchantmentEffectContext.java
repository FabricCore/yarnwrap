package yarnwrap.enchantment;
public class EnchantmentEffectContext { public net.minecraft.enchantment.EnchantmentEffectContext wrapperContained; public EnchantmentEffectContext(net.minecraft.enchantment.EnchantmentEffectContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public yarnwrap.entity.EquipmentSlot slot() { return new yarnwrap.entity.EquipmentSlot(wrapperContained.slot); }
// public void slot(yarnwrap.entity.EquipmentSlot value) { wrapperContained.slot = value.wrapperContained; }
public EnchantmentEffectContext(yarnwrap.item.ItemStack stack,yarnwrap.entity.EquipmentSlot slot,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.enchantment.EnchantmentEffectContext(stack.wrapperContained,slot.wrapperContained,owner.wrapperContained); }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack()); }
// public yarnwrap.entity.EquipmentSlot slot() { return new yarnwrap.entity.EquipmentSlot(wrapperContained.slot()); }
// public void method_60012(yarnwrap.entity.LivingEntity item) { wrapperContained.method_60012(item.wrapperContained); }

}