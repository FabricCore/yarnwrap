package yarnwrap.component.type;
public class AttributeModifiersComponent { public net.minecraft.component.type.AttributeModifiersComponent wrapperContained; public AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.AttributeModifiersComponent DEFAULT() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.AttributeModifiersComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
// public void DECIMAL_FORMAT(java.text.DecimalFormat value) { wrapperContained.DECIMAL_FORMAT = value; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public Object builder() { return wrapperContained.builder(); }
public double applyOperations(double base,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.applyOperations(base,slot.wrapperContained); }
public void applyModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }
public yarnwrap.component.type.AttributeModifiersComponent with(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier,yarnwrap.component.type.AttributeModifierSlot slot) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.with(attribute.wrapperContained,modifier.wrapperContained,slot.wrapperContained)); }
public yarnwrap.component.type.AttributeModifiersComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
public void applyModifiers(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }

}