package yarnwrap.client.render.entity.feature;
public class EyesFeatureRenderer { public net.minecraft.client.render.entity.feature.EyesFeatureRenderer wrapperContained; public EyesFeatureRenderer(net.minecraft.client.render.entity.feature.EyesFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.RenderLayer getEyesTexture() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEyesTexture()); }

}