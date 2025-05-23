package yarnwrap.client.render.entity.model;
public class EntityModelLayer { public net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained; public EntityModelLayer(net.minecraft.client.render.entity.model.EntityModelLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.model.EntityModelLayer.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.model.EntityModelLayer.id = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.render.entity.model.EntityModelLayer.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.render.entity.model.EntityModelLayer.name = value; }

public EntityModelLayer(yarnwrap.util.Identifier id,java.lang.String name) { this.wrapperContained = new net.minecraft.client.render.entity.model.EntityModelLayer(id.wrapperContained,name); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.model.EntityModelLayer.id()); }
// public java.lang.String name() { return wrapperContained.name(); }
// // public static java.lang.String name() { return net.minecraft.client.render.entity.model.EntityModelLayer.name(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.entity.model.EntityModelLayer.equals(o); }

}