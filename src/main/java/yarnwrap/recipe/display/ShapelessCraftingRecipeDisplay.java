package yarnwrap.recipe.display;
public class ShapelessCraftingRecipeDisplay { public net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay wrapperContained; public ShapelessCraftingRecipeDisplay(net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.PACKET_CODEC = value.wrapperContained; }

// public Object SERIALIZER() { return wrapperContained.SERIALIZER; }
// // public void SERIALIZER(Object value) { wrapperContained.SERIALIZER = value; }
// public static Object SERIALIZER() { return net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.SERIALIZER; }
// // public static void SERIALIZER(Object value, ) { net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.SERIALIZER = value; }

// public com.mojang.datafixers.kinds.App method_64734(Object instance) { return wrapperContained.method_64734(instance); }
// public static com.mojang.datafixers.kinds.App method_64734(Object instance, ) { return net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.method_64734(instance); }
// public boolean method_64735(yarnwrap.resource.featuretoggle.FeatureSet ingredient) { return wrapperContained.method_64735(ingredient.wrapperContained); }
// public static boolean method_64735(yarnwrap.resource.featuretoggle.FeatureSet ingredient, ) { return net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay.method_64735(ingredient.wrapperContained); }

}