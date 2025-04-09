package yarnwrap.recipe;
public class RecipeEntry { public net.minecraft.recipe.RecipeEntry wrapperContained; public RecipeEntry(net.minecraft.recipe.RecipeEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value); }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value()); }

}