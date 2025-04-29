package yarnwrap.client.render.block.entity;
public class BlockEntityRendererFactory { public net.minecraft.client.render.block.entity.BlockEntityRendererFactory wrapperContained; public BlockEntityRendererFactory(net.minecraft.client.render.block.entity.BlockEntityRendererFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.BlockEntityRenderer create(Object ctx) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(wrapperContained.create(ctx)); }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderer create(Object ctx, ) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(net.minecraft.client.render.block.entity.BlockEntityRendererFactory.create(ctx)); }

}