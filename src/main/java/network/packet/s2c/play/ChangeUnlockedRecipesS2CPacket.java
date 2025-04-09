package yarnwrap.network.packet.s2c.play;
public class ChangeUnlockedRecipesS2CPacket { public net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained; public ChangeUnlockedRecipesS2CPacket(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object action() { return wrapperContained.action; }
// public java.util.List recipeIdsToInit() { return wrapperContained.recipeIdsToInit; }
// public java.util.List recipeIdsToChange() { return wrapperContained.recipeIdsToChange; }
// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.util.List getRecipeIdsToChange() { return wrapperContained.getRecipeIdsToChange(); }
public Object getAction() { return wrapperContained.getAction(); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
public java.util.List getRecipeIdsToInit() { return wrapperContained.getRecipeIdsToInit(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}