package yarnwrap.recipe.book;
public class CraftingRecipeCategory { public net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained; public CraftingRecipeCategory(net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.book.CraftingRecipeCategory.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.book.CraftingRecipeCategory.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.recipe.book.CraftingRecipeCategory.id; }
// public static void id(java.lang.String value, ) { net.minecraft.recipe.book.CraftingRecipeCategory.id = value; }

// public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
// public void INDEX_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.INDEX_TO_VALUE = value; }
public static java.util.function.IntFunction INDEX_TO_VALUE() { return net.minecraft.recipe.book.CraftingRecipeCategory.INDEX_TO_VALUE; }
// public static void INDEX_TO_VALUE(java.util.function.IntFunction value, ) { net.minecraft.recipe.book.CraftingRecipeCategory.INDEX_TO_VALUE = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.book.CraftingRecipeCategory.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.book.CraftingRecipeCategory.PACKET_CODEC = value.wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.recipe.book.CraftingRecipeCategory.index; }
// public static void index(int value, ) { net.minecraft.recipe.book.CraftingRecipeCategory.index = value; }

// public CraftingRecipeCategory(java.lang.String id,int index) { this.wrapperContained = new net.minecraft.recipe.book.CraftingRecipeCategory(id,index); }
// public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.recipe.book.CraftingRecipeCategory.getIndex(); }

}