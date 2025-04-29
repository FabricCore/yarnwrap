package yarnwrap.recipe;
public class SpecialRecipeSerializer { public net.minecraft.recipe.SpecialRecipeSerializer wrapperContained; public SpecialRecipeSerializer(net.minecraft.recipe.SpecialRecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.recipe.SpecialRecipeSerializer.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.SpecialRecipeSerializer.codec = value; }

// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.SpecialRecipeSerializer.packetCodec); }
// public static void packetCodec(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.SpecialRecipeSerializer.packetCodec = value.wrapperContained; }

// public SpecialRecipeSerializer(Object factory) { this.wrapperContained = new net.minecraft.recipe.SpecialRecipeSerializer(factory); }
// public com.mojang.datafixers.kinds.App method_53773(Object instance) { return wrapperContained.method_53773(instance); }
// public static com.mojang.datafixers.kinds.App method_53773(Object instance, ) { return net.minecraft.recipe.SpecialRecipeSerializer.method_53773(instance); }

}