package yarnwrap.client.render.model;
public class UnbakedModel { public net.minecraft.client.render.model.UnbakedModel wrapperContained; public UnbakedModel(net.minecraft.client.render.model.UnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

public void setParents(java.util.function.Function modelLoader) { wrapperContained.setParents(modelLoader); }
// public static void setParents(java.util.function.Function modelLoader, ) { net.minecraft.client.render.model.UnbakedModel.setParents(modelLoader); }
public yarnwrap.client.render.model.BakedModel bake(yarnwrap.client.render.model.Baker baker,java.util.function.Function textureGetter,yarnwrap.client.render.model.ModelBakeSettings rotationContainer) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.bake(baker.wrapperContained,textureGetter,rotationContainer.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedModel bake(yarnwrap.client.render.model.Baker baker,java.util.function.Function textureGetter,yarnwrap.client.render.model.ModelBakeSettings rotationContainer, ) { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.model.UnbakedModel.bake(baker.wrapperContained,textureGetter,rotationContainer.wrapperContained)); }
public java.util.Collection getModelDependencies() { return wrapperContained.getModelDependencies(); }
// public static java.util.Collection getModelDependencies() { return net.minecraft.client.render.model.UnbakedModel.getModelDependencies(); }

}