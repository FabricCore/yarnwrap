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

public yarnwrap.item.ItemStack createIcon() { return new yarnwrap.item.ItemStack(wrapperContained.createIcon()); }
// public static yarnwrap.item.ItemStack createIcon() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.Recipe.createIcon()); }
public yarnwrap.recipe.RecipeType getType() { return new yarnwrap.recipe.RecipeType(wrapperContained.getType()); }
// public static yarnwrap.recipe.RecipeType getType() { return new yarnwrap.recipe.RecipeType(net.minecraft.recipe.Recipe.getType()); }
// public boolean method_31583(yarnwrap.recipe.Ingredient ingredient) { return wrapperContained.method_31583(ingredient.wrapperContained); }
// public static boolean method_31583(yarnwrap.recipe.Ingredient ingredient, ) { return net.minecraft.recipe.Recipe.method_31583(ingredient.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.recipe.Recipe.isEmpty(); }
public boolean showNotification() { return wrapperContained.showNotification(); }
// public static boolean showNotification() { return net.minecraft.recipe.Recipe.showNotification(); }
// public yarnwrap.item.ItemStack getResult(Object registriesLookup) { return new yarnwrap.item.ItemStack(wrapperContained.getResult(registriesLookup)); }
// public static yarnwrap.item.ItemStack getResult(Object registriesLookup, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.Recipe.getResult(registriesLookup)); }
public yarnwrap.util.collection.DefaultedList getRemainder(yarnwrap.recipe.input.RecipeInput input) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getRemainder(input.wrapperContained)); }
// public static yarnwrap.util.collection.DefaultedList getRemainder(yarnwrap.recipe.input.RecipeInput input, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.Recipe.getRemainder(input.wrapperContained)); }
public java.lang.String getGroup() { return wrapperContained.getGroup(); }
// public static java.lang.String getGroup() { return net.minecraft.recipe.Recipe.getGroup(); }
public boolean fits(int width,int height) { return wrapperContained.fits(width,height); }
// public static boolean fits(int width,int height, ) { return net.minecraft.recipe.Recipe.fits(width,height); }
public boolean matches(yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.matches(input.wrapperContained,world.wrapperContained); }
// public static boolean matches(yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world, ) { return net.minecraft.recipe.Recipe.matches(input.wrapperContained,world.wrapperContained); }
// public yarnwrap.item.ItemStack craft(yarnwrap.recipe.input.RecipeInput input,Object lookup) { return new yarnwrap.item.ItemStack(wrapperContained.craft(input.wrapperContained,lookup)); }
// public static yarnwrap.item.ItemStack craft(yarnwrap.recipe.input.RecipeInput input,Object lookup, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.Recipe.craft(input.wrapperContained,lookup)); }
public yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getIngredients()); }
// public static yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.Recipe.getIngredients()); }
public boolean isIgnoredInRecipeBook() { return wrapperContained.isIgnoredInRecipeBook(); }
// public static boolean isIgnoredInRecipeBook() { return net.minecraft.recipe.Recipe.isIgnoredInRecipeBook(); }
public yarnwrap.recipe.RecipeSerializer getSerializer() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.getSerializer()); }
// public static yarnwrap.recipe.RecipeSerializer getSerializer() { return new yarnwrap.recipe.RecipeSerializer(net.minecraft.recipe.Recipe.getSerializer()); }

}