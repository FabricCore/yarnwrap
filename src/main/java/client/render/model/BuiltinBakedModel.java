package yarnwrap.client.render.model;
public class BuiltinBakedModel { public net.minecraft.client.render.model.BuiltinBakedModel wrapperContained; public BuiltinBakedModel(net.minecraft.client.render.model.BuiltinBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public boolean sideLit() { return wrapperContained.sideLit; }
// public yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformation); }
// public yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.itemPropertyOverrides); }

}