package yarnwrap.client.render.entity.feature;
public class ShoulderParrotFeatureRenderer { public net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer wrapperContained; public ShoulderParrotFeatureRenderer(net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ParrotEntityModel model() { return new yarnwrap.client.render.entity.model.ParrotEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ParrotEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ParrotEntityModel model() { return new yarnwrap.client.render.entity.model.ParrotEntityModel(net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ParrotEntityModel value, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.state.ParrotEntityRenderState parrotState() { return new yarnwrap.client.render.entity.state.ParrotEntityRenderState(wrapperContained.parrotState); }
// public void parrotState(yarnwrap.client.render.entity.state.ParrotEntityRenderState value) { wrapperContained.parrotState = value.wrapperContained; }
// public static yarnwrap.client.render.entity.state.ParrotEntityRenderState parrotState() { return new yarnwrap.client.render.entity.state.ParrotEntityRenderState(net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.parrotState); }
// public static void parrotState(yarnwrap.client.render.entity.state.ParrotEntityRenderState value, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.parrotState = value.wrapperContained; }

public ShoulderParrotFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer(context.wrapperContained,loader.wrapperContained); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.state.PlayerEntityRenderState state,Object parrotVariant,float headYaw,float headPitch,boolean left) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,state.wrapperContained,parrotVariant,headYaw,headPitch,left); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.state.PlayerEntityRenderState state,Object parrotVariant,float headYaw,float headPitch,boolean left, ) { net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,state.wrapperContained,parrotVariant,headYaw,headPitch,left); }

}