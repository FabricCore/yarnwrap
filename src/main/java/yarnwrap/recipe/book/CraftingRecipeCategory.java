package yarnwrap.recipe.book;
public class CraftingRecipeCategory { public net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained; public CraftingRecipeCategory(net.minecraft.recipe.book.CraftingRecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
// public void INDEX_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.INDEX_TO_VALUE = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public int getIndex() { return wrapperContained.getIndex(); }

}