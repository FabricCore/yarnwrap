package yarnwrap.client.render.entity.feature;
public class StuckArrowsFeatureRenderer { public net.minecraft.client.render.entity.feature.StuckArrowsFeatureRenderer wrapperContained; public StuckArrowsFeatureRenderer(net.minecraft.client.render.entity.feature.StuckArrowsFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
// public void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.dispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.entity.feature.StuckArrowsFeatureRenderer.dispatcher); }
// public static void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.entity.feature.StuckArrowsFeatureRenderer.dispatcher = value.wrapperContained; }

// public StuckArrowsFeatureRenderer(Object context,yarnwrap.client.render.entity.LivingEntityRenderer entityRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.StuckArrowsFeatureRenderer(context,entityRenderer.wrapperContained); }

}