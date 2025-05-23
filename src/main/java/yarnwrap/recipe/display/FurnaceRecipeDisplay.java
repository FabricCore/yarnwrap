package yarnwrap.recipe.display;
public class FurnaceRecipeDisplay { public net.minecraft.recipe.display.FurnaceRecipeDisplay wrapperContained; public FurnaceRecipeDisplay(net.minecraft.recipe.display.FurnaceRecipeDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.recipe.display.FurnaceRecipeDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.recipe.display.FurnaceRecipeDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.FurnaceRecipeDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.display.FurnaceRecipeDisplay.PACKET_CODEC = value.wrapperContained; }

// public Object SERIALIZER() { return wrapperContained.SERIALIZER; }
// // public void SERIALIZER(Object value) { wrapperContained.SERIALIZER = value; }
// public static Object SERIALIZER() { return net.minecraft.recipe.display.FurnaceRecipeDisplay.SERIALIZER; }
// // public static void SERIALIZER(Object value, ) { net.minecraft.recipe.display.FurnaceRecipeDisplay.SERIALIZER = value; }

// public com.mojang.datafixers.kinds.App method_64727(Object instance) { return wrapperContained.method_64727(instance); }
// public static com.mojang.datafixers.kinds.App method_64727(Object instance, ) { return net.minecraft.recipe.display.FurnaceRecipeDisplay.method_64727(instance); }

}