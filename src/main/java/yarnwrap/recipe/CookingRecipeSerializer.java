package yarnwrap.recipe;
public class CookingRecipeSerializer { public net.minecraft.recipe.CookingRecipeSerializer wrapperContained; public CookingRecipeSerializer(net.minecraft.recipe.CookingRecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// // public void recipeFactory(Object value) { wrapperContained.recipeFactory = value; }
// // public static Object recipeFactory() { return net.minecraft.recipe.CookingRecipeSerializer.recipeFactory; }
// // public static void recipeFactory(Object value, ) { net.minecraft.recipe.CookingRecipeSerializer.recipeFactory = value; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.recipe.CookingRecipeSerializer.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.CookingRecipeSerializer.codec = value; }

// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.CookingRecipeSerializer.packetCodec); }
// public static void packetCodec(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.CookingRecipeSerializer.packetCodec = value.wrapperContained; }

// public CookingRecipeSerializer(Object recipeFactory,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.CookingRecipeSerializer(recipeFactory,cookingTime); }
// public void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.recipe.AbstractCookingRecipe recipe) { wrapperContained.write(buf.wrapperContained,recipe.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.recipe.AbstractCookingRecipe recipe, ) { net.minecraft.recipe.CookingRecipeSerializer.write(buf.wrapperContained,recipe.wrapperContained); }
// public yarnwrap.recipe.AbstractCookingRecipe read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.read(buf.wrapperContained)); }
// public static yarnwrap.recipe.AbstractCookingRecipe read(yarnwrap.network.RegistryByteBuf buf, ) { return new yarnwrap.recipe.AbstractCookingRecipe(net.minecraft.recipe.CookingRecipeSerializer.read(buf.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53766(int instance) { return wrapperContained.method_53766(instance); }
// public static com.mojang.datafixers.kinds.App method_53766(int instance, ) { return net.minecraft.recipe.CookingRecipeSerializer.method_53766(instance); }
// public java.lang.Integer method_53767(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53767(recipe.wrapperContained); }
// public static java.lang.Integer method_53767(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return net.minecraft.recipe.CookingRecipeSerializer.method_53767(recipe.wrapperContained); }
// public java.lang.Float method_53768(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53768(recipe.wrapperContained); }
// public static java.lang.Float method_53768(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return net.minecraft.recipe.CookingRecipeSerializer.method_53768(recipe.wrapperContained); }
// public yarnwrap.item.ItemStack method_53769(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_53769(recipe.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_53769(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.CookingRecipeSerializer.method_53769(recipe.wrapperContained)); }
// public yarnwrap.recipe.Ingredient method_53770(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.recipe.Ingredient(wrapperContained.method_53770(recipe.wrapperContained)); }
// public static yarnwrap.recipe.Ingredient method_53770(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.CookingRecipeSerializer.method_53770(recipe.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory method_53771(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.method_53771(recipe.wrapperContained)); }
// public static yarnwrap.recipe.book.CookingRecipeCategory method_53771(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return new yarnwrap.recipe.book.CookingRecipeCategory(net.minecraft.recipe.CookingRecipeSerializer.method_53771(recipe.wrapperContained)); }
// public java.lang.String method_53772(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53772(recipe.wrapperContained); }
// public static java.lang.String method_53772(yarnwrap.recipe.AbstractCookingRecipe recipe, ) { return net.minecraft.recipe.CookingRecipeSerializer.method_53772(recipe.wrapperContained); }
public yarnwrap.recipe.AbstractCookingRecipe create(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.create(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime)); }
// public static yarnwrap.recipe.AbstractCookingRecipe create(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime, ) { return new yarnwrap.recipe.AbstractCookingRecipe(net.minecraft.recipe.CookingRecipeSerializer.create(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime)); }

}