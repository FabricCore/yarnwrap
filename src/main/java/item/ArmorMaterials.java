package yarnwrap.item;
public class ArmorMaterials { public net.minecraft.item.ArmorMaterials wrapperContained; public ArmorMaterials(net.minecraft.item.ArmorMaterials wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry CHAIN() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.CHAIN); }
public yarnwrap.registry.entry.RegistryEntry getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDefault(registry.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.util.EnumMap defense,int enchantability,yarnwrap.registry.entry.RegistryEntry equipSound,float toughness,float knockbackResistance,java.util.function.Supplier repairIngredient) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,defense,enchantability,equipSound.wrapperContained,toughness,knockbackResistance,repairIngredient)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.util.EnumMap defense,int enchantability,yarnwrap.registry.entry.RegistryEntry equipSound,float toughness,float knockbackResistance,java.util.function.Supplier repairIngredient,java.util.List layers) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,defense,enchantability,equipSound.wrapperContained,toughness,knockbackResistance,repairIngredient,layers)); }

}