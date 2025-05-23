package yarnwrap.recipe;
public class RecipeEntry { public net.minecraft.recipe.RecipeEntry wrapperContained; public RecipeEntry(net.minecraft.recipe.RecipeEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id); }
// public void id(yarnwrap.registry.RegistryKey value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.RecipeEntry.id); }
// public static void id(yarnwrap.registry.RegistryKey value, ) { net.minecraft.recipe.RecipeEntry.id = value.wrapperContained; }

// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value); }
// public void value(yarnwrap.recipe.Recipe value) { wrapperContained.value = value.wrapperContained; }
// public static yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(net.minecraft.recipe.RecipeEntry.value); }
// public static void value(yarnwrap.recipe.Recipe value, ) { net.minecraft.recipe.RecipeEntry.value = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.RecipeEntry.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.RecipeEntry.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id()); }
// // public static yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(net.minecraft.recipe.RecipeEntry.id()); }
// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value()); }
// // public static yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(net.minecraft.recipe.RecipeEntry.value()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.recipe.RecipeEntry.equals(o); }

}