package yarnwrap.client.render.model.json;
public class ItemModelGenerator { public net.minecraft.client.render.model.json.ItemModelGenerator wrapperContained; public ItemModelGenerator(net.minecraft.client.render.model.json.ItemModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List LAYERS() { return wrapperContained.LAYERS; }
// public void buildCube(Object side,java.util.List cubes,yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height) { wrapperContained.buildCube(side,cubes,sprite.wrapperContained,frame,x,y,width,height); }
// public boolean isPixelTransparent(yarnwrap.client.texture.SpriteContents sprite,int frame,int x,int y,int width,int height) { return wrapperContained.isPixelTransparent(sprite.wrapperContained,frame,x,y,width,height); }
// public java.util.List getFrames(yarnwrap.client.texture.SpriteContents sprite) { return wrapperContained.getFrames(sprite.wrapperContained); }
public yarnwrap.client.render.model.json.JsonUnbakedModel create(java.util.function.Function textureGetter,yarnwrap.client.render.model.json.JsonUnbakedModel blockModel) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.create(textureGetter,blockModel.wrapperContained)); }
// public java.util.List addLayerElements(int layer,java.lang.String key,yarnwrap.client.texture.SpriteContents sprite) { return wrapperContained.addLayerElements(layer,key,sprite.wrapperContained); }
// public java.util.List addSubComponents(yarnwrap.client.texture.SpriteContents sprite,java.lang.String key,int layer) { return wrapperContained.addSubComponents(sprite.wrapperContained,key,layer); }
// public void buildCube(java.util.List cubes,Object side,int x,int y) { wrapperContained.buildCube(cubes,side,x,y); }

}