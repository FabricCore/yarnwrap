package yarnwrap.item;
public class ArmorMaterials { public net.minecraft.item.ArmorMaterials wrapperContained; public ArmorMaterials(net.minecraft.item.ArmorMaterials wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry CHAIN() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.CHAIN); }
// public void CHAIN(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.CHAIN = value.wrapperContained; }
// public void method_48405(java.util.EnumMap map) { wrapperContained.method_48405(map); }
// public void method_48406(java.util.EnumMap map) { wrapperContained.method_48406(map); }
// public void method_48407(java.util.EnumMap map) { wrapperContained.method_48407(map); }
// public void method_48408(java.util.EnumMap map) { wrapperContained.method_48408(map); }
// public void method_48409(java.util.EnumMap map) { wrapperContained.method_48409(map); }
// public void method_48410(java.util.EnumMap map) { wrapperContained.method_48410(map); }
// public void method_48411(java.util.EnumMap map) { wrapperContained.method_48411(map); }
// public void method_48412(java.util.EnumMap map) { wrapperContained.method_48412(map); }
public yarnwrap.registry.entry.RegistryEntry getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDefault(registry.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.util.EnumMap defense,int enchantability,yarnwrap.registry.entry.RegistryEntry equipSound,float toughness,float knockbackResistance,java.util.function.Supplier repairIngredient) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,defense,enchantability,equipSound.wrapperContained,toughness,knockbackResistance,repairIngredient)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.util.EnumMap defense,int enchantability,yarnwrap.registry.entry.RegistryEntry equipSound,float toughness,float knockbackResistance,java.util.function.Supplier repairIngredient,java.util.List layers) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,defense,enchantability,equipSound.wrapperContained,toughness,knockbackResistance,repairIngredient,layers)); }

}