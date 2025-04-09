package yarnwrap.client.font;
public class ReferenceFont { public net.minecraft.client.font.ReferenceFont wrapperContained; public ReferenceFont(net.minecraft.client.font.ReferenceFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }

}