package yarnwrap.client.render.entity.feature;
public class SheepWoolFeatureRenderer { public net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained; public SheepWoolFeatureRenderer(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.SheepWoolEntityModel model() { return new yarnwrap.client.render.entity.model.SheepWoolEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.SheepWoolEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }

}