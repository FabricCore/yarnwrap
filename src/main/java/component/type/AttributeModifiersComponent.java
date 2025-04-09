package yarnwrap.component.type;
public class AttributeModifiersComponent { public net.minecraft.component.type.AttributeModifiersComponent wrapperContained; public AttributeModifiersComponent(net.minecraft.component.type.AttributeModifiersComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.AttributeModifiersComponent DEFAULT() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
public Object builder() { return wrapperContained.builder(); }
public double applyOperations(double base,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.applyOperations(base,slot.wrapperContained); }
public void applyModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }
public yarnwrap.component.type.AttributeModifiersComponent with(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier,yarnwrap.component.type.AttributeModifierSlot slot) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.with(attribute.wrapperContained,modifier.wrapperContained,slot.wrapperContained)); }
public yarnwrap.component.type.AttributeModifiersComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
public void applyModifiers(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeConsumer) { wrapperContained.applyModifiers(slot.wrapperContained,attributeConsumer); }

}