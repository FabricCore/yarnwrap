package yarnwrap.client.font;
public class TextRenderLayerSet { public net.minecraft.client.font.TextRenderLayerSet wrapperContained; public TextRenderLayerSet(net.minecraft.client.font.TextRenderLayerSet wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.font.TextRenderLayerSet ofIntensity(yarnwrap.util.Identifier textureId) { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.ofIntensity(textureId.wrapperContained)); }
// public yarnwrap.client.render.RenderLayer getRenderLayer(Object layerType) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(layerType)); }
public yarnwrap.client.font.TextRenderLayerSet of(yarnwrap.util.Identifier textureId) { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.of(textureId.wrapperContained)); }

}