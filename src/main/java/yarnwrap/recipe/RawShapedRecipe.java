package yarnwrap.recipe;
public class RawShapedRecipe { public net.minecraft.recipe.RawShapedRecipe wrapperContained; public RawShapedRecipe(net.minecraft.recipe.RawShapedRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.recipe.RawShapedRecipe.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.RawShapedRecipe.CODEC = value; }

// public int MAX_WIDTH_AND_HEIGHT() { return wrapperContained.MAX_WIDTH_AND_HEIGHT; }
// public void MAX_WIDTH_AND_HEIGHT(int value) { wrapperContained.MAX_WIDTH_AND_HEIGHT = value; }
// public static int MAX_WIDTH_AND_HEIGHT() { return net.minecraft.recipe.RawShapedRecipe.MAX_WIDTH_AND_HEIGHT; }
// public static void MAX_WIDTH_AND_HEIGHT(int value, ) { net.minecraft.recipe.RawShapedRecipe.MAX_WIDTH_AND_HEIGHT = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.RawShapedRecipe.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.RawShapedRecipe.PACKET_CODEC = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.recipe.RawShapedRecipe.width; }
// public static void width(int value, ) { net.minecraft.recipe.RawShapedRecipe.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.recipe.RawShapedRecipe.height; }
// public static void height(int value, ) { net.minecraft.recipe.RawShapedRecipe.height = value; }

// public yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ingredients); }
// public void ingredients(yarnwrap.util.collection.DefaultedList value) { wrapperContained.ingredients = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.RawShapedRecipe.ingredients); }
// public static void ingredients(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.recipe.RawShapedRecipe.ingredients = value.wrapperContained; }

// public java.util.Optional data() { return wrapperContained.data; }
// public void data(java.util.Optional value) { wrapperContained.data = value; }
// public static java.util.Optional data() { return net.minecraft.recipe.RawShapedRecipe.data; }
// public static void data(java.util.Optional value, ) { net.minecraft.recipe.RawShapedRecipe.data = value; }

// public int ingredientCount() { return wrapperContained.ingredientCount; }
// public void ingredientCount(int value) { wrapperContained.ingredientCount = value; }
// public static int ingredientCount() { return net.minecraft.recipe.RawShapedRecipe.ingredientCount; }
// public static void ingredientCount(int value, ) { net.minecraft.recipe.RawShapedRecipe.ingredientCount = value; }

// public boolean symmetrical() { return wrapperContained.symmetrical; }
// public void symmetrical(boolean value) { wrapperContained.symmetrical = value; }
// public static boolean symmetrical() { return net.minecraft.recipe.RawShapedRecipe.symmetrical; }
// public static void symmetrical(boolean value, ) { net.minecraft.recipe.RawShapedRecipe.symmetrical = value; }

public RawShapedRecipe(int width,int height,yarnwrap.util.collection.DefaultedList ingredients,java.util.Optional data) { this.wrapperContained = new net.minecraft.recipe.RawShapedRecipe(width,height,ingredients.wrapperContained,data); }
public boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.matches(input.wrapperContained); }
// public static boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input, ) { return net.minecraft.recipe.RawShapedRecipe.matches(input.wrapperContained); }
// public boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input,boolean mirrored) { return wrapperContained.matches(input.wrapperContained,mirrored); }
// public static boolean matches(yarnwrap.recipe.input.CraftingRecipeInput input,boolean mirrored, ) { return net.minecraft.recipe.RawShapedRecipe.matches(input.wrapperContained,mirrored); }
// public com.mojang.serialization.DataResult fromData(Object data) { return wrapperContained.fromData(data); }
// public static com.mojang.serialization.DataResult fromData(Object data, ) { return net.minecraft.recipe.RawShapedRecipe.fromData(data); }
// public com.mojang.serialization.DataResult method_55081(yarnwrap.recipe.RawShapedRecipe recipe) { return wrapperContained.method_55081(recipe.wrapperContained); }
// public static com.mojang.serialization.DataResult method_55081(yarnwrap.recipe.RawShapedRecipe recipe, ) { return net.minecraft.recipe.RawShapedRecipe.method_55081(recipe.wrapperContained); }
// public int findFirstSymbol(java.lang.String line) { return wrapperContained.findFirstSymbol(line); }
// public static int findFirstSymbol(java.lang.String line, ) { return net.minecraft.recipe.RawShapedRecipe.findFirstSymbol(line); }
// public java.lang.String[] removePadding(java.util.List pattern) { return wrapperContained.removePadding(pattern); }
// public static java.lang.String[] removePadding(java.util.List pattern, ) { return net.minecraft.recipe.RawShapedRecipe.removePadding(pattern); }
// public yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.util.List pattern) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.create(key,pattern)); }
// public static yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.util.List pattern, ) { return new yarnwrap.recipe.RawShapedRecipe(net.minecraft.recipe.RawShapedRecipe.create(key,pattern)); }
// public yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.lang.String[] pattern) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.create(key,pattern)); }
// public static yarnwrap.recipe.RawShapedRecipe create(java.util.Map key,java.lang.String[] pattern, ) { return new yarnwrap.recipe.RawShapedRecipe(net.minecraft.recipe.RawShapedRecipe.create(key,pattern)); }
// public void writeToBuf(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.writeToBuf(buf.wrapperContained); }
// public static void writeToBuf(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.recipe.RawShapedRecipe.writeToBuf(buf.wrapperContained); }
// public yarnwrap.recipe.Ingredient method_55088(yarnwrap.network.RegistryByteBuf ingredient) { return new yarnwrap.recipe.Ingredient(wrapperContained.method_55088(ingredient.wrapperContained)); }
// public static yarnwrap.recipe.Ingredient method_55088(yarnwrap.network.RegistryByteBuf ingredient, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.RawShapedRecipe.method_55088(ingredient.wrapperContained)); }
// public int findLastSymbol(java.lang.String line) { return wrapperContained.findLastSymbol(line); }
// public static int findLastSymbol(java.lang.String line, ) { return net.minecraft.recipe.RawShapedRecipe.findLastSymbol(line); }
// public yarnwrap.recipe.RawShapedRecipe readFromBuf(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.readFromBuf(buf.wrapperContained)); }
// public static yarnwrap.recipe.RawShapedRecipe readFromBuf(yarnwrap.network.RegistryByteBuf buf, ) { return new yarnwrap.recipe.RawShapedRecipe(net.minecraft.recipe.RawShapedRecipe.readFromBuf(buf.wrapperContained)); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.recipe.RawShapedRecipe.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.recipe.RawShapedRecipe.getHeight(); }
public yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getIngredients()); }
// public static yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.RawShapedRecipe.getIngredients()); }

}