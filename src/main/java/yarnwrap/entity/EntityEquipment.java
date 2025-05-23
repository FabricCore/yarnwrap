package yarnwrap.entity;
public class EntityEquipment { public net.minecraft.entity.EntityEquipment wrapperContained; public EntityEquipment(net.minecraft.entity.EntityEquipment wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.EntityEquipment.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.EntityEquipment.CODEC = value; }

// public java.util.EnumMap map() { return wrapperContained.map; }
// public void map(java.util.EnumMap value) { wrapperContained.map = value; }
// public static java.util.EnumMap map() { return net.minecraft.entity.EntityEquipment.map; }
// public static void map(java.util.EnumMap value, ) { net.minecraft.entity.EntityEquipment.map = value; }

// public EntityEquipment(java.util.EnumMap map) { this.wrapperContained = new net.minecraft.entity.EntityEquipment(map); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.entity.EntityEquipment.isEmpty(); }
// public java.util.Map method_66658(yarnwrap.entity.EntityEquipment equipment) { return wrapperContained.method_66658(equipment.wrapperContained); }
// public static java.util.Map method_66658(yarnwrap.entity.EntityEquipment equipment, ) { return net.minecraft.entity.EntityEquipment.method_66658(equipment.wrapperContained); }
public yarnwrap.item.ItemStack get(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.get(slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack get(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EntityEquipment.get(slot.wrapperContained)); }
public yarnwrap.item.ItemStack put(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.put(slot.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack put(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EntityEquipment.put(slot.wrapperContained,stack.wrapperContained)); }
// public yarnwrap.entity.EntityEquipment method_66661(java.util.Map map) { return new yarnwrap.entity.EntityEquipment(wrapperContained.method_66661(map)); }
// public static yarnwrap.entity.EntityEquipment method_66661(java.util.Map map, ) { return new yarnwrap.entity.EntityEquipment(net.minecraft.entity.EntityEquipment.method_66661(map)); }
public void tick(yarnwrap.entity.Entity entity) { wrapperContained.tick(entity.wrapperContained); }
// public static void tick(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.EntityEquipment.tick(entity.wrapperContained); }
public void copyFrom(yarnwrap.entity.EntityEquipment equipment) { wrapperContained.copyFrom(equipment.wrapperContained); }
// public static void copyFrom(yarnwrap.entity.EntityEquipment equipment, ) { net.minecraft.entity.EntityEquipment.copyFrom(equipment.wrapperContained); }
public void dropAll(yarnwrap.entity.LivingEntity entity) { wrapperContained.dropAll(entity.wrapperContained); }
// public static void dropAll(yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.EntityEquipment.dropAll(entity.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.EntityEquipment.clear(); }
// public yarnwrap.item.ItemStack method_67516(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.method_67516(slot.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_67516(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EntityEquipment.method_67516(slot.wrapperContained,stack.wrapperContained)); }

}