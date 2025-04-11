package yarnwrap.client.render.block.entity;
public class StructureBlockBlockEntityRenderer { public net.minecraft.client.render.block.entity.StructureBlockBlockEntityRenderer wrapperContained; public StructureBlockBlockEntityRenderer(net.minecraft.client.render.block.entity.StructureBlockBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public StructureBlockBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.StructureBlockBlockEntityRenderer(ctx); }
// public void renderInvisibleBlocks(yarnwrap.block.entity.StructureBlockBlockEntity entity,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderInvisibleBlocks(entity.wrapperContained,vertexConsumers.wrapperContained,matrices.wrapperContained); }
// public void method_61047(yarnwrap.block.entity.StructureBlockBlockEntity entity,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.method_61047(entity.wrapperContained,vertexConsumer.wrapperContained,matrices.wrapperContained); }
// public void method_61048(yarnwrap.util.math.BlockPos direction,yarnwrap.util.math.BlockPos x,yarnwrap.client.util.math.MatrixStack y,yarnwrap.client.render.VertexConsumer z) { wrapperContained.method_61048(direction.wrapperContained,x.wrapperContained,y.wrapperContained,z.wrapperContained); }

}