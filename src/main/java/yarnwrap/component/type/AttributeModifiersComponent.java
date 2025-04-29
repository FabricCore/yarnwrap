package yarnwrap.component.type;
public class AttributeModifiersComponent { public net.minecraft.component.type.AttributeModifiersComponent wrapperContained; public AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.AttributeModifiersComponent DEFAULT() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.AttributeModifiersComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.AttributeModifiersComponent DEFAULT() { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.AttributeModifiersComponent value, ) { net.minecraft.component.type.AttributeModifiersComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.AttributeModifiersComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.AttributeModifiersComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.AttributeModifiersComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.AttributeModifiersComponent.PACKET_CODEC = value.wrapperContained; }

// public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
// public void DECIMAL_FORMAT(java.text.DecimalFormat value) { wrapperContained.DECIMAL_FORMAT = value; }
public static java.text.DecimalFormat DECIMAL_FORMAT() { return net.minecraft.component.type.AttributeModifiersComponent.DECIMAL_FORMAT; }
// public static void DECIMAL_FORMAT(java.text.DecimalFormat value, ) { net.minecraft.component.type.AttributeModifiersComponent.DECIMAL_FORMAT = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.component.type.AttributeModifiersComponent.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.AttributeModifiersComponent.BASE_CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.component.type.AttributeModifiersComponent.builder(); }
public double applyOperations(double base,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.applyOperations(base,slot.wrapperContained); }
// public static double applyOperations(double base,yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.component.type.AttributeModifiersComponent.applyOperations(base,slot.wrapperContained); }
public void applyModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }
// public static void applyModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeConsumer, ) { net.minecraft.component.type.AttributeModifiersComponent.applyModifiers(slot.wrapperContained,attributeConsumer); }
// public com.mojang.datafixers.kinds.App method_57483(Object instance) { return wrapperContained.method_57483(instance); }
// public static com.mojang.datafixers.kinds.App method_57483(Object instance, ) { return net.minecraft.component.type.AttributeModifiersComponent.method_57483(instance); }
public yarnwrap.component.type.AttributeModifiersComponent with(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier,yarnwrap.component.type.AttributeModifierSlot slot) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.with(attribute.wrapperContained,modifier.wrapperContained,slot.wrapperContained)); }
// public static yarnwrap.component.type.AttributeModifiersComponent with(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier,yarnwrap.component.type.AttributeModifierSlot slot, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent.with(attribute.wrapperContained,modifier.wrapperContained,slot.wrapperContained)); }
// public void method_57485(java.text.DecimalFormat format) { wrapperContained.method_57485(format); }
// public static void method_57485(java.text.DecimalFormat format, ) { net.minecraft.component.type.AttributeModifiersComponent.method_57485(format); }
// public yarnwrap.component.type.AttributeModifiersComponent method_58113(java.util.List attributeModifiers) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.method_58113(attributeModifiers)); }
// public static yarnwrap.component.type.AttributeModifiersComponent method_58113(java.util.List attributeModifiers, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent.method_58113(attributeModifiers)); }
public yarnwrap.component.type.AttributeModifiersComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public static yarnwrap.component.type.AttributeModifiersComponent withShowInTooltip(boolean showInTooltip, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent.withShowInTooltip(showInTooltip)); }
public void applyModifiers(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }
// public static void applyModifiers(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeConsumer, ) { net.minecraft.component.type.AttributeModifiersComponent.applyModifiers(slot.wrapperContained,attributeConsumer); }

}