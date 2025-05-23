package yarnwrap.recipe.display;
public class RecipeDisplay { public net.minecraft.recipe.display.RecipeDisplay wrapperContained; public RecipeDisplay(net.minecraft.recipe.display.RecipeDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.display.RecipeDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.display.RecipeDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.RecipeDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.display.RecipeDisplay.PACKET_CODEC = value.wrapperContained; }

public Object serializer() { return wrapperContained.serializer(); }
// public static Object serializer() { return net.minecraft.recipe.display.RecipeDisplay.serializer(); }
public boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isEnabled(features.wrapperContained); }
// public static boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.recipe.display.RecipeDisplay.isEnabled(features.wrapperContained); }

}