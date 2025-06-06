package yarnwrap.data.client;
public class Model { public net.minecraft.data.client.Model wrapperContained; public Model(net.minecraft.data.client.Model wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional parent() { return wrapperContained.parent; }
// public void parent(java.util.Optional value) { wrapperContained.parent = value; }
// public static java.util.Optional parent() { return net.minecraft.data.client.Model.parent; }
// public static void parent(java.util.Optional value, ) { net.minecraft.data.client.Model.parent = value; }

// public java.util.Set requiredTextures() { return wrapperContained.requiredTextures; }
// public void requiredTextures(java.util.Set value) { wrapperContained.requiredTextures = value; }
// public static java.util.Set requiredTextures() { return net.minecraft.data.client.Model.requiredTextures; }
// public static void requiredTextures(java.util.Set value, ) { net.minecraft.data.client.Model.requiredTextures = value; }

// public java.util.Optional variant() { return wrapperContained.variant; }
// public void variant(java.util.Optional value) { wrapperContained.variant = value; }
// public static java.util.Optional variant() { return net.minecraft.data.client.Model.variant; }
// public static void variant(java.util.Optional value, ) { net.minecraft.data.client.Model.variant = value; }

public Model(java.util.Optional parent,java.util.Optional variant,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { this.wrapperContained = new net.minecraft.data.client.Model(parent,variant,requiredTextureKeys); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.block.Block block,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.upload(block.wrapperContained,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.upload(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public java.util.Map createTextureMap(yarnwrap.data.client.TextureMap textures) { return wrapperContained.createTextureMap(textures.wrapperContained); }
// public static java.util.Map createTextureMap(yarnwrap.data.client.TextureMap textures, ) { return net.minecraft.data.client.Model.createTextureMap(textures.wrapperContained); }
public yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(id.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.upload(id.wrapperContained,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier uploadWithoutVariant(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.uploadWithoutVariant(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier uploadWithoutVariant(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.uploadWithoutVariant(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
public com.google.gson.JsonObject createJson(yarnwrap.util.Identifier id,java.util.Map textures) { return wrapperContained.createJson(id.wrapperContained,textures); }
// public static com.google.gson.JsonObject createJson(yarnwrap.util.Identifier id,java.util.Map textures, ) { return net.minecraft.data.client.Model.createJson(id.wrapperContained,textures); }
// // public yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector,Object jsonFactory) { return new yarnwrap.util.Identifier(wrapperContained.upload(id.wrapperContained,textures.wrapperContained,modelCollector,jsonFactory)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector,Object jsonFactory, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.upload(id.wrapperContained,textures.wrapperContained,modelCollector,jsonFactory)); }
// public void method_48526(com.google.gson.JsonObject parent) { wrapperContained.method_48526(parent); }
// public static void method_48526(com.google.gson.JsonObject parent, ) { net.minecraft.data.client.Model.method_48526(parent); }
// public void method_48527(com.google.gson.JsonObject textureKey,yarnwrap.data.client.TextureKey texture) { wrapperContained.method_48527(textureKey,texture.wrapperContained); }
// public static void method_48527(com.google.gson.JsonObject textureKey,yarnwrap.data.client.TextureKey texture, ) { net.minecraft.data.client.Model.method_48527(textureKey,texture.wrapperContained); }
public yarnwrap.util.Identifier getBlockSubModelId(yarnwrap.block.Block block) { return new yarnwrap.util.Identifier(wrapperContained.getBlockSubModelId(block.wrapperContained)); }
// public static yarnwrap.util.Identifier getBlockSubModelId(yarnwrap.block.Block block, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.Model.getBlockSubModelId(block.wrapperContained)); }

}