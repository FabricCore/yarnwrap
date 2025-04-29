package yarnwrap.client.render.entity.feature;
public class ShoulderParrotFeatureRenderer { public net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer wrapperContained; public ShoulderParrotFeatureRenderer(net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ParrotEntityModel model() { return new yarnwrap.client.render.entity.model.ParrotEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ParrotEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ParrotEntityModel model() { return new yarnwrap.client.render.entity.model.ParrotEntityModel(net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ParrotEntityModel value, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.model = value.wrapperContained; }

public ShoulderParrotFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer(context.wrapperContained,loader.wrapperContained); }
// public boolean method_17957(yarnwrap.entity.EntityType type) { return wrapperContained.method_17957(type.wrapperContained); }
// public static boolean method_17957(yarnwrap.entity.EntityType type, ) { return net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.method_17957(type.wrapperContained); }
// public void method_17958(yarnwrap.client.util.math.MatrixStack type) { wrapperContained.method_17958(type.wrapperContained); }
// public static void method_17958(yarnwrap.client.util.math.MatrixStack type, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.method_17958(type.wrapperContained); }
// public void renderShoulderParrot(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.entity.player.PlayerEntity player,float limbAngle,float limbDistance,float headYaw,float headPitch,boolean leftShoulder) { wrapperContained.renderShoulderParrot(matrices.wrapperContained,vertexConsumers.wrapperContained,light,player.wrapperContained,limbAngle,limbDistance,headYaw,headPitch,leftShoulder); }
// public static void renderShoulderParrot(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.entity.player.PlayerEntity player,float limbAngle,float limbDistance,float headYaw,float headPitch,boolean leftShoulder, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.renderShoulderParrot(matrices.wrapperContained,vertexConsumers.wrapperContained,light,player.wrapperContained,limbAngle,limbDistance,headYaw,headPitch,leftShoulder); }

}