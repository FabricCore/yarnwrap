package yarnwrap.client.render.model;
public class ModelSettings { public net.minecraft.client.render.model.ModelSettings wrapperContained; public ModelSettings(net.minecraft.client.render.model.ModelSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public void addSettings(Object state,yarnwrap.item.ItemDisplayContext mode) { wrapperContained.addSettings(state,mode.wrapperContained); }
// public static void addSettings(Object state,yarnwrap.item.ItemDisplayContext mode, ) { net.minecraft.client.render.model.ModelSettings.addSettings(state,mode.wrapperContained); }
// public yarnwrap.client.render.model.ModelSettings resolveSettings(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.BakedSimpleModel model,yarnwrap.client.render.model.ModelTextures textures) { return new yarnwrap.client.render.model.ModelSettings(wrapperContained.resolveSettings(baker.wrapperContained,model.wrapperContained,textures.wrapperContained)); }
// public static yarnwrap.client.render.model.ModelSettings resolveSettings(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.BakedSimpleModel model,yarnwrap.client.render.model.ModelTextures textures, ) { return new yarnwrap.client.render.model.ModelSettings(net.minecraft.client.render.model.ModelSettings.resolveSettings(baker.wrapperContained,model.wrapperContained,textures.wrapperContained)); }

}