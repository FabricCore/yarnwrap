package yarnwrap.client.render;
public class VertexConsumerProvider { public net.minecraft.client.render.VertexConsumerProvider wrapperContained; public VertexConsumerProvider(net.minecraft.client.render.VertexConsumerProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.VertexConsumer getBuffer(yarnwrap.client.render.RenderLayer layer) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getBuffer(layer.wrapperContained)); }
// public static yarnwrap.client.render.VertexConsumer getBuffer(yarnwrap.client.render.RenderLayer layer, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumerProvider.getBuffer(layer.wrapperContained)); }
// public Object immediate(yarnwrap.client.util.BufferAllocator buffer) { return wrapperContained.immediate(buffer.wrapperContained); }
// public static Object immediate(yarnwrap.client.util.BufferAllocator buffer, ) { return net.minecraft.client.render.VertexConsumerProvider.immediate(buffer.wrapperContained); }
// public Object immediate(java.util.SequencedMap layerBuffers,yarnwrap.client.util.BufferAllocator fallbackBuffer) { return wrapperContained.immediate(layerBuffers,fallbackBuffer.wrapperContained); }
// public static Object immediate(java.util.SequencedMap layerBuffers,yarnwrap.client.util.BufferAllocator fallbackBuffer, ) { return net.minecraft.client.render.VertexConsumerProvider.immediate(layerBuffers,fallbackBuffer.wrapperContained); }

}