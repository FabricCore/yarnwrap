package yarnwrap.client.render.model;
public class BakedSimpleModel { public net.minecraft.client.render.model.BakedSimpleModel wrapperContained; public BakedSimpleModel(net.minecraft.client.render.model.BakedSimpleModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean DEFAULT_AMBIENT_OCCLUSION() { return wrapperContained.DEFAULT_AMBIENT_OCCLUSION; }
// public void DEFAULT_AMBIENT_OCCLUSION(boolean value) { wrapperContained.DEFAULT_AMBIENT_OCCLUSION = value; }
public static boolean DEFAULT_AMBIENT_OCCLUSION() { return net.minecraft.client.render.model.BakedSimpleModel.DEFAULT_AMBIENT_OCCLUSION; }
// public static void DEFAULT_AMBIENT_OCCLUSION(boolean value, ) { net.minecraft.client.render.model.BakedSimpleModel.DEFAULT_AMBIENT_OCCLUSION = value; }

// public Object DEFAULT_GUI_LIGHT() { return wrapperContained.DEFAULT_GUI_LIGHT; }
// // public void DEFAULT_GUI_LIGHT(Object value) { wrapperContained.DEFAULT_GUI_LIGHT = value; }
// public static Object DEFAULT_GUI_LIGHT() { return net.minecraft.client.render.model.BakedSimpleModel.DEFAULT_GUI_LIGHT; }
// // public static void DEFAULT_GUI_LIGHT(Object value, ) { net.minecraft.client.render.model.BakedSimpleModel.DEFAULT_GUI_LIGHT = value; }

public yarnwrap.client.render.model.UnbakedModel getModel() { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.getModel()); }
// public static yarnwrap.client.render.model.UnbakedModel getModel() { return new yarnwrap.client.render.model.UnbakedModel(net.minecraft.client.render.model.BakedSimpleModel.getModel()); }
public yarnwrap.client.texture.Sprite getParticleTexture(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker) { return new yarnwrap.client.texture.Sprite(wrapperContained.getParticleTexture(textures.wrapperContained,baker.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getParticleTexture(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BakedSimpleModel.getParticleTexture(textures.wrapperContained,baker.wrapperContained)); }
public yarnwrap.client.render.model.BakedGeometry bakeGeometry(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.ModelBakeSettings settings) { return new yarnwrap.client.render.model.BakedGeometry(wrapperContained.bakeGeometry(textures.wrapperContained,baker.wrapperContained,settings.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedGeometry bakeGeometry(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.ModelBakeSettings settings, ) { return new yarnwrap.client.render.model.BakedGeometry(net.minecraft.client.render.model.BakedSimpleModel.bakeGeometry(textures.wrapperContained,baker.wrapperContained,settings.wrapperContained)); }
public yarnwrap.client.render.model.BakedSimpleModel getParent() { return new yarnwrap.client.render.model.BakedSimpleModel(wrapperContained.getParent()); }
// public static yarnwrap.client.render.model.BakedSimpleModel getParent() { return new yarnwrap.client.render.model.BakedSimpleModel(net.minecraft.client.render.model.BakedSimpleModel.getParent()); }
public boolean getAmbientOcclusion() { return wrapperContained.getAmbientOcclusion(); }
// public static boolean getAmbientOcclusion() { return net.minecraft.client.render.model.BakedSimpleModel.getAmbientOcclusion(); }
public Object getGuiLight() { return wrapperContained.getGuiLight(); }
// public static Object getGuiLight() { return net.minecraft.client.render.model.BakedSimpleModel.getGuiLight(); }
public yarnwrap.client.render.model.json.ModelTransformation getTransformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.getTransformations()); }
// public static yarnwrap.client.render.model.json.ModelTransformation getTransformations() { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.BakedSimpleModel.getTransformations()); }
public yarnwrap.client.render.model.Geometry getGeometry() { return new yarnwrap.client.render.model.Geometry(wrapperContained.getGeometry()); }
// public static yarnwrap.client.render.model.Geometry getGeometry() { return new yarnwrap.client.render.model.Geometry(net.minecraft.client.render.model.BakedSimpleModel.getGeometry()); }
public yarnwrap.client.render.model.ModelTextures getTextures() { return new yarnwrap.client.render.model.ModelTextures(wrapperContained.getTextures()); }
// public static yarnwrap.client.render.model.ModelTextures getTextures() { return new yarnwrap.client.render.model.ModelTextures(net.minecraft.client.render.model.BakedSimpleModel.getTextures()); }
// public yarnwrap.client.texture.Sprite getParticleTexture(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.SimpleModel model) { return new yarnwrap.client.texture.Sprite(wrapperContained.getParticleTexture(textures.wrapperContained,baker.wrapperContained,model.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getParticleTexture(yarnwrap.client.render.model.ModelTextures textures,yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.SimpleModel model, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BakedSimpleModel.getParticleTexture(textures.wrapperContained,baker.wrapperContained,model.wrapperContained)); }
// public yarnwrap.client.render.model.ModelTextures getTextures(yarnwrap.client.render.model.BakedSimpleModel model) { return new yarnwrap.client.render.model.ModelTextures(wrapperContained.getTextures(model.wrapperContained)); }
// public static yarnwrap.client.render.model.ModelTextures getTextures(yarnwrap.client.render.model.BakedSimpleModel model, ) { return new yarnwrap.client.render.model.ModelTextures(net.minecraft.client.render.model.BakedSimpleModel.getTextures(model.wrapperContained)); }
// public yarnwrap.client.render.model.json.Transformation extractTransformation(yarnwrap.client.render.model.BakedSimpleModel model,yarnwrap.item.ItemDisplayContext mode) { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.extractTransformation(model.wrapperContained,mode.wrapperContained)); }
// public static yarnwrap.client.render.model.json.Transformation extractTransformation(yarnwrap.client.render.model.BakedSimpleModel model,yarnwrap.item.ItemDisplayContext mode, ) { return new yarnwrap.client.render.model.json.Transformation(net.minecraft.client.render.model.BakedSimpleModel.extractTransformation(model.wrapperContained,mode.wrapperContained)); }
// public boolean getAmbientOcclusion(yarnwrap.client.render.model.BakedSimpleModel model) { return wrapperContained.getAmbientOcclusion(model.wrapperContained); }
// public static boolean getAmbientOcclusion(yarnwrap.client.render.model.BakedSimpleModel model, ) { return net.minecraft.client.render.model.BakedSimpleModel.getAmbientOcclusion(model.wrapperContained); }
// public Object getGuiLight(yarnwrap.client.render.model.BakedSimpleModel model) { return wrapperContained.getGuiLight(model.wrapperContained); }
// public static Object getGuiLight(yarnwrap.client.render.model.BakedSimpleModel model, ) { return net.minecraft.client.render.model.BakedSimpleModel.getGuiLight(model.wrapperContained); }
// public yarnwrap.client.render.model.Geometry getGeometry(yarnwrap.client.render.model.BakedSimpleModel model) { return new yarnwrap.client.render.model.Geometry(wrapperContained.getGeometry(model.wrapperContained)); }
// public static yarnwrap.client.render.model.Geometry getGeometry(yarnwrap.client.render.model.BakedSimpleModel model, ) { return new yarnwrap.client.render.model.Geometry(net.minecraft.client.render.model.BakedSimpleModel.getGeometry(model.wrapperContained)); }
// public yarnwrap.client.render.model.json.ModelTransformation copyTransformations(yarnwrap.client.render.model.BakedSimpleModel model) { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.copyTransformations(model.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelTransformation copyTransformations(yarnwrap.client.render.model.BakedSimpleModel model, ) { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.BakedSimpleModel.copyTransformations(model.wrapperContained)); }

}