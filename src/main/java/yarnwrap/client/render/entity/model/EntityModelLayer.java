package yarnwrap.client.render.entity.model;
public class EntityModelLayer { public net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained; public EntityModelLayer(net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public java.lang.String getName() { return wrapperContained.getName(); }

}