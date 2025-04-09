package yarnwrap.network.packet.c2s.play;
public class RecipeCategoryOptionsC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained; public RecipeCategoryOptionsC2SPacket(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookCategory category() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.category); }
// public boolean guiOpen() { return wrapperContained.guiOpen; }
// public boolean filteringCraftable() { return wrapperContained.filteringCraftable; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.recipe.book.RecipeBookCategory getCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.getCategory()); }
public boolean isGuiOpen() { return wrapperContained.isGuiOpen(); }
public boolean isFilteringCraftable() { return wrapperContained.isFilteringCraftable(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}