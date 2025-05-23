package yarnwrap.item.equipment;
public class EquipmentType { public net.minecraft.item.equipment.EquipmentType wrapperContained; public EquipmentType(net.minecraft.item.equipment.EquipmentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EquipmentSlot equipmentSlot() { return new yarnwrap.entity.EquipmentSlot(wrapperContained.equipmentSlot); }
// public void equipmentSlot(yarnwrap.entity.EquipmentSlot value) { wrapperContained.equipmentSlot = value.wrapperContained; }
// public static yarnwrap.entity.EquipmentSlot equipmentSlot() { return new yarnwrap.entity.EquipmentSlot(net.minecraft.item.equipment.EquipmentType.equipmentSlot); }
// public static void equipmentSlot(yarnwrap.entity.EquipmentSlot value, ) { net.minecraft.item.equipment.EquipmentType.equipmentSlot = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.item.equipment.EquipmentType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.item.equipment.EquipmentType.name = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.equipment.EquipmentType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.EquipmentType.CODEC = value; }

// public int baseMaxDamage() { return wrapperContained.baseMaxDamage; }
// public void baseMaxDamage(int value) { wrapperContained.baseMaxDamage = value; }
// public static int baseMaxDamage() { return net.minecraft.item.equipment.EquipmentType.baseMaxDamage; }
// public static void baseMaxDamage(int value, ) { net.minecraft.item.equipment.EquipmentType.baseMaxDamage = value; }

// // public EquipmentType(java.lang.String equipmentSlot,int baseMaxDamage,yarnwrap.entity.EquipmentSlot name) { this.wrapperContained = new net.minecraft.item.equipment.EquipmentType(equipmentSlot,baseMaxDamage,name.wrapperContained); }
public yarnwrap.entity.EquipmentSlot getEquipmentSlot() { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getEquipmentSlot()); }
// public static yarnwrap.entity.EquipmentSlot getEquipmentSlot() { return new yarnwrap.entity.EquipmentSlot(net.minecraft.item.equipment.EquipmentType.getEquipmentSlot()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.item.equipment.EquipmentType.getName(); }
public int getMaxDamage(int multiplier) { return wrapperContained.getMaxDamage(multiplier); }
// public static int getMaxDamage(int multiplier, ) { return net.minecraft.item.equipment.EquipmentType.getMaxDamage(multiplier); }

}