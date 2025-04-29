package yarnwrap.client.render.block.entity;
public class BlockEntityRenderer { public net.minecraft.client.render.block.entity.BlockEntityRenderer wrapperContained; public BlockEntityRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isInRenderDistance(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.util.math.Vec3d pos) { return wrapperContained.isInRenderDistance(blockEntity.wrapperContained,pos.wrapperContained); }
// public static boolean isInRenderDistance(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.client.render.block.entity.BlockEntityRenderer.isInRenderDistance(blockEntity.wrapperContained,pos.wrapperContained); }
public int getRenderDistance() { return wrapperContained.getRenderDistance(); }
// public static int getRenderDistance() { return net.minecraft.client.render.block.entity.BlockEntityRenderer.getRenderDistance(); }
public boolean rendersOutsideBoundingBox(yarnwrap.block.entity.BlockEntity blockEntity) { return wrapperContained.rendersOutsideBoundingBox(blockEntity.wrapperContained); }
// public static boolean rendersOutsideBoundingBox(yarnwrap.block.entity.BlockEntity blockEntity, ) { return net.minecraft.client.render.block.entity.BlockEntityRenderer.rendersOutsideBoundingBox(blockEntity.wrapperContained); }
public void render(yarnwrap.block.entity.BlockEntity entity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.render(entity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public static void render(yarnwrap.block.entity.BlockEntity entity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay, ) { net.minecraft.client.render.block.entity.BlockEntityRenderer.render(entity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }

}