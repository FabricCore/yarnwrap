package yarnwrap.network.packet.c2s.play;
public class RecipeCategoryOptionsC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained; public RecipeCategoryOptionsC2SPacket(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookType category() { return new yarnwrap.recipe.book.RecipeBookType(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeBookType value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeBookType category() { return new yarnwrap.recipe.book.RecipeBookType(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.category); }
// public static void category(yarnwrap.recipe.book.RecipeBookType value, ) { net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.category = value.wrapperContained; }

// public boolean guiOpen() { return wrapperContained.guiOpen; }
// public void guiOpen(boolean value) { wrapperContained.guiOpen = value; }
// public static boolean guiOpen() { return net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.guiOpen; }
// public static void guiOpen(boolean value, ) { net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.guiOpen = value; }

// public boolean filteringCraftable() { return wrapperContained.filteringCraftable; }
// public void filteringCraftable(boolean value) { wrapperContained.filteringCraftable = value; }
// public static boolean filteringCraftable() { return net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.filteringCraftable; }
// public static void filteringCraftable(boolean value, ) { net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.filteringCraftable = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.CODEC = value.wrapperContained; }

// public RecipeCategoryOptionsC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket(buf.wrapperContained); }
public RecipeCategoryOptionsC2SPacket(yarnwrap.recipe.book.RecipeBookType category,boolean guiOpen,boolean filteringCraftable) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket(category.wrapperContained,guiOpen,filteringCraftable); }
public yarnwrap.recipe.book.RecipeBookType getCategory() { return new yarnwrap.recipe.book.RecipeBookType(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.RecipeBookType getCategory() { return new yarnwrap.recipe.book.RecipeBookType(net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.getCategory()); }
public boolean isGuiOpen() { return wrapperContained.isGuiOpen(); }
// public static boolean isGuiOpen() { return net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.isGuiOpen(); }
public boolean isFilteringCraftable() { return wrapperContained.isFilteringCraftable(); }
// public static boolean isFilteringCraftable() { return net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.isFilteringCraftable(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.RecipeCategoryOptionsC2SPacket.write(buf.wrapperContained); }

}