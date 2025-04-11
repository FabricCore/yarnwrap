package yarnwrap.client.render.debug;
public class GameTestDebugRenderer { public net.minecraft.client.render.debug.GameTestDebugRenderer wrapperContained; public GameTestDebugRenderer(net.minecraft.client.render.debug.GameTestDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map markers() { return wrapperContained.markers; }
// public void markers(java.util.Map value) { wrapperContained.markers = value; }
// public float MARKER_BOX_SIZE() { return wrapperContained.MARKER_BOX_SIZE; }
// public void MARKER_BOX_SIZE(float value) { wrapperContained.MARKER_BOX_SIZE = value; }
public void addMarker(yarnwrap.util.math.BlockPos pos,int color,java.lang.String message,int duration) { wrapperContained.addMarker(pos.wrapperContained,color,message,duration); }
// public boolean method_23110(long entry) { return wrapperContained.method_23110(entry); }
// public void renderMarker(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,Object marker) { wrapperContained.renderMarker(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,marker); }
// public void method_49048(yarnwrap.client.util.math.MatrixStack pos,yarnwrap.client.render.VertexConsumerProvider marker) { wrapperContained.method_49048(pos.wrapperContained,marker.wrapperContained); }

}