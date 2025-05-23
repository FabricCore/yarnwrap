package yarnwrap.recipe;
public class NetworkRecipeId { public net.minecraft.recipe.NetworkRecipeId wrapperContained; public NetworkRecipeId(net.minecraft.recipe.NetworkRecipeId wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.NetworkRecipeId.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.NetworkRecipeId.PACKET_CODEC = value.wrapperContained; }


}