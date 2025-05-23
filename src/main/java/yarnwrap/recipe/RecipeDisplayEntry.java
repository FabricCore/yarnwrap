package yarnwrap.recipe;
public class RecipeDisplayEntry { public net.minecraft.recipe.RecipeDisplayEntry wrapperContained; public RecipeDisplayEntry(net.minecraft.recipe.RecipeDisplayEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.RecipeDisplayEntry.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.RecipeDisplayEntry.PACKET_CODEC = value.wrapperContained; }

public boolean isCraftable(yarnwrap.recipe.RecipeFinder finder) { return wrapperContained.isCraftable(finder.wrapperContained); }
// public static boolean isCraftable(yarnwrap.recipe.RecipeFinder finder, ) { return net.minecraft.recipe.RecipeDisplayEntry.isCraftable(finder.wrapperContained); }
public java.util.List getStacks(yarnwrap.util.context.ContextParameterMap context) { return wrapperContained.getStacks(context.wrapperContained); }
// public static java.util.List getStacks(yarnwrap.util.context.ContextParameterMap context, ) { return net.minecraft.recipe.RecipeDisplayEntry.getStacks(context.wrapperContained); }

}