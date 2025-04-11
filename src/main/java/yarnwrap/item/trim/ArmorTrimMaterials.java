package yarnwrap.item.trim;
public class ArmorTrimMaterials { public net.minecraft.item.trim.ArmorTrimMaterials wrapperContained; public ArmorTrimMaterials(net.minecraft.item.trim.ArmorTrimMaterials wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_48439(yarnwrap.item.ItemStack recipe) { return wrapperContained.method_48439(recipe.wrapperContained); }
// public java.util.Optional get(Object registriesLookup,yarnwrap.item.ItemStack stack) { return wrapperContained.get(registriesLookup,stack.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,yarnwrap.item.Item ingredient,yarnwrap.text.Style style,float itemModelIndex,java.util.Map overrideArmorMaterials) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,ingredient.wrapperContained,style.wrapperContained,itemModelIndex,overrideArmorMaterials); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,yarnwrap.item.Item ingredient,yarnwrap.text.Style style,float itemModelIndex) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,ingredient.wrapperContained,style.wrapperContained,itemModelIndex); }

}