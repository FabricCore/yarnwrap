package yarnwrap.recipe;
public class RecipePropertySet { public net.minecraft.recipe.RecipePropertySet wrapperContained; public RecipePropertySet(net.minecraft.recipe.RecipePropertySet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey REGISTRY() { return new yarnwrap.registry.RegistryKey(wrapperContained.REGISTRY); }
// public void REGISTRY(yarnwrap.registry.RegistryKey value) { wrapperContained.REGISTRY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey REGISTRY() { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.RecipePropertySet.REGISTRY); }
// public static void REGISTRY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.recipe.RecipePropertySet.REGISTRY = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.RecipePropertySet.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.RecipePropertySet.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.recipe.RecipePropertySet EMPTY() { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.RecipePropertySet value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.recipe.RecipePropertySet EMPTY() { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.recipe.RecipePropertySet.EMPTY); }
// public static void EMPTY(yarnwrap.recipe.RecipePropertySet value, ) { net.minecraft.recipe.RecipePropertySet.EMPTY = value.wrapperContained; }

// public java.util.Set usableItems() { return wrapperContained.usableItems; }
// public void usableItems(java.util.Set value) { wrapperContained.usableItems = value; }
// public static java.util.Set usableItems() { return net.minecraft.recipe.RecipePropertySet.usableItems; }
// public static void usableItems(java.util.Set value, ) { net.minecraft.recipe.RecipePropertySet.usableItems = value; }

// public RecipePropertySet(java.util.Set usableItems) { this.wrapperContained = new net.minecraft.recipe.RecipePropertySet(usableItems); }
public boolean canUse(yarnwrap.item.ItemStack stack) { return wrapperContained.canUse(stack.wrapperContained); }
// public static boolean canUse(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.RecipePropertySet.canUse(stack.wrapperContained); }
// public java.util.List method_64703(yarnwrap.recipe.RecipePropertySet set) { return wrapperContained.method_64703(set.wrapperContained); }
// public static java.util.List method_64703(yarnwrap.recipe.RecipePropertySet set, ) { return net.minecraft.recipe.RecipePropertySet.method_64703(set.wrapperContained); }
// public yarnwrap.registry.RegistryKey register(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.register(id)); }
// public static yarnwrap.registry.RegistryKey register(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.RecipePropertySet.register(id)); }
// public yarnwrap.recipe.RecipePropertySet of(java.util.Collection ingredients) { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.of(ingredients)); }
// public static yarnwrap.recipe.RecipePropertySet of(java.util.Collection ingredients, ) { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.recipe.RecipePropertySet.of(ingredients)); }
// public yarnwrap.recipe.RecipePropertySet method_64706(java.util.List items) { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.method_64706(items)); }
// public static yarnwrap.recipe.RecipePropertySet method_64706(java.util.List items, ) { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.recipe.RecipePropertySet.method_64706(items)); }

}