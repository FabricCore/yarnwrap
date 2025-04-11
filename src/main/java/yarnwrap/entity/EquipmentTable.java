package yarnwrap.entity;
public class EquipmentTable { public net.minecraft.entity.EquipmentTable wrapperContained; public EquipmentTable(net.minecraft.entity.EquipmentTable wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec SLOT_DROP_CHANCES_CODEC() { return wrapperContained.SLOT_DROP_CHANCES_CODEC; }
// public void SLOT_DROP_CHANCES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SLOT_DROP_CHANCES_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Map createSlotDropChances(float dropChance) { return wrapperContained.createSlotDropChances(dropChance); }
// public java.util.Map createSlotDropChances(java.util.List slots,float dropChance) { return wrapperContained.createSlotDropChances(slots,dropChance); }

}