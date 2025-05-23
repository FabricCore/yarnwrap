package yarnwrap.client.render.block.entity;
public class LoadedBlockEntityModels { public net.minecraft.client.render.block.entity.LoadedBlockEntityModels wrapperContained; public LoadedBlockEntityModels(net.minecraft.client.render.block.entity.LoadedBlockEntityModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.LoadedBlockEntityModels EMPTY() { return new yarnwrap.client.render.block.entity.LoadedBlockEntityModels(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.block.entity.LoadedBlockEntityModels value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.block.entity.LoadedBlockEntityModels EMPTY() { return new yarnwrap.client.render.block.entity.LoadedBlockEntityModels(net.minecraft.client.render.block.entity.LoadedBlockEntityModels.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.block.entity.LoadedBlockEntityModels value, ) { net.minecraft.client.render.block.entity.LoadedBlockEntityModels.EMPTY = value.wrapperContained; }

// public java.util.Map renderers() { return wrapperContained.renderers; }
// public void renderers(java.util.Map value) { wrapperContained.renderers = value; }
// public static java.util.Map renderers() { return net.minecraft.client.render.block.entity.LoadedBlockEntityModels.renderers; }
// public static void renderers(java.util.Map value, ) { net.minecraft.client.render.block.entity.LoadedBlockEntityModels.renderers = value; }

public LoadedBlockEntityModels(java.util.Map renderers) { this.wrapperContained = new net.minecraft.client.render.block.entity.LoadedBlockEntityModels(renderers); }
public void render(yarnwrap.block.Block block,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.render(block.wrapperContained,displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public static void render(yarnwrap.block.Block block,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay, ) { net.minecraft.client.render.block.entity.LoadedBlockEntityModels.render(block.wrapperContained,displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public yarnwrap.client.render.block.entity.LoadedBlockEntityModels fromModels(yarnwrap.client.render.entity.model.LoadedEntityModels models) { return new yarnwrap.client.render.block.entity.LoadedBlockEntityModels(wrapperContained.fromModels(models.wrapperContained)); }
// public static yarnwrap.client.render.block.entity.LoadedBlockEntityModels fromModels(yarnwrap.client.render.entity.model.LoadedEntityModels models, ) { return new yarnwrap.client.render.block.entity.LoadedBlockEntityModels(net.minecraft.client.render.block.entity.LoadedBlockEntityModels.fromModels(models.wrapperContained)); }

}