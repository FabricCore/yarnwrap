package yarnwrap.item.equipment;
public class EquipmentHolderResolver { public net.minecraft.item.equipment.EquipmentHolderResolver wrapperContained; public EquipmentHolderResolver(net.minecraft.item.equipment.EquipmentHolderResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntryList get(yarnwrap.registry.RegistryEntryLookup registry) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.get(registry.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList get(yarnwrap.registry.RegistryEntryLookup registry, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.item.equipment.EquipmentHolderResolver.get(registry.wrapperContained)); }

}