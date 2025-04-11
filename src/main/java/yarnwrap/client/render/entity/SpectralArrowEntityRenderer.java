package yarnwrap.client.render.entity;
public class SpectralArrowEntityRenderer { public net.minecraft.client.render.entity.SpectralArrowEntityRenderer wrapperContained; public SpectralArrowEntityRenderer(net.minecraft.client.render.entity.SpectralArrowEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}