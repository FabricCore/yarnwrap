package yarnwrap.client.render.item;
public class BuiltinModelItemRenderer { public net.minecraft.client.render.item.BuiltinModelItemRenderer wrapperContained; public BuiltinModelItemRenderer(net.minecraft.client.render.item.BuiltinModelItemRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map skullModels() { return wrapperContained.skullModels; }
// public void skullModels(java.util.Map value) { wrapperContained.skullModels = value; }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value) { wrapperContained.blockEntityRenderDispatcher = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public void entityModelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value) { wrapperContained.entityModelLoader = value.wrapperContained; }
// public yarnwrap.block.entity.ChestBlockEntity renderChestNormal() { return new yarnwrap.block.entity.ChestBlockEntity(wrapperContained.renderChestNormal); }
// public void renderChestNormal(yarnwrap.block.entity.ChestBlockEntity value) { wrapperContained.renderChestNormal = value.wrapperContained; }
// public yarnwrap.block.entity.EnderChestBlockEntity renderChestEnder() { return new yarnwrap.block.entity.EnderChestBlockEntity(wrapperContained.renderChestEnder); }
// public void renderChestEnder(yarnwrap.block.entity.EnderChestBlockEntity value) { wrapperContained.renderChestEnder = value.wrapperContained; }
// public yarnwrap.block.entity.ChestBlockEntity renderChestTrapped() { return new yarnwrap.block.entity.ChestBlockEntity(wrapperContained.renderChestTrapped); }
// public void renderChestTrapped(yarnwrap.block.entity.ChestBlockEntity value) { wrapperContained.renderChestTrapped = value.wrapperContained; }
// public yarnwrap.block.entity.ConduitBlockEntity renderConduit() { return new yarnwrap.block.entity.ConduitBlockEntity(wrapperContained.renderConduit); }
// public void renderConduit(yarnwrap.block.entity.ConduitBlockEntity value) { wrapperContained.renderConduit = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.ShieldEntityModel modelShield() { return new yarnwrap.client.render.entity.model.ShieldEntityModel(wrapperContained.modelShield); }
// public void modelShield(yarnwrap.client.render.entity.model.ShieldEntityModel value) { wrapperContained.modelShield = value.wrapperContained; }
// public net.minecraft.block.entity.ShulkerBoxBlockEntity[] RENDER_SHULKER_BOX_DYED() { return wrapperContained.RENDER_SHULKER_BOX_DYED; }
// public void RENDER_SHULKER_BOX_DYED(net.minecraft.block.entity.ShulkerBoxBlockEntity[] value) { wrapperContained.RENDER_SHULKER_BOX_DYED = value; }
// public yarnwrap.block.entity.BedBlockEntity renderBed() { return new yarnwrap.block.entity.BedBlockEntity(wrapperContained.renderBed); }
// public void renderBed(yarnwrap.block.entity.BedBlockEntity value) { wrapperContained.renderBed = value.wrapperContained; }
// public yarnwrap.block.entity.BannerBlockEntity renderBanner() { return new yarnwrap.block.entity.BannerBlockEntity(wrapperContained.renderBanner); }
// public void renderBanner(yarnwrap.block.entity.BannerBlockEntity value) { wrapperContained.renderBanner = value.wrapperContained; }
// public yarnwrap.block.entity.ShulkerBoxBlockEntity RENDER_SHULKER_BOX() { return new yarnwrap.block.entity.ShulkerBoxBlockEntity(wrapperContained.RENDER_SHULKER_BOX); }
// public void RENDER_SHULKER_BOX(yarnwrap.block.entity.ShulkerBoxBlockEntity value) { wrapperContained.RENDER_SHULKER_BOX = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.TridentEntityModel modelTrident() { return new yarnwrap.client.render.entity.model.TridentEntityModel(wrapperContained.modelTrident); }
// public void modelTrident(yarnwrap.client.render.entity.model.TridentEntityModel value) { wrapperContained.modelTrident = value.wrapperContained; }
// public yarnwrap.block.entity.DecoratedPotBlockEntity renderDecoratedPot() { return new yarnwrap.block.entity.DecoratedPotBlockEntity(wrapperContained.renderDecoratedPot); }
// public void renderDecoratedPot(yarnwrap.block.entity.DecoratedPotBlockEntity value) { wrapperContained.renderDecoratedPot = value.wrapperContained; }
public BuiltinModelItemRenderer(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher,yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader) { this.wrapperContained = new net.minecraft.client.render.item.BuiltinModelItemRenderer(blockEntityRenderDispatcher.wrapperContained,entityModelLoader.wrapperContained); }
public void render(yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode mode,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.render(stack.wrapperContained,mode.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public yarnwrap.block.entity.ShulkerBoxBlockEntity method_32132(yarnwrap.util.DyeColor color) { return new yarnwrap.block.entity.ShulkerBoxBlockEntity(wrapperContained.method_32132(color.wrapperContained)); }
// public void method_57795(yarnwrap.item.ItemStack profile) { wrapperContained.method_57795(profile.wrapperContained); }

}