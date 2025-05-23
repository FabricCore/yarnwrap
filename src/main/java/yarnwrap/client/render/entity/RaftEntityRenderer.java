package yarnwrap.client.render.entity;
public class RaftEntityRenderer { public net.minecraft.client.render.entity.RaftEntityRenderer wrapperContained; public RaftEntityRenderer(net.minecraft.client.render.entity.RaftEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.RaftEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.RaftEntityRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.RaftEntityRenderer.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.RaftEntityRenderer.texture = value.wrapperContained; }

// public RaftEntityRenderer(Object context,yarnwrap.client.render.entity.model.EntityModelLayer layer) { this.wrapperContained = new net.minecraft.client.render.entity.RaftEntityRenderer(context,layer.wrapperContained); }
// public java.lang.String method_64540(java.lang.String path) { return wrapperContained.method_64540(path); }
// public static java.lang.String method_64540(java.lang.String path, ) { return net.minecraft.client.render.entity.RaftEntityRenderer.method_64540(path); }

}