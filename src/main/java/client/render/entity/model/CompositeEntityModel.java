package yarnwrap.client.render.entity.model;
public class CompositeEntityModel { public net.minecraft.client.render.entity.model.CompositeEntityModel wrapperContained; public CompositeEntityModel(net.minecraft.client.render.entity.model.CompositeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Iterable getParts() { return wrapperContained.getParts(); }

}