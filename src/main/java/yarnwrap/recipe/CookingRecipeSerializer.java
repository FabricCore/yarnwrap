package yarnwrap.recipe;
public class CookingRecipeSerializer { public net.minecraft.recipe.CookingRecipeSerializer wrapperContained; public CookingRecipeSerializer(net.minecraft.recipe.CookingRecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// // public void recipeFactory(Object value) { wrapperContained.recipeFactory = value; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.recipe.AbstractCookingRecipe recipe) { wrapperContained.write(buf.wrapperContained,recipe.wrapperContained); }
// public yarnwrap.recipe.AbstractCookingRecipe read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.read(buf.wrapperContained)); }
public yarnwrap.recipe.AbstractCookingRecipe create(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { return new yarnwrap.recipe.AbstractCookingRecipe(wrapperContained.create(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime)); }

}