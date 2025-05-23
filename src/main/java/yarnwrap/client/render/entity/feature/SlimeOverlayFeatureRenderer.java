package yarnwrap.client.render.entity.feature;
public class SlimeOverlayFeatureRenderer { public net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer wrapperContained; public SlimeOverlayFeatureRenderer(net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.SlimeEntityModel model() { return new yarnwrap.client.render.entity.model.SlimeEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.SlimeEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.SlimeEntityModel model() { return new yarnwrap.client.render.entity.model.SlimeEntityModel(net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.SlimeEntityModel value, ) { net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer.model = value.wrapperContained; }

public SlimeOverlayFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}