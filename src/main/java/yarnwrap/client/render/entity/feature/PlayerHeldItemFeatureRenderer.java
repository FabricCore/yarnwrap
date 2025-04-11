package yarnwrap.client.render.entity.feature;
public class PlayerHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.PlayerHeldItemFeatureRenderer wrapperContained; public PlayerHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.PlayerHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float HEAD_YAW() { return wrapperContained.HEAD_YAW; }
// public void HEAD_YAW(float value) { wrapperContained.HEAD_YAW = value; }
// public float HEAD_ROLL() { return wrapperContained.HEAD_ROLL; }
// public void HEAD_ROLL(float value) { wrapperContained.HEAD_ROLL = value; }
// public yarnwrap.client.render.item.HeldItemRenderer playerHeldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.playerHeldItemRenderer); }
// public void playerHeldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.playerHeldItemRenderer = value.wrapperContained; }
// public void renderSpyglass(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.util.Arm arm,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderSpyglass(entity.wrapperContained,stack.wrapperContained,arm.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }

}