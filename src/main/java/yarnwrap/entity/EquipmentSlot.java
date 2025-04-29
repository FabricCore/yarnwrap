package yarnwrap.entity;
public class EquipmentSlot { public net.minecraft.entity.EquipmentSlot wrapperContained; public EquipmentSlot(net.minecraft.entity.EquipmentSlot wrapperContained) { this.wrapperContained = wrapperContained; }

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

// public int armorStandId() { return wrapperContained.armorStandId; }
// public void armorStandId(int value) { wrapperContained.armorStandId = value; }
// public static int armorStandId() { return net.minecraft.entity.EquipmentSlot.armorStandId; }
// public static void armorStandId(int value, ) { net.minecraft.entity.EquipmentSlot.armorStandId = value; }

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

// // public EquipmentSlot(java.lang.String type,int entityId,Object maxCount,int armorStandId,int name) { this.wrapperContained = new net.minecraft.entity.EquipmentSlot(type,entityId,maxCount,armorStandId,name); }
// // public EquipmentSlot(java.lang.String type,int entityId,Object armorStandId,int name) { this.wrapperContained = new net.minecraft.entity.EquipmentSlot(type,entityId,armorStandId,name); }
public int getOffsetEntitySlotId(int offset) { return wrapperContained.getOffsetEntitySlotId(offset); }
// public static int getOffsetEntitySlotId(int offset, ) { return net.minecraft.entity.EquipmentSlot.getOffsetEntitySlotId(offset); }
public boolean isArmorSlot() { return wrapperContained.isArmorSlot(); }
// public static boolean isArmorSlot() { return net.minecraft.entity.EquipmentSlot.isArmorSlot(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.EquipmentSlot.getName(); }
// public yarnwrap.entity.EquipmentSlot byName(java.lang.String name) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.byName(name)); }
// public static yarnwrap.entity.EquipmentSlot byName(java.lang.String name, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.EquipmentSlot.byName(name)); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.entity.EquipmentSlot.getType(); }
public int getArmorStandSlotId() { return wrapperContained.getArmorStandSlotId(); }
// public static int getArmorStandSlotId() { return net.minecraft.entity.EquipmentSlot.getArmorStandSlotId(); }
public int getEntitySlotId() { return wrapperContained.getEntitySlotId(); }
// public static int getEntitySlotId() { return net.minecraft.entity.EquipmentSlot.getEntitySlotId(); }
public yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.split(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EquipmentSlot.split(stack.wrapperContained)); }

}