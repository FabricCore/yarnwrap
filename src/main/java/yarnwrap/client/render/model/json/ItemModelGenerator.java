package yarnwrap.client.render.model.json;
public class ItemModelGenerator { public net.minecraft.client.render.model.json.ItemModelGenerator wrapperContained; public ItemModelGenerator(net.minecraft.client.render.model.json.ItemModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List LAYERS() { return wrapperContained.LAYERS; }
// public void LAYERS(java.util.List value) { wrapperContained.LAYERS = value; }
public static java.util.List LAYERS() { return net.minecraft.client.render.model.json.ItemModelGenerator.LAYERS; }
// public static void LAYERS(java.util.List value, ) { net.minecraft.client.render.model.json.ItemModelGenerator.LAYERS = value; }

// public void method_33428(int frame) { wrapperContained.method_33428(frame); }
// public static void method_33428(int frame, ) { net.minecraft.client.render.model.json.ItemModelGenerator.method_33428(frame); }
// public void buildCube(Object side,java.util.List cubes,yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height) { wrapperContained.buildCube(side,cubes,sprite.wrapperContained,frame,x,y,width,height); }
// public static void buildCube(Object side,java.util.List cubes,yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height, ) { net.minecraft.client.render.model.json.ItemModelGenerator.buildCube(side,cubes,sprite.wrapperContained,frame,x,y,width,height); }
// public boolean isPixelTransparent(yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height) { return wrapperContained.isPixelTransparent(sprite.wrapperContained,frame,x,y,width,height); }
// public static boolean isPixelTransparent(yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height, ) { return net.minecraft.client.render.model.json.ItemModelGenerator.isPixelTransparent(sprite.wrapperContained,frame,x,y,width,height); }
// public java.util.List getFrames(yarnwrap.client.texture.SpriteContents sprite) { return wrapperContained.getFrames(sprite.wrapperContained); }
// public static java.util.List getFrames(yarnwrap.client.texture.SpriteContents sprite, ) { return net.minecraft.client.render.model.json.ItemModelGenerator.getFrames(sprite.wrapperContained); }
public yarnwrap.client.render.model.json.JsonUnbakedModel create(java.util.function.Function textureGetter,yarnwrap.client.render.model.json.JsonUnbakedModel blockModel) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.create(textureGetter,blockModel.wrapperContained)); }
// public static yarnwrap.client.render.model.json.JsonUnbakedModel create(java.util.function.Function textureGetter,yarnwrap.client.render.model.json.JsonUnbakedModel blockModel, ) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(net.minecraft.client.render.model.json.ItemModelGenerator.create(textureGetter,blockModel.wrapperContained)); }
// public java.util.List addLayerElements(int layer,java.lang.String key,yarnwrap.client.texture.SpriteContents sprite) { return wrapperContained.addLayerElements(layer,key,sprite.wrapperContained); }
// public static java.util.List addLayerElements(int layer,java.lang.String key,yarnwrap.client.texture.SpriteContents sprite, ) { return net.minecraft.client.render.model.json.ItemModelGenerator.addLayerElements(layer,key,sprite.wrapperContained); }
// public java.util.List addSubComponents(yarnwrap.client.texture.SpriteContents sprite,java.lang.String key,int layer) { return wrapperContained.addSubComponents(sprite.wrapperContained,key,layer); }
// public static java.util.List addSubComponents(yarnwrap.client.texture.SpriteContents sprite,java.lang.String key,int layer, ) { return net.minecraft.client.render.model.json.ItemModelGenerator.addSubComponents(sprite.wrapperContained,key,layer); }
// public void buildCube(java.util.List cubes,Object side,int x,int y) { wrapperContained.buildCube(cubes,side,x,y); }
// public static void buildCube(java.util.List cubes,Object side,int x,int y, ) { net.minecraft.client.render.model.json.ItemModelGenerator.buildCube(cubes,side,x,y); }

}