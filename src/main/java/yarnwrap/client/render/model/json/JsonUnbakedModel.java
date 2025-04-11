package yarnwrap.client.render.model.json;
public class JsonUnbakedModel { public net.minecraft.client.render.model.json.JsonUnbakedModel wrapperContained; public JsonUnbakedModel(net.minecraft.client.render.model.json.JsonUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object guiLight() { return wrapperContained.guiLight; }
// // public void guiLight(Object value) { wrapperContained.guiLight = value; }
public java.lang.String PARTICLE_KEY() { return wrapperContained.PARTICLE_KEY; }
// public void PARTICLE_KEY(java.lang.String value) { wrapperContained.PARTICLE_KEY = value; }
// public char TEXTURE_REFERENCE_INITIAL() { return wrapperContained.TEXTURE_REFERENCE_INITIAL; }
// public void TEXTURE_REFERENCE_INITIAL(char value) { wrapperContained.TEXTURE_REFERENCE_INITIAL = value; }
// public java.lang.Boolean ambientOcclusion() { return wrapperContained.ambientOcclusion; }
// public void ambientOcclusion(java.lang.Boolean value) { wrapperContained.ambientOcclusion = value; }
// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public yarnwrap.util.Identifier parentId() { return new yarnwrap.util.Identifier(wrapperContained.parentId); }
// public void parentId(yarnwrap.util.Identifier value) { wrapperContained.parentId = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.render.model.BakedQuadFactory QUAD_FACTORY() { return new yarnwrap.client.render.model.BakedQuadFactory(wrapperContained.QUAD_FACTORY); }
// public void QUAD_FACTORY(yarnwrap.client.render.model.BakedQuadFactory value) { wrapperContained.QUAD_FACTORY = value.wrapperContained; }
// public yarnwrap.client.render.model.json.ModelTransformation transformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformations); }
// public void transformations(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.transformations = value.wrapperContained; }
// public java.util.Map textureMap() { return wrapperContained.textureMap; }
// public void textureMap(java.util.Map value) { wrapperContained.textureMap = value; }
public java.lang.String id() { return wrapperContained.id; }
public void id(java.lang.String value) { wrapperContained.id = value; }
// public yarnwrap.client.render.model.json.JsonUnbakedModel parent() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.parent); }
// public void parent(yarnwrap.client.render.model.json.JsonUnbakedModel value) { wrapperContained.parent = value.wrapperContained; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public java.util.List overrides() { return wrapperContained.overrides; }
// public void overrides(java.util.List value) { wrapperContained.overrides = value; }
// public JsonUnbakedModel(yarnwrap.util.Identifier parentId,java.util.List elements,java.util.Map textureMap,java.lang.Boolean ambientOcclusion,Object guiLight,yarnwrap.client.render.model.json.ModelTransformation transformations,java.util.List overrides) { this.wrapperContained = new net.minecraft.client.render.model.json.JsonUnbakedModel(parentId.wrapperContained,elements,textureMap,ambientOcclusion,guiLight,transformations.wrapperContained,overrides); }
public yarnwrap.client.util.SpriteIdentifier resolveSprite(java.lang.String spriteName) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.resolveSprite(spriteName)); }
public Object getGuiLight() { return wrapperContained.getGuiLight(); }
public yarnwrap.client.render.model.json.JsonUnbakedModel deserialize(java.lang.String json) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.deserialize(json)); }
public yarnwrap.client.render.model.json.JsonUnbakedModel getRootModel() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.getRootModel()); }
public boolean textureExists(java.lang.String name) { return wrapperContained.textureExists(name); }
public java.util.List getElements() { return wrapperContained.getElements(); }
public java.util.List getOverrides() { return wrapperContained.getOverrides(); }
public yarnwrap.client.render.model.json.JsonUnbakedModel deserialize(java.io.Reader input) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.deserialize(input)); }
// public yarnwrap.client.render.model.json.Transformation getTransformation(yarnwrap.client.render.model.json.ModelTransformationMode renderMode) { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.getTransformation(renderMode.wrapperContained)); }
// public boolean isTextureReference(java.lang.String reference) { return wrapperContained.isTextureReference(reference); }
// public yarnwrap.client.render.model.json.ModelOverrideList compileOverrides(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent) { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.compileOverrides(baker.wrapperContained,parent.wrapperContained)); }
// public com.mojang.datafixers.util.Either resolveTexture(java.lang.String name) { return wrapperContained.resolveTexture(name); }
public yarnwrap.client.render.model.json.ModelTransformation getTransformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.getTransformations()); }
public boolean useAmbientOcclusion() { return wrapperContained.useAmbientOcclusion(); }
// public yarnwrap.client.render.model.BakedModel bake(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent,java.util.function.Function textureGetter,yarnwrap.client.render.model.ModelBakeSettings settings) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.bake(baker.wrapperContained,parent.wrapperContained,textureGetter,settings.wrapperContained)); }
// public yarnwrap.client.render.model.BakedQuad createQuad(yarnwrap.client.render.model.json.ModelElement element,yarnwrap.client.render.model.json.ModelElementFace elementFace,yarnwrap.client.texture.Sprite sprite,yarnwrap.util.math.Direction side,yarnwrap.client.render.model.ModelBakeSettings settings) { return new yarnwrap.client.render.model.BakedQuad(wrapperContained.createQuad(element.wrapperContained,elementFace.wrapperContained,sprite.wrapperContained,side.wrapperContained,settings.wrapperContained)); }
public boolean needsResolution() { return wrapperContained.needsResolution(); }
// public void method_45786(java.util.function.Function override) { wrapperContained.method_45786(override); }

}