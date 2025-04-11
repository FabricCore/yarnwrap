package yarnwrap.client.render.entity;
public class BoatEntityRenderer { public net.minecraft.client.render.entity.BoatEntityRenderer wrapperContained; public BoatEntityRenderer(net.minecraft.client.render.entity.BoatEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map texturesAndModels() { return wrapperContained.texturesAndModels; }
// public void texturesAndModels(java.util.Map value) { wrapperContained.texturesAndModels = value; }
// public BoatEntityRenderer(Object ctx,boolean chest) { this.wrapperContained = new net.minecraft.client.render.entity.BoatEntityRenderer(ctx,chest); }
// public Object method_32162(Object type) { return wrapperContained.method_32162(type); }
// public com.mojang.datafixers.util.Pair method_32163(boolean type) { return wrapperContained.method_32163(type); }
// public yarnwrap.util.Identifier getTexture(Object type,boolean chest) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(type,chest)); }
// public yarnwrap.client.render.entity.model.CompositeEntityModel createModel(Object ctx,Object type,boolean chest) { return new yarnwrap.client.render.entity.model.CompositeEntityModel(wrapperContained.createModel(ctx,type,chest)); }

}