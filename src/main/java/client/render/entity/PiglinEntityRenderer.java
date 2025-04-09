package yarnwrap.client.render.entity;
public class PiglinEntityRenderer { public net.minecraft.client.render.entity.PiglinEntityRenderer wrapperContained; public PiglinEntityRenderer(net.minecraft.client.render.entity.PiglinEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map TEXTURES() { return wrapperContained.TEXTURES; }
// public float HORIZONTAL_SCALE() { return wrapperContained.HORIZONTAL_SCALE; }
// public yarnwrap.client.render.entity.model.PiglinEntityModel getPiglinModel(yarnwrap.client.render.entity.model.EntityModelLoader modelLoader,yarnwrap.client.render.entity.model.EntityModelLayer layer,boolean zombie) { return new yarnwrap.client.render.entity.model.PiglinEntityModel(wrapperContained.getPiglinModel(modelLoader.wrapperContained,layer.wrapperContained,zombie)); }

}