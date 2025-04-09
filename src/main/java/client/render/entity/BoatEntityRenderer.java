package yarnwrap.client.render.entity;
public class BoatEntityRenderer { public net.minecraft.client.render.entity.BoatEntityRenderer wrapperContained; public BoatEntityRenderer(net.minecraft.client.render.entity.BoatEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map texturesAndModels() { return wrapperContained.texturesAndModels; }
// public yarnwrap.util.Identifier getTexture(Object type,boolean chest) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(type,chest)); }
// public yarnwrap.client.render.entity.model.CompositeEntityModel createModel(Object ctx,Object type,boolean chest) { return new yarnwrap.client.render.entity.model.CompositeEntityModel(wrapperContained.createModel(ctx,type,chest)); }

}