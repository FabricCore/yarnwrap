package yarnwrap.component.type;
public class AttributeModifierSlot { public net.minecraft.component.type.AttributeModifierSlot wrapperContained; public AttributeModifierSlot(net.minecraft.component.type.AttributeModifierSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public static java.util.function.IntFunction ID_TO_VALUE() { return net.minecraft.component.type.AttributeModifierSlot.ID_TO_VALUE; }
// public static void ID_TO_VALUE(java.util.function.IntFunction value, ) { net.minecraft.component.type.AttributeModifierSlot.ID_TO_VALUE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.AttributeModifierSlot.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.AttributeModifierSlot.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.AttributeModifierSlot.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.AttributeModifierSlot.PACKET_CODEC = value.wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.component.type.AttributeModifierSlot.id; }
// public static void id(int value, ) { net.minecraft.component.type.AttributeModifierSlot.id = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.component.type.AttributeModifierSlot.name; }
// public static void name(java.lang.String value, ) { net.minecraft.component.type.AttributeModifierSlot.name = value; }

// public java.util.function.Predicate slotPredicate() { return wrapperContained.slotPredicate; }
// public void slotPredicate(java.util.function.Predicate value) { wrapperContained.slotPredicate = value; }
// public static java.util.function.Predicate slotPredicate() { return net.minecraft.component.type.AttributeModifierSlot.slotPredicate; }
// public static void slotPredicate(java.util.function.Predicate value, ) { net.minecraft.component.type.AttributeModifierSlot.slotPredicate = value; }

// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
// public static java.util.List slots() { return net.minecraft.component.type.AttributeModifierSlot.slots; }
// public static void slots(java.util.List value, ) { net.minecraft.component.type.AttributeModifierSlot.slots = value; }

// public AttributeModifierSlot(java.lang.String id,int name,int slotPredicate) { this.wrapperContained = new net.minecraft.component.type.AttributeModifierSlot(id,name,slotPredicate); }
// // public AttributeModifierSlot(java.lang.String id,int name,int slot) { this.wrapperContained = new net.minecraft.component.type.AttributeModifierSlot(id,name,slot); }
public boolean matches(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.matches(slot.wrapperContained); }
// public static boolean matches(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.component.type.AttributeModifierSlot.matches(slot.wrapperContained); }
// public boolean method_57287(yarnwrap.entity.EquipmentSlot slotx) { return wrapperContained.method_57287(slotx.wrapperContained); }
// public static boolean method_57287(yarnwrap.entity.EquipmentSlot slotx, ) { return net.minecraft.component.type.AttributeModifierSlot.method_57287(slotx.wrapperContained); }
// public int method_57288(yarnwrap.component.type.AttributeModifierSlot id) { return wrapperContained.method_57288(id.wrapperContained); }
// public static int method_57288(yarnwrap.component.type.AttributeModifierSlot id, ) { return net.minecraft.component.type.AttributeModifierSlot.method_57288(id.wrapperContained); }
// public boolean method_57289(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_57289(slot.wrapperContained); }
// public static boolean method_57289(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.component.type.AttributeModifierSlot.method_57289(slot.wrapperContained); }
// public int method_57290(yarnwrap.component.type.AttributeModifierSlot id) { return wrapperContained.method_57290(id.wrapperContained); }
// public static int method_57290(yarnwrap.component.type.AttributeModifierSlot id, ) { return net.minecraft.component.type.AttributeModifierSlot.method_57290(id.wrapperContained); }
// public boolean method_57291(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_57291(slot.wrapperContained); }
// public static boolean method_57291(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.component.type.AttributeModifierSlot.method_57291(slot.wrapperContained); }
// public yarnwrap.component.type.AttributeModifierSlot forEquipmentSlot(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.component.type.AttributeModifierSlot(wrapperContained.forEquipmentSlot(slot.wrapperContained)); }
// public static yarnwrap.component.type.AttributeModifierSlot forEquipmentSlot(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.component.type.AttributeModifierSlot(net.minecraft.component.type.AttributeModifierSlot.forEquipmentSlot(slot.wrapperContained)); }
public java.util.List getSlots() { return wrapperContained.getSlots(); }
// public static java.util.List getSlots() { return net.minecraft.component.type.AttributeModifierSlot.getSlots(); }

}