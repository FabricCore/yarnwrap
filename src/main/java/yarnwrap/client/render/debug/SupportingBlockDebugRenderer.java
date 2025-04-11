package yarnwrap.client.render.debug;
public class SupportingBlockDebugRenderer { public net.minecraft.client.render.debug.SupportingBlockDebugRenderer wrapperContained; public SupportingBlockDebugRenderer(net.minecraft.client.render.debug.SupportingBlockDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public double lastEntityCheckTime() { return wrapperContained.lastEntityCheckTime; }
// public void lastEntityCheckTime(double value) { wrapperContained.lastEntityCheckTime = value; }
// public java.util.List entities() { return wrapperContained.entities; }
// public void entities(java.util.List value) { wrapperContained.entities = value; }
public SupportingBlockDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.SupportingBlockDebugRenderer(client.wrapperContained); }
// public double getAdditionalDilation(yarnwrap.entity.Entity entity) { return wrapperContained.getAdditionalDilation(entity.wrapperContained); }
// public void renderBlockHighlights(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,yarnwrap.entity.Entity entity,java.util.function.DoubleSupplier extraDilation,float red,float green,float blue) { wrapperContained.renderBlockHighlights(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,entity.wrapperContained,extraDilation,red,green,blue); }
// public void renderBlockHighlight(yarnwrap.util.math.BlockPos pos,yarnwrap.client.util.math.MatrixStack matrices,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double dilation,float red,float green,float blue) { wrapperContained.renderBlockHighlight(pos.wrapperContained,matrices.wrapperContained,cameraX,cameraY,cameraZ,vertexConsumers.wrapperContained,dilation,red,green,blue); }
// public void method_51792(java.util.function.DoubleSupplier pos) { wrapperContained.method_51792(pos); }

}