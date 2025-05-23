package yarnwrap.client.render;
public class DefaultFramebufferSet { public net.minecraft.client.render.DefaultFramebufferSet wrapperContained; public DefaultFramebufferSet(net.minecraft.client.render.DefaultFramebufferSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier MAIN() { return new yarnwrap.util.Identifier(wrapperContained.MAIN); }
// public void MAIN(yarnwrap.util.Identifier value) { wrapperContained.MAIN = value.wrapperContained; }
public static yarnwrap.util.Identifier MAIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.MAIN); }
// public static void MAIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.MAIN = value.wrapperContained; }

// public yarnwrap.util.Identifier TRANSLUCENT() { return new yarnwrap.util.Identifier(wrapperContained.TRANSLUCENT); }
// public void TRANSLUCENT(yarnwrap.util.Identifier value) { wrapperContained.TRANSLUCENT = value.wrapperContained; }
public static yarnwrap.util.Identifier TRANSLUCENT() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.TRANSLUCENT); }
// public static void TRANSLUCENT(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.TRANSLUCENT = value.wrapperContained; }

// public yarnwrap.util.Identifier ITEM_ENTITY() { return new yarnwrap.util.Identifier(wrapperContained.ITEM_ENTITY); }
// public void ITEM_ENTITY(yarnwrap.util.Identifier value) { wrapperContained.ITEM_ENTITY = value.wrapperContained; }
public static yarnwrap.util.Identifier ITEM_ENTITY() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.ITEM_ENTITY); }
// public static void ITEM_ENTITY(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.ITEM_ENTITY = value.wrapperContained; }

// public yarnwrap.util.Identifier PARTICLES() { return new yarnwrap.util.Identifier(wrapperContained.PARTICLES); }
// public void PARTICLES(yarnwrap.util.Identifier value) { wrapperContained.PARTICLES = value.wrapperContained; }
public static yarnwrap.util.Identifier PARTICLES() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.PARTICLES); }
// public static void PARTICLES(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.PARTICLES = value.wrapperContained; }

// public yarnwrap.util.Identifier WEATHER() { return new yarnwrap.util.Identifier(wrapperContained.WEATHER); }
// public void WEATHER(yarnwrap.util.Identifier value) { wrapperContained.WEATHER = value.wrapperContained; }
public static yarnwrap.util.Identifier WEATHER() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.WEATHER); }
// public static void WEATHER(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.WEATHER = value.wrapperContained; }

// public yarnwrap.util.Identifier CLOUDS() { return new yarnwrap.util.Identifier(wrapperContained.CLOUDS); }
// public void CLOUDS(yarnwrap.util.Identifier value) { wrapperContained.CLOUDS = value.wrapperContained; }
public static yarnwrap.util.Identifier CLOUDS() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.CLOUDS); }
// public static void CLOUDS(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.CLOUDS = value.wrapperContained; }

// public yarnwrap.util.Identifier ENTITY_OUTLINE() { return new yarnwrap.util.Identifier(wrapperContained.ENTITY_OUTLINE); }
// public void ENTITY_OUTLINE(yarnwrap.util.Identifier value) { wrapperContained.ENTITY_OUTLINE = value.wrapperContained; }
public static yarnwrap.util.Identifier ENTITY_OUTLINE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.DefaultFramebufferSet.ENTITY_OUTLINE); }
// public static void ENTITY_OUTLINE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.DefaultFramebufferSet.ENTITY_OUTLINE = value.wrapperContained; }

// public java.util.Set STAGES() { return wrapperContained.STAGES; }
// public void STAGES(java.util.Set value) { wrapperContained.STAGES = value; }
public static java.util.Set STAGES() { return net.minecraft.client.render.DefaultFramebufferSet.STAGES; }
// public static void STAGES(java.util.Set value, ) { net.minecraft.client.render.DefaultFramebufferSet.STAGES = value; }

public yarnwrap.client.util.Handle mainFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.mainFramebuffer); }
public void mainFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.mainFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle mainFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.mainFramebuffer); }
// public static void mainFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.mainFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle translucentFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.translucentFramebuffer); }
public void translucentFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.translucentFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle translucentFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.translucentFramebuffer); }
// public static void translucentFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.translucentFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle itemEntityFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.itemEntityFramebuffer); }
public void itemEntityFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.itemEntityFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle itemEntityFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.itemEntityFramebuffer); }
// public static void itemEntityFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.itemEntityFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle particlesFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.particlesFramebuffer); }
public void particlesFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.particlesFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle particlesFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.particlesFramebuffer); }
// public static void particlesFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.particlesFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle weatherFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.weatherFramebuffer); }
public void weatherFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.weatherFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle weatherFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.weatherFramebuffer); }
// public static void weatherFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.weatherFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle cloudsFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.cloudsFramebuffer); }
public void cloudsFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.cloudsFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle cloudsFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.cloudsFramebuffer); }
// public static void cloudsFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.cloudsFramebuffer = value.wrapperContained; }

public yarnwrap.client.util.Handle entityOutlineFramebuffer() { return new yarnwrap.client.util.Handle(wrapperContained.entityOutlineFramebuffer); }
public void entityOutlineFramebuffer(yarnwrap.client.util.Handle value) { wrapperContained.entityOutlineFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.util.Handle entityOutlineFramebuffer() { return new yarnwrap.client.util.Handle(net.minecraft.client.render.DefaultFramebufferSet.entityOutlineFramebuffer); }
// public static void entityOutlineFramebuffer(yarnwrap.client.util.Handle value, ) { net.minecraft.client.render.DefaultFramebufferSet.entityOutlineFramebuffer = value.wrapperContained; }

// public java.util.Set MAIN_ONLY() { return wrapperContained.MAIN_ONLY; }
// public void MAIN_ONLY(java.util.Set value) { wrapperContained.MAIN_ONLY = value; }
public static java.util.Set MAIN_ONLY() { return net.minecraft.client.render.DefaultFramebufferSet.MAIN_ONLY; }
// public static void MAIN_ONLY(java.util.Set value, ) { net.minecraft.client.render.DefaultFramebufferSet.MAIN_ONLY = value; }

// public java.util.Set MAIN_AND_ENTITY_OUTLINE() { return wrapperContained.MAIN_AND_ENTITY_OUTLINE; }
// public void MAIN_AND_ENTITY_OUTLINE(java.util.Set value) { wrapperContained.MAIN_AND_ENTITY_OUTLINE = value; }
public static java.util.Set MAIN_AND_ENTITY_OUTLINE() { return net.minecraft.client.render.DefaultFramebufferSet.MAIN_AND_ENTITY_OUTLINE; }
// public static void MAIN_AND_ENTITY_OUTLINE(java.util.Set value, ) { net.minecraft.client.render.DefaultFramebufferSet.MAIN_AND_ENTITY_OUTLINE = value; }

public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.DefaultFramebufferSet.clear(); }

}