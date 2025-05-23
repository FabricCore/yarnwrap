package yarnwrap.client.render.model;
public class MissingModel { public net.minecraft.client.render.model.MissingModel wrapperContained; public MissingModel(net.minecraft.client.render.model.MissingModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(wrapperContained.ID); }
// public void ID(yarnwrap.util.Identifier value) { wrapperContained.ID = value.wrapperContained; }
public static yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.MissingModel.ID); }
// public static void ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.model.MissingModel.ID = value.wrapperContained; }

// public java.lang.String TEXTURE_ID() { return wrapperContained.TEXTURE_ID; }
// public void TEXTURE_ID(java.lang.String value) { wrapperContained.TEXTURE_ID = value; }
// public static java.lang.String TEXTURE_ID() { return net.minecraft.client.render.model.MissingModel.TEXTURE_ID; }
// public static void TEXTURE_ID(java.lang.String value, ) { net.minecraft.client.render.model.MissingModel.TEXTURE_ID = value; }

// public yarnwrap.client.render.model.UnbakedModel create() { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.create()); }
public static yarnwrap.client.render.model.UnbakedModel create() { return new yarnwrap.client.render.model.UnbakedModel(net.minecraft.client.render.model.MissingModel.create()); }

}