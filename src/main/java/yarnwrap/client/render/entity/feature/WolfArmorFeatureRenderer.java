package yarnwrap.client.render.entity.feature;
public class WolfArmorFeatureRenderer { public net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer wrapperContained; public WolfArmorFeatureRenderer(net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.WolfEntityModel model() { return new yarnwrap.client.render.entity.model.WolfEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.WolfEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.WolfEntityModel model() { return new yarnwrap.client.render.entity.model.WolfEntityModel(net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.WolfEntityModel value, ) { net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.model = value.wrapperContained; }

// public java.util.Map CRACK_TEXTURES() { return wrapperContained.CRACK_TEXTURES; }
// public void CRACK_TEXTURES(java.util.Map value) { wrapperContained.CRACK_TEXTURES = value; }
// public static java.util.Map CRACK_TEXTURES() { return net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.CRACK_TEXTURES; }
// public static void CRACK_TEXTURES(java.util.Map value, ) { net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.CRACK_TEXTURES = value; }

public WolfArmorFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer(context.wrapperContained,loader.wrapperContained); }
// public void renderCracks(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack) { wrapperContained.renderCracks(matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained); }
// public static void renderCracks(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack, ) { net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.renderCracks(matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained); }
// public void renderDyed(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.item.AnimalArmorItem item) { wrapperContained.renderDyed(matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,item.wrapperContained); }
// public static void renderDyed(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.item.AnimalArmorItem item, ) { net.minecraft.client.render.entity.feature.WolfArmorFeatureRenderer.renderDyed(matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,item.wrapperContained); }

}