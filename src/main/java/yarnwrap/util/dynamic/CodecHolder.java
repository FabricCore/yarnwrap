package yarnwrap.util.dynamic;
public class CodecHolder { public net.minecraft.util.dynamic.CodecHolder wrapperContained; public CodecHolder(net.minecraft.util.dynamic.CodecHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.dynamic.CodecHolder of(com.mojang.serialization.MapCodec mapCodec) { return new yarnwrap.util.dynamic.CodecHolder(wrapperContained.of(mapCodec)); }

}