package yarnwrap.client.render.model;
public class ModelTextures { public net.minecraft.client.render.model.ModelTextures wrapperContained; public ModelTextures(net.minecraft.client.render.model.ModelTextures wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.ModelTextures EMPTY() { return new yarnwrap.client.render.model.ModelTextures(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.model.ModelTextures value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.model.ModelTextures EMPTY() { return new yarnwrap.client.render.model.ModelTextures(net.minecraft.client.render.model.ModelTextures.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.model.ModelTextures value, ) { net.minecraft.client.render.model.ModelTextures.EMPTY = value.wrapperContained; }

// public char TEXTURE_REFERENCE_PREFIX() { return wrapperContained.TEXTURE_REFERENCE_PREFIX; }
// public void TEXTURE_REFERENCE_PREFIX(char value) { wrapperContained.TEXTURE_REFERENCE_PREFIX = value; }
// public static char TEXTURE_REFERENCE_PREFIX() { return net.minecraft.client.render.model.ModelTextures.TEXTURE_REFERENCE_PREFIX; }
// public static void TEXTURE_REFERENCE_PREFIX(char value, ) { net.minecraft.client.render.model.ModelTextures.TEXTURE_REFERENCE_PREFIX = value; }

// public java.util.Map textures() { return wrapperContained.textures; }
// public void textures(java.util.Map value) { wrapperContained.textures = value; }
// public static java.util.Map textures() { return net.minecraft.client.render.model.ModelTextures.textures; }
// public static void textures(java.util.Map value, ) { net.minecraft.client.render.model.ModelTextures.textures = value; }

// public ModelTextures(java.util.Map textures) { this.wrapperContained = new net.minecraft.client.render.model.ModelTextures(textures); }
// public void add(yarnwrap.util.Identifier atlasTexture,java.lang.String textureId,java.lang.String value,Object builder) { wrapperContained.add(atlasTexture.wrapperContained,textureId,value,builder); }
// public static void add(yarnwrap.util.Identifier atlasTexture,java.lang.String textureId,java.lang.String value,Object builder, ) { net.minecraft.client.render.model.ModelTextures.add(atlasTexture.wrapperContained,textureId,value,builder); }
// public Object fromJson(com.google.gson.JsonObject json,yarnwrap.util.Identifier atlasTexture) { return wrapperContained.fromJson(json,atlasTexture.wrapperContained); }
// public static Object fromJson(com.google.gson.JsonObject json,yarnwrap.util.Identifier atlasTexture, ) { return net.minecraft.client.render.model.ModelTextures.fromJson(json,atlasTexture.wrapperContained); }
public yarnwrap.client.util.SpriteIdentifier get(java.lang.String textureId) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.get(textureId)); }
// public static yarnwrap.client.util.SpriteIdentifier get(java.lang.String textureId, ) { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelTextures.get(textureId)); }
// public boolean isTextureReference(java.lang.String textureId) { return wrapperContained.isTextureReference(textureId); }
// public static boolean isTextureReference(java.lang.String textureId, ) { return net.minecraft.client.render.model.ModelTextures.isTextureReference(textureId); }

}