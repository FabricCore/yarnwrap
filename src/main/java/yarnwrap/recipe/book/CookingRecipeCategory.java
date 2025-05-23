package yarnwrap.recipe.book;
public class CookingRecipeCategory { public net.minecraft.recipe.book.CookingRecipeCategory wrapperContained; public CookingRecipeCategory(net.minecraft.recipe.book.CookingRecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.book.CookingRecipeCategory.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.book.CookingRecipeCategory.CODEC = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.recipe.book.CookingRecipeCategory.name; }
// public static void name(java.lang.String value, ) { net.minecraft.recipe.book.CookingRecipeCategory.name = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.book.CookingRecipeCategory.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.book.CookingRecipeCategory.PACKET_CODEC = value.wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.recipe.book.CookingRecipeCategory.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.recipe.book.CookingRecipeCategory.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.recipe.book.CookingRecipeCategory.id; }
// public static void id(int value, ) { net.minecraft.recipe.book.CookingRecipeCategory.id = value; }

// // public CookingRecipeCategory(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.recipe.book.CookingRecipeCategory(id,name); }
// public int method_64669(yarnwrap.recipe.book.CookingRecipeCategory category) { return wrapperContained.method_64669(category.wrapperContained); }
// public static int method_64669(yarnwrap.recipe.book.CookingRecipeCategory category, ) { return net.minecraft.recipe.book.CookingRecipeCategory.method_64669(category.wrapperContained); }
// public int method_64670(yarnwrap.recipe.book.CookingRecipeCategory category) { return wrapperContained.method_64670(category.wrapperContained); }
// public static int method_64670(yarnwrap.recipe.book.CookingRecipeCategory category, ) { return net.minecraft.recipe.book.CookingRecipeCategory.method_64670(category.wrapperContained); }

}