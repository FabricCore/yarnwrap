package yarnwrap.enchantment.effect;
public class AttributeEnchantmentEffect { public net.minecraft.enchantment.effect.AttributeEnchantmentEffect wrapperContained; public AttributeEnchantmentEffect(net.minecraft.enchantment.effect.AttributeEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.AttributeEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.AttributeEnchantmentEffect.CODEC = value; }

public yarnwrap.entity.attribute.EntityAttributeModifier createAttributeModifier(int value,yarnwrap.util.StringIdentifiable suffix) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.createAttributeModifier(value,suffix.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeModifier createAttributeModifier(int value,yarnwrap.util.StringIdentifiable suffix, ) { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.enchantment.effect.AttributeEnchantmentEffect.createAttributeModifier(value,suffix.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_60229(Object instance) { return wrapperContained.method_60229(instance); }
// public static com.mojang.datafixers.kinds.App method_60229(Object instance, ) { return net.minecraft.enchantment.effect.AttributeEnchantmentEffect.method_60229(instance); }
// public com.google.common.collect.HashMultimap getModifiers(int level,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getModifiers(level,slot.wrapperContained); }
// public static com.google.common.collect.HashMultimap getModifiers(int level,yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.enchantment.effect.AttributeEnchantmentEffect.getModifiers(level,slot.wrapperContained); }
// public yarnwrap.util.Identifier getModifierId(yarnwrap.util.StringIdentifiable suffix) { return new yarnwrap.util.Identifier(wrapperContained.getModifierId(suffix.wrapperContained)); }
// public static yarnwrap.util.Identifier getModifierId(yarnwrap.util.StringIdentifiable suffix, ) { return new yarnwrap.util.Identifier(net.minecraft.enchantment.effect.AttributeEnchantmentEffect.getModifierId(suffix.wrapperContained)); }

}