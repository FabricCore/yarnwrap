package yarnwrap.client.render.model;
public class Baker { public net.minecraft.client.render.model.Baker wrapperContained; public Baker(net.minecraft.client.render.model.Baker wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.UnbakedModel getOrLoadModel(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.getOrLoadModel(id.wrapperContained)); }
public yarnwrap.client.render.model.BakedModel bake(yarnwrap.util.Identifier id,yarnwrap.client.render.model.ModelBakeSettings settings) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.bake(id.wrapperContained,settings.wrapperContained)); }

}