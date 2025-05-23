package yarnwrap.client.render.item.model.special;
public class DecoratedPotModelRenderer { public net.minecraft.client.render.item.model.special.DecoratedPotModelRenderer wrapperContained; public DecoratedPotModelRenderer(net.minecraft.client.render.item.model.special.DecoratedPotModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer(wrapperContained.blockEntityRenderer); }
// public void blockEntityRenderer(yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer value) { wrapperContained.blockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer(net.minecraft.client.render.item.model.special.DecoratedPotModelRenderer.blockEntityRenderer); }
// public static void blockEntityRenderer(yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer value, ) { net.minecraft.client.render.item.model.special.DecoratedPotModelRenderer.blockEntityRenderer = value.wrapperContained; }

public DecoratedPotModelRenderer(yarnwrap.client.render.block.entity.DecoratedPotBlockEntityRenderer blockEntityRenderer) { this.wrapperContained = new net.minecraft.client.render.item.model.special.DecoratedPotModelRenderer(blockEntityRenderer.wrapperContained); }

}