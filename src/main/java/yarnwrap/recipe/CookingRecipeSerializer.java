package yarnwrap.recipe;
public class CookingRecipeSerializer { public net.minecraft.recipe.CookingRecipeSerializer wrapperContained; public CookingRecipeSerializer(net.minecraft.recipe.CookingRecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// // public void recipeFactory(Object value) { wrapperContained.recipeFactory = value; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public CookingRecipeSerializer(Object recipeFactory,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.CookingRecipeSerializer(recipeFactory,cookingTime); }
// public void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.recipe.AbstractCookingRecipe recipe) { wrapperContained.write(buf.wrapperContained,recipe.wrapperContained); }
// public yarnwrap.recipe.AbstractCookingRecipe read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.read(buf.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53766(int instance) { return wrapperContained.method_53766(instance); }
// public java.lang.Integer method_53767(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53767(recipe.wrapperContained); }
// public java.lang.Float method_53768(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53768(recipe.wrapperContained); }
// public yarnwrap.item.ItemStack method_53769(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_53769(recipe.wrapperContained)); }
// public yarnwrap.recipe.Ingredient method_53770(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.recipe.Ingredient(wrapperContained.method_53770(recipe.wrapperContained)); }
// public yarnwrap.recipe.book.CookingRecipeCategory method_53771(yarnwrap.recipe.AbstractCookingRecipe recipe) { return new yarnwrap.recipe.book.CookingRecipeCategory(wrapperContained.method_53771(recipe.wrapperContained)); }
// public java.lang.String method_53772(yarnwrap.recipe.AbstractCookingRecipe recipe) { return wrapperContained.method_53772(recipe.wrapperContained); }
public yarnwrap.recipe.AbstractCookingRecipe create(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.create(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime)); }

}