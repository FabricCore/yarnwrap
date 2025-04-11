package yarnwrap.network.packet.c2s.play;
public class RecipeBookDataC2SPacket { public net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained; public RecipeBookDataC2SPacket(net.minecraft.network.packet.c2s.play.RecipeBookDataC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.util.Identifier value) { wrapperContained.recipeId = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}