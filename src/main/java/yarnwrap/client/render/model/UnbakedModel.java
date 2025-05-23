package yarnwrap.client.render.model;
public class UnbakedModel { public net.minecraft.client.render.model.UnbakedModel wrapperContained; public UnbakedModel(net.minecraft.client.render.model.UnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String PARTICLE_TEXTURE() { return wrapperContained.PARTICLE_TEXTURE; }
// public void PARTICLE_TEXTURE(java.lang.String value) { wrapperContained.PARTICLE_TEXTURE = value; }
public static java.lang.String PARTICLE_TEXTURE() { return net.minecraft.client.render.model.UnbakedModel.PARTICLE_TEXTURE; }
// public static void PARTICLE_TEXTURE(java.lang.String value, ) { net.minecraft.client.render.model.UnbakedModel.PARTICLE_TEXTURE = value; }

public Object guiLight() { return wrapperContained.guiLight(); }
// public static Object guiLight() { return net.minecraft.client.render.model.UnbakedModel.guiLight(); }
public yarnwrap.client.render.model.json.ModelTransformation transformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformations()); }
// public static yarnwrap.client.render.model.json.ModelTransformation transformations() { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.UnbakedModel.transformations()); }
public Object textures() { return wrapperContained.textures(); }
// public static Object textures() { return net.minecraft.client.render.model.UnbakedModel.textures(); }

}