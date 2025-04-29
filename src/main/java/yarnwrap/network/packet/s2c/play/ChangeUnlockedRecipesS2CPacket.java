package yarnwrap.network.packet.s2c.play;
public class ChangeUnlockedRecipesS2CPacket { public net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained; public ChangeUnlockedRecipesS2CPacket(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// // public static Object action() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.action; }
// // public static void action(Object value, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.action = value; }

// public java.util.List recipeIdsToInit() { return wrapperContained.recipeIdsToInit; }
// public void recipeIdsToInit(java.util.List value) { wrapperContained.recipeIdsToInit = value; }
// public static java.util.List recipeIdsToInit() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.recipeIdsToInit; }
// public static void recipeIdsToInit(java.util.List value, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.recipeIdsToInit = value; }

// public java.util.List recipeIdsToChange() { return wrapperContained.recipeIdsToChange; }
// public void recipeIdsToChange(java.util.List value) { wrapperContained.recipeIdsToChange = value; }
// public static java.util.List recipeIdsToChange() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.recipeIdsToChange; }
// public static void recipeIdsToChange(java.util.List value, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.recipeIdsToChange = value; }

// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
// public void options(yarnwrap.recipe.book.RecipeBookOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.options); }
// public static void options(yarnwrap.recipe.book.RecipeBookOptions value, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.options = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.CODEC = value.wrapperContained; }

// public ChangeUnlockedRecipesS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket(buf.wrapperContained); }
// public ChangeUnlockedRecipesS2CPacket(Object action,java.util.Collection recipeIdsToChange,java.util.Collection recipeIdsToInit,yarnwrap.recipe.book.RecipeBookOptions options) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket(action,recipeIdsToChange,recipeIdsToInit,options.wrapperContained); }
public java.util.List getRecipeIdsToChange() { return wrapperContained.getRecipeIdsToChange(); }
// public static java.util.List getRecipeIdsToChange() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.getRecipeIdsToChange(); }
public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.getAction(); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
// public static yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.getOptions()); }
public java.util.List getRecipeIdsToInit() { return wrapperContained.getRecipeIdsToInit(); }
// public static java.util.List getRecipeIdsToInit() { return net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.getRecipeIdsToInit(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChangeUnlockedRecipesS2CPacket.write(buf.wrapperContained); }

}