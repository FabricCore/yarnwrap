package yarnwrap.network.packet.c2s.play;
public class RecipeBookDataC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained; public RecipeBookDataC2SPacket(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}