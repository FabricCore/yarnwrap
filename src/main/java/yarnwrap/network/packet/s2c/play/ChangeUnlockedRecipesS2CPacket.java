package yarnwrap.network.packet.s2c.play;
public class ChangeUnlockedRecipesS2CPacket { public net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained; public ChangeUnlockedRecipesS2CPacket(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// public java.util.List recipeIdsToInit() { return wrapperContained.recipeIdsToInit; }
// public void recipeIdsToInit(java.util.List value) { wrapperContained.recipeIdsToInit = value; }
// public java.util.List recipeIdsToChange() { return wrapperContained.recipeIdsToChange; }
// public void recipeIdsToChange(java.util.List value) { wrapperContained.recipeIdsToChange = value; }
// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
// public void options(yarnwrap.recipe.book.RecipeBookOptions value) { wrapperContained.options = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public java.util.List getRecipeIdsToChange() { return wrapperContained.getRecipeIdsToChange(); }
public Object getAction() { return wrapperContained.getAction(); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
public java.util.List getRecipeIdsToInit() { return wrapperContained.getRecipeIdsToInit(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}