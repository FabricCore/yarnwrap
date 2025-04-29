package yarnwrap.client.render.entity.feature;
public class FeatureRendererContext { public net.minecraft.client.render.entity.feature.FeatureRendererContext wrapperContained; public FeatureRendererContext(net.minecraft.client.render.entity.feature.FeatureRendererContext wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier getTexture(yarnwrap.entity.Entity entity) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(entity.wrapperContained)); }
// public static yarnwrap.util.Identifier getTexture(yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.FeatureRendererContext.getTexture(entity.wrapperContained)); }
public yarnwrap.client.render.entity.model.EntityModel getModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.getModel()); }
// public static yarnwrap.client.render.entity.model.EntityModel getModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.FeatureRendererContext.getModel()); }

}