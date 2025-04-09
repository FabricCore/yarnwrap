package yarnwrap.recipe;
public class SpecialRecipeSerializer { public net.minecraft.recipe.SpecialRecipeSerializer wrapperContained; public SpecialRecipeSerializer(net.minecraft.recipe.SpecialRecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }

}