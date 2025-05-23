package yarnwrap.client.render.entity.feature;
public class TridentRiptideFeatureRenderer { public net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained; public TridentRiptideFeatureRenderer(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.TridentRiptideEntityModel model() { return new yarnwrap.client.render.entity.model.TridentRiptideEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.TridentRiptideEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.TridentRiptideEntityModel model() { return new yarnwrap.client.render.entity.model.TridentRiptideEntityModel(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.TridentRiptideEntityModel value, ) { net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.model = value.wrapperContained; }

public TridentRiptideFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels entityModels) { this.wrapperContained = new net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer(context.wrapperContained,entityModels.wrapperContained); }

}