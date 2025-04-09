package yarnwrap.client.render.block.entity;
public class BedBlockEntityRenderer { public net.minecraft.client.render.block.entity.BedBlockEntityRenderer wrapperContained; public BedBlockEntityRenderer(net.minecraft.client.render.block.entity.BedBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bedHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.bedHead); }
// public yarnwrap.client.model.ModelPart bedFoot() { return new yarnwrap.client.model.ModelPart(wrapperContained.bedFoot); }
public yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getHeadTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getFootTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getFootTexturedModelData()); }
// public void renderPart(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.model.ModelPart part,yarnwrap.util.math.Direction direction,yarnwrap.client.util.SpriteIdentifier sprite,int light,int overlay,boolean isFoot) { wrapperContained.renderPart(matrices.wrapperContained,vertexConsumers.wrapperContained,part.wrapperContained,direction.wrapperContained,sprite.wrapperContained,light,overlay,isFoot); }

}