package yarnwrap.client.render.entity;
public class DisplayEntityRenderer { public net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained; public DisplayEntityRenderer(net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher renderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.renderDispatcher); }
// public void renderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.renderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher renderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.entity.DisplayEntityRenderer.renderDispatcher); }
// public static void renderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.entity.DisplayEntityRenderer.renderDispatcher = value.wrapperContained; }

// public void render(yarnwrap.entity.decoration.DisplayEntity entity,java.lang.Object data,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int brightness,float lerpProgress) { wrapperContained.render(entity.wrapperContained,data,matrices.wrapperContained,vertexConsumers.wrapperContained,brightness,lerpProgress); }
// public static void render(yarnwrap.entity.decoration.DisplayEntity entity,java.lang.Object data,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int brightness,float lerpProgress, ) { net.minecraft.client.render.entity.DisplayEntityRenderer.render(entity.wrapperContained,data,matrices.wrapperContained,vertexConsumers.wrapperContained,brightness,lerpProgress); }
// public org.joml.Quaternionf getBillboardRotation(Object renderState,yarnwrap.entity.decoration.DisplayEntity entity,float yaw,org.joml.Quaternionf rotation) { return wrapperContained.getBillboardRotation(renderState,entity.wrapperContained,yaw,rotation); }
// public static org.joml.Quaternionf getBillboardRotation(Object renderState,yarnwrap.entity.decoration.DisplayEntity entity,float yaw,org.joml.Quaternionf rotation, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getBillboardRotation(renderState,entity.wrapperContained,yaw,rotation); }
// public java.lang.Object getData(yarnwrap.entity.decoration.DisplayEntity entity) { return wrapperContained.getData(entity.wrapperContained); }
// public static java.lang.Object getData(yarnwrap.entity.decoration.DisplayEntity entity, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getData(entity.wrapperContained); }
// public float lerpYaw(yarnwrap.entity.decoration.DisplayEntity entity,float delta) { return wrapperContained.lerpYaw(entity.wrapperContained,delta); }
// public static float lerpYaw(yarnwrap.entity.decoration.DisplayEntity entity,float delta, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.lerpYaw(entity.wrapperContained,delta); }
// public float getBackwardsYaw(yarnwrap.client.render.Camera camera) { return wrapperContained.getBackwardsYaw(camera.wrapperContained); }
// public static float getBackwardsYaw(yarnwrap.client.render.Camera camera, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getBackwardsYaw(camera.wrapperContained); }
// public float lerpPitch(yarnwrap.entity.decoration.DisplayEntity entity,float delta) { return wrapperContained.lerpPitch(entity.wrapperContained,delta); }
// public static float lerpPitch(yarnwrap.entity.decoration.DisplayEntity entity,float delta, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.lerpPitch(entity.wrapperContained,delta); }
// public float getNegatedPitch(yarnwrap.client.render.Camera camera) { return wrapperContained.getNegatedPitch(camera.wrapperContained); }
// public static float getNegatedPitch(yarnwrap.client.render.Camera camera, ) { return net.minecraft.client.render.entity.DisplayEntityRenderer.getNegatedPitch(camera.wrapperContained); }

}