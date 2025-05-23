package yarnwrap.client.render.block.entity;
public class BlockEntityRenderer { public net.minecraft.client.render.block.entity.BlockEntityRenderer wrapperContained; public BlockEntityRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rendersOutsideBoundingBox() { return wrapperContained.rendersOutsideBoundingBox(); }
// public static boolean rendersOutsideBoundingBox() { return net.minecraft.client.render.block.entity.BlockEntityRenderer.rendersOutsideBoundingBox(); }
public void render(yarnwrap.block.entity.BlockEntity entity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.util.math.Vec3d cameraPos) { wrapperContained.render(entity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,cameraPos.wrapperContained); }
// public static void render(yarnwrap.block.entity.BlockEntity entity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.util.math.Vec3d cameraPos, ) { net.minecraft.client.render.block.entity.BlockEntityRenderer.render(entity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,cameraPos.wrapperContained); }
public boolean isInRenderDistance(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.util.math.Vec3d pos) { return wrapperContained.isInRenderDistance(blockEntity.wrapperContained,pos.wrapperContained); }
// public static boolean isInRenderDistance(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.client.render.block.entity.BlockEntityRenderer.isInRenderDistance(blockEntity.wrapperContained,pos.wrapperContained); }
public int getRenderDistance() { return wrapperContained.getRenderDistance(); }
// public static int getRenderDistance() { return net.minecraft.client.render.block.entity.BlockEntityRenderer.getRenderDistance(); }

}