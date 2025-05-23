package yarnwrap.client.render.entity.state;
public class EntityHitbox { public net.minecraft.client.render.entity.state.EntityHitbox wrapperContained; public EntityHitbox(net.minecraft.client.render.entity.state.EntityHitbox wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityHitbox(double x0,double y0,double z0,double x1,double y1,double z1,float red,float green,float blue) { this.wrapperContained = new net.minecraft.client.render.entity.state.EntityHitbox(x0,y0,z0,x1,y1,z1,red,green,blue); }

}