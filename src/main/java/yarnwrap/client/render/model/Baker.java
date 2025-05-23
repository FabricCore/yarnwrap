package yarnwrap.client.render.model;
public class Baker { public net.minecraft.client.render.model.Baker wrapperContained; public Baker(net.minecraft.client.render.model.Baker wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.BakedSimpleModel getModel(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.BakedSimpleModel(wrapperContained.getModel(id.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedSimpleModel getModel(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.render.model.BakedSimpleModel(net.minecraft.client.render.model.Baker.getModel(id.wrapperContained)); }
public yarnwrap.client.render.model.ErrorCollectingSpriteGetter getSpriteGetter() { return new yarnwrap.client.render.model.ErrorCollectingSpriteGetter(wrapperContained.getSpriteGetter()); }
// public static yarnwrap.client.render.model.ErrorCollectingSpriteGetter getSpriteGetter() { return new yarnwrap.client.render.model.ErrorCollectingSpriteGetter(net.minecraft.client.render.model.Baker.getSpriteGetter()); }
// public java.lang.Object compute(Object key) { return wrapperContained.compute(key); }
// public static java.lang.Object compute(Object key, ) { return net.minecraft.client.render.model.Baker.compute(key); }

}