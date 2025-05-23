package yarnwrap.network.packet.c2s.play;
public class RecipeBookDataC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained; public RecipeBookDataC2SPacket(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.recipe.NetworkRecipeId value) { wrapperContained.recipeId = value.wrapperContained; }
// public static yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.recipeId); }
// public static void recipeId(yarnwrap.recipe.NetworkRecipeId value, ) { net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.recipeId = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.CODEC = value.wrapperContained; }

// public yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.recipeId()); }
// // public static yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.recipeId()); }

}