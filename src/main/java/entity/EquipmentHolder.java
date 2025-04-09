package yarnwrap.entity;
public class EquipmentHolder { public net.minecraft.entity.EquipmentHolder wrapperContained; public EquipmentHolder(net.minecraft.entity.EquipmentHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipStack(slot.wrapperContained,stack.wrapperContained); }
public void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable,yarnwrap.loot.context.LootContextParameterSet parameters) { wrapperContained.setEquipmentFromTable(equipmentTable.wrapperContained,parameters.wrapperContained); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootContextParameterSet parameters,long seed,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,seed,slotDropChances); }
public yarnwrap.entity.EquipmentSlot getSlotForStack(yarnwrap.item.ItemStack stack,java.util.List slotBlacklist) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotForStack(stack.wrapperContained,slotBlacklist)); }
public void setEquipmentDropChance(yarnwrap.entity.EquipmentSlot slot,float dropChance) { wrapperContained.setEquipmentDropChance(slot.wrapperContained,dropChance); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,yarnwrap.loot.context.LootContextParameterSet parameters,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,parameters.wrapperContained,slotDropChances); }
public yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getEquippedStack(slot.wrapperContained)); }

}