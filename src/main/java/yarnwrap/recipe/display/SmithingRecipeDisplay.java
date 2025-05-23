package yarnwrap.recipe.display;
public class SmithingRecipeDisplay { public net.minecraft.recipe.display.SmithingRecipeDisplay wrapperContained; public SmithingRecipeDisplay(net.minecraft.recipe.display.SmithingRecipeDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.recipe.display.SmithingRecipeDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.display.SmithingRecipeDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.SmithingRecipeDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.display.SmithingRecipeDisplay.PACKET_CODEC = value.wrapperContained; }

// public Object SERIALIZER() { return wrapperContained.SERIALIZER; }
// // public void SERIALIZER(Object value) { wrapperContained.SERIALIZER = value; }
// public static Object SERIALIZER() { return net.minecraft.recipe.display.SmithingRecipeDisplay.SERIALIZER; }
// // public static void SERIALIZER(Object value, ) { net.minecraft.recipe.display.SmithingRecipeDisplay.SERIALIZER = value; }

// public com.mojang.datafixers.kinds.App method_64757(Object instance) { return wrapperContained.method_64757(instance); }
// public static com.mojang.datafixers.kinds.App method_64757(Object instance, ) { return net.minecraft.recipe.display.SmithingRecipeDisplay.method_64757(instance); }

}