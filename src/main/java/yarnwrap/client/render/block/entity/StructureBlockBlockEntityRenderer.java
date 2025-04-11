package yarnwrap.client.render.block.entity;
public class StructureBlockBlockEntityRenderer { public net.minecraft.client.render.block.entity.StructureBlockBlockEntityRenderer wrapperContained; public StructureBlockBlockEntityRenderer(net.minecraft.client.render.block.entity.StructureBlockBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public void renderInvisibleBlocks(yarnwrap.block.entity.StructureBlockBlockEntity entity,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderInvisibleBlocks(entity.wrapperContained,vertexConsumers.wrapperContained,matrices.wrapperContained); }

}