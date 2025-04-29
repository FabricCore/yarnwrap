package yarnwrap.client.render.model;
public class BuiltinBakedModel { public net.minecraft.client.render.model.BuiltinBakedModel wrapperContained; public BuiltinBakedModel(net.minecraft.client.render.model.BuiltinBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BuiltinBakedModel.sprite); }
// public static void sprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.model.BuiltinBakedModel.sprite = value.wrapperContained; }

// public boolean sideLit() { return wrapperContained.sideLit; }
// public void sideLit(boolean value) { wrapperContained.sideLit = value; }
// public static boolean sideLit() { return net.minecraft.client.render.model.BuiltinBakedModel.sideLit; }
// public static void sideLit(boolean value, ) { net.minecraft.client.render.model.BuiltinBakedModel.sideLit = value; }

// public yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformation); }
// public void transformation(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.transformation = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.BuiltinBakedModel.transformation); }
// public static void transformation(yarnwrap.client.render.model.json.ModelTransformation value, ) { net.minecraft.client.render.model.BuiltinBakedModel.transformation = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.itemPropertyOverrides); }
// public void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.itemPropertyOverrides = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(net.minecraft.client.render.model.BuiltinBakedModel.itemPropertyOverrides); }
// public static void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value, ) { net.minecraft.client.render.model.BuiltinBakedModel.itemPropertyOverrides = value.wrapperContained; }

public BuiltinBakedModel(yarnwrap.client.render.model.json.ModelTransformation transformation,yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides,yarnwrap.client.texture.Sprite sprite,boolean sideLit) { this.wrapperContained = new net.minecraft.client.render.model.BuiltinBakedModel(transformation.wrapperContained,itemPropertyOverrides.wrapperContained,sprite.wrapperContained,sideLit); }

}