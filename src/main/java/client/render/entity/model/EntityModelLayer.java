package yarnwrap.client.render.entity.model;
public class EntityModelLayer { public net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained; public EntityModelLayer(net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public java.lang.String getName() { return wrapperContained.getName(); }

}