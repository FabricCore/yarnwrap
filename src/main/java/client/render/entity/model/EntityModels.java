package yarnwrap.client.render.entity.model;
public class EntityModels { public net.minecraft.client.render.entity.model.EntityModels wrapperContained; public EntityModels(net.minecraft.client.render.entity.model.EntityModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.Dilation FISH_PATTERN_DILATION() { return new yarnwrap.client.model.Dilation(wrapperContained.FISH_PATTERN_DILATION); }
// public yarnwrap.client.model.Dilation ARMOR_DILATION() { return new yarnwrap.client.model.Dilation(wrapperContained.ARMOR_DILATION); }
// public yarnwrap.client.model.Dilation HAT_DILATION() { return new yarnwrap.client.model.Dilation(wrapperContained.HAT_DILATION); }
public java.util.Map getModels() { return wrapperContained.getModels(); }

}