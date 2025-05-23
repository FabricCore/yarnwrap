package yarnwrap.entity;
public class EquipmentHolder { public net.minecraft.entity.EquipmentHolder wrapperContained; public EquipmentHolder(net.minecraft.entity.EquipmentHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipStack(slot.wrapperContained,stack.wrapperContained); }
// public static void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.EquipmentHolder.equipStack(slot.wrapperContained,stack.wrapperContained); }
public void setEquipmentDropChance(yarnwrap.entity.EquipmentSlot slot,float dropChance) { wrapperContained.setEquipmentDropChance(slot.wrapperContained,dropChance); }
// public static void setEquipmentDropChance(yarnwrap.entity.EquipmentSlot slot,float dropChance, ) { net.minecraft.entity.EquipmentHolder.setEquipmentDropChance(slot.wrapperContained,dropChance); }
public yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getEquippedStack(slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.EquipmentHolder.getEquippedStack(slot.wrapperContained)); }
public void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable,yarnwrap.loot.context.LootWorldContext parameters) { wrapperContained.setEquipmentFromTable(equipmentTable.wrapperContained,parameters.wrapperContained); }
// public static void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable,yarnwrap.loot.context.LootWorldContext parameters, ) { net.minecraft.entity.EquipmentHolder.setEquipmentFromTable(equipmentTable.wrapperContained,parameters.wrapperContained); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootWorldContext parameters,long seed,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,seed,slotDropChances); }
// public static void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootWorldContext parameters,long seed,java.util.Map slotDropChances, ) { net.minecraft.entity.EquipmentHolder.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,seed,slotDropChances); }
public yarnwrap.entity.EquipmentSlot getSlotForStack(yarnwrap.item.ItemStack stack,java.util.List slotBlacklist) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotForStack(stack.wrapperContained,slotBlacklist)); }
// public static yarnwrap.entity.EquipmentSlot getSlotForStack(yarnwrap.item.ItemStack stack,java.util.List slotBlacklist, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.EquipmentHolder.getSlotForStack(stack.wrapperContained,slotBlacklist)); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootWorldContext parameters,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,slotDropChances); }
// public static void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootWorldContext parameters,java.util.Map slotDropChances, ) { net.minecraft.entity.EquipmentHolder.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,slotDropChances); }

}