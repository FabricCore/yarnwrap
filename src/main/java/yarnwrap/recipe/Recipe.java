package yarnwrap.recipe;
public class Recipe { public net.minecraft.recipe.Recipe wrapperContained; public Recipe(net.minecraft.recipe.Recipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.Recipe.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.Recipe.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.Recipe.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.Recipe.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec KEY_CODEC() { return wrapperContained.KEY_CODEC; }
// public void KEY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.KEY_CODEC = value; }
public static com.mojang.serialization.Codec KEY_CODEC() { return net.minecraft.recipe.Recipe.KEY_CODEC; }
// public static void KEY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.Recipe.KEY_CODEC = value; }

public java.lang.String getGroup() { return wrapperContained.getGroup(); }
// public static java.lang.String getGroup() { return net.minecraft.recipe.Recipe.getGroup(); }
public boolean matches(yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.matches(input.wrapperContained,world.wrapperContained); }
// public static boolean matches(yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.Recipe.matches(input.wrapperContained,world.wrapperContained); }
// public yarnwrap.item.ItemStack craft(yarnwrap.recipe.input.RecipeInput input,Object registries) { return new yarnwrap.item.ItemStack(wrapperContained.craft(input.wrapperContained,registries)); }
// public static yarnwrap.item.ItemStack craft(yarnwrap.recipe.input.RecipeInput input,Object registries, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.Recipe.craft(input.wrapperContained,registries)); }
public boolean isIgnoredInRecipeBook() { return wrapperContained.isIgnoredInRecipeBook(); }
// public static boolean isIgnoredInRecipeBook() { return net.minecraft.recipe.Recipe.isIgnoredInRecipeBook(); }
public yarnwrap.recipe.RecipeSerializer getSerializer() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.getSerializer()); }
// public static yarnwrap.recipe.RecipeSerializer getSerializer() { return new yarnwrap.recipe.RecipeSerializer(net.minecraft.recipe.Recipe.getSerializer()); }
public yarnwrap.recipe.RecipeType getType() { return new yarnwrap.recipe.RecipeType(wrapperContained.getType()); }
// public static yarnwrap.recipe.RecipeType getType() { return new yarnwrap.recipe.RecipeType(net.minecraft.recipe.Recipe.getType()); }
public boolean showNotification() { return wrapperContained.showNotification(); }
// public static boolean showNotification() { return net.minecraft.recipe.Recipe.showNotification(); }
public yarnwrap.recipe.IngredientPlacement getIngredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.getIngredientPlacement()); }
// public static yarnwrap.recipe.IngredientPlacement getIngredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.Recipe.getIngredientPlacement()); }
public java.util.List getDisplays() { return wrapperContained.getDisplays(); }
// public static java.util.List getDisplays() { return net.minecraft.recipe.Recipe.getDisplays(); }
public yarnwrap.recipe.book.RecipeBookCategory getRecipeBookCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.getRecipeBookCategory()); }
// public static yarnwrap.recipe.book.RecipeBookCategory getRecipeBookCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(net.minecraft.recipe.Recipe.getRecipeBookCategory()); }

}