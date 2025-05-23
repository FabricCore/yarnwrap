package yarnwrap.client.render.block.entity;
public class BedBlockEntityRenderer { public net.minecraft.client.render.block.entity.BedBlockEntityRenderer wrapperContained; public BedBlockEntityRenderer(net.minecraft.client.render.block.entity.BedBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.Model bedHead() { return new yarnwrap.client.model.Model(wrapperContained.bedHead); }
// public void bedHead(yarnwrap.client.model.Model value) { wrapperContained.bedHead = value.wrapperContained; }
// public static yarnwrap.client.model.Model bedHead() { return new yarnwrap.client.model.Model(net.minecraft.client.render.block.entity.BedBlockEntityRenderer.bedHead); }
// public static void bedHead(yarnwrap.client.model.Model value, ) { net.minecraft.client.render.block.entity.BedBlockEntityRenderer.bedHead = value.wrapperContained; }

// public yarnwrap.client.model.Model bedFoot() { return new yarnwrap.client.model.Model(wrapperContained.bedFoot); }
// public void bedFoot(yarnwrap.client.model.Model value) { wrapperContained.bedFoot = value.wrapperContained; }
// public static yarnwrap.client.model.Model bedFoot() { return new yarnwrap.client.model.Model(net.minecraft.client.render.block.entity.BedBlockEntityRenderer.bedFoot); }
// public static void bedFoot(yarnwrap.client.model.Model value, ) { net.minecraft.client.render.block.entity.BedBlockEntityRenderer.bedFoot = value.wrapperContained; }

public BedBlockEntityRenderer(yarnwrap.client.render.entity.model.LoadedEntityModels models) { this.wrapperContained = new net.minecraft.client.render.block.entity.BedBlockEntityRenderer(models.wrapperContained); }
// public BedBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.BedBlockEntityRenderer(ctx); }
// public void renderPart(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.model.Model model,yarnwrap.util.math.Direction direction,yarnwrap.client.util.SpriteIdentifier sprite,int light,int overlay,boolean isFoot) { wrapperContained.renderPart(matrices.wrapperContained,vertexConsumers.wrapperContained,model.wrapperContained,direction.wrapperContained,sprite.wrapperContained,light,overlay,isFoot); }
// public static void renderPart(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.model.Model model,yarnwrap.util.math.Direction direction,yarnwrap.client.util.SpriteIdentifier sprite,int light,int overlay,boolean isFoot, ) { net.minecraft.client.render.block.entity.BedBlockEntityRenderer.renderPart(matrices.wrapperContained,vertexConsumers.wrapperContained,model.wrapperContained,direction.wrapperContained,sprite.wrapperContained,light,overlay,isFoot); }
// public boolean method_24188(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_24188(world.wrapperContained,pos.wrapperContained); }
// public static boolean method_24188(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.block.entity.BedBlockEntityRenderer.method_24188(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getHeadTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.BedBlockEntityRenderer.getHeadTexturedModelData()); }
// public yarnwrap.client.model.TexturedModelData getFootTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getFootTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getFootTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.BedBlockEntityRenderer.getFootTexturedModelData()); }
public void renderAsItem(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.util.SpriteIdentifier textureId) { wrapperContained.renderAsItem(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,textureId.wrapperContained); }
// public static void renderAsItem(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.util.SpriteIdentifier textureId, ) { net.minecraft.client.render.block.entity.BedBlockEntityRenderer.renderAsItem(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,textureId.wrapperContained); }

}