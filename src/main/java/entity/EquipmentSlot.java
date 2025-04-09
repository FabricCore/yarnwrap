package yarnwrap.entity;
public class EquipmentSlot { public net.minecraft.entity.EquipmentSlot wrapperContained; public EquipmentSlot(net.minecraft.entity.EquipmentSlot wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
public int NO_MAX_COUNT() { return wrapperContained.NO_MAX_COUNT; }
// public int maxCount() { return wrapperContained.maxCount; }
// public int armorStandId() { return wrapperContained.armorStandId; }
// public int entityId() { return wrapperContained.entityId; }
// public Object type() { return wrapperContained.type; }
// public java.lang.String name() { return wrapperContained.name; }
public int getOffsetEntitySlotId(int offset) { return wrapperContained.getOffsetEntitySlotId(offset); }
public boolean isArmorSlot() { return wrapperContained.isArmorSlot(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.entity.EquipmentSlot byName(java.lang.String name) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.byName(name)); }
public Object getType() { return wrapperContained.getType(); }
public int getArmorStandSlotId() { return wrapperContained.getArmorStandSlotId(); }
public int getEntitySlotId() { return wrapperContained.getEntitySlotId(); }
public yarnwrap.item.ItemStack split(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.split(stack.wrapperContained)); }

}