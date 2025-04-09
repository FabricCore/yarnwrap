package yarnwrap.component.type;
public class AttributeModifierSlot { public net.minecraft.component.type.AttributeModifierSlot wrapperContained; public AttributeModifierSlot(net.minecraft.component.type.AttributeModifierSlot wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int id() { return wrapperContained.id; }
// public java.lang.String name() { return wrapperContained.name; }
// public java.util.function.Predicate slotPredicate() { return wrapperContained.slotPredicate; }
public boolean matches(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.matches(slot.wrapperContained); }
public yarnwrap.component.type.AttributeModifierSlot forEquipmentSlot(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.component.type.AttributeModifierSlot(wrapperContained.forEquipmentSlot(slot.wrapperContained)); }

}