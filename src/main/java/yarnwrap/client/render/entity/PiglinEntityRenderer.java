package yarnwrap.client.render.entity;
public class PiglinEntityRenderer { public net.minecraft.client.render.entity.PiglinEntityRenderer wrapperContained; public PiglinEntityRenderer(net.minecraft.client.render.entity.PiglinEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map TEXTURES() { return wrapperContained.TEXTURES; }
// public void TEXTURES(java.util.Map value) { wrapperContained.TEXTURES = value; }
// public static java.util.Map TEXTURES() { return net.minecraft.client.render.entity.PiglinEntityRenderer.TEXTURES; }
// public static void TEXTURES(java.util.Map value, ) { net.minecraft.client.render.entity.PiglinEntityRenderer.TEXTURES = value; }

// public float HORIZONTAL_SCALE() { return wrapperContained.HORIZONTAL_SCALE; }
// public void HORIZONTAL_SCALE(float value) { wrapperContained.HORIZONTAL_SCALE = value; }
// public static float HORIZONTAL_SCALE() { return net.minecraft.client.render.entity.PiglinEntityRenderer.HORIZONTAL_SCALE; }
// public static void HORIZONTAL_SCALE(float value, ) { net.minecraft.client.render.entity.PiglinEntityRenderer.HORIZONTAL_SCALE = value; }

// public PiglinEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModelLayer mainLayer,yarnwrap.client.render.entity.model.EntityModelLayer innerArmorLayer,yarnwrap.client.render.entity.model.EntityModelLayer outerArmorLayer,boolean zombie) { this.wrapperContained = new net.minecraft.client.render.entity.PiglinEntityRenderer(ctx,mainLayer.wrapperContained,innerArmorLayer.wrapperContained,outerArmorLayer.wrapperContained,zombie); }
// public yarnwrap.client.render.entity.model.PiglinEntityModel getPiglinModel(yarnwrap.client.render.entity.model.EntityModelLoader modelLoader,yarnwrap.client.render.entity.model.EntityModelLayer layer,boolean zombie) { return new yarnwrap.client.render.entity.model.PiglinEntityModel(wrapperContained.getPiglinModel(modelLoader.wrapperContained,layer.wrapperContained,zombie)); }
// public static yarnwrap.client.render.entity.model.PiglinEntityModel getPiglinModel(yarnwrap.client.render.entity.model.EntityModelLoader modelLoader,yarnwrap.client.render.entity.model.EntityModelLayer layer,boolean zombie, ) { return new yarnwrap.client.render.entity.model.PiglinEntityModel(net.minecraft.client.render.entity.PiglinEntityRenderer.getPiglinModel(modelLoader.wrapperContained,layer.wrapperContained,zombie)); }

}