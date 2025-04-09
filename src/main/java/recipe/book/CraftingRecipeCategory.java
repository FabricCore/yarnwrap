package yarnwrap.recipe.book;
public class CraftingRecipeCategory { public net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained; public CraftingRecipeCategory(net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }
public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int index() { return wrapperContained.index; }
// public int getIndex() { return wrapperContained.getIndex(); }

}