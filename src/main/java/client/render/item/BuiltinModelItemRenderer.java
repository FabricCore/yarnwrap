package yarnwrap.client.render.item;
public class BuiltinModelItemRenderer { public net.minecraft.client.render.item.BuiltinModelItemRenderer wrapperContained; public BuiltinModelItemRenderer(net.minecraft.client.render.item.BuiltinModelItemRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map skullModels() { return wrapperContained.skullModels; }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public yarnwrap.block.entity.ChestBlockEntity renderChestNormal() { return new yarnwrap.block.entity.ChestBlockEntity(wrapperContained.renderChestNormal); }
// public yarnwrap.block.entity.EnderChestBlockEntity renderChestEnder() { return new yarnwrap.block.entity.EnderChestBlockEntity(wrapperContained.renderChestEnder); }
// public yarnwrap.block.entity.ChestBlockEntity renderChestTrapped() { return new yarnwrap.block.entity.ChestBlockEntity(wrapperContained.renderChestTrapped); }
// public yarnwrap.block.entity.ConduitBlockEntity renderConduit() { return new yarnwrap.block.entity.ConduitBlockEntity(wrapperContained.renderConduit); }
// public yarnwrap.client.render.entity.model.ShieldEntityModel modelShield() { return new yarnwrap.client.render.entity.model.ShieldEntityModel(wrapperContained.modelShield); }
// public net.minecraft.block.entity.ShulkerBoxBlockEntity[] RENDER_SHULKER_BOX_DYED() { return wrapperContained.RENDER_SHULKER_BOX_DYED; }
// public yarnwrap.block.entity.BedBlockEntity renderBed() { return new yarnwrap.block.entity.BedBlockEntity(wrapperContained.renderBed); }
// public yarnwrap.block.entity.BannerBlockEntity renderBanner() { return new yarnwrap.block.entity.BannerBlockEntity(wrapperContained.renderBanner); }
// public yarnwrap.block.entity.ShulkerBoxBlockEntity RENDER_SHULKER_BOX() { return new yarnwrap.block.entity.ShulkerBoxBlockEntity(wrapperContained.RENDER_SHULKER_BOX); }
// public yarnwrap.client.render.entity.model.TridentEntityModel modelTrident() { return new yarnwrap.client.render.entity.model.TridentEntityModel(wrapperContained.modelTrident); }
// public yarnwrap.block.entity.DecoratedPotBlockEntity renderDecoratedPot() { return new yarnwrap.block.entity.DecoratedPotBlockEntity(wrapperContained.renderDecoratedPot); }
public void render(yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode mode,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.render(stack.wrapperContained,mode.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }

}