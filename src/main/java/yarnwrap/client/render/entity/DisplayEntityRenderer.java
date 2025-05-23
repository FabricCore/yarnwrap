package yarnwrap.client.render.entity;
public class DisplayEntityRenderer { public net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained; public DisplayEntityRenderer(net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher renderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.renderDispatcher); }
// public void renderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.renderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher renderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.entity.DisplayEntityRenderer.renderDispatcher); }
// public static void renderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.entity.DisplayEntityRenderer.renderDispatcher = value.wrapperContained; }

// public void render(yarnwrap.client.render.entity.state.DisplayEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float tickProgress) { wrapperContained.render(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,tickProgress); }
// public static void render(yarnwrap.client.render.entity.state.DisplayEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float tickProgress, ) { net.minecraft.client.render.entity.DisplayEntityRenderer.render(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,tickProgress); }
// public org.joml.Quaternionf getBillboardRotation(Object renderState,yarnwrap.client.render.entity.state.DisplayEntityRenderState state) { return wrapperContained.getBillboardRotation(renderState,state.wrapperContained); }
// public static org.joml.Quaternionf getBillboardRotation(Object renderState,yarnwrap.client.render.entity.state.DisplayEntityRenderState state, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getBillboardRotation(renderState,state.wrapperContained); }
// public float lerpYaw(yarnwrap.entity.decoration.DisplayEntity entity,float deltaTicks) { return wrapperContained.lerpYaw(entity.wrapperContained,deltaTicks); }
// public static float lerpYaw(yarnwrap.entity.decoration.DisplayEntity entity,float deltaTicks, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.lerpYaw(entity.wrapperContained,deltaTicks); }
// public float getBackwardsYaw(yarnwrap.client.render.Camera camera) { return wrapperContained.getBackwardsYaw(camera.wrapperContained); }
// public static float getBackwardsYaw(yarnwrap.client.render.Camera camera, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getBackwardsYaw(camera.wrapperContained); }
// public float lerpPitch(yarnwrap.entity.decoration.DisplayEntity entity,float deltaTicks) { return wrapperContained.lerpPitch(entity.wrapperContained,deltaTicks); }
// public static float lerpPitch(yarnwrap.entity.decoration.DisplayEntity entity,float deltaTicks, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.lerpPitch(entity.wrapperContained,deltaTicks); }
// public float getNegatedPitch(yarnwrap.client.render.Camera camera) { return wrapperContained.getNegatedPitch(camera.wrapperContained); }
// public static float getNegatedPitch(yarnwrap.client.render.Camera camera, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getNegatedPitch(camera.wrapperContained); }
// public int getBrightnessOverride(yarnwrap.entity.decoration.DisplayEntity entity) { return wrapperContained.getBrightnessOverride(entity.wrapperContained); }
// public static int getBrightnessOverride(yarnwrap.entity.decoration.DisplayEntity entity, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getBrightnessOverride(entity.wrapperContained); }

}