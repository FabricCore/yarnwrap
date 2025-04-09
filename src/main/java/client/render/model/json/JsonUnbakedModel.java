package yarnwrap.client.render.model.json;
public class JsonUnbakedModel { public net.minecraft.client.render.model.json.JsonUnbakedModel wrapperContained; public JsonUnbakedModel(net.minecraft.client.render.model.json.JsonUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object guiLight() { return wrapperContained.guiLight; }
public java.lang.String PARTICLE_KEY() { return wrapperContained.PARTICLE_KEY; }
// public char TEXTURE_REFERENCE_INITIAL() { return wrapperContained.TEXTURE_REFERENCE_INITIAL; }
// public java.lang.Boolean ambientOcclusion() { return wrapperContained.ambientOcclusion; }
// public java.util.List elements() { return wrapperContained.elements; }
// public yarnwrap.util.Identifier parentId() { return new yarnwrap.util.Identifier(wrapperContained.parentId); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.render.model.BakedQuadFactory QUAD_FACTORY() { return new yarnwrap.client.render.model.BakedQuadFactory(wrapperContained.QUAD_FACTORY); }
// public yarnwrap.client.render.model.json.ModelTransformation transformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformations); }
// public java.util.Map textureMap() { return wrapperContained.textureMap; }
public java.lang.String id() { return wrapperContained.id; }
// public yarnwrap.client.render.model.json.JsonUnbakedModel parent() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.parent); }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public java.util.List overrides() { return wrapperContained.overrides; }
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

}