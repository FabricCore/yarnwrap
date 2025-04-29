package yarnwrap.entity;
public class EquipmentTable { public net.minecraft.entity.EquipmentTable wrapperContained; public EquipmentTable(net.minecraft.entity.EquipmentTable wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec SLOT_DROP_CHANCES_CODEC() { return wrapperContained.SLOT_DROP_CHANCES_CODEC; }
// public void SLOT_DROP_CHANCES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SLOT_DROP_CHANCES_CODEC = value; }
public static com.mojang.serialization.Codec SLOT_DROP_CHANCES_CODEC() { return net.minecraft.entity.EquipmentTable.SLOT_DROP_CHANCES_CODEC; }
// public static void SLOT_DROP_CHANCES_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.EquipmentTable.SLOT_DROP_CHANCES_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.EquipmentTable.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.EquipmentTable.CODEC = value; }

// public java.util.Map createSlotDropChances(float dropChance) { return wrapperContained.createSlotDropChances(dropChance); }
// public static java.util.Map createSlotDropChances(float dropChance, ) { return net.minecraft.entity.EquipmentTable.createSlotDropChances(dropChance); }
// public java.util.Map method_59659(com.mojang.datafixers.util.Either either) { return wrapperContained.method_59659(either); }
// public static java.util.Map method_59659(com.mojang.datafixers.util.Either either, ) { return net.minecraft.entity.EquipmentTable.method_59659(either); }
// public com.mojang.datafixers.kinds.App method_59660(Object instance) { return wrapperContained.method_59660(instance); }
// public static com.mojang.datafixers.kinds.App method_59660(Object instance, ) { return net.minecraft.entity.EquipmentTable.method_59660(instance); }
// public java.util.Map createSlotDropChances(java.util.List slots,float dropChance) { return wrapperContained.createSlotDropChances(slots,dropChance); }
// public static java.util.Map createSlotDropChances(java.util.List slots,float dropChance, ) { return net.minecraft.entity.EquipmentTable.createSlotDropChances(slots,dropChance); }
// public com.mojang.datafixers.util.Either method_59662(java.util.Map map) { return wrapperContained.method_59662(map); }
// public static com.mojang.datafixers.util.Either method_59662(java.util.Map map, ) { return net.minecraft.entity.EquipmentTable.method_59662(map); }

}