package yarnwrap.entity;
public class EquipmentSlot { public net.minecraft.entity.EquipmentSlot wrapperContained; public EquipmentSlot(net.minecraft.entity.EquipmentSlot wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
public int NO_MAX_COUNT() { return wrapperContained.NO_MAX_COUNT; }
// public void NO_MAX_COUNT(int value) { wrapperContained.NO_MAX_COUNT = value; }
// public int maxCount() { return wrapperContained.maxCount; }
// public void maxCount(int value) { wrapperContained.maxCount = value; }
// public int armorStandId() { return wrapperContained.armorStandId; }
// public void armorStandId(int value) { wrapperContained.armorStandId = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public int getOffsetEntitySlotId(int offset) { return wrapperContained.getOffsetEntitySlotId(offset); }
public boolean isArmorSlot() { return wrapperContained.isArmorSlot(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.entity.EquipmentSlot byName(java.lang.String name) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.byName(name)); }
public Object getType() { return wrapperContained.getType(); }
public int getArmorStandSlotId() { return wrapperContained.getArmorStandSlotId(); }
public int getEntitySlotId() { return wrapperContained.getEntitySlotId(); }
public yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.split(stack.wrapperContained)); }

}