package yarnwrap.network.packet.c2s.play;
public class RecipeBookDataC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained; public RecipeBookDataC2SPacket(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.util.Identifier value) { wrapperContained.recipeId = value.wrapperContained; }
// public static yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.recipeId); }
// public static void recipeId(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.recipeId = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.CODEC = value.wrapperContained; }

// public RecipeBookDataC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket(buf.wrapperContained); }
public RecipeBookDataC2SPacket(yarnwrap.recipe.RecipeEntry recipe) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket(recipe.wrapperContained); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public static yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.getRecipeId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket.write(buf.wrapperContained); }

}