package yarnwrap.client.render.entity;
public class ArrowEntityRenderer { public net.minecraft.client.render.entity.ArrowEntityRenderer wrapperContained; public ArrowEntityRenderer(net.minecraft.client.render.entity.ArrowEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier TIPPED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TIPPED_TEXTURE); }
public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }

}