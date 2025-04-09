package yarnwrap.enchantment.effect;
public class AttributeEnchantmentEffect { public net.minecraft.enchantment.effect.AttributeEnchantmentEffect wrapperContained; public AttributeEnchantmentEffect(net.minecraft.enchantment.effect.AttributeEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.entity.attribute.EntityAttributeModifier createAttributeModifier(int value,yarnwrap.util.StringIdentifiable suffix) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.createAttributeModifier(value,suffix.wrapperContained)); }
// public com.google.common.collect.HashMultimap getModifiers(int level,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getModifiers(level,slot.wrapperContained); }
// public yarnwrap.util.Identifier getModifierId(yarnwrap.util.StringIdentifiable suffix) { return new yarnwrap.util.Identifier(wrapperContained.getModifierId(suffix.wrapperContained)); }

}