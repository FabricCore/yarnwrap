package yarnwrap.network.packet.c2s.play;
public class RecipeCategoryOptionsC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained; public RecipeCategoryOptionsC2SPacket(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookCategory category() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeBookCategory value) { wrapperContained.category = value.wrapperContained; }
// public boolean guiOpen() { return wrapperContained.guiOpen; }
// public void guiOpen(boolean value) { wrapperContained.guiOpen = value; }
// public boolean filteringCraftable() { return wrapperContained.filteringCraftable; }
// public void filteringCraftable(boolean value) { wrapperContained.filteringCraftable = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public RecipeCategoryOptionsC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket(buf.wrapperContained); }
public RecipeCategoryOptionsC2SPacket(yarnwrap.recipe.book.RecipeBookCategory category,boolean guiOpen,boolean filteringCraftable) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket(category.wrapperContained,guiOpen,filteringCraftable); }
public yarnwrap.recipe.book.RecipeBookCategory getCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.getCategory()); }
public boolean isGuiOpen() { return wrapperContained.isGuiOpen(); }
public boolean isFilteringCraftable() { return wrapperContained.isFilteringCraftable(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}