package yarnwrap.client.render;
public class VertexConsumers { public net.minecraft.client.render.VertexConsumers wrapperContained; public VertexConsumers(net.minecraft.client.render.VertexConsumers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.VertexConsumer union(yarnwrap.client.render.VertexConsumer first,yarnwrap.client.render.VertexConsumer second) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.client.render.VertexConsumer union(yarnwrap.client.render.VertexConsumer first,yarnwrap.client.render.VertexConsumer second, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumers.union(first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.client.render.VertexConsumer union() { return new yarnwrap.client.render.VertexConsumer(wrapperContained.union()); }
public static yarnwrap.client.render.VertexConsumer union() { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumers.union()); }
// public yarnwrap.client.render.VertexConsumer union(yarnwrap.client.render.VertexConsumer first) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.union(first.wrapperContained)); }
// public static yarnwrap.client.render.VertexConsumer union(yarnwrap.client.render.VertexConsumer first, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumers.union(first.wrapperContained)); }
// public yarnwrap.client.render.VertexConsumer union(net.minecraft.client.render.VertexConsumer[] delegates) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.union(delegates)); }
// public static yarnwrap.client.render.VertexConsumer union(net.minecraft.client.render.VertexConsumer[] delegates, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumers.union(delegates)); }

}