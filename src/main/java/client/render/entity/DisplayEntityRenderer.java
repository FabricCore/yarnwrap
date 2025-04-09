package yarnwrap.client.render.entity;
public class DisplayEntityRenderer { public net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained; public DisplayEntityRenderer(net.minecraft.client.render.entity.DisplayEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher renderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.renderDispatcher); }
// public void render(yarnwrap.entity.decoration.DisplayEntity entity,java.lang.Object data,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int brightness,float lerpProgress) { wrapperContained.render(entity.wrapperContained,data,matrices.wrapperContained,vertexConsumers.wrapperContained,brightness,lerpProgress); }
// public org.joml.Quaternionf getBillboardRotation(Object renderState,yarnwrap.entity.decoration.DisplayEntity entity,float yaw,org.joml.Quaternionf rotation) { return wrapperContained.getBillboardRotation(renderState,entity.wrapperContained,yaw,rotation); }
// public java.lang.Object getData(yarnwrap.entity.decoration.DisplayEntity entity) { return wrapperContained.getData(entity.wrapperContained); }
// public float lerpYaw(yarnwrap.entity.decoration.DisplayEntity entity,float delta) { return wrapperContained.lerpYaw(entity.wrapperContained,delta); }
// public float getBackwardsYaw(yarnwrap.client.render.Camera camera) { return wrapperContained.getBackwardsYaw(camera.wrapperContained); }
// public float lerpPitch(yarnwrap.entity.decoration.DisplayEntity entity,float delta) { return wrapperContained.lerpPitch(entity.wrapperContained,delta); }
// public float getNegatedPitch(yarnwrap.client.render.Camera camera) { return wrapperContained.getNegatedPitch(camera.wrapperContained); }

}