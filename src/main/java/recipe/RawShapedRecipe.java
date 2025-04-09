package yarnwrap.recipe;
public class RawShapedRecipe { public net.minecraft.recipe.RawShapedRecipe wrapperContained; public RawShapedRecipe(net.minecraft.recipe.RawShapedRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int MAX_WIDTH_AND_HEIGHT() { return wrapperContained.MAX_WIDTH_AND_HEIGHT; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ingredients); }
// public java.util.Optional data() { return wrapperContained.data; }
// public int ingredientCount() { return wrapperContained.ingredientCount; }
// public boolean symmetrical() { return wrapperContained.symmetrical; }
public boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.matches(input.wrapperContained); }
// public boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input,boolean mirrored) { return wrapperContained.matches(input.wrapperContained,mirrored); }
// public com.mojang.serialization.DataResult fromData(Object data) { return wrapperContained.fromData(data); }
// public int findFirstSymbol(java.lang.String line) { return wrapperContained.findFirstSymbol(line); }
// public java.lang.String[] removePadding(java.util.List pattern) { return wrapperContained.removePadding(pattern); }
public yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.util.List pattern) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.create(key,pattern)); }
public yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.lang.String[] pattern) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.create(key,pattern)); }
// public void writeToBuf(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.writeToBuf(buf.wrapperContained); }
// public int findLastSymbol(java.lang.String line) { return wrapperContained.findLastSymbol(line); }
// public yarnwrap.recipe.RawShapedRecipe readFromBuf(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.readFromBuf(buf.wrapperContained)); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getIngredients()); }

}