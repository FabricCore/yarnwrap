package yarnwrap.client.render.entity.feature;
public class HeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer wrapperContained; public HeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
// public void renderItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.json.ModelTransformationMode transformationMode,yarnwrap.util.Arm arm,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderItem(entity.wrapperContained,stack.wrapperContained,transformationMode.wrapperContained,arm.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }

}