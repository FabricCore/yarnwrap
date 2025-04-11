package yarnwrap.client.render.entity;
public class EntityRenderers { public net.minecraft.client.render.entity.EntityRenderers wrapperContained; public EntityRenderers(net.minecraft.client.render.entity.EntityRenderers wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map RENDERER_FACTORIES() { return wrapperContained.RENDERER_FACTORIES; }
// public void RENDERER_FACTORIES(java.util.Map value) { wrapperContained.RENDERER_FACTORIES = value; }
// public java.util.Map PLAYER_RENDERER_FACTORIES() { return wrapperContained.PLAYER_RENDERER_FACTORIES; }
// public void PLAYER_RENDERER_FACTORIES(java.util.Map value) { wrapperContained.PLAYER_RENDERER_FACTORIES = value; }
public boolean isMissingRendererFactories() { return wrapperContained.isMissingRendererFactories(); }
// public void register(yarnwrap.entity.EntityType type,yarnwrap.client.render.entity.EntityRendererFactory factory) { wrapperContained.register(type.wrapperContained,factory.wrapperContained); }
// public java.util.Map reloadEntityRenderers(Object ctx) { return wrapperContained.reloadEntityRenderers(ctx); }
// public java.util.Map reloadPlayerRenderers(Object ctx) { return wrapperContained.reloadPlayerRenderers(ctx); }

}