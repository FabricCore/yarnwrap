package yarnwrap.client.data;
public class Model { public net.minecraft.client.data.Model wrapperContained; public Model(net.minecraft.client.data.Model wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional parent() { return wrapperContained.parent; }
// public void parent(java.util.Optional value) { wrapperContained.parent = value; }
// public static java.util.Optional parent() { return net.minecraft.client.data.Model.parent; }
// public static void parent(java.util.Optional value, ) { net.minecraft.client.data.Model.parent = value; }

// public java.util.Set requiredTextures() { return wrapperContained.requiredTextures; }
// public void requiredTextures(java.util.Set value) { wrapperContained.requiredTextures = value; }
// public static java.util.Set requiredTextures() { return net.minecraft.client.data.Model.requiredTextures; }
// public static void requiredTextures(java.util.Set value, ) { net.minecraft.client.data.Model.requiredTextures = value; }

// public java.util.Optional variant() { return wrapperContained.variant; }
// public void variant(java.util.Optional value) { wrapperContained.variant = value; }
// public static java.util.Optional variant() { return net.minecraft.client.data.Model.variant; }
// public static void variant(java.util.Optional value, ) { net.minecraft.client.data.Model.variant = value; }

public Model(java.util.Optional parent,java.util.Optional variant,net.minecraft.client.data.TextureKey[] requiredTextureKeys) { this.wrapperContained = new net.minecraft.client.data.Model(parent,variant,requiredTextureKeys); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.upload(block.wrapperContained,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.upload(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public java.util.Map createTextureMap(yarnwrap.client.data.TextureMap textures) { return wrapperContained.createTextureMap(textures.wrapperContained); }
// public static java.util.Map createTextureMap(yarnwrap.client.data.TextureMap textures, ) { return net.minecraft.client.data.Model.createTextureMap(textures.wrapperContained); }
public yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(id.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.util.Identifier id,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.upload(id.wrapperContained,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier uploadWithoutVariant(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.uploadWithoutVariant(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier uploadWithoutVariant(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.uploadWithoutVariant(block.wrapperContained,suffix,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier upload(yarnwrap.item.Item item,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.util.Identifier(wrapperContained.upload(item.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.item.Item item,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.upload(item.wrapperContained,textures.wrapperContained,modelCollector)); }
public yarnwrap.util.Identifier getBlockSubModelId(yarnwrap.block.Block block) { return new yarnwrap.util.Identifier(wrapperContained.getBlockSubModelId(block.wrapperContained)); }
// public static yarnwrap.util.Identifier getBlockSubModelId(yarnwrap.block.Block block, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.Model.getBlockSubModelId(block.wrapperContained)); }

}