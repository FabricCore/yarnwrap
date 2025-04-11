package yarnwrap.component.type;
public class AttributeModifierSlot { public net.minecraft.component.type.AttributeModifierSlot wrapperContained; public AttributeModifierSlot(net.minecraft.component.type.AttributeModifierSlot wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.function.Predicate slotPredicate() { return wrapperContained.slotPredicate; }
// public void slotPredicate(java.util.function.Predicate value) { wrapperContained.slotPredicate = value; }
public boolean matches(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.matches(slot.wrapperContained); }
public yarnwrap.component.type.AttributeModifierSlot forEquipmentSlot(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.component.type.AttributeModifierSlot(wrapperContained.forEquipmentSlot(slot.wrapperContained)); }

}