package yarnwrap.util;
public class ModelAndTexture { public net.minecraft.util.ModelAndTexture wrapperContained; public ModelAndTexture(net.minecraft.util.ModelAndTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public ModelAndTexture(java.lang.Object model,yarnwrap.util.Identifier assetId) { this.wrapperContained = new net.minecraft.util.ModelAndTexture(model,assetId.wrapperContained); }
// public com.mojang.serialization.MapCodec createMapCodec(com.mojang.serialization.Codec modelCodec,java.lang.Object model) { return wrapperContained.createMapCodec(modelCodec,model); }
// public static com.mojang.serialization.MapCodec createMapCodec(com.mojang.serialization.Codec modelCodec,java.lang.Object model, ) { return net.minecraft.util.ModelAndTexture.createMapCodec(modelCodec,model); }
// public com.mojang.datafixers.kinds.App method_67155(com.mojang.serialization.Codec instance) { return wrapperContained.method_67155(instance); }
// public static com.mojang.datafixers.kinds.App method_67155(com.mojang.serialization.Codec instance, ) { return net.minecraft.util.ModelAndTexture.method_67155(instance); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.network.codec.PacketCodec modelPacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(modelPacketCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.network.codec.PacketCodec modelPacketCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.ModelAndTexture.createPacketCodec(modelPacketCodec.wrapperContained)); }

}