package yarnwrap.client.font;
public class ReferenceFont { public net.minecraft.client.font.ReferenceFont wrapperContained; public ReferenceFont(net.minecraft.client.font.ReferenceFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public ReferenceFont(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.font.ReferenceFont(id.wrapperContained); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// public com.mojang.datafixers.kinds.App method_51647(Object instance) { return wrapperContained.method_51647(instance); }

}