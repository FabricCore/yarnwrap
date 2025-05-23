package yarnwrap.entity;
public class EquipmentSlot { public net.minecraft.entity.EquipmentSlot wrapperContained; public EquipmentSlot(net.minecraft.entity.EquipmentSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.entity.EquipmentSlot.entityId; }
// public static void entityId(int value, ) { net.minecraft.entity.EquipmentSlot.entityId = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.entity.EquipmentSlot.type; }
// // public static void type(Object value, ) { net.minecraft.entity.EquipmentSlot.type = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.EquipmentSlot.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.EquipmentSlot.name = value; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.entity.EquipmentSlot.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.entity.EquipmentSlot.CODEC = value; }

// public int NO_MAX_COUNT() { return wrapperContained.NO_MAX_COUNT; }
// public void NO_MAX_COUNT(int value) { wrapperContained.NO_MAX_COUNT = value; }
public static int NO_MAX_COUNT() { return net.minecraft.entity.EquipmentSlot.NO_MAX_COUNT; }
// public static void NO_MAX_COUNT(int value, ) { net.minecraft.entity.EquipmentSlot.NO_MAX_COUNT = value; }

// public int maxCount() { return wrapperContained.maxCount; }
// public void maxCount(int value) { wrapperContained.maxCount = value; }
// public static int maxCount() { return net.minecraft.entity.EquipmentSlot.maxCount; }
// public static void maxCount(int value, ) { net.minecraft.entity.EquipmentSlot.maxCount = value; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.List value) { wrapperContained.VALUES = value; }
public static java.util.List VALUES() { return net.minecraft.entity.EquipmentSlot.VALUES; }
// public static void VALUES(java.util.List value, ) { net.minecraft.entity.EquipmentSlot.VALUES = value; }

// public java.util.function.IntFunction FROM_INDEX() { return wrapperContained.FROM_INDEX; }
// public void FROM_INDEX(java.util.function.IntFunction value) { wrapperContained.FROM_INDEX = value; }
public static java.util.function.IntFunction FROM_INDEX() { return net.minecraft.entity.EquipmentSlot.FROM_INDEX; }
// public static void FROM_INDEX(java.util.function.IntFunction value, ) { net.minecraft.entity.EquipmentSlot.FROM_INDEX = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.EquipmentSlot.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.EquipmentSlot.PACKET_CODEC = value.wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.entity.EquipmentSlot.index; }
// public static void index(int value, ) { net.minecraft.entity.EquipmentSlot.index = value; }

// // public EquipmentSlot(java.lang.String type,int entityId,Object maxCount,int index,int name) { this.wrapperContained = new net.minecraft.entity.EquipmentSlot(type,entityId,maxCount,index,name); }
// // public EquipmentSlot(java.lang.String type,int entityId,Object index,int name) { this.wrapperContained = new net.minecraft.entity.EquipmentSlot(type,entityId,index,name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.EquipmentSlot.getName(); }
// public yarnwrap.entity.EquipmentSlot byName(java.lang.String name) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.byName(name)); }
// public static yarnwrap.entity.EquipmentSlot byName(java.lang.String name, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.EquipmentSlot.byName(name)); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.entity.EquipmentSlot.getType(); }
public int getEntitySlotId() { return wrapperContained.getEntitySlotId(); }
// public static int getEntitySlotId() { return net.minecraft.entity.EquipmentSlot.getEntitySlotId(); }
public int getOffsetEntitySlotId(int offset) { return wrapperContained.getOffsetEntitySlotId(offset); }
// public static int getOffsetEntitySlotId(int offset, ) { return net.minecraft.entity.EquipmentSlot.getOffsetEntitySlotId(offset); }
public boolean isArmorSlot() { return wrapperContained.isArmorSlot(); }
// public static boolean isArmorSlot() { return net.minecraft.entity.EquipmentSlot.isArmorSlot(); }
public yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.split(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EquipmentSlot.split(stack.wrapperContained)); }
// public int method_63619(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_63619(slot.wrapperContained); }
// public static int method_63619(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.EquipmentSlot.method_63619(slot.wrapperContained); }
public int getOffsetIndex(int offset) { return wrapperContained.getOffsetIndex(offset); }
// public static int getOffsetIndex(int offset, ) { return net.minecraft.entity.EquipmentSlot.getOffsetIndex(offset); }
// public int method_63621(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_63621(slot.wrapperContained); }
// public static int method_63621(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.EquipmentSlot.method_63621(slot.wrapperContained); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.entity.EquipmentSlot.getIndex(); }
public boolean increasesDroppedExperience() { return wrapperContained.increasesDroppedExperience(); }
// public static boolean increasesDroppedExperience() { return net.minecraft.entity.EquipmentSlot.increasesDroppedExperience(); }

}