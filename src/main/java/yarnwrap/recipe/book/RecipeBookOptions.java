package yarnwrap.recipe.book;
public class RecipeBookOptions { public net.minecraft.recipe.book.RecipeBookOptions wrapperContained; public RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.book.RecipeBookOptions.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.book.RecipeBookOptions.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.recipe.book.RecipeBookOptions.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.book.RecipeBookOptions.CODEC = value; }

// public Object crafting() { return wrapperContained.crafting; }
// public void crafting(Object value) { wrapperContained.crafting = value; }
// // public static Object crafting() { return net.minecraft.recipe.book.RecipeBookOptions.crafting; }
// public static void crafting(Object value, ) { net.minecraft.recipe.book.RecipeBookOptions.crafting = value; }

// public Object furnace() { return wrapperContained.furnace; }
// public void furnace(Object value) { wrapperContained.furnace = value; }
// // public static Object furnace() { return net.minecraft.recipe.book.RecipeBookOptions.furnace; }
// public static void furnace(Object value, ) { net.minecraft.recipe.book.RecipeBookOptions.furnace = value; }

// public Object blastFurnace() { return wrapperContained.blastFurnace; }
// public void blastFurnace(Object value) { wrapperContained.blastFurnace = value; }
// // public static Object blastFurnace() { return net.minecraft.recipe.book.RecipeBookOptions.blastFurnace; }
// public static void blastFurnace(Object value, ) { net.minecraft.recipe.book.RecipeBookOptions.blastFurnace = value; }

// public Object smoker() { return wrapperContained.smoker; }
// public void smoker(Object value) { wrapperContained.smoker = value; }
// // public static Object smoker() { return net.minecraft.recipe.book.RecipeBookOptions.smoker; }
// public static void smoker(Object value, ) { net.minecraft.recipe.book.RecipeBookOptions.smoker = value; }

// public RecipeBookOptions(Object crafting,Object furnace,Object blastFurnace,Object smoker) { this.wrapperContained = new net.minecraft.recipe.book.RecipeBookOptions(crafting,furnace,blastFurnace,smoker); }
public yarnwrap.recipe.book.RecipeBookOptions copy() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.copy()); }
// public static yarnwrap.recipe.book.RecipeBookOptions copy() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions.copy()); }
public void copyFrom(yarnwrap.recipe.book.RecipeBookOptions other) { wrapperContained.copyFrom(other.wrapperContained); }
// public static void copyFrom(yarnwrap.recipe.book.RecipeBookOptions other, ) { net.minecraft.recipe.book.RecipeBookOptions.copyFrom(other.wrapperContained); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookType category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
// public static boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookType category, ) { return net.minecraft.recipe.book.RecipeBookOptions.isGuiOpen(category.wrapperContained); }
public void setGuiOpen(yarnwrap.recipe.book.RecipeBookType category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
// public static void setGuiOpen(yarnwrap.recipe.book.RecipeBookType category,boolean open, ) { net.minecraft.recipe.book.RecipeBookOptions.setGuiOpen(category.wrapperContained,open); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
// public static boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category, ) { return net.minecraft.recipe.book.RecipeBookOptions.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category,boolean filtering) { wrapperContained.setFilteringCraftable(category.wrapperContained,filtering); }
// public static void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category,boolean filtering, ) { net.minecraft.recipe.book.RecipeBookOptions.setFilteringCraftable(category.wrapperContained,filtering); }
// public void apply(yarnwrap.recipe.book.RecipeBookType type,java.util.function.UnaryOperator modifier) { wrapperContained.apply(type.wrapperContained,modifier); }
// public static void apply(yarnwrap.recipe.book.RecipeBookType type,java.util.function.UnaryOperator modifier, ) { net.minecraft.recipe.book.RecipeBookOptions.apply(type.wrapperContained,modifier); }
// public Object method_64583(boolean option) { return wrapperContained.method_64583(option); }
// public static Object method_64583(boolean option, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_64583(option); }
// public Object method_64584(boolean option) { return wrapperContained.method_64584(option); }
// public static Object method_64584(boolean option, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_64584(option); }
// public Object getOption(yarnwrap.recipe.book.RecipeBookType type) { return wrapperContained.getOption(type.wrapperContained); }
// public static Object getOption(yarnwrap.recipe.book.RecipeBookType type, ) { return net.minecraft.recipe.book.RecipeBookOptions.getOption(type.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_71331(Object instance) { return wrapperContained.method_71331(instance); }
// public static com.mojang.datafixers.kinds.App method_71331(Object instance, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71331(instance); }
// public Object method_71332(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71332(options.wrapperContained); }
// public static Object method_71332(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71332(options.wrapperContained); }
// public Object method_71333(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71333(options.wrapperContained); }
// public static Object method_71333(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71333(options.wrapperContained); }
// public Object method_71334(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71334(options.wrapperContained); }
// public static Object method_71334(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71334(options.wrapperContained); }
// public Object method_71335(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71335(options.wrapperContained); }
// public static Object method_71335(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71335(options.wrapperContained); }
// public Object method_71336(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71336(options.wrapperContained); }
// public static Object method_71336(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71336(options.wrapperContained); }
// public Object method_71337(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71337(options.wrapperContained); }
// public static Object method_71337(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71337(options.wrapperContained); }
// public Object method_71338(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71338(options.wrapperContained); }
// public static Object method_71338(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71338(options.wrapperContained); }
// public Object method_71339(yarnwrap.recipe.book.RecipeBookOptions options) { return wrapperContained.method_71339(options.wrapperContained); }
// public static Object method_71339(yarnwrap.recipe.book.RecipeBookOptions options, ) { return net.minecraft.recipe.book.RecipeBookOptions.method_71339(options.wrapperContained); }

}