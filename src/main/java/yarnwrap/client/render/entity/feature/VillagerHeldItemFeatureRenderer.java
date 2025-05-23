package yarnwrap.client.render.entity.feature;
public class VillagerHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained; public VillagerHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public VillagerHeldItemFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context) { this.wrapperContained = new net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer(context.wrapperContained); }
// public void applyTransforms(yarnwrap.client.render.entity.state.ItemHolderEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.applyTransforms(state.wrapperContained,matrices.wrapperContained); }
// public static void applyTransforms(yarnwrap.client.render.entity.state.ItemHolderEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer.applyTransforms(state.wrapperContained,matrices.wrapperContained); }

}