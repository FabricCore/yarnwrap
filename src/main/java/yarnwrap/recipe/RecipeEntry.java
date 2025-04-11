package yarnwrap.recipe;
public class RecipeEntry { public net.minecraft.recipe.RecipeEntry wrapperContained; public RecipeEntry(net.minecraft.recipe.RecipeEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value); }
// public void value(yarnwrap.recipe.Recipe value) { wrapperContained.value = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// public yarnwrap.recipe.Recipe value() { return new yarnwrap.recipe.Recipe(wrapperContained.value()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }

}