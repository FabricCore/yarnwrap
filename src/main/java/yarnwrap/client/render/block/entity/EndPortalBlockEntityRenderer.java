package yarnwrap.client.render.block.entity;
public class EndPortalBlockEntityRenderer { public net.minecraft.client.render.block.entity.EndPortalBlockEntityRenderer wrapperContained; public EndPortalBlockEntityRenderer(net.minecraft.client.render.block.entity.EndPortalBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier SKY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SKY_TEXTURE); }
// public void SKY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SKY_TEXTURE = value.wrapperContained; }
public yarnwrap.util.Identifier PORTAL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PORTAL_TEXTURE); }
// public void PORTAL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.PORTAL_TEXTURE = value.wrapperContained; }
// public void renderSides(yarnwrap.block.entity.EndPortalBlockEntity entity,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer) { wrapperContained.renderSides(entity.wrapperContained,matrix,vertexConsumer.wrapperContained); }
// public void renderSide(yarnwrap.block.entity.EndPortalBlockEntity entity,org.joml.Matrix4f model,yarnwrap.client.render.VertexConsumer vertices,float x1,float x2,float y1,float y2,float z1,float z2,float z3,float z4,yarnwrap.util.math.Direction side) { wrapperContained.renderSide(entity.wrapperContained,model,vertices.wrapperContained,x1,x2,y1,y2,z1,z2,z3,z4,side.wrapperContained); }
// public yarnwrap.client.render.RenderLayer getLayer() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer()); }
// public float getBottomYOffset() { return wrapperContained.getBottomYOffset(); }
// public float getTopYOffset() { return wrapperContained.getTopYOffset(); }

}